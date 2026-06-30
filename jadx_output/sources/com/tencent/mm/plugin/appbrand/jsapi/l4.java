package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class l4 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 250;
    public static final java.lang.String NAME = "captureScreen";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCaptureScreen", "captureScreen, appId:%s", e9Var.getAppId());
        com.tencent.mm.plugin.appbrand.page.i3 x07 = e9Var.t3().x0();
        if (x07 == null || x07.getPageView() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiCaptureScreen", "captureScreen, container or page is null");
            e9Var.a(i17, o("fail:container or page is null"));
            return;
        }
        if (x07.getPageView() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiCaptureScreen", "captureScreen, container or page is null");
            e9Var.a(i17, o("fail:container or page is null"));
            return;
        }
        android.graphics.Bitmap C = C(e9Var);
        if (C == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiCaptureScreen", "bitmap is null, err return");
            e9Var.a(i17, o("fail:can't captureScreen"));
            return;
        }
        ik1.b0 b0Var = new ik1.b0();
        com.tencent.mm.plugin.appbrand.appstorage.j1 tempDirectory = e9Var.getFileSystem().getTempDirectory(b0Var);
        com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var = com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
        if (tempDirectory != j1Var) {
            e9Var.a(i17, o("fail:gen temp file failed"));
            return;
        }
        java.lang.String o17 = new com.tencent.mm.vfs.r6((java.lang.String) b0Var.f291824a, "appbrand_capture_" + java.lang.System.currentTimeMillis()).o();
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCaptureScreen", "capture bitmap path:%s", o17);
        try {
            try {
                com.tencent.mm.sdk.platformtools.x.D0(C, 100, android.graphics.Bitmap.CompressFormat.PNG, o17, true);
                ik1.b0 b0Var2 = new ik1.b0();
                if (e9Var.getFileSystem().createTempFileFrom(new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(o17)), "png", true, b0Var2) != j1Var) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.JsApiCaptureScreen", "create temp file failed, path:%s", o17);
                    e9Var.a(i17, o("fail:gen temp file failed"));
                    if (C.isRecycled()) {
                        return;
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCaptureScreen", "bitmap recycle %s", C);
                    }
                } else {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("tempFilePath", (java.lang.String) b0Var2.f291824a);
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCaptureScreen", "capture bitmap tempFilePath:%s", b0Var2.f291824a);
                    e9Var.a(i17, p("ok", hashMap));
                    if (C.isRecycled()) {
                        return;
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCaptureScreen", "bitmap recycle %s", C);
                    }
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.JsApiCaptureScreen", "save bitmap to file failed, . exception : %s", e17);
                e9Var.a(i17, o("fail:IOException"));
                if (C.isRecycled()) {
                    return;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCaptureScreen", "bitmap recycle %s", C);
                }
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.w("MicroMsg.JsApiCaptureScreen", "save bitmap to file failed, . exception : %s", e18);
                e9Var.a(i17, o("fail:Exception"));
                if (C.isRecycled()) {
                    return;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCaptureScreen", "bitmap recycle %s", C);
                }
            }
            C.recycle();
        } catch (java.lang.Throwable th6) {
            if (!C.isRecycled()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCaptureScreen", "bitmap recycle %s", C);
                C.recycle();
            }
            throw th6;
        }
    }

    public android.graphics.Bitmap C(com.tencent.mm.plugin.appbrand.e9 e9Var) {
        com.tencent.mm.plugin.appbrand.page.v5 V0 = e9Var.V0();
        if (V0 == null) {
            return null;
        }
        return (android.graphics.Bitmap) new com.tencent.mm.plugin.appbrand.jsapi.k4(this, V0).a(new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()));
    }
}
