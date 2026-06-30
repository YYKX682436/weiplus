package tb1;

/* loaded from: classes7.dex */
public class n implements bi3.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f498446a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tb1.s f498447b;

    public n(tb1.s sVar, boolean z17) {
        this.f498447b = sVar;
        this.f498446a = z17;
    }

    @Override // bi3.i
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610.a(this.f498447b.f498467a, -1, null, null, "take picture error");
    }

    @Override // bi3.i
    public void b(android.graphics.Bitmap bitmap, java.util.Map map) {
        android.graphics.Bitmap bitmap2 = bitmap;
        tb1.s sVar = this.f498447b;
        if (bitmap2 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610.a(sVar.f498467a, -1, null, null, "bitmap is null");
            return;
        }
        if ("front".equals(sVar.f498467a.f161707m) && !this.f498446a) {
            sVar.getClass();
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.postScale(-1.0f, 1.0f);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            zj0.a aVar = new zj0.a();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            aVar.c(java.lang.Boolean.TRUE);
            aVar.c(matrix);
            aVar.c(java.lang.Integer.valueOf(height));
            aVar.c(java.lang.Integer.valueOf(width));
            aVar.c(0);
            aVar.c(0);
            aVar.c(bitmap2);
            java.lang.Object obj = new java.lang.Object();
            yj0.a.d(obj, aVar.b(), "com/tencent/mm/plugin/appbrand/jsapi/camera/AppBrandCameraView$NormalCameraMode", "mirrorBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
            yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/appbrand/jsapi/camera/AppBrandCameraView$NormalCameraMode", "mirrorBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
            bitmap.recycle();
            bitmap2 = createBitmap;
        }
        if (!sVar.f(bitmap2, sVar.f498467a.I)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610.a(sVar.f498467a, -1, null, null, "save fail");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610 c12042x78b65610 = sVar.f498467a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610.a(c12042x78b65610, 0, sVar.g(c12042x78b65610.f161702e, c12042x78b65610.I), map, "");
        }
    }
}
