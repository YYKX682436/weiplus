package be1;

/* loaded from: classes7.dex */
public final class a0 extends be1.z implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.e0 {

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f100986o = new java.util.concurrent.atomic.AtomicReference(null);

    /* renamed from: p, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f100987p = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: q, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f100988q = new java.util.concurrent.atomic.AtomicBoolean(false);

    @Override // be1.z
    public be1.y F(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l component) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.d0 d0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        boolean andSet = this.f100987p.getAndSet(true);
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f100988q;
        if (!andSet && (d0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.d0) component.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.d0.class)) != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.h0) d0Var).f167624e.add(this);
            atomicBoolean.set(true);
        }
        if (!atomicBoolean.get()) {
            return be1.z.E(component.mo50352x76847179());
        }
        java.util.concurrent.atomic.AtomicReference atomicReference = this.f100986o;
        be1.y yVar = (be1.y) atomicReference.get();
        if (yVar != null) {
            return yVar;
        }
        be1.y E = be1.z.E(component.mo50352x76847179());
        atomicReference.set(E);
        return E;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.e0
    public void f() {
        this.f100986o.set(null);
    }
}
