package com.tencent.mm.plugin.appbrand.jsapi.bio.face;

/* loaded from: classes7.dex */
public class j extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 495;
    public static final java.lang.String NAME = "faceVerifyForPay";

    public static void C(com.tencent.mm.plugin.appbrand.jsapi.bio.face.j jVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, android.os.Bundle bundle, java.lang.String str) {
        int i18;
        java.lang.String str2;
        boolean z17;
        java.lang.String str3;
        java.lang.String str4;
        jVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiStartFaceAction", "callbackResult :%s", str);
        boolean z18 = false;
        if (bundle != null) {
            i18 = bundle.getInt("err_code");
            str2 = bundle.getString("err_msg");
            java.lang.String string = bundle.getString("token");
            java.lang.String string2 = bundle.getString("serial_id");
            boolean z19 = bundle.getString("click_other_verify_btn") != null && "yes".equals(bundle.getString("click_other_verify_btn"));
            if (bundle.getString("click_other_verify_btn_front") != null && "yes".equals(bundle.getString("click_other_verify_btn_front"))) {
                z18 = true;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiStartFaceAction", "errCode :%s, errMsg:%s , token:%s, serialId:%s, mClickOtherVerifyBtn:%s, mClickOtherVerifyBtnFront:%s", java.lang.Integer.valueOf(i18), str2, string, string2, java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z18));
            z17 = z18;
            str3 = string;
            str4 = string2;
            z18 = z19;
        } else {
            i18 = -1;
            str2 = "nothing return";
            z17 = false;
            str3 = "";
            str4 = str3;
        }
        java.util.HashMap hashMap = new java.util.HashMap(3);
        hashMap.put("err_code", java.lang.Integer.valueOf(i18));
        hashMap.put("token", str3);
        hashMap.put("serial_id", str4);
        hashMap.put("click_other_verify_btn", java.lang.Boolean.valueOf(z18));
        hashMap.put("click_other_verify_btn_front", java.lang.Boolean.valueOf(z17));
        lVar.a(i17, jVar.p(str2, hashMap));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        this.f81338e = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiStartFaceAction", " start JsApiStartFaceAction（） ");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(917L, 35L, 1L, false);
        android.app.Activity a17 = q75.a.a(lVar.getContext());
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiStartFaceAction", "JsApiFaceAsyncBase context is null, appId is %s", lVar.getAppId());
            lVar.a(i17, o("fail:internal error invalid android context"));
            return;
        }
        int optInt = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        java.lang.String optString = jSONObject.optString("package");
        java.lang.String optString2 = jSONObject.optString("packageSign");
        java.lang.String optString3 = jSONObject.optString("otherVerifyTitle");
        java.lang.String optString4 = jSONObject.optString("otherVerifyTitleFront");
        java.lang.String optString5 = jSONObject.optString("needFrontPage");
        java.lang.String optString6 = jSONObject.optString("faceVerifyTitle");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiStartFaceAction", " packageName ：%s , packageSign:%s , otherVerifyTitle:%s , otherVerifyTitleFront:%s, needFrontPage:%s，faceVerifyTitle：%s", optString, optString2, optString3, optString4, optString5, optString6);
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(a17, "com.tencent.mm.plugin.facedetectaction.ui.FaceTransStubUI");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, optInt);
        bundle.putString("package", optString);
        bundle.putString("packageSign", optString2);
        bundle.putString("otherVerifyTitle", optString3);
        bundle.putString("otherVerifyTitleFront", optString4);
        bundle.putString("needFrontPage", optString5);
        bundle.putString("faceVerifyTitle", optString6);
        intent.putExtras(bundle);
        com.tencent.mm.plugin.appbrand.jsapi.nfc.e eVar = (com.tencent.mm.plugin.appbrand.jsapi.nfc.e) nd.f.a(com.tencent.mm.plugin.appbrand.jsapi.nfc.e.class);
        boolean b17 = eVar != null ? hd1.w.f280435c.b(lVar) : false;
        if (b17) {
            ((com.tencent.mm.plugin.appbrand.utils.j5) eVar).a(false);
        }
        nf.g.a(a17).f(new com.tencent.mm.plugin.appbrand.jsapi.bio.face.i(this, b17, eVar, lVar, i17));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(63);
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(a17, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/bio/face/JsApiStartFaceAction", "invoke", "(Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponent;Lorg/json/JSONObject;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }
}
