package bw1;

/* loaded from: classes12.dex */
public final class f implements java.util.concurrent.Future {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.LinkedBlockingQueue f24802d = new java.util.concurrent.LinkedBlockingQueue(1);

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.FutureTask f24803e = new java.util.concurrent.FutureTask(new bw1.e(this));

    public final boolean a(java.lang.Object obj) {
        boolean offer = this.f24802d.offer(new bw1.c(obj));
        if (offer) {
            this.f24803e.run();
        }
        return offer;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z17) {
        boolean offer = this.f24802d.offer(bw1.b.f24799a);
        if (offer) {
            this.f24803e.cancel(z17);
        }
        return offer;
    }

    @Override // java.util.concurrent.Future
    public java.lang.Object get() {
        return this.f24803e.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return kotlin.jvm.internal.o.b(this.f24802d.peek(), bw1.b.f24799a);
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return !this.f24802d.isEmpty();
    }

    @Override // java.util.concurrent.Future
    public java.lang.Object get(long j17, java.util.concurrent.TimeUnit unit) {
        kotlin.jvm.internal.o.g(unit, "unit");
        return this.f24803e.get(j17, unit);
    }
}
