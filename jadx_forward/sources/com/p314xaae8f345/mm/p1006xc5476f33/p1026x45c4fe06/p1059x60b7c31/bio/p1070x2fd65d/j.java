package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d;

/* loaded from: classes7.dex */
public class j extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f33899x366c91de = 495;

    /* renamed from: NAME */
    public static final java.lang.String f33900x24728b = "faceVerifyForPay";

    public static void C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.j jVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, android.os.Bundle bundle, java.lang.String str) {
        int i18;
        java.lang.String str2;
        boolean z17;
        java.lang.String str3;
        java.lang.String str4;
        jVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiStartFaceAction", "callbackResult :%s", str);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiStartFaceAction", "errCode :%s, errMsg:%s , token:%s, serialId:%s, mClickOtherVerifyBtn:%s, mClickOtherVerifyBtnFront:%s", java.lang.Integer.valueOf(i18), str2, string, string2, java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z18));
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

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        this.f162871e = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiStartFaceAction", " start JsApiStartFaceAction（） ");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(917L, 35L, 1L, false);
        android.app.Activity a17 = q75.a.a(lVar.mo50352x76847179());
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiStartFaceAction", "JsApiFaceAsyncBase context is null, appId is %s", lVar.mo48798x74292566());
            lVar.a(i17, o("fail:internal error invalid android context"));
            return;
        }
        int optInt = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
        java.lang.String optString = jSONObject.optString("package");
        java.lang.String optString2 = jSONObject.optString("packageSign");
        java.lang.String optString3 = jSONObject.optString("otherVerifyTitle");
        java.lang.String optString4 = jSONObject.optString("otherVerifyTitleFront");
        java.lang.String optString5 = jSONObject.optString("needFrontPage");
        java.lang.String optString6 = jSONObject.optString("faceVerifyTitle");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiStartFaceAction", " packageName ：%s , packageSign:%s , otherVerifyTitle:%s , otherVerifyTitleFront:%s, needFrontPage:%s，faceVerifyTitle：%s", optString, optString2, optString3, optString4, optString5, optString6);
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(a17, "com.tencent.mm.plugin.facedetectaction.ui.FaceTransStubUI");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, optInt);
        bundle.putString("package", optString);
        bundle.putString("packageSign", optString2);
        bundle.putString("otherVerifyTitle", optString3);
        bundle.putString("otherVerifyTitleFront", optString4);
        bundle.putString("needFrontPage", optString5);
        bundle.putString("faceVerifyTitle", optString6);
        intent.putExtras(bundle);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.e eVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.e) nd.f.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.e.class);
        boolean b17 = eVar != null ? hd1.w.f361968c.b(lVar) : false;
        if (b17) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.j5) eVar).a(false);
        }
        nf.g.a(a17).f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.i(this, b17, eVar, lVar, i17));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(63);
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(a17, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/bio/face/JsApiStartFaceAction", "invoke", "(Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponent;Lorg/json/JSONObject;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }
}
