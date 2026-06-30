package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class z2 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 800;
    public static final java.lang.String NAME = "addToFavorites";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        java.lang.String optString = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        java.lang.String optString2 = jSONObject.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
        java.lang.String optString3 = jSONObject.optString("imageUrl");
        boolean optBoolean = jSONObject.optBoolean("disableForward", false);
        int optInt = jSONObject.optInt("cardSubType", 0);
        final com.tencent.mm.plugin.appbrand.page.n7 V0 = c0Var.V0();
        final com.tencent.mm.plugin.appbrand.utils.c0 b3Var = new com.tencent.mm.plugin.appbrand.jsapi.b3(this, V0, optString2, optString, optBoolean, optInt, xi1.o.b(c0Var.getWindowAndroid().getOrientationHandler().a()), i17);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString3)) {
            com.tencent.mm.plugin.appbrand.utils.d0.c(V0, optString3, null, b3Var);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAddToFavorites", "loadThumbFromSnapShot");
        com.tencent.mm.vfs.r6 allocTempFile = V0.getFileSystem().allocTempFile("addFavoriteSnapShot_" + java.lang.System.currentTimeMillis());
        if (allocTempFile == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAddToFavorites", "loadThumbFromSnapShot failed for allocTempFile");
            b3Var.a(null);
            return;
        }
        final java.lang.String o17 = allocTempFile.o();
        ce.g gVar = (ce.g) V0.B1(ce.g.class);
        if (gVar == null) {
            com.tencent.mm.plugin.appbrand.utils.d5.b(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.jsapi.z2$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.appbrand.jsapi.z2 z2Var = com.tencent.mm.plugin.appbrand.jsapi.z2.this;
                    z2Var.getClass();
                    com.tencent.mm.plugin.appbrand.page.n7 n7Var = V0;
                    z2Var.C(b3Var, n7Var, n7Var.R1(), o17);
                }
            });
            return;
        }
        try {
            C(b3Var, V0, ((ce.o) gVar).f40686g.getMagicBrush().f48591o.a(((ce.o) gVar).f40686g.getVirtualElementId(), -1, true), o17);
        } catch (java.lang.NullPointerException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiAddToFavorites", e17, "hy: can not get snapshot!", new java.lang.Object[0]);
            b3Var.a("");
        }
    }

    public final void C(com.tencent.mm.plugin.appbrand.utils.c0 c0Var, com.tencent.mm.plugin.appbrand.page.v5 v5Var, android.graphics.Bitmap bitmap, java.lang.String str) {
        try {
            if (bitmap != null) {
                try {
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.JsApiAddToFavorites", "save temp bitmap to file failed, . exception : %s", e17);
                    c0Var.a("");
                    if (bitmap == null || bitmap.isRecycled()) {
                        return;
                    }
                }
                if (!bitmap.isRecycled()) {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    com.tencent.mm.sdk.platformtools.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.JPEG, str, true);
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAddToFavorites", "saveFile(appId : %s, pageView : %s, saveFileCost : %sms)", v5Var.getAppId(), java.lang.Integer.valueOf(v5Var.hashCode()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                    c0Var.a(str);
                    if (bitmap != null || bitmap.isRecycled()) {
                    }
                    bitmap.recycle();
                    return;
                }
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiAddToFavorites", "snapshot can not be taken");
            c0Var.a("");
            if (bitmap != null) {
            }
        } catch (java.lang.Throwable th6) {
            if (bitmap != null && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
            throw th6;
        }
    }
}
