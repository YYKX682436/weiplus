package com.tencent.mm.feature.lite;

/* loaded from: classes15.dex */
public class m0 implements com.tencent.mm.plugin.lite.api.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f67213a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.report.WxaLiteAppStartReport f67214b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f67215c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f67216d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData f67217e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q80.f0 f67218f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f67219g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.lite.i f67220h;

    public m0(com.tencent.mm.feature.lite.i iVar, com.tencent.mm.ui.widget.dialog.u3 u3Var, com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport, android.content.Context context, android.os.Bundle bundle, com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData openExtraData, q80.f0 f0Var, java.lang.String str) {
        this.f67220h = iVar;
        this.f67213a = u3Var;
        this.f67214b = wxaLiteAppStartReport;
        this.f67215c = context;
        this.f67216d = bundle;
        this.f67217e = openExtraData;
        this.f67218f = f0Var;
        this.f67219g = str;
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void fail(java.lang.String str, int i17) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f67213a;
        if (u3Var != null) {
            u3Var.cancel();
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("result", "fail");
        hashMap.put("errCode", java.lang.String.valueOf(i17));
        com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport = this.f67214b;
        com.tencent.mm.feature.lite.i.ck(wxaLiteAppStartReport, "Android.Feature.checkUpdate.sync", false, hashMap);
        com.tencent.mars.xlog.Log.w("MicroMsg.LiteAppFeatureService", "checkLiteApp fail:" + str);
        com.tencent.liteapp.gen.LiteAppReporter liteAppReporter = wxaLiteAppStartReport.I;
        if (liteAppReporter != null) {
            long j17 = i17;
            liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.SYNC_CHECK_PACKAGE_UPDATE_FAILED, j17);
            wxaLiteAppStartReport.I.logStart(com.tencent.liteapp.gen.StartAction.GET_PACKAGE_INFO_FINAL_FAILED, j17);
        }
        wxaLiteAppStartReport.f46006p = false;
        wxaLiteAppStartReport.f46005o = java.lang.System.currentTimeMillis() - wxaLiteAppStartReport.f46004n;
        com.tencent.mm.plugin.lite.logic.g1.s().N(str, false, false, i17 == 8 ? 24 : i17 == 9 ? 20 : i17 == 10 ? 25 : 23, wxaLiteAppStartReport.f46005o);
        q80.f0 f0Var = this.f67218f;
        if (f0Var != null) {
            if (i17 != 9) {
                f0Var.fail();
            } else {
                f0Var.cancel();
            }
        }
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void success(com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo, int i17) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f67213a;
        if (u3Var != null) {
            u3Var.cancel();
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("result", "ok");
        hashMap.put("errCode", java.lang.String.valueOf(i17));
        hashMap.put("hasInfo", java.lang.String.valueOf(wxaLiteAppInfo != null));
        com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport = this.f67214b;
        com.tencent.mm.feature.lite.i.ck(wxaLiteAppStartReport, "Android.Feature.checkUpdate.sync", false, hashMap);
        com.tencent.liteapp.gen.LiteAppReporter liteAppReporter = wxaLiteAppStartReport.I;
        if (liteAppReporter != null && wxaLiteAppInfo != null) {
            liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.SYNC_CHECK_PACKAGE_UPDATE_SUCCESS, wxaLiteAppInfo.iLinkVersion);
            wxaLiteAppStartReport.I.logStart(com.tencent.liteapp.gen.StartAction.START_FROM_CACHE, 0L);
        }
        wxaLiteAppStartReport.f46006p = true;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport2 = this.f67214b;
        wxaLiteAppStartReport.f46005o = currentTimeMillis - wxaLiteAppStartReport2.f46004n;
        this.f67220h.Nj(this.f67215c, this.f67216d, wxaLiteAppStartReport2, wxaLiteAppInfo, this.f67217e, this.f67218f);
        com.tencent.mm.plugin.lite.logic.g1.s().N(this.f67219g, false, true, i17 == 1 ? 2 : i17 == 8 ? 4 : i17 == 10 ? 5 : 3, wxaLiteAppStartReport.f46005o);
        q80.f0 f0Var = this.f67218f;
        if (f0Var != null) {
            if (i17 != 9) {
                f0Var.success();
            } else {
                f0Var.cancel();
            }
        }
    }
}
