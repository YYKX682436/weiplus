package com.p314xaae8f345.p362xadfe2b3.ui;

/* loaded from: classes15.dex */
public class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageInfo f127692d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7 f127693e;

    public g1(com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7 activityC3722x408816c7, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageInfo pageInfo) {
        this.f127693e = activityC3722x408816c7;
        this.f127692d = pageInfo;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageInfo pageInfo = this.f127692d;
        int i17 = pageInfo.f37288x5cfee87;
        com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7 activityC3722x408816c7 = this.f127693e;
        activityC3722x408816c7.mo28586x52fbaf45(i17);
        activityC3722x408816c7.mo28590xdaac6ff(pageInfo.f37291xf2725bc1);
        if (pageInfo.f37283x58b7f1c.equals(activityC3722x408816c7.f127647x)) {
            return;
        }
        activityC3722x408816c7.c7(false, true);
    }
}
