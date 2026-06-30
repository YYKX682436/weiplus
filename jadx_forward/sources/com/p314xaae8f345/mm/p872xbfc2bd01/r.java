package com.p314xaae8f345.mm.p872xbfc2bd01;

/* loaded from: classes4.dex */
public class r implements com.p314xaae8f345.mm.p872xbfc2bd01.l {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Bitmap f150503d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f150504e = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    /* renamed from: f, reason: collision with root package name */
    public boolean f150505f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f150506g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f150507h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Runnable f150508i;

    /* renamed from: m, reason: collision with root package name */
    public int f150509m;

    /* renamed from: n, reason: collision with root package name */
    public int f150510n;

    static {
        new java.util.concurrent.ConcurrentHashMap();
    }

    public r(android.graphics.Bitmap bitmap) {
        this.f150503d = null;
        this.f150505f = false;
        java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger();
        this.f150506g = atomicInteger;
        this.f150507h = true;
        this.f150508i = new com.p314xaae8f345.mm.p872xbfc2bd01.q(this);
        this.f150509m = 0;
        this.f150510n = 0;
        this.f150503d = bitmap;
        atomicInteger.set(1);
        this.f150505f = false;
        d();
    }

    public static com.p314xaae8f345.mm.p872xbfc2bd01.r c(android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new com.p314xaae8f345.mm.p872xbfc2bd01.r(bitmap);
    }

    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.l
    public void a() {
        this.f150506g.incrementAndGet();
    }

    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.l
    public void b() {
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.f150506g;
        if (atomicInteger.get() > 0) {
            atomicInteger.decrementAndGet();
            if (atomicInteger.get() < 0) {
                return;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f150504e;
            java.lang.Runnable runnable = this.f150508i;
            n3Var.mo50300x3fa464aa(runnable);
            n3Var.mo50297x7c4d7ca2(runnable, 500L);
        }
    }

    public final int d() {
        boolean a17 = fp.h.a(19);
        android.graphics.Bitmap bitmap = this.f150503d;
        if (a17) {
            if (bitmap != null && !bitmap.isRecycled()) {
                int byteCount = bitmap.getByteCount();
                this.f150509m = byteCount;
                return byteCount;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReleasableBitmap", "getByteCount recycle " + this.f150509m + " " + m46890x9616526c());
            return this.f150509m;
        }
        if (bitmap != null && !bitmap.isRecycled()) {
            int allocationByteCount = bitmap.getAllocationByteCount();
            this.f150510n = allocationByteCount;
            return allocationByteCount;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReleasableBitmap", "getAllocationByteCount recycle " + this.f150510n + " " + m46890x9616526c());
        return this.f150510n;
    }

    public boolean e() {
        android.graphics.Bitmap bitmap;
        return this.f150505f || (bitmap = this.f150503d) == null || bitmap.isRecycled();
    }

    public final boolean f() {
        if (this.f150505f || this.f150506g.get() > 0) {
            return false;
        }
        this.f150505f = true;
        if (this.f150507h) {
            com.p314xaae8f345.mm.p872xbfc2bd01.o.c().d(this.f150503d);
        }
        return true;
    }

    /* renamed from: finalize */
    public void m46889xd764dc1e() {
    }

    /* renamed from: toString */
    public java.lang.String m46890x9616526c() {
        return super.toString();
    }
}
