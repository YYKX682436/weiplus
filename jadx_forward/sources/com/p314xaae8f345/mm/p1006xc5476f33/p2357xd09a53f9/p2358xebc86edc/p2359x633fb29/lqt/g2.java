package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt;

/* loaded from: classes9.dex */
public class g2 implements lm5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.i2 f259174a;

    public g2(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.i2 i2Var) {
        this.f259174a = i2Var;
    }

    @Override // lm5.e
    public java.lang.String a() {
        return "Vending.UI";
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        nm5.e eVar = (nm5.e) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.d2 d2Var = this.f259174a.f259187a;
        int intValue = ((java.lang.Integer) eVar.a(0)).intValue();
        java.lang.String str = (java.lang.String) eVar.a(1);
        java.lang.String str2 = (java.lang.String) eVar.a(2);
        int intValue2 = ((java.lang.Integer) eVar.a(3)).intValue();
        java.lang.String str3 = (java.lang.String) eVar.a(4);
        d2Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LqtSaveFetchInteractor", "do lqtRedeemFund, redeemListId: %s, accountType: %s", str2, java.lang.Integer.valueOf(intValue2));
        km5.b b17 = km5.u.b();
        b17.b();
        new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.a0(intValue, str, str2, intValue2, str3).l().h(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.b2(d2Var, b17));
        return null;
    }
}
