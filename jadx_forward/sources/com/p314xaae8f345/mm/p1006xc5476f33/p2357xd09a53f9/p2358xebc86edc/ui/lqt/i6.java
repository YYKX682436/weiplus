package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes9.dex */
public class i6 implements com.p314xaae8f345.mm.p2802xd031a825.ui.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb f259743a;

    public i6(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb activityC19020x7623dbfb) {
        this.f259743a = activityC19020x7623dbfb;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.m
    /* renamed from: onVisibleStateChange */
    public void mo26891xca4e600e(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb activityC19020x7623dbfb = this.f259743a;
        if (z17) {
            if (activityC19020x7623dbfb.S == 2) {
                activityC19020x7623dbfb.H.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.v6(activityC19020x7623dbfb), 100L);
            }
        } else {
            activityC19020x7623dbfb.H.scrollTo(0, 0);
            if (activityC19020x7623dbfb.S == 2 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC19020x7623dbfb.f259589h.m83183xfb85ada3())) {
                activityC19020x7623dbfb.G.removeAllViews();
            }
        }
    }
}
