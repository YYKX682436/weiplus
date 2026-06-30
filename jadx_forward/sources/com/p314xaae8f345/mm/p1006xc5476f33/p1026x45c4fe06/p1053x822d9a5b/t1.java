package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b;

/* loaded from: classes7.dex */
public class t1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.h0 {

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f159676v;

    /* renamed from: w, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0 f159677w;

    /* renamed from: x, reason: collision with root package name */
    public final android.os.Handler f159678x;

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.u0 f159679y;

    public t1(dp1.x xVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var) {
        super(xVar);
        this.f159679y = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.r1(this);
        this.f159676v = o6Var;
        o6Var.l(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "create, runtime:%s", java.lang.Integer.valueOf(o6Var.hashCode()));
        this.f159677w = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0.class);
        this.f159678x = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void H() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "onReceivedBallInfoRemovedEvent, runtime:%s", java.lang.Integer.valueOf(this.f159676v.hashCode()));
        n0();
        x0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void I() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "onReceivedFinishWhenSwitchBallEvent, runtime:%s", java.lang.Integer.valueOf(this.f159676v.hashCode()));
        this.f174772n.q(true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d, gp1.r
    public void b(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "onCreate, type:%s, key:%s", java.lang.Integer.valueOf(i17), str);
        super.b(i17, str);
        Q(2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0 v0Var = this.f159677w;
        if (v0Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.k) v0Var).wi(this.f159679y);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4
    public boolean m0(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "onClose, runtime:%s", java.lang.Integer.valueOf(this.f159676v.hashCode()));
        if (u()) {
            if (u() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().i("has_shown_appbrand_voip_1v1_tip", false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "onClose, should show voip tip");
                w0(this.f174772n.mo50327x19263085(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.l1(this, i17));
            } else {
                u0(i17);
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4
    public void o0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "onDestroy, runtime:%s", java.lang.Integer.valueOf(this.f159676v.hashCode()));
        super.o0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0 v0Var = this.f159677w;
        if (v0Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.k) v0Var).Bi(this.f159679y);
        }
    }

    public final int t0() {
        boolean z17;
        if (this.f159676v == null) {
            return 32;
        }
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0 p0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0.INSTANCE;
        if (p0Var.f177557o == com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.r2.InRoom) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.o oVar = p0Var.f177551g;
            z17 = oVar.f177503b == null ? true : oVar.f177513l;
        } else {
            z17 = false;
        }
        boolean z18 = !z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "getCurrentVOIPState, enableMic:%s", java.lang.Boolean.valueOf(z18));
        return z18 ? 32 : 64;
    }

    public final void u0(int i17) {
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        dp1.x xVar = this.f174772n;
        if (((sb0.f) jVar).Ui(xVar.mo50327x19263085())) {
            v0(i17);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.t.a(xVar.mo50327x19263085(), 19, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.n1(this, i17));
        }
    }

    public final void v0(int i17) {
        t().f174623m = f0(i17);
        g();
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.e0.b(this.f174772n, this.f174669h.G(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.o1(this));
    }

    public void w0(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.s1 s1Var) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
        u1Var.g(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a5l));
        u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.a5m);
        u1Var.l(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.m1(this, s1Var));
        u1Var.q(false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void x() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "onEnterPage, runtime:%s", java.lang.Integer.valueOf(this.f159676v.hashCode()));
        if (s() != null) {
            d0(false);
        }
    }

    public final void x0() {
        if (i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0.class) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11741xcdfabd1f c11741xcdfabd1f = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11741xcdfabd1f();
            c11741xcdfabd1f.f158478d = this.f159676v.f156336n;
            c11741xcdfabd1f.f158479e = 16;
            c11741xcdfabd1f.f158480f = 2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "stopVOIP, appId:%s", this.f159676v.f156336n);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.k) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0.class))).Ai(c11741xcdfabd1f);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void z() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f159676v;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "onExitPage, runtime:%s", java.lang.Integer.valueOf(o6Var.hashCode()));
        if (s() != null) {
            d0(true);
            db5.t7.m123882x26a183b(o6Var.r0(), com.p314xaae8f345.mm.R.C30867xcad56011.a5n, 0).show();
        }
        gp1.v vVar = this.f174669h;
        if (vVar != null) {
            vVar.i(this.f174665d);
        }
        s75.d.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.q1(this), "");
    }
}
