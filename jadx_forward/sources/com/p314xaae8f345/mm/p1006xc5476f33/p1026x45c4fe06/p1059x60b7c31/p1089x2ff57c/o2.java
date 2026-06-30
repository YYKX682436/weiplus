package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c;

/* loaded from: classes8.dex */
public class o2 extends uh0.v {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.C12105x9a9f8a9.a f162647b;

    public o2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.C12105x9a9f8a9.a aVar) {
        this.f162647b = aVar;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf m50421x3c6fed6a;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.Integer num = (java.lang.Integer) obj;
        if (this.f509272a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.OpenFileRequest", "openReadFile, ignore ret = %d", num);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.OpenFileRequest", "openReadFile, ret = %d", num);
        int intValue = num.intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.C12105x9a9f8a9.a aVar = this.f162647b;
        if (intValue == -102) {
            try {
                str = aVar.f162559e;
                str2 = aVar.f162561g;
                aVar.H(str, str2);
                return;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.OpenFileRequest", e17, " openOuterAppDirectly exp = %s ", e17);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.C12105x9a9f8a9.OpenResult openResult = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.C12105x9a9f8a9.OpenResult();
        int intValue2 = num.intValue();
        openResult.f162556d = intValue2;
        if (-102 == intValue2) {
            aVar.m50420x7b736e5c(openResult);
            return;
        }
        if (num.intValue() == 0) {
            uh0.r rVar = (uh0.r) i95.n0.c(uh0.r.class);
            m50421x3c6fed6a = aVar.m50421x3c6fed6a();
            str3 = aVar.f162559e;
            str4 = aVar.f162561g;
            int i17 = openResult.f162556d;
            ((th0.u) rVar).getClass();
            com.p314xaae8f345.mm.p2829xfa87f9de.i.g(m50421x3c6fed6a, str3, str4, i17);
            aVar.m50430x1a60bdc5(openResult);
        }
    }
}
