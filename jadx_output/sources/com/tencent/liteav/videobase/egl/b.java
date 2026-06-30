package com.tencent.liteav.videobase.egl;

/* loaded from: classes14.dex */
public final class b implements com.tencent.liteav.videobase.egl.e<android.opengl.EGLContext> {

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f46745h = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12352, 4, org.webrtc.EglBase.EGL_RECORDABLE_ANDROID, 1, 12344};

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f46746i = {12339, 1, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12352, 4, org.webrtc.EglBase.EGL_RECORDABLE_ANDROID, 1, 12344};

    /* renamed from: d, reason: collision with root package name */
    private final int f46750d;

    /* renamed from: e, reason: collision with root package name */
    private final int f46751e;

    /* renamed from: f, reason: collision with root package name */
    private android.opengl.EGLConfig f46752f = null;

    /* renamed from: a, reason: collision with root package name */
    android.opengl.EGLDisplay f46747a = android.opengl.EGL14.EGL_NO_DISPLAY;

    /* renamed from: g, reason: collision with root package name */
    private android.opengl.EGLContext f46753g = android.opengl.EGL14.EGL_NO_CONTEXT;

    /* renamed from: b, reason: collision with root package name */
    android.opengl.EGLSurface f46748b = android.opengl.EGL14.EGL_NO_SURFACE;

    /* renamed from: c, reason: collision with root package name */
    private final java.lang.String f46749c = "EGL14Helper@" + hashCode();

    private b(int i17, int i18) {
        this.f46750d = i17;
        this.f46751e = i18;
    }

    public static com.tencent.liteav.videobase.egl.b a(android.opengl.EGLContext eGLContext, android.view.Surface surface, int i17, int i18) {
        int i19;
        com.tencent.liteav.videobase.egl.b bVar = new com.tencent.liteav.videobase.egl.b(i17, i18);
        try {
            android.opengl.EGLDisplay eglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
            bVar.f46747a = eglGetDisplay;
            if (eglGetDisplay != android.opengl.EGL14.EGL_NO_DISPLAY) {
                int[] iArr = new int[2];
                if (!android.opengl.EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                    bVar.f46747a = null;
                    com.tencent.liteav.base.util.LiteavLog.e(bVar.f46749c, "unable to initialize EGL14");
                    throw new com.tencent.liteav.videobase.egl.d(0);
                }
                android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
                if (android.opengl.EGL14.eglChooseConfig(bVar.f46747a, surface == null ? f46746i : f46745h, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    bVar.f46752f = eGLConfigArr[0];
                    if (com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() >= 18) {
                        try {
                            bVar.f46753g = a(bVar.f46747a, bVar.f46752f, 2, eGLContext);
                        } catch (com.tencent.liteav.videobase.egl.d unused) {
                            com.tencent.liteav.base.util.LiteavLog.i(bVar.f46749c, "failed to create EGLContext of OpenGL ES 2.0, try 3.0");
                            bVar.f46753g = a(bVar.f46747a, bVar.f46752f, 3, eGLContext);
                            i19 = 3;
                        }
                    } else {
                        bVar.f46753g = a(bVar.f46747a, bVar.f46752f, 2, eGLContext);
                    }
                    i19 = 2;
                    com.tencent.liteav.base.util.LiteavLog.i(bVar.f46749c, "create eglContext " + bVar.f46753g + " sharedContext: " + eGLContext + " version:" + i19);
                    if (surface == null) {
                        bVar.f46748b = android.opengl.EGL14.eglCreatePbufferSurface(bVar.f46747a, bVar.f46752f, new int[]{12375, bVar.f46750d, 12374, bVar.f46751e, 12344}, 0);
                    } else {
                        try {
                            bVar.f46748b = android.opengl.EGL14.eglCreateWindowSurface(bVar.f46747a, bVar.f46752f, surface, new int[]{12344}, 0);
                        } catch (java.lang.Throwable th6) {
                            throw new com.tencent.liteav.videobase.egl.d(android.opengl.EGL14.eglGetError(), "", th6);
                        }
                    }
                    g();
                    android.opengl.EGLDisplay eGLDisplay = bVar.f46747a;
                    android.opengl.EGLSurface eGLSurface = bVar.f46748b;
                    if (!android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, bVar.f46753g)) {
                        g();
                    }
                    return bVar;
                }
                throw new com.tencent.liteav.videobase.egl.d(0);
            }
            com.tencent.liteav.base.util.LiteavLog.e(bVar.f46749c, "unable to get EGL14 display");
            throw new com.tencent.liteav.videobase.egl.d(0);
        } catch (com.tencent.liteav.videobase.egl.d e17) {
            bVar.c();
            throw e17;
        }
    }

    private static void g() {
        int eglGetError = android.opengl.EGL14.eglGetError();
        if (eglGetError != 12288) {
            throw new com.tencent.liteav.videobase.egl.d(eglGetError);
        }
    }

    @Override // com.tencent.liteav.videobase.egl.e
    public final void b() {
        android.opengl.EGLDisplay eGLDisplay = this.f46747a;
        android.opengl.EGLSurface eGLSurface = this.f46748b;
        if (android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f46753g)) {
            return;
        }
        g();
    }

    @Override // com.tencent.liteav.videobase.egl.e
    public final void c() {
        android.opengl.EGLDisplay eGLDisplay = this.f46747a;
        if (eGLDisplay != android.opengl.EGL14.EGL_NO_DISPLAY) {
            android.opengl.EGLSurface eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
            android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, android.opengl.EGL14.EGL_NO_CONTEXT);
            android.opengl.EGLSurface eGLSurface2 = this.f46748b;
            if (eGLSurface2 != android.opengl.EGL14.EGL_NO_SURFACE) {
                android.opengl.EGL14.eglDestroySurface(this.f46747a, eGLSurface2);
                this.f46748b = android.opengl.EGL14.EGL_NO_SURFACE;
            }
            if (this.f46753g != android.opengl.EGL14.EGL_NO_CONTEXT) {
                com.tencent.liteav.base.util.LiteavLog.i(this.f46749c, "destroy eglContext " + this.f46753g);
                android.opengl.EGL14.eglDestroyContext(this.f46747a, this.f46753g);
                this.f46753g = android.opengl.EGL14.EGL_NO_CONTEXT;
            }
            android.opengl.EGL14.eglReleaseThread();
            android.opengl.EGL14.eglTerminate(this.f46747a);
        }
        this.f46747a = android.opengl.EGL14.EGL_NO_DISPLAY;
    }

    @Override // com.tencent.liteav.videobase.egl.e
    public final void d() {
        android.opengl.EGLDisplay eGLDisplay = this.f46747a;
        if (eGLDisplay != android.opengl.EGL14.EGL_NO_DISPLAY) {
            android.opengl.EGLSurface eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
            android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, android.opengl.EGL14.EGL_NO_CONTEXT);
        }
    }

    @Override // com.tencent.liteav.videobase.egl.e
    public final com.tencent.liteav.base.util.Size e() {
        int[] iArr = new int[2];
        return (android.opengl.EGL14.eglQuerySurface(this.f46747a, this.f46748b, 12375, iArr, 0) && android.opengl.EGL14.eglQuerySurface(this.f46747a, this.f46748b, 12374, iArr, 1)) ? new com.tencent.liteav.base.util.Size(iArr[0], iArr[1]) : new com.tencent.liteav.base.util.Size(0, 0);
    }

    @Override // com.tencent.liteav.videobase.egl.e
    public final /* bridge */ /* synthetic */ android.opengl.EGLContext f() {
        return this.f46753g;
    }

    @Override // com.tencent.liteav.videobase.egl.e
    public final void a() {
        android.opengl.GLES20.glFinish();
        if (android.opengl.EGL14.eglSwapBuffers(this.f46747a, this.f46748b)) {
            return;
        }
        g();
    }

    private static android.opengl.EGLContext a(android.opengl.EGLDisplay eGLDisplay, android.opengl.EGLConfig eGLConfig, int i17, android.opengl.EGLContext eGLContext) {
        int[] iArr = {12440, i17, 12344};
        if (eGLContext == null) {
            eGLContext = android.opengl.EGL14.EGL_NO_CONTEXT;
        }
        android.opengl.EGLContext eglCreateContext = android.opengl.EGL14.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr, 0);
        g();
        return eglCreateContext;
    }
}
