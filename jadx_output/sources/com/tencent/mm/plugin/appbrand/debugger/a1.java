package com.tencent.mm.plugin.appbrand.debugger;

/* loaded from: classes7.dex */
public class a1 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.luggage.sdk.jsapi.component.service.y f77599a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.a47 f77600b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f77601c;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.debugger.b1 f77605g;

    /* renamed from: k, reason: collision with root package name */
    public long f77609k;

    /* renamed from: n, reason: collision with root package name */
    public boolean f77612n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f77613o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f77614p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f77615q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.Map f77616r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f77617s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.HashMap f77618t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.Object f77619u;

    /* renamed from: v, reason: collision with root package name */
    public int f77620v;

    /* renamed from: w, reason: collision with root package name */
    public long f77621w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f77622x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f77623y;

    /* renamed from: d, reason: collision with root package name */
    public int f77602d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f77603e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f77604f = 0;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f77606h = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: i, reason: collision with root package name */
    public long f77607i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f77608j = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f77610l = java.lang.System.currentTimeMillis();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f77611m = new java.util.concurrent.atomic.AtomicInteger(0);

    public a1() {
        new java.util.HashMap();
        new java.util.HashMap();
        this.f77614p = new java.util.LinkedList();
        this.f77615q = new java.util.LinkedList();
        this.f77616r = new java.util.HashMap();
        this.f77617s = new java.util.LinkedList();
        this.f77618t = new java.util.HashMap();
        this.f77619u = new java.lang.Object();
        this.f77620v = 0;
        this.f77621w = 0L;
        this.f77623y = false;
        r45.a47 a47Var = new r45.a47();
        this.f77600b = a47Var;
        a47Var.f369725d = com.tencent.mm.sdk.platformtools.z.f193112h;
    }

    public synchronized int a() {
        return this.f77602d;
    }

    public void b(com.tencent.luggage.sdk.jsapi.component.service.y yVar, java.lang.String str) {
        this.f77599a = yVar;
        com.tencent.mm.plugin.appbrand.debugger.y1.f77849a = yVar.t3().u0().f47279x0;
        this.f77605g = com.tencent.mm.plugin.appbrand.debugger.y1.f(str);
        com.tencent.luggage.sdk.config.AppBrandSysConfigLU E0 = this.f77599a.t3().E0();
        if (E0 != null) {
            E0.f47299y = this.f77605g.f77632e;
            E0.f47300z = true;
            uh1.a aVar = (uh1.a) yVar.t3().b(uh1.a.class);
            if (aVar != null) {
                aVar.f427740d = !E0.f47299y;
            }
        }
    }

    public synchronized boolean c() {
        return this.f77612n;
    }

    public synchronized boolean d() {
        synchronized (this) {
        }
        return this.f77604f == 3;
        return this.f77604f == 3;
    }

    public synchronized void e(int i17) {
        this.f77604f = i17;
    }

    public void f() {
        this.f77609k = java.lang.System.currentTimeMillis();
    }
}
