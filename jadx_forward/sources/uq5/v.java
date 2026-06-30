package uq5;

/* loaded from: classes10.dex */
public final class v implements com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.InterfaceC22981x4546e4f0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f511795a;

    /* renamed from: b, reason: collision with root package name */
    public final int f511796b;

    /* renamed from: c, reason: collision with root package name */
    public final int f511797c;

    public v(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(path, "path");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(path);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/xeffect/effect/StickerDecoder", "<init>", "(Ljava/lang/String;)V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeFile = android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0));
        yj0.a.e(obj, decodeFile, "com/tencent/mm/xeffect/effect/StickerDecoder", "<init>", "(Ljava/lang/String;)V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.c(decodeFile, "BitmapFactory.decodeFile(path)");
        this.f511795a = decodeFile;
        this.f511796b = decodeFile.getWidth();
        this.f511797c = decodeFile.getHeight();
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
        return this.f511795a;
    }

    @Override // com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.InterfaceC22981x4546e4f0
    /* renamed from: seekTo */
    public void mo83824xc9fc1b13(long j17) {
    }

    @Override // com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.InterfaceC22981x4546e4f0
    /* renamed from: size */
    public android.util.Size mo83825x35e001() {
        return new android.util.Size(this.f511796b, this.f511797c);
    }

    public v(byte[] bytes) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(bytes, "bytes");
        int length = bytes.length;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(length));
        arrayList.add(0);
        arrayList.add(bytes);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/xeffect/effect/StickerDecoder", "<init>", "([B)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue());
        yj0.a.e(obj, decodeByteArray, "com/tencent/mm/xeffect/effect/StickerDecoder", "<init>", "([B)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.c(decodeByteArray, "BitmapFactory.decodeByte…ray(bytes, 0, bytes.size)");
        this.f511795a = decodeByteArray;
        this.f511796b = decodeByteArray.getWidth();
        this.f511797c = decodeByteArray.getHeight();
    }
}
