package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public abstract class q7 implements com.tencent.mm.plugin.appbrand.launching.k3 {
    public final void f(com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySplitCodeLibStatisStruct weAppQualitySplitCodeLibStatisStruct, com.tencent.mm.plugin.appbrand.report.quality.QualitySession session) {
        kotlin.jvm.internal.o.g(weAppQualitySplitCodeLibStatisStruct, "<this>");
        kotlin.jvm.internal.o.g(session, "session");
        weAppQualitySplitCodeLibStatisStruct.f62713d = weAppQualitySplitCodeLibStatisStruct.b("AppId", session.f88135e, true);
        weAppQualitySplitCodeLibStatisStruct.f62714e = session.f88139i;
        int i17 = session.f88136f;
        weAppQualitySplitCodeLibStatisStruct.f62715f = i17 != 1 ? i17 != 2 ? i17 != 3 ? null : cm.f0.demo : cm.f0.debug : cm.f0.release;
        weAppQualitySplitCodeLibStatisStruct.f62716g = session.f88137g;
        weAppQualitySplitCodeLibStatisStruct.f62721l = weAppQualitySplitCodeLibStatisStruct.b("InstanceId", session.f88134d, true);
        weAppQualitySplitCodeLibStatisStruct.f62722m = session.f88138h;
    }

    public final void g(com.tencent.mm.plugin.appbrand.report.quality.QualitySession reportQualitySession, com.tencent.mm.plugin.appbrand.launching.o6 request, com.tencent.mm.plugin.appbrand.launching.p6 response) {
        kotlin.jvm.internal.o.g(reportQualitySession, "reportQualitySession");
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(response, "response");
        com.tencent.mm.plugin.appbrand.launching.s6 s6Var = response.f84893b;
        boolean z17 = s6Var instanceof com.tencent.mm.plugin.appbrand.launching.q6;
        com.tencent.mm.plugin.appbrand.appcache.IPkgInfo iPkgInfo = response.f84892a;
        if (!z17 || ((com.tencent.mm.plugin.appbrand.launching.q6) s6Var).f85078a == 0) {
            if ((s6Var instanceof com.tencent.mm.plugin.appbrand.launching.q6) && ((com.tencent.mm.plugin.appbrand.launching.q6) s6Var).f85078a == 0) {
                s81.b bVar = (s81.b) com.tencent.mm.plugin.appbrand.app.r9.fj(s81.b.class);
                java.lang.String str = reportQualitySession.f88134d;
                java.lang.String str2 = request.f84851d;
                int pkgVersion = iPkgInfo.pkgVersion();
                int i17 = request.f84853f;
                java.lang.String str3 = request.f84852e;
                bVar.getClass();
                pm0.v.L("MicroMsg.AppBrand.PredownloadGetCodeStatStorage__report", true, new s81.a(bVar, str, str2, pkgVersion, i17, str3));
                return;
            }
            return;
        }
        com.tencent.mm.autogen.mmdata.rpt.WeAppQualityPackageReuseStruct weAppQualityPackageReuseStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppQualityPackageReuseStruct();
        weAppQualityPackageReuseStruct.f62599d = weAppQualityPackageReuseStruct.b("InstanceId", reportQualitySession.f88134d, true);
        weAppQualityPackageReuseStruct.f62600e = weAppQualityPackageReuseStruct.b("AppId", reportQualitySession.f88135e, true);
        weAppQualityPackageReuseStruct.f62601f = reportQualitySession.f88139i;
        weAppQualityPackageReuseStruct.f62602g = reportQualitySession.f88136f;
        weAppQualityPackageReuseStruct.f62603h = reportQualitySession.f88138h;
        weAppQualityPackageReuseStruct.f62604i = weAppQualityPackageReuseStruct.b("md5", iPkgInfo.checksumMd5(), true);
        weAppQualityPackageReuseStruct.f62605j = weAppQualityPackageReuseStruct.b("moduleName", request.f84852e, true);
        weAppQualityPackageReuseStruct.f62606k = request.f84853f;
        int i18 = ((com.tencent.mm.plugin.appbrand.launching.q6) s6Var).f85078a;
        if (i18 == 1) {
            weAppQualityPackageReuseStruct.f62607l = 1L;
        } else if (i18 == 2) {
            weAppQualityPackageReuseStruct.f62607l = 2L;
            com.tencent.mm.plugin.appbrand.launching.w6 w6Var = request.f84855h;
            com.tencent.mm.plugin.appbrand.launching.v6 v6Var = w6Var instanceof com.tencent.mm.plugin.appbrand.launching.v6 ? (com.tencent.mm.plugin.appbrand.launching.v6) w6Var : null;
            weAppQualityPackageReuseStruct.f62608m = weAppQualityPackageReuseStruct.b("resue_reason", v6Var != null ? java.lang.Long.valueOf(v6Var.f85264b).toString() : null, true);
        }
        weAppQualityPackageReuseStruct.k();
    }
}
