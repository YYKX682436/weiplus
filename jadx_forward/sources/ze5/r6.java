package ze5;

/* loaded from: classes9.dex */
public class r6 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 implements qd5.c {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f553714s;

    /* renamed from: t, reason: collision with root package name */
    public ze5.u6 f553715t;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.e1k);
        ze5.w6 w6Var = new ze5.w6();
        w6Var.a(xgVar, true);
        xgVar.setTag(w6Var);
        return xgVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean M() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        if (100 == menuItem.getItemId()) {
            ze5.o6.c(f9Var, this, dVar);
            return false;
        }
        if (131 == menuItem.getItemId()) {
            ze5.o6.d(dVar, menuItem, f9Var);
            return false;
        }
        if (137 == menuItem.getItemId() || 170 == menuItem.getItemId()) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            m11.b0 b27 = m11.b1.Di().b2(f9Var.Q0(), f9Var.I0());
            cc0.l lVar = (cc0.l) i95.n0.c(cc0.l.class);
            tg3.u0 u0Var = (tg3.u0) i95.n0.c(tg3.u0.class);
            rq3.k kVar = (rq3.k) lVar;
            kVar.fj(((k90.b) u0Var).aj(f9Var, bm5.c0.f104083a.d(b27.l()), b27.f404170e, "", ""), f9Var.m124847x74d37ac6(), 1);
        }
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.lk) ((sb5.w1) dVar.f542241c.a(sb5.w1.class))).m0(menuItem, f9Var);
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        m11.b0 b0Var;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar.f475787d.f526833b;
        if (c01.d9.b().E() && view != null && f9Var != null) {
            int d17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag()).d();
            if (f9Var.m124847x74d37ac6() > 0) {
                ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                b0Var = m11.b1.Di().T1(f9Var.Q0(), f9Var.m124847x74d37ac6());
            } else {
                b0Var = null;
            }
            if ((b0Var == null || b0Var.f404166a <= 0) && f9Var.I0() > 0) {
                ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                b0Var = m11.b1.Di().b2(f9Var.Q0(), f9Var.I0());
            }
            m11.b0 b0Var2 = b0Var;
            if (!c01.ia.y(f9Var) && !c01.ia.x(f9Var)) {
                g4Var.c(d17, 110, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574369i24), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
            }
            if (r01.z.d() && !this.f553714s.F()) {
                g4Var.add(d17, 114, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3l));
            }
            j45.l.g("favorite");
            g4Var.c(d17, 116, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg), com.p314xaae8f345.mm.R.raw.f79735x2a2da63f);
            if (b0Var2 != null && b0Var2.f404181p != -1) {
                android.view.MenuItem c17 = g4Var.c(d17, 131, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b2d), com.p314xaae8f345.mm.R.raw.f79857xfd4f1a25);
                int[] iArr = new int[2];
                int width = view.getWidth();
                int height = view.getHeight();
                view.getLocationOnScreen(iArr);
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("img_gallery_width", width).putExtra("img_gallery_height", height).putExtra("img_gallery_left", iArr[0]).putExtra("img_gallery_top", iArr[1]);
                ((db5.h4) c17).B = intent;
            }
            int i17 = jt.x.M0;
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
            if (!this.f553714s.F()) {
                g4Var.c(d17, 100, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3o), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
            }
            if (c01.ia.A(f9Var) || c01.ia.z(f9Var) || c01.ia.L(f9Var)) {
                g4Var.clear();
                if (!this.f553714s.F()) {
                    g4Var.c(d17, 100, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3o), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
                }
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean R(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        return false;
    }

    @Override // qd5.c
    public qd5.a a(rd5.d dVar) {
        return ze5.o6.e(dVar);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean c0(yb5.d dVar) {
        return dVar.D();
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public com.p314xaae8f345.mm.p2621x8fb0427b.a9 i(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, android.content.Context context, yb5.q qVar, yb5.a aVar) {
        return new ze5.v6(f9Var, qVar, aVar);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        this.f553714s = dVar;
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.f7) ((sb5.e0) dVar.f542241c.a(sb5.e0.class))).p0(f9Var);
        ze5.w6 w6Var = (ze5.w6) g0Var;
        z01.q qVar = new z01.q();
        af5.y0.b(qVar, f9Var);
        if (this.f553715t == null) {
            this.f553715t = new ze5.u6(this.f553714s, this, true);
        }
        ze5.u6 u6Var = this.f553715t;
        u6Var.f553759h = 0;
        qVar.f550674f = u6Var;
        qVar.f550675g = u(dVar);
        qVar.f550676h = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) dVar.f542241c.a(sb5.z.class))).B1;
        w6Var.f553817c.m48330xfcfee142(qVar);
        w6Var.f553817c.m80098x2f6118c5(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er(dVar2, dVar.D(), w6Var, f9Var.Q0()));
        w6Var.f553816b.m48330xfcfee142(ze5.o6.a(f9Var, this, dVar, w6Var));
        ym5.a1.h(g0Var.f39494xbf64baf8, new ze5.q6(this, f9Var));
        ze5.v6 v6Var = (ze5.v6) f9Var.f275460g2;
        lf5.f.f400067a.a(dVar, f9Var, w6Var, this, v6Var.f553788f, v6Var.f553790h);
        ze5.o6.b(w6Var.f553818d, dVar2, dVar, w6Var);
    }
}
