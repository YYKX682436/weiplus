package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes9.dex */
public class o5 implements g35.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f270546a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d f270547b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f270548c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f270549d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.s5 f270550e;

    public o5(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.s5 s5Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar, long j17, java.lang.String str) {
        this.f270550e = s5Var;
        this.f270546a = f9Var;
        this.f270547b = dVar;
        this.f270548c = j17;
        this.f270549d = str;
    }

    @Override // g35.d
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, long j17) {
        int t17;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f270546a;
        if (K0) {
            f9Var.r1(5);
            bu.a.e(f9Var.m124847x74d37ac6(), bu.a.c(0, 0, str, 727));
            ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).bb(f9Var.m124847x74d37ac6(), f9Var);
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            f9Var2.e1(c01.w9.o(f9Var.Q0()));
            f9Var2.u1(f9Var.Q0());
            f9Var2.d1(str);
            f9Var2.m124850x7650bebc(10000);
            f9Var2.r1(6);
            f9Var2.j1(0);
            ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).M9(f9Var2);
            this.f270550e.f270609n = false;
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = this.f270547b;
        dVar.f68111xda9bc3b3 = str4;
        dVar.f68097xfafba34a = str5;
        dVar.f68098xbfce865e = str6;
        dVar.f68103x4a777c2 = c01.id.e();
        java.lang.String j18 = f9Var.j();
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f9Var.Q0()) && (t17 = c01.w9.t(f9Var.j())) != -1) {
            j18 = (f9Var.j() + " ").substring(t17 + 2).trim();
        }
        ot0.q v17 = ot0.q.v(j18);
        if (v17 != null) {
            v17.f430243t = str2;
            v17.T = str3;
            v17.f430215m = j17;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(dVar.f68107xaaaa6883, dVar.f68106x315a5445);
            Li.d1(ot0.q.u(v17, null, null));
            ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).lb(Li.m124847x74d37ac6(), Li, true);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().mo9952xce0038c9(dVar, new java.lang.String[0]);
        c01.d9.e().g(new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w4(this.f270548c, null, this.f270549d));
    }
}
