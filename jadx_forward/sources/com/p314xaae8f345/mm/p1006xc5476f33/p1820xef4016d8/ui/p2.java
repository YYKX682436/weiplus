package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class p2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.z0 f228833a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f228834b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f228835c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d f228836d;

    public p2(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d, com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.z0 z0Var, android.app.Dialog dialog, java.lang.String str) {
        this.f228836d = activityC16363x8a0a619d;
        this.f228833a = z0Var;
        this.f228834b = dialog;
        this.f228835c = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.zg5 zg5Var = (r45.zg5) obj;
        if (zg5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyDetailUI", "fetch detail failed");
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyDetailUI", "fetch detail success, account_type: %s, is_hide_close_account_btn: %s", java.lang.Integer.valueOf(zg5Var.C), java.lang.Boolean.valueOf(zg5Var.B));
        this.f228833a.f259291e.b(zg5Var.C, 6);
        if (vr4.f1.wi().Ai().f95532h != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d.Y6(this.f228836d, zg5Var, this.f228834b, this.f228835c);
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyDetailUI", "publish WalletGetUserInfoEvent");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6243x5c461184 c6243x5c461184 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6243x5c461184();
        am.l10 l10Var = c6243x5c461184.f136491g;
        l10Var.f88748a = 1;
        l10Var.f88749b = true;
        l10Var.f88750c = true;
        c6243x5c461184.f136492h.f88825a = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.o2(this, zg5Var);
        c6243x5c461184.b(android.os.Looper.myLooper());
        return null;
    }
}
