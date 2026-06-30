package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class tq extends java.lang.Thread {

    /* renamed from: e, reason: collision with root package name */
    private static float f133691e = 60.0f;

    /* renamed from: n, reason: collision with root package name */
    private static final int f133692n = 12440;

    /* renamed from: o, reason: collision with root package name */
    private static final int f133693o = 4;

    /* renamed from: q, reason: collision with root package name */
    private static int f133694q = 2000;

    /* renamed from: t, reason: collision with root package name */
    private static long f133695t = 1500;

    /* renamed from: u, reason: collision with root package name */
    private static final java.lang.String f133696u = "TextureGLRenderThread";

    /* renamed from: a, reason: collision with root package name */
    public boolean f133697a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr> f133698b;

    /* renamed from: f, reason: collision with root package name */
    private java.lang.ref.WeakReference<java.lang.Object> f133701f;

    /* renamed from: i, reason: collision with root package name */
    private javax.microedition.khronos.egl.EGL10 f133704i;

    /* renamed from: m, reason: collision with root package name */
    private javax.microedition.khronos.opengles.GL f133708m;

    /* renamed from: p, reason: collision with root package name */
    private long f133709p;

    /* renamed from: c, reason: collision with root package name */
    private java.util.concurrent.atomic.AtomicBoolean f133699c = new java.util.concurrent.atomic.AtomicBoolean(true);

    /* renamed from: d, reason: collision with root package name */
    private java.util.concurrent.atomic.AtomicBoolean f133700d = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    private volatile boolean f133702g = false;

    /* renamed from: h, reason: collision with root package name */
    private javax.microedition.khronos.egl.EGLConfig f133703h = null;

    /* renamed from: j, reason: collision with root package name */
    private javax.microedition.khronos.egl.EGLDisplay f133705j = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY;

    /* renamed from: k, reason: collision with root package name */
    private javax.microedition.khronos.egl.EGLContext f133706k = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;

    /* renamed from: l, reason: collision with root package name */
    private javax.microedition.khronos.egl.EGLSurface f133707l = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;

    /* renamed from: r, reason: collision with root package name */
    private volatile long f133710r = 0;

    /* renamed from: s, reason: collision with root package name */
    private boolean f133711s = false;

    public tq(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar) {
        this.f133698b = new java.lang.ref.WeakReference<>(trVar);
        setName(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.a("TR"));
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(e()).c(com.tencent.mapsdk.internal.la.a.f131799g, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.a("TR") + " create");
    }

    private int e() {
        java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr> weakReference = this.f133698b;
        if (weakReference == null || weakReference.get() == null) {
            return -1;
        }
        return this.f133698b.get().f130551f;
    }

    private boolean f() {
        java.lang.ref.WeakReference<java.lang.Object> weakReference;
        try {
            weakReference = this.f133701f;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(f133696u, "initializeGLContext failed,errorDetail:" + android.util.Log.getStackTraceString(th6));
        }
        if (weakReference != null && weakReference.get() != null) {
            java.lang.Object obj = this.f133701f.get();
            javax.microedition.khronos.egl.EGL10 egl10 = (javax.microedition.khronos.egl.EGL10) javax.microedition.khronos.egl.EGLContext.getEGL();
            this.f133704i = egl10;
            javax.microedition.khronos.egl.EGLDisplay eglGetDisplay = egl10.eglGetDisplay(javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY);
            this.f133705j = eglGetDisplay;
            if (eglGetDisplay == javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY) {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(f133696u, "eglGetdisplay failed,mEglDisplay == EGL10.EGL_NO_DISPLAY,errorDetail:" + android.opengl.GLUtils.getEGLErrorString(this.f133704i.eglGetError()));
                return false;
            }
            if (!this.f133704i.eglInitialize(eglGetDisplay, new int[2])) {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(f133696u, "eglInitialize failed,errorDetail:" + android.opengl.GLUtils.getEGLErrorString(this.f133704i.eglGetError()));
                return false;
            }
            javax.microedition.khronos.egl.EGLConfig[] eGLConfigArr = new javax.microedition.khronos.egl.EGLConfig[1];
            if (!this.f133704i.eglChooseConfig(this.f133705j, this.f133697a ? new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12326, 8, 12338, 1, 12337, 4, 12352, 4, 12344} : new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12326, 8, 12352, 4, 12344}, eGLConfigArr, 1, new int[1])) {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(f133696u, "eglChooseConfig failed,errorDetail:" + android.opengl.GLUtils.getEGLErrorString(this.f133704i.eglGetError()));
                return false;
            }
            javax.microedition.khronos.egl.EGLConfig eGLConfig = eGLConfigArr[0];
            this.f133703h = eGLConfig;
            javax.microedition.khronos.egl.EGLSurface eglCreateWindowSurface = this.f133704i.eglCreateWindowSurface(this.f133705j, eGLConfig, obj, null);
            this.f133707l = eglCreateWindowSurface;
            if (eglCreateWindowSurface == javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(f133696u, "eglCreateWindowSurface failed,mEglSurface == EGL10.EGL_NO_SURFACE,errorDetail:" + android.opengl.GLUtils.getEGLErrorString(this.f133704i.eglGetError()));
                return false;
            }
            javax.microedition.khronos.egl.EGLContext eglCreateContext = this.f133704i.eglCreateContext(this.f133705j, eGLConfigArr[0], javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT, new int[]{f133692n, 2, 12344});
            this.f133706k = eglCreateContext;
            if (eglCreateContext == javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT) {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(f133696u, "eglCreateContext failed,mEglContext == EGL10.EGL_NO_CONTEXT,errorDetail:" + android.opengl.GLUtils.getEGLErrorString(this.f133704i.eglGetError()));
                return false;
            }
            javax.microedition.khronos.egl.EGL10 egl102 = this.f133704i;
            javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.f133705j;
            javax.microedition.khronos.egl.EGLSurface eGLSurface = this.f133707l;
            if (egl102.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eglCreateContext)) {
                this.f133708m = this.f133706k.getGL();
                return true;
            }
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(f133696u, "eglMakeCurrent failed,errorDetail:" + android.opengl.GLUtils.getEGLErrorString(this.f133704i.eglGetError()));
            return false;
        }
        return false;
    }

    private void g() {
        java.lang.ref.WeakReference<java.lang.Object> weakReference;
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(e()).c(com.tencent.mapsdk.internal.la.a.f131799g, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.a("TR") + " update surface begin");
        while (this.f133699c.get() && !this.f133700d.get() && android.os.SystemClock.elapsedRealtime() - this.f133709p <= f133694q) {
            h();
            try {
                weakReference = this.f133701f;
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(f133696u, "updateSurface failed,errorDetail:" + android.util.Log.getStackTraceString(th6));
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(e()).e(com.tencent.mapsdk.internal.la.a.f131799g, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.a("TR") + " update surface failed", th6);
            }
            if (weakReference != null && weakReference.get() != null) {
                javax.microedition.khronos.egl.EGLSurface eglCreateWindowSurface = this.f133704i.eglCreateWindowSurface(this.f133705j, this.f133703h, this.f133701f.get(), null);
                this.f133707l = eglCreateWindowSurface;
                if (eglCreateWindowSurface != javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) {
                    if (this.f133704i.eglMakeCurrent(this.f133705j, eglCreateWindowSurface, eglCreateWindowSurface, this.f133706k)) {
                        break;
                    }
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(f133696u, "eglMakeCurrent failed,errorDetail:" + android.opengl.GLUtils.getEGLErrorString(this.f133704i.eglGetError()));
                } else {
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(f133696u, "eglCreateWindowSurface failed,errorDetail:" + android.opengl.GLUtils.getEGLErrorString(this.f133704i.eglGetError()));
                }
            }
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(e()).c(com.tencent.mapsdk.internal.la.a.f131799g, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.a("TR") + " update surface end");
    }

    private void h() {
        javax.microedition.khronos.egl.EGLSurface eGLSurface;
        javax.microedition.khronos.egl.EGLSurface eGLSurface2 = this.f133707l;
        if (eGLSurface2 == null || eGLSurface2 == (eGLSurface = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE)) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131745m, "the EglSurface is null or status is EGL_NO_SURFACE");
            return;
        }
        this.f133704i.eglMakeCurrent(this.f133705j, eGLSurface, eGLSurface, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT);
        this.f133704i.eglDestroySurface(this.f133705j, this.f133707l);
        this.f133707l = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
    }

    private void i() {
        javax.microedition.khronos.egl.EGLContext eGLContext = this.f133706k;
        if (eGLContext == null || eGLContext == javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131745m, "the EglContext is null or status is EGL_NO_CONTEXT");
        } else {
            this.f133704i.eglDestroyContext(this.f133705j, eGLContext);
            this.f133706k = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
        }
    }

    private void j() {
        javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.f133705j;
        if (eGLDisplay == null || eGLDisplay == javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131745m, "the EglDisplay is null or status is EGL_NO_DISPLAY");
        } else {
            this.f133704i.eglTerminate(eGLDisplay);
            this.f133705j = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY;
        }
    }

    private void k() {
        h();
        javax.microedition.khronos.egl.EGLContext eGLContext = this.f133706k;
        if (eGLContext == null || eGLContext == javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131745m, "the EglContext is null or status is EGL_NO_CONTEXT");
        } else {
            this.f133704i.eglDestroyContext(this.f133705j, eGLContext);
            this.f133706k = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
        }
        javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.f133705j;
        if (eGLDisplay == null || eGLDisplay == javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131745m, "the EglDisplay is null or status is EGL_NO_DISPLAY");
        } else {
            this.f133704i.eglTerminate(eGLDisplay);
            this.f133705j = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY;
        }
    }

    public final void a() {
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(e()).c(com.tencent.mapsdk.internal.la.a.f131799g, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.a("TR") + " pause");
        this.f133700d.set(true);
        synchronized (this) {
            notifyAll();
        }
    }

    public final void b() {
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(e()).c(com.tencent.mapsdk.internal.la.a.f131799g, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.a("TR") + " resume");
        this.f133700d.set(false);
        synchronized (this) {
            notifyAll();
        }
    }

    public final void c() {
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(e()).c(com.tencent.mapsdk.internal.la.a.f131799g, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.a("TR") + " destroy");
        this.f133699c.set(false);
        this.f133700d.set(false);
        synchronized (this) {
            notifyAll();
        }
    }

    public final void d() {
        this.f133711s = true;
        this.f133710r = android.os.SystemClock.elapsedRealtime();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        java.lang.ref.WeakReference<java.lang.Object> weakReference;
        super.run();
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(e()).c(com.tencent.mapsdk.internal.la.a.f131799g, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.a("TR") + " start");
        java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr> weakReference2 = this.f133698b;
        if (weakReference2 != null && weakReference2.get() != null) {
            this.f133698b.get().F();
        }
        boolean z17 = false;
        while (this.f133699c.get()) {
            while (this.f133699c.get() && ((weakReference = this.f133701f) == null || weakReference.get() == null)) {
                synchronized (this) {
                    try {
                        wait();
                    } catch (java.lang.InterruptedException unused) {
                    }
                }
            }
            if (!z17) {
                z17 = f();
            }
            if (z17) {
                try {
                    synchronized (this) {
                        while (this.f133699c.get() && this.f133700d.get()) {
                            wait();
                        }
                    }
                    if (this.f133702g) {
                        this.f133709p = android.os.SystemClock.elapsedRealtime();
                        g();
                        this.f133711s = true;
                        this.f133702g = false;
                        d();
                    }
                    java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr> weakReference3 = this.f133698b;
                    if (weakReference3 != null && weakReference3.get() != null) {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f133698b.get();
                        if (!this.f133711s || android.os.SystemClock.elapsedRealtime() - this.f133710r >= f133695t) {
                            this.f133711s = false;
                            this.f133710r = 0L;
                        } else if (trVar != null) {
                            trVar.J();
                        }
                        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                        javax.microedition.khronos.egl.EGL10 egl10 = this.f133704i;
                        javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.f133705j;
                        javax.microedition.khronos.egl.EGLSurface eGLSurface = this.f133707l;
                        if (a(egl10, eGLDisplay, eGLSurface)) {
                            if (trVar != null && trVar.a((javax.microedition.khronos.opengles.GL10) this.f133708m)) {
                                egl10.eglSwapBuffers(eGLDisplay, eGLSurface);
                            }
                            int elapsedRealtime2 = (int) ((1000.0f / f133691e) - ((float) (android.os.SystemClock.elapsedRealtime() - elapsedRealtime)));
                            if (elapsedRealtime2 > 0) {
                                synchronized (this) {
                                    try {
                                        wait(elapsedRealtime2);
                                    } catch (java.lang.InterruptedException unused2) {
                                    }
                                }
                            }
                        }
                    }
                } catch (java.lang.Throwable th6) {
                    if (this.f133699c.get() || !(th6 instanceof java.lang.InterruptedException)) {
                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(f133696u, "TextureGLRenderThread Render Exception:" + android.util.Log.getStackTraceString(th6));
                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(e()).d(com.tencent.mapsdk.internal.la.a.f131799g, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.a("TR") + " interrupted", th6);
                    }
                }
            }
        }
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(e()).c(com.tencent.mapsdk.internal.la.a.f131799g, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.a("TR") + " destroy GL");
        java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr> weakReference4 = this.f133698b;
        if (weakReference4 != null && weakReference4.get() != null) {
            this.f133698b.get().G();
            this.f133698b = null;
        }
        h();
        javax.microedition.khronos.egl.EGLContext eGLContext = this.f133706k;
        if (eGLContext == null || eGLContext == javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131745m, "the EglContext is null or status is EGL_NO_CONTEXT");
        } else {
            this.f133704i.eglDestroyContext(this.f133705j, eGLContext);
            this.f133706k = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
        }
        javax.microedition.khronos.egl.EGLDisplay eGLDisplay2 = this.f133705j;
        if (eGLDisplay2 == null || eGLDisplay2 == javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131745m, "the EglDisplay is null or status is EGL_NO_DISPLAY");
        } else {
            this.f133704i.eglTerminate(eGLDisplay2);
            this.f133705j = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY;
        }
    }

    public final void a(java.lang.Object obj) {
        java.lang.ref.WeakReference<java.lang.Object> weakReference = this.f133701f;
        if (weakReference != null && weakReference.get() != null) {
            this.f133702g = true;
        }
        this.f133701f = new java.lang.ref.WeakReference<>(obj);
        synchronized (this) {
            notifyAll();
        }
    }

    public static void a(float f17) {
        if (f17 <= 0.0f) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.e(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131745m, "帧率设置不在有效值范围内");
        } else {
            f133691e = f17;
        }
    }

    private void a(boolean z17) {
        this.f133697a = z17;
    }

    private static boolean a(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLSurface eGLSurface) {
        if (egl10 != null && eGLDisplay != null && eGLSurface != null) {
            try {
                int eglGetError = egl10.eglGetError();
                if (eglGetError == 12288) {
                    return (eGLDisplay == javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY || eGLSurface == javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) ? false : true;
                }
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(f133696u, "EGL error detected before surface check: " + android.opengl.GLUtils.getEGLErrorString(eglGetError));
                return false;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(f133696u, "Exception checking EGL surface validity: " + e17.getMessage());
            }
        }
        return false;
    }
}
