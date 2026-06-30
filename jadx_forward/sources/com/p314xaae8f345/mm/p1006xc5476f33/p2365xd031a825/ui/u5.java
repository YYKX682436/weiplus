package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class u5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19116x82bf90f1 f262169a;

    public u5(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19116x82bf90f1 activityC19116x82bf90f1) {
        this.f262169a = activityC19116x82bf90f1;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOrderInfoNewUI", "errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19116x82bf90f1 activityC19116x82bf90f1 = this.f262169a;
        activityC19116x82bf90f1.Y1 = null;
        activityC19116x82bf90f1.G1.setVisibility(8);
        activityC19116x82bf90f1.E1.setVisibility(0);
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOrderInfoNewUI", "retCode: %s, retMsg: %s", java.lang.Integer.valueOf(((r45.or6) fVar.f152151d).f464005d), ((r45.or6) fVar.f152151d).f464006e);
            if (((r45.or6) fVar.f152151d).f464005d == 0) {
                activityC19116x82bf90f1.P1 = false;
                activityC19116x82bf90f1.f261557a2 = 1;
                activityC19116x82bf90f1.k7();
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(17270, activityC19116x82bf90f1.f261565p, activityC19116x82bf90f1.M1.f82648r.f82659q, 2, 1, 2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(17270, activityC19116x82bf90f1.f261565p, activityC19116x82bf90f1.M1.f82648r.f82659q, 2, 2, 2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(17270, activityC19116x82bf90f1.f261565p, activityC19116x82bf90f1.M1.f82648r.f82659q, 2, 2, 2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
        return null;
    }
}
