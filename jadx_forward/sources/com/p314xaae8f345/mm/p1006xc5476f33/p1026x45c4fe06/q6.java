package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class q6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f169267d;

    public q6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var) {
        this.f169267d = o6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        boolean z17;
        rh1.j jVar = this.f169267d.f167727z2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0 w0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0.CLOSE;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0 w0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0.BACK;
        boolean z18 = true;
        boolean z19 = false;
        if (jVar != null) {
            if (jVar.f477168b == null) {
                z17 = false;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMultiTaskLogic", "close, runtime:%s", jVar.f477168b.f156336n);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d5 x07 = jVar.f477168b.x0();
                if (!rh1.b.f477157a || x07 == null || x07.m52169xfdaa7672() == null || !x07.m52169xfdaa7672().R) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0 d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.d(jVar.f477168b.f156336n);
                    i17 = d17 == w0Var2 ? 2 : d17 == w0Var ? 1 : 0;
                } else {
                    i17 = 3;
                }
                z17 = jVar.f477169c != null && jVar.f477169c.U(i17, true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMultiTaskLogic", "close, result:%s", java.lang.Boolean.valueOf(z17));
            }
            if (z17) {
                return;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.u uVar = this.f169267d.f167726y2;
        if (uVar != null) {
            uVar.c(null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = uVar.f159680a;
            if (uVar.f159691l) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandFloatBallLogic", "close, runtime:%s", o6Var.f156336n);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0 d18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.d(o6Var.f156336n);
                int i18 = d18 != w0Var2 ? d18 == w0Var ? 1 : 0 : 2;
                boolean z27 = uVar.f159685f != null && uVar.f159685f.w0();
                if (uVar.f159686g != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.t1 t1Var = uVar.f159686g;
                    t1Var.getClass();
                    if (t1Var.u() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().i("has_shown_appbrand_voip_1v1_tip", false)) {
                        z19 = true;
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandFloatBallLogic", "close, voip:%s, voip1v1:%s", java.lang.Boolean.valueOf(z27), java.lang.Boolean.valueOf(z19));
                if (z27) {
                    uVar.f159685f.x0(o6Var.r0(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.c0(uVar, i18));
                } else if (z19) {
                    uVar.f159686g.w0(o6Var.r0(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.d0(uVar, i18));
                } else {
                    z18 = uVar.a(i18);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandFloatBallLogic", "close, result:%s", java.lang.Boolean.valueOf(z18));
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandFloatBallLogic", "close, not init, runtime:%s, stack:%s", o6Var.f156336n, android.util.Log.getStackTraceString(new java.lang.Throwable()));
                z18 = false;
            }
            if (z18) {
                return;
            }
        }
        this.f169267d.G2();
    }
}
