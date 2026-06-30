package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes2.dex */
public class y7 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.z7 f259993a;

    public y7(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.z7 z7Var) {
        this.f259993a = z7Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtSaveFetchUI", "on get distribute preview finish, errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        if (fVar.f152148a != 0 || fVar.f152149b != 0) {
            return null;
        }
        r45.ie3 ie3Var = (r45.ie3) fVar.f152151d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtSaveFetchUI", "on get distribute preview finish, retcode: %s, retmsg: %s url:%s", java.lang.Integer.valueOf(ie3Var.f458498d), ie3Var.f458499e, ie3Var.f458500f);
        if (ie3Var.f458498d != 0) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.c3.c(ie3Var.f458501g);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(this.f259993a.f260008c.mo55332x76847179(), ie3Var.f458500f, true);
        return null;
    }
}
