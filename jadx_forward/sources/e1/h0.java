package e1;

/* loaded from: classes14.dex */
public abstract class h0 {
    public static e1.g0 a(int i17, int i18, int i19, boolean z17, f1.d dVar, int i27, java.lang.Object obj) {
        f1.d colorSpace;
        android.graphics.Bitmap createBitmap;
        int i28 = (i27 & 4) != 0 ? 0 : i19;
        boolean z18 = (i27 & 8) != 0 ? true : z17;
        if ((i27 & 16) != 0) {
            f1.h hVar = f1.h.f340009a;
            colorSpace = f1.h.f340012d;
        } else {
            colorSpace = dVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(colorSpace, "colorSpace");
        android.graphics.Bitmap.Config c17 = e1.e.c(i28);
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            createBitmap = e1.l.c(i17, i18, i28, z18, colorSpace);
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(c17);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            arrayList.add(java.lang.Integer.valueOf(i17));
            arrayList.add(null);
            java.lang.Object obj2 = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj2, arrayList.toArray(), "androidx/compose/ui/graphics/AndroidImageBitmap_androidKt", "ActualImageBitmap-x__-hDU", "(IIIZLandroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroidx/compose/ui/graphics/ImageBitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/util/DisplayMetrics;IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            createBitmap = android.graphics.Bitmap.createBitmap((android.util.DisplayMetrics) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(3));
            yj0.a.e(obj2, createBitmap, "androidx/compose/ui/graphics/AndroidImageBitmap_androidKt", "ActualImageBitmap-x__-hDU", "(IIIZLandroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroidx/compose/ui/graphics/ImageBitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/util/DisplayMetrics;IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(\n          …   bitmapConfig\n        )");
            createBitmap.setHasAlpha(z18);
        }
        return new e1.d(createBitmap);
    }
}
