package a5;

/* loaded from: classes13.dex */
public final class u implements wa.a {

    /* renamed from: d, reason: collision with root package name */
    public final l5.m f1436d;

    public u(kotlinx.coroutines.r2 job, l5.m underlying, int i17, kotlin.jvm.internal.i iVar) {
        underlying = (i17 & 2) != 0 ? new l5.m() : underlying;
        kotlin.jvm.internal.o.g(job, "job");
        kotlin.jvm.internal.o.g(underlying, "underlying");
        this.f1436d = underlying;
        job.p(new a5.t(this));
    }

    @Override // wa.a
    public void addListener(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        this.f1436d.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z17) {
        return this.f1436d.cancel(z17);
    }

    @Override // java.util.concurrent.Future
    public java.lang.Object get() {
        return this.f1436d.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f1436d.f316534d instanceof l5.c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f1436d.isDone();
    }

    @Override // java.util.concurrent.Future
    public java.lang.Object get(long j17, java.util.concurrent.TimeUnit timeUnit) {
        return this.f1436d.get(j17, timeUnit);
    }
}
