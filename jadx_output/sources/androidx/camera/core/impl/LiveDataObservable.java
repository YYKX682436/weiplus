package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public final class LiveDataObservable<T> implements androidx.camera.core.impl.Observable<T> {
    final androidx.lifecycle.j0 mLiveData = new androidx.lifecycle.j0();
    private final java.util.Map<androidx.camera.core.impl.Observable.Observer<? super T>, androidx.camera.core.impl.LiveDataObservable.LiveDataObserverAdapter<T>> mObservers = new java.util.HashMap();

    /* loaded from: classes14.dex */
    public static final class LiveDataObserverAdapter<T> implements androidx.lifecycle.k0 {
        final java.util.concurrent.atomic.AtomicBoolean mActive = new java.util.concurrent.atomic.AtomicBoolean(true);
        final java.util.concurrent.Executor mExecutor;
        final androidx.camera.core.impl.Observable.Observer<? super T> mObserver;

        public LiveDataObserverAdapter(java.util.concurrent.Executor executor, androidx.camera.core.impl.Observable.Observer<? super T> observer) {
            this.mExecutor = executor;
            this.mObserver = observer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$onChanged$0(androidx.camera.core.impl.LiveDataObservable.Result result) {
            if (this.mActive.get()) {
                if (result.completedSuccessfully()) {
                    this.mObserver.onNewData((java.lang.Object) result.getValue());
                } else {
                    result.getError().getClass();
                    this.mObserver.onError(result.getError());
                }
            }
        }

        public void disable() {
            this.mActive.set(false);
        }

        @Override // androidx.lifecycle.k0
        public void onChanged(final androidx.camera.core.impl.LiveDataObservable.Result<T> result) {
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.impl.LiveDataObservable$LiveDataObserverAdapter$$a
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.impl.LiveDataObservable.LiveDataObserverAdapter.this.lambda$onChanged$0(result);
                }
            });
        }
    }

    /* loaded from: classes14.dex */
    public static final class Result<T> {
        private final java.lang.Throwable mError;
        private final T mValue;

        private Result(T t17, java.lang.Throwable th6) {
            this.mValue = t17;
            this.mError = th6;
        }

        public static <T> androidx.camera.core.impl.LiveDataObservable.Result<T> fromError(java.lang.Throwable th6) {
            th6.getClass();
            return new androidx.camera.core.impl.LiveDataObservable.Result<>(null, th6);
        }

        public static <T> androidx.camera.core.impl.LiveDataObservable.Result<T> fromValue(T t17) {
            return new androidx.camera.core.impl.LiveDataObservable.Result<>(t17, null);
        }

        public boolean completedSuccessfully() {
            return this.mError == null;
        }

        public java.lang.Throwable getError() {
            return this.mError;
        }

        public T getValue() {
            if (completedSuccessfully()) {
                return this.mValue;
            }
            throw new java.lang.IllegalStateException("Result contains an error. Does not contain a value.");
        }

        public java.lang.String toString() {
            java.lang.String str;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[Result: <");
            if (completedSuccessfully()) {
                str = "Value: " + this.mValue;
            } else {
                str = "Error: " + this.mError;
            }
            sb6.append(str);
            sb6.append(">]");
            return sb6.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addObserver$2(androidx.camera.core.impl.LiveDataObservable.LiveDataObserverAdapter liveDataObserverAdapter, androidx.camera.core.impl.LiveDataObservable.LiveDataObserverAdapter liveDataObserverAdapter2) {
        if (liveDataObserverAdapter != null) {
            this.mLiveData.removeObserver(liveDataObserverAdapter);
        }
        this.mLiveData.observeForever(liveDataObserverAdapter2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$fetchData$0(t2.k kVar) {
        androidx.camera.core.impl.LiveDataObservable.Result result = (androidx.camera.core.impl.LiveDataObservable.Result) this.mLiveData.getValue();
        if (result == null) {
            kVar.b(new java.lang.IllegalStateException("Observable has not yet been initialized with a value."));
        } else if (result.completedSuccessfully()) {
            kVar.a(result.getValue());
        } else {
            result.getError().getClass();
            kVar.b(result.getError());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Object lambda$fetchData$1(final t2.k kVar) {
        androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor().execute(new java.lang.Runnable() { // from class: androidx.camera.core.impl.LiveDataObservable$$b
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.impl.LiveDataObservable.this.lambda$fetchData$0(kVar);
            }
        });
        return this + " [fetch@" + android.os.SystemClock.uptimeMillis() + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeObserver$3(androidx.camera.core.impl.LiveDataObservable.LiveDataObserverAdapter liveDataObserverAdapter) {
        this.mLiveData.removeObserver(liveDataObserverAdapter);
    }

    @Override // androidx.camera.core.impl.Observable
    public void addObserver(java.util.concurrent.Executor executor, androidx.camera.core.impl.Observable.Observer<? super T> observer) {
        synchronized (this.mObservers) {
            final androidx.camera.core.impl.LiveDataObservable.LiveDataObserverAdapter<T> liveDataObserverAdapter = this.mObservers.get(observer);
            if (liveDataObserverAdapter != null) {
                liveDataObserverAdapter.disable();
            }
            final androidx.camera.core.impl.LiveDataObservable.LiveDataObserverAdapter<T> liveDataObserverAdapter2 = new androidx.camera.core.impl.LiveDataObservable.LiveDataObserverAdapter<>(executor, observer);
            this.mObservers.put(observer, liveDataObserverAdapter2);
            androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor().execute(new java.lang.Runnable() { // from class: androidx.camera.core.impl.LiveDataObservable$$d
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.impl.LiveDataObservable.this.lambda$addObserver$2(liveDataObserverAdapter, liveDataObserverAdapter2);
                }
            });
        }
    }

    @Override // androidx.camera.core.impl.Observable
    public wa.a fetchData() {
        return t2.p.a(new t2.m() { // from class: androidx.camera.core.impl.LiveDataObservable$$a
            @Override // t2.m
            public final java.lang.Object attachCompleter(t2.k kVar) {
                java.lang.Object lambda$fetchData$1;
                lambda$fetchData$1 = androidx.camera.core.impl.LiveDataObservable.this.lambda$fetchData$1(kVar);
                return lambda$fetchData$1;
            }
        });
    }

    public androidx.lifecycle.g0 getLiveData() {
        return this.mLiveData;
    }

    public void postError(java.lang.Throwable th6) {
        this.mLiveData.postValue(androidx.camera.core.impl.LiveDataObservable.Result.fromError(th6));
    }

    public void postValue(T t17) {
        this.mLiveData.postValue(androidx.camera.core.impl.LiveDataObservable.Result.fromValue(t17));
    }

    @Override // androidx.camera.core.impl.Observable
    public void removeObserver(androidx.camera.core.impl.Observable.Observer<? super T> observer) {
        synchronized (this.mObservers) {
            final androidx.camera.core.impl.LiveDataObservable.LiveDataObserverAdapter<T> remove = this.mObservers.remove(observer);
            if (remove != null) {
                remove.disable();
                androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor().execute(new java.lang.Runnable() { // from class: androidx.camera.core.impl.LiveDataObservable$$c
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.core.impl.LiveDataObservable.this.lambda$removeObserver$3(remove);
                    }
                });
            }
        }
    }
}
