package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui;

/* loaded from: classes9.dex */
public class l implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19031x1cc5b0e9 f260313d;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19031x1cc5b0e9 activityC19031x1cc5b0e9) {
        this.f260313d = activityC19031x1cc5b0e9;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletChangeBankcardUI", "WalletPwdDialog event2 %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19031x1cc5b0e9 activityC19031x1cc5b0e9 = this.f260313d;
        activityC19031x1cc5b0e9.f260203y = true;
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        activityC19031x1cc5b0e9.f260198t = null;
        if (activityC19031x1cc5b0e9.m78513xc2a54588().getVisibility() != 0) {
            activityC19031x1cc5b0e9.m83093xa17dbc8d();
            com.p314xaae8f345.mm.p2802xd031a825.h g17 = com.p314xaae8f345.mm.p2802xd031a825.a.g(activityC19031x1cc5b0e9);
            if (g17 != null) {
                g17.f(activityC19031x1cc5b0e9, activityC19031x1cc5b0e9.m83105x7498fe14());
            } else {
                activityC19031x1cc5b0e9.finish();
            }
        }
        activityC19031x1cc5b0e9.f260201w = null;
    }
}
