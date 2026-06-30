package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b;

/* loaded from: classes7.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f159703d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.u f159704e;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.u uVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var) {
        this.f159704e = uVar;
        this.f159703d = o6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f159703d.L0() || this.f159703d.S) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandFloatBallLogic", "initFloatBallHelper in work thread, but runtime finished");
            return;
        }
        if (this.f159703d.r0() == null) {
            this.f159704e.f159690k = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandFloatBallLogic", "init, context is null");
            return;
        }
        if (this.f159704e.f159683d != null) {
            this.f159704e.f159683d.o0();
        }
        this.f159704e.b(this.f159703d, true);
        if (this.f159704e.f159684e != null) {
            this.f159704e.f159684e.o0();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.n nVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.n(this.f159703d.r0(), this.f159703d);
        this.f159704e.f159684e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.p0(nVar, this.f159703d);
        this.f159704e.f159684e.b(7, qp1.n.b(this.f159703d.f156336n, this.f159703d.f156338p.f158814g));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.p0 p0Var = this.f159704e.f159684e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u07 = this.f159703d.u0();
        p0Var.getClass();
        if (u07 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLocationFloatBallHelper", "updateBallInfoWithInitConfig, initConfig:%s", u07);
            p0Var.f174665d.f174590r = p0Var.f159662v.u0().f158813f;
            p0Var.f174665d.f174596x = p0Var.f159662v.u0().f158812e;
            if (p0Var.f159662v.f156338p.f158814g == 1) {
                p0Var.f174665d.f174598z = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571574j9);
            } else if (p0Var.f159662v.f156338p.f158814g == 2) {
                p0Var.f174665d.f174598z = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571573j8);
            } else {
                p0Var.f174665d.f174598z = null;
            }
            p0Var.f174665d.n("appId", p0Var.f159662v.u0().f158811d);
            p0Var.f174665d.n(dm.i4.f66875xa013b0d5, p0Var.f159662v.u0().f128811x);
            p0Var.f174665d.m("versionType", p0Var.f159662v.u0().f158814g);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.u.g(p0Var, u07);
            p0Var.t().f174619f = 2;
            p0Var.g();
        }
        if (this.f159704e.f159685f != null) {
            this.f159704e.f159685f.o0();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.n nVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.n(this.f159703d.r0(), this.f159703d);
        this.f159704e.f159685f = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.w0(nVar2, this.f159703d);
        this.f159704e.f159685f.b(17, qp1.n.b(this.f159703d.f156336n, this.f159703d.f156338p.f158814g));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.w0 w0Var = this.f159704e.f159685f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u08 = this.f159703d.u0();
        w0Var.getClass();
        if (u08 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "updateBallInfoWithInitConfig, initConfig:%s", u08);
            w0Var.f174665d.f174590r = w0Var.f159700v.u0().f158813f;
            w0Var.f174665d.f174596x = w0Var.f159700v.u0().f158812e;
            if (w0Var.f159700v.f156338p.f158814g == 1) {
                w0Var.f174665d.f174598z = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571574j9);
            } else if (w0Var.f159700v.f156338p.f158814g == 2) {
                w0Var.f174665d.f174598z = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571573j8);
            } else {
                w0Var.f174665d.f174598z = null;
            }
            w0Var.f174665d.n("appId", w0Var.f159700v.u0().f158811d);
            w0Var.f174665d.n(dm.i4.f66875xa013b0d5, w0Var.f159700v.u0().f128811x);
            w0Var.f174665d.m("versionType", w0Var.f159700v.u0().f158814g);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.u.g(w0Var, u08);
            w0Var.t().f174619f = 12;
            w0Var.g();
        }
        if (this.f159704e.f159687h != null) {
            this.f159704e.f159687h.o0();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.n nVar3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.n(this.f159703d.r0(), this.f159703d);
        this.f159704e.f159687h = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.d(nVar3, this.f159703d);
        this.f159704e.f159687h.b(18, qp1.n.a(this.f159703d.f156336n, this.f159703d.f156338p.f158814g));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.d dVar = this.f159704e.f159687h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u09 = this.f159703d.u0();
        if (u09 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(dVar.f159610v, "updateBallInfoWithInitConfig, initConfig:%s", u09);
            dVar.f174665d.f174590r = dVar.f159611w.u0().f158813f;
            dVar.f174665d.f174596x = dVar.u0();
            if (dVar.f159611w.f156338p.f158814g == 1) {
                dVar.f174665d.f174598z = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571574j9);
            } else if (dVar.f159611w.f156338p.f158814g == 2) {
                dVar.f174665d.f174598z = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571573j8);
            } else {
                dVar.f174665d.f174598z = null;
            }
            dVar.g();
        } else {
            dVar.getClass();
        }
        if (this.f159704e.f159686g != null) {
            this.f159704e.f159686g.o0();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.u1 u1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.u1(this.f159703d.r0(), this.f159703d);
        this.f159704e.f159686g = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.t1(u1Var, this.f159703d);
        this.f159704e.f159686g.b(19, qp1.n.b(this.f159703d.f156336n, this.f159703d.f156338p.f158814g));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.t1 t1Var = this.f159704e.f159686g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u010 = this.f159703d.u0();
        t1Var.getClass();
        if (u010 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "updateBallInfoWithInitConfig, initConfig:%s", u010);
            t1Var.f174665d.f174590r = t1Var.f159676v.u0().f158813f;
            t1Var.f174665d.f174596x = t1Var.f159676v.u0().f158812e;
            if (t1Var.f159676v.f156338p.f158814g == 1) {
                t1Var.f174665d.f174598z = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571574j9);
            } else if (t1Var.f159676v.f156338p.f158814g == 2) {
                t1Var.f174665d.f174598z = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571573j8);
            } else {
                t1Var.f174665d.f174598z = null;
            }
            t1Var.f174665d.n("appId", t1Var.f159676v.u0().f158811d);
            t1Var.f174665d.n(dm.i4.f66875xa013b0d5, t1Var.f159676v.u0().f128811x);
            t1Var.f174665d.m("versionType", t1Var.f159676v.u0().f158814g);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.u.g(t1Var, u010);
            t1Var.t().f174619f = 14;
            t1Var.g();
        }
        if (this.f159704e.f159688i != null) {
            this.f159704e.f159688i.o0();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.u1 u1Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.u1(this.f159703d.r0(), this.f159703d);
        this.f159704e.f159688i = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.k1(u1Var2, this.f159703d);
        this.f159704e.f159688i.b(40, qp1.n.b(this.f159703d.f156336n, this.f159703d.f156338p.f158814g));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.k1 k1Var = this.f159704e.f159688i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u011 = this.f159703d.u0();
        if (u011 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k1Var.f159640v, "updateBallInfoWithInitConfig, initConfig:%s", u011);
            k1Var.f174665d.f174590r = k1Var.f159641w.u0().f158813f;
            k1Var.f174665d.f174596x = k1Var.v0();
            if (k1Var.f159641w.f156338p.f158814g == 1) {
                k1Var.f174665d.f174598z = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571574j9);
            } else if (k1Var.f159641w.f156338p.f158814g == 2) {
                k1Var.f174665d.f174598z = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571573j8);
            } else {
                k1Var.f174665d.f174598z = null;
            }
            if (k1Var.E) {
                k1Var.F = false;
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallButtonInfo ballButtonInfo = k1Var.f174665d.f174587o;
                ballButtonInfo.f174609n = true;
                ballButtonInfo.f174610o = true;
                ballButtonInfo.f174613r = true;
            }
            k1Var.f174665d.n("appId", k1Var.f159641w.u0().f158811d);
            k1Var.f174665d.n(dm.i4.f66875xa013b0d5, k1Var.f159641w.u0().f128811x);
            k1Var.f174665d.m("versionType", k1Var.f159641w.u0().f158814g);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.u.g(k1Var, u011);
            k1Var.t().f174619f = 27;
            k1Var.g();
        } else {
            k1Var.getClass();
        }
        this.f159704e.f159689j = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.l0(this.f159703d.f156336n);
        this.f159703d.I1(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.w(this));
    }
}
