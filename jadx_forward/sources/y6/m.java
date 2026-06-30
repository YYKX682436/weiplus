package y6;

/* loaded from: classes13.dex */
public class m extends q7.k implements y6.o {

    /* renamed from: d, reason: collision with root package name */
    public y6.n f541134d;

    @Override // q7.k
    public int a(java.lang.Object obj) {
        w6.z0 z0Var = (w6.z0) obj;
        if (z0Var == null) {
            return 1;
        }
        return z0Var.mo14473xfb854877();
    }

    @Override // q7.k
    public void b(java.lang.Object obj, java.lang.Object obj2) {
        w6.z0 z0Var = (w6.z0) obj2;
        y6.n nVar = this.f541134d;
        if (nVar == null || z0Var == null) {
            return;
        }
        ((w6.g0) nVar).f524652e.a(z0Var);
    }
}
