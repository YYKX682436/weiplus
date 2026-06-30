package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public abstract class StateObservable<T> implements androidx.camera.core.impl.Observable<T> {
    private static final int INITIAL_VERSION = 0;
    private final java.util.concurrent.atomic.AtomicReference<java.lang.Object> mState;
    private final java.lang.Object mLock = new java.lang.Object();
    private int mVersion = 0;
    private boolean mUpdating = false;
    private final java.util.Map<androidx.camera.core.impl.Observable.Observer<? super T>, androidx.camera.core.impl.StateObservable.ObserverWrapper<T>> mWrapperMap = new java.util.HashMap();
    private final java.util.concurrent.CopyOnWriteArraySet<androidx.camera.core.impl.StateObservable.ObserverWrapper<T>> mNotifySet = new java.util.concurrent.CopyOnWriteArraySet<>();

    /* loaded from: classes14.dex */
    public static abstract class ErrorWrapper {
        public static androidx.camera.core.impl.StateObservable.ErrorWrapper wrap(java.lang.Throwable th6) {
            return new androidx.camera.core.impl.AutoValue_StateObservable_ErrorWrapper(th6);
        }

        public abstract java.lang.Throwable getError();
    }

    /* loaded from: classes14.dex */
    public static final class ObserverWrapper<T> implements java.lang.Runnable {
        private static final java.lang.Object NOT_SET = new java.lang.Object();
        private static final int NO_VERSION = -1;
        private final java.util.concurrent.Executor mExecutor;
        private final androidx.camera.core.impl.Observable.Observer<? super T> mObserver;
        private final java.util.concurrent.atomic.AtomicReference<java.lang.Object> mStateRef;
        private final java.util.concurrent.atomic.AtomicBoolean mActive = new java.util.concurrent.atomic.AtomicBoolean(true);
        private java.lang.Object mLastState = NOT_SET;
        private int mLatestSignalledVersion = -1;
        private boolean mWrapperUpdating = false;

        public ObserverWrapper(java.util.concurrent.atomic.AtomicReference<java.lang.Object> atomicReference, java.util.concurrent.Executor executor, androidx.camera.core.impl.Observable.Observer<? super T> observer) {
            this.mStateRef = atomicReference;
            this.mExecutor = executor;
            this.mObserver = observer;
        }

        public void close() {
            this.mActive.set(false);
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                if (!this.mActive.get()) {
                    this.mWrapperUpdating = false;
                    return;
                }
                java.lang.Object obj = this.mStateRef.get();
                int i17 = this.mLatestSignalledVersion;
                while (true) {
                    if (!java.util.Objects.equals(this.mLastState, obj)) {
                        this.mLastState = obj;
                        if (obj instanceof androidx.camera.core.impl.StateObservable.ErrorWrapper) {
                            this.mObserver.onError(((androidx.camera.core.impl.StateObservable.ErrorWrapper) obj).getError());
                        } else {
                            this.mObserver.onNewData(obj);
                        }
                    }
                    synchronized (this) {
                        if (i17 == this.mLatestSignalledVersion || !this.mActive.get()) {
                            break;
                        }
                        obj = this.mStateRef.get();
                        i17 = this.mLatestSignalledVersion;
                    }
                }
                this.mWrapperUpdating = false;
            }
        }

        public void update(int i17) {
            synchronized (this) {
                if (!this.mActive.get()) {
                    return;
                }
                if (i17 <= this.mLatestSignalledVersion) {
                    return;
                }
                this.mLatestSignalledVersion = i17;
                if (this.mWrapperUpdating) {
                    return;
                }
                this.mWrapperUpdating = true;
                try {
                    this.mExecutor.execute(this);
                } finally {
                    synchronized (this) {
                    }
                }
            }
        }
    }

    public StateObservable(java.lang.Object obj, boolean z17) {
        if (!z17) {
            this.mState = new java.util.concurrent.atomic.AtomicReference<>(obj);
        } else {
            m3.h.b(obj instanceof java.lang.Throwable, "Initial errors must be Throwable");
            this.mState = new java.util.concurrent.atomic.AtomicReference<>(androidx.camera.core.impl.StateObservable.ErrorWrapper.wrap((java.lang.Throwable) obj));
        }
    }

    private void removeObserverLocked(androidx.camera.core.impl.Observable.Observer<? super T> observer) {
        androidx.camera.core.impl.StateObservable.ObserverWrapper<T> remove = this.mWrapperMap.remove(observer);
        if (remove != null) {
            remove.close();
            this.mNotifySet.remove(remove);
        }
    }

    private void updateStateInternal(java.lang.Object obj) {
        java.util.Iterator<androidx.camera.core.impl.StateObservable.ObserverWrapper<T>> it;
        int i17;
        synchronized (this.mLock) {
            if (java.util.Objects.equals(this.mState.getAndSet(obj), obj)) {
                return;
            }
            int i18 = this.mVersion + 1;
            this.mVersion = i18;
            if (this.mUpdating) {
                return;
            }
            this.mUpdating = true;
            java.util.Iterator<androidx.camera.core.impl.StateObservable.ObserverWrapper<T>> it6 = this.mNotifySet.iterator();
            while (true) {
                if (it6.hasNext()) {
                    it6.next().update(i18);
                } else {
                    synchronized (this.mLock) {
                        if (this.mVersion == i18) {
                            this.mUpdating = false;
                            return;
                        } else {
                            it = this.mNotifySet.iterator();
                            i17 = this.mVersion;
                        }
                    }
                    it6 = it;
                    i18 = i17;
                }
            }
        }
    }

    @Override // androidx.camera.core.impl.Observable
    public void addObserver(java.util.concurrent.Executor executor, androidx.camera.core.impl.Observable.Observer<? super T> observer) {
        androidx.camera.core.impl.StateObservable.ObserverWrapper<T> observerWrapper;
        synchronized (this.mLock) {
            removeObserverLocked(observer);
            observerWrapper = new androidx.camera.core.impl.StateObservable.ObserverWrapper<>(this.mState, executor, observer);
            this.mWrapperMap.put(observer, observerWrapper);
            this.mNotifySet.add(observerWrapper);
        }
        observerWrapper.update(0);
    }

    @Override // androidx.camera.core.impl.Observable
    public wa.a fetchData() {
        java.lang.Object obj = this.mState.get();
        return obj instanceof androidx.camera.core.impl.StateObservable.ErrorWrapper ? androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(((androidx.camera.core.impl.StateObservable.ErrorWrapper) obj).getError()) : androidx.camera.core.impl.utils.futures.Futures.immediateFuture(obj);
    }

    @Override // androidx.camera.core.impl.Observable
    public void removeObserver(androidx.camera.core.impl.Observable.Observer<? super T> observer) {
        synchronized (this.mLock) {
            removeObserverLocked(observer);
        }
    }

    public void removeObservers() {
        synchronized (this.mLock) {
            java.util.Iterator it = new java.util.HashSet(this.mWrapperMap.keySet()).iterator();
            while (it.hasNext()) {
                removeObserverLocked((androidx.camera.core.impl.Observable.Observer) it.next());
            }
        }
    }

    public void updateState(T t17) {
        updateStateInternal(t17);
    }

    public void updateStateAsError(java.lang.Throwable th6) {
        updateStateInternal(androidx.camera.core.impl.StateObservable.ErrorWrapper.wrap(th6));
    }
}
