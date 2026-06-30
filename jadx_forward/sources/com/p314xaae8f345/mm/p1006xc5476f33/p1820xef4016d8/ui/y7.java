package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class y7 implements com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f229256a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.e1 f229257b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d f229258c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f229259d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f229260e;

    public y7(android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.e1 e1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d, android.app.Dialog dialog, java.lang.String str) {
        this.f229256a = activity;
        this.f229257b = e1Var;
        this.f229258c = activityC16371xf216ae6d;
        this.f229259d = dialog;
        this.f229260e = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.d1
    /* renamed from: call */
    public void mo66253x2e7a5e(java.lang.Object obj) {
        r45.zg5 zg5Var = (r45.zg5) obj;
        if (zg5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "[fetchLqtDetail] failed");
            return;
        }
        android.app.Activity activity = this.f229256a;
        if (activity.isFinishing() || activity.isDestroyed()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "[fetchLqtDetail] this activity has finished");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "[fetchLqtDetail] success, account_type: %s, is_hide_close_account_btn: %s", java.lang.Integer.valueOf(zg5Var.C), java.lang.Boolean.valueOf(zg5Var.B));
        this.f229257b.f259160a.f259291e.b(zg5Var.C, 6);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = vr4.f1.wi().Ai().f95532h;
        java.lang.String str = this.f229260e;
        android.app.Dialog dialog = this.f229259d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d = this.f229258c;
        if (c19091x9511676c != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d.Y6(activityC16371xf216ae6d, zg5Var, dialog, str);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "[fetchLqtDetail] publish WalletGetUserInfoEvent");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6243x5c461184 c6243x5c461184 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6243x5c461184();
        am.l10 l10Var = c6243x5c461184.f136491g;
        if (l10Var != null) {
            l10Var.f88748a = 1;
        }
        if (l10Var != null) {
            l10Var.f88749b = true;
        }
        if (l10Var != null) {
            l10Var.f88750c = true;
        }
        am.m10 m10Var = c6243x5c461184.f136492h;
        if (m10Var != null) {
            m10Var.f88825a = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.x7(activityC16371xf216ae6d, zg5Var, dialog, str);
        }
        android.os.Looper myLooper = android.os.Looper.myLooper();
        if (myLooper != null) {
            c6243x5c461184.b(myLooper);
        }
    }
}
