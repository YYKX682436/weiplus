package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public class x1 implements com.tencent.mm.plugin.appbrand.jsapi.media.z1 {
    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.z1
    public android.graphics.Bitmap Bc(java.lang.String str, android.graphics.BitmapFactory.Options options) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(options);
        arrayList.add(str);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/media/IBitmapFactory$1", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeFile = android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0), (android.graphics.BitmapFactory.Options) arrayList.get(1));
        yj0.a.e(obj, decodeFile, "com/tencent/mm/plugin/appbrand/jsapi/media/IBitmapFactory$1", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        return decodeFile;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.z1
    public android.graphics.Bitmap Lh(java.io.InputStream inputStream) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(inputStream);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/media/IBitmapFactory$1", "decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeStream = android.graphics.BitmapFactory.decodeStream((java.io.InputStream) arrayList.get(0));
        yj0.a.e(obj, decodeStream, "com/tencent/mm/plugin/appbrand/jsapi/media/IBitmapFactory$1", "decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;");
        return decodeStream;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.z1
    public android.graphics.Bitmap Va(java.io.InputStream inputStream, android.graphics.Rect rect, android.graphics.BitmapFactory.Options options) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(options);
        arrayList.add(rect);
        arrayList.add(inputStream);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/media/IBitmapFactory$1", "decodeStream", "(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeStream = android.graphics.BitmapFactory.decodeStream((java.io.InputStream) arrayList.get(0), (android.graphics.Rect) arrayList.get(1), (android.graphics.BitmapFactory.Options) arrayList.get(2));
        yj0.a.e(obj, decodeStream, "com/tencent/mm/plugin/appbrand/jsapi/media/IBitmapFactory$1", "decodeStream", "(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        return decodeStream;
    }
}
