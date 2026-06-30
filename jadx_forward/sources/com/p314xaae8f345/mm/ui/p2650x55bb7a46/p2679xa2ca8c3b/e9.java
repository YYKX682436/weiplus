package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class e9 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f285395s;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570038v7);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.d9 d9Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.d9();
        d9Var.a(xgVar, false);
        xgVar.setTag(d9Var);
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
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.s1.c(dVar, f9Var, A(dVar, f9Var), -1, null);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar.f475787d.f526833b;
        g4Var.c(0, 111, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574369i24), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean R(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g9.b(dVar, f9Var);
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        this.f285395s = dVar;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.d9 d9Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.d9) g0Var;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 != null) {
            c53.a aVar = (c53.a) v17.y(c53.a.class);
            if (aVar != null) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g9.a(d9Var.f285309b, aVar.f120177b);
                android.widget.TextView textView = d9Var.f285310c;
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.app.Activity g17 = dVar.g();
                java.lang.String str2 = aVar.f120178c;
                ((ke0.e) xVar).getClass();
                textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(g17, str2));
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f120179d)) {
                    d9Var.f285311d.setVisibility(8);
                } else {
                    d9Var.f285311d.setVisibility(0);
                    android.widget.TextView textView2 = d9Var.f285311d;
                    le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                    android.app.Activity g18 = dVar.g();
                    java.lang.String str3 = aVar.f120179d;
                    ((ke0.e) xVar2).getClass();
                    textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(g18, str3));
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f120180e)) {
                    d9Var.f285312e.setText(dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573753fo1));
                } else {
                    android.widget.TextView textView3 = d9Var.f285312e;
                    le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
                    android.app.Activity g19 = dVar.g();
                    java.lang.String str4 = aVar.f120180e;
                    ((ke0.e) xVar3).getClass();
                    textView3.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(g19, str4));
                }
            }
            d9Var.f39493x8ad70635.setOnClickListener(w(dVar));
            d9Var.f39493x8ad70635.setOnLongClickListener(u(dVar));
            d9Var.f39493x8ad70635.setOnTouchListener(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) dVar.f542241c.a(sb5.z.class))).B1);
            d9Var.f39493x8ad70635.setTag(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er(dVar2, this.f285395s.D(), d9Var, null));
        }
    }
}
