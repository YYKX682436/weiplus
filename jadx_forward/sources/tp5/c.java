package tp5;

/* loaded from: classes12.dex */
public class c implements java.lang.Iterable, java.lang.AutoCloseable {

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f502696p = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: q, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicLong f502697q = new java.util.concurrent.atomic.AtomicLong(1);

    /* renamed from: r, reason: collision with root package name */
    public static volatile java.util.concurrent.ScheduledExecutorService f502698r = null;

    /* renamed from: d, reason: collision with root package name */
    public volatile int f502699d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48 f502700e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992 f502701f;

    /* renamed from: g, reason: collision with root package name */
    public final tp5.f f502702g;

    /* renamed from: h, reason: collision with root package name */
    public final long f502703h;

    /* renamed from: i, reason: collision with root package name */
    public final long f502704i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f502705m;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Throwable f502706o;

    public c(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48 c26919x80675a48, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992 c26923xdf786992, tp5.f fVar) {
        this.f502700e = c26919x80675a48;
        this.f502701f = c26923xdf786992;
        this.f502702g = fVar;
        if (!qi3.y.r9()) {
            this.f502703h = -1L;
            this.f502704i = 0L;
            this.f502705m = "";
            this.f502706o = null;
            return;
        }
        if (f502698r == null) {
            synchronized (tp5.c.class) {
                if (f502698r == null) {
                    java.util.concurrent.ScheduledExecutorService newSingleThreadScheduledExecutor = java.util.concurrent.Executors.newSingleThreadScheduledExecutor(new tp5.ThreadFactoryC30257x2d8c9e());
                    newSingleThreadScheduledExecutor.scheduleAtFixedRate(new tp5.RunnableC30258x2d8c9f(), 30000L, 30000L, java.util.concurrent.TimeUnit.MILLISECONDS);
                    f502698r = newSingleThreadScheduledExecutor;
                }
            }
        }
        long andIncrement = f502697q.getAndIncrement();
        this.f502703h = andIncrement;
        this.f502704i = java.lang.System.currentTimeMillis();
        this.f502705m = java.lang.Thread.currentThread().getName();
        java.lang.Thread.currentThread().getId();
        this.f502706o = new java.lang.Throwable("LazyResult create site");
        f502696p.put(java.lang.Long.valueOf(andIncrement), new java.lang.ref.WeakReference(this));
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        if (this.f502699d >= 2) {
            return;
        }
        java.lang.System.currentTimeMillis();
        try {
            this.f502700e.m106770xec7dd49(this.f502701f);
            this.f502700e.m106777x92d0313b();
        } finally {
            this.f502699d = 2;
            if (qi3.y.r9()) {
                f502696p.remove(java.lang.Long.valueOf(this.f502703h));
                java.lang.Thread.currentThread().getId();
            }
        }
    }

    /* renamed from: finalize */
    public void m166945xd764dc1e() {
        if (this.f502699d < 2) {
            if (qi3.y.r9()) {
                long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f502704i;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WCDBLazyResult", "LEAK_BY_GC lazyId=" + this.f502703h + " ageMs=" + currentTimeMillis + " status=" + this.f502699d + " threadCreate=" + this.f502705m, this.f502706o);
                try {
                    try {
                        ((jm.y) ((qi3.y) i95.n0.c(qi3.y.class))).cj(this.f502703h, currentTimeMillis, this.f502699d, this.f502705m, this.f502706o);
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.IMsgSendService", th6, "reportWCDBLazyCursorLeak failed", new java.lang.Object[0]);
                    }
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WCDBLazyResult", th7, "report leak via IMsgSendService failed", new java.lang.Object[0]);
                }
            }
            try {
                close();
            } catch (java.lang.Throwable th8) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WCDBLazyResult", th8, "close in finalize failed", new java.lang.Object[0]);
            }
        }
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        if (this.f502699d >= 1) {
            throw new java.lang.IllegalStateException("WCDBLazyResult is reentrant or closed");
        }
        this.f502699d = 1;
        return new tp5.e(this, null);
    }
}
