package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public class r4 extends k75.k implements java.lang.Runnable {

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String f75937r = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyg) + "/weapp/public/commlib/%d.wxapkg";

    /* renamed from: g, reason: collision with root package name */
    public final int f75938g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f75939h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f75940i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Runnable f75941m;

    /* renamed from: n, reason: collision with root package name */
    public final k75.c f75942n;

    /* renamed from: o, reason: collision with root package name */
    public final k75.c f75943o;

    /* renamed from: p, reason: collision with root package name */
    public final k75.c f75944p;

    /* renamed from: q, reason: collision with root package name */
    public final k75.c f75945q;

    public r4(int i17, java.lang.String str, boolean z17) {
        super("LibIncrementalTestCase", android.os.Looper.getMainLooper());
        this.f75942n = new com.tencent.mm.plugin.appbrand.appcache.g4(this);
        this.f75943o = new com.tencent.mm.plugin.appbrand.appcache.j4(this);
        this.f75944p = new com.tencent.mm.plugin.appbrand.appcache.m4(this);
        this.f75945q = new com.tencent.mm.plugin.appbrand.appcache.p4(this);
        this.f75938g = i17;
        this.f75939h = str;
        this.f75940i = z17;
    }

    public static void q(com.tencent.mm.plugin.appbrand.appcache.r4 r4Var, java.lang.String str) {
        r4Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LibIncrementalTestCase[incremental]", "Result: %s", str);
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.appcache.q4(r4Var, str));
    }

    @Override // k75.k
    public void i() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LibIncrementalTestCase[incremental]", "TestCase onQuitting");
        java.lang.Runnable runnable = this.f75941m;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f75940i) {
            com.tencent.mm.plugin.appbrand.appcache.r7.f75948a.a(true);
        }
        k75.c cVar = this.f75942n;
        c(cVar);
        c(this.f75943o);
        c(this.f75944p);
        c(this.f75945q);
        m(cVar);
        n();
    }
}
