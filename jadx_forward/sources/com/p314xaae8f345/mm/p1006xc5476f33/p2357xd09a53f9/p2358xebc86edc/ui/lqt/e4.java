package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes9.dex */
public class e4 implements com.p314xaae8f345.mm.p2802xd031a825.ui.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19014x45f83936 f259690a;

    public e4(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19014x45f83936 activityC19014x45f83936) {
        this.f259690a = activityC19014x45f83936;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.m
    /* renamed from: onVisibleStateChange */
    public void mo26891xca4e600e(boolean z17) {
        com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf3223;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtPlanAddUI", "onVisibleStateChange() visitable:%s", java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19014x45f83936 activityC19014x45f83936 = this.f259690a;
        if (activityC19014x45f83936.f259531w.n()) {
            return;
        }
        c22894x55bf3223 = ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) activityC19014x45f83936).f39912xe2ad5320;
        c22894x55bf3223.post(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.d4(this, z17));
    }
}
