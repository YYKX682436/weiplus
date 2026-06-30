package com.tencent.mm.feature.lite;

/* loaded from: classes15.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.ui.WxaLiteAppBaseView f67225d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.storage.WxaLiteAppInfo f67226e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.report.WxaLiteAppStartReport f67227f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f67228g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q80.s f67229h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData f67230i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.lite.i f67231m;

    public n0(com.tencent.mm.feature.lite.i iVar, com.tencent.liteapp.ui.WxaLiteAppBaseView wxaLiteAppBaseView, com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo, com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport, android.os.Bundle bundle, q80.s sVar, com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData openExtraData) {
        this.f67231m = iVar;
        this.f67225d = wxaLiteAppBaseView;
        this.f67226e = wxaLiteAppInfo;
        this.f67227f = wxaLiteAppStartReport;
        this.f67228g = bundle;
        this.f67229h = sVar;
        this.f67230i = openExtraData;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.liteapp.storage.LiteAppReferrerInfo liteAppReferrerInfo;
        java.lang.String str;
        com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo = this.f67226e;
        java.lang.String str2 = wxaLiteAppInfo.appId;
        com.tencent.liteapp.ui.WxaLiteAppBaseView wxaLiteAppBaseView = this.f67225d;
        wxaLiteAppBaseView.f46051r = str2;
        java.lang.String str3 = wxaLiteAppInfo.path;
        wxaLiteAppBaseView.f46056w = str3;
        java.lang.String str4 = wxaLiteAppInfo.signatureKey;
        wxaLiteAppBaseView.f46055v = str4;
        com.tencent.mm.feature.lite.i iVar = this.f67231m;
        java.lang.String Ej = iVar.Ej(str3, str2, str4);
        com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport = this.f67227f;
        if (wxaLiteAppStartReport.I != null && !com.tencent.mm.sdk.platformtools.t8.K0(Ej)) {
            wxaLiteAppStartReport.I.setVersion(Ej);
        }
        android.os.Bundle bundle = this.f67228g;
        if (bundle.containsKey(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH)) {
            wxaLiteAppBaseView.f46052s = bundle.getString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
        }
        java.lang.String string = bundle.getString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, "");
        boolean isEmpty = string.isEmpty();
        q80.s sVar = this.f67229h;
        if (!isEmpty && !com.tencent.mm.plugin.lite.LiteAppCenter.checkSessionId(string)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppFeatureService", "open Liteapp in view fail, session ID already has an active instance");
            if (sVar != null) {
                sVar.fail();
                return;
            }
            return;
        }
        wxaLiteAppBaseView.f46054u = string;
        if (bundle.containsKey("query")) {
            wxaLiteAppBaseView.f46053t = bundle.getString("query");
        }
        com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData openExtraData = this.f67230i;
        if (openExtraData != null && (str = openExtraData.referrerInfo) != null) {
            liteAppReferrerInfo = com.tencent.liteapp.storage.LiteAppReferrerInfo.fromJsonString(str);
        } else if (bundle.containsKey("liteappReferrerInfo")) {
            liteAppReferrerInfo = (com.tencent.liteapp.storage.LiteAppReferrerInfo) bundle.getParcelable("liteappReferrerInfo");
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.LiteAppFeatureService", "no referrer info found");
            liteAppReferrerInfo = null;
        }
        com.tencent.mm.plugin.lite.w.h(wxaLiteAppInfo.appId, wxaLiteAppBaseView.f46052s, wxaLiteAppBaseView.f46053t, liteAppReferrerInfo);
        com.tencent.mm.plugin.lite.o oVar = com.tencent.mm.plugin.lite.p.f144149a;
        oVar.d();
        iVar.ij(wxaLiteAppInfo.appId, wxaLiteAppBaseView.f46052s);
        iVar.Xj();
        oVar.b(7, wxaLiteAppStartReport);
        boolean z17 = bundle.getBoolean("forbidSharedEngineGroup", false);
        if ((kx5.n.h().f313321k != null) && com.tencent.mm.sdk.platformtools.x2.n() && !z17) {
            kx5.n.h().n(new com.tencent.mm.feature.lite.o0(this));
        } else {
            wxaLiteAppBaseView.f();
            ((java.util.Set) ((java.util.concurrent.ConcurrentHashMap) iVar.f67174i).computeIfAbsent(wxaLiteAppBaseView.f46051r, new com.tencent.mm.feature.lite.n0$$a())).add(java.lang.Long.valueOf(wxaLiteAppBaseView.getAppUuid()));
            ((java.util.Set) ((java.util.concurrent.ConcurrentHashMap) iVar.f67175m).computeIfAbsent(wxaLiteAppBaseView.f46051r, new com.tencent.mm.feature.lite.n0$$b())).add(wxaLiteAppBaseView.f46054u);
            if (sVar != null) {
                sVar.a(wxaLiteAppBaseView);
            }
        }
        m93.i.INSTANCE.b(com.tencent.mm.plugin.lite.LiteAppCenter.getAuthUrl(wxaLiteAppInfo.path, wxaLiteAppInfo.appId, wxaLiteAppInfo.signatureKey, true), 0);
    }
}
