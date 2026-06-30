package xq1;

/* loaded from: classes2.dex */
public class b implements com.p314xaae8f345.mm.p944x882e457a.u0, xq1.g {

    /* renamed from: d, reason: collision with root package name */
    public final wq1.d f537556d;

    /* renamed from: e, reason: collision with root package name */
    public vq1.a f537557e;

    public b(wq1.d dVar) {
        this.f537556d = dVar;
        gm0.j1.d().a(1869, this);
    }

    @Override // xq1.g
    public void a(java.lang.String str, java.lang.String str2) {
        if (this.f537557e != null) {
            gm0.j1.d().d(this.f537557e);
        }
        this.f537557e = new vq1.a(str, str2);
        gm0.j1.d().g(this.f537557e);
        sq1.a.a(2);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var.equals(this.f537557e)) {
            xq1.f u17 = this.f537556d.u();
            vq1.a aVar = this.f537557e;
            u17.a(aVar.f520775g, i18, str, aVar.f520776h.f469996d);
            if (i18 == 0 && i18 == 0) {
                sq1.a.a(3);
            } else {
                sq1.a.a(4);
            }
        }
    }
}
