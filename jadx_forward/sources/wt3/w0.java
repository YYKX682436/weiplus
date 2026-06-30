package wt3;

/* loaded from: classes5.dex */
public final class w0 extends wt3.n0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(wt3.q classifier) {
        super(classifier);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(classifier, "classifier");
    }

    @Override // wt3.n0
    public android.graphics.Bitmap d(int i17) {
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        arrayList.add(0);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/model/audio/RecordFrameFeatureExtractor", "nextBitmap", "(I)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/recordvideo/model/audio/RecordFrameFeatureExtractor", "nextBitmap", "(I)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
        return createBitmap;
    }

    @Override // wt3.n0
    public void e() {
    }

    @Override // wt3.n0
    public void f() {
    }
}
