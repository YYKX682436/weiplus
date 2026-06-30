package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class d8 extends com.tencent.mm.plugin.appbrand.launching.q7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.quality.QualitySession f84568a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.y50 f84569b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f84570c;

    public d8(com.tencent.mm.plugin.appbrand.report.quality.QualitySession qualitySession, r45.y50 y50Var, yz5.l lVar) {
        this.f84568a = qualitySession;
        this.f84569b = y50Var;
        this.f84570c = lVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.k6
    public void a(com.tencent.mm.plugin.appbrand.launching.o6 request, int i17, java.lang.String str) {
        kotlin.jvm.internal.o.g(request, "request");
        this.f84570c.invoke(request);
        if (kz5.z.F(qq5.a.f365997d, request.f84853f)) {
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySplitCodeLibStatisStruct weAppQualitySplitCodeLibStatisStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySplitCodeLibStatisStruct();
            f(weAppQualitySplitCodeLibStatisStruct, this.f84568a);
            weAppQualitySplitCodeLibStatisStruct.f62720k = weAppQualitySplitCodeLibStatisStruct.b("networkType", com.tencent.mm.plugin.appbrand.report.q2.c(null, 1, null), true);
            weAppQualitySplitCodeLibStatisStruct.f62717h = weAppQualitySplitCodeLibStatisStruct.b("Provider", request.f84851d, true);
            com.tencent.mm.plugin.appbrand.launching.w6 w6Var = request.f84855h;
            if (w6Var instanceof com.tencent.mm.plugin.appbrand.launching.v6) {
                weAppQualitySplitCodeLibStatisStruct.f62718i = ((com.tencent.mm.plugin.appbrand.launching.v6) w6Var).f85263a;
                int[] A = com.tencent.mm.plugin.appbrand.app.r9.Di().A(request.h().toString(), 0);
                if (A == null) {
                    weAppQualitySplitCodeLibStatisStruct.f62719j = 2L;
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    int length = A.length;
                    for (int i18 = 0; i18 < length; i18++) {
                        int i19 = A[i18];
                        if (!(i19 == w6Var.a())) {
                            arrayList.add(java.lang.Integer.valueOf(i19));
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        weAppQualitySplitCodeLibStatisStruct.f62719j = 4L;
                    }
                }
            } else {
                weAppQualitySplitCodeLibStatisStruct.f62718i = 0L;
                weAppQualitySplitCodeLibStatisStruct.f62719j = 2L;
            }
            weAppQualitySplitCodeLibStatisStruct.k();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.k6
    public void d(com.tencent.mm.plugin.appbrand.launching.o6 request, com.tencent.mm.plugin.appbrand.launching.p6 response) {
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(response, "response");
        com.tencent.mm.plugin.appbrand.launching.w6 w6Var = request.f84855h;
        boolean z17 = w6Var instanceof com.tencent.mm.plugin.appbrand.launching.u6;
        int[] iArr = qq5.a.f365997d;
        com.tencent.mm.plugin.appbrand.report.quality.QualitySession qualitySession = this.f84568a;
        int i17 = request.f84853f;
        java.lang.String str = request.f84851d;
        if (z17 && !((com.tencent.mm.plugin.appbrand.launching.u6) w6Var).f85224b && kz5.z.F(iArr, i17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.LaunchCheckPkgBatchGetCodeUtils.defaultBatchReporter", "onPkgCached, will update plugin(" + str + ") to latest in background...");
            pm0.v.K(null, new com.tencent.mm.plugin.appbrand.launching.c8(request, qualitySession, this.f84569b, qualitySession.f88134d, this, response));
        }
        if (kz5.z.F(iArr, i17)) {
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySplitCodeLibStatisStruct weAppQualitySplitCodeLibStatisStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySplitCodeLibStatisStruct();
            f(weAppQualitySplitCodeLibStatisStruct, qualitySession);
            weAppQualitySplitCodeLibStatisStruct.f62720k = weAppQualitySplitCodeLibStatisStruct.b("networkType", com.tencent.mm.plugin.appbrand.report.q2.c(null, 1, null), true);
            weAppQualitySplitCodeLibStatisStruct.f62717h = weAppQualitySplitCodeLibStatisStruct.b("Provider", str, true);
            com.tencent.mm.plugin.appbrand.appcache.IPkgInfo iPkgInfo = response.f84892a;
            weAppQualitySplitCodeLibStatisStruct.f62718i = iPkgInfo.pkgVersion();
            weAppQualitySplitCodeLibStatisStruct.f62719j = 3L;
            weAppQualitySplitCodeLibStatisStruct.k();
            com.tencent.mm.plugin.appbrand.appcache.k6.b(str, iPkgInfo.pkgVersion());
        }
        g(qualitySession, request, response);
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.k6
    public void e(com.tencent.mm.plugin.appbrand.launching.o6 request, com.tencent.mm.plugin.appbrand.launching.p6 response) {
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(response, "response");
        if (kz5.z.F(qq5.a.f365997d, request.f84853f)) {
            com.tencent.mm.plugin.appbrand.appcache.k6.b(request.f84851d, response.f84892a.pkgVersion());
        }
    }
}
