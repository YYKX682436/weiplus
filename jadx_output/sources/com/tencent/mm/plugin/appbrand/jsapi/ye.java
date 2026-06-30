package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public abstract class ye {
    public static java.lang.String a(java.lang.String str, com.tencent.mm.plugin.appbrand.e9 e9Var) {
        android.graphics.Bitmap b17 = com.tencent.mm.plugin.appbrand.page.s5.b(e9Var.getRuntime(), str);
        if (b17 == null || b17.isRecycled()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiUtils", "thumb image is null");
            return null;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.JsApiUtils", "thumb image is not null ");
        int width = b17.getWidth();
        int height = b17.getHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
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
        byte[] a17 = com.tencent.mm.sdk.platformtools.x.a(createBitmap);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUtils", "bitmap recycle %s", createBitmap);
        createBitmap.recycle();
        b17.recycle();
        if (a17.length == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiUtils", "get pkg image data failed" + java.util.Arrays.toString(a17));
            return null;
        }
        com.tencent.mm.vfs.r6 allocTempFile = e9Var.getFileSystem().allocTempFile("shareImageTimeline_" + java.lang.System.currentTimeMillis());
        if (allocTempFile == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiUtils", "allocTempFile fail");
            return null;
        }
        java.lang.String o17 = allocTempFile.o();
        com.tencent.mm.vfs.w6.S(o17, a17, 0, a17.length);
        return o17;
    }
}
