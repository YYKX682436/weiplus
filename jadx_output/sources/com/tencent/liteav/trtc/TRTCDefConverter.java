package com.tencent.liteav.trtc;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::trtc")
/* loaded from: classes14.dex */
public class TRTCDefConverter {
    public static long getGLContextNativeHandle(java.lang.Object obj) {
        if (obj instanceof android.opengl.EGLContext) {
            return com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() >= 21 ? ((android.opengl.EGLContext) obj).getNativeHandle() : ((android.opengl.EGLContext) obj).getHandle();
        }
        return 0L;
    }
}
