package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f;

/* loaded from: classes7.dex */
public class t0 extends nh1.a {

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.Boolean f167523c;

    /* renamed from: b, reason: collision with root package name */
    public com.p292xb816a1e7.p293xb1e6786a.sdk.C2831x7b4b60aa f167524b;

    public t0() {
        super(2);
        this.f167524b = null;
    }

    @Override // nh1.a
    public void a(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, db5.g4 g4Var, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) v5Var;
        if (f167523c == null) {
            try {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(j62.e.g().a("clicfg_fold_appbrand_split_screen", "1", false, true), 1) > 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MenuDelegate_splitScreen", "isOpenSplitScreen!!");
                    f167523c = java.lang.Boolean.TRUE;
                } else {
                    f167523c = java.lang.Boolean.FALSE;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MenuDelegate_splitScreen", e17, "isOpenSplitScreen", new java.lang.Object[0]);
                f167523c = java.lang.Boolean.FALSE;
            }
        }
        if (f167523c.booleanValue()) {
            if (this.f167524b == null) {
                android.content.Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                this.f167524b = new com.p292xb816a1e7.p293xb1e6786a.sdk.C2831x7b4b60aa(applicationContext);
            }
            this.f167524b.m21060x316510(new java.lang.String[]{"magicwindow"});
            if (n7Var.mo32091x9a3f0ba2().u0().k()) {
                return;
            }
            if (com.p314xaae8f345.mm.ui.bk.N(n7Var.v1().getTaskId()) || com.p314xaae8f345.mm.ui.bk.w0()) {
                boolean v07 = com.p314xaae8f345.mm.ui.bk.v0();
                int i17 = this.f418617a;
                if (v07 && com.p314xaae8f345.mm.ui.bk.N(n7Var.v1().getTaskId())) {
                    if (com.p314xaae8f345.mm.ui.bk.z(n7Var.v1().getTaskId())) {
                        g4Var.g(i17, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b9c), com.p314xaae8f345.mm.R.raw.f80164x8f15f9e0);
                    } else {
                        g4Var.g(i17, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jjg), com.p314xaae8f345.mm.R.raw.f80311xadf8c434);
                    }
                }
                if (com.p314xaae8f345.mm.ui.bk.w0() && com.p314xaae8f345.mm.ui.bk.y()) {
                    if (com.p314xaae8f345.mm.ui.fj.b(n7Var.v1())) {
                        g4Var.g(i17, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b9c), com.p314xaae8f345.mm.R.raw.f80164x8f15f9e0);
                    } else {
                        g4Var.g(i17, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jjg), com.p314xaae8f345.mm.R.raw.f80311xadf8c434);
                    }
                }
            }
        }
    }

    @Override // nh1.a
    public void c(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u0 u0Var) {
        android.app.Activity v17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) v5Var).v1();
        if (v17 == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.ee.f(v17.getTaskId(), null);
        if ((v17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a) && com.p314xaae8f345.mm.ui.bk.w0()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a activityC12666xc288131a = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a) v17;
            activityC12666xc288131a.f170955z = true;
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r0.f156776h;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessSuicideLogic", "markActivityRecreateByConfigurationChanged %s", activityC12666xc288131a);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r0.f156777i.f156779e.set(true);
        }
        com.p314xaae8f345.mm.ui.fj.f(v17, false);
    }
}
