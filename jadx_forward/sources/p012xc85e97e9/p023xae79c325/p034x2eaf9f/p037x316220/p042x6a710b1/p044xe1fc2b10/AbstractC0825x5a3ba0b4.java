package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10;

/* renamed from: androidx.camera.core.impl.utils.futures.ImmediateFuture */
/* loaded from: classes14.dex */
abstract class AbstractC0825x5a3ba0b4<V> implements wa.a {
    private static final java.lang.String TAG = "ImmediateFuture";

    /* renamed from: androidx.camera.core.impl.utils.futures.ImmediateFuture$ImmediateFailedFuture */
    /* loaded from: classes14.dex */
    public static class ImmediateFailedFuture<V> extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.AbstractC0825x5a3ba0b4<V> {

        /* renamed from: mCause */
        private final java.lang.Throwable f2035xbdde3ffc;

        public ImmediateFailedFuture(java.lang.Throwable th6) {
            this.f2035xbdde3ffc = th6;
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.AbstractC0825x5a3ba0b4, java.util.concurrent.Future
        public V get() {
            throw new java.util.concurrent.ExecutionException(this.f2035xbdde3ffc);
        }

        /* renamed from: toString */
        public java.lang.String m6035x9616526c() {
            return super.toString() + "[status=FAILURE, cause=[" + this.f2035xbdde3ffc + "]]";
        }
    }

    /* renamed from: androidx.camera.core.impl.utils.futures.ImmediateFuture$ImmediateFailedScheduledFuture */
    /* loaded from: classes14.dex */
    public static final class ImmediateFailedScheduledFuture<V> extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.AbstractC0825x5a3ba0b4.ImmediateFailedFuture<V> implements java.util.concurrent.ScheduledFuture<V> {
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

    /* renamed from: androidx.camera.core.impl.utils.futures.ImmediateFuture$ImmediateSuccessfulFuture */
    /* loaded from: classes14.dex */
    public static final class ImmediateSuccessfulFuture<V> extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.AbstractC0825x5a3ba0b4<V> {

        /* renamed from: NULL_FUTURE */
        static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.AbstractC0825x5a3ba0b4<java.lang.Object> f2036x72f3cb7b = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.AbstractC0825x5a3ba0b4.ImmediateSuccessfulFuture(null);

        /* renamed from: mValue */
        private final V f2037xbee9dd04;

        public ImmediateSuccessfulFuture(V v17) {
            this.f2037xbee9dd04 = v17;
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.AbstractC0825x5a3ba0b4, java.util.concurrent.Future
        public V get() {
            return this.f2037xbee9dd04;
        }

        /* renamed from: toString */
        public java.lang.String m6037x9616526c() {
            return super.toString() + "[status=SUCCESS, result=[" + this.f2037xbee9dd04 + "]]";
        }
    }

    /* renamed from: nullFuture */
    public static <V> wa.a m6034x5d0fbe2a() {
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.AbstractC0825x5a3ba0b4.ImmediateSuccessfulFuture.f2036x72f3cb7b;
    }

    @Override // wa.a
    /* renamed from: addListener */
    public void mo606x162a7075(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        runnable.getClass();
        executor.getClass();
        try {
            executor.execute(runnable);
        } catch (java.lang.RuntimeException e17) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e17);
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
