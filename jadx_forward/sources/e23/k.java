package e23;

/* loaded from: classes12.dex */
public class k extends e23.p0 {
    public com.p314xaae8f345.mm.p2621x8fb0427b.a3 B;
    public java.lang.CharSequence C;
    public final e23.j D;

    public k(int i17) {
        super(i17);
        this.D = new e23.j(this);
    }

    @Override // e23.p0, u13.g
    public void a(android.content.Context context, u13.e eVar, java.lang.Object... objArr) {
        java.lang.String w07;
        super.a(context, eVar, objArr);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f328458q.f432722g, true);
        if (n17 == null) {
            w07 = o13.n.d(this.f328458q.f432720e);
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.w0())) {
            com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = this.B;
            if (a3Var != null) {
                java.lang.String z07 = a3Var.z0(this.f328458q.f432722g);
                w07 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07) ? z07 : n17.P0();
            } else {
                w07 = n17.P0();
            }
        } else {
            w07 = n17.w0();
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w07)) {
            return;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        float f17 = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.d.f219568d;
        ((ke0.e) xVar).getClass();
        this.C = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.n(context, w07, f17);
    }

    @Override // e23.p0, u13.g
    public u13.f k() {
        return this.D;
    }
}
