package com.tencent.mm.feature.lite;

/* loaded from: classes15.dex */
public class u0 implements com.tencent.mm.plugin.lite.api.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f67274a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.report.WxaLiteAppStartReport f67275b;

    public u0(com.tencent.mm.feature.lite.i iVar, java.lang.String str, com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport) {
        this.f67274a = str;
        this.f67275b = wxaLiteAppStartReport;
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void fail(java.lang.String str, int i17) {
        com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppFeatureService", "page-level liteapp async update success, appId: %s", str);
        com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport = this.f67275b;
        wxaLiteAppStartReport.f46006p = true;
        wxaLiteAppStartReport.f46005o = java.lang.System.currentTimeMillis() - wxaLiteAppStartReport.f46004n;
        com.tencent.liteapp.gen.LiteAppReporter liteAppReporter = wxaLiteAppStartReport.I;
        if (liteAppReporter != null) {
            liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.ASYNC_CHECK_PACKAGE_UPDATE_FAILED, i17);
        }
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void success(com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppFeatureService", "page-level liteapp async update success, appId: %s", this.f67274a);
        com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport = this.f67275b;
        wxaLiteAppStartReport.f46006p = true;
        wxaLiteAppStartReport.f46005o = java.lang.System.currentTimeMillis() - wxaLiteAppStartReport.f46004n;
        com.tencent.liteapp.gen.LiteAppReporter liteAppReporter = wxaLiteAppStartReport.I;
        if (liteAppReporter == null || wxaLiteAppInfo == null) {
            return;
        }
        liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.ASYNC_CHECK_PACKAGE_UPDATE_SUCCESS, wxaLiteAppInfo.iLinkVersion);
    }
}
