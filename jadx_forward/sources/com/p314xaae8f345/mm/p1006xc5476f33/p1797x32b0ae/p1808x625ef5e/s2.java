package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e;

/* loaded from: classes15.dex */
public class s2 implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f225590a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f225591b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ double f225592c;

    public s2(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.u2 u2Var, java.lang.String[] strArr, int i17, double d17) {
        this.f225590a = strArr;
        this.f225591b = i17;
        this.f225592c = d17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h
    /* renamed from: fail */
    public void mo25333x2fd71e(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5677x6d1cb2fe c5677x6d1cb2fe = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5677x6d1cb2fe();
        am.ti tiVar = c5677x6d1cb2fe.f136003g;
        tiVar.f89546a = false;
        tiVar.f89547b = str;
        c5677x6d1cb2fe.e();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h
    /* renamed from: success */
    public void mo25334x90b54003(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441, int i17) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", c3712x3ed8a441.f14359x58b7f1c);
        java.lang.String[] strArr = this.f225590a;
        java.lang.String str = strArr[0];
        if (str != null) {
            bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, str);
        }
        java.lang.String str2 = strArr[1];
        if (str2 != null) {
            bundle.putString("query", str2);
        }
        int i18 = this.f225591b;
        if (1 == i18) {
            bundle.putBoolean("isHalfScreen", true);
            double d17 = this.f225592c;
            if (d17 != 0.0d) {
                bundle.putDouble("heightPercent", d17);
            }
        }
        if (2 != i18) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, bundle, true, false, null);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5677x6d1cb2fe c5677x6d1cb2fe = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5677x6d1cb2fe();
        am.ti tiVar = c5677x6d1cb2fe.f136003g;
        tiVar.f89546a = true;
        tiVar.f89547b = c3712x3ed8a441.f14359x58b7f1c;
        tiVar.f89548c = c3712x3ed8a441.f14369x346425;
        tiVar.f89549d = c3712x3ed8a441.f14375x14f51cd8;
        c5677x6d1cb2fe.e();
    }
}
