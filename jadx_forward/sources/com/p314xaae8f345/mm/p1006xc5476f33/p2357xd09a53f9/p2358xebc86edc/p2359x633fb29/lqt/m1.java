package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt;

/* loaded from: classes9.dex */
public class m1 {

    /* renamed from: b, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.m1 f259224b;

    /* renamed from: a, reason: collision with root package name */
    public r45.ry4 f259225a;

    public static com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.m1 b() {
        if (f259224b == null) {
            f259224b = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.m1();
        }
        return f259224b;
    }

    public r45.ry4 a() {
        if (this.f259225a == null) {
            java.lang.String str = (java.lang.String) ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().i(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LQT_REDEEM_CACHE_STRING_SYNC, "");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                try {
                    this.f259225a = (r45.ry4) new r45.ry4().mo11468x92b714fd(str.getBytes(r26.c.f450400c));
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LqtOnClickRedeemCache", e17, "", new java.lang.Object[0]);
                }
            }
        }
        return this.f259225a;
    }

    public void c(r45.ry4 ry4Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LqtOnClickRedeemCache", "setCache OnClickRedeemRes balance %s, bank_balance %s, lq_balance %s", java.lang.Integer.valueOf(ry4Var.f466819f), java.lang.Integer.valueOf(ry4Var.f466821h), java.lang.Integer.valueOf(ry4Var.f466820g));
        this.f259225a = ry4Var;
        try {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LQT_REDEEM_CACHE_STRING_SYNC, new java.lang.String(ry4Var.mo14344x5f01b1f6(), r26.c.f450400c));
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LqtOnClickRedeemCache", e17, "", new java.lang.Object[0]);
        }
        if (x51.o1.T) {
            r45.ry4 ry4Var2 = this.f259225a;
            ry4Var2.f466819f = 100000000;
            ry4Var2.f466821h = 50000000;
            ry4Var2.f466820g = 50000000;
        }
    }
}
