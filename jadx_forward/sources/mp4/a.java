package mp4;

/* loaded from: classes4.dex */
public final class a implements com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.InterfaceC22981x4546e4f0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f411997a;

    public a() {
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ALPHA_8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(1);
        arrayList.add(1);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/timelineeditor/emojidecoder/DefaultDecoder", "<init>", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/vlog/ui/timelineeditor/emojidecoder/DefaultDecoder", "<init>", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
        this.f411997a = createBitmap;
    }

    @Override // com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.InterfaceC22981x4546e4f0
    /* renamed from: destroy */
    public void mo83821x5cd39ffa() {
    }

    @Override // com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.InterfaceC22981x4546e4f0
    /* renamed from: duration */
    public long mo83822x89444d94() {
        return 1073741824L;
    }

    @Override // com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.InterfaceC22981x4546e4f0
    /* renamed from: getFrame */
    public android.graphics.Bitmap mo83823x74704fb7() {
        return this.f411997a;
    }

    @Override // com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.InterfaceC22981x4546e4f0
    /* renamed from: seekTo */
    public void mo83824xc9fc1b13(long j17) {
    }

    @Override // com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.InterfaceC22981x4546e4f0
    /* renamed from: size */
    public android.util.Size mo83825x35e001() {
        return new android.util.Size(0, 0);
    }
}
