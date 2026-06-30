package f3;

/* loaded from: classes4.dex */
public abstract class d {
    public static android.graphics.Bitmap a(android.graphics.drawable.Drawable drawable, int i17, int i18, android.graphics.Bitmap.Config config, int i19, java.lang.Object obj) {
        int intrinsicWidth = (i19 & 1) != 0 ? drawable.getIntrinsicWidth() : i17;
        int intrinsicHeight = (i19 & 2) != 0 ? drawable.getIntrinsicHeight() : i18;
        android.graphics.Bitmap.Config config2 = (i19 & 4) != 0 ? null : config;
        if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
            android.graphics.drawable.BitmapDrawable bitmapDrawable = (android.graphics.drawable.BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() == null) {
                throw new java.lang.IllegalArgumentException("bitmap is null");
            }
            if (config2 == null || bitmapDrawable.getBitmap().getConfig() == config2) {
                return (intrinsicWidth == bitmapDrawable.getBitmap().getWidth() && intrinsicHeight == bitmapDrawable.getBitmap().getHeight()) ? bitmapDrawable.getBitmap() : android.graphics.Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), intrinsicWidth, intrinsicHeight, true);
            }
        }
        android.graphics.Rect bounds = drawable.getBounds();
        int i27 = bounds.left;
        int i28 = bounds.top;
        int i29 = bounds.right;
        int i37 = bounds.bottom;
        if (config2 == null) {
            config2 = android.graphics.Bitmap.Config.ARGB_8888;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config2);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(intrinsicHeight));
        arrayList.add(java.lang.Integer.valueOf(intrinsicWidth));
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj2, arrayList.toArray(), "androidx/core/graphics/drawable/DrawableKt", "toBitmap", "(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj2, createBitmap, "androidx/core/graphics/drawable/DrawableKt", "toBitmap", "(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(new android.graphics.Canvas(createBitmap));
        drawable.setBounds(i27, i28, i29, i37);
        return createBitmap;
    }
}
