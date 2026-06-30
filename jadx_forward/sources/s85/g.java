package s85;

/* loaded from: classes4.dex */
public abstract class g extends s85.a implements s85.b {

    /* renamed from: h, reason: collision with root package name */
    public final s85.c f486441h;

    /* renamed from: i, reason: collision with root package name */
    public final s85.c f486442i;

    /* renamed from: m, reason: collision with root package name */
    public final s85.b f486443m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f486444n;

    public g(java.lang.String str, s85.c cVar, s85.c cVar2, java.lang.Object obj) {
        super(str, obj);
        this.f486443m = new s85.f(this);
        this.f486444n = new java.util.concurrent.atomic.AtomicInteger(0);
        this.f486441h = cVar;
        this.f486442i = cVar2;
    }

    @Override // s85.b
    public void a(s85.c cVar, java.lang.Object obj) {
        f(java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue() && ((java.lang.Boolean) ((s85.a) this.f486442i).f486436e).booleanValue()));
    }

    @Override // s85.a
    public void c(s85.b bVar) {
        if (this.f486444n.getAndIncrement() == 0) {
            ((s85.a) this.f486441h).b(this);
            ((s85.a) this.f486442i).b(this.f486443m);
        }
    }

    @Override // s85.a
    public void d(s85.b bVar) {
        e(bVar);
        if (this.f486444n.decrementAndGet() == 0) {
            ((s85.a) this.f486441h).e(this);
            ((s85.a) this.f486442i).e(this.f486443m);
        }
    }
}
