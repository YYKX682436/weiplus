package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class tq extends java.lang.Thread {

    /* renamed from: e, reason: collision with root package name */
    private static float f52158e = 60.0f;

    /* renamed from: n, reason: collision with root package name */
    private static final int f52159n = 12440;

    /* renamed from: o, reason: collision with root package name */
    private static final int f52160o = 4;

    /* renamed from: q, reason: collision with root package name */
    private static int f52161q = 2000;

    /* renamed from: t, reason: collision with root package name */
    private static long f52162t = 1500;

    /* renamed from: u, reason: collision with root package name */
    private static final java.lang.String f52163u = "TextureGLRenderThread";

    /* renamed from: a, reason: collision with root package name */
    public boolean f52164a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.ref.WeakReference<com.tencent.mapsdk.internal.tr> f52165b;

    /* renamed from: f, reason: collision with root package name */
    private java.lang.ref.WeakReference<java.lang.Object> f52168f;

    /* renamed from: i, reason: collision with root package name */
    private javax.microedition.khronos.egl.EGL10 f52171i;

    /* renamed from: m, reason: collision with root package name */
    private javax.microedition.khronos.opengles.GL f52175m;

    /* renamed from: p, reason: collision with root package name */
    private long f52176p;

    /* renamed from: c, reason: collision with root package name */
    private java.util.concurrent.atomic.AtomicBoolean f52166c = new java.util.concurrent.atomic.AtomicBoolean(true);

    /* renamed from: d, reason: collision with root package name */
    private java.util.concurrent.atomic.AtomicBoolean f52167d = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    private volatile boolean f52169g = false;

    /* renamed from: h, reason: collision with root package name */
    private javax.microedition.khronos.egl.EGLConfig f52170h = null;

    /* renamed from: j, reason: collision with root package name */
    private javax.microedition.khronos.egl.EGLDisplay f52172j = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY;

    /* renamed from: k, reason: collision with root package name */
    private javax.microedition.khronos.egl.EGLContext f52173k = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;

    /* renamed from: l, reason: collision with root package name */
    private javax.microedition.khronos.egl.EGLSurface f52174l = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;

    /* renamed from: r, reason: collision with root package name */
    private volatile long f52177r = 0;

    /* renamed from: s, reason: collision with root package name */
    private boolean f52178s = false;

    public tq(com.tencent.mapsdk.internal.tr trVar) {
        this.f52165b = new java.lang.ref.WeakReference<>(trVar);
        setName(com.tencent.mapsdk.internal.ua.a("TR"));
        com.tencent.mapsdk.core.utils.log.LogUtil.a(e()).c(com.tencent.mapsdk.internal.la.a.f50266g, com.tencent.mapsdk.internal.ua.a("TR") + " create");
    }

    private int e() {
        java.lang.ref.WeakReference<com.tencent.mapsdk.internal.tr> weakReference = this.f52165b;
        if (weakReference == null || weakReference.get() == null) {
            return -1;
        }
        return this.f52165b.get().f49018f;
    }

    private boolean f() {
        java.lang.ref.WeakReference<java.lang.Object> weakReference;
        try {
            weakReference = this.f52168f;
        } catch (java.lang.Throwable th6) {
            com.tencent.mapsdk.core.utils.log.LogUtil.d(f52163u, "initializeGLContext failed,errorDetail:" + android.util.Log.getStackTraceString(th6));
        }
        if (weakReference != null && weakReference.get() != null) {
            java.lang.Object obj = this.f52168f.get();
            javax.microedition.khronos.egl.EGL10 egl10 = (javax.microedition.khronos.egl.EGL10) javax.microedition.khronos.egl.EGLContext.getEGL();
            this.f52171i = egl10;
            javax.microedition.khronos.egl.EGLDisplay eglGetDisplay = egl10.eglGetDisplay(javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY);
            this.f52172j = eglGetDisplay;
            if (eglGetDisplay == javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY) {
                com.tencent.mapsdk.core.utils.log.LogUtil.d(f52163u, "eglGetdisplay failed,mEglDisplay == EGL10.EGL_NO_DISPLAY,errorDetail:" + android.opengl.GLUtils.getEGLErrorString(this.f52171i.eglGetError()));
                return false;
            }
            if (!this.f52171i.eglInitialize(eglGetDisplay, new int[2])) {
                com.tencent.mapsdk.core.utils.log.LogUtil.d(f52163u, "eglInitialize failed,errorDetail:" + android.opengl.GLUtils.getEGLErrorString(this.f52171i.eglGetError()));
                return false;
            }
            javax.microedition.khronos.egl.EGLConfig[] eGLConfigArr = new javax.microedition.khronos.egl.EGLConfig[1];
            if (!this.f52171i.eglChooseConfig(this.f52172j, this.f52164a ? new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12326, 8, 12338, 1, 12337, 4, 12352, 4, 12344} : new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12326, 8, 12352, 4, 12344}, eGLConfigArr, 1, new int[1])) {
                com.tencent.mapsdk.core.utils.log.LogUtil.d(f52163u, "eglChooseConfig failed,errorDetail:" + android.opengl.GLUtils.getEGLErrorString(this.f52171i.eglGetError()));
                return false;
            }
            javax.microedition.khronos.egl.EGLConfig eGLConfig = eGLConfigArr[0];
            this.f52170h = eGLConfig;
            javax.microedition.khronos.egl.EGLSurface eglCreateWindowSurface = this.f52171i.eglCreateWindowSurface(this.f52172j, eGLConfig, obj, null);
            this.f52174l = eglCreateWindowSurface;
            if (eglCreateWindowSurface == javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) {
                com.tencent.mapsdk.core.utils.log.LogUtil.d(f52163u, "eglCreateWindowSurface failed,mEglSurface == EGL10.EGL_NO_SURFACE,errorDetail:" + android.opengl.GLUtils.getEGLErrorString(this.f52171i.eglGetError()));
                return false;
            }
            javax.microedition.khronos.egl.EGLContext eglCreateContext = this.f52171i.eglCreateContext(this.f52172j, eGLConfigArr[0], javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT, new int[]{f52159n, 2, 12344});
            this.f52173k = eglCreateContext;
            if (eglCreateContext == javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT) {
                com.tencent.mapsdk.core.utils.log.LogUtil.d(f52163u, "eglCreateContext failed,mEglContext == EGL10.EGL_NO_CONTEXT,errorDetail:" + android.opengl.GLUtils.getEGLErrorString(this.f52171i.eglGetError()));
                return false;
            }
            javax.microedition.khronos.egl.EGL10 egl102 = this.f52171i;
            javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.f52172j;
            javax.microedition.khronos.egl.EGLSurface eGLSurface = this.f52174l;
            if (egl102.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eglCreateContext)) {
                this.f52175m = this.f52173k.getGL();
                return true;
            }
            com.tencent.mapsdk.core.utils.log.LogUtil.d(f52163u, "eglMakeCurrent failed,errorDetail:" + android.opengl.GLUtils.getEGLErrorString(this.f52171i.eglGetError()));
            return false;
        }
        return false;
    }

    private void g() {
        java.lang.ref.WeakReference<java.lang.Object> weakReference;
        com.tencent.mapsdk.core.utils.log.LogUtil.a(e()).c(com.tencent.mapsdk.internal.la.a.f50266g, com.tencent.mapsdk.internal.ua.a("TR") + " update surface begin");
        while (this.f52166c.get() && !this.f52167d.get() && android.os.SystemClock.elapsedRealtime() - this.f52176p <= f52161q) {
            h();
            try {
                weakReference = this.f52168f;
            } catch (java.lang.Throwable th6) {
                com.tencent.mapsdk.core.utils.log.LogUtil.d(f52163u, "updateSurface failed,errorDetail:" + android.util.Log.getStackTraceString(th6));
                com.tencent.mapsdk.core.utils.log.LogUtil.a(e()).e(com.tencent.mapsdk.internal.la.a.f50266g, com.tencent.mapsdk.internal.ua.a("TR") + " update surface failed", th6);
            }
            if (weakReference != null && weakReference.get() != null) {
                javax.microedition.khronos.egl.EGLSurface eglCreateWindowSurface = this.f52171i.eglCreateWindowSurface(this.f52172j, this.f52170h, this.f52168f.get(), null);
                this.f52174l = eglCreateWindowSurface;
                if (eglCreateWindowSurface != javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) {
                    if (this.f52171i.eglMakeCurrent(this.f52172j, eglCreateWindowSurface, eglCreateWindowSurface, this.f52173k)) {
                        break;
                    }
                    com.tencent.mapsdk.core.utils.log.LogUtil.d(f52163u, "eglMakeCurrent failed,errorDetail:" + android.opengl.GLUtils.getEGLErrorString(this.f52171i.eglGetError()));
                } else {
                    com.tencent.mapsdk.core.utils.log.LogUtil.d(f52163u, "eglCreateWindowSurface failed,errorDetail:" + android.opengl.GLUtils.getEGLErrorString(this.f52171i.eglGetError()));
                }
            }
            return;
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.a(e()).c(com.tencent.mapsdk.internal.la.a.f50266g, com.tencent.mapsdk.internal.ua.a("TR") + " update surface end");
    }

    private void h() {
        javax.microedition.khronos.egl.EGLSurface eGLSurface;
        javax.microedition.khronos.egl.EGLSurface eGLSurface2 = this.f52174l;
        if (eGLSurface2 == null || eGLSurface2 == (eGLSurface = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE)) {
            com.tencent.mapsdk.core.utils.log.LogUtil.d(com.tencent.mapsdk.internal.kx.f50212m, "the EglSurface is null or status is EGL_NO_SURFACE");
            return;
        }
        this.f52171i.eglMakeCurrent(this.f52172j, eGLSurface, eGLSurface, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT);
        this.f52171i.eglDestroySurface(this.f52172j, this.f52174l);
        this.f52174l = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
    }

    private void i() {
        javax.microedition.khronos.egl.EGLContext eGLContext = this.f52173k;
        if (eGLContext == null || eGLContext == javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT) {
            com.tencent.mapsdk.core.utils.log.LogUtil.d(com.tencent.mapsdk.internal.kx.f50212m, "the EglContext is null or status is EGL_NO_CONTEXT");
        } else {
            this.f52171i.eglDestroyContext(this.f52172j, eGLContext);
            this.f52173k = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
        }
    }

    private void j() {
        javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.f52172j;
        if (eGLDisplay == null || eGLDisplay == javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY) {
            com.tencent.mapsdk.core.utils.log.LogUtil.d(com.tencent.mapsdk.internal.kx.f50212m, "the EglDisplay is null or status is EGL_NO_DISPLAY");
        } else {
            this.f52171i.eglTerminate(eGLDisplay);
            this.f52172j = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY;
        }
    }

    private void k() {
        h();
        javax.microedition.khronos.egl.EGLContext eGLContext = this.f52173k;
        if (eGLContext == null || eGLContext == javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT) {
            com.tencent.mapsdk.core.utils.log.LogUtil.d(com.tencent.mapsdk.internal.kx.f50212m, "the EglContext is null or status is EGL_NO_CONTEXT");
        } else {
            this.f52171i.eglDestroyContext(this.f52172j, eGLContext);
            this.f52173k = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
        }
        javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.f52172j;
        if (eGLDisplay == null || eGLDisplay == javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY) {
            com.tencent.mapsdk.core.utils.log.LogUtil.d(com.tencent.mapsdk.internal.kx.f50212m, "the EglDisplay is null or status is EGL_NO_DISPLAY");
        } else {
            this.f52171i.eglTerminate(eGLDisplay);
            this.f52172j = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY;
        }
    }

    public final void a() {
        com.tencent.mapsdk.core.utils.log.LogUtil.a(e()).c(com.tencent.mapsdk.internal.la.a.f50266g, com.tencent.mapsdk.internal.ua.a("TR") + " pause");
        this.f52167d.set(true);
        synchronized (this) {
            notifyAll();
        }
    }

    public final void b() {
        com.tencent.mapsdk.core.utils.log.LogUtil.a(e()).c(com.tencent.mapsdk.internal.la.a.f50266g, com.tencent.mapsdk.internal.ua.a("TR") + " resume");
        this.f52167d.set(false);
        synchronized (this) {
            notifyAll();
        }
    }

    public final void c() {
        com.tencent.mapsdk.core.utils.log.LogUtil.a(e()).c(com.tencent.mapsdk.internal.la.a.f50266g, com.tencent.mapsdk.internal.ua.a("TR") + " destroy");
        this.f52166c.set(false);
        this.f52167d.set(false);
        synchronized (this) {
            notifyAll();
        }
    }

    public final void d() {
        this.f52178s = true;
        this.f52177r = android.os.SystemClock.elapsedRealtime();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        java.lang.ref.WeakReference<java.lang.Object> weakReference;
        super.run();
        com.tencent.mapsdk.core.utils.log.LogUtil.a(e()).c(com.tencent.mapsdk.internal.la.a.f50266g, com.tencent.mapsdk.internal.ua.a("TR") + " start");
        java.lang.ref.WeakReference<com.tencent.mapsdk.internal.tr> weakReference2 = this.f52165b;
        if (weakReference2 != null && weakReference2.get() != null) {
            this.f52165b.get().F();
        }
        boolean z17 = false;
        while (this.f52166c.get()) {
            while (this.f52166c.get() && ((weakReference = this.f52168f) == null || weakReference.get() == null)) {
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
                        while (this.f52166c.get() && this.f52167d.get()) {
                            wait();
                        }
                    }
                    if (this.f52169g) {
                        this.f52176p = android.os.SystemClock.elapsedRealtime();
                        g();
                        this.f52178s = true;
                        this.f52169g = false;
                        d();
                    }
                    java.lang.ref.WeakReference<com.tencent.mapsdk.internal.tr> weakReference3 = this.f52165b;
                    if (weakReference3 != null && weakReference3.get() != null) {
                        com.tencent.mapsdk.internal.tr trVar = this.f52165b.get();
                        if (!this.f52178s || android.os.SystemClock.elapsedRealtime() - this.f52177r >= f52162t) {
                            this.f52178s = false;
                            this.f52177r = 0L;
                        } else if (trVar != null) {
                            trVar.J();
                        }
                        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                        javax.microedition.khronos.egl.EGL10 egl10 = this.f52171i;
                        javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.f52172j;
                        javax.microedition.khronos.egl.EGLSurface eGLSurface = this.f52174l;
                        if (a(egl10, eGLDisplay, eGLSurface)) {
                            if (trVar != null && trVar.a((javax.microedition.khronos.opengles.GL10) this.f52175m)) {
                                egl10.eglSwapBuffers(eGLDisplay, eGLSurface);
                            }
                            int elapsedRealtime2 = (int) ((1000.0f / f52158e) - ((float) (android.os.SystemClock.elapsedRealtime() - elapsedRealtime)));
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
                    if (this.f52166c.get() || !(th6 instanceof java.lang.InterruptedException)) {
                        com.tencent.mapsdk.core.utils.log.LogUtil.d(f52163u, "TextureGLRenderThread Render Exception:" + android.util.Log.getStackTraceString(th6));
                        com.tencent.mapsdk.core.utils.log.LogUtil.a(e()).d(com.tencent.mapsdk.internal.la.a.f50266g, com.tencent.mapsdk.internal.ua.a("TR") + " interrupted", th6);
                    }
                }
            }
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.a(e()).c(com.tencent.mapsdk.internal.la.a.f50266g, com.tencent.mapsdk.internal.ua.a("TR") + " destroy GL");
        java.lang.ref.WeakReference<com.tencent.mapsdk.internal.tr> weakReference4 = this.f52165b;
        if (weakReference4 != null && weakReference4.get() != null) {
            this.f52165b.get().G();
            this.f52165b = null;
        }
        h();
        javax.microedition.khronos.egl.EGLContext eGLContext = this.f52173k;
        if (eGLContext == null || eGLContext == javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT) {
            com.tencent.mapsdk.core.utils.log.LogUtil.d(com.tencent.mapsdk.internal.kx.f50212m, "the EglContext is null or status is EGL_NO_CONTEXT");
        } else {
            this.f52171i.eglDestroyContext(this.f52172j, eGLContext);
            this.f52173k = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
        }
        javax.microedition.khronos.egl.EGLDisplay eGLDisplay2 = this.f52172j;
        if (eGLDisplay2 == null || eGLDisplay2 == javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY) {
            com.tencent.mapsdk.core.utils.log.LogUtil.d(com.tencent.mapsdk.internal.kx.f50212m, "the EglDisplay is null or status is EGL_NO_DISPLAY");
        } else {
            this.f52171i.eglTerminate(eGLDisplay2);
            this.f52172j = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY;
        }
    }

    public final void a(java.lang.Object obj) {
        java.lang.ref.WeakReference<java.lang.Object> weakReference = this.f52168f;
        if (weakReference != null && weakReference.get() != null) {
            this.f52169g = true;
        }
        this.f52168f = new java.lang.ref.WeakReference<>(obj);
        synchronized (this) {
            notifyAll();
        }
    }

    public static void a(float f17) {
        if (f17 <= 0.0f) {
            com.tencent.mapsdk.core.utils.log.LogUtil.e(com.tencent.mapsdk.internal.kx.f50212m, "帧率设置不在有效值范围内");
        } else {
            f52158e = f17;
        }
    }

    private void a(boolean z17) {
        this.f52164a = z17;
    }

    private static boolean a(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLSurface eGLSurface) {
        if (egl10 != null && eGLDisplay != null && eGLSurface != null) {
            try {
                int eglGetError = egl10.eglGetError();
                if (eglGetError == 12288) {
                    return (eGLDisplay == javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY || eGLSurface == javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) ? false : true;
                }
                com.tencent.mapsdk.core.utils.log.LogUtil.d(f52163u, "EGL error detected before surface check: " + android.opengl.GLUtils.getEGLErrorString(eglGetError));
                return false;
            } catch (java.lang.Exception e17) {
                com.tencent.mapsdk.core.utils.log.LogUtil.d(f52163u, "Exception checking EGL surface validity: " + e17.getMessage());
            }
        }
        return false;
    }
}
