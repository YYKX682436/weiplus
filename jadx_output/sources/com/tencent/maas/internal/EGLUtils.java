package com.tencent.maas.internal;

/* loaded from: classes13.dex */
class EGLUtils {
    public static java.lang.Object getCurrentEGLContext() {
        return ((javax.microedition.khronos.egl.EGL10) javax.microedition.khronos.egl.EGLContext.getEGL()).eglGetCurrentContext();
    }
}
