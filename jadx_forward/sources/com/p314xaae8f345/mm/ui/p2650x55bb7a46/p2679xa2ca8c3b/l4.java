package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class l4 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f285922s;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570023up);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.k4 k4Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.k4();
        k4Var.a(xgVar, false);
        xgVar.setTag(k4Var);
        return xgVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean M() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        return menuItem.getItemId() == 100;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        g4Var.c(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag()).d(), 100, 0, this.f285922s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean R(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(f9Var.Q0(), 1);
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgC2CHoneyPayFrom", "click honey pay");
            ot0.b bVar = (ot0.b) v17.y(ot0.b.class);
            java.lang.String str = bVar.C;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgC2CHoneyPayFrom", "no routeInfo, fallback to nativeUrl");
                java.lang.String queryParameter = android.net.Uri.parse(bVar.f429910c).getQueryParameter("cardNo");
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_is_payer", false);
                intent.putExtra("key_card_no", queryParameter);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.SessionPayment.k(view.getContext(), null)) {
                    return true;
                }
                j45.l.j(dVar.g(), "honey_pay", ".ui.HoneyPayProxyUI", intent, null);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15191, 0, 0, 0, 0, 0, 0, 1);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgC2CHoneyPayFrom", "has routeInfo, try handle");
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p4.g(str, A(dVar, f9Var), dVar.x(), dVar.g());
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        this.f285922s = dVar;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.k4 k4Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.k4) g0Var;
        if (v17 != null) {
            ot0.b bVar = (ot0.b) v17.y(ot0.b.class);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p4.a(k4Var, v17, false);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p4.b(dVar, f9Var, bVar, k4Var, v17);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p4.c(dVar, f9Var, bVar, k4Var, v17);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p4.d(dVar, f9Var, bVar, k4Var, v17);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p4.e(dVar, f9Var, bVar, k4Var, v17);
        }
        k4Var.f39493x8ad70635.setOnClickListener(w(dVar));
        k4Var.f39493x8ad70635.setOnLongClickListener(u(dVar));
        k4Var.f39493x8ad70635.setOnTouchListener(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) dVar.f542241c.a(sb5.z.class))).B1);
        k4Var.f39493x8ad70635.setTag(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er(dVar2, this.f285922s.D(), g0Var, null));
    }
}
