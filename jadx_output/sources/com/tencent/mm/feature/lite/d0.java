package com.tencent.mm.feature.lite;

/* loaded from: classes15.dex */
public class d0 implements kh0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3[] f67133a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q80.f0 f67134b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.report.WxaLiteAppStartReport f67135c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f67136d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f67137e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f67138f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData f67139g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.lite.i f67140h;

    public d0(com.tencent.mm.feature.lite.i iVar, com.tencent.mm.ui.widget.dialog.u3[] u3VarArr, q80.f0 f0Var, com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport, java.lang.String str, android.content.Context context, android.os.Bundle bundle, com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData openExtraData) {
        this.f67140h = iVar;
        this.f67133a = u3VarArr;
        this.f67134b = f0Var;
        this.f67135c = wxaLiteAppStartReport;
        this.f67136d = str;
        this.f67137e = context;
        this.f67138f = bundle;
        this.f67139g = openExtraData;
    }

    @Override // kh0.e
    public void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppFeatureService", "checkGameLiteApp onError: " + str);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f67133a[0];
        if (u3Var != null) {
            u3Var.cancel();
        }
        com.tencent.mm.feature.lite.i.wi(this.f67140h, this.f67134b, false);
        com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport = this.f67135c;
        wxaLiteAppStartReport.f46006p = false;
        wxaLiteAppStartReport.f46005o = java.lang.System.currentTimeMillis() - wxaLiteAppStartReport.f46004n;
        wxaLiteAppStartReport.I.logStart(com.tencent.liteapp.gen.StartAction.EXTERNAL_PACKAGE_LOADING_FAILED);
        com.tencent.mm.plugin.lite.logic.g1.s().N(this.f67136d, false, false, 23, wxaLiteAppStartReport.f46005o);
    }

    @Override // kh0.e
    public void onSuccess(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppFeatureService", "checkGameLiteApp onSuccess: " + str);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f67133a[0];
        if (u3Var != null) {
            u3Var.cancel();
        }
        com.tencent.liteapp.storage.WxaLiteAppInfo y17 = com.tencent.mm.plugin.lite.logic.g1.s().y(str, null);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport = this.f67135c;
        wxaLiteAppStartReport.f46005o = currentTimeMillis - wxaLiteAppStartReport.f46004n;
        q80.f0 f0Var = this.f67134b;
        com.tencent.mm.feature.lite.i iVar = this.f67140h;
        if (y17 == null) {
            com.tencent.mm.feature.lite.i.wi(iVar, f0Var, false);
            wxaLiteAppStartReport.f46006p = false;
            com.tencent.mm.plugin.lite.logic.g1.s().N(str, false, false, 23, wxaLiteAppStartReport.f46005o);
        } else {
            com.tencent.mm.feature.lite.i.wi(iVar, f0Var, true);
            wxaLiteAppStartReport.f46006p = true;
            wxaLiteAppStartReport.I.logStart(com.tencent.liteapp.gen.StartAction.EXTERNAL_PACKAGE_LOADING_SUCCESS);
            wxaLiteAppStartReport.I.logStart(com.tencent.liteapp.gen.StartAction.START_FROM_CACHE, 3L);
            this.f67140h.Nj(this.f67137e, this.f67138f, this.f67135c, y17, this.f67139g, this.f67134b);
        }
    }
}
