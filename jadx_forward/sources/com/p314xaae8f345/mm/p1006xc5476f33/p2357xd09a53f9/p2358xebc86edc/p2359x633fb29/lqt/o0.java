package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt;

/* loaded from: classes9.dex */
public class o0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ km5.b f259231a;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.s0 s0Var, km5.b bVar) {
        this.f259231a = bVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LqtDetailInteractor", "lqtOnClickRedeem end, errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            if (((r45.ry4) fVar.f152151d).B != null) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6233xa457e237 c6233xa457e237 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6233xa457e237();
                c6233xa457e237.f136481g.f87738a = ((r45.ry4) fVar.f152151d).B;
                c6233xa457e237.e();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.c3.c(((r45.ry4) fVar.f152151d).C);
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.m1.b().c((r45.ry4) fVar.f152151d);
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.l0 l0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.l0.f259202q;
            r45.ry4 ry4Var = (r45.ry4) fVar.f152151d;
            java.lang.String str = ry4Var.f466828r;
            r45.bp0 bp0Var = ry4Var.f466829s;
            l0Var.f259217m = str;
            l0Var.f259218n = bp0Var;
            if (ry4Var.f466817d != 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ry4Var.f466818e)) {
                r45.ry4 ry4Var2 = (r45.ry4) fVar.f152151d;
                if (ry4Var2.B == null) {
                    l0Var.e(ry4Var2.f466823m, false, true, ry4Var2.f466818e);
                }
            }
            l0Var.e(((r45.ry4) fVar.f152151d).f466823m, false, false, "");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.l0.f259202q.e(null, false, true, "");
        }
        this.f259231a.mo143715xc84dc82d();
        return null;
    }
}
