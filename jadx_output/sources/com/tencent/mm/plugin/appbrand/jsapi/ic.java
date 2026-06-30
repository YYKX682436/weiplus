package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class ic implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.d0 f81313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f81314e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.jc f81315f;

    public ic(com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.jc jcVar) {
        this.f81313d = d0Var;
        this.f81314e = i17;
        this.f81315f = jcVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        java.lang.String str;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle == null || (str = bundle.getString("ret")) == null) {
            str = "fail";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRequestPayAuthen", "callback ret is：%s", str);
        boolean b17 = kotlin.jvm.internal.o.b(str, "ok");
        com.tencent.mm.plugin.appbrand.jsapi.jc jcVar = this.f81315f;
        int i17 = this.f81314e;
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = this.f81313d;
        if (!b17) {
            jcVar.getClass();
            android.text.TextUtils.isEmpty("fail");
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", -1);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            d0Var.a(i17, jcVar.u("fail", jSONObject));
            return;
        }
        jcVar.getClass();
        java.lang.String str3 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 0);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        d0Var.a(i17, jcVar.u(str3, jSONObject2));
    }
}
