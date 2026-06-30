package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d;

/* loaded from: classes7.dex */
public abstract class f extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        boolean z17;
        java.lang.String str;
        java.util.ArrayList arrayList;
        android.app.Activity a17 = q75.a.a(lVar.mo50352x76847179());
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiFaceAsyncBaseV2", "JsApiFaceAsyncBaseV2 context is null, appId is %s", lVar.mo48798x74292566());
            lVar.a(i17, o("fail:internal error invalid android context"));
            return;
        }
        java.lang.String optString = jSONObject.optString("verify_id", "");
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("verify_id", optString);
            jSONObject2.put("version", 2);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiFaceAsyncBaseV2", "build verifyPreInfo failed: %s", e17.getMessage());
        }
        java.lang.String jSONObject3 = jSONObject2.toString();
        java.lang.String mo48798x74292566 = lVar.mo48798x74292566();
        int i18 = E() ? 1001 : 1000;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("k_need_signature", true);
        bundle.putInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 5);
        bundle.putBoolean("needVideo", E());
        bundle.putBoolean("is_check_dyncfg", false);
        bundle.putString("appId", mo48798x74292566);
        bundle.putString("request_verify_pre_info", jSONObject3);
        bundle.putInt("key_business_type", 4);
        bundle.putString("key_function_name", D());
        bundle.putInt("check_alive_type", 4);
        bundle.putInt("identify_type", 0);
        bundle.putBoolean("key_is_need_confirm_page", true);
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(a17, "com.tencent.mm.plugin.facedetect.ui.FaceTransparentStubUI");
        intent.putExtra("KEY_EXTRAS", bundle);
        intent.putExtra("KEY_REQUEST_CODE", i18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.e eVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.e) nd.f.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.e.class);
        boolean b17 = eVar != null ? hd1.w.f361968c.b(lVar) : false;
        if (b17) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.j5) eVar).a(false);
        }
        nf.g.a(a17).f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.e(this, b17, eVar, lVar, i17));
        try {
            arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            z17 = true;
            str = "MicroMsg.JsApiFaceAsyncBaseV2";
        } catch (java.lang.Exception e18) {
            e = e18;
            z17 = true;
            str = "MicroMsg.JsApiFaceAsyncBaseV2";
        }
        try {
            yj0.a.k(a17, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/bio/face/JsApiFaceAsyncBaseV2", "invoke", "(Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponent;Lorg/json/JSONObject;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        } catch (java.lang.Exception e19) {
            e = e19;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "startActivityForResult failed: %s", e.getMessage());
            if (b17) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.j5) eVar).a(z17);
            }
            C(lVar, i17, null, "fail");
        }
    }

    public final void C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, android.os.Bundle bundle, java.lang.String str) {
        int i18;
        java.lang.String str2;
        java.lang.String str3;
        jc1.d dVar;
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
        if ("ok".equals(str)) {
            dVar = jc1.f.f380445a;
        } else if ("cancel".equals(str)) {
            dVar = jc1.f.f380446b;
        } else {
            dVar = jc1.f.f380448d;
            str = str + " " + str2;
        }
        lVar.a(i17, q(str, dVar, hashMap));
    }

    public abstract java.lang.String D();

    public abstract boolean E();
}
