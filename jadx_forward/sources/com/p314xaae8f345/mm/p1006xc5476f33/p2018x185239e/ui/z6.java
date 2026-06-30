package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public final class z6 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.z6 f239598a = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.z6();

    public final void a(android.app.Activity activity, java.lang.String str, android.app.Dialog dialog, h45.i iVar) {
        if (dialog != null) {
            dialog.dismiss();
        }
        if (activity.isFinishing() || activity.isDestroyed()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceLqtSaveJumpHandler", "[startKindaUseCase] activity is finishing/destroyed, abort");
            return;
        }
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb.class);
        intent.putExtra("lqt_save_fetch_mode", 1);
        intent.putExtra("operate_id", str);
        intent.putExtra("entrance_type", 2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceLqtSaveJumpHandler", "[startKindaUseCase] start lqt save use case (kinda only)");
        if (((h45.q) i95.n0.c(h45.q.class)).mo24819x8648fb0d(activity, intent, iVar)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceLqtSaveJumpHandler", "[startKindaUseCase] startLqtSaveUseCase not available, start failed");
    }
}
