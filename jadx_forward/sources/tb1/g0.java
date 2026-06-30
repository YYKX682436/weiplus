package tb1;

/* loaded from: classes7.dex */
public class g0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f498429d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f498430e;

    public g0(tb1.k0 k0Var, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2) {
        this.f498429d = weakReference;
        this.f498430e = weakReference2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0
    public void c() {
        tb1.a0 a0Var = (tb1.a0) this.f498429d.get();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t) this.f498430e.get();
        if (a0Var == null || tVar == null) {
            return;
        }
        tVar.I(a0Var);
        tVar.O(a0Var);
        tVar.K(a0Var);
        tb1.b.f498422a.b(a0Var.mo50746x72efd496(), true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.e(tVar.mo48798x74292566(), this);
    }
}
