package com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch;

/* loaded from: classes.dex */
public class d implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f79843d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f79844e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch.g f79845f;

    public d(com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch.g gVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f79845f = gVar;
        this.f79843d = lVar;
        this.f79844e = i17;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean = (com.tencent.mm.ipcinvoker.type.IPCBoolean) obj;
        com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch.g gVar = this.f79845f;
        int i17 = this.f79844e;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f79843d;
        if (iPCBoolean == null || !iPCBoolean.f68400d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiSetBackgroundFetchToken", "setBackgroundFetchToken fail");
            lVar.a(i17, gVar.o("fail"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiSetBackgroundFetchToken", "setBackgroundFetchToken success");
        gVar.getClass();
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
        lVar.a(i17, gVar.u(str, jSONObject));
    }
}
