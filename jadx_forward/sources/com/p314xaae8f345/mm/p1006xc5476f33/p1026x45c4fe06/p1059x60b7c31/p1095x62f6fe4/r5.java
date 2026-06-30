package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public class r5 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.s5 f163560a;

    public r5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.s5 s5Var) {
        this.f163560a = s5Var;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCropImage", "onResult, requestCode:%d, resultCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 != this.f163560a.f163582f.f163615f.f163622g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiCropImage", "onActivityResult: not the requestCode");
            return false;
        }
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiCropImage", "onActivityResult: data null");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.t5 t5Var = this.f163560a.f163582f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = t5Var.f163611b;
            int i19 = t5Var.f163612c;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.u5 u5Var = t5Var.f163615f;
            u5Var.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "cancel" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 1);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            e9Var.a(i19, u5Var.u(str2, jSONObject));
            return false;
        }
        java.lang.String stringExtra = intent.getStringExtra("CropImage_OutputPath");
        if (stringExtra == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiCropImage", "onActivityResult: crop path null");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.t5 t5Var2 = this.f163560a.f163582f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var2 = t5Var2.f163611b;
            int i27 = t5Var2.f163612c;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.u5 u5Var2 = t5Var2.f163615f;
            u5Var2.getClass();
            java.lang.String str4 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str4 != null ? str4 : "";
            java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            e9Var2.a(i27, u5Var2.u(str2, jSONObject2));
            return false;
        }
        if (i18 == -1) {
            ik1.b0 b0Var = new ik1.b0();
            if (this.f163560a.f163582f.f163611b.mo50354x59eafec1() != null) {
                this.f163560a.f163582f.f163611b.mo50354x59eafec1().mo49619x6aa75256(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(stringExtra)), com.p314xaae8f345.mm.vfs.w6.n(stringExtra), true, b0Var);
            }
            java.lang.String str6 = (java.lang.String) b0Var.f373357a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCropImage", "path:%s, callbackTempPath:%s", stringExtra, str6);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("tempFilePath", str6);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.t5 t5Var3 = this.f163560a.f163582f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var3 = t5Var3.f163611b;
            int i28 = t5Var3.f163612c;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.u5 u5Var3 = t5Var3.f163615f;
            u5Var3.getClass();
            java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap.put("errno", 0);
            e9Var3.a(i28, u5Var3.t("ok", hashMap));
        } else {
            com.p314xaae8f345.mm.vfs.w6.h(stringExtra);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiCropImage", "onActivityResult: resultCode error");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.t5 t5Var4 = this.f163560a.f163582f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var4 = t5Var4.f163611b;
            int i29 = t5Var4.f163612c;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.u5 u5Var4 = t5Var4.f163615f;
            u5Var4.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "cancel" : null;
            str2 = str != null ? str : "";
            java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 1);
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            e9Var4.a(i29, u5Var4.u(str2, jSONObject3));
        }
        if (this.f163560a.f163580d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCropImage", "onResult, delete created resolved file");
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(this.f163560a.f163581e);
            java.lang.String str9 = a17.f294812f;
            if (str9 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str9, false, false);
                if (!a17.f294812f.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            if (m17.a()) {
                m17.f294799a.d(m17.f294800b);
            }
        }
        return true;
    }
}
