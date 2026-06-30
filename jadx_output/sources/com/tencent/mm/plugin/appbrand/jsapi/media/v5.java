package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes.dex */
public final class v5 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.y5 f82103a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f82104b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f82105c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f82106d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82107e;

    public v5(com.tencent.mm.plugin.appbrand.jsapi.media.y5 y5Var, com.tencent.mm.plugin.appbrand.y yVar, int i17, boolean z17, java.lang.String str) {
        this.f82103a = y5Var;
        this.f82104b = yVar;
        this.f82105c = i17;
        this.f82106d = z17;
        this.f82107e = str;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiEditImage", "onResult, requestCode: " + i17 + ", resultCode: " + i18);
        com.tencent.mm.plugin.appbrand.jsapi.media.y5 y5Var = this.f82103a;
        if (y5Var.f82157g != i17) {
            return false;
        }
        if (-1 != i18) {
            com.tencent.mm.plugin.appbrand.y yVar = this.f82104b;
            int i19 = this.f82105c;
            y5Var.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "cancel" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 1);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            yVar.a(i19, y5Var.u(str2, jSONObject));
            return true;
        }
        com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel = (com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel) intent.getParcelableExtra("KSEGMENTMEDIAINFO");
        if (captureDataManager$CaptureVideoNormalModel == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiEditImage", "onResult, editResultModel is null");
            com.tencent.mm.plugin.appbrand.y yVar2 = this.f82104b;
            int i27 = this.f82105c;
            com.tencent.mm.plugin.appbrand.jsapi.media.y5 y5Var2 = this.f82103a;
            y5Var2.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            yVar2.a(i27, y5Var2.u(str2, jSONObject2));
            return true;
        }
        java.lang.String str5 = captureDataManager$CaptureVideoNormalModel.f155662f;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiEditImage", "onResult, outputPath: " + str5);
        if (!(str5 == null || str5.length() == 0)) {
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str5);
            java.lang.String str6 = a17.f213279f;
            if (str6 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str6, false, false);
                if (!a17.f213279f.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            if (!m17.a() ? false : m17.f213266a.F(m17.f213267b)) {
                ik1.b0 b0Var = new ik1.b0();
                com.tencent.mm.plugin.appbrand.appstorage.u1 fileSystem = this.f82104b.getFileSystem();
                if (fileSystem != null) {
                    fileSystem.createTempFileFrom(new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str5)), com.tencent.mm.vfs.w6.n(str5), true, b0Var);
                }
                java.lang.String str7 = (java.lang.String) b0Var.f291824a;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiEditImage", "onResult, callbackTempPath: " + str7);
                if (str7 == null || str7.length() == 0) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiEditImage", "onResult, callbackTempPath is not exist");
                    com.tencent.mm.plugin.appbrand.y yVar3 = this.f82104b;
                    int i28 = this.f82105c;
                    com.tencent.mm.plugin.appbrand.jsapi.media.y5 y5Var3 = this.f82103a;
                    y5Var3.getClass();
                    str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
                    str2 = str != null ? str : "";
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    try {
                        jSONObject3.put("errno", 4);
                    } catch (java.lang.Exception e19) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
                    }
                    yVar3.a(i28, y5Var3.u(str2, jSONObject3));
                    return true;
                }
                com.tencent.mm.plugin.appbrand.y yVar4 = this.f82104b;
                int i29 = this.f82105c;
                com.tencent.mm.plugin.appbrand.jsapi.media.y5 y5Var4 = this.f82103a;
                kotlin.jvm.internal.o.d(str7);
                java.util.HashMap i37 = kz5.c1.i(new jz5.l("tempFilePath", str7));
                y5Var4.getClass();
                java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                i37.put("errno", 0);
                yVar4.a(i29, y5Var4.t("ok", i37));
                if (this.f82106d) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiEditImage", "onResult, delete created resolved file");
                    com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(this.f82107e);
                    java.lang.String str10 = a18.f213279f;
                    if (str10 != null) {
                        java.lang.String l18 = com.tencent.mm.vfs.e8.l(str10, false, false);
                        if (!a18.f213279f.equals(l18)) {
                            a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l18, a18.f213280g, a18.f213281h);
                        }
                    }
                    com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a18, null);
                    if (m18.a()) {
                        m18.f213266a.d(m18.f213267b);
                    }
                }
                return true;
            }
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiEditImage", "onResult, outputPath is not exist");
        com.tencent.mm.plugin.appbrand.y yVar5 = this.f82104b;
        int i38 = this.f82105c;
        com.tencent.mm.plugin.appbrand.jsapi.media.y5 y5Var5 = this.f82103a;
        y5Var5.getClass();
        str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
        str2 = str != null ? str : "";
        java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
        try {
            jSONObject4.put("errno", 4);
        } catch (java.lang.Exception e27) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
        }
        yVar5.a(i38, y5Var5.u(str2, jSONObject4));
        return true;
    }
}
