package ks3;

/* loaded from: classes8.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hs3.l f393215d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ks3.k0 f393216e;

    public h0(ks3.k0 k0Var, hs3.l lVar) {
        this.f393216e = k0Var;
        this.f393215d = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ks3.k0 k0Var = this.f393216e;
        ks3.j0 j0Var = new ks3.j0(k0Var, null);
        java.util.Map map = k0Var.f393242e;
        hs3.l lVar = this.f393215d;
        ((java.util.HashMap) map).put(java.lang.Long.valueOf(lVar.f366116a), lVar);
        ((java.util.HashMap) k0Var.f393243f).put(java.lang.Long.valueOf(lVar.f366116a), j0Var);
        if (lVar.f366122g.c()) {
            j0Var.f393233e = lVar;
            j0Var.execute(lVar);
        }
    }
}
