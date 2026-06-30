package uf1;

/* loaded from: classes7.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 f508683d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f508684e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ uf1.a f508685f;

    public c(uf1.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var, java.lang.Runnable runnable) {
        this.f508685f = aVar;
        this.f508683d = k0Var;
        this.f508684e = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        uf1.a aVar = this.f508685f;
        android.view.Surface surface = aVar.f508671g;
        java.lang.Runnable runnable = this.f508684e;
        if (surface == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var = this.f508683d;
            if ((k0Var instanceof vf1.g) || (k0Var instanceof vf1.i)) {
                ((java.util.Vector) aVar.f508674m).add(runnable);
                return;
            }
        }
        runnable.run();
    }
}
