package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class u1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f79746d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f79747e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.v1 f79748f;

    public u1(com.tencent.mm.plugin.appbrand.y yVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.auth.v1 v1Var) {
        this.f79746d = yVar;
        this.f79747e = i17;
        this.f79748f = v1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.y yVar = this.f79746d;
        com.tencent.mm.plugin.appbrand.jsapi.auth.j5 j5Var = new com.tencent.mm.plugin.appbrand.jsapi.auth.j5(yVar, new com.tencent.mm.plugin.appbrand.jsapi.auth.t1(yVar, this.f79747e, this.f79748f));
        rt1.p1 p1Var = new rt1.p1(qt1.g.f366524e);
        j5Var.f79603d = p1Var;
        p1Var.f399473b = j5Var;
        p1Var.c(new com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListViewContract$ViewModel(null, false, null, false));
        com.tencent.mm.plugin.appbrand.y yVar2 = j5Var.f79600a;
        kotlin.jvm.internal.o.d(yVar2);
        com.tencent.mm.autogen.mmdata.rpt.WACarLicensePlateAuthLogStruct wACarLicensePlateAuthLogStruct = j5Var.f79607h;
        wACarLicensePlateAuthLogStruct.f61916d = wACarLicensePlateAuthLogStruct.b("AppId", yVar2.getAppId(), true);
        if (com.tencent.mm.plugin.appbrand.report.quality.e.b(yVar2.getAppId(), true) != null) {
            com.tencent.mm.autogen.mmdata.rpt.WACarLicensePlateAuthLogStruct wACarLicensePlateAuthLogStruct2 = j5Var.f79607h;
            wACarLicensePlateAuthLogStruct2.f61917e = r2.f88139i;
            wACarLicensePlateAuthLogStruct2.f61918f = r2.f88136f;
            wACarLicensePlateAuthLogStruct2.f61919g = r2.f88137g;
        }
        rt1.z0 z0Var = j5Var.f79603d;
        if (z0Var == null) {
            kotlin.jvm.internal.o.o("viewPresenter");
            throw null;
        }
        com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListViewContract$ViewModel b17 = ((rt1.p1) z0Var).b();
        b17.f94625f = yVar2.getAppId();
        b17.f94626g = yVar2.t3().S0(com.tencent.mm.plugin.appbrand.jsapi.auth.v1.NAME);
        yVar2.t3().N.a(j5Var.f79609j);
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = yVar2 instanceof com.tencent.mm.plugin.appbrand.page.v5 ? (com.tencent.mm.plugin.appbrand.page.v5) yVar2 : null;
        if (v5Var != null) {
            v5Var.w(j5Var.f79609j);
        }
        yVar2.t3().I.add(j5Var);
    }
}
