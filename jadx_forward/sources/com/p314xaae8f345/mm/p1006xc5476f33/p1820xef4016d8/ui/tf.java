package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class tf implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16380x9ede44e f228993d;

    public tf(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16380x9ede44e activityC16380x9ede44e) {
        this.f228993d = activityC16380x9ede44e;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16380x9ede44e activityC16380x9ede44e = this.f228993d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC16380x9ede44e.A;
        if (u3Var != null && u3Var.isShowing()) {
            activityC16380x9ede44e.A.dismiss();
        }
        activityC16380x9ede44e.m66166xc8398945();
        if (activityC16380x9ede44e.m78513xc2a54588().getVisibility() == 8 || activityC16380x9ede44e.m78513xc2a54588().getVisibility() == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "usr cancel, & visibility not visiable, so finish");
            activityC16380x9ede44e.finish();
        }
    }
}
