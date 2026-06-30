package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.Observable */
/* loaded from: classes14.dex */
public interface InterfaceC0734x770dd163<T> {

    /* renamed from: androidx.camera.core.impl.Observable$Observer */
    /* loaded from: classes14.dex */
    public interface Observer<T> {
        /* renamed from: onError */
        void mo5534xaf8aa769(java.lang.Throwable th6);

        /* renamed from: onNewData */
        void mo5535xbd9a3e8b(T t17);
    }

    /* renamed from: addObserver */
    void mo5391xdab4fe97(java.util.concurrent.Executor executor, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0734x770dd163.Observer<? super T> observer);

    /* renamed from: fetchData */
    wa.a mo5392xb6377d84();

    /* renamed from: removeObserver */
    void mo5393xb5bdeb7a(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0734x770dd163.Observer<? super T> observer);
}
