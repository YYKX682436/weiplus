package wq;

/* loaded from: classes9.dex */
public final class e implements wq.d {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f530009a;

    public e(android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(1);
            arrayList.add(1);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/emoji/decode/MMBitmapDecoder", "<init>", "(Landroid/graphics/Bitmap;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            bitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, bitmap, "com/tencent/mm/emoji/decode/MMBitmapDecoder", "<init>", "(Landroid/graphics/Bitmap;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bitmap, "createBitmap(...)");
        }
        this.f530009a = bitmap;
        bitmap.setDensity(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e);
    }

    @Override // wq.d
    public int a() {
        return Integer.MAX_VALUE;
    }

    @Override // wq.d
    public int b() {
        return this.f530009a.getHeight();
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
        return this.f530009a.getWidth();
    }

    @Override // wq.d
    /* renamed from: getFrame */
    public android.graphics.Bitmap mo174306x74704fb7() {
        return this.f530009a;
    }

    @Override // wq.d
    /* renamed from: seekTo */
    public void mo174307xc9fc1b13(long j17) {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(byte[] bytes) {
        this(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.G(bytes));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bytes, "bytes");
    }
}
