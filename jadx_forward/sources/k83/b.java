package k83;

/* loaded from: classes14.dex */
public abstract class b implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public k83.a f386423d;

    /* renamed from: e, reason: collision with root package name */
    public k83.g f386424e;

    public void c() {
        for (int i17 : d()) {
            c01.d9.e().q(i17, this);
        }
        this.f386423d = null;
        g();
    }

    public abstract int[] d();

    public abstract int e();

    public void f() {
        for (int i17 : d()) {
            c01.d9.e().a(i17, this);
        }
        h();
    }

    public abstract void g();

    public abstract void h();

    public abstract void i(k83.g gVar);

    public void j(k83.g gVar) {
        e();
        this.f386424e = gVar;
        i(gVar);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        m1Var.mo808xfb85f7b0();
        e();
        if (i17 == 0 && i18 == 0) {
            k83.a aVar = this.f386423d;
            if (aVar != null) {
                aVar.b(e(), m1Var, i17, i18);
                return;
            }
            return;
        }
        k83.a aVar2 = this.f386423d;
        if (aVar2 != null) {
            aVar2.a(e(), m1Var, i17, i18);
        }
    }
}
