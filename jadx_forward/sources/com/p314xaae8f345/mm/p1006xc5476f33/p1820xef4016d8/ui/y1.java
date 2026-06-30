package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class y1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d f229244d;

    public y1(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d) {
        this.f229244d = activityC16363x8a0a619d;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d = this.f229244d;
        android.app.Dialog dialog = activityC16363x8a0a619d.P;
        if (dialog != null && dialog.isShowing()) {
            activityC16363x8a0a619d.P.dismiss();
        }
        activityC16363x8a0a619d.m66166xc8398945();
        wb3.a aVar = activityC16363x8a0a619d.f227599h3;
        if (aVar != null) {
            aVar.j();
        }
        if (activityC16363x8a0a619d.m78513xc2a54588().getVisibility() == 8 || activityC16363x8a0a619d.m78513xc2a54588().getVisibility() == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyDetailUI", "user cancel & finish");
            activityC16363x8a0a619d.finish();
        }
    }
}
