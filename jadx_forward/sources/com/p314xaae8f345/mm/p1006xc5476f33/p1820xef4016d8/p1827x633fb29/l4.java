package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public final class l4 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.l4 f226949a = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.l4();

    public static final void a(android.app.Activity activity, java.lang.String str) {
        if (activity == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LuckyMoneyLqtSaveJumpHandler", "[jumpToLqtSaveKinda] activity is null, ignore");
            return;
        }
        at4.x1 Ai = vr4.f1.wi().Ai();
        if ((Ai != null ? Ai.f95532h : null) != null) {
            f226949a.b(activity, str, null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyLqtSaveJumpHandler", "[jumpToLqtSaveKinda] balance is null, publish WalletGetUserInfoEvent first");
        android.app.Dialog e17 = com.p314xaae8f345.mm.p2802xd031a825.ui.b2.e(activity, false, false, null);
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
            m10Var.f88825a = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.j4(activity, str, e17);
        }
        android.os.Looper myLooper = android.os.Looper.myLooper();
        if (myLooper != null) {
            c6243x5c461184.b(myLooper);
        }
    }

    public final void b(android.app.Activity activity, java.lang.String str, android.app.Dialog dialog) {
        if (dialog != null) {
            dialog.dismiss();
        }
        if (activity.isFinishing() || activity.isDestroyed()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyLqtSaveJumpHandler", "[startKindaUseCase] activity is finishing/destroyed, abort");
            return;
        }
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb.class);
        intent.putExtra("lqt_save_fetch_mode", 1);
        intent.putExtra("operate_id", str);
        intent.putExtra("entrance_type", 6);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyLqtSaveJumpHandler", "[startKindaUseCase] start lqt save use case (kinda only)");
        if (((h45.q) i95.n0.c(h45.q.class)).mo24819x8648fb0d(activity, intent, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.k4.f226928a)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyLqtSaveJumpHandler", "[startKindaUseCase] startLqtSaveUseCase not available, start failed");
    }
}
