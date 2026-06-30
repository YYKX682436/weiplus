package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class ef implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16377xf00b6def f228407d;

    public ef(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16377xf00b6def activityC16377xf00b6def) {
        this.f228407d = activityC16377xf00b6def;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16377xf00b6def activityC16377xf00b6def = this.f228407d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = activityC16377xf00b6def.f227847x;
        if ((u3Var2 != null && u3Var2.isShowing()) && (u3Var = activityC16377xf00b6def.f227847x) != null) {
            u3Var.dismiss();
        }
        activityC16377xf00b6def.m66166xc8398945();
        android.view.View m78513xc2a54588 = activityC16377xf00b6def.m78513xc2a54588();
        if (!(m78513xc2a54588 != null && m78513xc2a54588.getVisibility() == 8)) {
            android.view.View m78513xc2a545882 = activityC16377xf00b6def.m78513xc2a54588();
            if (!(m78513xc2a545882 != null && m78513xc2a545882.getVisibility() == 4)) {
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewReceiveUI", "[showLoading] user cancel & finish");
        activityC16377xf00b6def.finish();
    }
}
