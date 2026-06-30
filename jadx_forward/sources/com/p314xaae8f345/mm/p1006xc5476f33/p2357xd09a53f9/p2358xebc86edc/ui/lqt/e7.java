package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes9.dex */
public class e7 implements com.p314xaae8f345.mm.p2802xd031a825.ui.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f259693a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.c70 f259694b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.g0 f259695c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.g0 f259696d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f259697e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb f259698f;

    public e7(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb activityC19020x7623dbfb, int i17, r45.c70 c70Var, com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.g0 g0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.g0 g0Var2, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var) {
        this.f259698f = activityC19020x7623dbfb;
        this.f259693a = i17;
        this.f259694b = c70Var;
        this.f259695c = g0Var;
        this.f259696d = g0Var2;
        this.f259697e = z2Var;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z
    /* renamed from: onClick */
    public void mo48650xaf6b9ae9(android.view.View view) {
        int i17 = this.f259693a;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        r45.c70 c70Var = this.f259694b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtSaveFetchUI", "showCommonPromptText, scene: %s, promptInfo.jump_type: %s", valueOf, java.lang.Integer.valueOf(c70Var.f452878f));
        if (i17 >= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(20287, java.lang.Integer.valueOf(i17));
        }
        int i18 = c70Var.f452878f;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb activityC19020x7623dbfb = this.f259698f;
        if (i18 != 1) {
            if (i18 == 2) {
                com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(activityC19020x7623dbfb.mo55332x76847179(), c70Var.f452879g, true);
                return;
            } else {
                if (i18 != 3) {
                    return;
                }
                com.p314xaae8f345.mm.p2802xd031a825.ui.r1.b0(c70Var.f452880h, c70Var.f452879g, 0, 1000);
                return;
            }
        }
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb.R1;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.g0 g0Var = this.f259695c;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.g0 g0Var2 = this.f259696d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 o76 = activityC19020x7623dbfb.o7(g0Var, g0Var2, null);
        activityC19020x7623dbfb.b7(o76, g0Var2);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = this.f259697e;
        if (z2Var != null) {
            z2Var.B();
        }
        if (o76 == null || o76.h()) {
            return;
        }
        o76.C();
    }
}
