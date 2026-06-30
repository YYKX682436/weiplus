package com.tencent.matrix.openglleak.utils;

/* loaded from: classes14.dex */
public abstract class EGLHelper {

    /* renamed from: a, reason: collision with root package name */
    public static android.opengl.EGLDisplay f52921a;

    /* renamed from: b, reason: collision with root package name */
    public static android.opengl.EGLConfig f52922b;

    /* renamed from: c, reason: collision with root package name */
    public static android.opengl.EGLContext f52923c;

    /* renamed from: d, reason: collision with root package name */
    public static android.opengl.EGLSurface f52924d;

    public static android.opengl.EGLContext a() {
        android.opengl.EGLDisplay eglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
        f52921a = eglGetDisplay;
        if (eglGetDisplay == android.opengl.EGL14.EGL_NO_DISPLAY) {
            return null;
        }
        int[] iArr = new int[2];
        if (!android.opengl.EGL14.eglInitialize(f52921a, iArr, 0, iArr, 1)) {
            return null;
        }
        android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
        if (!android.opengl.EGL14.eglChooseConfig(f52921a, new int[]{12324, 8, 12323, 8, 12322, 8, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return null;
        }
        android.opengl.EGLConfig eGLConfig = eGLConfigArr[0];
        f52922b = eGLConfig;
        android.opengl.EGLContext eglCreateContext = android.opengl.EGL14.eglCreateContext(f52921a, eGLConfig, android.opengl.EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        f52923c = eglCreateContext;
        if (eglCreateContext == android.opengl.EGL14.EGL_NO_CONTEXT) {
            return null;
        }
        android.opengl.EGLSurface eglCreatePbufferSurface = android.opengl.EGL14.eglCreatePbufferSurface(f52921a, f52922b, new int[]{12375, 64, 12374, 64, 12344}, 0);
        f52924d = eglCreatePbufferSurface;
        if (eglCreatePbufferSurface == android.opengl.EGL14.EGL_NO_SURFACE) {
            return null;
        }
        android.opengl.EGLDisplay eGLDisplay = f52921a;
        android.opengl.EGLSurface eGLSurface = f52924d;
        if (!android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, f52923c)) {
            return null;
        }
        android.opengl.GLES20.glFlush();
        return f52923c;
    }
}
