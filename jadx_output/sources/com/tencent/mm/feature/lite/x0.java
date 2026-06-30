package com.tencent.mm.feature.lite;

/* loaded from: classes15.dex */
public class x0 implements com.tencent.mm.plugin.lite.api.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.report.WxaLiteAppStartReport f67285a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f67286b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.ui.WxaLiteAppBaseView f67287c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData f67288d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q80.s f67289e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.lite.i f67290f;

    public x0(com.tencent.mm.feature.lite.i iVar, com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport, android.os.Bundle bundle, com.tencent.liteapp.ui.WxaLiteAppBaseView wxaLiteAppBaseView, com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData openExtraData, q80.s sVar) {
        this.f67290f = iVar;
        this.f67285a = wxaLiteAppStartReport;
        this.f67286b = bundle;
        this.f67287c = wxaLiteAppBaseView;
        this.f67288d = openExtraData;
        this.f67289e = sVar;
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void fail(java.lang.String str, int i17) {
        com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport = this.f67285a;
        wxaLiteAppStartReport.f46006p = false;
        wxaLiteAppStartReport.f46005o = java.lang.System.currentTimeMillis() - wxaLiteAppStartReport.f46004n;
        com.tencent.liteapp.gen.LiteAppReporter liteAppReporter = wxaLiteAppStartReport.I;
        if (liteAppReporter != null) {
            long j17 = i17;
            liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.SYNC_CHECK_PACKAGE_UPDATE_FAILED, j17);
            wxaLiteAppStartReport.I.logStart(com.tencent.liteapp.gen.StartAction.GET_PACKAGE_INFO_FINAL_FAILED, j17);
        }
        q80.s sVar = this.f67289e;
        if (sVar != null) {
            sVar.fail();
        }
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void success(com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo, int i17) {
        com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport = this.f67285a;
        wxaLiteAppStartReport.f46006p = true;
        wxaLiteAppStartReport.f46005o = java.lang.System.currentTimeMillis() - wxaLiteAppStartReport.f46004n;
        com.tencent.liteapp.gen.LiteAppReporter liteAppReporter = wxaLiteAppStartReport.I;
        if (liteAppReporter != null && wxaLiteAppInfo != null) {
            liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.SYNC_CHECK_PACKAGE_UPDATE_SUCCESS, wxaLiteAppInfo.iLinkVersion);
            wxaLiteAppStartReport.I.logStart(com.tencent.liteapp.gen.StartAction.START_FROM_CACHE, 0L);
        }
        this.f67290f.Oj(this.f67286b, this.f67285a, wxaLiteAppInfo, this.f67287c, this.f67288d, this.f67289e);
    }
}
