package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public class j5 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f34489x366c91de = 528;

    /* renamed from: NAME */
    private static final java.lang.String f34490x24728b = "compressImage";

    public static android.graphics.Bitmap C(android.graphics.Bitmap bitmap, float f17, float f18) {
        float f19;
        float f27;
        if (f17 <= 0.0f && f18 <= 0.0f) {
            return bitmap;
        }
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCompressImage.javayhu", "scaleTheBitmap srcWidth:%f srcHeight:%f targetCompressWidth:%f targetCompressHeight:%f", java.lang.Float.valueOf(width), java.lang.Float.valueOf(height), java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18));
        if (width <= 0.0f || height <= 0.0f) {
            return bitmap;
        }
        if (f17 <= 0.0f || f18 <= 0.0f) {
            f19 = f17 > 0.0f ? f17 / width : f18 / height;
            f27 = f19;
        } else {
            f19 = f17 / width;
            f27 = f18 / height;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCompressImage.javayhu", "scaleTheBitmap widthScale:%f heightScale:%f", java.lang.Float.valueOf(f19), java.lang.Float.valueOf(f27));
        try {
            android.graphics.Bitmap F0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.F0(bitmap, f19, f27, true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCompressImage.javayhu", "scaleTheBitmap scaledBitmap width:%d height:%d", java.lang.Integer.valueOf(F0.getWidth()), java.lang.Integer.valueOf(F0.getHeight()));
            return F0;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiCompressImage.javayhu", "scaleTheBitmap %s", e17);
            return bitmap;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, final org.json.JSONObject jSONObject, final int i17) {
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.jsapi.media.j5$$a
            @Override // java.lang.Runnable
            public final void run() {
                java.lang.String str;
                int i18 = i17;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.j5 j5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.j5.this;
                j5Var.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar2 = lVar;
                if (lVar2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiCompressImage.javayhu", "fail:component is null");
                    return;
                }
                org.json.JSONObject jSONObject2 = jSONObject;
                if (jSONObject2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiCompressImage.javayhu", "fail:data is null");
                    str = android.text.TextUtils.isEmpty("fail:invalid data") ? "fail:jsapi invalid request data" : "fail:invalid data";
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    try {
                        jSONObject3.put("errno", 101);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                    }
                    lVar2.a(i18, j5Var.u(str, jSONObject3));
                    return;
                }
                java.lang.String optString = jSONObject2.optString("src");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiCompressImage.javayhu", "fail:data src is null");
                    str = android.text.TextUtils.isEmpty("fail:data src is null") ? "fail:jsapi invalid request data" : "fail:data src is null";
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                    try {
                        jSONObject4.put("errno", 101);
                    } catch (java.lang.Exception e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                    }
                    lVar2.a(i18, j5Var.u(str, jSONObject4));
                    return;
                }
                if (lVar2.mo50354x59eafec1() == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiCompressImage.javayhu", "fail:runtime fileSystem is null");
                    java.lang.String str4 = android.text.TextUtils.isEmpty("fail:runtime fileSystem is null") ? "fail:internal error" : "fail:runtime fileSystem is null";
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                    try {
                        jSONObject5.put("errno", 4);
                    } catch (java.lang.Exception e19) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
                    }
                    lVar2.a(i18, j5Var.u(str4, jSONObject5));
                    return;
                }
                int optInt = jSONObject2.optInt("quality", 80);
                if (optInt >= 1 && optInt <= 100) {
                    int optInt2 = jSONObject2.optInt("compressedWidth", -1);
                    int optInt3 = jSONObject2.optInt("compressedHeight", -1);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCompressImage.javayhu", "compressImage, quality:%d, src:%s", java.lang.Integer.valueOf(optInt), optString);
                    s75.d.c(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.k5(j5Var, optString, lVar2, optInt, optInt2, optInt3, new java.lang.ref.WeakReference(lVar2), i18), java.lang.String.format(java.util.Locale.US, "AppBrandJsApiCompressImage[%s#%d]", optString, java.lang.Integer.valueOf(optInt)), 10);
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiCompressImage.javayhu", "invalid quality %d", java.lang.Integer.valueOf(optInt));
                java.lang.String str6 = android.text.TextUtils.isEmpty(null) ? "fail:param compress quality invalid" : null;
                if (str6 == null) {
                    str6 = "";
                }
                java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject6 = new org.json.JSONObject();
                try {
                    jSONObject6.put("errno", 1103006);
                } catch (java.lang.Exception e27) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
                }
                lVar2.a(i18, j5Var.u(str6, jSONObject6));
            }
        };
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.w wVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.w) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.w.class);
        if (wVar == null || android.os.Build.VERSION.SDK_INT >= 29) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiCompressImage.javayhu", "NULL permissionInterface with appId:%s, run directly", lVar.mo48798x74292566());
            runnable.run();
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.d8) wVar).wi(lVar.mo50352x76847179(), lVar, runnable, new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.jsapi.media.j5$$b
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.j5 j5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.j5.this;
                    j5Var.getClass();
                    android.text.TextUtils.isEmpty("fail:system permission denied");
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    try {
                        jSONObject2.put("errno", 3);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                    }
                    lVar.a(i17, j5Var.u("fail:system permission denied", jSONObject2));
                }
            });
        }
    }
}
