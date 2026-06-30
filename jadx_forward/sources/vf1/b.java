package vf1;

/* loaded from: classes7.dex */
public class b extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f517846d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t f517847e;

    public b(vf1.g gVar, java.lang.ref.WeakReference weakReference, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar) {
        this.f517846d = weakReference;
        this.f517847e = tVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0
    public void c() {
        tb1.a0 a0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar = this.f517847e;
        java.lang.ref.WeakReference weakReference = this.f517846d;
        if (weakReference != null && (a0Var = (tb1.a0) weakReference.get()) != null) {
            tVar.I(a0Var);
            tVar.O(a0Var);
            tVar.K(a0Var);
            tb1.b.f498422a.b(a0Var.mo50746x72efd496(), true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.e(tVar.mo48798x74292566(), this);
    }
}
