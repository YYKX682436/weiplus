package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* loaded from: classes.dex */
public class c1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34789x366c91de = 1471;

    /* renamed from: NAME */
    public static final java.lang.String f34790x24728b = "shareImageTimeline";

    /* renamed from: g, reason: collision with root package name */
    public final int f164652g = cf.b.a(this);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String a17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        android.app.Activity Z0 = c0Var.Z0();
        if (Z0 == null) {
            c0Var.a(i17, o("fail:internal error invalid android context"));
            return;
        }
        java.lang.String str2 = c0Var.t3().u0().f128811x;
        java.lang.String optString = jSONObject.optString("imageUrl");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("ksnsis_appbrand", true);
        intent.putExtra("Ksnsupload_type", 44);
        intent.putExtra("need_result", true);
        intent.putExtra("KBlockAdd", true);
        intent.putExtra("KsnsUpload_BrandUsername", str2);
        if (optString.startsWith("http://") || optString.startsWith("https://") || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiShareImageTimeline", "imageUrl invalid".concat(optString));
            str = android.text.TextUtils.isEmpty("fail: imageUrl invalid") ? "fail:jsapi invalid request data" : "fail: imageUrl invalid";
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            c0Var.a(i17, u(str, jSONObject2));
            return;
        }
        if (optString.startsWith("wxfile://")) {
            com.p314xaae8f345.mm.vfs.r6 mo49620x1d537609 = c0Var.mo50354x59eafec1().mo49620x1d537609(optString);
            if (mo49620x1d537609 == null || !mo49620x1d537609.m()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiShareImageTimeline", "get image data failed".concat(optString));
                str = android.text.TextUtils.isEmpty("fail: get image data failed") ? "fail:jsapi invalid request data" : "fail: get image data failed";
                java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                try {
                    jSONObject3.put("errno", 101);
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                }
                c0Var.a(i17, u(str, jSONObject3));
                return;
            }
            a17 = mo49620x1d537609.o();
        } else {
            a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ye.a(optString, c0Var);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiShareImageTimeline", "getImageTempPathFromPkg fail");
                c0Var.a(i17, o("fail: get image data failed"));
                return;
            }
        }
        intent.putExtra("sns_kemdia_path", a17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShareImageTimeline", "local imagePath:%s", a17);
        nf.g.a(Z0).f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.b1(this, Z0, c0Var, i17));
        j45.l.o(Z0, "sns", ".ui.SnsUploadUI", intent, this.f164652g, false);
    }
}
