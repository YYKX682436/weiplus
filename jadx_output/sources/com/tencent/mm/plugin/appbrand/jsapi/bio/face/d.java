package com.tencent.mm.plugin.appbrand.jsapi.bio.face;

/* loaded from: classes7.dex */
public abstract class d extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static void C(com.tencent.mm.plugin.appbrand.jsapi.bio.face.d dVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, android.os.Bundle bundle, java.lang.String str) {
        int i18;
        java.lang.String str2;
        java.lang.String str3;
        dVar.getClass();
        if (bundle != null) {
            i18 = bundle.getInt("err_code", 90199);
            str2 = bundle.getString("err_msg");
            str3 = bundle.getString("verify_result");
        } else {
            i18 = -1;
            str2 = "not returned";
            str3 = "";
        }
        java.util.HashMap hashMap = new java.util.HashMap(3);
        hashMap.put("errCode", java.lang.Integer.valueOf(i18));
        hashMap.put("verifyResult", str3);
        if ("fail".equals(str)) {
            str = str + " " + str2;
        }
        lVar.a(i17, dVar.p(str, hashMap));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        android.app.Activity a17 = q75.a.a(lVar.getContext());
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiFaceAsyncBase", "JsApiFaceAsyncBase context is null, appId is %s", lVar.getAppId());
            lVar.a(i17, o("fail:internal error invalid android context"));
            return;
        }
        java.lang.String optString = jSONObject.optString("requestVerifyPreInfo");
        int optInt = jSONObject.optInt("checkAliveType");
        java.lang.String appId = lVar.getAppId();
        int i18 = H() ? 1001 : 1000;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("k_need_signature", true);
        bundle.putInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 5);
        bundle.putBoolean("needVideo", H());
        bundle.putBoolean("is_check_dyncfg", false);
        bundle.putString("appId", appId);
        bundle.putString("request_verify_pre_info", optString);
        bundle.putInt("key_business_type", 4);
        bundle.putString("key_function_name", E());
        bundle.putInt("check_alive_type", optInt);
        bundle.putInt("identify_type", F());
        bundle.putBoolean("key_is_need_confirm_page", G());
        D(bundle);
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(a17, "com.tencent.mm.plugin.facedetect.ui.FaceTransparentStubUI");
        intent.putExtra("KEY_EXTRAS", bundle);
        intent.putExtra("KEY_REQUEST_CODE", i18);
        com.tencent.mm.plugin.appbrand.jsapi.nfc.e eVar = (com.tencent.mm.plugin.appbrand.jsapi.nfc.e) nd.f.a(com.tencent.mm.plugin.appbrand.jsapi.nfc.e.class);
        boolean b17 = eVar != null ? hd1.w.f280435c.b(lVar) : false;
        if (b17) {
            ((com.tencent.mm.plugin.appbrand.utils.j5) eVar).a(false);
        }
        nf.g.a(a17).f(new com.tencent.mm.plugin.appbrand.jsapi.bio.face.c(this, b17, eVar, lVar, i17));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(a17, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/bio/face/JsApiFaceAsyncBase", "invoke", "(Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponent;Lorg/json/JSONObject;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public void D(android.os.Bundle bundle) {
    }

    public abstract java.lang.String E();

    public int F() {
        return 0;
    }

    public boolean G() {
        return !(this instanceof com.tencent.mm.plugin.appbrand.jsapi.bio.face.g);
    }

    public abstract boolean H();
}
