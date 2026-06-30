package ci1;

/* loaded from: classes7.dex */
public class c extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1468;
    private static final java.lang.String NAME = "getChatForwardMaterials";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        ci1.a aVar;
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        com.tencent.mars.xlog.Log.i("Luggage.JsApiGetChatForwardMaterials", "getChatForwardMaterials data: " + jSONObject);
        if (e9Var == null) {
            com.tencent.mars.xlog.Log.w("Luggage.JsApiGetChatForwardMaterials", "getChatForwardMaterials fail, env is null");
            return;
        }
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.w("Luggage.JsApiGetChatForwardMaterials", "getChatForwardMaterials fail, data is null");
            str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            e9Var.a(i17, u(str2, jSONObject2));
            return;
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime = e9Var.getRuntime();
        if (runtime != null) {
            aVar = (ci1.a) runtime.k(ci1.a.class);
            if (aVar == null) {
                aVar = new ci1.a();
                runtime.l(aVar);
            }
        } else {
            aVar = null;
        }
        kotlin.jvm.internal.o.d(aVar);
        bi1.f fVar = aVar.f41660d;
        if (fVar == null) {
            com.tencent.mars.xlog.Log.w("Luggage.JsApiGetChatForwardMaterials", "materialData is null, return");
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 4);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            e9Var.a(i17, u(str2, jSONObject3));
            return;
        }
        java.lang.String str5 = fVar.f20983e;
        if (!kotlin.jvm.internal.o.b(str5, "chat")) {
            com.tencent.mars.xlog.Log.w("Luggage.JsApiGetChatForwardMaterials", "materialOrigin is " + str5 + ", return");
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            try {
                jSONObject4.put("errno", 4);
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            e9Var.a(i17, u(str2, jSONObject4));
            return;
        }
        boolean optBoolean = jSONObject.optBoolean("needGroupOpenID", false);
        j91.d dVar = (j91.d) e9Var.getRuntime().K1(j91.d.class);
        kotlin.jvm.internal.o.d(dVar);
        com.tencent.mm.plugin.appbrand.jsapi.chattool.t tVar = (com.tencent.mm.plugin.appbrand.jsapi.chattool.t) dVar;
        java.lang.String d17 = tVar.d();
        boolean g17 = tVar.g();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new ci1.b(optBoolean, g17, d17, fVar, e9Var, i17, this, null), 3, null);
            return;
        }
        com.tencent.mars.xlog.Log.w("Luggage.JsApiGetChatForwardMaterials", "sendToUserName is null, return");
        str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
        str2 = str != null ? str : "";
        java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject5 = new org.json.JSONObject();
        try {
            jSONObject5.put("errno", 4);
        } catch (java.lang.Exception e27) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
        }
        e9Var.a(i17, u(str2, jSONObject5));
    }
}
