package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes7.dex */
public class g1 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 74;
    public static final java.lang.String NAME = "shareTimeline";

    /* renamed from: g, reason: collision with root package name */
    public final int f83145g = cf.b.a(this);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        int i18;
        java.lang.String str;
        boolean z17;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        android.app.Activity Z0 = c0Var.Z0();
        if (Z0 == null) {
            c0Var.a(i17, o("fail:internal error invalid android context"));
            return;
        }
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = c0Var.t3().u0();
        java.lang.String appId = c0Var.getAppId();
        java.lang.String str3 = u07.f47278x;
        java.lang.String optString = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        java.lang.String optString2 = jSONObject.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
        java.lang.String optString3 = jSONObject.optString("imageUrl");
        java.lang.String optString4 = jSONObject.optString("messageExtraData");
        java.lang.String optString5 = jSONObject.optString("preloadResources");
        int optInt = jSONObject.optInt("cardSubType", 0);
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            optString = c0Var.V0().J1();
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            optString = u07.f77279e;
        }
        java.lang.String str4 = optString;
        java.lang.String b17 = com.tencent.mm.plugin.appbrand.v9.b(c0Var.getAppId());
        int i19 = u07.L;
        int i27 = u07.f77281g;
        java.lang.String sb6 = com.tencent.mm.plugin.appbrand.jsapi.share.n2.a(appId, com.tencent.mm.plugin.appbrand.m6.a(appId).f85709b.getAndIncrement()).toString();
        com.tencent.mm.plugin.appbrand.jsapi.share.q2 q2Var = new com.tencent.mm.plugin.appbrand.jsapi.share.q2();
        q2Var.f83214a = 1;
        q2Var.f83215b = str4;
        q2Var.f83216c = optString2;
        q2Var.f83217d = optString3;
        q2Var.f83218e = 0;
        jSONObject.toString();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Ksnsupload_link", b17);
        intent.putExtra("Ksnsupload_contentattribute", 0);
        intent.putExtra("ksnsis_appbrand", true);
        intent.putExtra("Ksnsupload_source", 1);
        intent.putExtra("Ksnsupload_type", 1);
        intent.putExtra("need_result", true);
        intent.putExtra("KsnsUpload_BrandUsername", str3);
        intent.putExtra("KsnsUpload_BrandPath", optString2);
        intent.putExtra("KsnsUpload_BrandVersion", i19);
        intent.putExtra("KsnsUpload_BrandVersionType", i27);
        intent.putExtra("KsnsUpload_BrandShareActionId", sb6);
        intent.putExtra("KsnsUpload_isGame", u07.k());
        intent.putExtra("KsnsUpload_MessageExtraData", optString4);
        intent.putExtra("Ksnsupload_title", str4);
        intent.putExtra("KsnsUpload_SubType", optInt);
        intent.putExtra("KsnsUpload_PreloadResouces", optString5);
        if (optString3.startsWith("http://") || optString3.startsWith("https://") || com.tencent.mm.sdk.platformtools.t8.K0(optString3)) {
            i18 = i19;
            str = optString4;
            if (com.tencent.mm.sdk.platformtools.t8.K0(optString3)) {
                optString3 = u07.f77280f;
            }
            intent.putExtra("Ksnsupload_imgurl", optString3);
        } else if (optString3.startsWith("wxfile://")) {
            com.tencent.mm.vfs.r6 absoluteFile = c0Var.getFileSystem().getAbsoluteFile(optString3);
            if (absoluteFile == null || !absoluteFile.m()) {
                intent.putExtra("Ksnsupload_imgurl", u07.f77280f);
                str2 = null;
            } else {
                str2 = absoluteFile.o();
                intent.putExtra("KsnsUpload_imgPath", str2);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareTimeline", "local imagePath:%s", str2);
            i18 = i19;
            str = optString4;
        } else {
            byte[] bArr = new byte[0];
            android.graphics.Bitmap b18 = com.tencent.mm.plugin.appbrand.page.s5.b(c0Var.t3(), optString3);
            if (b18 == null || b18.isRecycled()) {
                i18 = i19;
                str = optString4;
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiShareTimeline", "thumb image is null");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareTimeline", "thumb image is not null ");
                int width = b18.getWidth();
                int height = b18.getHeight();
                android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                i18 = i19;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(config);
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(height));
                arrayList.add(java.lang.Integer.valueOf(width));
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/share/JsApiShareTimeline", "getImageBufferFromPkg", "(Ljava/lang/String;Lcom/tencent/mm/plugin/appbrand/service/AppBrandServiceWC;)[B", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                str = optString4;
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/appbrand/jsapi/share/JsApiShareTimeline", "getImageBufferFromPkg", "(Ljava/lang/String;Lcom/tencent/mm/plugin/appbrand/service/AppBrandServiceWC;)[B", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
                canvas.drawColor(-1);
                canvas.drawBitmap(b18, 0.0f, 0.0f, (android.graphics.Paint) null);
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                createBitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 70, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareTimeline", "bitmap recycle %s", createBitmap);
                createBitmap.recycle();
                b18.recycle();
                bArr = byteArray;
            }
            int length = bArr.length;
            if (bArr.length > 0) {
                intent.putExtra("Ksnsupload_imgbuf", bArr);
            } else {
                intent.putExtra("Ksnsupload_imgurl", u07.f77280f);
            }
        }
        java.lang.String str5 = optString3;
        if (k01.j.f303039a.b(null, appId)) {
            intent.putExtra("Ksnsupload_type", 34);
            intent.putExtra("ksnsis_appbrand", false);
            intent.putExtra("ksnsis_gamesharecard", true);
            intent.putExtra("Ksnsupload_appid", "wx62d9035fd4fd2059");
            com.tencent.mm.plugin.appbrand.config.AppBrandCustomLoadingConfig appBrandCustomLoadingConfig = u07.C1;
            if (appBrandCustomLoadingConfig != null) {
                intent.putExtra("ksnsUpload_gameShareLiteGameInfo", appBrandCustomLoadingConfig.f77204e);
            }
            z17 = true;
            intent.putExtra("ksnsUpload_gameShareAppBrandPriority", jSONObject.optInt("appBrandPriority", 1));
        } else {
            z17 = true;
        }
        java.lang.String a17 = c01.n2.a("wxapp_" + appId + optString2);
        c01.n2.d().c(a17, z17).i("prePublishId", "wxapp_" + appId + optString2);
        intent.putExtra("reportSessionId", a17);
        nf.g.a(Z0).f(new com.tencent.mm.plugin.appbrand.jsapi.share.f1(this, Z0, appId, optString2, c0Var, i17, u07, sb6, q2Var, str4, str5, i18, str));
        j45.l.o(Z0, "sns", ".ui.SnsUploadUI", intent, this.f83145g, false);
    }
}
