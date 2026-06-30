package z94;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final z94.a f552395a = new z94.a();

    public static java.lang.String a(z94.a aVar, android.graphics.Bitmap bitmap, java.lang.String str, int i17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("saveCoverBitmap$default", "com.tencent.mm.plugin.sns.cover.edit.util.SnsCoverCropUtil");
        java.lang.String str2 = (i17 & 2) != 0 ? null : str;
        aVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("saveCoverBitmap", "com.tencent.mm.plugin.sns.cover.edit.util.SnsCoverCropUtil");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        if (str2 == null) {
            str2 = dw3.h.d(dw3.h.f325744a, "sns_cover", null, 2, null);
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width > height) {
            zj0.a aVar2 = new zj0.a();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            aVar2.c(java.lang.Boolean.FALSE);
            aVar2.c(null);
            aVar2.c(java.lang.Integer.valueOf(height));
            aVar2.c(java.lang.Integer.valueOf(height));
            aVar2.c(0);
            aVar2.c(java.lang.Integer.valueOf((width - height) / 2));
            aVar2.c(bitmap);
            java.lang.Object obj2 = new java.lang.Object();
            yj0.a.d(obj2, aVar2.b(), "com/tencent/mm/plugin/sns/cover/edit/util/SnsCoverCropUtil", "saveCoverBitmap", "(Landroid/graphics/Bitmap;Ljava/lang/String;)Ljava/lang/String;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar2.a(0), ((java.lang.Integer) aVar2.a(1)).intValue(), ((java.lang.Integer) aVar2.a(2)).intValue(), ((java.lang.Integer) aVar2.a(3)).intValue(), ((java.lang.Integer) aVar2.a(4)).intValue(), (android.graphics.Matrix) aVar2.a(5), ((java.lang.Boolean) aVar2.a(6)).booleanValue());
            yj0.a.e(obj2, createBitmap, "com/tencent/mm/plugin/sns/cover/edit/util/SnsCoverCropUtil", "saveCoverBitmap", "(Landroid/graphics/Bitmap;Ljava/lang/String;)Ljava/lang/String;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(createBitmap, 100, android.graphics.Bitmap.CompressFormat.JPEG, str2, true);
        } else if (height > width) {
            zj0.a aVar3 = new zj0.a();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            aVar3.c(java.lang.Boolean.FALSE);
            aVar3.c(null);
            aVar3.c(java.lang.Integer.valueOf(width));
            aVar3.c(java.lang.Integer.valueOf(width));
            aVar3.c(java.lang.Integer.valueOf((height - width) / 2));
            aVar3.c(0);
            aVar3.c(bitmap);
            java.lang.Object obj3 = new java.lang.Object();
            yj0.a.d(obj3, aVar3.b(), "com/tencent/mm/plugin/sns/cover/edit/util/SnsCoverCropUtil", "saveCoverBitmap", "(Landroid/graphics/Bitmap;Ljava/lang/String;)Ljava/lang/String;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap2 = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar3.a(0), ((java.lang.Integer) aVar3.a(1)).intValue(), ((java.lang.Integer) aVar3.a(2)).intValue(), ((java.lang.Integer) aVar3.a(3)).intValue(), ((java.lang.Integer) aVar3.a(4)).intValue(), (android.graphics.Matrix) aVar3.a(5), ((java.lang.Boolean) aVar3.a(6)).booleanValue());
            yj0.a.e(obj3, createBitmap2, "com/tencent/mm/plugin/sns/cover/edit/util/SnsCoverCropUtil", "saveCoverBitmap", "(Landroid/graphics/Bitmap;Ljava/lang/String;)Ljava/lang/String;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap2, "createBitmap(...)");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(createBitmap2, 100, android.graphics.Bitmap.CompressFormat.JPEG, str2, true);
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.JPEG, str2, true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("saveCoverBitmap", "com.tencent.mm.plugin.sns.cover.edit.util.SnsCoverCropUtil");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("saveCoverBitmap$default", "com.tencent.mm.plugin.sns.cover.edit.util.SnsCoverCropUtil");
        return str2;
    }
}
