package rx.p3379xd70c5718;

/* renamed from: rx.schedulers.TestScheduler */
/* loaded from: classes16.dex */
public class C30150x4df5d029 extends p56.q {

    /* renamed from: g, reason: collision with root package name */
    public static long f482428g;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Queue f482429e = new java.util.PriorityQueue(11, new y56.a());

    /* renamed from: f, reason: collision with root package name */
    public long f482430f;

    public final void a(long j17) {
        while (true) {
            java.util.Queue queue = this.f482429e;
            if (queue.isEmpty()) {
                break;
            }
            y56.e eVar = (y56.e) ((java.util.PriorityQueue) queue).peek();
            long j18 = eVar.f541116a;
            if (j18 > j17) {
                break;
            }
            if (j18 == 0) {
                j18 = this.f482430f;
            }
            this.f482430f = j18;
            queue.remove();
            if (!eVar.f541118c.b()) {
                eVar.f541117b.mo740x2e7a5e();
            }
        }
        this.f482430f = j17;
    }

    /* renamed from: advanceTimeBy */
    public void m163355xe7eb8726(long j17, java.util.concurrent.TimeUnit timeUnit) {
        m163356xe7eb894a(this.f482430f + timeUnit.toNanos(j17), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    /* renamed from: advanceTimeTo */
    public void m163356xe7eb894a(long j17, java.util.concurrent.TimeUnit timeUnit) {
        a(timeUnit.toNanos(j17));
    }

    @Override // p56.q
    /* renamed from: createWorker */
    public p56.p mo157871x6217339a() {
        return new y56.d(this);
    }

    @Override // p56.q
    public long now() {
        return java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(this.f482430f);
    }

    /* renamed from: triggerActions */
    public void m163357xc7842c25() {
        a(this.f482430f);
    }
}
