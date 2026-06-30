package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt;

/* loaded from: classes9.dex */
public class w0 implements lm5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.z0 f259263a;

    public w0(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.z0 z0Var) {
        this.f259263a = z0Var;
    }

    @Override // lm5.e
    public java.lang.String a() {
        return "Vending.UI";
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        nm5.c cVar = (nm5.c) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.s0 s0Var = this.f259263a.f259287a;
        int intValue = ((java.lang.Integer) cVar.a(0)).intValue();
        int intValue2 = ((java.lang.Integer) cVar.a(1)).intValue();
        long longValue = ((java.lang.Long) cVar.a(2)).longValue();
        s0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LqtDetailInteractor", "lqtOnClickPurchase, accountType: %s", java.lang.Integer.valueOf(intValue));
        km5.b b17 = km5.u.b();
        b17.b();
        new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.j(intValue, intValue2, longValue).l().h(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.q0(s0Var, intValue2, b17));
        return null;
    }
}
