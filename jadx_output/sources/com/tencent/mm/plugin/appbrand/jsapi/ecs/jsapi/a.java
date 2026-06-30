package com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi;

/* loaded from: classes.dex */
public final class a implements c00.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.service.c0 f80787a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.k0 f80788b;

    /* renamed from: c, reason: collision with root package name */
    public final int f80789c;

    public a(com.tencent.mm.plugin.appbrand.service.c0 env, com.tencent.mm.plugin.appbrand.jsapi.k0 jsapi, int i17) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(jsapi, "jsapi");
        this.f80787a = env;
        this.f80788b = jsapi;
        this.f80789c = i17;
    }

    @Override // c00.n3
    public void a() {
        com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var = this.f80788b;
        k0Var.getClass();
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errno", 4);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        this.f80787a.a(this.f80789c, k0Var.u(str, jSONObject));
    }

    @Override // c00.n3
    public void b(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var = this.f80788b;
        k0Var.getClass();
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        try {
            jSONObject.put("errno", 0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        this.f80787a.a(this.f80789c, k0Var.u(str, jSONObject));
    }

    @Override // c00.n3
    public void c(c00.x2 event) {
        kotlin.jvm.internal.o.g(event, "event");
        this.f80787a.g("onEcsEvent", ((v00.a) event).a());
    }

    @Override // c00.n3
    public void d(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var = this.f80788b;
        k0Var.getClass();
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        try {
            jSONObject.put("errno", 4);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        this.f80787a.a(this.f80789c, k0Var.u(str, jSONObject));
    }

    @Override // c00.n3
    public void onCancel() {
        com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var = this.f80788b;
        k0Var.getClass();
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "cancel" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errno", 1);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        this.f80787a.a(this.f80789c, k0Var.u(str, jSONObject));
    }
}
