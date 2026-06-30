package com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13;

/* loaded from: classes11.dex */
public class e extends com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c0 {
    public boolean G;
    public int H;
    public java.lang.String I;

    public e(int i17) {
        super(i17);
        this.H = 0;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c0, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d
    public void a(android.content.Context context, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.b bVar) {
        java.lang.String str;
        int i17 = this.H;
        if (i17 != 0 && (str = this.I) != null) {
            this.D = i17;
            this.C = str;
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.B;
        if (!this.G) {
            gm0.j1.i();
            z3Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f288352z, true);
            f(z3Var);
            this.G = true;
        }
        if (z3Var == null) {
            this.f288351y = "";
            return;
        }
        this.f288351y = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(context, ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).wi(z3Var), i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia));
        this.f288352z = z3Var.d1();
    }
}
