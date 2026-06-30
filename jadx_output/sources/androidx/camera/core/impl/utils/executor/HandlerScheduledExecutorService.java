package androidx.camera.core.impl.utils.executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public final class HandlerScheduledExecutorService extends java.util.concurrent.AbstractExecutorService implements java.util.concurrent.ScheduledExecutorService {
    private static java.lang.ThreadLocal<java.util.concurrent.ScheduledExecutorService> sThreadLocalInstance = new java.lang.ThreadLocal<java.util.concurrent.ScheduledExecutorService>() { // from class: androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.1
        @Override // java.lang.ThreadLocal
        public java.util.concurrent.ScheduledExecutorService initialValue() {
            if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                return androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor();
            }
            if (android.os.Looper.myLooper() != null) {
                return new androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService(new android.os.Handler(android.os.Looper.myLooper()));
            }
            return null;
        }
    };
    private final android.os.Handler mHandler;

    /* loaded from: classes14.dex */
    public static class HandlerScheduledFuture<V> implements java.util.concurrent.RunnableScheduledFuture<V> {
        final java.util.concurrent.atomic.AtomicReference<t2.k> mCompleter = new java.util.concurrent.atomic.AtomicReference<>(null);
        private final wa.a mDelegate;
        private final long mRunAtMillis;
        private final java.util.concurrent.Callable<V> mTask;

        public HandlerScheduledFuture(final android.os.Handler handler, long j17, final java.util.concurrent.Callable<V> callable) {
            this.mRunAtMillis = j17;
            this.mTask = callable;
            this.mDelegate = t2.p.a(new t2.m() { // from class: androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.HandlerScheduledFuture.1
                @Override // t2.m
                public java.lang.Object attachCompleter(t2.k kVar) {
                    java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.HandlerScheduledFuture.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.HandlerScheduledFuture.this.mCompleter.getAndSet(null) != null) {
                                androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.HandlerScheduledFuture.AnonymousClass1 anonymousClass1 = androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.HandlerScheduledFuture.AnonymousClass1.this;
                                handler.removeCallbacks(androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.HandlerScheduledFuture.this);
                            }
                        }
                    };
                    java.util.concurrent.Executor directExecutor = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor();
                    t2.t tVar = kVar.f414654c;
                    if (tVar != null) {
                        tVar.addListener(runnable, directExecutor);
                    }
                    androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.HandlerScheduledFuture.this.mCompleter.set(kVar);
                    return "HandlerScheduledFuture-" + callable.toString();
                }
            });
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z17) {
            return this.mDelegate.cancel(z17);
        }

        @Override // java.util.concurrent.Future
        public V get() {
            return (V) this.mDelegate.get();
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(java.util.concurrent.TimeUnit timeUnit) {
            return timeUnit.convert(this.mRunAtMillis - java.lang.System.currentTimeMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.mDelegate.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.mDelegate.isDone();
        }

        @Override // java.util.concurrent.RunnableScheduledFuture
        public boolean isPeriodic() {
            return false;
        }

        @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            t2.k andSet = this.mCompleter.getAndSet(null);
            if (andSet != null) {
                try {
                    andSet.a(this.mTask.call());
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
            return (V) this.mDelegate.get(j17, timeUnit);
        }
    }

    public HandlerScheduledExecutorService(android.os.Handler handler) {
        this.mHandler = handler;
    }

    private java.util.concurrent.RejectedExecutionException createPostFailedException() {
        return new java.util.concurrent.RejectedExecutionException(this.mHandler + " is shutting down");
    }

    public static java.util.concurrent.ScheduledExecutorService currentThreadExecutor() {
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = sThreadLocalInstance.get();
        if (scheduledExecutorService != null) {
            return scheduledExecutorService;
        }
        android.os.Looper myLooper = android.os.Looper.myLooper();
        if (myLooper == null) {
            throw new java.lang.IllegalStateException("Current thread has no looper!");
        }
        androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService handlerScheduledExecutorService = new androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService(new android.os.Handler(myLooper));
        sThreadLocalInstance.set(handlerScheduledExecutorService);
        return handlerScheduledExecutorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j17, java.util.concurrent.TimeUnit timeUnit) {
        throw new java.lang.UnsupportedOperationException("HandlerScheduledExecutorService cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        if (!this.mHandler.post(runnable)) {
            throw createPostFailedException();
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
        androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.HandlerScheduledFuture handlerScheduledFuture = new androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.HandlerScheduledFuture(this.mHandler, uptimeMillis, callable);
        return this.mHandler.postAtTime(handlerScheduledFuture, uptimeMillis) ? handlerScheduledFuture : androidx.camera.core.impl.utils.futures.Futures.immediateFailedScheduledFuture(createPostFailedException());
    }
}
