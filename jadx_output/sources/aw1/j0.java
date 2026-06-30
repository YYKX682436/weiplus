package aw1;

/* loaded from: classes10.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f14547d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.CancellationSignal f14548e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicLong f14549f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicLong f14550g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicLong f14551h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f14552i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f14553m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f14554n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f14555o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicInteger f14556p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f14557q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicLong f14558r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicLong f14559s;

    public j0(java.util.Set set, android.os.CancellationSignal cancellationSignal, java.util.concurrent.atomic.AtomicLong atomicLong, java.util.concurrent.atomic.AtomicLong atomicLong2, java.util.concurrent.atomic.AtomicLong atomicLong3, kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2, kotlin.jvm.internal.h0 h0Var3, kotlin.jvm.internal.h0 h0Var4, java.util.concurrent.atomic.AtomicInteger atomicInteger, int i17, java.util.concurrent.atomic.AtomicLong atomicLong4, java.util.concurrent.atomic.AtomicLong atomicLong5) {
        this.f14547d = set;
        this.f14548e = cancellationSignal;
        this.f14549f = atomicLong;
        this.f14550g = atomicLong2;
        this.f14551h = atomicLong3;
        this.f14552i = h0Var;
        this.f14553m = h0Var2;
        this.f14554n = h0Var3;
        this.f14555o = h0Var4;
        this.f14556p = atomicInteger;
        this.f14557q = i17;
        this.f14558r = atomicLong4;
        this.f14559s = atomicLong5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.ExecutorService newFixedThreadPool = java.util.concurrent.Executors.newFixedThreadPool(aw1.l0.f14569b, new aw1.g0("Media-Convert-Pool"));
        java.util.Set set = this.f14547d;
        int size = set.size() / aw1.l0.f14569b;
        if (size < 1) {
            size = 1;
        }
        java.util.List N = kz5.n0.N(set, size);
        aw1.l0.f14574g = true;
        for (java.util.Iterator it = N.iterator(); it.hasNext(); it = it) {
            newFixedThreadPool.execute(new aw1.i0((java.util.List) it.next(), this.f14548e, this.f14549f, this.f14550g, this.f14551h, this.f14552i, this.f14553m, this.f14554n, this.f14555o, this.f14556p, this.f14557q, this.f14558r, this.f14559s, newFixedThreadPool));
        }
    }
}
