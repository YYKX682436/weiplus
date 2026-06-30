package com.tencent.live.beauty.custom;

/* loaded from: classes16.dex */
public interface ITXCustomBeautyProcesser {
    com.tencent.live.beauty.custom.TXCustomBeautyDef.TXCustomBeautyBufferType getSupportedBufferType();

    com.tencent.live.beauty.custom.TXCustomBeautyDef.TXCustomBeautyPixelFormat getSupportedPixelFormat();

    void onProcessVideoFrame(com.tencent.live.beauty.custom.TXCustomBeautyDef.TXCustomBeautyVideoFrame tXCustomBeautyVideoFrame, com.tencent.live.beauty.custom.TXCustomBeautyDef.TXCustomBeautyVideoFrame tXCustomBeautyVideoFrame2);
}
