package com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae;

/* loaded from: classes12.dex */
public class k0 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.d8 {
    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.C12937x3f78629e c12937x3f78629e, long j17, java.lang.Boolean bool, boolean z17) {
        super(j17, bool, z17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Boolean] */
    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.d8
    public java.lang.Object b() {
        java.lang.String str = "MicroMsg.WXCommProvider";
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXCommProvider", "checkIsLogin run");
            if (gm0.j1.a()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXCommProvider", "checkIsLogin doScene");
                str = java.lang.Boolean.valueOf(c01.d9.e().h(new c01.ra(new com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.j0(this), null), 0));
            } else {
                str = java.lang.Boolean.FALSE;
            }
            return str;
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "exception in NetSceneLocalProxy.");
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            c(bool);
            return bool;
        }
    }
}
