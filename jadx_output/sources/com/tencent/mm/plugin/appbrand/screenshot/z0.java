package com.tencent.mm.plugin.appbrand.screenshot;

/* loaded from: classes7.dex */
public final class z0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "returnGeneratedPoster";

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.screenshot.u0 f88596g = new com.tencent.mm.plugin.appbrand.screenshot.u0(null);

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f88597h = new java.util.concurrent.ConcurrentHashMap();

    public static final java.lang.Object C(com.tencent.mm.plugin.appbrand.screenshot.z0 z0Var, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        z0Var.getClass();
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiReturnGeneratedPoster", "downloadImageSynchronously: imageUrl=" + r26.p0.E0(str, 50) + "..., savePath=" + str2);
        if (str2 == null || str2.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiReturnGeneratedPoster", "downloadImageSynchronously: savePath is null or empty");
            nVar.resumeWith(kotlin.Result.m521constructorimpl(null));
        } else {
            o11.f fVar = new o11.f();
            fVar.f342082f = str2;
            fVar.f342078b = true;
            fVar.f342077a = true;
            n11.a.b().d(str, fVar.a(), new com.tencent.mm.plugin.appbrand.screenshot.w0(str2, nVar));
        }
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a17;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope;
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        if (e9Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiReturnGeneratedPoster", "invoke: env is null");
            return;
        }
        java.lang.String a17 = com.tencent.mm.plugin.appbrand.utils.j1.a(jSONObject != null ? jSONObject.optString("customPosterUrl") : null, "");
        java.lang.String a18 = com.tencent.mm.plugin.appbrand.utils.j1.a(jSONObject != null ? jSONObject.optString("posterTaskId") : null, "");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiReturnGeneratedPoster", "invoke: posterTaskId=" + a18 + ", customPosterUrl=" + r26.p0.E0(a17, 50) + "...");
        if (a18.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiReturnGeneratedPoster", "posterTaskId is empty");
            D(e9Var, a18, i17);
            return;
        }
        if (a17.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiReturnGeneratedPoster", "customPosterUrl is empty, treating as failure");
            D(e9Var, a18, i17);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiReturnGeneratedPoster", "handleCustomPosterUrl: posterTaskId=" + a18 + ", url=" + r26.p0.E0(a17, 50) + "...");
            com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = e9Var.t3();
            if (t37 != null && (lifecycleScope = t37.Q) != null) {
                com.tencent.mm.sdk.coroutines.LifecycleScope.e(lifecycleScope, null, new com.tencent.mm.plugin.appbrand.screenshot.y0(a18, this, a17, null), 1, null);
            }
        }
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        java.lang.String str2 = str != null ? str : "";
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        e9Var.a(i17, u(str2, jSONObject2));
    }

    public final void D(com.tencent.mm.plugin.appbrand.e9 e9Var, java.lang.String str, int i17) {
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope;
        com.tencent.mars.xlog.Log.w("MicroMsg.JsApiReturnGeneratedPoster", "handleCustomPosterGenFailure: posterTaskId=" + str);
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = e9Var.t3();
        if (t37 == null || (lifecycleScope = t37.Q) == null) {
            return;
        }
        com.tencent.mm.sdk.coroutines.LifecycleScope.e(lifecycleScope, null, new com.tencent.mm.plugin.appbrand.screenshot.x0(str, null), 1, null);
    }
}
