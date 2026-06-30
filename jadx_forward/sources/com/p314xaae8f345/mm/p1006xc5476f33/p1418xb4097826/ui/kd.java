package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes8.dex */
public final class kd implements so2.k5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.sd f210964a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f210965b;

    public kd(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.sd sdVar, java.lang.String str) {
        this.f210964a = sdVar;
        this.f210965b = str;
    }

    @Override // so2.k5
    public void a(java.lang.String coverUrl, int i17, int i18, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coverUrl, "coverUrl");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.sd sdVar = this.f210964a;
        az2.f fVar = sdVar.f211337b;
        if (fVar != null) {
            fVar.b();
        }
        java.lang.String str2 = this.f210965b;
        if (str2 == null) {
            str2 = "";
        }
        sdVar.getClass();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5470xdd7cf62c c5470xdd7cf62c = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5470xdd7cf62c();
        am.fb fbVar = c5470xdd7cf62c.f135808g;
        fbVar.f88197b = 50000;
        fbVar.f88201f = str2;
        fbVar.f88200e = i17;
        c5470xdd7cf62c.e();
        if (i18 == 0) {
            pm0.v.X(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.jd.f210928d);
            db5.t7.h(sdVar.f211336a, sdVar.b(com.p314xaae8f345.mm.R.C30867xcad56011.eon));
            return;
        }
        if (i18 != -5000 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = sdVar.b(com.p314xaae8f345.mm.R.C30867xcad56011.f9c);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        }
        db5.t7.g(sdVar.f211336a, str);
    }
}
