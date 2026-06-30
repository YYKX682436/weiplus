package cj4;

/* loaded from: classes11.dex */
public final class f implements android.view.ViewTreeObserver.OnDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f41925a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cj4.k f41926b;

    public f(android.widget.ImageView imageView, cj4.k kVar) {
        this.f41925a = imageView;
        this.f41926b = kVar;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        android.graphics.Bitmap bitmap;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleThirdThumb: layoutThirdThumb addOnDrawListener ");
        android.widget.ImageView imageView = this.f41925a;
        sb6.append(imageView.getDrawable());
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.BaseMiniStatusLoadLogic", sb6.toString());
        android.graphics.drawable.Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            cj4.k kVar = this.f41926b;
            kVar.getClass();
            if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
                bitmap = ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap();
                kotlin.jvm.internal.o.f(bitmap, "getBitmap(...)");
            } else {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(config);
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(intrinsicHeight));
                arrayList.add(java.lang.Integer.valueOf(intrinsicWidth));
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/logic/BaseMiniStatusLoadLogic", "drawableToBitmap", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/textstatus/logic/BaseMiniStatusLoadLogic", "drawableToBitmap", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
                android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
                bitmap = createBitmap;
            }
            ff0.t tVar = (ff0.t) i95.n0.c(ff0.t.class);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(kVar.f41978g);
            sb7.append('_');
            mj4.h hVar = kVar.H;
            kotlin.jvm.internal.o.d(hVar);
            sb7.append(((mj4.k) hVar).l());
            ((dl4.m0) tVar).hj(sb7.toString(), null, bitmap, new cj4.e(kVar));
        }
    }
}
