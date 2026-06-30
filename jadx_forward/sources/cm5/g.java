package cm5;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final float f124965a;

    /* renamed from: b, reason: collision with root package name */
    public final float f124966b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Rect f124967c;

    public g(float f17, float f18, android.graphics.Rect rect, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        f17 = (i17 & 1) != 0 ? 1.0f : f17;
        f18 = (i17 & 2) != 0 ? 1.0f : f18;
        rect = (i17 & 4) != 0 ? null : rect;
        this.f124965a = f17;
        this.f124966b = f18;
        this.f124967c = rect;
    }

    public final android.graphics.Bitmap a(android.graphics.Bitmap bitmap) {
        android.graphics.Bitmap bitmap2 = bitmap;
        android.graphics.Rect rect = this.f124967c;
        if (rect != null && bitmap2 != null && (bitmap.getWidth() != rect.width() || bitmap.getHeight() != rect.height())) {
            int width = rect.width();
            int height = rect.height();
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(height));
            arrayList.add(java.lang.Integer.valueOf(width));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/utils/FinalBitmapGenerateInterceptor", "onInterceptOutputRect", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/utils/FinalBitmapGenerateInterceptor", "onInterceptOutputRect", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            new android.graphics.Canvas(createBitmap).drawBitmap(bitmap2, (createBitmap.getWidth() - bitmap.getWidth()) / 2, (createBitmap.getHeight() - bitmap.getHeight()) / 2, (android.graphics.Paint) null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinalBitmapGenerateInterceptor", "onInterceptGenerateBitmap: outputRect w:[" + rect.width() + ",h:" + rect.height() + "], newResult [w:" + createBitmap.getWidth() + ",h:" + createBitmap.getHeight() + "], src [w:" + bitmap.getWidth() + ",h:" + bitmap.getHeight() + ']');
            bitmap.recycle();
            bitmap2 = createBitmap;
        }
        float f17 = this.f124965a;
        boolean z17 = f17 == 1.0f;
        float f18 = this.f124966b;
        if (z17) {
            if (f18 == 1.0f) {
                return bitmap2;
            }
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postScale(f17, f18);
        if (bitmap2 == null) {
            return bitmap2;
        }
        int width2 = bitmap2.getWidth();
        int height2 = bitmap2.getHeight();
        zj0.a aVar = new zj0.a();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        aVar.c(java.lang.Boolean.TRUE);
        aVar.c(matrix);
        aVar.c(java.lang.Integer.valueOf(height2));
        aVar.c(java.lang.Integer.valueOf(width2));
        aVar.c(0);
        aVar.c(0);
        aVar.c(bitmap2);
        java.lang.Object obj2 = new java.lang.Object();
        yj0.a.d(obj2, aVar.b(), "com/tencent/mm/utils/FinalBitmapGenerateInterceptor", "onInterceptScale", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap2 = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
        yj0.a.e(obj2, createBitmap2, "com/tencent/mm/utils/FinalBitmapGenerateInterceptor", "onInterceptScale", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinalBitmapGenerateInterceptor", "onInterceptGenerateBitmap: finalScaleX=" + f17 + ", finalScaleY=" + f18 + ", newResult=[w:" + createBitmap2.getWidth() + ",h:" + createBitmap2.getHeight() + "], src=[w:" + bitmap2.getWidth() + ",h:" + bitmap2.getHeight() + ']');
        bitmap2.recycle();
        return createBitmap2;
    }
}
