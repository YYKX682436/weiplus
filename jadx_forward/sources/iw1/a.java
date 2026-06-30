package iw1;

/* loaded from: classes13.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: o, reason: collision with root package name */
    public static int f376722o;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.BlockingQueue f376723d;

    /* renamed from: e, reason: collision with root package name */
    public final android.opengl.EGLContext f376724e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f376725f;

    /* renamed from: g, reason: collision with root package name */
    public final long f376726g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f376727h;

    /* renamed from: i, reason: collision with root package name */
    public final int f376728i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f376729m;

    /* renamed from: n, reason: collision with root package name */
    public rs0.h f376730n;

    public a(java.util.concurrent.BlockingQueue workerQueue, android.opengl.EGLContext sharedEGLContext, yz5.l onComplete, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(workerQueue, "workerQueue");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sharedEGLContext, "sharedEGLContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onComplete, "onComplete");
        this.f376723d = workerQueue;
        this.f376724e = sharedEGLContext;
        this.f376725f = onComplete;
        this.f376726g = j17;
        this.f376727h = true;
        int i17 = f376722o;
        f376722o = i17 + 1;
        this.f376728i = i17;
        this.f376729m = "MicroMsg.MTR.GLEnvironmentRunnable-" + i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Object m143895xf1229813;
        java.lang.String str;
        java.lang.StringBuilder sb6;
        jz5.f0 f0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f376729m, "start run, shareContext " + this.f376724e);
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            android.os.Process.setThreadPriority(-10);
        } else {
            android.os.Process.setThreadPriority(-1);
        }
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(rs0.i.f480829a.m(null, null, 1, 1, this.f376724e));
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
            m143895xf1229813 = null;
        }
        rs0.h hVar = (rs0.h) m143895xf1229813;
        if (hVar != null) {
            android.opengl.EGLDisplay eGLDisplay = hVar.f480825a;
            android.opengl.EGLSurface eGLSurface = hVar.f480826b;
            android.opengl.EGLSurface eGLSurface2 = eGLSurface == null ? android.opengl.EGL14.EGL_NO_SURFACE : eGLSurface;
            if (eGLSurface == null) {
                eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
            }
            android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface, hVar.f480827c);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f376729m, "eglMakeCurrent");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f376729m, "create gl environment error");
            this.f376727h = false;
            hVar = null;
        }
        this.f376730n = hVar;
        try {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f376729m, "enter loop " + this.f376728i);
                while (this.f376727h) {
                    long j17 = this.f376726g;
                    java.lang.Runnable runnable = j17 > 0 ? (java.lang.Runnable) this.f376723d.poll(j17, java.util.concurrent.TimeUnit.MILLISECONDS) : (java.lang.Runnable) this.f376723d.take();
                    if (runnable != null) {
                        runnable.run();
                        f0Var = jz5.f0.f384359a;
                    } else {
                        f0Var = null;
                    }
                    if (f0Var == null) {
                        this.f376727h = false;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f376729m, "timeout, quit");
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f376729m, "quit loop " + this.f376728i);
                this.f376725f.mo146xb9724478(this);
                str = this.f376729m;
                sb6 = new java.lang.StringBuilder("release gl environment ");
            } catch (java.lang.InterruptedException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f376729m, "on interrupt " + this.f376728i + ' ' + e17 + ' ');
                this.f376725f.mo146xb9724478(this);
                str = this.f376729m;
                sb6 = new java.lang.StringBuilder("release gl environment ");
            }
            sb6.append(this.f376728i);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            rs0.i.f480829a.u(this.f376730n);
        } catch (java.lang.Throwable th7) {
            this.f376725f.mo146xb9724478(this);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f376729m, "release gl environment " + this.f376728i);
            rs0.i.f480829a.u(this.f376730n);
            throw th7;
        }
    }
}
