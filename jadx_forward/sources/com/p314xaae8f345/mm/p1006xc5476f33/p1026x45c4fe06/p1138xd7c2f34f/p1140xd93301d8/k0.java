package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8;

/* loaded from: classes7.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f166539a;

    /* renamed from: b, reason: collision with root package name */
    public final l81.b1 f166540b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.q f166541c;

    /* renamed from: d, reason: collision with root package name */
    public final l81.v0 f166542d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f166543e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.p f166544f;

    public k0(int i17, l81.b1 bundle, yz5.q qVar, l81.v0 v0Var, boolean z17, com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.p wxaColdStartMode) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bundle, "bundle");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxaColdStartMode, "wxaColdStartMode");
        this.f166539a = i17;
        this.f166540b = bundle;
        this.f166541c = qVar;
        this.f166542d = v0Var;
        this.f166543e = z17;
        this.f166544f = wxaColdStartMode;
    }

    public final void a() {
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.g5.f166152a.a(this.f166540b);
            if (this.f166544f != com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.p.PRE_RENDER) {
                com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.p pVar = com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.p.HEADLESS;
            }
        } catch (java.lang.Exception e17) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.PreRenderPreconditionProcess", e17, "start()", new java.lang.Object[0]);
            l81.v0 v0Var = this.f166542d;
            if (v0Var != null) {
                l81.v0.b(v0Var, -1, null, 2, null);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.g5.f166152a.g(this.f166540b);
        g17.P = this.f166544f;
        g17.d();
        java.lang.String str2 = this.f166540b.f398547b;
        boolean z17 = true;
        java.lang.String f17 = !(str2 == null || str2.length() == 0) ? this.f166540b.f398547b : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.e0.f(g17);
        java.lang.String f18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.u.f(g17, f17, false);
        if (f17 != null && f17.length() != 0) {
            z17 = false;
        }
        if (!z17 && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.b(this.f166540b.f398549c)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.h0 h0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.f170732h;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0 a17 = h0Var.a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f17);
            com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s c17 = a17.c(f17, this.f166540b.f398549c);
            if (c17 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PreRenderPreconditionProcess", "start(), requestId:" + this.f166539a + ", appId:" + f17 + ", task already alive");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 c11808xe47dc718 = c17.f129220d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c11808xe47dc718, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4) c11808xe47dc718;
                g17.b(c11809xbc286be4);
                c11809xbc286be4.S = g17.f166451u;
                c11809xbc286be4.V = g17.f166453w;
                c11809xbc286be4.f158836p2 = g17.G;
                c11809xbc286be4.f158844x2 = g17.N;
                com.p314xaae8f345.mm.p942x40c3c02f.C11105x57aff1b9 c11105x57aff1b9 = g17.f166447q;
                c11809xbc286be4.N1 = c11105x57aff1b9 != null ? c11105x57aff1b9.f151952h : 0;
                c11809xbc286be4.H = c11105x57aff1b9 != null ? c11105x57aff1b9.f151954m : null;
                c11809xbc286be4.K1 = g17.F;
                c11809xbc286be4.f158831k2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7(f18, c11809xbc286be4, g17.f166443o, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.u.d());
                c11809xbc286be4.i(f18);
                c11809xbc286be4.f158831k2.f169674n = false;
                c11809xbc286be4.S1 = false;
                c11809xbc286be4.E1 = g17.R;
                c11809xbc286be4.H1 = j65.e.b();
                c11809xbc286be4.I1 = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.g0.a(c11809xbc286be4, g17.f166443o);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 statObj = g17.f166443o;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(statObj, "statObj");
                h0Var.a().H(f17, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.a1(c11809xbc286be4, statObj, null), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.h0(c11809xbc286be4, this, g17));
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PreRenderPreconditionProcess", "start(), requestId:" + this.f166539a + ", appId:" + f17 + ", task not alive");
        ((ku5.t0) ku5.t0.f394148d).a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.d0(this.f166539a, g17, f18, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.j0(this), this.f166542d, this.f166543e, this.f166544f));
    }
}
