package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService */
/* loaded from: classes14.dex */
public final class ScheduledExecutorServiceC0806x660aff3f extends java.util.concurrent.AbstractExecutorService implements java.util.concurrent.ScheduledExecutorService {

    /* renamed from: sThreadLocalInstance */
    private static java.lang.ThreadLocal<java.util.concurrent.ScheduledExecutorService> f1983x90d813c3 = new java.lang.ThreadLocal<java.util.concurrent.ScheduledExecutorService>() { // from class: androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.1
        @Override // java.lang.ThreadLocal
        public java.util.concurrent.ScheduledExecutorService initialValue() {
            if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5982x891c9b16();
            }
            if (android.os.Looper.myLooper() != null) {
                return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ScheduledExecutorServiceC0806x660aff3f(new android.os.Handler(android.os.Looper.myLooper()));
            }
            return null;
        }
    };

    /* renamed from: mHandler */
    private final android.os.Handler f1984xc7640a1d;

    /* renamed from: androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService$HandlerScheduledFuture */
    /* loaded from: classes14.dex */
    public static class HandlerScheduledFuture<V> implements java.util.concurrent.RunnableScheduledFuture<V> {

        /* renamed from: mCompleter */
        final java.util.concurrent.atomic.AtomicReference<t2.k> f1987x2718406c = new java.util.concurrent.atomic.AtomicReference<>(null);

        /* renamed from: mDelegate */
        private final wa.a f1988x55d38512;

        /* renamed from: mRunAtMillis */
        private final long f1989x34bbd557;

        /* renamed from: mTask */
        private final java.util.concurrent.Callable<V> f1990x627ab92;

        public HandlerScheduledFuture(final android.os.Handler handler, long j17, final java.util.concurrent.Callable<V> callable) {
            this.f1989x34bbd557 = j17;
            this.f1990x627ab92 = callable;
            this.f1988x55d38512 = t2.p.a(new t2.m() { // from class: androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.HandlerScheduledFuture.1
                @Override // t2.m
                /* renamed from: attachCompleter */
                public java.lang.Object mo3008x586b6594(t2.k kVar) {
                    java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.HandlerScheduledFuture.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ScheduledExecutorServiceC0806x660aff3f.HandlerScheduledFuture.this.f1987x2718406c.getAndSet(null) != null) {
                                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ScheduledExecutorServiceC0806x660aff3f.HandlerScheduledFuture.AnonymousClass1 anonymousClass1 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ScheduledExecutorServiceC0806x660aff3f.HandlerScheduledFuture.AnonymousClass1.this;
                                handler.removeCallbacks(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ScheduledExecutorServiceC0806x660aff3f.HandlerScheduledFuture.this);
                            }
                        }
                    };
                    java.util.concurrent.Executor m5978x5ebfffdc = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc();
                    t2.t tVar = kVar.f496187c;
                    if (tVar != null) {
                        tVar.mo606x162a7075(runnable, m5978x5ebfffdc);
                    }
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ScheduledExecutorServiceC0806x660aff3f.HandlerScheduledFuture.this.f1987x2718406c.set(kVar);
                    return "HandlerScheduledFuture-" + callable.toString();
                }
            });
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z17) {
            return this.f1988x55d38512.cancel(z17);
        }

        @Override // java.util.concurrent.Future
        public V get() {
            return (V) this.f1988x55d38512.get();
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(java.util.concurrent.TimeUnit timeUnit) {
            return timeUnit.convert(this.f1989x34bbd557 - java.lang.System.currentTimeMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f1988x55d38512.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f1988x55d38512.isDone();
        }

        @Override // java.util.concurrent.RunnableScheduledFuture
        public boolean isPeriodic() {
            return false;
        }

        @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            t2.k andSet = this.f1987x2718406c.getAndSet(null);
            if (andSet != null) {
                try {
                    andSet.a(this.f1990x627ab92.call());
                } catch (java.lang.Exception e17) {
                    andSet.b(e17);
                }
            }
        }

        @Override // java.lang.Comparable
        public int compareTo(java.util.concurrent.Delayed delayed) {
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
            return java.lang.Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
        }

        @Override // java.util.concurrent.Future
        public V get(long j17, java.util.concurrent.TimeUnit timeUnit) {
            return (V) this.f1988x55d38512.get(j17, timeUnit);
        }
    }

    public ScheduledExecutorServiceC0806x660aff3f(android.os.Handler handler) {
        this.f1984xc7640a1d = handler;
    }

    /* renamed from: createPostFailedException */
    private java.util.concurrent.RejectedExecutionException m5988xd510c936() {
        return new java.util.concurrent.RejectedExecutionException(this.f1984xc7640a1d + " is shutting down");
    }

    /* renamed from: currentThreadExecutor */
    public static java.util.concurrent.ScheduledExecutorService m5989x7798c2d6() {
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = f1983x90d813c3.get();
        if (scheduledExecutorService != null) {
            return scheduledExecutorService;
        }
        android.os.Looper myLooper = android.os.Looper.myLooper();
        if (myLooper == null) {
            throw new java.lang.IllegalStateException("Current thread has no looper!");
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ScheduledExecutorServiceC0806x660aff3f scheduledExecutorServiceC0806x660aff3f = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ScheduledExecutorServiceC0806x660aff3f(new android.os.Handler(myLooper));
        f1983x90d813c3.set(scheduledExecutorServiceC0806x660aff3f);
        return scheduledExecutorServiceC0806x660aff3f;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j17, java.util.concurrent.TimeUnit timeUnit) {
        throw new java.lang.UnsupportedOperationException("HandlerScheduledExecutorService cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        if (!this.f1984xc7640a1d.post(runnable)) {
            throw m5988xd510c936();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public java.util.concurrent.ScheduledFuture<?> schedule(final java.lang.Runnable runnable, long j17, java.util.concurrent.TimeUnit timeUnit) {
        return schedule(new java.util.concurrent.Callable<java.lang.Void>() { // from class: androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.2
            @Override // java.util.concurrent.Callable
            public java.lang.Void call() {
                runnable.run();
                return null;
            }
        }, j17, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public java.util.concurrent.ScheduledFuture<?> scheduleAtFixedRate(java.lang.Runnable runnable, long j17, long j18, java.util.concurrent.TimeUnit timeUnit) {
        throw new java.lang.UnsupportedOperationException("HandlerScheduledExecutorService does not yet support fixed-rate scheduling.");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public java.util.concurrent.ScheduledFuture<?> scheduleWithFixedDelay(java.lang.Runnable runnable, long j17, long j18, java.util.concurrent.TimeUnit timeUnit) {
        throw new java.lang.UnsupportedOperationException("HandlerScheduledExecutorService does not yet support fixed-delay scheduling.");
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException("HandlerScheduledExecutorService cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ExecutorService
    public java.util.List<java.lang.Runnable> shutdownNow() {
        throw new java.lang.UnsupportedOperationException("HandlerScheduledExecutorService cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> java.util.concurrent.ScheduledFuture<V> schedule(java.util.concurrent.Callable<V> callable, long j17, java.util.concurrent.TimeUnit timeUnit) {
        long uptimeMillis = android.os.SystemClock.uptimeMillis() + java.util.concurrent.TimeUnit.MILLISECONDS.convert(j17, timeUnit);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ScheduledExecutorServiceC0806x660aff3f.HandlerScheduledFuture handlerScheduledFuture = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ScheduledExecutorServiceC0806x660aff3f.HandlerScheduledFuture(this.f1984xc7640a1d, uptimeMillis, callable);
        return this.f1984xc7640a1d.postAtTime(handlerScheduledFuture, uptimeMillis) ? handlerScheduledFuture : p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6012x79cac7a2(m5988xd510c936());
    }
}
