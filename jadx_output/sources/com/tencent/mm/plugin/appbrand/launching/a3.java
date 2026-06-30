package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public class a3 extends com.tencent.mm.plugin.appbrand.launching.lb {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.x2 f84484s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(com.tencent.mm.plugin.appbrand.launching.x2 x2Var, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, int i18, com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo wxaAttributes$WxaVersionInfo, int i19, com.tencent.mm.plugin.appbrand.report.quality.QualitySession qualitySession, com.tencent.luggage.sdk.launching.p pVar, boolean z17, boolean z18) {
        super(str, i17, str2, str3, i18, wxaAttributes$WxaVersionInfo, i19, qualitySession, pVar, z17, z18);
        this.f84484s = x2Var;
        boolean z19 = x2Var.A;
        com.tencent.mm.plugin.appbrand.launching.z5 z5Var = this.f84768n;
        if (z5Var instanceof com.tencent.mm.plugin.appbrand.launching.r8) {
            ((com.tencent.mm.plugin.appbrand.launching.r8) z5Var).f85115p = z19;
        }
        g(x2Var.d());
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.lb
    public void j(int i17) {
        com.tencent.mm.ipcinvoker.r rVar;
        if (this.f84484s.f85365h == null || (rVar = ((com.tencent.mm.plugin.appbrand.launching.j1) this.f84484s.f85365h).f84681d) == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareResult appBrandPrepareTask$PrepareResult = new com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareResult();
        appBrandPrepareTask$PrepareResult.f84389h = i17;
        appBrandPrepareTask$PrepareResult.f84385d = com.tencent.mm.plugin.appbrand.launching.o1.EVENT_DOWNLOAD_PROGRESS;
        rVar.a(appBrandPrepareTask$PrepareResult);
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.lb
    public void k() {
        com.tencent.mm.ipcinvoker.r rVar;
        super.k();
        com.tencent.mm.plugin.appbrand.launching.x2 x2Var = this.f84484s;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "preDownload, appId %s, versionType %d", x2Var.f85375r, java.lang.Integer.valueOf(x2Var.f85376s));
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        x2Var.f85370o = java.lang.System.currentTimeMillis();
        if (x2Var.f85365h == null || (rVar = ((com.tencent.mm.plugin.appbrand.launching.j1) x2Var.f85365h).f84681d) == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareResult appBrandPrepareTask$PrepareResult = new com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareResult();
        appBrandPrepareTask$PrepareResult.f84385d = com.tencent.mm.plugin.appbrand.launching.o1.EVENT_NEED_DOWNLOAD;
        appBrandPrepareTask$PrepareResult.f84390i = java.lang.System.currentTimeMillis();
        rVar.a(appBrandPrepareTask$PrepareResult);
    }
}
