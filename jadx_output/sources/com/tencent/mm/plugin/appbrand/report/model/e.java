package com.tencent.mm.plugin.appbrand.report.model;

/* JADX INFO: Access modifiers changed from: package-private */
@mk0.a
/* loaded from: classes.dex */
public final class e implements com.tencent.mm.ipcinvoker.j {
    private e() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.appbrand.report.model.AdReportCgiHelper$AdReportCgiParams adReportCgiHelper$AdReportCgiParams = (com.tencent.mm.plugin.appbrand.report.model.AdReportCgiHelper$AdReportCgiParams) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.AdReportCgiHelper", "report kvId:%d str:%s", java.lang.Integer.valueOf(adReportCgiHelper$AdReportCgiParams.f87922d), adReportCgiHelper$AdReportCgiParams.f87923e);
        int i17 = adReportCgiHelper$AdReportCgiParams.f87922d;
        java.lang.String str = adReportCgiHelper$AdReportCgiParams.f87923e;
        if (i95.n0.c(p94.c0.class) != null) {
            ((n34.c) ((p94.c0) i95.n0.c(p94.c0.class))).wi(i17, str, (int) com.tencent.mm.sdk.platformtools.t8.i1());
        }
        rVar.a(new com.tencent.mm.ipcinvoker.type.IPCVoid());
    }
}
