package com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl;

/* loaded from: classes14.dex */
public final class a implements com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.e<javax.microedition.khronos.egl.EGLContext> {

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f128268i = {12339, 1, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12352, 4, 12344};

    /* renamed from: j, reason: collision with root package name */
    private static final int[] f128269j = {12339, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12352, 4, org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.f75309x5a4fb9b0, 1, 12344};

    /* renamed from: b, reason: collision with root package name */
    private final int f128271b;

    /* renamed from: c, reason: collision with root package name */
    private final int f128272c;

    /* renamed from: g, reason: collision with root package name */
    private javax.microedition.khronos.egl.EGL10 f128276g;

    /* renamed from: h, reason: collision with root package name */
    private javax.microedition.khronos.egl.EGLConfig f128277h;

    /* renamed from: d, reason: collision with root package name */
    private javax.microedition.khronos.egl.EGLDisplay f128273d = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY;

    /* renamed from: e, reason: collision with root package name */
    private javax.microedition.khronos.egl.EGLContext f128274e = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;

    /* renamed from: f, reason: collision with root package name */
    private javax.microedition.khronos.egl.EGLSurface f128275f = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f128270a = "EGL10Helper@" + hashCode();

    private a(int i17, int i18) {
        this.f128271b = i17;
        this.f128272c = i18;
    }

    public static com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.a a(javax.microedition.khronos.egl.EGLContext eGLContext, android.view.Surface surface, int i17, int i18) {
        int i19;
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.a aVar = new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.a(i17, i18);
        try {
            javax.microedition.khronos.egl.EGL10 egl10 = (javax.microedition.khronos.egl.EGL10) javax.microedition.khronos.egl.EGLContext.getEGL();
            aVar.f128276g = egl10;
            javax.microedition.khronos.egl.EGLDisplay eglGetDisplay = egl10.eglGetDisplay(javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY);
            aVar.f128273d = eglGetDisplay;
            aVar.f128276g.eglInitialize(eglGetDisplay, new int[2]);
            javax.microedition.khronos.egl.EGLConfig[] eGLConfigArr = new javax.microedition.khronos.egl.EGLConfig[1];
            aVar.f128276g.eglChooseConfig(aVar.f128273d, surface == null ? f128268i : f128269j, eGLConfigArr, 1, new int[1]);
            aVar.f128277h = eGLConfigArr[0];
            if (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() >= 18) {
                try {
                    aVar.f128274e = aVar.a(aVar.f128273d, aVar.f128277h, 2, eGLContext);
                } catch (com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d unused) {
                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(aVar.f128270a, "failed to create EGLContext of OpenGL ES 2.0, try 3.0");
                    aVar.f128274e = aVar.a(aVar.f128273d, aVar.f128277h, 3, eGLContext);
                    i19 = 3;
                }
            } else {
                aVar.f128274e = aVar.a(aVar.f128273d, aVar.f128277h, 2, eGLContext);
            }
            i19 = 2;
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(aVar.f128270a, "create eglContext " + aVar.f128274e + " sharedContext: " + eGLContext + " version:" + i19);
            if (surface == null) {
                aVar.f128275f = aVar.f128276g.eglCreatePbufferSurface(aVar.f128273d, aVar.f128277h, new int[]{12375, aVar.f128271b, 12374, aVar.f128272c, 12344});
            } else {
                try {
                    aVar.f128275f = aVar.f128276g.eglCreateWindowSurface(aVar.f128273d, aVar.f128277h, surface, null);
                } catch (java.lang.Throwable th6) {
                    throw new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d(aVar.f128276g.eglGetError(), "", th6);
                }
            }
            if (aVar.f128275f == javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) {
                aVar.h();
            }
            javax.microedition.khronos.egl.EGL10 egl102 = aVar.f128276g;
            javax.microedition.khronos.egl.EGLDisplay eGLDisplay = aVar.f128273d;
            javax.microedition.khronos.egl.EGLSurface eGLSurface = aVar.f128275f;
            if (!egl102.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, aVar.f128274e)) {
                aVar.h();
            }
            return aVar;
        } catch (com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d e17) {
            aVar.c();
            throw e17;
        }
    }

    private void g() {
        if (this.f128275f != javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) {
            d();
            if (!this.f128276g.eglDestroySurface(this.f128273d, this.f128275f)) {
                h();
            }
            this.f128275f = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
        }
    }

    private void h() {
        int eglGetError = this.f128276g.eglGetError();
        if (eglGetError != 12288) {
            throw new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d(eglGetError);
        }
    }

    @Override // com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.e
    public final void b() {
        javax.microedition.khronos.egl.EGL10 egl10 = this.f128276g;
        javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.f128273d;
        javax.microedition.khronos.egl.EGLSurface eGLSurface = this.f128275f;
        if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f128274e)) {
            return;
        }
        h();
    }

    @Override // com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.e
    public final void c() {
        if (this.f128273d != javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY) {
            d();
            g();
            if (this.f128274e != javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(this.f128270a, "destroy eglContext " + this.f128274e);
                this.f128276g.eglDestroyContext(this.f128273d, this.f128274e);
                this.f128274e = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
            }
            this.f128276g.eglTerminate(this.f128273d);
        }
        this.f128273d = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.e
    public final void d() {
        javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.f128273d;
        if (eGLDisplay != javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY) {
            javax.microedition.khronos.egl.EGL10 egl10 = this.f128276g;
            javax.microedition.khronos.egl.EGLSurface eGLSurface = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT);
        }
    }

    @Override // com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.e
    public final com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 e() {
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        return (this.f128276g.eglQuerySurface(this.f128273d, this.f128275f, 12375, iArr) && this.f128276g.eglQuerySurface(this.f128273d, this.f128275f, 12374, iArr2)) ? new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421(iArr[0], iArr2[0]) : new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421(0, 0);
    }

    @Override // com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.e
    public final /* bridge */ /* synthetic */ javax.microedition.khronos.egl.EGLContext f() {
        return this.f128274e;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.e
    public final void a() {
        android.opengl.GLES20.glFinish();
        if (this.f128276g.eglSwapBuffers(this.f128273d, this.f128275f)) {
            return;
        }
        h();
    }

    private javax.microedition.khronos.egl.EGLContext a(javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLConfig eGLConfig, int i17, javax.microedition.khronos.egl.EGLContext eGLContext) {
        int[] iArr = {12440, i17, 12344};
        if (eGLContext == null) {
            eGLContext = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
        }
        javax.microedition.khronos.egl.EGLContext eglCreateContext = this.f128276g.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        h();
        return eglCreateContext;
    }
}
