package s5;

/* loaded from: classes7.dex */
public final class d implements s5.a {
    @Override // s5.a
    public void a(int i17) {
    }

    @Override // s5.a
    public void b(android.graphics.Bitmap bitmap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        bitmap.recycle();
    }

    @Override // s5.a
    public android.graphics.Bitmap c(int i17, int i18, android.graphics.Bitmap.Config config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        if (!(!h6.a.b(config))) {
            throw new java.lang.IllegalArgumentException("Cannot create a mutable hardware bitmap.".toString());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "coil/bitmap/EmptyBitmapPool", "getDirty", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "coil/bitmap/EmptyBitmapPool", "getDirty", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(width, height, config)");
        return createBitmap;
    }

    @Override // s5.a
    public android.graphics.Bitmap d(int i17, int i18, android.graphics.Bitmap.Config config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        return c(i17, i18, config);
    }
}
