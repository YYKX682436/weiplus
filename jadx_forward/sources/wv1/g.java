package wv1;

/* loaded from: classes12.dex */
public class g extends wv1.e {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f531474f;

    @Override // wv1.a
    public int h() {
        return 2;
    }

    @Override // wv1.a
    public void k(android.view.View view, wv1.a aVar) {
        xv1.d.d(((com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.a) this.f531462a).f177056d.mo54478x76847179(), view, aVar);
    }

    @Override // wv1.e
    public java.lang.String m() {
        if (this.f531474f == null) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            m11.l0 Di = m11.b1.Di();
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f531463b;
            java.lang.String D2 = Di.D2(f9Var, f9Var.z0(), false);
            this.f531474f = D2;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(D2) && !this.f531474f.endsWith("hd")) {
                if (com.p314xaae8f345.mm.vfs.w6.j(this.f531474f + "hd")) {
                    this.f531474f += "hd";
                }
            }
        }
        return this.f531474f;
    }
}
