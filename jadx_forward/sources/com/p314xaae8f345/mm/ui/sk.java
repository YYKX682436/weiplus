package com.p314xaae8f345.mm.ui;

/* loaded from: classes5.dex */
public abstract class sk {
    public static android.graphics.Bitmap a(android.graphics.Bitmap bitmap, boolean z17, float f17, boolean z18) {
        android.graphics.Bitmap bitmap2;
        if (bitmap == null || bitmap.isRecycled()) {
            com.p314xaae8f345.mm.ui.yk.b("WeUIBitmapUtil", "getRoundedCornerBitmap in bitmap is null", new java.lang.Object[0]);
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(height));
            arrayList.add(java.lang.Integer.valueOf(width));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/WeUIBitmapUtil", "createBitmap", "(IILandroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            bitmap2 = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, bitmap2, "com/tencent/mm/ui/WeUIBitmapUtil", "createBitmap", "(IILandroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        } catch (java.lang.Throwable unused) {
            bitmap2 = null;
        }
        if (bitmap2 == null) {
            return null;
        }
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmap2);
        android.graphics.Paint paint = new android.graphics.Paint();
        android.graphics.Rect rect = new android.graphics.Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        android.graphics.RectF rectF = new android.graphics.RectF(rect);
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setFilterBitmap(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-4144960);
        canvas.drawRoundRect(rectF, f17, f17, paint);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        if (z17) {
            com.p314xaae8f345.mm.ui.yk.c("WeUIBitmapUtil", "getRoundedCornerBitmap bitmap recycle %s", bitmap);
            bitmap.recycle();
        }
        return bitmap2;
    }
}
