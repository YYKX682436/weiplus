package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030;

/* loaded from: classes7.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final ze.n f168874d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f168875e;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f168880m;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.t f168882o;

    /* renamed from: f, reason: collision with root package name */
    public volatile double f168876f = 0.0d;

    /* renamed from: g, reason: collision with root package name */
    public volatile int f168877g = 4;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f168878h = true;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f168879i = false;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0 f168883p = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.e(this);

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.o f168881n = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.o(android.os.Process.myPid());

    public f(ze.n nVar) {
        this.f168880m = false;
        this.f168874d = nVar;
        this.f168875e = nVar.f156336n;
        this.f168880m = false;
    }

    public void a() {
    }

    public void b() {
    }

    public void c() {
    }

    public void d() {
    }

    public void e() {
    }

    public void f() {
        int b07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.b0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.h.e(this.f168874d, 102, b07 + "m");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.m.a(this.f168875e, "Hardware", "MEMORY", (double) b07);
    }

    public void g() {
        if (!this.f168880m) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.c cVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.c(this);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.t tVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.t();
            this.f168882o = tVar;
            tVar.f168915g = 100L;
            tVar.f168917i = cVar;
        }
        this.f168878h = true;
        ik1.h0.a().m77784x795fa299(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.a(this.f168875e, this.f168883p);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.t tVar2 = this.f168882o;
        if (tVar2 != null) {
            tVar2.a();
        }
    }

    public void h() {
        this.f168878h = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.e(this.f168875e, this.f168883p);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.t tVar = this.f168882o;
        if (tVar != null) {
            tVar.b();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.o oVar = this.f168881n;
        if (oVar != null) {
            oVar.close();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f168874d.L0()) {
            return;
        }
        if (this.f168878h && !this.f168879i) {
            double b17 = this.f168881n.b();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.h.e(this.f168874d, 101, ((int) b17) + "%");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.m.a(this.f168875e, "Hardware", "CPU", b17);
            f();
            e();
            b();
            a();
            d();
            c();
            this.f168877g++;
            if (this.f168877g >= 4) {
                this.f168877g = 0;
                ze.n nVar = this.f168874d;
                com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3899xf952a052 E0 = nVar.E0();
                if (E0 != null) {
                    int i17 = E0.f387386s;
                    java.lang.String str = this.f168875e;
                    if (i17 == 1) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.C12242x49ab2aab c12242x49ab2aab = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.C12242x49ab2aab();
                        c12242x49ab2aab.f164873f = str;
                        c12242x49ab2aab.f164875h = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.d(this, c12242x49ab2aab);
                        c12242x49ab2aab.d();
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.h.e(nVar, 401, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1146x600e8c43.b) ((oe.a) nd.f.a(oe.a.class))).b(str, E0.f387386s, E0.f387388u).K(str)));
                    }
                }
            }
        }
        if (this.f168878h) {
            ik1.h0.a().b(this, 1000L);
        }
    }
}
