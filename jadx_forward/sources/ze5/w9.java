package ze5;

/* loaded from: classes9.dex */
public class w9 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 implements qd5.c {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f553820s;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.e1l);
        ze5.ia iaVar = new ze5.ia();
        iaVar.a(xgVar, true);
        xgVar.setTag(iaVar);
        return xgVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean M() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jo) ((sb5.p2) dVar.f542241c.a(sb5.p2.class))).n0(menuItem, dVar2.f475787d.f526833b);
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        int i17;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar.f475787d.f526833b;
        if (c01.d9.b().E()) {
            int d17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag()).d();
            ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
            t21.v2 g17 = t21.o2.Ui().g(f9Var.z0());
            g4Var.c(d17, 130, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3w), com.p314xaae8f345.mm.R.raw.f79946xa1abe7e2);
            if (!c01.ia.x(f9Var) && !c01.ia.y(f9Var) && !c01.ia.A(f9Var)) {
                g4Var.c(d17, 107, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574369i24), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
            }
            j45.l.g("favorite");
            if (!c01.ia.A(f9Var)) {
                g4Var.c(d17, 116, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg), com.p314xaae8f345.mm.R.raw.f79735x2a2da63f);
            }
            int i18 = jt.x.M0;
            if ((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2558xb4b58865.C20602x669b26ba()) == 0) && !((gb0.n) ((fb0.k) i95.n0.c(fb0.k.class))).Ai(f9Var)) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5348xb8e1a564 c5348xb8e1a564 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5348xb8e1a564();
                long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
                am.b6 b6Var = c5348xb8e1a564.f135674g;
                b6Var.f87752a = m124847x74d37ac6;
                b6Var.f87753b = f9Var.Q0();
                c5348xb8e1a564.e();
                if (c5348xb8e1a564.f135675h.f87869a) {
                    g4Var.c(d17, 129, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3x), com.p314xaae8f345.mm.R.raw.f79841xc8521962);
                }
            }
            if (g17 != null && (((i17 = g17.f496544i) == 199 || i17 == 199) && r01.z.f() && !this.f553820s.F())) {
                g4Var.add(d17, 114, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3l));
            }
            if (c01.ia.A(f9Var) || c01.ia.L(f9Var)) {
                g4Var.clear();
                g4Var.c(d17, 130, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3w), com.p314xaae8f345.mm.R.raw.f79946xa1abe7e2);
            }
            t21.j3 d18 = (!t21.d3.s() || g17 == null) ? null : t21.j3.f496333h.d(g17.g());
            if (d18 != null && d18.f496337b) {
                g4Var.clear();
            }
            if (!this.f553820s.F()) {
                g4Var.c(d17, 100, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3q), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean R(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        return true;
    }

    @Override // qd5.c
    public qd5.a a(rd5.d dVar) {
        return ze5.ka.b(dVar);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public com.p314xaae8f345.mm.p2621x8fb0427b.a9 i(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, android.content.Context context, yb5.q qVar, yb5.a aVar) {
        return new ze5.v9(f9Var, qVar, aVar);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        this.f553820s = dVar;
        ze5.ia iaVar = (ze5.ia) g0Var;
        ze5.ia.d(this, iaVar, dVar2, true, iaVar, dVar, com.p314xaae8f345.mm.R.C30861xcebc809e.bzt, u(dVar));
        ze5.v9 v9Var = (ze5.v9) f9Var.f275460g2;
        lf5.f.f400067a.a(dVar, f9Var, iaVar, this, v9Var.f553800h, v9Var.f553801i);
        ze5.ka.a(iaVar.f553553m, dVar2, dVar, iaVar);
    }
}
