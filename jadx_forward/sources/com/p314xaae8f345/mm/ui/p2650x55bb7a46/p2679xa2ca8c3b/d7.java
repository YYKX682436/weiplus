package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class d7 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 implements com.p314xaae8f345.mm.ui.p2650x55bb7a46.l6 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f285307s;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570072wg);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.b7 b7Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.b7();
        b7Var.a(xgVar, true);
        xgVar.setTag(b7Var);
        return xgVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean M() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar.f475787d.f526833b;
        int d17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag()).d();
        if (f9Var != null && ((f9Var.P0() == 2 || f9Var.P0() == 3 || f9Var.h2() == 1) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.L(f9Var, this.f285307s) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.J(f9Var.Q0()) && !this.f285307s.A())) {
            g4Var.c(d17, 123, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572402b40), com.p314xaae8f345.mm.R.raw.f79868x8752620f);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean R(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        zy2.z4 z4Var;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 == null || (z4Var = (zy2.z4) v17.y(zy2.z4.class)) == null) {
            return false;
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        android.app.Activity context = dVar.g();
        java.lang.String appId = z4Var.f559171f;
        java.lang.String enterPath = z4Var.f559169d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterPath, "enterPath");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ((c61.ub) i95.n0.c(c61.ub.class))).ll(context, appId, enterPath, com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14496xb5b90f36, "");
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
        this.f285307s = dVar;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.b7 b7Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.b7) g0Var;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 != null) {
            zy2.z4 z4Var = (zy2.z4) v17.y(zy2.z4.class);
            if (z4Var != null) {
                b7Var.f284992b.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(dVar.g(), com.p314xaae8f345.mm.R.raw.f80118xfa5fcb07, dVar.s().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560059a7)));
                b7Var.f284993c.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572881cu0);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z4Var.f559168c)) {
                    b7Var.f284994d.setVisibility(8);
                } else {
                    b7Var.f284994d.setVisibility(0);
                    android.widget.TextView textView = b7Var.f284994d;
                    le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                    android.app.Activity g17 = dVar.g();
                    java.lang.String str2 = z4Var.f559168c;
                    ((ke0.e) xVar).getClass();
                    textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(g17, str2));
                }
                android.widget.TextView textView2 = b7Var.f284995e;
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                android.app.Activity g18 = dVar.g();
                java.lang.String str3 = z4Var.f559167b;
                ((ke0.e) xVar2).getClass();
                textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(g18, str3));
            }
            b7Var.f39493x8ad70635.setOnClickListener(w(dVar));
            b7Var.f39493x8ad70635.setOnLongClickListener(u(dVar));
            b7Var.f39493x8ad70635.setOnTouchListener(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) dVar.f542241c.a(sb5.z.class))).B1);
            b7Var.f39493x8ad70635.setTag(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er(dVar2, this.f285307s.D(), b7Var, null));
        }
        android.widget.ImageView imageView = b7Var.f284996f;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        Z(b7Var, f9Var.P0() < 2, true);
        V(b7Var, dVar2, dVar.t(), dVar.D(), dVar, this);
    }
}
