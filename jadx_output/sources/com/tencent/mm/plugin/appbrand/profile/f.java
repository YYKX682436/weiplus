package com.tencent.mm.plugin.appbrand.profile;

/* loaded from: classes5.dex */
public final class f {
    public f(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a(android.graphics.Bitmap bitmap, boolean z17) {
        android.graphics.Bitmap bitmap2 = bitmap;
        kotlin.jvm.internal.o.g(bitmap2, "bitmap");
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        if (z17) {
            int i17 = 1;
            while (java.lang.Math.max(bitmap.getHeight(), bitmap.getWidth()) / i17 > 720) {
                i17 *= 2;
            }
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.RGB_565;
            int width = bitmap.getWidth() / i17;
            int height = bitmap.getHeight() / i17;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(height));
            arrayList.add(java.lang.Integer.valueOf(width));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/profile/JsApiTakeScreenshotForProfile$Companion", "getCompressBitmap", "(Landroid/graphics/Bitmap;Z)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/appbrand/profile/JsApiTakeScreenshotForProfile$Companion", "getCompressBitmap", "(Landroid/graphics/Bitmap;Z)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
            android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            float f17 = 1.0f / i17;
            matrix.setScale(f17, f17);
            canvas.drawBitmap(bitmap2, matrix, null);
            bitmap2 = createBitmap;
        }
        bitmap2.compress(android.graphics.Bitmap.CompressFormat.PNG, 20, byteArrayOutputStream);
        java.lang.String encodeToString = android.util.Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        kotlin.jvm.internal.o.f(encodeToString, "encodeToString(...)");
        return encodeToString;
    }
}
