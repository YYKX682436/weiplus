package com.tencent.mm.plugin.appbrand.screenshot;

/* loaded from: classes7.dex */
public final class a1 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "returnTakeScreenshot";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        if (e9Var == null) {
            return;
        }
        java.lang.String enterPath = com.tencent.mm.plugin.appbrand.utils.j1.a(jSONObject != null ? jSONObject.optString("url") : null, "");
        com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime = e9Var.getRuntime();
        if (runtime != null) {
            com.tencent.mm.plugin.appbrand.screenshot.g0 g0Var = (com.tencent.mm.plugin.appbrand.screenshot.g0) runtime.k(com.tencent.mm.plugin.appbrand.screenshot.g0.class);
            if (g0Var == null) {
                g0Var = new com.tencent.mm.plugin.appbrand.screenshot.g0();
                runtime.l(g0Var);
            }
            kotlin.jvm.internal.o.g(enterPath, "enterPath");
            java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = g0Var.f88486d;
            java.util.ArrayList arrayList = new java.util.ArrayList(copyOnWriteArraySet);
            copyOnWriteArraySet.clear();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.appbrand.screenshot.h0 h0Var = (com.tencent.mm.plugin.appbrand.screenshot.h0) it.next();
                h0Var.getClass();
                h0Var.a(com.tencent.mm.plugin.appbrand.utils.j1.a(enterPath, h0Var.f88490b));
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
}
