package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class t6 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 implements com.p314xaae8f345.mm.ui.p2650x55bb7a46.l6 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f287097s;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570071wf);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p6 p6Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p6();
        p6Var.a(xgVar, true);
        xgVar.setTag(p6Var);
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
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.u6.c(dVar.g(), f9Var);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar.f475787d.f526833b;
        int d17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag()).d();
        boolean z17 = !((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el();
        if (f9Var != null && !z17) {
            if (!c01.ia.A(f9Var) && !c01.ia.x(f9Var)) {
                g4Var.c(d17, 111, 0, this.f287097s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574369i24), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
            }
            j45.l.g("favorite");
            if ((f9Var.P0() == 2 || f9Var.P0() == 3 || f9Var.h2() == 1) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.L(f9Var, this.f287097s) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.J(f9Var.Q0()) && !this.f287097s.A()) {
                g4Var.c(d17, 123, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572402b40), com.p314xaae8f345.mm.R.raw.f79868x8752620f);
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean R(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        r45.dv2 a17;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 == null || (a17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.u6.a(v17)) == null) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.u6.b(dVar.g(), f9Var, a17);
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
        this.f287097s = dVar;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p6 p6Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p6) g0Var;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 != null) {
            r45.dv2 a17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.u6.a(v17);
            if (a17 != null) {
                android.widget.TextView textView = p6Var.f286768b;
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.app.Activity g17 = dVar.g();
                java.lang.String m75945x2fec8307 = a17.m75945x2fec8307(1);
                ((ke0.e) xVar).getClass();
                textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(g17, m75945x2fec8307));
                java.util.ArrayList arrayList = new java.util.ArrayList(a17.m75941xfb821914(3).size() + 2);
                for (int i17 = 0; i17 < a17.m75941xfb821914(3).size() && i17 < 4; i17++) {
                    r45.mb4 mb4Var = new r45.mb4();
                    mb4Var.set(0, (java.lang.String) a17.m75941xfb821914(3).get(i17));
                    mb4Var.set(18, (java.lang.String) a17.m75941xfb821914(4).get(i17));
                    mb4Var.set(19, mb4Var.m75945x2fec8307(18));
                    mb4Var.set(1, mb4Var.m75945x2fec8307(0));
                    arrayList.add(mb4Var);
                }
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                tw2.e eVar = new tw2.e(arrayList, false);
                p6Var.f286769c.mo62058x6cab2c8d(eVar);
                eVar.f503999c = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.s6(this, f9Var, a17);
            }
            android.view.View view = p6Var.f39493x8ad70635;
            if (view != null) {
                view.setOnClickListener(w(dVar));
                p6Var.f39493x8ad70635.setOnLongClickListener(u(dVar));
                p6Var.f39493x8ad70635.setOnTouchListener(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) dVar.f542241c.a(sb5.z.class))).B1);
                p6Var.f39493x8ad70635.setTag(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er(dVar2, this.f287097s.D(), p6Var, null));
            }
        }
        android.widget.ImageView imageView = p6Var.f286770d;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        Z(p6Var, f9Var.P0() < 2, true);
        V(p6Var, dVar2, dVar.t(), dVar.D(), dVar, this);
    }
}
