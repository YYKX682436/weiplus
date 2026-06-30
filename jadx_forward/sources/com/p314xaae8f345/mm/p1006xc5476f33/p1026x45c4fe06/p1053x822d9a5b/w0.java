package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b;

/* loaded from: classes7.dex */
public class w0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.h0 {

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f159700v;

    /* renamed from: w, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0 f159701w;

    /* renamed from: x, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.u0 f159702x;

    public w0(dp1.x xVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var) {
        super(xVar);
        this.f159702x = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.u0(this);
        this.f159700v = o6Var;
        o6Var.l(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "create, runtime:%s", java.lang.Integer.valueOf(o6Var.hashCode()));
        this.f159701w = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0.class);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void H() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "onReceivedBallInfoRemovedEvent, runtime:%s", java.lang.Integer.valueOf(this.f159700v.hashCode()));
        n0();
        y0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void I() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "onReceivedFinishWhenSwitchBallEvent, runtime:%s", java.lang.Integer.valueOf(this.f159700v.hashCode()));
        this.f174772n.q(true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d, gp1.r
    public void b(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "onCreate, type:%s, key:%s", java.lang.Integer.valueOf(i17), str);
        super.b(i17, str);
        Q(2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0 v0Var = this.f159701w;
        if (v0Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.k) v0Var).wi(this.f159702x);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4
    public boolean m0(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "onClose, runtime:%s", java.lang.Integer.valueOf(this.f159700v.hashCode()));
        if (!u()) {
            return false;
        }
        if (!w0()) {
            u0(i17);
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "onClose, should show voip tip");
        x0(this.f174772n.mo50327x19263085(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.q0(this, i17));
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4
    public void o0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "onDestroy, runtime:%s", java.lang.Integer.valueOf(this.f159700v.hashCode()));
        super.o0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0 v0Var = this.f159701w;
        if (v0Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.k) v0Var).Bi(this.f159702x);
        }
    }

    public final int t0() {
        xf1.i iVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f159700v;
        if (o6Var == null || (iVar = (xf1.i) o6Var.k(xf1.i.class)) == null) {
            return 32;
        }
        boolean z17 = iVar.f535771e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "getCurrentVOIPState, enableMic:%s", java.lang.Boolean.valueOf(z17));
        return z17 ? 32 : 64;
    }

    public final void u0(int i17) {
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        dp1.x xVar = this.f174772n;
        if (((sb0.f) jVar).Ui(xVar.mo50327x19263085())) {
            v0(i17);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.t.a(xVar.mo50327x19263085(), 17, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.s0(this, i17));
        }
    }

    public final void v0(int i17) {
        t().f174623m = f0(i17);
        g();
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.e0.b(this.f174772n, this.f174669h.G(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.t0(this));
    }

    public boolean w0() {
        return u() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().i("has_shown_appbrand_voip_tip", false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void x() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "onEnterPage, runtime:%s", java.lang.Integer.valueOf(this.f159700v.hashCode()));
        if (s() != null) {
            d0(false);
        }
    }

    public void x0(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.v0 v0Var) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
        u1Var.g(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a5l));
        u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.a5m);
        u1Var.l(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.r0(this, v0Var));
        u1Var.q(false);
    }

    public final void y0() {
        if (i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0.class) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11741xcdfabd1f c11741xcdfabd1f = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11741xcdfabd1f();
            c11741xcdfabd1f.f158478d = this.f159700v.f156336n;
            c11741xcdfabd1f.f158479e = 4;
            c11741xcdfabd1f.f158480f = 2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "stopVOIP, appId:%s", this.f159700v.f156336n);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.k) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0.class))).Ai(c11741xcdfabd1f);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void z() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f159700v;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "onExitPage, runtime:%s", java.lang.Integer.valueOf(o6Var.hashCode()));
        if (s() != null) {
            d0(true);
            db5.t7.m123882x26a183b(o6Var.r0(), com.p314xaae8f345.mm.R.C30867xcad56011.a5n, 0).show();
        }
        gp1.v vVar = this.f174669h;
        if (vVar != null) {
            vVar.i(this.f174665d);
        }
    }
}
