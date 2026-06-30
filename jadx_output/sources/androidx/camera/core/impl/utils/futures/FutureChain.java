package androidx.camera.core.impl.utils.futures;

/* loaded from: classes14.dex */
public class FutureChain<V> implements wa.a {
    t2.k mCompleter;
    private final wa.a mDelegate;

    public FutureChain(wa.a aVar) {
        aVar.getClass();
        this.mDelegate = aVar;
    }

    public static <V> androidx.camera.core.impl.utils.futures.FutureChain<V> from(wa.a aVar) {
        return aVar instanceof androidx.camera.core.impl.utils.futures.FutureChain ? (androidx.camera.core.impl.utils.futures.FutureChain) aVar : new androidx.camera.core.impl.utils.futures.FutureChain<>(aVar);
    }

    public final void addCallback(androidx.camera.core.impl.utils.futures.FutureCallback<? super V> futureCallback, java.util.concurrent.Executor executor) {
        androidx.camera.core.impl.utils.futures.Futures.addCallback(this, futureCallback, executor);
    }

    @Override // wa.a
    public void addListener(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        this.mDelegate.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z17) {
        return this.mDelegate.cancel(z17);
    }

    @Override // java.util.concurrent.Future
    public V get() {
        return (V) this.mDelegate.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.mDelegate.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.mDelegate.isDone();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean set(V v17) {
        t2.k kVar = this.mCompleter;
        if (kVar != null) {
            return kVar.a(v17);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean setException(java.lang.Throwable th6) {
        t2.k kVar = this.mCompleter;
        if (kVar != null) {
            return kVar.b(th6);
        }
        return false;
    }

    public final <T> androidx.camera.core.impl.utils.futures.FutureChain<T> transform(r.a aVar, java.util.concurrent.Executor executor) {
        return (androidx.camera.core.impl.utils.futures.FutureChain) androidx.camera.core.impl.utils.futures.Futures.transform(this, aVar, executor);
    }

    public final <T> androidx.camera.core.impl.utils.futures.FutureChain<T> transformAsync(androidx.camera.core.impl.utils.futures.AsyncFunction<? super V, T> asyncFunction, java.util.concurrent.Executor executor) {
        return (androidx.camera.core.impl.utils.futures.FutureChain) androidx.camera.core.impl.utils.futures.Futures.transformAsync(this, asyncFunction, executor);
    }

    @Override // java.util.concurrent.Future
    public V get(long j17, java.util.concurrent.TimeUnit timeUnit) {
        return (V) this.mDelegate.get(j17, timeUnit);
    }

    public FutureChain() {
        this.mDelegate = t2.p.a(new t2.m() { // from class: androidx.camera.core.impl.utils.futures.FutureChain.1
            @Override // t2.m
            public java.lang.Object attachCompleter(t2.k kVar) {
                m3.h.e(androidx.camera.core.impl.utils.futures.FutureChain.this.mCompleter == null, "The result can only set once!");
                androidx.camera.core.impl.utils.futures.FutureChain.this.mCompleter = kVar;
                return "FutureChain[" + androidx.camera.core.impl.utils.futures.FutureChain.this + "]";
            }
        });
    }
}
