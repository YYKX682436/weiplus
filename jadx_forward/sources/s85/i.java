package s85;

/* loaded from: classes4.dex */
public abstract class i extends s85.a implements s85.b {

    /* renamed from: h, reason: collision with root package name */
    public final s85.c f486445h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f486446i;

    public i(java.lang.String str, s85.c cVar, java.lang.Object obj) {
        super(str, obj);
        this.f486446i = new java.util.concurrent.atomic.AtomicInteger(0);
        this.f486445h = cVar;
    }

    @Override // s85.b
    public void a(s85.c cVar, java.lang.Object obj) {
        f(java.lang.Boolean.valueOf(!((java.lang.Boolean) obj).booleanValue()));
    }

    @Override // s85.a
    public void c(s85.b bVar) {
        if (this.f486446i.getAndIncrement() == 0) {
            ((s85.a) this.f486445h).b(this);
        }
    }

    @Override // s85.a
    public void d(s85.b bVar) {
        if (this.f486446i.decrementAndGet() == 0) {
            ((s85.a) this.f486445h).e(this);
        }
    }
}
