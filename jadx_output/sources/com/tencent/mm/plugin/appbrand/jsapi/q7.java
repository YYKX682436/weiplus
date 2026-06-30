package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public class q7 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f82858d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82859e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82860f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82861g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82862h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82863i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f82864m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.x7 f82865n;

    public q7(com.tencent.mm.plugin.appbrand.jsapi.x7 x7Var, com.tencent.mm.plugin.appbrand.e9 e9Var, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i17) {
        this.f82865n = x7Var;
        this.f82858d = e9Var;
        this.f82859e = str;
        this.f82860f = str2;
        this.f82861g = str3;
        this.f82862h = str4;
        this.f82863i = str5;
        this.f82864m = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18 = this.f82864m;
        com.tencent.mm.plugin.appbrand.jsapi.x7 x7Var = this.f82865n;
        x7Var.getClass();
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f82858d;
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.jsapi.p7(x7Var, e9Var));
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("appId", this.f82859e);
            jSONObject.put("taskUrl", this.f82860f);
            jSONObject.put("taskName", this.f82861g);
            jSONObject.put("fileMd5", this.f82862h);
            jSONObject.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME, this.f82863i);
            new com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplicationDirectly$AddDownloadTaskStraightTask(x7Var, e9Var, i18, jSONObject).d();
            e9Var.a(i18, x7Var.o("ok:user downloaded app"));
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiLaunchApplicationDirectly", "launchApplication, download app fail", e17);
            e9Var.a(i18, x7Var.o("fail:download app fail"));
        }
    }
}
