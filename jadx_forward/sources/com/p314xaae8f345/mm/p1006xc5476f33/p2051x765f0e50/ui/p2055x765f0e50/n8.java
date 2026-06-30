package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public final class n8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p8 f242884d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f242885e;

    public n8(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p8 p8Var, int i17) {
        this.f242884d = p8Var;
        this.f242885e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f17;
        int i17;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var = this.f242884d.f242960d;
        if (f4Var == null) {
            return;
        }
        if (f4Var != null) {
            f4Var.dismiss();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p8 p8Var = this.f242884d;
        p8Var.f242960d = null;
        if (this.f242885e != 0) {
            db5.t7.g(p8Var.m80379x76847179(), this.f242884d.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.awc));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsCareModeCloseUIC", "onSceneEnd update care mode succeed!, isOpenCare:%s", java.lang.Boolean.valueOf(p8Var.f242962f));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).putBoolean("caremode_setting_succeed", true);
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_CARE_MODE_STATE_BOOLEAN_SYNC, java.lang.Boolean.valueOf(this.f242884d.f242962f));
        j65.e.n(false);
        if (j65.e.g()) {
            if (this.f242884d.f242962f) {
                ((vd0.d2) ((wd0.m1) i95.n0.c(wd0.m1.class))).Ni();
            } else {
                ((vd0.d2) ((wd0.m1) i95.n0.c(wd0.m1.class))).Ai(true);
                ((vd0.d2) ((wd0.m1) i95.n0.c(wd0.m1.class))).Ui();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p8 p8Var2 = this.f242884d;
        boolean z17 = !p8Var2.f242962f;
        int b17 = f14.e.b(p8Var2.m80379x76847179());
        float n17 = i65.a.n(p8Var2.m80379x76847179());
        if (j65.e.e()) {
            f17 = 1.4f;
            i17 = 5;
        } else {
            i17 = b17;
            f17 = n17;
        }
        if (z17) {
            b17 = j65.c.e(p8Var2.m80379x76847179());
            n17 = j65.c.c(p8Var2.m80379x76847179());
            j65.e.j(0);
        } else if (b17 < i17) {
            j65.e.j(5);
            n17 = f17;
            b17 = i17;
        } else {
            j65.e.j(0);
        }
        f14.e.d(p8Var2.m80379x76847179(), n17, b17);
        j65.f.k(f14.e.c(b17));
        gm0.j1.u().c().i(true);
        ku5.u0 u0Var = ku5.t0.f394148d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.o8 o8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.o8(p8Var2);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(o8Var, 200L, false);
    }
}
