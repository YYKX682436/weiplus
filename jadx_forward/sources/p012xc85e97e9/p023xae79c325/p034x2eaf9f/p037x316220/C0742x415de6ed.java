package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.QuirkSettingsHolder */
/* loaded from: classes14.dex */
public final class C0742x415de6ed {

    /* renamed from: DEFAULT */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0741x281ed9e1 f1721x86df6221 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0741x281ed9e1.m5543xfffdbe0d();

    /* renamed from: sInstance */
    private static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0742x415de6ed f1722xbfaed628 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0742x415de6ed();

    /* renamed from: mObservable */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0732xed23d0ce<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0741x281ed9e1> f1723xdc6ded90 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0732xed23d0ce.m5527xe4407393(f1721x86df6221);

    /* renamed from: androidx.camera.core.impl.QuirkSettingsHolder$ObserverToConsumerAdapter */
    /* loaded from: classes14.dex */
    public static class ObserverToConsumerAdapter<T> implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0734x770dd163.Observer<T> {
        private static final java.lang.String TAG = "ObserverToConsumerAdapter";

        /* renamed from: mDelegate */
        private final m3.a f1724x55d38512;

        public ObserverToConsumerAdapter(m3.a aVar) {
            this.f1724x55d38512 = aVar;
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0734x770dd163.Observer
        /* renamed from: onError */
        public void mo5534xaf8aa769(java.lang.Throwable th6) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Unexpected error in Observable", th6);
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0734x770dd163.Observer
        /* renamed from: onNewData */
        public void mo5535xbd9a3e8b(T t17) {
            this.f1724x55d38512.mo3938xab27b508(t17);
        }
    }

    /* renamed from: instance */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0742x415de6ed m5558x21169495() {
        return f1722xbfaed628;
    }

    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0741x281ed9e1 get() {
        try {
            return (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0741x281ed9e1) this.f1723xdc6ded90.mo5392xb6377d84().get();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e17) {
            throw new java.lang.AssertionError("Unexpected error in QuirkSettings StateObservable", e17);
        }
    }

    /* renamed from: observe */
    public void m5559x9d92d11c(java.util.concurrent.Executor executor, m3.a aVar) {
        this.f1723xdc6ded90.mo5391xdab4fe97(executor, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0742x415de6ed.ObserverToConsumerAdapter(aVar));
    }

    /* renamed from: reset */
    public void m5560x6761d4f() {
        this.f1723xdc6ded90.m5665x1ff8439();
        this.f1723xdc6ded90.m5529x53b6854f(f1721x86df6221);
    }

    public void set(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0741x281ed9e1 c0741x281ed9e1) {
        this.f1723xdc6ded90.m5529x53b6854f(c0741x281ed9e1);
    }
}
