package com.wzhou.dubbo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @RequestMapping("/helloWord")
    public Map<String,Object> helloTest(){

        Map<String,Object>  map = new HashMap<>();

        map.put("test","3213");

        return  map ;
    }
}
