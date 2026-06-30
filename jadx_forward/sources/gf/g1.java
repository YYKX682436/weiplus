package gf;

/* loaded from: classes7.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.SurfaceTexture f352608a;

    /* renamed from: b, reason: collision with root package name */
    public javax.microedition.khronos.egl.EGL10 f352609b;

    /* renamed from: c, reason: collision with root package name */
    public javax.microedition.khronos.egl.EGLDisplay f352610c;

    /* renamed from: d, reason: collision with root package name */
    public javax.microedition.khronos.egl.EGLContext f352611d;

    /* renamed from: e, reason: collision with root package name */
    public javax.microedition.khronos.egl.EGLSurface f352612e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f352613f;

    public g1(android.graphics.SurfaceTexture surfaceTexture) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceTexture, "surfaceTexture");
        this.f352608a = surfaceTexture;
        this.f352613f = new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12326, 0, 12338, 1, 12337, 4, 12344};
    }

    public final void a() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        javax.microedition.khronos.egl.EGL egl = javax.microedition.khronos.egl.EGLContext.getEGL();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(egl, "null cannot be cast to non-null type javax.microedition.khronos.egl.EGL10");
        javax.microedition.khronos.egl.EGL10 egl10 = (javax.microedition.khronos.egl.EGL10) egl;
        this.f352609b = egl10;
        javax.microedition.khronos.egl.EGLDisplay eglGetDisplay = egl10.eglGetDisplay(javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY);
        this.f352610c = eglGetDisplay;
        if (eglGetDisplay == javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY) {
            throw new java.lang.RuntimeException("eglGetDisplay failed");
        }
        javax.microedition.khronos.egl.EGL10 egl102 = this.f352609b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(egl102);
        if (!egl102.eglInitialize(this.f352610c, new int[2])) {
            throw new java.lang.RuntimeException("eglInitialize failed");
        }
        int[] iArr = new int[1];
        javax.microedition.khronos.egl.EGLConfig[] eGLConfigArr = new javax.microedition.khronos.egl.EGLConfig[1];
        int[] iArr2 = this.f352613f;
        javax.microedition.khronos.egl.EGL10 egl103 = this.f352609b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(egl103);
        if (!egl103.eglChooseConfig(this.f352610c, iArr2, eGLConfigArr, 1, iArr)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Failed to choose config: ");
            javax.microedition.khronos.egl.EGL10 egl104 = this.f352609b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(egl104);
            sb6.append(android.opengl.GLUtils.getEGLErrorString(egl104.eglGetError()));
            throw new java.lang.IllegalArgumentException(sb6.toString().toString());
        }
        javax.microedition.khronos.egl.EGLConfig eGLConfig = iArr[0] > 0 ? eGLConfigArr[0] : null;
        javax.microedition.khronos.egl.EGL10 egl105 = this.f352609b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(egl105);
        javax.microedition.khronos.egl.EGLContext eglCreateContext = egl105.eglCreateContext(this.f352610c, eGLConfig, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(eglCreateContext, "eglCreateContext(...)");
        this.f352611d = eglCreateContext;
        javax.microedition.khronos.egl.EGL10 egl106 = this.f352609b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(egl106);
        javax.microedition.khronos.egl.EGLSurface eglCreateWindowSurface = egl106.eglCreateWindowSurface(this.f352610c, eGLConfig, this.f352608a, null);
        this.f352612e = eglCreateWindowSurface;
        if (eglCreateWindowSurface == null || eglCreateWindowSurface == javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("GL Error: ");
            javax.microedition.khronos.egl.EGL10 egl107 = this.f352609b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(egl107);
            sb7.append(android.opengl.GLUtils.getEGLErrorString(egl107.eglGetError()));
            throw new java.lang.RuntimeException(sb7.toString());
        }
        javax.microedition.khronos.egl.EGL10 egl108 = this.f352609b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(egl108);
        javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.f352610c;
        javax.microedition.khronos.egl.EGLSurface eGLSurface = this.f352612e;
        if (!egl108.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f352611d)) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("GL make current error: ");
            javax.microedition.khronos.egl.EGL10 egl109 = this.f352609b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(egl109);
            sb8.append(android.opengl.GLUtils.getEGLErrorString(egl109.eglGetError()));
            throw new java.lang.RuntimeException(sb8.toString());
        }
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        android.opengl.GLES20.glClear(16384);
        javax.microedition.khronos.egl.EGL10 egl1010 = this.f352609b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(egl1010);
        if (!egl1010.eglSwapBuffers(this.f352610c, this.f352612e)) {
            javax.microedition.khronos.egl.EGL10 egl1011 = this.f352609b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(egl1011);
            java.lang.String.valueOf(egl1011.eglGetError());
        }
        javax.microedition.khronos.egl.EGL10 egl1012 = this.f352609b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(egl1012);
        javax.microedition.khronos.egl.EGLDisplay eGLDisplay2 = this.f352610c;
        javax.microedition.khronos.egl.EGLSurface eGLSurface2 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
        egl1012.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT);
        javax.microedition.khronos.egl.EGL10 egl1013 = this.f352609b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(egl1013);
        egl1013.eglDestroySurface(this.f352610c, this.f352612e);
        javax.microedition.khronos.egl.EGL10 egl1014 = this.f352609b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(egl1014);
        egl1014.eglDestroyContext(this.f352610c, this.f352611d);
        javax.microedition.khronos.egl.EGL10 egl1015 = this.f352609b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(egl1015);
        egl1015.eglTerminate(this.f352610c);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SkylineTextureCleanLogic", "clean costTime:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
    }
}
