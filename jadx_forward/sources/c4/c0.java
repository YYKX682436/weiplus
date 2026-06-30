package c4;

/* loaded from: classes15.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c4.l0 f119803d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c4.k0 f119804e;

    public c0(c4.k0 k0Var, c4.l0 l0Var) {
        this.f119804e = k0Var;
        this.f119803d = l0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        c4.n nVar = (c4.n) this.f119804e.f119850a.f93238g.m174754xc84af884(((c4.m0) this.f119803d).a());
        if (nVar != null) {
            ((c4.m0) nVar.f119858g).a().unlinkToDeath(nVar, 0);
        }
    }
}
