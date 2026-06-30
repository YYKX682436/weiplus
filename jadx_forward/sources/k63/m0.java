package k63;

/* loaded from: classes14.dex */
public final class m0 implements et0.r {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.HandlerThread f386086d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f386087e;

    /* renamed from: f, reason: collision with root package name */
    public rs0.h f386088f;

    /* renamed from: g, reason: collision with root package name */
    public final k63.n0 f386089g;

    /* renamed from: h, reason: collision with root package name */
    public final ft0.h f386090h;

    /* renamed from: i, reason: collision with root package name */
    public int f386091i;

    /* renamed from: m, reason: collision with root package name */
    public int f386092m;

    /* renamed from: n, reason: collision with root package name */
    public android.opengl.EGLSurface f386093n;

    /* renamed from: o, reason: collision with root package name */
    public k63.w f386094o;

    /* renamed from: p, reason: collision with root package name */
    public long f386095p;

    /* renamed from: q, reason: collision with root package name */
    public long f386096q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.Surface f386097r;

    /* renamed from: s, reason: collision with root package name */
    public yz5.a f386098s;

    /* renamed from: t, reason: collision with root package name */
    public final k63.h0 f386099t;

    public m0() {
        int i17 = pu5.i.f440006b;
        android.os.HandlerThread a17 = pu5.f.a("GameLiveRenderThread", 10);
        this.f386086d = a17;
        this.f386089g = new k63.n0();
        this.f386090h = new ft0.h(this);
        a17.start();
        this.f386087e = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(a17.getLooper());
        l(new k63.d0(this));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveRenderManager", "resume");
        l(new k63.k0(this));
        this.f386099t = new k63.h0(this);
    }

    public static final void a(k63.m0 m0Var) {
        if (m0Var.f386093n != null) {
            android.opengl.EGLDisplay eGLDisplay = m0Var.c().f480825a;
            android.opengl.EGLSurface eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
            android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, android.opengl.EGL14.EGL_NO_CONTEXT);
            android.opengl.EGL14.eglDestroySurface(m0Var.c().f480825a, m0Var.f386093n);
        }
    }

    public static final void b(k63.m0 m0Var, int i17) {
        m0Var.getClass();
        int myTid = android.os.Process.myTid();
        if (myTid > 0) {
            try {
                android.os.Process.setThreadPriority(myTid, i17);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GameLiveRenderManager", e17, "setThreadPriority priority=%d tid=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(myTid));
            }
        }
    }

    public final rs0.h c() {
        rs0.h hVar = this.f386088f;
        if (hVar != null) {
            return hVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("eglEnvironment");
        throw null;
    }

    @Override // et0.r
    public void l(final yz5.a r17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r17, "r");
        this.f386087e.mo50293x3498a0(new java.lang.Runnable(r17) { // from class: k63.l0

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.a f386085d;

            {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r17, "function");
                this.f386085d = r17;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f386085d.mo152xb9724478();
            }
        });
    }

    @Override // et0.r
    /* renamed from: requestRender */
    public void mo46859x511cb905() {
        l(new k63.j0(this));
    }
}
