package y56;

/* loaded from: classes16.dex */
public final class d extends p56.p {

    /* renamed from: d, reason: collision with root package name */
    public final a66.b f541114d = new a66.b();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rx.p3379xd70c5718.C30150x4df5d029 f541115e;

    public d(rx.p3379xd70c5718.C30150x4df5d029 c30150x4df5d029) {
        this.f541115e = c30150x4df5d029;
    }

    @Override // p56.p
    public long a() {
        return this.f541115e.now();
    }

    @Override // p56.s
    public boolean b() {
        return this.f541114d.b();
    }

    @Override // p56.s
    public void c() {
        this.f541114d.c();
    }

    @Override // p56.p
    public p56.s d(r56.a aVar) {
        y56.e eVar = new y56.e(this, 0L, aVar);
        ((java.util.PriorityQueue) this.f541115e.f482429e).add(eVar);
        return new a66.b(new y56.c(this, eVar));
    }

    @Override // p56.p
    public p56.s e(r56.a aVar, long j17, java.util.concurrent.TimeUnit timeUnit) {
        rx.p3379xd70c5718.C30150x4df5d029 c30150x4df5d029 = this.f541115e;
        y56.e eVar = new y56.e(this, c30150x4df5d029.f482430f + timeUnit.toNanos(j17), aVar);
        ((java.util.PriorityQueue) c30150x4df5d029.f482429e).add(eVar);
        return new a66.b(new y56.b(this, eVar));
    }
}
