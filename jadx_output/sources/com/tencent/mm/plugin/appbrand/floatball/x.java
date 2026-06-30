package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f78170d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.floatball.u f78171e;

    public x(com.tencent.mm.plugin.appbrand.floatball.u uVar, com.tencent.mm.plugin.appbrand.o6 o6Var) {
        this.f78171e = uVar;
        this.f78170d = o6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f78170d.L0() || this.f78170d.S) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandFloatBallLogic", "initFloatBallHelper in work thread, but runtime finished");
            return;
        }
        if (this.f78170d.r0() == null) {
            this.f78171e.f78157k = true;
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandFloatBallLogic", "init, context is null");
            return;
        }
        if (this.f78171e.f78150d != null) {
            this.f78171e.f78150d.o0();
        }
        this.f78171e.b(this.f78170d, true);
        if (this.f78171e.f78151e != null) {
            this.f78171e.f78151e.o0();
        }
        com.tencent.mm.plugin.appbrand.floatball.n nVar = new com.tencent.mm.plugin.appbrand.floatball.n(this.f78170d.r0(), this.f78170d);
        this.f78171e.f78151e = new com.tencent.mm.plugin.appbrand.floatball.p0(nVar, this.f78170d);
        this.f78171e.f78151e.b(7, qp1.n.b(this.f78170d.f74803n, this.f78170d.f74805p.f77281g));
        com.tencent.mm.plugin.appbrand.floatball.p0 p0Var = this.f78171e.f78151e;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = this.f78170d.u0();
        p0Var.getClass();
        if (u07 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLocationFloatBallHelper", "updateBallInfoWithInitConfig, initConfig:%s", u07);
            p0Var.f93132d.f93057r = p0Var.f78129v.u0().f77280f;
            p0Var.f93132d.f93063x = p0Var.f78129v.u0().f77279e;
            if (p0Var.f78129v.f74805p.f77281g == 1) {
                p0Var.f93132d.f93065z = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490041j9);
            } else if (p0Var.f78129v.f74805p.f77281g == 2) {
                p0Var.f93132d.f93065z = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490040j8);
            } else {
                p0Var.f93132d.f93065z = null;
            }
            p0Var.f93132d.n("appId", p0Var.f78129v.u0().f77278d);
            p0Var.f93132d.n(dm.i4.COL_USERNAME, p0Var.f78129v.u0().f47278x);
            p0Var.f93132d.m("versionType", p0Var.f78129v.u0().f77281g);
            com.tencent.mm.plugin.appbrand.floatball.u.g(p0Var, u07);
            p0Var.t().f93086f = 2;
            p0Var.g();
        }
        if (this.f78171e.f78152f != null) {
            this.f78171e.f78152f.o0();
        }
        com.tencent.mm.plugin.appbrand.floatball.n nVar2 = new com.tencent.mm.plugin.appbrand.floatball.n(this.f78170d.r0(), this.f78170d);
        this.f78171e.f78152f = new com.tencent.mm.plugin.appbrand.floatball.w0(nVar2, this.f78170d);
        this.f78171e.f78152f.b(17, qp1.n.b(this.f78170d.f74803n, this.f78170d.f74805p.f77281g));
        com.tencent.mm.plugin.appbrand.floatball.w0 w0Var = this.f78171e.f78152f;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u08 = this.f78170d.u0();
        w0Var.getClass();
        if (u08 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "updateBallInfoWithInitConfig, initConfig:%s", u08);
            w0Var.f93132d.f93057r = w0Var.f78167v.u0().f77280f;
            w0Var.f93132d.f93063x = w0Var.f78167v.u0().f77279e;
            if (w0Var.f78167v.f74805p.f77281g == 1) {
                w0Var.f93132d.f93065z = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490041j9);
            } else if (w0Var.f78167v.f74805p.f77281g == 2) {
                w0Var.f93132d.f93065z = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490040j8);
            } else {
                w0Var.f93132d.f93065z = null;
            }
            w0Var.f93132d.n("appId", w0Var.f78167v.u0().f77278d);
            w0Var.f93132d.n(dm.i4.COL_USERNAME, w0Var.f78167v.u0().f47278x);
            w0Var.f93132d.m("versionType", w0Var.f78167v.u0().f77281g);
            com.tencent.mm.plugin.appbrand.floatball.u.g(w0Var, u08);
            w0Var.t().f93086f = 12;
            w0Var.g();
        }
        if (this.f78171e.f78154h != null) {
            this.f78171e.f78154h.o0();
        }
        com.tencent.mm.plugin.appbrand.floatball.n nVar3 = new com.tencent.mm.plugin.appbrand.floatball.n(this.f78170d.r0(), this.f78170d);
        this.f78171e.f78154h = new com.tencent.mm.plugin.appbrand.floatball.d(nVar3, this.f78170d);
        this.f78171e.f78154h.b(18, qp1.n.a(this.f78170d.f74803n, this.f78170d.f74805p.f77281g));
        com.tencent.mm.plugin.appbrand.floatball.d dVar = this.f78171e.f78154h;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u09 = this.f78170d.u0();
        if (u09 != null) {
            com.tencent.mars.xlog.Log.i(dVar.f78077v, "updateBallInfoWithInitConfig, initConfig:%s", u09);
            dVar.f93132d.f93057r = dVar.f78078w.u0().f77280f;
            dVar.f93132d.f93063x = dVar.u0();
            if (dVar.f78078w.f74805p.f77281g == 1) {
                dVar.f93132d.f93065z = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490041j9);
            } else if (dVar.f78078w.f74805p.f77281g == 2) {
                dVar.f93132d.f93065z = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490040j8);
            } else {
                dVar.f93132d.f93065z = null;
            }
            dVar.g();
        } else {
            dVar.getClass();
        }
        if (this.f78171e.f78153g != null) {
            this.f78171e.f78153g.o0();
        }
        com.tencent.mm.plugin.appbrand.floatball.u1 u1Var = new com.tencent.mm.plugin.appbrand.floatball.u1(this.f78170d.r0(), this.f78170d);
        this.f78171e.f78153g = new com.tencent.mm.plugin.appbrand.floatball.t1(u1Var, this.f78170d);
        this.f78171e.f78153g.b(19, qp1.n.b(this.f78170d.f74803n, this.f78170d.f74805p.f77281g));
        com.tencent.mm.plugin.appbrand.floatball.t1 t1Var = this.f78171e.f78153g;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u010 = this.f78170d.u0();
        t1Var.getClass();
        if (u010 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "updateBallInfoWithInitConfig, initConfig:%s", u010);
            t1Var.f93132d.f93057r = t1Var.f78143v.u0().f77280f;
            t1Var.f93132d.f93063x = t1Var.f78143v.u0().f77279e;
            if (t1Var.f78143v.f74805p.f77281g == 1) {
                t1Var.f93132d.f93065z = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490041j9);
            } else if (t1Var.f78143v.f74805p.f77281g == 2) {
                t1Var.f93132d.f93065z = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490040j8);
            } else {
                t1Var.f93132d.f93065z = null;
            }
            t1Var.f93132d.n("appId", t1Var.f78143v.u0().f77278d);
            t1Var.f93132d.n(dm.i4.COL_USERNAME, t1Var.f78143v.u0().f47278x);
            t1Var.f93132d.m("versionType", t1Var.f78143v.u0().f77281g);
            com.tencent.mm.plugin.appbrand.floatball.u.g(t1Var, u010);
            t1Var.t().f93086f = 14;
            t1Var.g();
        }
        if (this.f78171e.f78155i != null) {
            this.f78171e.f78155i.o0();
        }
        com.tencent.mm.plugin.appbrand.floatball.u1 u1Var2 = new com.tencent.mm.plugin.appbrand.floatball.u1(this.f78170d.r0(), this.f78170d);
        this.f78171e.f78155i = new com.tencent.mm.plugin.appbrand.floatball.k1(u1Var2, this.f78170d);
        this.f78171e.f78155i.b(40, qp1.n.b(this.f78170d.f74803n, this.f78170d.f74805p.f77281g));
        com.tencent.mm.plugin.appbrand.floatball.k1 k1Var = this.f78171e.f78155i;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u011 = this.f78170d.u0();
        if (u011 != null) {
            com.tencent.mars.xlog.Log.i(k1Var.f78107v, "updateBallInfoWithInitConfig, initConfig:%s", u011);
            k1Var.f93132d.f93057r = k1Var.f78108w.u0().f77280f;
            k1Var.f93132d.f93063x = k1Var.v0();
            if (k1Var.f78108w.f74805p.f77281g == 1) {
                k1Var.f93132d.f93065z = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490041j9);
            } else if (k1Var.f78108w.f74805p.f77281g == 2) {
                k1Var.f93132d.f93065z = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490040j8);
            } else {
                k1Var.f93132d.f93065z = null;
            }
            if (k1Var.E) {
                k1Var.F = false;
                com.tencent.mm.plugin.ball.model.BallInfo.BallButtonInfo ballButtonInfo = k1Var.f93132d.f93054o;
                ballButtonInfo.f93076n = true;
                ballButtonInfo.f93077o = true;
                ballButtonInfo.f93080r = true;
            }
            k1Var.f93132d.n("appId", k1Var.f78108w.u0().f77278d);
            k1Var.f93132d.n(dm.i4.COL_USERNAME, k1Var.f78108w.u0().f47278x);
            k1Var.f93132d.m("versionType", k1Var.f78108w.u0().f77281g);
            com.tencent.mm.plugin.appbrand.floatball.u.g(k1Var, u011);
            k1Var.t().f93086f = 27;
            k1Var.g();
        } else {
            k1Var.getClass();
        }
        this.f78171e.f78156j = new com.tencent.mm.plugin.appbrand.floatball.l0(this.f78170d.f74803n);
        this.f78170d.I1(new com.tencent.mm.plugin.appbrand.floatball.w(this));
    }
}
