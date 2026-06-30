package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class fh implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16382x78dd3481 f228443d;

    public fh(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16382x78dd3481 activityC16382x78dd3481) {
        this.f228443d = activityC16382x78dd3481;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16382x78dd3481 activityC16382x78dd3481 = this.f228443d;
        android.app.Dialog dialog = activityC16382x78dd3481.F;
        if (dialog != null && dialog.isShowing()) {
            activityC16382x78dd3481.F.dismiss();
        }
        if (activityC16382x78dd3481.m78513xc2a54588().getVisibility() == 8 || activityC16382x78dd3481.m78513xc2a54588().getVisibility() == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "usr cancel, & visibility not visiable, so finish");
            activityC16382x78dd3481.finish();
        }
        activityC16382x78dd3481.m66166xc8398945();
    }
}
