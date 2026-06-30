package com.tencent.mm.feature.lite;

/* loaded from: classes15.dex */
public class j0 implements com.tencent.mm.plugin.lite.api.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.report.WxaLiteAppStartReport f67202a;

    public j0(com.tencent.mm.feature.lite.i iVar, com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport) {
        this.f67202a = wxaLiteAppStartReport;
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void fail(java.lang.String str, int i17) {
        com.tencent.liteapp.gen.LiteAppReporter liteAppReporter = this.f67202a.I;
        if (liteAppReporter != null) {
            liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.ASYNC_CHECK_PACKAGE_UPDATE_FAILED, i17);
        }
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void success(com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo, int i17) {
        com.tencent.liteapp.gen.LiteAppReporter liteAppReporter = this.f67202a.I;
        if (liteAppReporter == null || wxaLiteAppInfo == null) {
            return;
        }
        liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.ASYNC_CHECK_PACKAGE_UPDATE_SUCCESS, wxaLiteAppInfo.iLinkVersion);
    }
}
