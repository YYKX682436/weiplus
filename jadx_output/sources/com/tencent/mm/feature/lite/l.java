package com.tencent.mm.feature.lite;

/* loaded from: classes15.dex */
public class l implements com.tencent.mm.plugin.lite.api.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.report.WxaLiteAppStartReport f67205a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.gen.LiteAppReporter f67206b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.gen.LiteAppReporter f67207c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f67208d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.ui.WxaLiteAppBaseView f67209e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData f67210f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q80.s f67211g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.lite.i f67212h;

    public l(com.tencent.mm.feature.lite.i iVar, com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport, com.tencent.liteapp.gen.LiteAppReporter liteAppReporter, com.tencent.liteapp.gen.LiteAppReporter liteAppReporter2, android.os.Bundle bundle, com.tencent.liteapp.ui.WxaLiteAppBaseView wxaLiteAppBaseView, com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData openExtraData, q80.s sVar) {
        this.f67212h = iVar;
        this.f67205a = wxaLiteAppStartReport;
        this.f67206b = liteAppReporter;
        this.f67207c = liteAppReporter2;
        this.f67208d = bundle;
        this.f67209e = wxaLiteAppBaseView;
        this.f67210f = openExtraData;
        this.f67211g = sVar;
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void fail(java.lang.String str, int i17) {
        com.tencent.mars.xlog.Log.w("MicroMsg.LiteAppFeatureService", "checkLiteApp fail:" + str);
        this.f67205a.f46006p = false;
        com.tencent.liteapp.gen.StartAction startAction = com.tencent.liteapp.gen.StartAction.SYNC_CHECK_PACKAGE_UPDATE_FAILED;
        long j17 = i17;
        com.tencent.liteapp.gen.LiteAppReporter liteAppReporter = this.f67206b;
        liteAppReporter.logStart(startAction, j17);
        liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.GET_PACKAGE_INFO_FINAL_FAILED, j17);
        q80.s sVar = this.f67211g;
        if (sVar != null) {
            sVar.fail();
        }
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void success(com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo, int i17) {
        com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport = this.f67205a;
        wxaLiteAppStartReport.f46006p = true;
        wxaLiteAppStartReport.f46005o = java.lang.System.currentTimeMillis() - wxaLiteAppStartReport.f46004n;
        if (wxaLiteAppInfo != null) {
            this.f67206b.logStart(com.tencent.liteapp.gen.StartAction.SYNC_CHECK_PACKAGE_UPDATE_SUCCESS, wxaLiteAppInfo.iLinkVersion);
        }
        this.f67207c.logStart(com.tencent.liteapp.gen.StartAction.START_FROM_CACHE, 0L);
        this.f67212h.Oj(this.f67208d, this.f67205a, wxaLiteAppInfo, this.f67209e, this.f67210f, this.f67211g);
    }
}
