package fa3;

/* loaded from: classes10.dex */
public class j implements bi3.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f342293a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.g f342294b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fa3.b f342295c;

    public j(fa3.b bVar, java.util.Map map, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.g gVar) {
        this.f342295c = bVar;
        this.f342293a = map;
        this.f342294b = gVar;
    }

    @Override // bi3.i
    public void a() {
        this.f342293a.put("error", "take photo error");
        this.f342295c.f342265r = 1;
    }

    @Override // bi3.i
    public void b(android.graphics.Bitmap bitmap, java.util.Map map) {
        android.graphics.Bitmap bitmap2 = bitmap;
        java.util.Map map2 = this.f342293a;
        fa3.b bVar = this.f342295c;
        if (bitmap2 != null) {
            if ("front".equals(bVar.f342251d) && !bVar.f342270w) {
                bVar.getClass();
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
                yj0.a.d(obj, aVar.b(), "com/tencent/mm/plugin/lite/media/camera/LiteAppCameraManager", "mirrorBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
                yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/lite/media/camera/LiteAppCameraManager", "mirrorBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
                bitmap.recycle();
                bitmap2 = createBitmap;
            }
            boolean c17 = bVar.c(bitmap2, bVar.f342259l);
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.g gVar = this.f342294b;
            if (c17) {
                map2.put("tempImagePath", bVar.f342259l);
                gVar.d(map2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppCameraManager", "tempImagePath:%s", bVar.f342259l);
            } else {
                map2.put("error", "camera save photo fail");
                gVar.d(map2);
            }
        } else {
            map2.put("error", "camera get photo bitmap is null");
        }
        bVar.f342266s = false;
        bVar.f342265r = 1;
    }
}
