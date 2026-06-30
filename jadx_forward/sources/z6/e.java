package z6;

/* loaded from: classes13.dex */
public final class e implements java.util.concurrent.ExecutorService {

    /* renamed from: e, reason: collision with root package name */
    public static final long f551842e = java.util.concurrent.TimeUnit.SECONDS.toMillis(10);

    /* renamed from: f, reason: collision with root package name */
    public static volatile int f551843f;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ExecutorService f551844d;

    public e(java.util.concurrent.ExecutorService executorService) {
        this.f551844d = executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j17, java.util.concurrent.TimeUnit timeUnit) {
        return this.f551844d.awaitTermination(j17, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        this.f551844d.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public java.util.List invokeAll(java.util.Collection collection) {
        return this.f551844d.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public java.lang.Object invokeAny(java.util.Collection collection) {
        return this.f551844d.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f551844d.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f551844d.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f551844d.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public java.util.List shutdownNow() {
        return this.f551844d.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public java.util.concurrent.Future submit(java.lang.Runnable runnable) {
        return this.f551844d.submit(runnable);
    }

    /* renamed from: toString */
    public java.lang.String m178436x9616526c() {
        return this.f551844d.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public java.util.List invokeAll(java.util.Collection collection, long j17, java.util.concurrent.TimeUnit timeUnit) {
        return this.f551844d.invokeAll(collection, j17, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public java.lang.Object invokeAny(java.util.Collection collection, long j17, java.util.concurrent.TimeUnit timeUnit) {
        return this.f551844d.invokeAny(collection, j17, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public java.util.concurrent.Future submit(java.lang.Runnable runnable, java.lang.Object obj) {
        return this.f551844d.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public java.util.concurrent.Future submit(java.util.concurrent.Callable callable) {
        return this.f551844d.submit(callable);
    }
}
