package be1;

/* loaded from: classes7.dex */
public final class a0 extends be1.z implements com.tencent.mm.plugin.appbrand.networking.e0 {

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f19453o = new java.util.concurrent.atomic.AtomicReference(null);

    /* renamed from: p, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f19454p = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: q, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f19455q = new java.util.concurrent.atomic.AtomicBoolean(false);

    @Override // be1.z
    public be1.y F(com.tencent.mm.plugin.appbrand.jsapi.l component) {
        com.tencent.mm.plugin.appbrand.networking.d0 d0Var;
        kotlin.jvm.internal.o.g(component, "component");
        boolean andSet = this.f19454p.getAndSet(true);
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f19455q;
        if (!andSet && (d0Var = (com.tencent.mm.plugin.appbrand.networking.d0) component.q(com.tencent.mm.plugin.appbrand.networking.d0.class)) != null) {
            ((com.tencent.mm.plugin.appbrand.networking.h0) d0Var).f86091e.add(this);
            atomicBoolean.set(true);
        }
        if (!atomicBoolean.get()) {
            return be1.z.E(component.getContext());
        }
        java.util.concurrent.atomic.AtomicReference atomicReference = this.f19453o;
        be1.y yVar = (be1.y) atomicReference.get();
        if (yVar != null) {
            return yVar;
        }
        be1.y E = be1.z.E(component.getContext());
        atomicReference.set(E);
        return E;
    }

    @Override // com.tencent.mm.plugin.appbrand.networking.e0
    public void f() {
        this.f19453o.set(null);
    }
}
