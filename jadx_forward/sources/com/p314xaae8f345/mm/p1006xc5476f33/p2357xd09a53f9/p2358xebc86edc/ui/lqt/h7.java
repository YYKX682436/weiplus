package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes9.dex */
public class h7 implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb.AnonymousClass42 f259732d;

    public h7(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb.AnonymousClass42 anonymousClass42) {
        this.f259732d = anonymousClass42;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.y) obj;
        long longValue = ((java.lang.Long) obj2).longValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb activityC19020x7623dbfb = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb.this;
        long j17 = activityC19020x7623dbfb.E1;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (longValue != j17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletLqtSaveFetchUI", "unexpected halfpage callback");
        } else {
            activityC19020x7623dbfb.E1 = 0L;
            if (yVar == com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.y.f262533f) {
                activityC19020x7623dbfb.f259586e.a();
            } else if (yVar == com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.y.f262534g) {
                activityC19020x7623dbfb.finish();
            }
        }
        return f0Var;
    }
}
