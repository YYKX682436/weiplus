package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui;

/* loaded from: classes9.dex */
public class v1 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19003x7959c734 f260053d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19003x7959c734 activityC19003x7959c734) {
        super(false);
        this.f260053d = activityC19003x7959c734;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.u0 u0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19003x7959c734 activityC19003x7959c734 = this.f260053d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceSaveUI", "click lqt entrance: %s", java.lang.Boolean.valueOf(activityC19003x7959c734.f259375r.f493631c));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.d(17084, 5);
        ss4.m0 m0Var = activityC19003x7959c734.f259375r;
        if (m0Var.f493631c) {
            activityC19003x7959c734.mo73823x964575a5();
            activityC19003x7959c734.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.z0 z0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.z0) new em5.i().a(activityC19003x7959c734, com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.z0.class);
            android.app.Dialog e17 = com.p314xaae8f345.mm.p2802xd031a825.ui.b2.e(activityC19003x7959c734, false, false, null);
            if (z0Var == null || (u0Var = z0Var.f259288b) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceSaveUI", "fetchDetail() interactorGlueApi == null || interactorGlueApi.fetchLqtDetail == null");
                return;
            } else {
                ((km5.q) u0Var.b().h(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.y1(activityC19003x7959c734, z0Var, e17))).s(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.w1(activityC19003x7959c734, e17));
                return;
            }
        }
        if (m0Var.f493632d != null) {
            g0Var.d(17084, 6);
            ss4.l0 l0Var = activityC19003x7959c734.f259375r.f493632d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceSaveUI", "show open lqt alert");
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC19003x7959c734.mo55332x76847179();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
            aVar.f293262s = l0Var.f493621a;
            aVar.f293266w = of5.b.a(mo55332x76847179).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575101kr4);
            aVar.f293265v = of5.b.a(mo55332x76847179).getString(com.p314xaae8f345.mm.R.C30867xcad56011.kpr);
            aVar.E = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.z1(activityC19003x7959c734, l0Var);
            aVar.Z = true;
            aVar.F = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.a2(activityC19003x7959c734);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(mo55332x76847179, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
            j0Var.e(aVar);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
            if (d0Var != null) {
                d0Var.a(j0Var.f293370r);
            }
            j0Var.show();
        }
    }
}
