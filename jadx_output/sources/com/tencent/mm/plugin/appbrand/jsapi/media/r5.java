package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public class r5 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.s5 f82027a;

    public r5(com.tencent.mm.plugin.appbrand.jsapi.media.s5 s5Var) {
        this.f82027a = s5Var;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCropImage", "onResult, requestCode:%d, resultCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 != this.f82027a.f82049f.f82082f.f82089g) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiCropImage", "onActivityResult: not the requestCode");
            return false;
        }
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiCropImage", "onActivityResult: data null");
            com.tencent.mm.plugin.appbrand.jsapi.media.t5 t5Var = this.f82027a.f82049f;
            com.tencent.mm.plugin.appbrand.e9 e9Var = t5Var.f82078b;
            int i19 = t5Var.f82079c;
            com.tencent.mm.plugin.appbrand.jsapi.media.u5 u5Var = t5Var.f82082f;
            u5Var.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "cancel" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 1);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            e9Var.a(i19, u5Var.u(str2, jSONObject));
            return false;
        }
        java.lang.String stringExtra = intent.getStringExtra("CropImage_OutputPath");
        if (stringExtra == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiCropImage", "onActivityResult: crop path null");
            com.tencent.mm.plugin.appbrand.jsapi.media.t5 t5Var2 = this.f82027a.f82049f;
            com.tencent.mm.plugin.appbrand.e9 e9Var2 = t5Var2.f82078b;
            int i27 = t5Var2.f82079c;
            com.tencent.mm.plugin.appbrand.jsapi.media.u5 u5Var2 = t5Var2.f82082f;
            u5Var2.getClass();
            java.lang.String str4 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str4 != null ? str4 : "";
            java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            e9Var2.a(i27, u5Var2.u(str2, jSONObject2));
            return false;
        }
        if (i18 == -1) {
            ik1.b0 b0Var = new ik1.b0();
            if (this.f82027a.f82049f.f82078b.getFileSystem() != null) {
                this.f82027a.f82049f.f82078b.getFileSystem().createTempFileFrom(new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(stringExtra)), com.tencent.mm.vfs.w6.n(stringExtra), true, b0Var);
            }
            java.lang.String str6 = (java.lang.String) b0Var.f291824a;
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCropImage", "path:%s, callbackTempPath:%s", stringExtra, str6);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("tempFilePath", str6);
            com.tencent.mm.plugin.appbrand.jsapi.media.t5 t5Var3 = this.f82027a.f82049f;
            com.tencent.mm.plugin.appbrand.e9 e9Var3 = t5Var3.f82078b;
            int i28 = t5Var3.f82079c;
            com.tencent.mm.plugin.appbrand.jsapi.media.u5 u5Var3 = t5Var3.f82082f;
            u5Var3.getClass();
            java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap.put("errno", 0);
            e9Var3.a(i28, u5Var3.t("ok", hashMap));
        } else {
            com.tencent.mm.vfs.w6.h(stringExtra);
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiCropImage", "onActivityResult: resultCode error");
            com.tencent.mm.plugin.appbrand.jsapi.media.t5 t5Var4 = this.f82027a.f82049f;
            com.tencent.mm.plugin.appbrand.e9 e9Var4 = t5Var4.f82078b;
            int i29 = t5Var4.f82079c;
            com.tencent.mm.plugin.appbrand.jsapi.media.u5 u5Var4 = t5Var4.f82082f;
            u5Var4.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "cancel" : null;
            str2 = str != null ? str : "";
            java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 1);
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            e9Var4.a(i29, u5Var4.u(str2, jSONObject3));
        }
        if (this.f82027a.f82047d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCropImage", "onResult, delete created resolved file");
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(this.f82027a.f82048e);
            java.lang.String str9 = a17.f213279f;
            if (str9 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str9, false, false);
                if (!a17.f213279f.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            if (m17.a()) {
                m17.f213266a.d(m17.f213267b);
            }
        }
        return true;
    }
}
