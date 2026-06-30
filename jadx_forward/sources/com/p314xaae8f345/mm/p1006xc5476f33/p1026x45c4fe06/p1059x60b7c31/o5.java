package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public final class o5 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34568x366c91de = -2;

    /* renamed from: NAME */
    public static final java.lang.String f34569x24728b = "functionalPageStartGame";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 service = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        java.lang.String optString = jSONObject != null ? jSONObject.optString("url", "index.html") : null;
        java.lang.String str = optString != null ? optString : "index.html";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiFunctionalPageStartGame", "invoke: ".concat(str));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 m52169xfdaa7672 = service.t3().x0().m52169xfdaa7672();
        if (m52169xfdaa7672 == null || !(m52169xfdaa7672 instanceof ce.h)) {
            service.a(i17, o("fail: current page is null or not GamePage"));
            return;
        }
        ce.h hVar = (ce.h) m52169xfdaa7672;
        hVar.m14684xdb7c7738(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 mo14682x9dee9c37 = hVar.mo14682x9dee9c37();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo14682x9dee9c37, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.page.AppBrandPageViewWC");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.h w37 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) mo14682x9dee9c37).w3();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(w37, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.report.AppBrandPageViewStatisticsWC");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.t0 t0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.t0) w37;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        t0Var.f169938h = java.lang.System.currentTimeMillis() - t0Var.f169514a.f169954b.mo52488x8082fb99();
        t0Var.f169940j = str;
        t0Var.f169939i = true;
        service.a(i17, o("ok"));
    }
}
