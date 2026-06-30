package androidx.fragment.app;

/* loaded from: classes13.dex */
public class c0 extends androidx.activity.result.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f11267a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.Fragment f11268b;

    public c0(androidx.fragment.app.Fragment fragment, java.util.concurrent.atomic.AtomicReference atomicReference, h.b bVar) {
        this.f11268b = fragment;
        this.f11267a = atomicReference;
    }

    @Override // androidx.activity.result.c
    public void a(java.lang.Object obj, z2.m mVar) {
        androidx.activity.result.c cVar = (androidx.activity.result.c) this.f11267a.get();
        if (cVar == null) {
            throw new java.lang.IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        cVar.a(obj, mVar);
    }

    @Override // androidx.activity.result.c
    public void b() {
        androidx.activity.result.c cVar = (androidx.activity.result.c) this.f11267a.getAndSet(null);
        if (cVar != null) {
            cVar.b();
        }
    }
}
