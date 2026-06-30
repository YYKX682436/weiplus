package l4;

/* loaded from: classes13.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public volatile p4.b f397279a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.concurrent.Executor f397280b;

    /* renamed from: c, reason: collision with root package name */
    public p4.f f397281c;

    /* renamed from: d, reason: collision with root package name */
    public final l4.j f397282d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f397283e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f397284f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f397285g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantReadWriteLock f397286h = new java.util.concurrent.locks.ReentrantReadWriteLock();

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.ThreadLocal f397287i = new java.lang.ThreadLocal();

    public q() {
        new java.util.concurrent.ConcurrentHashMap();
        this.f397282d = d();
    }

    public void a() {
        if (this.f397283e) {
            return;
        }
        if (android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread()) {
            throw new java.lang.IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void b() {
        if (!((q4.c) this.f397281c.d0()).f441540d.inTransaction() && this.f397287i.get() != null) {
            throw new java.lang.IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public void c() {
        a();
        p4.b d07 = this.f397281c.d0();
        this.f397282d.c(d07);
        ((q4.c) d07).a();
    }

    public abstract l4.j d();

    public abstract p4.f e(l4.a aVar);

    public void f() {
        ((q4.c) this.f397281c.d0()).b();
        if (((q4.c) this.f397281c.d0()).f441540d.inTransaction()) {
            return;
        }
        l4.j jVar = this.f397282d;
        if (jVar.f397255d.compareAndSet(false, true)) {
            jVar.f397254c.f397280b.execute(jVar.f397260i);
        }
    }

    public android.database.Cursor g(p4.h hVar, android.os.CancellationSignal cancellationSignal) {
        a();
        b();
        if (cancellationSignal == null) {
            return ((q4.c) this.f397281c.d0()).i(hVar);
        }
        q4.c cVar = (q4.c) this.f397281c.d0();
        return cVar.f441540d.rawQueryWithFactory(new q4.b(cVar, hVar), hVar.a(), q4.c.f441539e, null, cancellationSignal);
    }

    public void h() {
        ((q4.c) this.f397281c.d0()).j();
    }
}
