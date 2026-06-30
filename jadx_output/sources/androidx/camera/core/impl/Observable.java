package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public interface Observable<T> {

    /* loaded from: classes14.dex */
    public interface Observer<T> {
        void onError(java.lang.Throwable th6);

        void onNewData(T t17);
    }

    void addObserver(java.util.concurrent.Executor executor, androidx.camera.core.impl.Observable.Observer<? super T> observer);

    wa.a fetchData();

    void removeObserver(androidx.camera.core.impl.Observable.Observer<? super T> observer);
}
