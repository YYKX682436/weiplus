package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10;

/* renamed from: androidx.camera.core.impl.utils.futures.FutureChain */
/* loaded from: classes14.dex */
public class C0814x43c6229e<V> implements wa.a {

    /* renamed from: mCompleter */
    t2.k f2025x2718406c;

    /* renamed from: mDelegate */
    private final wa.a f2026x55d38512;

    public C0814x43c6229e(wa.a aVar) {
        aVar.getClass();
        this.f2026x55d38512 = aVar;
    }

    /* renamed from: from */
    public static <V> p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0814x43c6229e<V> m6001x3017aa(wa.a aVar) {
        return aVar instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0814x43c6229e ? (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0814x43c6229e) aVar : new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0814x43c6229e<>(aVar);
    }

    /* renamed from: addCallback */
    public final void m6002xbba9cc06(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48<? super V> interfaceC0813x8ed66b48, java.util.concurrent.Executor executor) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6007xbba9cc06(this, interfaceC0813x8ed66b48, executor);
    }

    @Override // wa.a
    /* renamed from: addListener */
    public void mo606x162a7075(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        this.f2026x55d38512.mo606x162a7075(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z17) {
        return this.f2026x55d38512.cancel(z17);
    }

    @Override // java.util.concurrent.Future
    public V get() {
        return (V) this.f2026x55d38512.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f2026x55d38512.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f2026x55d38512.isDone();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean set(V v17) {
        t2.k kVar = this.f2025x2718406c;
        if (kVar != null) {
            return kVar.a(v17);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: setException */
    public boolean m6003xb411020d(java.lang.Throwable th6) {
        t2.k kVar = this.f2025x2718406c;
        if (kVar != null) {
            return kVar.b(th6);
        }
        return false;
    }

    /* renamed from: transform */
    public final <T> p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0814x43c6229e<T> m6004x3ebe6b6c(r.a aVar, java.util.concurrent.Executor executor) {
        return (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0814x43c6229e) p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6030x3ebe6b6c(this, aVar, executor);
    }

    /* renamed from: transformAsync */
    public final <T> p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0814x43c6229e<T> m6005x9aa1ea70(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0811x859ce54<? super V, T> interfaceC0811x859ce54, java.util.concurrent.Executor executor) {
        return (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0814x43c6229e) p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6031x9aa1ea70(this, interfaceC0811x859ce54, executor);
    }

    @Override // java.util.concurrent.Future
    public V get(long j17, java.util.concurrent.TimeUnit timeUnit) {
        return (V) this.f2026x55d38512.get(j17, timeUnit);
    }

    public C0814x43c6229e() {
        this.f2026x55d38512 = t2.p.a(new t2.m() { // from class: androidx.camera.core.impl.utils.futures.FutureChain.1
            @Override // t2.m
            /* renamed from: attachCompleter */
            public java.lang.Object mo3008x586b6594(t2.k kVar) {
                m3.h.e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0814x43c6229e.this.f2025x2718406c == null, "The result can only set once!");
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0814x43c6229e.this.f2025x2718406c = kVar;
                return "FutureChain[" + p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0814x43c6229e.this + "]";
            }
        });
    }
}
