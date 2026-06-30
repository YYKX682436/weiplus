package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.ConstantObservable */
/* loaded from: classes14.dex */
public final class C0694xab3c3427<T> implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0734x770dd163<T> {

    /* renamed from: NULL_OBSERVABLE */
    private static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0694xab3c3427<java.lang.Object> f1628xd5258efb = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0694xab3c3427<>(null);
    private static final java.lang.String TAG = "ConstantObservable";

    /* renamed from: mValueFuture */
    private final wa.a f1629x3f0383e7;

    private C0694xab3c3427(T t17) {
        this.f1629x3f0383e7 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6013x95a8e8d4(t17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: lambda$addObserver$0 */
    public /* synthetic */ void m5389x26b7bf46(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0734x770dd163.Observer observer) {
        try {
            observer.mo5535xbd9a3e8b(this.f1629x3f0383e7.get());
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e17) {
            observer.mo5534xaf8aa769(e17);
        }
    }

    /* renamed from: withValue */
    public static <U> p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0734x770dd163<U> m5390x35df7c4b(U u17) {
        return u17 == null ? f1628xd5258efb : new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0694xab3c3427(u17);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0734x770dd163
    /* renamed from: addObserver */
    public void mo5391xdab4fe97(java.util.concurrent.Executor executor, final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0734x770dd163.Observer<? super T> observer) {
        this.f1629x3f0383e7.mo606x162a7075(new java.lang.Runnable() { // from class: androidx.camera.core.impl.ConstantObservable$$a
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0694xab3c3427.this.m5389x26b7bf46(observer);
            }
        }, executor);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0734x770dd163
    /* renamed from: fetchData */
    public wa.a mo5392xb6377d84() {
        return this.f1629x3f0383e7;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0734x770dd163
    /* renamed from: removeObserver */
    public void mo5393xb5bdeb7a(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0734x770dd163.Observer<? super T> observer) {
    }
}
