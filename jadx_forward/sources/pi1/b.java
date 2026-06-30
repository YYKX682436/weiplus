package pi1;

/* loaded from: classes7.dex */
public abstract class b implements pi1.e {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f436289a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f436290b;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var) {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        this.f436290b = atomicReference;
        atomicReference.set(pi1.d.SHOWN);
        this.f436289a = v5Var;
    }

    @Override // pi1.e
    public void c() {
        android.app.Activity w17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f436289a;
        if (!(v5Var.mo50261xee5260a9() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0) || (w17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0) v5Var.mo50261xee5260a9()).w()) == null) {
            return;
        }
        ((ne.a) v5Var.b(ne.a.class)).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.na.g(w17, false);
    }

    @Override // pi1.e
    /* renamed from: getCurrentState */
    public pi1.d mo127344xb7d72d0e() {
        return (pi1.d) this.f436290b.get();
    }
}
