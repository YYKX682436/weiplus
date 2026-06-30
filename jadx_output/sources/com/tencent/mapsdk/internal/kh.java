package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public class kh extends com.tencent.mapsdk.internal.jz {

    /* renamed from: a, reason: collision with root package name */
    public static final int f50077a = 10;

    /* renamed from: h, reason: collision with root package name */
    private static final com.tencent.mapsdk.internal.lk.a f50078h;

    /* renamed from: i, reason: collision with root package name */
    private static final com.tencent.mapsdk.internal.lk.g<com.tencent.mapsdk.internal.lk.i<android.graphics.Bitmap>> f50079i;

    /* renamed from: c, reason: collision with root package name */
    protected android.graphics.Bitmap f50081c;

    /* renamed from: d, reason: collision with root package name */
    protected byte[] f50082d;

    /* renamed from: e, reason: collision with root package name */
    public int f50083e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f50084f;

    /* renamed from: b, reason: collision with root package name */
    protected final java.util.concurrent.atomic.AtomicInteger f50080b = new java.util.concurrent.atomic.AtomicInteger();

    /* renamed from: g, reason: collision with root package name */
    protected final java.lang.Object f50085g = new java.lang.Object();

    static {
        com.tencent.mapsdk.internal.lk.a aVar = new com.tencent.mapsdk.internal.lk.a(android.graphics.Bitmap.Config.ARGB_8888);
        f50078h = aVar;
        f50079i = com.tencent.mapsdk.internal.lk.a(aVar);
    }

    public kh() {
    }

    public static void a(com.tencent.mapsdk.internal.lk.a aVar) {
        com.tencent.mapsdk.internal.lk.a aVar2 = f50078h;
        if (aVar != null) {
            aVar2.f50314a = aVar.f50314a;
            aVar2.f50315b = aVar.f50315b;
            aVar2.f50316c = aVar.f50316c;
        }
    }

    private void h() {
        byte[] bArr;
        android.graphics.Bitmap bitmap = this.f50081c;
        if (bitmap == null && (bArr = this.f50082d) != null) {
            this.f50083e = bArr.length;
        }
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        synchronized (this.f50085g) {
            this.f50083e = this.f50081c.getAllocationByteCount();
        }
    }

    private void i() {
        android.graphics.Bitmap bitmap = this.f50081c;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        synchronized (this.f50085g) {
            this.f50084f = com.tencent.mapsdk.internal.hl.a(this.f50081c);
        }
    }

    private java.lang.String j() {
        return this.f50084f;
    }

    @Override // com.tencent.mapsdk.internal.jz
    public final byte[] b() {
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        java.lang.Throwable th6;
        byte[] bArr = this.f50082d;
        if (bArr != null) {
            return bArr;
        }
        android.graphics.Bitmap bitmap = this.f50081c;
        if (bitmap != null && !bitmap.isRecycled()) {
            synchronized (this.f50085g) {
                try {
                    byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                    try {
                        if (this.f50081c.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream)) {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            com.tencent.mapsdk.internal.kt.a(byteArrayOutputStream);
                            return byteArray;
                        }
                        com.tencent.mapsdk.internal.kt.a(byteArrayOutputStream);
                    } catch (java.lang.Throwable th7) {
                        th6 = th7;
                        com.tencent.mapsdk.internal.kt.a(byteArrayOutputStream);
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
        if (this.f50081c == null) {
            a(this.f50082d);
        }
        android.graphics.Bitmap bitmap = this.f50081c;
        if (bitmap != null && bitmap.isRecycled()) {
            return null;
        }
        return this.f50081c;
    }

    public final void d() {
        android.graphics.Bitmap bitmap = this.f50081c;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        int decrementAndGet = this.f50080b.decrementAndGet();
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50218s).a("decrement refCount:" + decrementAndGet + " id = " + this.f50084f);
    }

    public final void e() {
        android.graphics.Bitmap bitmap = this.f50081c;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        int incrementAndGet = this.f50080b.incrementAndGet();
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50218s).a("increment refCount:" + incrementAndGet + " id = " + this.f50084f);
    }

    public boolean f() {
        android.graphics.Bitmap bitmap = this.f50081c;
        if (bitmap != null && !bitmap.isRecycled() && this.f50080b.decrementAndGet() <= 0) {
            synchronized (this.f50085g) {
                this.f50081c.recycle();
            }
            com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50218s).a("recycle out");
        }
        this.f50082d = null;
        android.graphics.Bitmap bitmap2 = this.f50081c;
        return bitmap2 == null || bitmap2.isRecycled();
    }

    public final boolean g() {
        boolean isRecycled;
        if (this.f50081c == null) {
            byte[] bArr = this.f50082d;
            return bArr == null || bArr.length == 0;
        }
        synchronized (this.f50085g) {
            isRecycled = this.f50081c.isRecycled();
        }
        return isRecycled;
    }

    public java.lang.String toString() {
        return "BitmapData{id='" + this.f50084f + "'}";
    }

    public kh(android.graphics.Bitmap bitmap) {
        this.f50081c = bitmap;
        i();
        h();
    }

    @Override // com.tencent.mapsdk.internal.jz
    public final int a() {
        return this.f50083e;
    }

    @Override // com.tencent.mapsdk.internal.jz
    public final void a(byte[] bArr) {
        int i17;
        f();
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        this.f50082d = bArr;
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            android.graphics.BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } catch (java.lang.Exception e17) {
            com.tencent.mapsdk.core.utils.log.LogUtil.a(com.tencent.mapsdk.internal.kx.f50218s, "BitmapData testOpts decodingByteArray exception: ", e17.fillInStackTrace());
        }
        int i18 = options.outWidth;
        if (i18 <= 0 || (i17 = options.outHeight) <= 0) {
            return;
        }
        com.tencent.mapsdk.internal.lk.a aVar = f50078h;
        aVar.f50314a = i18;
        aVar.f50315b = i17;
        boolean z17 = false;
        android.graphics.Bitmap bitmap = null;
        for (int i19 = 0; !z17 && i19 < 20; i19++) {
            com.tencent.mapsdk.internal.lk.i<android.graphics.Bitmap> a17 = f50079i.a();
            if (a17 != null) {
                bitmap = a17.f50323a;
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
            synchronized (this.f50085g) {
                this.f50081c = android.graphics.BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options2);
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mapsdk.core.utils.log.LogUtil.a(com.tencent.mapsdk.internal.kx.f50218s, "BitmapData opts decodingByteArray exception: ", e18.fillInStackTrace());
        }
        this.f50082d = null;
        i();
        h();
    }

    public kh(byte[] bArr) {
        this.f50082d = bArr;
        if (bArr != null) {
            a(bArr);
        }
    }
}
