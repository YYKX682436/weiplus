package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes5.dex */
public final class v2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.w2 f173230d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f173231e;

    public v2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.w2 w2Var, java.lang.Integer num) {
        this.f173230d = w2Var;
        this.f173231e = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Integer num;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.w2 w2Var = this.f173230d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.b3 b3Var = w2Var.f173239q;
        if (b3Var == null || (num = this.f173231e) == null) {
            return;
        }
        int intValue = num.intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w2Var.f173237o, "updateStyle, maxLength: " + intValue);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.v1 g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.v1.g(b3Var);
        g17.f124094f = 0;
        g17.f124093e = intValue;
        g17.f124089a = false;
        g17.f124095g = com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_1;
        g17.d(null);
    }
}
