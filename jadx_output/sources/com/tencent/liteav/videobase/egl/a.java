package com.tencent.liteav.videobase.egl;

/* loaded from: classes14.dex */
public final class a implements com.tencent.liteav.videobase.egl.e<javax.microedition.khronos.egl.EGLContext> {

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f46735i = {12339, 1, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12352, 4, 12344};

    /* renamed from: j, reason: collision with root package name */
    private static final int[] f46736j = {12339, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12352, 4, org.webrtc.EglBase.EGL_RECORDABLE_ANDROID, 1, 12344};

    /* renamed from: b, reason: collision with root package name */
    private final int f46738b;

    /* renamed from: c, reason: collision with root package name */
    private final int f46739c;

    /* renamed from: g, reason: collision with root package name */
    private javax.microedition.khronos.egl.EGL10 f46743g;

    /* renamed from: h, reason: collision with root package name */
    private javax.microedition.khronos.egl.EGLConfig f46744h;

    /* renamed from: d, reason: collision with root package name */
    private javax.microedition.khronos.egl.EGLDisplay f46740d = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY;

    /* renamed from: e, reason: collision with root package name */
    private javax.microedition.khronos.egl.EGLContext f46741e = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;

    /* renamed from: f, reason: collision with root package name */
    private javax.microedition.khronos.egl.EGLSurface f46742f = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f46737a = "EGL10Helper@" + hashCode();

    private a(int i17, int i18) {
        this.f46738b = i17;
        this.f46739c = i18;
    }

    public static com.tencent.liteav.videobase.egl.a a(javax.microedition.khronos.egl.EGLContext eGLContext, android.view.Surface surface, int i17, int i18) {
        int i19;
        com.tencent.liteav.videobase.egl.a aVar = new com.tencent.liteav.videobase.egl.a(i17, i18);
        try {
            javax.microedition.khronos.egl.EGL10 egl10 = (javax.microedition.khronos.egl.EGL10) javax.microedition.khronos.egl.EGLContext.getEGL();
            aVar.f46743g = egl10;
            javax.microedition.khronos.egl.EGLDisplay eglGetDisplay = egl10.eglGetDisplay(javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY);
            aVar.f46740d = eglGetDisplay;
            aVar.f46743g.eglInitialize(eglGetDisplay, new int[2]);
            javax.microedition.khronos.egl.EGLConfig[] eGLConfigArr = new javax.microedition.khronos.egl.EGLConfig[1];
            aVar.f46743g.eglChooseConfig(aVar.f46740d, surface == null ? f46735i : f46736j, eGLConfigArr, 1, new int[1]);
            aVar.f46744h = eGLConfigArr[0];
            if (com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() >= 18) {
                try {
                    aVar.f46741e = aVar.a(aVar.f46740d, aVar.f46744h, 2, eGLContext);
                } catch (com.tencent.liteav.videobase.egl.d unused) {
                    com.tencent.liteav.base.util.LiteavLog.i(aVar.f46737a, "failed to create EGLContext of OpenGL ES 2.0, try 3.0");
                    aVar.f46741e = aVar.a(aVar.f46740d, aVar.f46744h, 3, eGLContext);
                    i19 = 3;
                }
            } else {
                aVar.f46741e = aVar.a(aVar.f46740d, aVar.f46744h, 2, eGLContext);
            }
            i19 = 2;
            com.tencent.liteav.base.util.LiteavLog.i(aVar.f46737a, "create eglContext " + aVar.f46741e + " sharedContext: " + eGLContext + " version:" + i19);
            if (surface == null) {
                aVar.f46742f = aVar.f46743g.eglCreatePbufferSurface(aVar.f46740d, aVar.f46744h, new int[]{12375, aVar.f46738b, 12374, aVar.f46739c, 12344});
            } else {
                try {
                    aVar.f46742f = aVar.f46743g.eglCreateWindowSurface(aVar.f46740d, aVar.f46744h, surface, null);
                } catch (java.lang.Throwable th6) {
                    throw new com.tencent.liteav.videobase.egl.d(aVar.f46743g.eglGetError(), "", th6);
                }
            }
            if (aVar.f46742f == javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) {
                aVar.h();
            }
            javax.microedition.khronos.egl.EGL10 egl102 = aVar.f46743g;
            javax.microedition.khronos.egl.EGLDisplay eGLDisplay = aVar.f46740d;
            javax.microedition.khronos.egl.EGLSurface eGLSurface = aVar.f46742f;
            if (!egl102.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, aVar.f46741e)) {
                aVar.h();
            }
            return aVar;
        } catch (com.tencent.liteav.videobase.egl.d e17) {
            aVar.c();
            throw e17;
        }
    }

    private void g() {
        if (this.f46742f != javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) {
            d();
            if (!this.f46743g.eglDestroySurface(this.f46740d, this.f46742f)) {
                h();
            }
            this.f46742f = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
        }
    }

    private void h() {
        int eglGetError = this.f46743g.eglGetError();
        if (eglGetError != 12288) {
            throw new com.tencent.liteav.videobase.egl.d(eglGetError);
        }
    }

    @Override // com.tencent.liteav.videobase.egl.e
    public final void b() {
        javax.microedition.khronos.egl.EGL10 egl10 = this.f46743g;
        javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.f46740d;
        javax.microedition.khronos.egl.EGLSurface eGLSurface = this.f46742f;
        if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f46741e)) {
            return;
        }
        h();
    }

    @Override // com.tencent.liteav.videobase.egl.e
    public final void c() {
        if (this.f46740d != javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY) {
            d();
            g();
            if (this.f46741e != javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT) {
                com.tencent.liteav.base.util.LiteavLog.i(this.f46737a, "destroy eglContext " + this.f46741e);
                this.f46743g.eglDestroyContext(this.f46740d, this.f46741e);
                this.f46741e = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
            }
            this.f46743g.eglTerminate(this.f46740d);
        }
        this.f46740d = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY;
    }

    @Override // com.tencent.liteav.videobase.egl.e
    public final void d() {
        javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.f46740d;
        if (eGLDisplay != javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY) {
            javax.microedition.khronos.egl.EGL10 egl10 = this.f46743g;
            javax.microedition.khronos.egl.EGLSurface eGLSurface = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT);
        }
    }

    @Override // com.tencent.liteav.videobase.egl.e
    public final com.tencent.liteav.base.util.Size e() {
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        return (this.f46743g.eglQuerySurface(this.f46740d, this.f46742f, 12375, iArr) && this.f46743g.eglQuerySurface(this.f46740d, this.f46742f, 12374, iArr2)) ? new com.tencent.liteav.base.util.Size(iArr[0], iArr2[0]) : new com.tencent.liteav.base.util.Size(0, 0);
    }

    @Override // com.tencent.liteav.videobase.egl.e
    public final /* bridge */ /* synthetic */ javax.microedition.khronos.egl.EGLContext f() {
        return this.f46741e;
    }

    @Override // com.tencent.liteav.videobase.egl.e
    public final void a() {
        android.opengl.GLES20.glFinish();
        if (this.f46743g.eglSwapBuffers(this.f46740d, this.f46742f)) {
            return;
        }
        h();
    }

    private javax.microedition.khronos.egl.EGLContext a(javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLConfig eGLConfig, int i17, javax.microedition.khronos.egl.EGLContext eGLContext) {
        int[] iArr = {12440, i17, 12344};
        if (eGLContext == null) {
            eGLContext = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
        }
        javax.microedition.khronos.egl.EGLContext eglCreateContext = this.f46743g.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        h();
        return eglCreateContext;
    }
}
