package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public final class d6 implements com.tencent.mm.plugin.appbrand.jsapi.media.b6 {
    public d6(com.tencent.mm.plugin.appbrand.jsapi.media.z5 z5Var) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.b6
    public nm5.j a(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, java.lang.String str) {
        java.lang.String b17;
        java.io.InputStream q17 = com.tencent.mm.plugin.appbrand.appcache.la.q(appBrandRuntime, str);
        if (q17 == null) {
            return nm5.j.b(com.tencent.mm.plugin.appbrand.jsapi.media.e6.FILE_NOT_FOUND);
        }
        int i17 = 0;
        q17.mark(0);
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        android.graphics.Rect rect = new android.graphics.Rect();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(options);
        arrayList.add(rect);
        arrayList.add(q17);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/media/JsApiGetImageInfo$LocalPathImpl", "getImageInfo", "(Lcom/tencent/mm/plugin/appbrand/AppBrandRuntime;Ljava/lang/String;)Lcom/tencent/mm/vending/tuple/Tuple;", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        yj0.a.e(obj, android.graphics.BitmapFactory.decodeStream((java.io.InputStream) arrayList.get(0), (android.graphics.Rect) arrayList.get(1), (android.graphics.BitmapFactory.Options) arrayList.get(2)), "com/tencent/mm/plugin/appbrand/jsapi/media/JsApiGetImageInfo$LocalPathImpl", "getImageInfo", "(Lcom/tencent/mm/plugin/appbrand/AppBrandRuntime;Ljava/lang/String;)Lcom/tencent/mm/vending/tuple/Tuple;", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        com.tencent.mm.plugin.appbrand.jsapi.media.c6 c6Var = new com.tencent.mm.plugin.appbrand.jsapi.media.c6(null);
        c6Var.f81742a = options.outWidth;
        c6Var.f81743b = options.outHeight;
        c6Var.f81745d = je.a.c(options);
        boolean d17 = je.a.d(options);
        try {
            q17.reset();
        } catch (java.io.IOException unused) {
        }
        if (d17) {
            try {
                i17 = new androidx.exifinterface.media.ExifInterface(q17).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
            } catch (java.lang.Error | java.lang.Exception unused2) {
            }
            b17 = je.a.b(i17);
        } else {
            b17 = "up";
        }
        c6Var.f81744c = b17;
        com.tencent.mm.sdk.platformtools.t8.v1(q17);
        return nm5.j.c(com.tencent.mm.plugin.appbrand.jsapi.media.e6.RESOLVED, c6Var);
    }
}
