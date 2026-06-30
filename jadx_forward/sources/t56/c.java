package t56;

/* loaded from: classes16.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ThreadFactory f497389a;

    /* renamed from: b, reason: collision with root package name */
    public final long f497390b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f497391c;

    /* renamed from: d, reason: collision with root package name */
    public final a66.c f497392d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ScheduledExecutorService f497393e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.Future f497394f;

    public c(java.util.concurrent.ThreadFactory threadFactory, long j17, java.util.concurrent.TimeUnit timeUnit) {
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService;
        java.util.concurrent.ScheduledFuture<?> scheduledFuture;
        this.f497389a = threadFactory;
        long nanos = timeUnit != null ? timeUnit.toNanos(j17) : 0L;
        this.f497390b = nanos;
        this.f497391c = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f497392d = new a66.c();
        if (timeUnit != null) {
            scheduledExecutorService = java.util.concurrent.Executors.newScheduledThreadPool(1, new t56.a(this, threadFactory));
            t56.y.i(scheduledExecutorService);
            scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(new t56.b(this), nanos, nanos, java.util.concurrent.TimeUnit.NANOSECONDS);
        } else {
            scheduledExecutorService = null;
            scheduledFuture = null;
        }
        this.f497393e = scheduledExecutorService;
        this.f497394f = scheduledFuture;
    }

    public void a() {
        a66.c cVar = this.f497392d;
        try {
            java.util.concurrent.Future future = this.f497394f;
            if (future != null) {
                future.cancel(true);
            }
            java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.f497393e;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        } finally {
            cVar.c();
        }
    }
}
