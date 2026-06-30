package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* loaded from: classes7.dex */
public class g1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34799x366c91de = 74;

    /* renamed from: NAME */
    public static final java.lang.String f34800x24728b = "shareTimeline";

    /* renamed from: g, reason: collision with root package name */
    public final int f164678g = cf.b.a(this);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        int i18;
        java.lang.String str;
        boolean z17;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        android.app.Activity Z0 = c0Var.Z0();
        if (Z0 == null) {
            c0Var.a(i17, o("fail:internal error invalid android context"));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u07 = c0Var.t3().u0();
        java.lang.String mo48798x74292566 = c0Var.mo48798x74292566();
        java.lang.String str3 = u07.f128811x;
        java.lang.String optString = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        java.lang.String optString2 = jSONObject.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
        java.lang.String optString3 = jSONObject.optString("imageUrl");
        java.lang.String optString4 = jSONObject.optString("messageExtraData");
        java.lang.String optString5 = jSONObject.optString("preloadResources");
        int optInt = jSONObject.optInt("cardSubType", 0);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            optString = c0Var.V0().J1();
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            optString = u07.f158812e;
        }
        java.lang.String str4 = optString;
        java.lang.String b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v9.b(c0Var.mo48798x74292566());
        int i19 = u07.L;
        int i27 = u07.f158814g;
        java.lang.String sb6 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.n2.a(mo48798x74292566, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6.a(mo48798x74292566).f167242b.getAndIncrement()).toString();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.q2 q2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.q2();
        q2Var.f164747a = 1;
        q2Var.f164748b = str4;
        q2Var.f164749c = optString2;
        q2Var.f164750d = optString3;
        q2Var.f164751e = 0;
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
        if (optString3.startsWith("http://") || optString3.startsWith("https://") || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString3)) {
            i18 = i19;
            str = optString4;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString3)) {
                optString3 = u07.f158813f;
            }
            intent.putExtra("Ksnsupload_imgurl", optString3);
        } else if (optString3.startsWith("wxfile://")) {
            com.p314xaae8f345.mm.vfs.r6 mo49620x1d537609 = c0Var.mo50354x59eafec1().mo49620x1d537609(optString3);
            if (mo49620x1d537609 == null || !mo49620x1d537609.m()) {
                intent.putExtra("Ksnsupload_imgurl", u07.f158813f);
                str2 = null;
            } else {
                str2 = mo49620x1d537609.o();
                intent.putExtra("KsnsUpload_imgPath", str2);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShareTimeline", "local imagePath:%s", str2);
            i18 = i19;
            str = optString4;
        } else {
            byte[] bArr = new byte[0];
            android.graphics.Bitmap b18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.s5.b(c0Var.t3(), optString3);
            if (b18 == null || b18.isRecycled()) {
                i18 = i19;
                str = optString4;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiShareTimeline", "thumb image is null");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShareTimeline", "thumb image is not null ");
                int width = b18.getWidth();
                int height = b18.getHeight();
                android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                i18 = i19;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(config);
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
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
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShareTimeline", "bitmap recycle %s", createBitmap);
                createBitmap.recycle();
                b18.recycle();
                bArr = byteArray;
            }
            int length = bArr.length;
            if (bArr.length > 0) {
                intent.putExtra("Ksnsupload_imgbuf", bArr);
            } else {
                intent.putExtra("Ksnsupload_imgurl", u07.f158813f);
            }
        }
        java.lang.String str5 = optString3;
        if (k01.j.f384572a.b(null, mo48798x74292566)) {
            intent.putExtra("Ksnsupload_type", 34);
            intent.putExtra("ksnsis_appbrand", false);
            intent.putExtra("ksnsis_gamesharecard", true);
            intent.putExtra("Ksnsupload_appid", "wx62d9035fd4fd2059");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11806x808013c7 c11806x808013c7 = u07.C1;
            if (c11806x808013c7 != null) {
                intent.putExtra("ksnsUpload_gameShareLiteGameInfo", c11806x808013c7.f158737e);
            }
            z17 = true;
            intent.putExtra("ksnsUpload_gameShareAppBrandPriority", jSONObject.optInt("appBrandPriority", 1));
        } else {
            z17 = true;
        }
        java.lang.String a17 = c01.n2.a("wxapp_" + mo48798x74292566 + optString2);
        c01.n2.d().c(a17, z17).i("prePublishId", "wxapp_" + mo48798x74292566 + optString2);
        intent.putExtra("reportSessionId", a17);
        nf.g.a(Z0).f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.f1(this, Z0, mo48798x74292566, optString2, c0Var, i17, u07, sb6, q2Var, str4, str5, i18, str));
        j45.l.o(Z0, "sns", ".ui.SnsUploadUI", intent, this.f164678g, false);
    }
}
