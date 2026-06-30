package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class h0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16360x5abdc0d6 f228508d;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16360x5abdc0d6 activityC16360x5abdc0d6) {
        this.f228508d = activityC16360x5abdc0d6;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16360x5abdc0d6 activityC16360x5abdc0d6 = this.f228508d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC16360x5abdc0d6.A;
        if (u3Var != null && u3Var.isShowing()) {
            activityC16360x5abdc0d6.A.dismiss();
        }
        activityC16360x5abdc0d6.m66166xc8398945();
        if (activityC16360x5abdc0d6.m78513xc2a54588().getVisibility() == 8 || activityC16360x5abdc0d6.m78513xc2a54588().getVisibility() == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyBusiReceiveUI", "user cancel & finish");
            activityC16360x5abdc0d6.finish();
        }
    }
}
