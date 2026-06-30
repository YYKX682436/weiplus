package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class f8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f80880d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f80881e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f80882f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.g8 f80883g;

    public f8(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, com.tencent.mm.plugin.appbrand.y yVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.g8 g8Var) {
        this.f80880d = appBrandRuntime;
        this.f80881e = yVar;
        this.f80882f = i17;
        this.f80883g = g8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.o6 o6Var = (com.tencent.mm.plugin.appbrand.o6) this.f80880d;
        ((com.tencent.mm.plugin.appbrand.rd) o6Var.f471744d2.b()).f87766c = true;
        com.tencent.mm.plugin.appbrand.launching.n2.a(o6Var);
        com.tencent.mm.plugin.appbrand.jsapi.g8 g8Var = this.f80883g;
        g8Var.getClass();
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
        this.f80881e.a(this.f80882f, g8Var.u(str, jSONObject));
    }
}
