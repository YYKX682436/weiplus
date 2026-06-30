package com.p314xaae8f345.p414x32b0ec.p415xacf8107c.p416xaf968b71;

/* renamed from: com.tencent.live.beauty.custom.TXCustomBeautyDef */
/* loaded from: classes16.dex */
public class C3862x36e1254 {

    /* renamed from: com.tencent.live.beauty.custom.TXCustomBeautyDef$TXCustomBeautyBufferType */
    /* loaded from: classes16.dex */
    public enum TXCustomBeautyBufferType {
        TXCustomBeautyBufferTypeUnknown,
        TXCustomBeautyBufferTypeByteBuffer,
        TXCustomBeautyBufferTypeByteArray,
        TXCustomBeautyBufferTypeTexture
    }

    /* renamed from: com.tencent.live.beauty.custom.TXCustomBeautyDef$TXCustomBeautyPixelFormat */
    /* loaded from: classes16.dex */
    public enum TXCustomBeautyPixelFormat {
        TXCustomBeautyPixelFormatUnknown,
        TXCustomBeautyPixelFormatI420,
        TXCustomBeautyPixelFormatTexture2D
    }

    /* renamed from: com.tencent.live.beauty.custom.TXCustomBeautyDef$TXCustomBeautyVideoFrame */
    /* loaded from: classes16.dex */
    public static final class TXCustomBeautyVideoFrame {

        /* renamed from: buffer */
        public java.nio.ByteBuffer f15188xaddb9440;

        /* renamed from: bufferType */
        public com.p314xaae8f345.p414x32b0ec.p415xacf8107c.p416xaf968b71.C3862x36e1254.TXCustomBeautyBufferType f15189x719f779a;

        /* renamed from: data */
        public byte[] f15190x2eefaa;

        /* renamed from: height */
        public int f15191xb7389127;

        /* renamed from: pixelFormat */
        public com.p314xaae8f345.p414x32b0ec.p415xacf8107c.p416xaf968b71.C3862x36e1254.TXCustomBeautyPixelFormat f15192xa0fe3a1d;

        /* renamed from: rotation */
        public int f15193xfd990f7e;

        /* renamed from: texture */
        public com.p314xaae8f345.p414x32b0ec.p415xacf8107c.p416xaf968b71.C3862x36e1254.TXThirdTexture f15194xab7dd51b;

        /* renamed from: timestamp */
        public long f15195x3492916;

        /* renamed from: width */
        public int f15196x6be2dc6;
    }

    /* renamed from: com.tencent.live.beauty.custom.TXCustomBeautyDef$TXThirdTexture */
    /* loaded from: classes16.dex */
    public static final class TXThirdTexture {

        /* renamed from: eglContext10 */
        public javax.microedition.khronos.egl.EGLContext f15197x5f488f24;

        /* renamed from: eglContext14 */
        public android.opengl.EGLContext f15198x5f488f28;

        /* renamed from: textureId */
        public int f15199xc35d0396;
    }
}
