package t2;

/* loaded from: classes14.dex */
public final class o implements wa.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f496190d;

    /* renamed from: e, reason: collision with root package name */
    public final t2.j f496191e = new t2.n(this);

    public o(t2.k kVar) {
        this.f496190d = new java.lang.ref.WeakReference(kVar);
    }

    @Override // wa.a
    /* renamed from: addListener */
    public void mo606x162a7075(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        this.f496191e.mo606x162a7075(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z17) {
        t2.k kVar = (t2.k) this.f496190d.get();
        boolean cancel = this.f496191e.cancel(z17);
        if (cancel && kVar != null) {
            kVar.f496185a = null;
            kVar.f496186b = null;
            kVar.f496187c.i(null);
        }
        return cancel;
    }

    @Override // java.util.concurrent.Future
    public java.lang.Object get() {
        return this.f496191e.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f496191e.f496182d instanceof t2.c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f496191e.isDone();
    }

    /* renamed from: toString */
    public java.lang.String m165650x9616526c() {
        return this.f496191e.m165648x9616526c();
    }

    @Override // java.util.concurrent.Future
    public java.lang.Object get(long j17, java.util.concurrent.TimeUnit timeUnit) {
        return this.f496191e.get(j17, timeUnit);
    }
}
