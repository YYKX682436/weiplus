package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt;

/* loaded from: classes9.dex */
public class k2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f259200a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.w2 f259201b;

    public k2(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.w2 w2Var, int i17) {
        this.f259201b = w2Var;
        this.f259200a = i17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LqtSaveFetchLogic", "CgiLqtOnClickPurchase end, errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.c3.c(((r45.ny4) fVar.f152151d).B);
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.l0 l0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.l0.f259202q;
            l0Var.e(((r45.ny4) fVar.f152151d).f463280f, true, false, "");
            l0Var.f((r45.ny4) fVar.f152151d, this.f259200a);
        }
        km5.b bVar = this.f259201b.f259275l;
        if (bVar == null) {
            return null;
        }
        bVar.mo143715xc84dc82d();
        return null;
    }
}
