package cc1;

/* loaded from: classes7.dex */
public final class z extends cc1.p {
    public static final int CTRL_INDEX = 1287;
    public static final java.lang.String NAME = "cryptoRemoveKey";

    @Override // cc1.p
    public java.lang.Object C(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, kotlin.coroutines.Continuation continuation) {
        java.lang.String optString = jSONObject.optString("keyAlias");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiCryptoRemoveKey", "keyAlias=" + optString);
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            java.lang.String str = android.text.TextUtils.isEmpty("fail:missing keyAlias") ? "fail:jsapi invalid request data" : "fail:missing keyAlias";
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            java.lang.String u17 = u(str, jSONObject2);
            kotlin.jvm.internal.o.f(u17, "makeReturnJson(...)");
            return u17;
        }
        cc1.m mVar = cc1.p.f40444g;
        java.security.KeyStore a17 = mVar.a();
        try {
            kotlin.jvm.internal.o.d(optString);
            a17.deleteEntry(mVar.b(lVar, optString));
            java.lang.String str3 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            if (str3 == null) {
                str3 = "";
            }
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 0);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            java.lang.String u18 = u(str3, jSONObject3);
            kotlin.jvm.internal.o.d(u18);
            return u18;
        } catch (java.security.KeyStoreException unused) {
            java.lang.String str5 = android.text.TextUtils.isEmpty("fail:remove key fail") ? "fail:internal error" : "fail:remove key fail";
            java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            try {
                jSONObject4.put("errno", 4);
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            java.lang.String u19 = u(str5, jSONObject4);
            kotlin.jvm.internal.o.d(u19);
            return u19;
        }
    }
}
