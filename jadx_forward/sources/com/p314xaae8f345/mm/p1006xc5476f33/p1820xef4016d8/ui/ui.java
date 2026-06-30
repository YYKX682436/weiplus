package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class ui implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd f229038d;

    public ui(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd activityC16384xb66222dd) {
        this.f229038d = activityC16384xb66222dd;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd activityC16384xb66222dd = this.f229038d;
        if (activityC16384xb66222dd.f227965u2) {
            int i17 = activityC16384xb66222dd.f227957q2;
            if (i17 == 4) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUIV2", "afterUploadDoSend upload voice fail, tip retry");
                activityC16384xb66222dd.f227965u2 = false;
                android.app.Dialog dialog = activityC16384xb66222dd.G1;
                if (dialog != null && dialog.isShowing()) {
                    activityC16384xb66222dd.G1.dismiss();
                }
            } else if (i17 == 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUIV2", "afterUploadDoSend upload voice success, now doSend");
                activityC16384xb66222dd.f227965u2 = false;
                activityC16384xb66222dd.a7(0);
            }
        }
        if (activityC16384xb66222dd.f227957q2 == 4) {
            db5.t7.m(activityC16384xb66222dd.mo55332x76847179(), activityC16384xb66222dd.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.go_));
            activityC16384xb66222dd.f227977y2 = 1;
            activityC16384xb66222dd.q7();
        }
    }
}
