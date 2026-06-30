package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class z1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d f229287a;

    public z1(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d) {
        this.f229287a = activityC16363x8a0a619d;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar == null) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyDetailUI", "do query detail: errtype: %s, errcode: %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        int i17 = fVar.f152148a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d = this.f229287a;
        if (i17 != 0 || fVar.f152149b != 0) {
            db5.e1.T(activityC16363x8a0a619d.mo55332x76847179(), fVar.f152150c);
            activityC16363x8a0a619d.finish();
            return null;
        }
        r45.p43 p43Var = (r45.p43) fVar.f152151d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyDetailUI", "do query detail: retcode: %s, retmsg: %s", java.lang.Integer.valueOf(p43Var.f464260d), p43Var.f464261e);
        if (p43Var.f464260d != 0) {
            db5.e1.T(activityC16363x8a0a619d.mo55332x76847179(), p43Var.f464261e);
            activityC16363x8a0a619d.finish();
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e1 e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.g5.e(p43Var);
        activityC16363x8a0a619d.U2 = e17;
        activityC16363x8a0a619d.l7(e17);
        return null;
    }
}
