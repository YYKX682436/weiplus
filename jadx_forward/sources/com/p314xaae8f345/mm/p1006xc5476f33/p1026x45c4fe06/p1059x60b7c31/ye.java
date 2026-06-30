package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public abstract class ye {
    public static java.lang.String a(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var) {
        android.graphics.Bitmap b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.s5.b(e9Var.mo32091x9a3f0ba2(), str);
        if (b17 == null || b17.isRecycled()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiUtils", "thumb image is null");
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiUtils", "thumb image is not null ");
        int width = b17.getWidth();
        int height = b17.getHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/JsApiUtils", "getImageTempPathFromPkg", "(Ljava/lang/String;Lcom/tencent/mm/plugin/appbrand/AppBrandService;)Ljava/lang/String;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/appbrand/jsapi/JsApiUtils", "getImageTempPathFromPkg", "(Ljava/lang/String;Lcom/tencent/mm/plugin/appbrand/AppBrandService;)Ljava/lang/String;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        canvas.drawColor(-1);
        canvas.drawBitmap(b17, 0.0f, 0.0f, (android.graphics.Paint) null);
        byte[] a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.a(createBitmap);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUtils", "bitmap recycle %s", createBitmap);
        createBitmap.recycle();
        b17.recycle();
        if (a17.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiUtils", "get pkg image data failed" + java.util.Arrays.toString(a17));
            return null;
        }
        com.p314xaae8f345.mm.vfs.r6 mo49614x6665a5c5 = e9Var.mo50354x59eafec1().mo49614x6665a5c5("shareImageTimeline_" + java.lang.System.currentTimeMillis());
        if (mo49614x6665a5c5 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiUtils", "allocTempFile fail");
            return null;
        }
        java.lang.String o17 = mo49614x6665a5c5.o();
        com.p314xaae8f345.mm.vfs.w6.S(o17, a17, 0, a17.length);
        return o17;
    }
}
