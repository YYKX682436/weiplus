package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class pg implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16380x9ede44e f228851d;

    public pg(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16380x9ede44e activityC16380x9ede44e) {
        this.f228851d = activityC16380x9ede44e;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16380x9ede44e activityC16380x9ede44e = this.f228851d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.l6 l6Var = activityC16380x9ede44e.R1;
        if (l6Var == null || l6Var.f226959s == 5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "mReceiveScene is null or expired, no neet play");
        } else if (activityC16380x9ede44e.N1) {
            int i17 = activityC16380x9ede44e.M1;
            if (i17 == 4) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "afterDownloadPlay download voice fail, tip retry");
                activityC16380x9ede44e.N1 = false;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC16380x9ede44e.A;
                if (u3Var != null && u3Var.isShowing()) {
                    activityC16380x9ede44e.A.dismiss();
                }
                db5.t7.m(activityC16380x9ede44e.mo55332x76847179(), activityC16380x9ede44e.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573952gk4));
            } else if (i17 == 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "afterUploadDoSend upload voice success, now doSend");
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16380x9ede44e.V6(activityC16380x9ede44e);
            }
        }
        if (activityC16380x9ede44e.M1 == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "download voice fail, tip retry");
        }
    }
}
