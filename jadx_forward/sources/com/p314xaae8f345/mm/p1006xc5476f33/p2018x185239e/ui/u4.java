package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public class u4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.z0 f239504a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f239505b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f239506c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17133x39d21883 f239507d;

    public u4(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17133x39d21883 activityC17133x39d21883, com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.z0 z0Var, android.app.Dialog dialog, java.lang.String str) {
        this.f239507d = activityC17133x39d21883;
        this.f239504a = z0Var;
        this.f239505b = dialog;
        this.f239506c = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.zg5 zg5Var = (r45.zg5) obj;
        if (zg5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceDetailUI", "fetch detail failed");
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceDetailUI", "fetch detail success, account_type: %s, is_hide_close_account_btn: %s", java.lang.Integer.valueOf(zg5Var.C), java.lang.Boolean.valueOf(zg5Var.B));
        this.f239504a.f259291e.b(zg5Var.C, 2);
        if (vr4.f1.wi().Ai().f95532h != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17133x39d21883.X6(this.f239507d, zg5Var, this.f239505b, this.f239506c);
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceDetailUI", "publish WalletGetUserInfoEvent");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6243x5c461184 c6243x5c461184 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6243x5c461184();
        am.l10 l10Var = c6243x5c461184.f136491g;
        l10Var.f88748a = 1;
        l10Var.f88749b = true;
        l10Var.f88750c = true;
        c6243x5c461184.f136492h.f88825a = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.t4(this, zg5Var);
        c6243x5c461184.b(android.os.Looper.myLooper());
        return null;
    }
}
