package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class q8 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 implements com.p314xaae8f345.mm.ui.p2650x55bb7a46.l6 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f286861s;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570080wq);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.o8 o8Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.o8();
        o8Var.a(xgVar, true);
        xgVar.setTag(o8Var);
        return xgVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean M() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        if (menuItem.getItemId() != 111) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.r8.b(dVar.g(), f9Var);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar.f475787d.f526833b;
        int d17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag()).d();
        boolean z17 = !((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el();
        if (f9Var != null && !z17) {
            g4Var.c(d17, 111, 0, this.f286861s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574369i24), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
            j45.l.g("favorite");
            if ((f9Var.P0() == 2 || f9Var.P0() == 3 || f9Var.h2() == 1) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.L(f9Var, this.f286861s) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.J(f9Var.Q0()) && !this.f286861s.A()) {
                g4Var.c(d17, 123, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572402b40), com.p314xaae8f345.mm.R.raw.f79868x8752620f);
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean R(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        r45.mv2 a17;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 == null || (a17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.r8.a(v17)) == null) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.r8.c(dVar.g(), f9Var, a17);
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.l6
    public void d(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var.k2()) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.z(f9Var);
            c01.w9.f(f9Var.m124847x74d37ac6(), f9Var.Q0());
            dVar.L(true);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        this.f286861s = dVar;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.o8 o8Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.o8) g0Var;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 != null) {
            r45.mv2 a17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.r8.a(v17);
            if (a17 != null && ((r45.ub4) a17.m75936x14adae67(8)) != null) {
                java.lang.String m75945x2fec8307 = a17.m75945x2fec8307(0);
                android.widget.TextView textView = o8Var.f286697b;
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.app.Activity g17 = dVar.g();
                ((ke0.e) xVar).getClass();
                textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(g17, m75945x2fec8307));
                o8Var.f286701f.setText(((r45.ub4) a17.m75936x14adae67(8)).m75939xb282bd08(1) == 1 ? dVar.g().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m9u) : dVar.g().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m9v));
                o8Var.f286698c.setVisibility(0);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17.m75945x2fec8307(2))) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().S(o8Var.f286698c, -1, com.p314xaae8f345.mm.R.C30861xcebc809e.aqs, o8Var.hashCode());
                } else {
                    vo0.e eVar = vo0.e.f520000a;
                    vo0.e.f520001b.c(a17.m75945x2fec8307(2), o8Var.f286698c, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.r8.f286945a);
                }
                o8Var.f286699d.setText(a17.m75945x2fec8307(3));
            }
            android.view.View view = o8Var.f39493x8ad70635;
            if (view != null) {
                view.setOnClickListener(w(dVar));
                o8Var.f39493x8ad70635.setOnLongClickListener(u(dVar));
                o8Var.f39493x8ad70635.setOnTouchListener(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) dVar.f542241c.a(sb5.z.class))).B1);
                o8Var.f39493x8ad70635.setTag(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er(dVar2, this.f286861s.D(), o8Var, null));
            }
        }
        android.widget.ImageView imageView = o8Var.f286700e;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        Z(o8Var, f9Var.P0() < 2, true);
        V(o8Var, dVar2, dVar.t(), dVar.D(), dVar, this);
    }
}
