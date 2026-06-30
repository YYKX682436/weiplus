package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class ga {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.ga f84629a = new com.tencent.mm.plugin.appbrand.launching.ga();

    public final void a(com.tencent.mm.plugin.appbrand.launching.u3 u3Var, com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverContract$SharedIPCCallArgs sharedArgs, java.util.List moduleNameList, yz5.l onSuccess, yz5.l onProgress, yz5.p onError, java.util.concurrent.Executor executor, com.tencent.mm.plugin.appbrand.launching.a7 a7Var) {
        kotlin.jvm.internal.o.g(u3Var, "<this>");
        kotlin.jvm.internal.o.g(sharedArgs, "sharedArgs");
        kotlin.jvm.internal.o.g(moduleNameList, "moduleNameList");
        kotlin.jvm.internal.o.g(onSuccess, "onSuccess");
        kotlin.jvm.internal.o.g(onProgress, "onProgress");
        kotlin.jvm.internal.o.g(onError, "onError");
        int i17 = sharedArgs.f84455f;
        com.tencent.mm.plugin.appbrand.launching.g8 g8Var = com.tencent.mm.plugin.appbrand.launching.g8.f84628a;
        boolean z17 = sharedArgs.f84458i;
        com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo wxaAttributes$WxaVersionInfo = sharedArgs.f84456g;
        java.lang.String str = sharedArgs.f84453d;
        java.util.Map b17 = g8Var.b(wxaAttributes$WxaVersionInfo, str, z17);
        com.tencent.mm.plugin.appbrand.report.quality.QualitySession qualitySession = sharedArgs.f84462p;
        boolean z18 = sharedArgs.f84459m || !com.tencent.mm.plugin.appbrand.launching.r5.f85103b.a(sharedArgs.f84457h);
        com.tencent.mm.plugin.appbrand.launching.s7 s7Var = com.tencent.mm.plugin.appbrand.launching.s7.f85141d;
        com.tencent.mm.plugin.appbrand.report.quality.QualitySession reportQualitySession = sharedArgs.f84462p;
        kotlin.jvm.internal.o.g(reportQualitySession, "reportQualitySession");
        r45.y50 y50Var = new r45.y50();
        y50Var.f390797d = reportQualitySession.f88138h;
        boolean z19 = sharedArgs.f84463q;
        y50Var.f390798e = z19;
        y50Var.f390799f = 1;
        com.tencent.mm.plugin.appbrand.launching.k3 y7Var = reportQualitySession.f88137g == 1004 ? new com.tencent.mm.plugin.appbrand.launching.y7(false, reportQualitySession, y50Var, s7Var) : new com.tencent.mm.plugin.appbrand.launching.d8(reportQualitySession, y50Var, s7Var);
        java.util.Map map = sharedArgs.f84461o;
        r45.y50 y50Var2 = new r45.y50();
        y50Var2.f390797d = reportQualitySession.f88138h;
        y50Var2.f390798e = z19;
        y50Var2.f390799f = sharedArgs.f84464r ? 1 : 101;
        u3Var.a(str, wxaAttributes$WxaVersionInfo, i17, moduleNameList, b17, qualitySession, onSuccess, onProgress, onError, z18, y50Var2, y7Var, map, executor, a7Var);
    }
}
