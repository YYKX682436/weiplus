package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public final class da extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f282408d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f282409e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja f282410f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta f282411g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f282412h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f282413i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ pk4.d f282414m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ t21.v2 f282415n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f282416o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja jaVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta taVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17, pk4.d dVar, t21.v2 v2Var, int i18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f282410f = jaVar;
        this.f282411g = taVar;
        this.f282412h = f9Var;
        this.f282413i = i17;
        this.f282414m = dVar;
        this.f282415n = v2Var;
        this.f282416o = i18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.da daVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.da(this.f282410f, this.f282411g, this.f282412h, this.f282413i, this.f282414m, this.f282415n, this.f282416o, interfaceC29045xdcb5ca57);
        daVar.f282409e = obj;
        return daVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.da) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        jz5.f0 f0Var;
        java.lang.String str = "Failed to wait video to be downloaded: ";
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f282408d;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        try {
            try {
                if (i17 == 0) {
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja jaVar = this.f282410f;
                    fk4.u uVar = jaVar.f282615w;
                    if (uVar != null) {
                        ((fk4.k) uVar).f345154i = jaVar.S();
                    }
                    fk4.u uVar2 = this.f282410f.f282615w;
                    if (uVar2 != null) {
                        ((fk4.k) uVar2).m();
                        f0Var = f0Var2;
                    } else {
                        f0Var = null;
                    }
                    if (f0Var == null) {
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja jaVar2 = this.f282410f;
                        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f282412h;
                        t21.v2 v2Var = this.f282415n;
                        if (jaVar2.S()) {
                            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6953x6177b4fc c6953x6177b4fc = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6953x6177b4fc();
                            c6953x6177b4fc.f142588i = f9Var.I0();
                            ok4.c cVar = new ok4.c(jaVar2.f282610r);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(v2Var);
                            fk4.k kVar = (fk4.k) com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja.C(jaVar2, f9Var, v2Var, cVar, c6953x6177b4fc);
                            kVar.f345146a.f(0);
                            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p.f282787a.b();
                            kVar.o();
                        }
                    }
                    if (this.f282410f.S()) {
                        fk4.u uVar3 = this.f282410f.f282615w;
                        if (uVar3 != null) {
                            ((fk4.k) uVar3).f345154i = true;
                        }
                        this.f282410f.f282419d.f282625g.v9(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.s.f282881f, this.f282411g.f282958c);
                    }
                    this.f282410f.K(this.f282411g, t21.d3.g(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.j1.s(this.f282412h)));
                    ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ca(this.f282410f, this.f282416o));
                    int i18 = this.f282413i;
                    if (i18 == 2) {
                        this.f282410f.getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(354L, 14L, 1L, false);
                    } else if (i18 == 1) {
                        this.f282410f.getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(354L, 11L, 1L, false);
                    }
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja jaVar3 = this.f282410f;
                    jaVar3.f282614v = true;
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = this.f282412h;
                    this.f282408d = 1;
                    java.lang.Object F = jaVar3.F(f9Var2, this);
                    str = F;
                    if (F == aVar) {
                        return aVar;
                    }
                } else {
                    if (i17 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                    str = str;
                }
                if (this.f282410f.S()) {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja jaVar4 = this.f282410f;
                    if (jaVar4.f282614v) {
                        jaVar4.K(this.f282411g, t21.d3.g(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.j1.s(this.f282412h)));
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja.D(this.f282410f, this.f282411g);
                    }
                } else {
                    this.f282410f.L(this.f282411g, true);
                }
                int i19 = this.f282413i;
                if (i19 == 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Imagegallery.handler.video.tp", "do restransmit video");
                    this.f282410f.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(354L, 15L, 1L, false);
                    this.f282410f.f282419d.p(this.f282412h);
                    this.f282410f.f282419d.f282625g.Q8(-1L);
                    if (this.f282414m.getIsOnlineVideo()) {
                        t21.d3.w(this.f282415n.d(), this.f282414m.m158649x9746038c(), true);
                    }
                } else if (i19 == 2) {
                    this.f282410f.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(354L, 16L, 1L, false);
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja jaVar5 = this.f282410f;
                    if (jaVar5.f282614v) {
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.m(jaVar5.f282419d.f282625g, this.f282412h, true, null);
                    }
                    this.f282410f.f282419d.f282625g.Q8(-1L);
                    if (this.f282414m.getIsOnlineVideo()) {
                        t21.d3.w(this.f282415n.d(), this.f282414m.m158649x9746038c(), true);
                    }
                }
                this.f282410f.f282614v = false;
                return f0Var2;
            } catch (java.lang.IllegalStateException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Imagegallery.handler.video.tp", str + e17.getMessage());
                if (this.f282410f.S()) {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja jaVar6 = this.f282410f;
                    if (jaVar6.f282614v) {
                        jaVar6.K(this.f282411g, t21.d3.g(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.j1.s(this.f282412h)));
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja.D(this.f282410f, this.f282411g);
                    }
                } else {
                    this.f282410f.L(this.f282411g, true);
                }
                return f0Var2;
            }
        } catch (java.lang.Throwable th6) {
            if (this.f282410f.S()) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja jaVar7 = this.f282410f;
                if (jaVar7.f282614v) {
                    jaVar7.K(this.f282411g, t21.d3.g(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.j1.s(this.f282412h)));
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja.D(this.f282410f, this.f282411g);
                }
            } else {
                this.f282410f.L(this.f282411g, true);
            }
            throw th6;
        }
    }
}
