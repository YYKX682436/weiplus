package com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae;

/* loaded from: classes9.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f175297a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f175298b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f175299c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.j f175300d;

    public k(android.content.Context context, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.j jVar) {
        this.f175297a = context;
        this.f175298b = str;
        this.f175299c = str2;
        this.f175300d = jVar;
    }

    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.j jVar = this.f175300d;
        java.lang.String str = this.f175299c;
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenIdChecker", "doCheck, openId is null");
            jVar.a(true);
            return;
        }
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        java.lang.String str2 = this.f175298b;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m j17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.j(str2, false, false);
        if (j17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenIdChecker", "doCheck fail, local app is null, appId = " + str2);
            jVar.a(true);
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j17.f67384x996f3ea)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenIdChecker", "doCheck fail, local openId is null, appId = " + str2);
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.Ui().b(str2);
            jVar.a(true);
            return;
        }
        if (str.equalsIgnoreCase(j17.f67384x996f3ea)) {
            jVar.a(true);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenIdChecker", "doCheck fail, appId = " + str2 + ", openId = " + str + ", localOpenId = " + j17.f67384x996f3ea);
        b();
    }

    public void b() {
        db5.e1.o(this.f175297a, com.p314xaae8f345.mm.R.C30867xcad56011.hfc, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.i(this));
    }
}
