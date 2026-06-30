package cl;

/* loaded from: classes7.dex */
public abstract class a implements cl.p {

    /* renamed from: x, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f42565x = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: y, reason: collision with root package name */
    public static java.lang.Runnable f42566y = new cl.b();

    /* renamed from: z, reason: collision with root package name */
    public static cl.n f42567z = new cl.c();

    /* renamed from: a, reason: collision with root package name */
    public com.eclipsesource.mmv8.MultiContextV8 f42568a;

    /* renamed from: b, reason: collision with root package name */
    public cl.r f42569b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.concurrent.CountDownLatch f42570c;

    /* renamed from: d, reason: collision with root package name */
    public com.eclipsesource.mmv8.utils.MemoryManager f42571d;

    /* renamed from: e, reason: collision with root package name */
    public cl.w3 f42572e;

    /* renamed from: f, reason: collision with root package name */
    public cl.u f42573f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f42574g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f42575h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f42576i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f42577j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f42578k;

    /* renamed from: l, reason: collision with root package name */
    public final int f42579l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f42580m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f42581n;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f42583p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f42584q;

    /* renamed from: s, reason: collision with root package name */
    public final android.util.SparseArray f42586s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f42587t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f42588u;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.appbrand.v8.IJSRuntime$Config f42589v;

    /* renamed from: o, reason: collision with root package name */
    public volatile int f42582o = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f42585r = 0;

    /* renamed from: w, reason: collision with root package name */
    public final boolean[] f42590w = new boolean[1];

    public a(com.tencent.mm.appbrand.v8.IJSRuntime$Config iJSRuntime$Config) {
        this.f42574g = "RuntimeLooper";
        this.f42579l = com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Success.INVALID_CONTEXT_INDEX;
        if (iJSRuntime$Config != null) {
            if (!android.text.TextUtils.isEmpty(iJSRuntime$Config.f53943a)) {
                iJSRuntime$Config.f53943a = com.tencent.mm.vfs.w6.i(iJSRuntime$Config.f53943a, true);
            }
            this.f42575h = iJSRuntime$Config.f53943a;
            this.f42576i = iJSRuntime$Config.f53946d;
            this.f42577j = iJSRuntime$Config.f53944b;
            this.f42578k = iJSRuntime$Config.f53945c;
            this.f42579l = iJSRuntime$Config.f53947e;
            this.f42583p = iJSRuntime$Config.useNativeBufferJNI();
            this.f42581n = iJSRuntime$Config.f53950h;
            this.f42584q = iJSRuntime$Config.f53951i;
            this.f42573f = iJSRuntime$Config.f53957o;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(iJSRuntime$Config.f53953k)) {
                this.f42574g = iJSRuntime$Config.f53953k;
            }
            this.f42580m = iJSRuntime$Config.f53955m;
        } else {
            this.f42583p = false;
            this.f42584q = false;
        }
        this.f42589v = iJSRuntime$Config == null ? new com.tencent.mm.appbrand.v8.IJSRuntime$Config() : iJSRuntime$Config;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Boolean.valueOf(this.f42583p);
        objArr[1] = java.lang.Boolean.valueOf(this.f42584q);
        objArr[2] = iJSRuntime$Config != null ? iJSRuntime$Config.toString() : "";
        com.tencent.mars.xlog.Log.i("MicroMsg.AbstractJSRuntime", "<init> hy: use native buffer: %b, hasGlobalTimer: %b, config: %s", objArr);
        this.f42586s = new android.util.SparseArray();
        this.f42587t = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f42588u = new java.util.concurrent.ConcurrentLinkedQueue();
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        this.f42570c = new java.util.concurrent.CountDownLatch(1);
        com.tencent.mars.xlog.Log.i("MicroMsg.AbstractJSRuntime", "startLooper: " + hashCode());
        new cl.e(this, java.lang.String.format(java.util.Locale.US, "JS%s#%d", this.f42574g, java.lang.Integer.valueOf(f42565x.getAndIncrement())), countDownLatch).start();
        try {
            countDownLatch.await(5000L, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AbstractJSRuntime", "init latch.await InterruptedException:%s", e17);
        }
    }

    public abstract void a();

    public cl.u b() {
        if (this.f42573f == null) {
            if (this.f42583p) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AbstractJSRuntime", "hy: start load native buffer jni");
                this.f42573f = new com.tencent.mm.appbrand.v8.NativeBufferJNI();
            } else {
                this.f42573f = new cl.x2();
            }
        }
        return this.f42573f;
    }

    public final void c() {
        if (this.f42569b == null && this.f42570c != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AbstractJSRuntime", "scheduleToJSThread but looper null");
            try {
                this.f42570c.await(30000L, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.lang.InterruptedException e17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AbstractJSRuntime", "scheduleToJSThread latch.await InterruptedException:%s", e17);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AbstractJSRuntime", "scheduleToJSThread but looper assigned");
        }
        if (this.f42569b == null) {
            f42566y.run();
            if (this.f42569b == null) {
                throw new java.lang.IllegalStateException("JSRuntime not ready!");
            }
        }
    }

    public abstract cl.r d();

    public abstract com.eclipsesource.mmv8.MultiContextV8 e();

    public final void f(com.eclipsesource.mmv8.V8ScriptException v8ScriptException) {
        com.tencent.mm.plugin.appbrand.jsruntime.s sVar;
        synchronized (this.f42586s) {
            sVar = (com.tencent.mm.plugin.appbrand.jsruntime.s) this.f42586s.get(v8ScriptException.getContextTag());
        }
        if (sVar != null) {
            sVar.a(v8ScriptException.getJSMessage(), v8ScriptException.getJSStackTrace());
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.AbstractJSRuntime", "publishJSException jsHandler null %s", v8ScriptException);
        }
    }

    public void g() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AbstractJSRuntime", "quit() JsRuntime[%d]", java.lang.Integer.valueOf(hashCode()));
        this.f42569b.quit();
        f42567z.c(this);
        this.f42582o = -1;
    }

    public void h(java.lang.Runnable runnable, boolean z17) {
        c();
        this.f42569b.n(runnable, z17);
    }

    public void i(int i17) {
        int i18 = this.f42582o;
        if (i18 > 0) {
            try {
                android.os.Process.setThreadPriority(i18, i17);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AbstractJSRuntime", e17, "setThreadPriority priority=%d tid=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            }
        }
    }
}
