package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt;

/* loaded from: classes9.dex */
public class h2 implements lm5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.i2 f259178a;

    public h2(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.i2 i2Var) {
        this.f259178a = i2Var;
    }

    @Override // lm5.e
    public java.lang.String a() {
        return "Vending.UI";
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        nm5.h hVar = (nm5.h) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.d2 d2Var = this.f259178a.f259187a;
        java.lang.String str = (java.lang.String) hVar.a(0);
        java.lang.String str2 = (java.lang.String) hVar.a(1);
        int intValue = ((java.lang.Integer) hVar.a(2)).intValue();
        int intValue2 = ((java.lang.Integer) hVar.a(3)).intValue();
        java.lang.String str3 = (java.lang.String) hVar.a(4);
        int intValue3 = ((java.lang.Integer) hVar.a(5)).intValue();
        java.lang.String str4 = (java.lang.String) hVar.a(6);
        java.lang.String str5 = (java.lang.String) hVar.a(7);
        d2Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LqtSaveFetchInteractor", "do lqtSave, fundCode: %s, accountType: %s, spid: %s, purchaseScene: %s", str, java.lang.Integer.valueOf(intValue2), str2, java.lang.Integer.valueOf(intValue3));
        km5.b b17 = km5.u.b();
        b17.b();
        new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.x(str, str2, intValue, intValue2, str3, intValue3, str4, str5).l().h(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.z1(d2Var, b17));
        return null;
    }
}
