package com.tencent.mm.plugin.appbrand.jsapi.advertise;

/* loaded from: classes.dex */
public final class u extends com.tencent.mm.plugin.appbrand.jsapi.advertise.r {
    @Override // com.tencent.mm.plugin.appbrand.jsapi.advertise.r
    public void C(int i17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(uc1.f2.CTRL_INDEX, i17);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.advertise.r
    public void D(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07;
        com.tencent.mm.plugin.appbrand.service.c0 service = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        kotlin.jvm.internal.o.g(service, "service");
        com.tencent.mm.plugin.appbrand.o6 t37 = service.t3();
        if (t37 == null || (u07 = t37.u0()) == null) {
            return;
        }
        int i17 = u07.f47284z + 1000;
        java.lang.String appId = service.getAppId();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(i17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (appId == null) {
            appId = "";
        }
        objArr[1] = appId;
        g0Var.d(15651, objArr);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.advertise.r
    public void F(com.tencent.mm.plugin.appbrand.jsapi.l lVar, android.content.Intent intent, int i17) {
        com.tencent.mm.plugin.appbrand.service.c0 service = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        kotlin.jvm.internal.o.g(service, "service");
        kotlin.jvm.internal.o.g(intent, "intent");
        com.tencent.mm.plugin.appbrand.o6 t37 = service.t3();
        android.app.Activity r07 = t37 != null ? t37.r0() : null;
        if (r07 == null) {
            service.a(i17, o("fail:internal error invalid android context"));
        } else if (service instanceof com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.x) {
            intent.setClassName(r07, "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
            nf.g.a(r07).j(intent, new com.tencent.mm.plugin.appbrand.jsapi.advertise.t(service, i17, this));
        } else {
            j45.l.j(r07, "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", intent, null);
            service.a(i17, o("ok"));
        }
    }
}
