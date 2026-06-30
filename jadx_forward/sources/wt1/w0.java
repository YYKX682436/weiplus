package wt1;

/* loaded from: classes9.dex */
public class w0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public long f530893d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f530894e;

    public w0() {
        super(0);
        this.f530893d = 0L;
        this.f530894e = "";
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5628xba03adfa c5628xba03adfa = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5628xba03adfa) abstractC20979x809547d1;
        if (!(c5628xba03adfa instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5628xba03adfa)) {
            return false;
        }
        am.yg ygVar = c5628xba03adfa.f135956g;
        java.lang.String str = ygVar.f89991a;
        this.f530893d = ygVar.f89992b;
        this.f530894e = ygVar.f89993c;
        xt1.f d17 = lu1.u.d(str);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(this.f530894e, this.f530893d);
        Li.r1(1);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(this.f530893d, Li, true);
        if (d17 == null) {
            d17 = lu1.u.d(Li.j());
        }
        if (d17 == null) {
            return true;
        }
        gm0.j1.n().f354821b.a(1045, this);
        gm0.j1.n().f354821b.g(new xt1.m0(d17.f537999b, this.f530894e, 17));
        return true;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof xt1.m0) {
            java.lang.String str2 = ((xt1.m0) m1Var).f538058f;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(this.f530894e, this.f530893d);
            if (i17 == 0 && i18 == 0) {
                Li.r1(2);
            } else {
                Li.r1(5);
            }
            ot0.q v17 = ot0.q.v(Li.j());
            xt1.f d17 = lu1.u.d(Li.j());
            d17.f538005h = str2;
            v17.U0 = lu1.u.c(d17);
            v17.T0 = ot0.q.u(v17, null, null);
            Li.d1(ot0.q.u(v17, null, null));
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(this.f530893d, Li, true);
            gm0.j1.n().f354821b.q(1045, this);
        }
    }
}
