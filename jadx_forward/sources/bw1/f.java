package bw1;

/* loaded from: classes12.dex */
public final class f implements java.util.concurrent.Future {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.LinkedBlockingQueue f106335d = new java.util.concurrent.LinkedBlockingQueue(1);

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.FutureTask f106336e = new java.util.concurrent.FutureTask(new bw1.e(this));

    public final boolean a(java.lang.Object obj) {
        boolean offer = this.f106335d.offer(new bw1.c(obj));
        if (offer) {
            this.f106336e.run();
        }
        return offer;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z17) {
        boolean offer = this.f106335d.offer(bw1.b.f106332a);
        if (offer) {
            this.f106336e.cancel(z17);
        }
        return offer;
    }

    @Override // java.util.concurrent.Future
    public java.lang.Object get() {
        return this.f106336e.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f106335d.peek(), bw1.b.f106332a);
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return !this.f106335d.isEmpty();
    }

    @Override // java.util.concurrent.Future
    public java.lang.Object get(long j17, java.util.concurrent.TimeUnit unit) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unit, "unit");
        return this.f106336e.get(j17, unit);
    }
}
