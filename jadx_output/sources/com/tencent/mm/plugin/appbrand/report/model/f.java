package com.tencent.mm.plugin.appbrand.report.model;

/* loaded from: classes.dex */
public abstract class f {
    public static void a(int i17, java.lang.String str, com.tencent.mm.plugin.appbrand.report.model.d dVar) {
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mm.plugin.appbrand.report.model.AdReportCgiHelper$AdReportCgiParams adReportCgiHelper$AdReportCgiParams = new com.tencent.mm.plugin.appbrand.report.model.AdReportCgiHelper$AdReportCgiParams();
            adReportCgiHelper$AdReportCgiParams.f87922d = i17;
            adReportCgiHelper$AdReportCgiParams.f87923e = str;
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, adReportCgiHelper$AdReportCgiParams, com.tencent.mm.plugin.appbrand.report.model.e.class, new com.tencent.mm.plugin.appbrand.report.model.b(dVar));
            return;
        }
        if (i95.n0.c(p94.c0.class) != null) {
            ((n34.c) ((p94.c0) i95.n0.c(p94.c0.class))).wi(i17, str, (int) com.tencent.mm.sdk.platformtools.t8.i1());
        }
        if (dVar != null) {
            com.tencent.mm.plugin.appbrand.jsapi.y1 y1Var = (com.tencent.mm.plugin.appbrand.jsapi.y1) dVar;
            y1Var.f83924a.a(y1Var.f83925b, y1Var.f83926c.o("ok"));
        }
    }
}
