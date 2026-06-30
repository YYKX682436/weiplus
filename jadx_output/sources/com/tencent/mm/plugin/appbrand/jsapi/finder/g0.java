package com.tencent.mm.plugin.appbrand.jsapi.finder;

/* loaded from: classes7.dex */
public final class g0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1395;
    public static final java.lang.String NAME = "openFinderChattingUI";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        if (jSONObject == null || e9Var == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenFinderChattingUI", "Invoke openFinderChattingUI with params " + jSONObject);
        java.lang.String optString = jSONObject.optString("toUsername");
        int optInt = jSONObject.optInt("sourceType", 0);
        android.content.Context f147807d = e9Var.getF147807d();
        kotlin.jvm.internal.o.f(f147807d, "getContext(...)");
        kotlin.jvm.internal.o.d(optString);
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.i("OpenFinderChattingUIProxy", "enterFinderChattingUI from main process");
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.e1.f460472a.l(f147807d, optString, optInt);
        } else {
            com.tencent.mars.xlog.Log.i("OpenFinderChattingUIProxy", "enterFinderChattingUI from appbrand process");
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("userName", optString);
            jSONObject2.put("sourceType", optInt);
            java.lang.String jSONObject3 = jSONObject2.toString();
            kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
            com.tencent.mm.plugin.appbrand.jsapi.finder.OpenFinderChattingUIProxy$OpenFinderChattingUIRequest openFinderChattingUIProxy$OpenFinderChattingUIRequest = new com.tencent.mm.plugin.appbrand.jsapi.finder.OpenFinderChattingUIProxy$OpenFinderChattingUIRequest(jSONObject3);
            java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
            com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(f147807d, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, openFinderChattingUIProxy$OpenFinderChattingUIRequest, null, null);
        }
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
        try {
            jSONObject4.put("errno", 0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        e9Var.a(i17, u(str, jSONObject4));
    }
}
