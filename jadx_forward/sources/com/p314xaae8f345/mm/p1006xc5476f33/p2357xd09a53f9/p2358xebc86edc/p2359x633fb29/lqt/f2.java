package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt;

/* loaded from: classes9.dex */
public class f2 implements lm5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.i2 f259164a;

    public f2(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.i2 i2Var) {
        this.f259164a = i2Var;
    }

    @Override // lm5.e
    public java.lang.String a() {
        return "Vending.UI";
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        nm5.g gVar = (nm5.g) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.d2 d2Var = this.f259164a.f259187a;
        java.lang.String str = (java.lang.String) gVar.a(0);
        java.lang.String str2 = (java.lang.String) gVar.a(1);
        int intValue = ((java.lang.Integer) gVar.a(2)).intValue();
        int intValue2 = ((java.lang.Integer) gVar.a(3)).intValue();
        java.lang.String str3 = (java.lang.String) gVar.a(4);
        int intValue3 = ((java.lang.Integer) gVar.a(5)).intValue();
        int intValue4 = ((java.lang.Integer) gVar.a(6)).intValue();
        d2Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LqtSaveFetchInteractor", "do lqtQueryPurchaseResult, tradeNo: %s, transactionId: %s, accountType: %s", str, str2, java.lang.Integer.valueOf(intValue2));
        km5.b b17 = km5.u.b();
        b17.b();
        new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.y(str, str2, intValue, intValue2, str3, intValue3, intValue4).l().h(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.a2(d2Var, b17));
        return null;
    }
}
