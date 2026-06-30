package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class m6 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f286096s;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570037v6);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.l6 l6Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.l6();
        l6Var.a(xgVar, false);
        xgVar.setTag(l6Var);
        return xgVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean M() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        if (menuItem.getItemId() != 111) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.o6.b(dVar.g(), f9Var);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar.f475787d.f526833b;
        int d17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag()).d();
        boolean z17 = !((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el();
        if (f9Var != null) {
            j45.l.g("favorite");
            if (!z17) {
                g4Var.c(d17, 111, 0, this.f286096s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574369i24), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean R(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        r45.mv2 a17;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 == null || (a17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.o6.a(v17)) == null) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.o6.c(dVar.g(), f9Var, a17);
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        java.lang.String m75945x2fec8307;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        this.f286096s = dVar;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.l6 l6Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.l6) g0Var;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 != null) {
            r45.mv2 a17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.o6.a(v17);
            if (a17 != null && ((r45.ht0) a17.m75936x14adae67(6)) != null) {
                if (a17.m75939xb282bd08(1) == 7) {
                    m75945x2fec8307 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).pj((r45.ht0) a17.m75936x14adae67(6));
                    java.lang.String charSequence = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getText(com.p314xaae8f345.mm.R.C30867xcad56011.cmu).toString();
                    if (!android.text.TextUtils.isEmpty(((r45.ht0) a17.m75936x14adae67(6)).m75945x2fec8307(5))) {
                        charSequence = ((r45.ht0) a17.m75936x14adae67(6)).m75945x2fec8307(5);
                    }
                    l6Var.f285935f.setText(charSequence);
                } else {
                    m75945x2fec8307 = a17.m75945x2fec8307(0);
                }
                android.widget.TextView textView = l6Var.f285931b;
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.app.Activity g17 = dVar.g();
                ((ke0.e) xVar).getClass();
                textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(g17, m75945x2fec8307));
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17.m75945x2fec8307(2))) {
                    l6Var.f285932c.setVisibility(4);
                } else {
                    l6Var.f285932c.setVisibility(0);
                    vo0.e eVar = vo0.e.f520000a;
                    vo0.e.f520001b.c(a17.m75945x2fec8307(2), l6Var.f285932c, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.o6.f286671a);
                }
                l6Var.f285933d.setText(a17.m75945x2fec8307(3));
            }
            android.view.View view = l6Var.f39493x8ad70635;
            if (view != null) {
                view.setOnClickListener(w(dVar));
                l6Var.f39493x8ad70635.setOnLongClickListener(u(dVar));
                l6Var.f39493x8ad70635.setOnTouchListener(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) dVar.f542241c.a(sb5.z.class))).B1);
                l6Var.f39493x8ad70635.setTag(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er(dVar2, this.f286096s.D(), l6Var, null));
            }
        }
    }
}
