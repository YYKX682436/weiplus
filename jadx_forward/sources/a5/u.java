package a5;

/* loaded from: classes13.dex */
public final class u implements wa.a {

    /* renamed from: d, reason: collision with root package name */
    public final l5.m f82969d;

    public u(p3325xe03a0797.p3326xc267989b.r2 job, l5.m underlying, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        underlying = (i17 & 2) != 0 ? new l5.m() : underlying;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(job, "job");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(underlying, "underlying");
        this.f82969d = underlying;
        job.p(new a5.t(this));
    }

    @Override // wa.a
    /* renamed from: addListener */
    public void mo606x162a7075(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        this.f82969d.mo606x162a7075(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z17) {
        return this.f82969d.cancel(z17);
    }

    @Override // java.util.concurrent.Future
    public java.lang.Object get() {
        return this.f82969d.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f82969d.f398067d instanceof l5.c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f82969d.isDone();
    }

    @Override // java.util.concurrent.Future
    public java.lang.Object get(long j17, java.util.concurrent.TimeUnit timeUnit) {
        return this.f82969d.get(j17, timeUnit);
    }
}
