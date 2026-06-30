package cl;

/* loaded from: classes7.dex */
public abstract class a implements cl.p {

    /* renamed from: x, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f124098x = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: y, reason: collision with root package name */
    public static java.lang.Runnable f124099y = new cl.b();

    /* renamed from: z, reason: collision with root package name */
    public static cl.n f124100z = new cl.c();

    /* renamed from: a, reason: collision with root package name */
    public com.p159x477cd522.p160x333422.C1460x397c7778 f124101a;

    /* renamed from: b, reason: collision with root package name */
    public cl.r f124102b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.concurrent.CountDownLatch f124103c;

    /* renamed from: d, reason: collision with root package name */
    public com.p159x477cd522.p160x333422.p164x6a710b1.C1521xcca0a74c f124104d;

    /* renamed from: e, reason: collision with root package name */
    public cl.w3 f124105e;

    /* renamed from: f, reason: collision with root package name */
    public cl.u f124106f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f124107g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f124108h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f124109i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f124110j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f124111k;

    /* renamed from: l, reason: collision with root package name */
    public final int f124112l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f124113m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f124114n;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f124116p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f124117q;

    /* renamed from: s, reason: collision with root package name */
    public final android.util.SparseArray f124119s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f124120t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f124121u;

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p627x45c4fe06.v8.C5138xafbea1a0 f124122v;

    /* renamed from: o, reason: collision with root package name */
    public volatile int f124115o = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f124118r = 0;

    /* renamed from: w, reason: collision with root package name */
    public final boolean[] f124123w = new boolean[1];

    public a(com.p314xaae8f345.mm.p627x45c4fe06.v8.C5138xafbea1a0 c5138xafbea1a0) {
        this.f124107g = "RuntimeLooper";
        this.f124112l = com.p159x477cd522.p160x333422.p163x10fad5c4.AbstractC1516x4fd55f3d.Success.f5027x1f5f799a;
        if (c5138xafbea1a0 != null) {
            if (!android.text.TextUtils.isEmpty(c5138xafbea1a0.f135476a)) {
                c5138xafbea1a0.f135476a = com.p314xaae8f345.mm.vfs.w6.i(c5138xafbea1a0.f135476a, true);
            }
            this.f124108h = c5138xafbea1a0.f135476a;
            this.f124109i = c5138xafbea1a0.f135479d;
            this.f124110j = c5138xafbea1a0.f135477b;
            this.f124111k = c5138xafbea1a0.f135478c;
            this.f124112l = c5138xafbea1a0.f135480e;
            this.f124116p = c5138xafbea1a0.m43219xc0277067();
            this.f124114n = c5138xafbea1a0.f135483h;
            this.f124117q = c5138xafbea1a0.f135484i;
            this.f124106f = c5138xafbea1a0.f135490o;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c5138xafbea1a0.f135486k)) {
                this.f124107g = c5138xafbea1a0.f135486k;
            }
            this.f124113m = c5138xafbea1a0.f135488m;
        } else {
            this.f124116p = false;
            this.f124117q = false;
        }
        this.f124122v = c5138xafbea1a0 == null ? new com.p314xaae8f345.mm.p627x45c4fe06.v8.C5138xafbea1a0() : c5138xafbea1a0;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Boolean.valueOf(this.f124116p);
        objArr[1] = java.lang.Boolean.valueOf(this.f124117q);
        objArr[2] = c5138xafbea1a0 != null ? c5138xafbea1a0.m43218x9616526c() : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbstractJSRuntime", "<init> hy: use native buffer: %b, hasGlobalTimer: %b, config: %s", objArr);
        this.f124119s = new android.util.SparseArray();
        this.f124120t = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f124121u = new java.util.concurrent.ConcurrentLinkedQueue();
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        this.f124103c = new java.util.concurrent.CountDownLatch(1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbstractJSRuntime", "startLooper: " + hashCode());
        new cl.e(this, java.lang.String.format(java.util.Locale.US, "JS%s#%d", this.f124107g, java.lang.Integer.valueOf(f124098x.getAndIncrement())), countDownLatch).start();
        try {
            countDownLatch.await(5000L, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbstractJSRuntime", "init latch.await InterruptedException:%s", e17);
        }
    }

    public abstract void a();

    public cl.u b() {
        if (this.f124106f == null) {
            if (this.f124116p) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbstractJSRuntime", "hy: start load native buffer jni");
                this.f124106f = new com.p314xaae8f345.mm.p627x45c4fe06.v8.C5139xae9fd4ce();
            } else {
                this.f124106f = new cl.x2();
            }
        }
        return this.f124106f;
    }

    public final void c() {
        if (this.f124102b == null && this.f124103c != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbstractJSRuntime", "scheduleToJSThread but looper null");
            try {
                this.f124103c.await(30000L, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.lang.InterruptedException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbstractJSRuntime", "scheduleToJSThread latch.await InterruptedException:%s", e17);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbstractJSRuntime", "scheduleToJSThread but looper assigned");
        }
        if (this.f124102b == null) {
            f124099y.run();
            if (this.f124102b == null) {
                throw new java.lang.IllegalStateException("JSRuntime not ready!");
            }
        }
    }

    public abstract cl.r d();

    public abstract com.p159x477cd522.p160x333422.C1460x397c7778 e();

    public final void f(com.p159x477cd522.p160x333422.AbstractC1482xef2ea8c2 abstractC1482xef2ea8c2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.s sVar;
        synchronized (this.f124119s) {
            sVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.s) this.f124119s.get(abstractC1482xef2ea8c2.m16446xfe923761());
        }
        if (sVar != null) {
            sVar.a(abstractC1482xef2ea8c2.m16449xade88be8(), abstractC1482xef2ea8c2.m16450xc63f701c());
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AbstractJSRuntime", "publishJSException jsHandler null %s", abstractC1482xef2ea8c2);
        }
    }

    public void g() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbstractJSRuntime", "quit() JsRuntime[%d]", java.lang.Integer.valueOf(hashCode()));
        this.f124102b.mo15039x35224f();
        f124100z.c(this);
        this.f124115o = -1;
    }

    public void h(java.lang.Runnable runnable, boolean z17) {
        c();
        this.f124102b.n(runnable, z17);
    }

    public void i(int i17) {
        int i18 = this.f124115o;
        if (i18 > 0) {
            try {
                android.os.Process.setThreadPriority(i18, i17);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AbstractJSRuntime", e17, "setThreadPriority priority=%d tid=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            }
        }
    }
}
