package com.tencent.mm.plugin.appbrand.report.quality;

/* loaded from: classes7.dex */
public final class h1 implements m91.g {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.AppBrandRuntime f88199a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f88200b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f88201c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.report.quality.d1 f88202d;

    public h1(com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        this.f88199a = runtime;
        m91.j jVar = m91.j.f324955a;
        m91.j.f324956b.add(this);
        this.f88202d = new com.tencent.mm.plugin.appbrand.report.quality.d1(this);
    }

    public static void d(com.tencent.mm.plugin.appbrand.report.quality.h1 h1Var, com.tencent.mm.plugin.appbrand.page.v5 page, com.tencent.mm.plugin.appbrand.report.quality.j0 scene, boolean z17, com.tencent.mm.plugin.appbrand.report.quality.l0 l0Var, com.tencent.mm.appbrand.commonjni.CheckBitmapIsBlankResultDetails checkBitmapIsBlankResultDetails, int i17, java.lang.Object obj) {
        int i18 = 1;
        boolean z18 = (i17 & 4) != 0 ? true : z17;
        com.tencent.mm.appbrand.commonjni.CheckBitmapIsBlankResultDetails checkBitmapIsBlankResultDetails2 = (i17 & 16) != 0 ? null : checkBitmapIsBlankResultDetails;
        h1Var.getClass();
        kotlin.jvm.internal.o.g(page, "page");
        kotlin.jvm.internal.o.g(scene, "scene");
        if (!z18 && !z18) {
            com.tencent.mm.plugin.appbrand.report.quality.j0 j0Var = com.tencent.mm.plugin.appbrand.report.quality.j0.f88209d;
        }
        if (page.j2() && z18) {
            com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = page.t3();
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig u07 = t37 != null ? t37.u0() : null;
            kotlin.jvm.internal.o.e(u07, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC");
            com.tencent.mm.plugin.appbrand.c6.a(52, (com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) u07);
        }
        if (z18 && scene != com.tencent.mm.plugin.appbrand.report.quality.j0.f88211f) {
            com.tencent.mm.plugin.appbrand.report.quality.b bVar = new com.tencent.mm.plugin.appbrand.report.quality.b();
            int i19 = com.tencent.mm.plugin.appbrand.report.quality.a.f88155a[scene.ordinal()];
            if (i19 != 1) {
                i18 = 2;
                if (i19 != 2) {
                    i18 = 3;
                    if (i19 != 3) {
                        i18 = 0;
                    }
                }
            }
            bVar.s("type", java.lang.Integer.valueOf(i18));
            page.i(bVar, new int[0]);
        }
        pm0.v.X(new com.tencent.mm.plugin.appbrand.report.quality.g1(h1Var, scene, z18, l0Var, page, checkBitmapIsBlankResultDetails2));
    }

    public final java.util.List a() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.tencent.mm.plugin.appbrand.page.i3 x07 = this.f88199a.x0();
        if (x07 != null) {
            java.util.Iterator h07 = x07.h0(true);
            while (true) {
                com.tencent.mm.plugin.appbrand.page.g4 g4Var = (com.tencent.mm.plugin.appbrand.page.g4) h07;
                if (!g4Var.hasNext()) {
                    break;
                }
                linkedList.addLast(((com.tencent.mm.plugin.appbrand.page.w2) g4Var.next()).getCurrentUrl());
            }
        }
        return linkedList;
    }

    public final com.tencent.mm.autogen.mmdata.rpt.WAQualityReportStruct b() {
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader S2;
        java.lang.String a17;
        com.tencent.mm.autogen.mmdata.rpt.WAQualityReportStruct wAQualityReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WAQualityReportStruct();
        wAQualityReportStruct.f62030e = wAQualityReportStruct.b("Appid", this.f88199a.f74803n, true);
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig u07 = this.f88199a.u0();
        com.tencent.luggage.sdk.config.AppBrandInitConfigLU appBrandInitConfigLU = u07 instanceof com.tencent.luggage.sdk.config.AppBrandInitConfigLU ? (com.tencent.luggage.sdk.config.AppBrandInitConfigLU) u07 : null;
        if (appBrandInitConfigLU != null) {
            wAQualityReportStruct.f62029d = wAQualityReportStruct.b("InstanceId", appBrandInitConfigLU.f47277w, true);
            wAQualityReportStruct.f62031f = wAQualityReportStruct.b("Username", appBrandInitConfigLU.f47278x, true);
            wAQualityReportStruct.f62032g = appBrandInitConfigLU.f47284z + 1000;
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = appBrandInitConfigLU.f47269b2;
            wAQualityReportStruct.f62033h = appBrandStatObject.f87790f;
            java.lang.String str = appBrandStatObject.f87791g;
            wAQualityReportStruct.f62034i = wAQualityReportStruct.b("SceneNote", (str == null || (a17 = fp.s0.a(str)) == null) ? null : u46.l.t(a17, 0, 1024), true);
            wAQualityReportStruct.f62035j = appBrandInitConfigLU.L;
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f88199a;
        com.tencent.mm.plugin.appbrand.o6 o6Var = appBrandRuntime instanceof com.tencent.mm.plugin.appbrand.o6 ? (com.tencent.mm.plugin.appbrand.o6) appBrandRuntime : null;
        wAQualityReportStruct.f62036k = wAQualityReportStruct.b("PublibVersionStr", (o6Var == null || (S2 = o6Var.S2(false)) == null) ? null : S2.W0(), true);
        wAQualityReportStruct.f62037l = wAQualityReportStruct.b("NetWorkType", com.tencent.mm.plugin.appbrand.report.q2.c(null, 1, null), true);
        wAQualityReportStruct.f62040o = java.lang.System.currentTimeMillis();
        wAQualityReportStruct.f62043r = wAQualityReportStruct.b("QualityIssuePageLastError", null, true);
        java.lang.String str2 = this.f88201c;
        wAQualityReportStruct.f62044s = wAQualityReportStruct.b("QualityIssueServiceLastError", str2 != null ? u46.l.t(str2, 0, 1024) : null, true);
        wAQualityReportStruct.f62045t = wAQualityReportStruct.b("ServiceRuntimeContext", this.f88200b, true);
        java.lang.String str3 = this.f88199a.u0().f77279e;
        if (str3 == null) {
            str3 = "";
        }
        wAQualityReportStruct.B = wAQualityReportStruct.b("NickName", fp.s0.a(str3), true);
        return wAQualityReportStruct;
    }

    public final void c(com.tencent.mm.autogen.mmdata.rpt.WAQualityReportStruct wAQualityReportStruct, java.util.List list) {
        wAQualityReportStruct.f62041p = list.size();
        wAQualityReportStruct.f62042q = wAQualityReportStruct.b("LastNPagePath", u46.l.t(kz5.n0.g0(list, "#", null, null, 0, null, com.tencent.mm.plugin.appbrand.report.quality.e1.f88180d, 30, null), 0, 1024), true);
    }
}
