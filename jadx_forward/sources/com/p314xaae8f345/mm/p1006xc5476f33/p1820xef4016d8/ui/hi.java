package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class hi implements qr.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd f228531a;

    public hi(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd activityC16384xb66222dd) {
        this.f228531a = activityC16384xb66222dd;
    }

    @Override // qr.a
    public void a(long j17, boolean z17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd activityC16384xb66222dd = this.f228531a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUIV2", "onResult() mTimeEnter:%s  timeEnter:%s  success:%s  md5:%s", java.lang.Long.valueOf(activityC16384xb66222dd.f227939h2), java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(z17), str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B0(activityC16384xb66222dd.f227939h2, j17)) {
            if (z17) {
                activityC16384xb66222dd.l7(str);
            } else {
                if (activityC16384xb66222dd.J2 == 0) {
                    if (((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.h2) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6.class))).Di(activityC16384xb66222dd.f227939h2)) {
                        activityC16384xb66222dd.J2++;
                        activityC16384xb66222dd.d7(2);
                        return;
                    }
                }
                activityC16384xb66222dd.d7(4);
            }
            activityC16384xb66222dd.p7(true);
            qr.e.f447541a.b(activityC16384xb66222dd.f227939h2, activityC16384xb66222dd.K2);
        }
    }
}
