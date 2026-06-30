package androidx.camera.core.impl.utils.futures;

/* loaded from: classes14.dex */
abstract class ImmediateFuture<V> implements wa.a {
    private static final java.lang.String TAG = "ImmediateFuture";

    /* loaded from: classes14.dex */
    public static class ImmediateFailedFuture<V> extends androidx.camera.core.impl.utils.futures.ImmediateFuture<V> {
        private final java.lang.Throwable mCause;

        public ImmediateFailedFuture(java.lang.Throwable th6) {
            this.mCause = th6;
        }

        @Override // androidx.camera.core.impl.utils.futures.ImmediateFuture, java.util.concurrent.Future
        public V get() {
            throw new java.util.concurrent.ExecutionException(this.mCause);
        }

        public java.lang.String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.mCause + "]]";
        }
    }

    /* loaded from: classes14.dex */
    public static final class ImmediateFailedScheduledFuture<V> extends androidx.camera.core.impl.utils.futures.ImmediateFuture.ImmediateFailedFuture<V> implements java.util.concurrent.ScheduledFuture<V> {
        public ImmediateFailedScheduledFuture(java.lang.Throwable th6) {
            super(th6);
        }

        @Override // java.lang.Comparable
        public int compareTo(java.util.concurrent.Delayed delayed) {
            return -1;
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(java.util.concurrent.TimeUnit timeUnit) {
            return 0L;
        }
    }

    /* loaded from: classes14.dex */
    public static final class ImmediateSuccessfulFuture<V> extends androidx.camera.core.impl.utils.futures.ImmediateFuture<V> {
        static final androidx.camera.core.impl.utils.futures.ImmediateFuture<java.lang.Object> NULL_FUTURE = new androidx.camera.core.impl.utils.futures.ImmediateFuture.ImmediateSuccessfulFuture(null);
        private final V mValue;

        public ImmediateSuccessfulFuture(V v17) {
            this.mValue = v17;
        }

        @Override // androidx.camera.core.impl.utils.futures.ImmediateFuture, java.util.concurrent.Future
        public V get() {
            return this.mValue;
        }

        public java.lang.String toString() {
            return super.toString() + "[status=SUCCESS, result=[" + this.mValue + "]]";
        }
    }

    public static <V> wa.a nullFuture() {
        return androidx.camera.core.impl.utils.futures.ImmediateFuture.ImmediateSuccessfulFuture.NULL_FUTURE;
    }

    @Override // wa.a
    public void addListener(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        runnable.getClass();
        executor.getClass();
        try {
            executor.execute(runnable);
        } catch (java.lang.RuntimeException e17) {
            androidx.camera.core.Logger.e(TAG, "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e17);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z17) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public abstract V get();

    @Override // java.util.concurrent.Future
    public V get(long j17, java.util.concurrent.TimeUnit timeUnit) {
        timeUnit.getClass();
        return get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }
}
