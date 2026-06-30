package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public class kh extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jz {

    /* renamed from: a, reason: collision with root package name */
    public static final int f131610a = 10;

    /* renamed from: h, reason: collision with root package name */
    private static final com.tencent.mapsdk.internal.lk.a f131611h;

    /* renamed from: i, reason: collision with root package name */
    private static final com.tencent.mapsdk.internal.lk.g<com.tencent.mapsdk.internal.lk.i<android.graphics.Bitmap>> f131612i;

    /* renamed from: c, reason: collision with root package name */
    protected android.graphics.Bitmap f131614c;

    /* renamed from: d, reason: collision with root package name */
    protected byte[] f131615d;

    /* renamed from: e, reason: collision with root package name */
    public int f131616e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f131617f;

    /* renamed from: b, reason: collision with root package name */
    protected final java.util.concurrent.atomic.AtomicInteger f131613b = new java.util.concurrent.atomic.AtomicInteger();

    /* renamed from: g, reason: collision with root package name */
    protected final java.lang.Object f131618g = new java.lang.Object();

    static {
        com.tencent.mapsdk.internal.lk.a aVar = new com.tencent.mapsdk.internal.lk.a(android.graphics.Bitmap.Config.ARGB_8888);
        f131611h = aVar;
        f131612i = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lk.a(aVar);
    }

    public kh() {
    }

    public static void a(com.tencent.mapsdk.internal.lk.a aVar) {
        com.tencent.mapsdk.internal.lk.a aVar2 = f131611h;
        if (aVar != null) {
            aVar2.f131847a = aVar.f131847a;
            aVar2.f131848b = aVar.f131848b;
            aVar2.f131849c = aVar.f131849c;
        }
    }

    private void h() {
        byte[] bArr;
        android.graphics.Bitmap bitmap = this.f131614c;
        if (bitmap == null && (bArr = this.f131615d) != null) {
            this.f131616e = bArr.length;
        }
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        synchronized (this.f131618g) {
            this.f131616e = this.f131614c.getAllocationByteCount();
        }
    }

    private void i() {
        android.graphics.Bitmap bitmap = this.f131614c;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        synchronized (this.f131618g) {
            this.f131617f = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.a(this.f131614c);
        }
    }

    private java.lang.String j() {
        return this.f131617f;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jz
    public final byte[] b() {
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        java.lang.Throwable th6;
        byte[] bArr = this.f131615d;
        if (bArr != null) {
            return bArr;
        }
        android.graphics.Bitmap bitmap = this.f131614c;
        if (bitmap != null && !bitmap.isRecycled()) {
            synchronized (this.f131618g) {
                try {
                    byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                    try {
                        if (this.f131614c.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream)) {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(byteArrayOutputStream);
                            return byteArray;
                        }
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(byteArrayOutputStream);
                    } catch (java.lang.Throwable th7) {
                        th6 = th7;
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(byteArrayOutputStream);
                        throw th6;
                    }
                } catch (java.lang.Throwable th8) {
                    byteArrayOutputStream = null;
                    th6 = th8;
                }
            }
        }
        return new byte[0];
    }

    public final synchronized android.graphics.Bitmap c() {
        if (this.f131614c == null) {
            a(this.f131615d);
        }
        android.graphics.Bitmap bitmap = this.f131614c;
        if (bitmap != null && bitmap.isRecycled()) {
            return null;
        }
        return this.f131614c;
    }

    public final void d() {
        android.graphics.Bitmap bitmap = this.f131614c;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        int decrementAndGet = this.f131613b.decrementAndGet();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131751s).a("decrement refCount:" + decrementAndGet + " id = " + this.f131617f);
    }

    public final void e() {
        android.graphics.Bitmap bitmap = this.f131614c;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        int incrementAndGet = this.f131613b.incrementAndGet();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131751s).a("increment refCount:" + incrementAndGet + " id = " + this.f131617f);
    }

    public boolean f() {
        android.graphics.Bitmap bitmap = this.f131614c;
        if (bitmap != null && !bitmap.isRecycled() && this.f131613b.decrementAndGet() <= 0) {
            synchronized (this.f131618g) {
                this.f131614c.recycle();
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131751s).a("recycle out");
        }
        this.f131615d = null;
        android.graphics.Bitmap bitmap2 = this.f131614c;
        return bitmap2 == null || bitmap2.isRecycled();
    }

    public final boolean g() {
        boolean isRecycled;
        if (this.f131614c == null) {
            byte[] bArr = this.f131615d;
            return bArr == null || bArr.length == 0;
        }
        synchronized (this.f131618g) {
            isRecycled = this.f131614c.isRecycled();
        }
        return isRecycled;
    }

    /* renamed from: toString */
    public java.lang.String m36809x9616526c() {
        return "BitmapData{id='" + this.f131617f + "'}";
    }

    public kh(android.graphics.Bitmap bitmap) {
        this.f131614c = bitmap;
        i();
        h();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jz
    public final int a() {
        return this.f131616e;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jz
    public final void a(byte[] bArr) {
        int i17;
        f();
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        this.f131615d = bArr;
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            android.graphics.BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131751s, "BitmapData testOpts decodingByteArray exception: ", e17.fillInStackTrace());
        }
        int i18 = options.outWidth;
        if (i18 <= 0 || (i17 = options.outHeight) <= 0) {
            return;
        }
        com.tencent.mapsdk.internal.lk.a aVar = f131611h;
        aVar.f131847a = i18;
        aVar.f131848b = i17;
        boolean z17 = false;
        android.graphics.Bitmap bitmap = null;
        for (int i19 = 0; !z17 && i19 < 20; i19++) {
            com.tencent.mapsdk.internal.lk.i<android.graphics.Bitmap> a17 = f131612i.a();
            if (a17 != null) {
                bitmap = a17.f131856a;
                if (!bitmap.isRecycled() && bitmap.getWidth() == options.outWidth && bitmap.getHeight() == options.outHeight) {
                    z17 = true;
                }
            }
        }
        android.graphics.BitmapFactory.Options options2 = new android.graphics.BitmapFactory.Options();
        if (z17) {
            options2.inBitmap = bitmap;
        }
        options2.inSampleSize = 1;
        options2.inMutable = true;
        try {
            synchronized (this.f131618g) {
                this.f131614c = android.graphics.BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options2);
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131751s, "BitmapData opts decodingByteArray exception: ", e18.fillInStackTrace());
        }
        this.f131615d = null;
        i();
        h();
    }

    public kh(byte[] bArr) {
        this.f131615d = bArr;
        if (bArr != null) {
            a(bArr);
        }
    }
}
