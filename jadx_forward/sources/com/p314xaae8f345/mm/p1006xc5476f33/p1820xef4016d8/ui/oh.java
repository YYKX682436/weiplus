package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class oh implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ph f228813d;

    public oh(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ph phVar) {
        this.f228813d = phVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ph phVar = this.f228813d;
        if (phVar.f228852d.f227965u2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUIV2", "wait upload out of time");
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd activityC16384xb66222dd = phVar.f228852d;
            activityC16384xb66222dd.f227965u2 = false;
            android.app.Dialog dialog = activityC16384xb66222dd.G1;
            if (dialog != null && dialog.isShowing()) {
                activityC16384xb66222dd.G1.dismiss();
            }
            db5.t7.m(activityC16384xb66222dd.mo55332x76847179(), activityC16384xb66222dd.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.go_));
            activityC16384xb66222dd.f227957q2 = 1;
            activityC16384xb66222dd.f227977y2 = 1;
            activityC16384xb66222dd.q7();
        }
    }
}
