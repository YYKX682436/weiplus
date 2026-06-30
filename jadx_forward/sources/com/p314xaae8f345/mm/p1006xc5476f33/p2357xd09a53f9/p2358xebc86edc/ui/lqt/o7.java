package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes9.dex */
public class o7 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f259841a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb f259842b;

    public o7(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb activityC19020x7623dbfb, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var) {
        this.f259842b = activityC19020x7623dbfb;
        this.f259841a = z2Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
    public void a() {
        r45.kd kdVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtSaveFetchUI", "click fetch");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb.R1;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb activityC19020x7623dbfb = this.f259842b;
        activityC19020x7623dbfb.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtSaveFetchUI", "beginSlowRedeemProcess()");
        int i76 = activityC19020x7623dbfb.i7(activityC19020x7623dbfb.f259589h.m83183xfb85ada3(), "100");
        if (i76 > 0) {
            activityC19020x7623dbfb.mo73823x964575a5();
            if (activityC19020x7623dbfb.S == 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtSaveFetchUI", "click fetch lqt");
                if (!activityC19020x7623dbfb.q7(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.l0.f259202q.f259217m)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = activityC19020x7623dbfb.U;
                    if (c19091x9511676c == null || c19091x9511676c.v0()) {
                        kdVar = null;
                    } else {
                        kdVar = new r45.kd();
                        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c2 = activityC19020x7623dbfb.U;
                        kdVar.f460129f = c19091x9511676c2.f69217xaef0808c;
                        kdVar.f460128e = c19091x9511676c2.f69223x58802fcb;
                        kdVar.f460127d = c19091x9511676c2.f69225xed6d60f6;
                        kdVar.f460130g = c19091x9511676c2.f69222x587fd4e1;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.x2 x2Var = activityC19020x7623dbfb.f259587f.f259153c;
                    int i18 = activityC19020x7623dbfb.Z;
                    x2Var.getClass();
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(i76);
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
                    km5.q qVar = new km5.q();
                    qVar.y(valueOf, valueOf2, 1, kdVar);
                    qVar.n(x2Var);
                    ((km5.q) qVar.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.u7(activityC19020x7623dbfb, i76))).s(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.t7(activityC19020x7623dbfb));
                }
            }
        }
        this.f259841a.B();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(20287, 6);
    }
}
