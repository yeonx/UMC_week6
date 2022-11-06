package com.umc.week6.post.sevice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@AllArgsConstructor
@Getter
public class PostUpdateDto {
    private String title;
    private String content;
}
