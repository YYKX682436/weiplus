package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes.dex */
public class c1 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1471;
    public static final java.lang.String NAME = "shareImageTimeline";

    /* renamed from: g, reason: collision with root package name */
    public final int f83119g = cf.b.a(this);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String a17;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        android.app.Activity Z0 = c0Var.Z0();
        if (Z0 == null) {
            c0Var.a(i17, o("fail:internal error invalid android context"));
            return;
        }
        java.lang.String str2 = c0Var.t3().u0().f47278x;
        java.lang.String optString = jSONObject.optString("imageUrl");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("ksnsis_appbrand", true);
        intent.putExtra("Ksnsupload_type", 44);
        intent.putExtra("need_result", true);
        intent.putExtra("KBlockAdd", true);
        intent.putExtra("KsnsUpload_BrandUsername", str2);
        if (optString.startsWith("http://") || optString.startsWith("https://") || com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiShareImageTimeline", "imageUrl invalid".concat(optString));
            str = android.text.TextUtils.isEmpty("fail: imageUrl invalid") ? "fail:jsapi invalid request data" : "fail: imageUrl invalid";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            c0Var.a(i17, u(str, jSONObject2));
            return;
        }
        if (optString.startsWith("wxfile://")) {
            com.tencent.mm.vfs.r6 absoluteFile = c0Var.getFileSystem().getAbsoluteFile(optString);
            if (absoluteFile == null || !absoluteFile.m()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiShareImageTimeline", "get image data failed".concat(optString));
                str = android.text.TextUtils.isEmpty("fail: get image data failed") ? "fail:jsapi invalid request data" : "fail: get image data failed";
                java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                try {
                    jSONObject3.put("errno", 101);
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                }
                c0Var.a(i17, u(str, jSONObject3));
                return;
            }
            a17 = absoluteFile.o();
        } else {
            a17 = com.tencent.mm.plugin.appbrand.jsapi.ye.a(optString, c0Var);
            if (com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiShareImageTimeline", "getImageTempPathFromPkg fail");
                c0Var.a(i17, o("fail: get image data failed"));
                return;
            }
        }
        intent.putExtra("sns_kemdia_path", a17);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareImageTimeline", "local imagePath:%s", a17);
        nf.g.a(Z0).f(new com.tencent.mm.plugin.appbrand.jsapi.share.b1(this, Z0, c0Var, i17));
        j45.l.o(Z0, "sns", ".ui.SnsUploadUI", intent, this.f83119g, false);
    }
}
