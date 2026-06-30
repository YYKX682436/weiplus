package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class yh implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd f229275d;

    public yh(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd activityC16384xb66222dd) {
        this.f229275d = activityC16384xb66222dd;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd activityC16384xb66222dd = this.f229275d;
        android.app.Dialog dialog = activityC16384xb66222dd.G1;
        if (dialog != null && dialog.isShowing()) {
            activityC16384xb66222dd.G1.dismiss();
        }
        if (activityC16384xb66222dd.m78513xc2a54588().getVisibility() == 8 || activityC16384xb66222dd.m78513xc2a54588().getVisibility() == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUIV2", "usr cancel, & visibility not visiable, so finish");
            activityC16384xb66222dd.finish();
        }
        activityC16384xb66222dd.m66166xc8398945();
    }
}
