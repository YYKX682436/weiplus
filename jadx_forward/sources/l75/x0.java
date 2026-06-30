package l75;

/* loaded from: classes11.dex */
public class x0 extends l75.v0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l75.a1 f398510e;

    public x0(l75.a1 a1Var) {
        this.f398510e = a1Var;
    }

    @Override // l75.v0
    public boolean g() {
        return this.f398510e.c();
    }

    @Override // l75.v0
    public void h(java.lang.Object obj, java.lang.Object obj2) {
        l75.z0 z0Var = (l75.z0) obj;
        l75.y0 y0Var = (l75.y0) obj2;
        if (this.f398510e.f()) {
            z0Var.g(y0Var.f398511a, y0Var.f398514d, y0Var.f398512b);
        }
    }

    @Override // l75.v0
    public void i(java.lang.Object obj) {
        this.f398510e.d((l75.y0) obj);
    }
}
