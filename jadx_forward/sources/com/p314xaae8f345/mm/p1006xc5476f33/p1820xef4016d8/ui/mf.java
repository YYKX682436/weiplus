package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class mf implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16379x3e9c9e32 f228720d;

    public mf(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16379x3e9c9e32 activityC16379x3e9c9e32) {
        this.f228720d = activityC16379x3e9c9e32;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16379x3e9c9e32 activityC16379x3e9c9e32 = this.f228720d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC16379x3e9c9e32.f227872z;
        if (u3Var != null && u3Var.isShowing()) {
            activityC16379x3e9c9e32.f227872z.dismiss();
        }
        activityC16379x3e9c9e32.m66166xc8398945();
        if (activityC16379x3e9c9e32.m78513xc2a54588().getVisibility() == 8 || activityC16379x3e9c9e32.m78513xc2a54588().getVisibility() == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "usr cancel, & visibility not visiable, so finish");
            activityC16379x3e9c9e32.finish();
        }
    }
}
