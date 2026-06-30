package cc1;

/* loaded from: classes7.dex */
public final class z extends cc1.p {

    /* renamed from: CTRL_INDEX */
    public static final int f4298x366c91de = 1287;

    /* renamed from: NAME */
    public static final java.lang.String f4299x24728b = "cryptoRemoveKey";

    @Override // cc1.p
    public java.lang.Object C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.String optString = jSONObject.optString("keyAlias");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiCryptoRemoveKey", "keyAlias=" + optString);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            java.lang.String str = android.text.TextUtils.isEmpty("fail:missing keyAlias") ? "fail:jsapi invalid request data" : "fail:missing keyAlias";
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            java.lang.String u17 = u(str, jSONObject2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(u17, "makeReturnJson(...)");
            return u17;
        }
        cc1.m mVar = cc1.p.f121977g;
        java.security.KeyStore a17 = mVar.a();
        try {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            a17.deleteEntry(mVar.b(lVar, optString));
            java.lang.String str3 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            if (str3 == null) {
                str3 = "";
            }
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 0);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            java.lang.String u18 = u(str3, jSONObject3);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u18);
            return u18;
        } catch (java.security.KeyStoreException unused) {
            java.lang.String str5 = android.text.TextUtils.isEmpty("fail:remove key fail") ? "fail:internal error" : "fail:remove key fail";
            java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            try {
                jSONObject4.put("errno", 4);
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            java.lang.String u19 = u(str5, jSONObject4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u19);
            return u19;
        }
    }
}
