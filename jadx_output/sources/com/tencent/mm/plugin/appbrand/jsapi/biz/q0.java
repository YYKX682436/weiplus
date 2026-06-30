package com.tencent.mm.plugin.appbrand.jsapi.biz;

/* loaded from: classes.dex */
public final class q0 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f80001d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f80002e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.biz.x0 f80003f;

    public q0(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.biz.x0 x0Var) {
        this.f80001d = lVar;
        this.f80002e = i17;
        this.f80003f = x0Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(iPCString != null ? iPCString.f68406d : null);
        com.tencent.mm.plugin.appbrand.jsapi.biz.x0 x0Var = this.f80003f;
        int i17 = this.f80002e;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f80001d;
        if (K0) {
            x0Var.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "fail:cgi failed for response null" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 109);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, x0Var.u(str2, jSONObject));
            return;
        }
        try {
            kotlin.jvm.internal.o.d(iPCString);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(iPCString.f68406d);
            x0Var.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            try {
                jSONObject2.put("errno", 0);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            lVar.a(i17, x0Var.u(str2, jSONObject2));
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandleBrandPersonalCenterAction", "Failed to parse JSON string: " + e19.getMessage());
        }
    }
}
