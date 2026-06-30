package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

/* loaded from: classes7.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f82281d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ze.n f82282e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f82283f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f82284g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f82285h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.z f82286i;

    public y(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, ze.n nVar, java.lang.Object obj, com.tencent.mm.plugin.appbrand.y yVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.z zVar) {
        this.f82281d = appBrandRuntime;
        this.f82282e = nVar;
        this.f82283f = obj;
        this.f82284g = yVar;
        this.f82285h = i17;
        this.f82286i = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.e9 C0 = this.f82281d.C0();
        if (C0 != null) {
            com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.c cVar = new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.c();
            cVar.s("appid", this.f82282e.f74803n);
            cVar.s(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA, this.f82283f);
            C0.p(cVar);
        }
        com.tencent.mm.plugin.appbrand.y yVar = this.f82284g;
        int i17 = this.f82285h;
        com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.z zVar = this.f82286i;
        zVar.getClass();
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errno", 0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        yVar.a(i17, zVar.u(str, jSONObject));
    }
}
