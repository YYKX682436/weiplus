package com.tencent.live.beauty.custom;

/* loaded from: classes16.dex */
public class TXCustomBeautyDef {

    /* loaded from: classes16.dex */
    public enum TXCustomBeautyBufferType {
        TXCustomBeautyBufferTypeUnknown,
        TXCustomBeautyBufferTypeByteBuffer,
        TXCustomBeautyBufferTypeByteArray,
        TXCustomBeautyBufferTypeTexture
    }

    /* loaded from: classes16.dex */
    public enum TXCustomBeautyPixelFormat {
        TXCustomBeautyPixelFormatUnknown,
        TXCustomBeautyPixelFormatI420,
        TXCustomBeautyPixelFormatTexture2D
    }

    /* loaded from: classes16.dex */
    public static final class TXCustomBeautyVideoFrame {
        public java.nio.ByteBuffer buffer;
        public com.tencent.live.beauty.custom.TXCustomBeautyDef.TXCustomBeautyBufferType bufferType;
        public byte[] data;
        public int height;
        public com.tencent.live.beauty.custom.TXCustomBeautyDef.TXCustomBeautyPixelFormat pixelFormat;
        public int rotation;
        public com.tencent.live.beauty.custom.TXCustomBeautyDef.TXThirdTexture texture;
        public long timestamp;
        public int width;
    }

    /* loaded from: classes16.dex */
    public static final class TXThirdTexture {
        public javax.microedition.khronos.egl.EGLContext eglContext10;
        public android.opengl.EGLContext eglContext14;
        public int textureId;
    }
}
