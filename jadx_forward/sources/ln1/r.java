package ln1;

/* loaded from: classes12.dex */
public final class r {

    /* renamed from: g, reason: collision with root package name */
    public boolean f401325g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f401326h;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f401319a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public volatile java.util.concurrent.atomic.AtomicLong f401320b = new java.util.concurrent.atomic.AtomicLong(0);

    /* renamed from: c, reason: collision with root package name */
    public volatile java.util.concurrent.atomic.AtomicLong f401321c = new java.util.concurrent.atomic.AtomicLong(0);

    /* renamed from: d, reason: collision with root package name */
    public volatile java.util.concurrent.locks.Lock f401322d = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b3 f401323e = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b3(true);

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b3 f401324f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b3(true);

    /* renamed from: i, reason: collision with root package name */
    public final int f401327i = j62.e.g().i("clicfg_backup_cache_size", 41943040, false, true);

    /* renamed from: j, reason: collision with root package name */
    public volatile java.util.concurrent.atomic.AtomicLong f401328j = new java.util.concurrent.atomic.AtomicLong(0);

    /* renamed from: k, reason: collision with root package name */
    public volatile java.util.concurrent.atomic.AtomicLong f401329k = new java.util.concurrent.atomic.AtomicLong(0);

    public r() {
        ((ku5.t0) ku5.t0.f394148d).q(new ln1.p(this));
    }

    public final void a(ln1.z task, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        ((java.util.concurrent.locks.ReentrantLock) this.f401322d).lock();
        this.f401328j.addAndGet(j17);
        while (this.f401328j.get() > this.f401327i && !this.f401325g) {
            this.f401324f.b();
            this.f401324f.a(500L);
        }
        if (!this.f401325g) {
            long j18 = this.f401320b.get();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupFlowQueue", "execute index:%d, cacheSize:%d", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(this.f401328j.get()));
            ((ku5.t0) ku5.t0.f394148d).a(new ln1.o(task, j17, this, j18));
            this.f401320b.addAndGet(1L);
        }
        ((java.util.concurrent.locks.ReentrantLock) this.f401322d).unlock();
    }

    public final void b() {
        this.f401320b.set(0L);
        this.f401321c.set(0L);
        this.f401323e.c();
        this.f401324f.c();
        this.f401319a.clear();
        this.f401328j.set(0L);
        this.f401329k.set(0L);
    }
}
