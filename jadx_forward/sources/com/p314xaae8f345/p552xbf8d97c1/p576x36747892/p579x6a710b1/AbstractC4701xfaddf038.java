package com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p579x6a710b1;

/* renamed from: com.tencent.matrix.openglleak.utils.EGLHelper */
/* loaded from: classes14.dex */
public abstract class AbstractC4701xfaddf038 {

    /* renamed from: a, reason: collision with root package name */
    public static android.opengl.EGLDisplay f134454a;

    /* renamed from: b, reason: collision with root package name */
    public static android.opengl.EGLConfig f134455b;

    /* renamed from: c, reason: collision with root package name */
    public static android.opengl.EGLContext f134456c;

    /* renamed from: d, reason: collision with root package name */
    public static android.opengl.EGLSurface f134457d;

    public static android.opengl.EGLContext a() {
        android.opengl.EGLDisplay eglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
        f134454a = eglGetDisplay;
        if (eglGetDisplay == android.opengl.EGL14.EGL_NO_DISPLAY) {
            return null;
        }
        int[] iArr = new int[2];
        if (!android.opengl.EGL14.eglInitialize(f134454a, iArr, 0, iArr, 1)) {
            return null;
        }
        android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
        if (!android.opengl.EGL14.eglChooseConfig(f134454a, new int[]{12324, 8, 12323, 8, 12322, 8, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return null;
        }
        android.opengl.EGLConfig eGLConfig = eGLConfigArr[0];
        f134455b = eGLConfig;
        android.opengl.EGLContext eglCreateContext = android.opengl.EGL14.eglCreateContext(f134454a, eGLConfig, android.opengl.EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        f134456c = eglCreateContext;
        if (eglCreateContext == android.opengl.EGL14.EGL_NO_CONTEXT) {
            return null;
        }
        android.opengl.EGLSurface eglCreatePbufferSurface = android.opengl.EGL14.eglCreatePbufferSurface(f134454a, f134455b, new int[]{12375, 64, 12374, 64, 12344}, 0);
        f134457d = eglCreatePbufferSurface;
        if (eglCreatePbufferSurface == android.opengl.EGL14.EGL_NO_SURFACE) {
            return null;
        }
        android.opengl.EGLDisplay eGLDisplay = f134454a;
        android.opengl.EGLSurface eGLSurface = f134457d;
        if (!android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, f134456c)) {
            return null;
        }
        android.opengl.GLES20.glFlush();
        return f134456c;
    }
}
