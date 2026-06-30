package p3325xe03a0797.p3326xc267989b;

/* loaded from: classes14.dex */
public final class g2 extends p3325xe03a0797.p3326xc267989b.f2 implements p3325xe03a0797.p3326xc267989b.i1 {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.Executor f392009e;

    public g2(java.util.concurrent.Executor executor) {
        java.lang.reflect.Method method;
        this.f392009e = executor;
        java.lang.reflect.Method method2 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.e.f392024a;
        try {
            java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof java.util.concurrent.ScheduledThreadPoolExecutor ? (java.util.concurrent.ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.e.f392024a) != null) {
                method.invoke(scheduledThreadPoolExecutor, java.lang.Boolean.TRUE);
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // p3325xe03a0797.p3326xc267989b.p0
    public void D(oz5.l lVar, java.lang.Runnable runnable) {
        try {
            this.f392009e.execute(runnable);
        } catch (java.util.concurrent.RejectedExecutionException e17) {
            p3325xe03a0797.p3326xc267989b.v2.b(lVar, p3325xe03a0797.p3326xc267989b.e2.a("The task was rejected", e17));
            p3325xe03a0797.p3326xc267989b.q1.f392103c.D(lVar, runnable);
        }
    }

    @Override // p3325xe03a0797.p3326xc267989b.f2
    public java.util.concurrent.Executor K() {
        return this.f392009e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        java.util.concurrent.Executor executor = this.f392009e;
        java.util.concurrent.ExecutorService executorService = executor instanceof java.util.concurrent.ExecutorService ? (java.util.concurrent.ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    /* renamed from: equals */
    public boolean m144015xb2c87fbf(java.lang.Object obj) {
        return (obj instanceof p3325xe03a0797.p3326xc267989b.g2) && ((p3325xe03a0797.p3326xc267989b.g2) obj).f392009e == this.f392009e;
    }

    /* renamed from: hashCode */
    public int m144016x8cdac1b() {
        return java.lang.System.identityHashCode(this.f392009e);
    }

    @Override // p3325xe03a0797.p3326xc267989b.p0
    /* renamed from: toString */
    public java.lang.String mo143973x9616526c() {
        return this.f392009e.toString();
    }

    @Override // p3325xe03a0797.p3326xc267989b.i1
    public p3325xe03a0797.p3326xc267989b.s1 v(long j17, java.lang.Runnable runnable, oz5.l lVar) {
        java.util.concurrent.Executor executor = this.f392009e;
        java.util.concurrent.ScheduledFuture<?> scheduledFuture = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = executor instanceof java.util.concurrent.ScheduledExecutorService ? (java.util.concurrent.ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(runnable, j17, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.util.concurrent.RejectedExecutionException e17) {
                p3325xe03a0797.p3326xc267989b.v2.b(lVar, p3325xe03a0797.p3326xc267989b.e2.a("The task was rejected", e17));
            }
        }
        return scheduledFuture != null ? new p3325xe03a0797.p3326xc267989b.r1(scheduledFuture) : p3325xe03a0797.p3326xc267989b.d1.f391690n.v(j17, runnable, lVar);
    }

    @Override // p3325xe03a0797.p3326xc267989b.i1
    public void w(long j17, p3325xe03a0797.p3326xc267989b.q qVar) {
        java.util.concurrent.Executor executor = this.f392009e;
        java.util.concurrent.ScheduledFuture<?> scheduledFuture = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = executor instanceof java.util.concurrent.ScheduledExecutorService ? (java.util.concurrent.ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            p3325xe03a0797.p3326xc267989b.p3 p3Var = new p3325xe03a0797.p3326xc267989b.p3(this, qVar);
            oz5.l lVar = ((p3325xe03a0797.p3326xc267989b.r) qVar).f392110e;
            try {
                scheduledFuture = scheduledExecutorService.schedule(p3Var, j17, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.util.concurrent.RejectedExecutionException e17) {
                p3325xe03a0797.p3326xc267989b.v2.b(lVar, p3325xe03a0797.p3326xc267989b.e2.a("The task was rejected", e17));
            }
        }
        if (scheduledFuture != null) {
            ((p3325xe03a0797.p3326xc267989b.r) qVar).m(new p3325xe03a0797.p3326xc267989b.m(scheduledFuture));
        } else {
            p3325xe03a0797.p3326xc267989b.d1.f391690n.w(j17, qVar);
        }
    }
}
