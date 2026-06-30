package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt;

/* loaded from: classes9.dex */
public class q0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f259239a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ km5.b f259240b;

    public q0(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.s0 s0Var, int i17, km5.b bVar) {
        this.f259239a = i17;
        this.f259240b = bVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LqtDetailInteractor", "lqtOnClickPurchase end, errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            if (((r45.ny4) fVar.f152151d).A != null) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6233xa457e237 c6233xa457e237 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6233xa457e237();
                c6233xa457e237.f136481g.f87738a = ((r45.ny4) fVar.f152151d).A;
                c6233xa457e237.e();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.c3.c(((r45.ny4) fVar.f152151d).B);
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.l0 l0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.l0.f259202q;
            l0Var.e(((r45.ny4) fVar.f152151d).f463280f, true, false, "");
            l0Var.f((r45.ny4) fVar.f152151d, this.f259239a);
        } else {
            dp.a.m125854x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l0g), 1).show();
        }
        this.f259240b.mo143715xc84dc82d();
        return null;
    }
}
