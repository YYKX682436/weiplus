package com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl;

/* loaded from: classes14.dex */
public final class b implements com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.e<android.opengl.EGLContext> {

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f128278h = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12352, 4, org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.f75309x5a4fb9b0, 1, 12344};

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f128279i = {12339, 1, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12352, 4, org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.f75309x5a4fb9b0, 1, 12344};

    /* renamed from: d, reason: collision with root package name */
    private final int f128283d;

    /* renamed from: e, reason: collision with root package name */
    private final int f128284e;

    /* renamed from: f, reason: collision with root package name */
    private android.opengl.EGLConfig f128285f = null;

    /* renamed from: a, reason: collision with root package name */
    android.opengl.EGLDisplay f128280a = android.opengl.EGL14.EGL_NO_DISPLAY;

    /* renamed from: g, reason: collision with root package name */
    private android.opengl.EGLContext f128286g = android.opengl.EGL14.EGL_NO_CONTEXT;

    /* renamed from: b, reason: collision with root package name */
    android.opengl.EGLSurface f128281b = android.opengl.EGL14.EGL_NO_SURFACE;

    /* renamed from: c, reason: collision with root package name */
    private final java.lang.String f128282c = "EGL14Helper@" + hashCode();

    private b(int i17, int i18) {
        this.f128283d = i17;
        this.f128284e = i18;
    }

    public static com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.b a(android.opengl.EGLContext eGLContext, android.view.Surface surface, int i17, int i18) {
        int i19;
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.b bVar = new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.b(i17, i18);
        try {
            android.opengl.EGLDisplay eglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
            bVar.f128280a = eglGetDisplay;
            if (eglGetDisplay != android.opengl.EGL14.EGL_NO_DISPLAY) {
                int[] iArr = new int[2];
                if (!android.opengl.EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                    bVar.f128280a = null;
                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(bVar.f128282c, "unable to initialize EGL14");
                    throw new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d(0);
                }
                android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
                if (android.opengl.EGL14.eglChooseConfig(bVar.f128280a, surface == null ? f128279i : f128278h, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    bVar.f128285f = eGLConfigArr[0];
                    if (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() >= 18) {
                        try {
                            bVar.f128286g = a(bVar.f128280a, bVar.f128285f, 2, eGLContext);
                        } catch (com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d unused) {
                            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(bVar.f128282c, "failed to create EGLContext of OpenGL ES 2.0, try 3.0");
                            bVar.f128286g = a(bVar.f128280a, bVar.f128285f, 3, eGLContext);
                            i19 = 3;
                        }
                    } else {
                        bVar.f128286g = a(bVar.f128280a, bVar.f128285f, 2, eGLContext);
                    }
                    i19 = 2;
                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(bVar.f128282c, "create eglContext " + bVar.f128286g + " sharedContext: " + eGLContext + " version:" + i19);
                    if (surface == null) {
                        bVar.f128281b = android.opengl.EGL14.eglCreatePbufferSurface(bVar.f128280a, bVar.f128285f, new int[]{12375, bVar.f128283d, 12374, bVar.f128284e, 12344}, 0);
                    } else {
                        try {
                            bVar.f128281b = android.opengl.EGL14.eglCreateWindowSurface(bVar.f128280a, bVar.f128285f, surface, new int[]{12344}, 0);
                        } catch (java.lang.Throwable th6) {
                            throw new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d(android.opengl.EGL14.eglGetError(), "", th6);
                        }
                    }
                    g();
                    android.opengl.EGLDisplay eGLDisplay = bVar.f128280a;
                    android.opengl.EGLSurface eGLSurface = bVar.f128281b;
                    if (!android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, bVar.f128286g)) {
                        g();
                    }
                    return bVar;
                }
                throw new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d(0);
            }
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(bVar.f128282c, "unable to get EGL14 display");
            throw new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d(0);
        } catch (com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d e17) {
            bVar.c();
            throw e17;
        }
    }

    private static void g() {
        int eglGetError = android.opengl.EGL14.eglGetError();
        if (eglGetError != 12288) {
            throw new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d(eglGetError);
        }
    }

    @Override // com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.e
    public final void b() {
        android.opengl.EGLDisplay eGLDisplay = this.f128280a;
        android.opengl.EGLSurface eGLSurface = this.f128281b;
        if (android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f128286g)) {
            return;
        }
        g();
    }

    @Override // com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.e
    public final void c() {
        android.opengl.EGLDisplay eGLDisplay = this.f128280a;
        if (eGLDisplay != android.opengl.EGL14.EGL_NO_DISPLAY) {
            android.opengl.EGLSurface eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
            android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, android.opengl.EGL14.EGL_NO_CONTEXT);
            android.opengl.EGLSurface eGLSurface2 = this.f128281b;
            if (eGLSurface2 != android.opengl.EGL14.EGL_NO_SURFACE) {
                android.opengl.EGL14.eglDestroySurface(this.f128280a, eGLSurface2);
                this.f128281b = android.opengl.EGL14.EGL_NO_SURFACE;
            }
            if (this.f128286g != android.opengl.EGL14.EGL_NO_CONTEXT) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(this.f128282c, "destroy eglContext " + this.f128286g);
                android.opengl.EGL14.eglDestroyContext(this.f128280a, this.f128286g);
                this.f128286g = android.opengl.EGL14.EGL_NO_CONTEXT;
            }
            android.opengl.EGL14.eglReleaseThread();
            android.opengl.EGL14.eglTerminate(this.f128280a);
        }
        this.f128280a = android.opengl.EGL14.EGL_NO_DISPLAY;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.e
    public final void d() {
        android.opengl.EGLDisplay eGLDisplay = this.f128280a;
        if (eGLDisplay != android.opengl.EGL14.EGL_NO_DISPLAY) {
            android.opengl.EGLSurface eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
            android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, android.opengl.EGL14.EGL_NO_CONTEXT);
        }
    }

    @Override // com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.e
    public final com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 e() {
        int[] iArr = new int[2];
        return (android.opengl.EGL14.eglQuerySurface(this.f128280a, this.f128281b, 12375, iArr, 0) && android.opengl.EGL14.eglQuerySurface(this.f128280a, this.f128281b, 12374, iArr, 1)) ? new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421(iArr[0], iArr[1]) : new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421(0, 0);
    }

    @Override // com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.e
    public final /* bridge */ /* synthetic */ android.opengl.EGLContext f() {
        return this.f128286g;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.e
    public final void a() {
        android.opengl.GLES20.glFinish();
        if (android.opengl.EGL14.eglSwapBuffers(this.f128280a, this.f128281b)) {
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
