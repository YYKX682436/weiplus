package com.tencent.mm.memory;

/* loaded from: classes4.dex */
public class r implements com.tencent.mm.memory.l {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Bitmap f68970d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f68971e = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: f, reason: collision with root package name */
    public boolean f68972f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f68973g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f68974h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Runnable f68975i;

    /* renamed from: m, reason: collision with root package name */
    public int f68976m;

    /* renamed from: n, reason: collision with root package name */
    public int f68977n;

    static {
        new java.util.concurrent.ConcurrentHashMap();
    }

    public r(android.graphics.Bitmap bitmap) {
        this.f68970d = null;
        this.f68972f = false;
        java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger();
        this.f68973g = atomicInteger;
        this.f68974h = true;
        this.f68975i = new com.tencent.mm.memory.q(this);
        this.f68976m = 0;
        this.f68977n = 0;
        this.f68970d = bitmap;
        atomicInteger.set(1);
        this.f68972f = false;
        d();
    }

    public static com.tencent.mm.memory.r c(android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new com.tencent.mm.memory.r(bitmap);
    }

    @Override // com.tencent.mm.memory.l
    public void a() {
        this.f68973g.incrementAndGet();
    }

    @Override // com.tencent.mm.memory.l
    public void b() {
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.f68973g;
        if (atomicInteger.get() > 0) {
            atomicInteger.decrementAndGet();
            if (atomicInteger.get() < 0) {
                return;
            }
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.f68971e;
            java.lang.Runnable runnable = this.f68975i;
            n3Var.removeCallbacks(runnable);
            n3Var.postDelayed(runnable, 500L);
        }
    }

    public final int d() {
        boolean a17 = fp.h.a(19);
        android.graphics.Bitmap bitmap = this.f68970d;
        if (a17) {
            if (bitmap != null && !bitmap.isRecycled()) {
                int byteCount = bitmap.getByteCount();
                this.f68976m = byteCount;
                return byteCount;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ReleasableBitmap", "getByteCount recycle " + this.f68976m + " " + toString());
            return this.f68976m;
        }
        if (bitmap != null && !bitmap.isRecycled()) {
            int allocationByteCount = bitmap.getAllocationByteCount();
            this.f68977n = allocationByteCount;
            return allocationByteCount;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ReleasableBitmap", "getAllocationByteCount recycle " + this.f68977n + " " + toString());
        return this.f68977n;
    }

    public boolean e() {
        android.graphics.Bitmap bitmap;
        return this.f68972f || (bitmap = this.f68970d) == null || bitmap.isRecycled();
    }

    public final boolean f() {
        if (this.f68972f || this.f68973g.get() > 0) {
            return false;
        }
        this.f68972f = true;
        if (this.f68974h) {
            com.tencent.mm.memory.o.c().d(this.f68970d);
        }
        return true;
    }

    public void finalize() {
    }

    public java.lang.String toString() {
        return super.toString();
    }
}
