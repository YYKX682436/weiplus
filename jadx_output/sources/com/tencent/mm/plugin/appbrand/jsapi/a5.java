package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class a5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f78692d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f78693e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f78694f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.b5 f78695g;

    public a5(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.b5 b5Var) {
        this.f78692d = appBrandRuntime;
        this.f78693e = e9Var;
        this.f78694f = i17;
        this.f78695g = b5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f78692d.U();
        com.tencent.mm.plugin.appbrand.jsapi.b5 b5Var = this.f78695g;
        b5Var.getClass();
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
        this.f78693e.a(this.f78694f, b5Var.u(str, jSONObject));
    }
}
