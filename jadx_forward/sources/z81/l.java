package z81;

/* loaded from: classes10.dex */
public class l extends android.graphics.Canvas {

    /* renamed from: a, reason: collision with root package name */
    public android.graphics.Bitmap f552253a;

    public l(android.graphics.Bitmap bitmap) {
        super(bitmap);
        this.f552253a = bitmap;
    }

    public void a(float f17, float f18, float f19, float f27) {
        android.graphics.Bitmap bitmap = this.f552253a;
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, this.f552253a.getWidth(), this.f552253a.getHeight());
        android.graphics.RectF rectF2 = new android.graphics.RectF(f17, f18, f19, f27);
        android.graphics.Region.Op op6 = android.graphics.Region.Op.DIFFERENCE;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/util/CropUtil", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.VodExKeys.f54575x548da1b8, "(Landroid/graphics/Bitmap;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Region$Op;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/appbrand/util/CropUtil", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.VodExKeys.f54575x548da1b8, "(Landroid/graphics/Bitmap;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Region$Op;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        canvas.clipRect(rectF);
        canvas.clipRect(rectF2, op6);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (android.graphics.Paint) null);
        if (createBitmap == null || createBitmap.isRecycled()) {
            return;
        }
        this.f552253a.eraseColor(0);
        drawBitmap(createBitmap, 0.0f, 0.0f, (android.graphics.Paint) null);
        createBitmap.recycle();
    }

    @Override // android.graphics.Canvas
    public void setBitmap(android.graphics.Bitmap bitmap) {
        super.setBitmap(bitmap);
        this.f552253a = bitmap;
    }
}
