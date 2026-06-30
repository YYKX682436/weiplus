package wq;

/* loaded from: classes14.dex */
public final class g implements wq.d {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.jni.p801x7810c374.C10774xe4d138e f530017a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Bitmap f530018b;

    public g(byte[] bytes, java.lang.String cacheKeyString, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bytes, "bytes");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cacheKeyString, "cacheKeyString");
        fp.d0.n("voipComm");
        fp.d0.n("voipChannel");
        fp.d0.n("voipCodec");
        fp.d0.n("emojihelper");
        com.p314xaae8f345.mm.jni.p801x7810c374.C10774xe4d138e c10774xe4d138e = new com.p314xaae8f345.mm.jni.p801x7810c374.C10774xe4d138e();
        this.f530017a = c10774xe4d138e;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cacheKeyString, "")) {
            c10774xe4d138e.a(bytes, bytes.length);
        } else {
            c10774xe4d138e.b(bytes, bytes.length, cacheKeyString, z17);
        }
        int e17 = e();
        int b17 = b();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(b17));
        arrayList.add(java.lang.Integer.valueOf(e17));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/emoji/decode/MMWXAMDecoder", "<init>", "([BLjava/lang/String;Z)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/emoji/decode/MMWXAMDecoder", "<init>", "([BLjava/lang/String;Z)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
        this.f530018b = createBitmap;
    }

    @Override // wq.d
    public int a() {
        com.p314xaae8f345.mm.jni.p801x7810c374.C10774xe4d138e c10774xe4d138e = this.f530017a;
        if (c10774xe4d138e != null) {
            return c10774xe4d138e.f();
        }
        return 0;
    }

    @Override // wq.d
    public int b() {
        com.p314xaae8f345.mm.jni.p801x7810c374.C10774xe4d138e c10774xe4d138e = this.f530017a;
        if (c10774xe4d138e != null) {
            return c10774xe4d138e.g();
        }
        return 0;
    }

    @Override // wq.d
    public void c() {
        com.p314xaae8f345.mm.jni.p801x7810c374.C10774xe4d138e c10774xe4d138e = this.f530017a;
        if (c10774xe4d138e != null) {
            c10774xe4d138e.c();
        }
        java.lang.Integer valueOf = c10774xe4d138e != null ? java.lang.Integer.valueOf(c10774xe4d138e.d(this.f530018b)) : null;
        if (valueOf != null) {
            valueOf.intValue();
        }
    }

    @Override // wq.d
    public int d() {
        com.p314xaae8f345.mm.jni.p801x7810c374.C10774xe4d138e c10774xe4d138e = this.f530017a;
        if (c10774xe4d138e != null) {
            return c10774xe4d138e.e();
        }
        return 0;
    }

    @Override // wq.d
    /* renamed from: destroy */
    public void mo174305x5cd39ffa() {
        com.p314xaae8f345.mm.jni.p801x7810c374.C10774xe4d138e c10774xe4d138e = this.f530017a;
        if (c10774xe4d138e != null) {
            c10774xe4d138e.i();
        }
    }

    @Override // wq.d
    public int e() {
        com.p314xaae8f345.mm.jni.p801x7810c374.C10774xe4d138e c10774xe4d138e = this.f530017a;
        if (c10774xe4d138e != null) {
            return c10774xe4d138e.h();
        }
        return 0;
    }

    @Override // wq.d
    /* renamed from: getFrame */
    public android.graphics.Bitmap mo174306x74704fb7() {
        return this.f530018b;
    }

    @Override // wq.d
    /* renamed from: seekTo */
    public void mo174307xc9fc1b13(long j17) {
    }
}
