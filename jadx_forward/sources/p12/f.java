package p12;

/* loaded from: classes5.dex */
public final class f {
    public f(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static android.graphics.Bitmap a(p12.f fVar, java.lang.String path, int i17, int i18, int i19, java.lang.Object obj) {
        int i27 = (i19 & 2) != 0 ? 1000 : i17;
        int i28 = (i19 & 4) == 0 ? i18 : 1000;
        fVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        android.graphics.Bitmap M = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.M(path, i27, i28, true, null);
        if (M == null) {
            return null;
        }
        try {
            java.io.InputStream E = com.p314xaae8f345.mm.vfs.w6.E(path);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(E, "openRead(...)");
            try {
                int m7343x245ab229 = new p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9(E).m7343x245ab229(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3264x118c46b, 1);
                float f17 = m7343x245ab229 != 3 ? m7343x245ab229 != 6 ? m7343x245ab229 != 8 ? 0.0f : 270.0f : 90.0f : 180.0f;
                vz5.b.a(E, null);
                if (!(f17 == 0.0f)) {
                    android.graphics.Matrix matrix = new android.graphics.Matrix();
                    matrix.setRotate(f17);
                    int width = M.getWidth();
                    int height = M.getHeight();
                    zj0.a aVar = new zj0.a();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    aVar.c(java.lang.Boolean.FALSE);
                    aVar.c(matrix);
                    aVar.c(java.lang.Integer.valueOf(height));
                    aVar.c(java.lang.Integer.valueOf(width));
                    aVar.c(0);
                    aVar.c(0);
                    aVar.c(M);
                    java.lang.Object obj2 = new java.lang.Object();
                    yj0.a.d(obj2, aVar.b(), "com/tencent/mm/plugin/emoji/editor/widgets/render/PhotoRenderViewController$Companion", "decodeWithExifRotation", "(Ljava/lang/String;II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
                    android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
                    yj0.a.e(obj2, createBitmap, "com/tencent/mm/plugin/emoji/editor/widgets/render/PhotoRenderViewController$Companion", "decodeWithExifRotation", "(Ljava/lang/String;II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
                    return createBitmap;
                }
            } finally {
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PhotoRenderViewController", "failed to read exif for rotation. " + th6);
        }
        return M;
    }
}
