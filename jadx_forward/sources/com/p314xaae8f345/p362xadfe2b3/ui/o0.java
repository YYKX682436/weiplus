package com.p314xaae8f345.p362xadfe2b3.ui;

/* loaded from: classes15.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageInfo f127742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133 f127743e;

    public o0(com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133 activityC3721x69b5f133, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageInfo pageInfo) {
        this.f127743e = activityC3721x69b5f133;
        this.f127742d = pageInfo;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageInfo pageInfo = this.f127742d;
        int i17 = pageInfo.f37288x5cfee87;
        com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133 activityC3721x69b5f133 = this.f127743e;
        activityC3721x69b5f133.mo28586x52fbaf45(i17);
        activityC3721x69b5f133.mo28590xdaac6ff(pageInfo.f37291xf2725bc1);
        if (pageInfo.f37283x58b7f1c.equals(activityC3721x69b5f133.f127628w)) {
            return;
        }
        activityC3721x69b5f133.S6(false, true);
    }
}
