package com.tencent.mm.plugin.appbrand.jsapi.bio.soter;

/* loaded from: classes.dex */
public class k extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 277;
    public static final java.lang.String NAME = "startSoterAuthentication";

    public static void C(com.tencent.mm.plugin.appbrand.jsapi.bio.soter.k kVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, android.os.Bundle bundle, java.lang.String str) {
        int i18;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        byte b17;
        kVar.getClass();
        java.lang.String str5 = "";
        if (bundle != null) {
            i18 = bundle.getInt("err_code");
            str2 = bundle.getString("err_msg");
            str3 = bundle.getString("result_json");
            str4 = bundle.getString("result_json_signature");
            b17 = bundle.getByte("use_mode");
        } else {
            i18 = -1;
            str2 = "not returned";
            str3 = "";
            str4 = str3;
            b17 = 0;
        }
        org.json.JSONArray b18 = com.tencent.mm.plugin.appbrand.jsapi.bio.soter.a.b(b17);
        if (b18.length() > 0) {
            try {
                str5 = b18.getString(0);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiStartSoterAuthentication", e17, "hy: json error in callback", new java.lang.Object[0]);
            }
        }
        java.util.HashMap hashMap = new java.util.HashMap(5);
        hashMap.put("authMode", str5);
        hashMap.put("errCode", java.lang.Integer.valueOf(i18));
        hashMap.put("resultJSON", str3);
        hashMap.put("resultJSONSignature", str4);
        if ("fail".equals(str)) {
            str = str + " " + str2;
        }
        lVar.a(i17, kVar.p(str, hashMap));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiStartSoterAuthentication", "hy: JsApiStartSoterAuthentication");
        android.app.Activity a17 = q75.a.a(lVar.getContext());
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiStartSoterAuthentication", "JsApiStartSoterAuthentication context is null, appId is %s", lVar.getAppId());
            lVar.a(i17, o("fail:internal error invalid android context"));
            return;
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("requestAuthModes");
        java.lang.String optString = jSONObject.optString("challenge");
        java.lang.String optString2 = jSONObject.optString("authContent");
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(a17, "com.tencent.mm.plugin.soter.ui.SoterAuthenticationUIWC");
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = optJSONArray == null ? null : optJSONArray.toString();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSoterTranslateUtil", "hy: translating string array: %s", objArr);
        if (optJSONArray == null || optJSONArray.length() == 0) {
            str = "0x00";
        } else {
            byte b17 = 0;
            for (int i18 = 0; i18 < optJSONArray.length(); i18++) {
                try {
                    b17 = (byte) (b17 | com.tencent.mm.plugin.appbrand.jsapi.bio.soter.a.a(optJSONArray.getString(i18)));
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandSoterTranslateUtil", e17, "hy: json error in translate", new java.lang.Object[0]);
                }
            }
            str = "0x" + java.lang.Integer.toHexString(b17);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSoterTranslateUtil", "hy: translated bitsetStr: %s", str);
        }
        intent.putExtra("auth_mode", str);
        intent.putExtra("challenge", optString);
        intent.putExtra("auth_content", optString2);
        intent.putExtra("key_soter_fp_mp_scene", 0);
        nf.g.a(a17).f(new com.tencent.mm.plugin.appbrand.jsapi.bio.soter.j(this, lVar, i17));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(1000);
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(a17, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/bio/soter/JsApiStartSoterAuthentication", "invoke", "(Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponent;Lorg/json/JSONObject;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }
}
