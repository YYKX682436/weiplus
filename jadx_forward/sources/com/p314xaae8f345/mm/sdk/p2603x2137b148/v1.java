package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes10.dex */
public class v1 {

    /* renamed from: a, reason: collision with root package name */
    public int f274566a = 2048;

    /* renamed from: b, reason: collision with root package name */
    public android.opengl.EGLDisplay f274567b;

    /* renamed from: c, reason: collision with root package name */
    public android.opengl.EGLSurface f274568c;

    /* renamed from: d, reason: collision with root package name */
    public android.opengl.EGLContext f274569d;

    public v1(com.p314xaae8f345.mm.sdk.p2603x2137b148.t1 t1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GPU_TAG", "pennqin, init Help30Impl.");
    }

    public final void a() {
        android.opengl.EGLDisplay eglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
        this.f274567b = eglGetDisplay;
        if (eglGetDisplay == android.opengl.EGL14.EGL_NO_DISPLAY) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GPU_TAG", "EGL_NO_DISPLAY");
            return;
        }
        int[] iArr = new int[2];
        if (!android.opengl.EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GPU_TAG", "eglInitialize");
            return;
        }
        android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
        android.opengl.EGLDisplay eGLDisplay = this.f274567b;
        android.opengl.EGL14.eglChooseConfig(eGLDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0);
        this.f274569d = android.opengl.EGL14.eglCreateContext(this.f274567b, eGLConfigArr[0], android.opengl.EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        android.opengl.EGLSurface eglCreatePbufferSurface = android.opengl.EGL14.eglCreatePbufferSurface(this.f274567b, eGLConfigArr[0], new int[]{12344}, 0);
        this.f274568c = eglCreatePbufferSurface;
        android.opengl.EGL14.eglMakeCurrent(this.f274567b, eglCreatePbufferSurface, eglCreatePbufferSurface, this.f274569d);
    }

    public final void b() {
        android.opengl.EGLDisplay eGLDisplay = android.opengl.EGL14.EGL_NO_DISPLAY;
        android.opengl.EGLDisplay eGLDisplay2 = this.f274567b;
        if (eGLDisplay != eGLDisplay2) {
            android.opengl.EGLSurface eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
            android.opengl.EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, android.opengl.EGL14.EGL_NO_CONTEXT);
            android.opengl.EGL14.eglDestroySurface(this.f274567b, this.f274568c);
            android.opengl.EGL14.eglDestroyContext(this.f274567b, this.f274569d);
            android.opengl.EGL14.eglReleaseThread();
            android.opengl.EGL14.eglTerminate(this.f274567b);
        }
        this.f274567b = android.opengl.EGL14.EGL_NO_DISPLAY;
        this.f274569d = android.opengl.EGL14.EGL_NO_CONTEXT;
        this.f274568c = android.opengl.EGL14.EGL_NO_SURFACE;
    }
}
