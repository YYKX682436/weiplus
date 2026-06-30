package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public final class QuirkSettingsHolder {
    public static final androidx.camera.core.impl.QuirkSettings DEFAULT = androidx.camera.core.impl.QuirkSettings.withDefaultBehavior();
    private static final androidx.camera.core.impl.QuirkSettingsHolder sInstance = new androidx.camera.core.impl.QuirkSettingsHolder();
    private final androidx.camera.core.impl.MutableStateObservable<androidx.camera.core.impl.QuirkSettings> mObservable = androidx.camera.core.impl.MutableStateObservable.withInitialState(DEFAULT);

    /* loaded from: classes14.dex */
    public static class ObserverToConsumerAdapter<T> implements androidx.camera.core.impl.Observable.Observer<T> {
        private static final java.lang.String TAG = "ObserverToConsumerAdapter";
        private final m3.a mDelegate;

        public ObserverToConsumerAdapter(m3.a aVar) {
            this.mDelegate = aVar;
        }

        @Override // androidx.camera.core.impl.Observable.Observer
        public void onError(java.lang.Throwable th6) {
            androidx.camera.core.Logger.e(TAG, "Unexpected error in Observable", th6);
        }

        @Override // androidx.camera.core.impl.Observable.Observer
        public void onNewData(T t17) {
            this.mDelegate.accept(t17);
        }
    }

    public static androidx.camera.core.impl.QuirkSettingsHolder instance() {
        return sInstance;
    }

    public androidx.camera.core.impl.QuirkSettings get() {
        try {
            return (androidx.camera.core.impl.QuirkSettings) this.mObservable.fetchData().get();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e17) {
            throw new java.lang.AssertionError("Unexpected error in QuirkSettings StateObservable", e17);
        }
    }

    public void observe(java.util.concurrent.Executor executor, m3.a aVar) {
        this.mObservable.addObserver(executor, new androidx.camera.core.impl.QuirkSettingsHolder.ObserverToConsumerAdapter(aVar));
    }

    public void reset() {
        this.mObservable.removeObservers();
        this.mObservable.setState(DEFAULT);
    }

    public void set(androidx.camera.core.impl.QuirkSettings quirkSettings) {
        this.mObservable.setState(quirkSettings);
    }
}
