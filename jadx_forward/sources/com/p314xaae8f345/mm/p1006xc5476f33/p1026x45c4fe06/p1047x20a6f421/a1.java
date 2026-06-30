package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421;

/* loaded from: classes7.dex */
public class a1 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y f159132a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.a47 f159133b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f159134c;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.b1 f159138g;

    /* renamed from: k, reason: collision with root package name */
    public long f159142k;

    /* renamed from: n, reason: collision with root package name */
    public boolean f159145n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f159146o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f159147p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f159148q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.Map f159149r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f159150s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.HashMap f159151t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.Object f159152u;

    /* renamed from: v, reason: collision with root package name */
    public int f159153v;

    /* renamed from: w, reason: collision with root package name */
    public long f159154w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f159155x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f159156y;

    /* renamed from: d, reason: collision with root package name */
    public int f159135d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f159136e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f159137f = 0;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f159139h = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: i, reason: collision with root package name */
    public long f159140i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f159141j = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f159143l = java.lang.System.currentTimeMillis();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f159144m = new java.util.concurrent.atomic.AtomicInteger(0);

    public a1() {
        new java.util.HashMap();
        new java.util.HashMap();
        this.f159147p = new java.util.LinkedList();
        this.f159148q = new java.util.LinkedList();
        this.f159149r = new java.util.HashMap();
        this.f159150s = new java.util.LinkedList();
        this.f159151t = new java.util.HashMap();
        this.f159152u = new java.lang.Object();
        this.f159153v = 0;
        this.f159154w = 0L;
        this.f159156y = false;
        r45.a47 a47Var = new r45.a47();
        this.f159133b = a47Var;
        a47Var.f451258d = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
    }

    public synchronized int a() {
        return this.f159135d;
    }

    public void b(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar, java.lang.String str) {
        this.f159132a = yVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.y1.f159382a = yVar.t3().u0().f128812x0;
        this.f159138g = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.y1.f(str);
        com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3899xf952a052 E0 = this.f159132a.t3().E0();
        if (E0 != null) {
            E0.f128832y = this.f159138g.f159165e;
            E0.f128833z = true;
            uh1.a aVar = (uh1.a) yVar.t3().b(uh1.a.class);
            if (aVar != null) {
                aVar.f509273d = !E0.f128832y;
            }
        }
    }

    public synchronized boolean c() {
        return this.f159145n;
    }

    public synchronized boolean d() {
        synchronized (this) {
        }
        return this.f159137f == 3;
        return this.f159137f == 3;
    }

    public synchronized void e(int i17) {
        this.f159137f = i17;
    }

    public void f() {
        this.f159142k = java.lang.System.currentTimeMillis();
    }
}
