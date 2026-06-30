package aw1;

/* loaded from: classes10.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f96080d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.CancellationSignal f96081e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicLong f96082f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicLong f96083g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicLong f96084h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f96085i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f96086m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f96087n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f96088o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicInteger f96089p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f96090q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicLong f96091r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicLong f96092s;

    public j0(java.util.Set set, android.os.CancellationSignal cancellationSignal, java.util.concurrent.atomic.AtomicLong atomicLong, java.util.concurrent.atomic.AtomicLong atomicLong2, java.util.concurrent.atomic.AtomicLong atomicLong3, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var3, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var4, java.util.concurrent.atomic.AtomicInteger atomicInteger, int i17, java.util.concurrent.atomic.AtomicLong atomicLong4, java.util.concurrent.atomic.AtomicLong atomicLong5) {
        this.f96080d = set;
        this.f96081e = cancellationSignal;
        this.f96082f = atomicLong;
        this.f96083g = atomicLong2;
        this.f96084h = atomicLong3;
        this.f96085i = h0Var;
        this.f96086m = h0Var2;
        this.f96087n = h0Var3;
        this.f96088o = h0Var4;
        this.f96089p = atomicInteger;
        this.f96090q = i17;
        this.f96091r = atomicLong4;
        this.f96092s = atomicLong5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.ExecutorService newFixedThreadPool = java.util.concurrent.Executors.newFixedThreadPool(aw1.l0.f96102b, new aw1.g0("Media-Convert-Pool"));
        java.util.Set set = this.f96080d;
        int size = set.size() / aw1.l0.f96102b;
        if (size < 1) {
            size = 1;
        }
        java.util.List N = kz5.n0.N(set, size);
        aw1.l0.f96107g = true;
        for (java.util.Iterator it = N.iterator(); it.hasNext(); it = it) {
            newFixedThreadPool.execute(new aw1.i0((java.util.List) it.next(), this.f96081e, this.f96082f, this.f96083g, this.f96084h, this.f96085i, this.f96086m, this.f96087n, this.f96088o, this.f96089p, this.f96090q, this.f96091r, this.f96092s, newFixedThreadPool));
        }
    }
}
