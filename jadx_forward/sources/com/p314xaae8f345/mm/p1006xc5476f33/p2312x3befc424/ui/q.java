package com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui;

/* loaded from: classes11.dex */
public class q implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.ActivityC18771x75e3b580 f256867d;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.ActivityC18771x75e3b580 activityC18771x75e3b580) {
        this.f256867d = activityC18771x75e3b580;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.ActivityC18771x75e3b580 activityC18771x75e3b580 = this.f256867d;
        int i17 = activityC18771x75e3b580.f256844d + 1;
        activityC18771x75e3b580.f256845e = i17;
        activityC18771x75e3b580.f256844d = i17;
        if (i17 < 100) {
            activityC18771x75e3b580.f256847g.m79071x3ae760af(i17);
            return true;
        }
        activityC18771x75e3b580.f256847g.m79071x3ae760af(100);
        return false;
    }
}
