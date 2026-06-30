package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class ck implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16387x8521db9 f228334d;

    public ck(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16387x8521db9 activityC16387x8521db9) {
        this.f228334d = activityC16387x8521db9;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16387x8521db9 activityC16387x8521db9 = this.f228334d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC16387x8521db9.f228017w;
        if (u3Var != null && u3Var.isShowing()) {
            activityC16387x8521db9.f228017w.dismiss();
        }
        activityC16387x8521db9.m66166xc8398945();
        if (activityC16387x8521db9.m78513xc2a54588().getVisibility() == 8 || activityC16387x8521db9.m78513xc2a54588().getVisibility() == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNotHookReceiveUI", "user cancel & finish");
            activityC16387x8521db9.finish();
        }
    }
}
