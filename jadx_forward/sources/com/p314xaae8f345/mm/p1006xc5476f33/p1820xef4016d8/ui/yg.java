package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class yg implements qr.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16382x78dd3481 f229274a;

    public yg(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16382x78dd3481 activityC16382x78dd3481) {
        this.f229274a = activityC16382x78dd3481;
    }

    @Override // qr.a
    public void a(long j17, boolean z17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16382x78dd3481 activityC16382x78dd3481 = this.f229274a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "onResult() mTimeEnter:%s  timeEnter:%s  success:%s  md5:%s", java.lang.Long.valueOf(activityC16382x78dd3481.f227911p1), java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(z17), str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B0(activityC16382x78dd3481.f227911p1, j17)) {
            if (z17) {
                activityC16382x78dd3481.a7(str);
            } else {
                if (activityC16382x78dd3481.C1 == 0) {
                    if (((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.h2) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6.class))).Di(activityC16382x78dd3481.f227911p1)) {
                        activityC16382x78dd3481.C1++;
                        activityC16382x78dd3481.Y6(3);
                        return;
                    }
                }
                activityC16382x78dd3481.Y6(5);
            }
            activityC16382x78dd3481.c7(true);
            qr.e.f447541a.b(activityC16382x78dd3481.f227911p1, activityC16382x78dd3481.D1);
        }
    }
}
