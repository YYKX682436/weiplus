package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public class j5 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 528;
    private static final java.lang.String NAME = "compressImage";

    public static android.graphics.Bitmap C(android.graphics.Bitmap bitmap, float f17, float f18) {
        float f19;
        float f27;
        if (f17 <= 0.0f && f18 <= 0.0f) {
            return bitmap;
        }
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCompressImage.javayhu", "scaleTheBitmap srcWidth:%f srcHeight:%f targetCompressWidth:%f targetCompressHeight:%f", java.lang.Float.valueOf(width), java.lang.Float.valueOf(height), java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18));
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
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCompressImage.javayhu", "scaleTheBitmap widthScale:%f heightScale:%f", java.lang.Float.valueOf(f19), java.lang.Float.valueOf(f27));
        try {
            android.graphics.Bitmap F0 = com.tencent.mm.sdk.platformtools.x.F0(bitmap, f19, f27, true);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCompressImage.javayhu", "scaleTheBitmap scaledBitmap width:%d height:%d", java.lang.Integer.valueOf(F0.getWidth()), java.lang.Integer.valueOf(F0.getHeight()));
            return F0;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiCompressImage.javayhu", "scaleTheBitmap %s", e17);
            return bitmap;
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(final com.tencent.mm.plugin.appbrand.jsapi.l lVar, final org.json.JSONObject jSONObject, final int i17) {
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.jsapi.media.j5$$a
            @Override // java.lang.Runnable
            public final void run() {
                java.lang.String str;
                int i18 = i17;
                com.tencent.mm.plugin.appbrand.jsapi.media.j5 j5Var = com.tencent.mm.plugin.appbrand.jsapi.media.j5.this;
                j5Var.getClass();
                com.tencent.mm.plugin.appbrand.jsapi.l lVar2 = lVar;
                if (lVar2 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiCompressImage.javayhu", "fail:component is null");
                    return;
                }
                org.json.JSONObject jSONObject2 = jSONObject;
                if (jSONObject2 == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.JsApiCompressImage.javayhu", "fail:data is null");
                    str = android.text.TextUtils.isEmpty("fail:invalid data") ? "fail:jsapi invalid request data" : "fail:invalid data";
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    try {
                        jSONObject3.put("errno", 101);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                    }
                    lVar2.a(i18, j5Var.u(str, jSONObject3));
                    return;
                }
                java.lang.String optString = jSONObject2.optString("src");
                if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.JsApiCompressImage.javayhu", "fail:data src is null");
                    str = android.text.TextUtils.isEmpty("fail:data src is null") ? "fail:jsapi invalid request data" : "fail:data src is null";
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                    try {
                        jSONObject4.put("errno", 101);
                    } catch (java.lang.Exception e18) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                    }
                    lVar2.a(i18, j5Var.u(str, jSONObject4));
                    return;
                }
                if (lVar2.getFileSystem() == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.JsApiCompressImage.javayhu", "fail:runtime fileSystem is null");
                    java.lang.String str4 = android.text.TextUtils.isEmpty("fail:runtime fileSystem is null") ? "fail:internal error" : "fail:runtime fileSystem is null";
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                    try {
                        jSONObject5.put("errno", 4);
                    } catch (java.lang.Exception e19) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
                    }
                    lVar2.a(i18, j5Var.u(str4, jSONObject5));
                    return;
                }
                int optInt = jSONObject2.optInt("quality", 80);
                if (optInt >= 1 && optInt <= 100) {
                    int optInt2 = jSONObject2.optInt("compressedWidth", -1);
                    int optInt3 = jSONObject2.optInt("compressedHeight", -1);
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCompressImage.javayhu", "compressImage, quality:%d, src:%s", java.lang.Integer.valueOf(optInt), optString);
                    s75.d.c(new com.tencent.mm.plugin.appbrand.jsapi.media.k5(j5Var, optString, lVar2, optInt, optInt2, optInt3, new java.lang.ref.WeakReference(lVar2), i18), java.lang.String.format(java.util.Locale.US, "AppBrandJsApiCompressImage[%s#%d]", optString, java.lang.Integer.valueOf(optInt)), 10);
                    return;
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.JsApiCompressImage.javayhu", "invalid quality %d", java.lang.Integer.valueOf(optInt));
                java.lang.String str6 = android.text.TextUtils.isEmpty(null) ? "fail:param compress quality invalid" : null;
                if (str6 == null) {
                    str6 = "";
                }
                java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject6 = new org.json.JSONObject();
                try {
                    jSONObject6.put("errno", 1103006);
                } catch (java.lang.Exception e27) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
                }
                lVar2.a(i18, j5Var.u(str6, jSONObject6));
            }
        };
        com.tencent.mm.plugin.appbrand.jsapi.media.w wVar = (com.tencent.mm.plugin.appbrand.jsapi.media.w) i95.n0.c(com.tencent.mm.plugin.appbrand.jsapi.media.w.class);
        if (wVar == null || android.os.Build.VERSION.SDK_INT >= 29) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiCompressImage.javayhu", "NULL permissionInterface with appId:%s, run directly", lVar.getAppId());
            runnable.run();
        } else {
            ((com.tencent.mm.plugin.appbrand.app.d8) wVar).wi(lVar.getContext(), lVar, runnable, new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.jsapi.media.j5$$b
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.appbrand.jsapi.media.j5 j5Var = com.tencent.mm.plugin.appbrand.jsapi.media.j5.this;
                    j5Var.getClass();
                    android.text.TextUtils.isEmpty("fail:system permission denied");
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    try {
                        jSONObject2.put("errno", 3);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                    }
                    lVar.a(i17, j5Var.u("fail:system permission denied", jSONObject2));
                }
            });
        }
    }
}
