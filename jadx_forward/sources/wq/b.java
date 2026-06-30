package wq;

/* loaded from: classes3.dex */
public final class b implements wq.d {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f530004a;

    public b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EmptyDecoder", "init: should not call this, something error");
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(1);
        arrayList.add(1);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/emoji/decode/EmptyDecoder", "<init>", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/emoji/decode/EmptyDecoder", "<init>", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
        this.f530004a = createBitmap;
    }

    @Override // wq.d
    public int a() {
        return Integer.MAX_VALUE;
    }

    @Override // wq.d
    public int b() {
        return this.f530004a.getHeight();
    }

    @Override // wq.d
    public void c() {
    }

    @Override // wq.d
    public int d() {
        return 1;
    }

    @Override // wq.d
    /* renamed from: destroy */
    public void mo174305x5cd39ffa() {
    }

    @Override // wq.d
    public int e() {
        return this.f530004a.getWidth();
    }

    @Override // wq.d
    /* renamed from: getFrame */
    public android.graphics.Bitmap mo174306x74704fb7() {
        return this.f530004a;
    }

    @Override // wq.d
    /* renamed from: seekTo */
    public void mo174307xc9fc1b13(long j17) {
    }
}
