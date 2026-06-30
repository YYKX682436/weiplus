package c4;

/* loaded from: classes15.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c4.l0 f38270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c4.k0 f38271e;

    public c0(c4.k0 k0Var, c4.l0 l0Var) {
        this.f38271e = k0Var;
        this.f38270d = l0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        c4.n nVar = (c4.n) this.f38271e.f38317a.f11705g.remove(((c4.m0) this.f38270d).a());
        if (nVar != null) {
            ((c4.m0) nVar.f38325g).a().unlinkToDeath(nVar, 0);
        }
    }
}
