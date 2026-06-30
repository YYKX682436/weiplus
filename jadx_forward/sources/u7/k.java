package u7;

/* loaded from: classes13.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f506590a = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f506591b;

    /* renamed from: c, reason: collision with root package name */
    public volatile u7.e f506592c;

    /* renamed from: d, reason: collision with root package name */
    public final u7.b f506593d;

    /* renamed from: e, reason: collision with root package name */
    public final u7.c f506594e;

    public k(java.lang.String str, u7.c cVar) {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = new java.util.concurrent.CopyOnWriteArrayList();
        str.getClass();
        this.f506591b = str;
        cVar.getClass();
        this.f506594e = cVar;
        this.f506593d = new u7.j(str, copyOnWriteArrayList);
    }

    public final u7.e a() {
        u7.c cVar = this.f506594e;
        x7.b bVar = cVar.f506569d;
        w7.b bVar2 = cVar.f506570e;
        java.lang.String str = this.f506591b;
        u7.e eVar = new u7.e(new u7.l(str, bVar, bVar2), new v7.b(new java.io.File(cVar.f506566a, ((v7.i) cVar.f506567b).a(str)), cVar.f506568c));
        eVar.f506578k = this.f506593d;
        return eVar;
    }

    public void b(u7.d dVar, java.net.Socket socket) {
        synchronized (this) {
            this.f506592c = this.f506592c == null ? a() : this.f506592c;
        }
        try {
            this.f506590a.incrementAndGet();
            this.f506592c.f(dVar, socket);
            synchronized (this) {
                if (this.f506590a.decrementAndGet() <= 0) {
                    this.f506592c.d();
                    this.f506592c = null;
                }
            }
        } catch (java.lang.Throwable th6) {
            synchronized (this) {
                if (this.f506590a.decrementAndGet() <= 0) {
                    this.f506592c.d();
                    this.f506592c = null;
                }
                throw th6;
            }
        }
    }
}
