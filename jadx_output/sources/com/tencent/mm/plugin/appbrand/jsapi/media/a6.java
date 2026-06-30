package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public final class a6 implements com.tencent.mm.plugin.appbrand.jsapi.media.b6 {
    public a6(com.tencent.mm.plugin.appbrand.jsapi.media.z5 z5Var) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.b6
    public nm5.j a(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, java.lang.String str) {
        com.tencent.mm.vfs.r6 absoluteFile = appBrandRuntime.getFileSystem().getAbsoluteFile(str);
        if (absoluteFile == null) {
            return null;
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        java.lang.String o17 = absoluteFile.o();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(options);
        arrayList.add(o17);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/media/JsApiGetImageInfo$FileStorageImpl", "getImageInfo", "(Lcom/tencent/mm/plugin/appbrand/AppBrandRuntime;Ljava/lang/String;)Lcom/tencent/mm/vending/tuple/Tuple;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        yj0.a.e(obj, android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0), (android.graphics.BitmapFactory.Options) arrayList.get(1)), "com/tencent/mm/plugin/appbrand/jsapi/media/JsApiGetImageInfo$FileStorageImpl", "getImageInfo", "(Lcom/tencent/mm/plugin/appbrand/AppBrandRuntime;Ljava/lang/String;)Lcom/tencent/mm/vending/tuple/Tuple;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        com.tencent.mm.plugin.appbrand.jsapi.media.c6 c6Var = new com.tencent.mm.plugin.appbrand.jsapi.media.c6(null);
        c6Var.f81742a = options.outWidth;
        c6Var.f81743b = options.outHeight;
        c6Var.f81745d = je.a.c(options);
        c6Var.f81744c = je.a.d(options) ? je.a.b(je.a.a(absoluteFile.o())) : "up";
        return nm5.j.c(com.tencent.mm.plugin.appbrand.jsapi.media.e6.RESOLVED, c6Var);
    }
}
