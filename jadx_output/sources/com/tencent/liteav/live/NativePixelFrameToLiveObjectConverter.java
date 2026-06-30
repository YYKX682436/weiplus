package com.tencent.liteav.live;

@com.tencent.liteav.base.annotations.JNINamespace("liteav")
/* loaded from: classes14.dex */
public class NativePixelFrameToLiveObjectConverter {
    public static java.nio.ByteBuffer createByteBuffer(int i17) {
        return java.nio.ByteBuffer.allocateDirect(i17);
    }

    public static long getGLContextNativeHandle(java.lang.Object obj) {
        return com.tencent.liteav.videobase.utils.OpenGlUtils.getGLContextNativeHandle(obj);
    }

    public static boolean isInUIThread() {
        return android.os.Looper.getMainLooper() == android.os.Looper.myLooper();
    }
}
