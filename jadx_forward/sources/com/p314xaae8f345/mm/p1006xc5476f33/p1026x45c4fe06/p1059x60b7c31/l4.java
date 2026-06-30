package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public class l4 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34380x366c91de = 250;

    /* renamed from: NAME */
    public static final java.lang.String f34381x24728b = "captureScreen";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCaptureScreen", "captureScreen, appId:%s", e9Var.mo48798x74292566());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 x07 = e9Var.t3().x0();
        if (x07 == null || x07.m52174xaf156f4a() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiCaptureScreen", "captureScreen, container or page is null");
            e9Var.a(i17, o("fail:container or page is null"));
            return;
        }
        if (x07.m52174xaf156f4a() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiCaptureScreen", "captureScreen, container or page is null");
            e9Var.a(i17, o("fail:container or page is null"));
            return;
        }
        android.graphics.Bitmap C = C(e9Var);
        if (C == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiCaptureScreen", "bitmap is null, err return");
            e9Var.a(i17, o("fail:can't captureScreen"));
            return;
        }
        ik1.b0 b0Var = new ik1.b0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49624x5d68c543 = e9Var.mo50354x59eafec1().mo49624x5d68c543(b0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 j1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK;
        if (mo49624x5d68c543 != j1Var) {
            e9Var.a(i17, o("fail:gen temp file failed"));
            return;
        }
        java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6((java.lang.String) b0Var.f373357a, "appbrand_capture_" + java.lang.System.currentTimeMillis()).o();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCaptureScreen", "capture bitmap path:%s", o17);
        try {
            try {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(C, 100, android.graphics.Bitmap.CompressFormat.PNG, o17, true);
                ik1.b0 b0Var2 = new ik1.b0();
                if (e9Var.mo50354x59eafec1().mo49619x6aa75256(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(o17)), "png", true, b0Var2) != j1Var) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiCaptureScreen", "create temp file failed, path:%s", o17);
                    e9Var.a(i17, o("fail:gen temp file failed"));
                    if (C.isRecycled()) {
                        return;
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCaptureScreen", "bitmap recycle %s", C);
                    }
                } else {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("tempFilePath", (java.lang.String) b0Var2.f373357a);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCaptureScreen", "capture bitmap tempFilePath:%s", b0Var2.f373357a);
                    e9Var.a(i17, p("ok", hashMap));
                    if (C.isRecycled()) {
                        return;
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCaptureScreen", "bitmap recycle %s", C);
                    }
                }
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiCaptureScreen", "save bitmap to file failed, . exception : %s", e17);
                e9Var.a(i17, o("fail:IOException"));
                if (C.isRecycled()) {
                    return;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCaptureScreen", "bitmap recycle %s", C);
                }
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiCaptureScreen", "save bitmap to file failed, . exception : %s", e18);
                e9Var.a(i17, o("fail:Exception"));
                if (C.isRecycled()) {
                    return;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCaptureScreen", "bitmap recycle %s", C);
                }
            }
            C.recycle();
        } catch (java.lang.Throwable th6) {
            if (!C.isRecycled()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCaptureScreen", "bitmap recycle %s", C);
                C.recycle();
            }
            throw th6;
        }
    }

    public android.graphics.Bitmap C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 V0 = e9Var.V0();
        if (V0 == null) {
            return null;
        }
        return (android.graphics.Bitmap) new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k4(this, V0).a(new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()));
    }
}
