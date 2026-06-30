package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public final class ConstantObservable<T> implements androidx.camera.core.impl.Observable<T> {
    private static final androidx.camera.core.impl.ConstantObservable<java.lang.Object> NULL_OBSERVABLE = new androidx.camera.core.impl.ConstantObservable<>(null);
    private static final java.lang.String TAG = "ConstantObservable";
    private final wa.a mValueFuture;

    private ConstantObservable(T t17) {
        this.mValueFuture = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(t17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$addObserver$0(androidx.camera.core.impl.Observable.Observer observer) {
        try {
            observer.onNewData(this.mValueFuture.get());
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e17) {
            observer.onError(e17);
        }
    }

    public static <U> androidx.camera.core.impl.Observable<U> withValue(U u17) {
        return u17 == null ? NULL_OBSERVABLE : new androidx.camera.core.impl.ConstantObservable(u17);
    }

    @Override // androidx.camera.core.impl.Observable
    public void addObserver(java.util.concurrent.Executor executor, final androidx.camera.core.impl.Observable.Observer<? super T> observer) {
        this.mValueFuture.addListener(new java.lang.Runnable() { // from class: androidx.camera.core.impl.ConstantObservable$$a
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.impl.ConstantObservable.this.lambda$addObserver$0(observer);
            }
        }, executor);
    }

    @Override // androidx.camera.core.impl.Observable
    public wa.a fetchData() {
        return this.mValueFuture;
    }

    @Override // androidx.camera.core.impl.Observable
    public void removeObserver(androidx.camera.core.impl.Observable.Observer<? super T> observer) {
    }
}
