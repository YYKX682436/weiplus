package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class u4 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f287196s;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570024uq);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.t4 t4Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.t4();
        t4Var.a(xgVar, false);
        xgVar.setTag(t4Var);
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
        g4Var.c(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag()).d(), 100, 0, this.f287196s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean R(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(f9Var.Q0(), 1);
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 != null) {
            ot0.b bVar = (ot0.b) v17.y(ot0.b.class);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.A)) {
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v17.f430201i1) ? v17.f430207k : v17.f430201i1;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("rawUrl", str);
                    intent.putExtra("msgUsername", A(dVar, f9Var));
                    intent.putExtra("geta8key_username", dVar.x());
                    j45.l.j(dVar.g(), "webview", ".ui.tools.WebViewUI", intent, null);
                }
            } else {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.w4.b(bVar.A, A(dVar, f9Var), dVar.x(), dVar.g());
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        this.f287196s = dVar;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.t4 t4Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.t4) g0Var;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 != null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.w4.a(g0Var.f39493x8ad70635, v17, "MicroMsg.ChattingItemAppMsgC2CNewFrom", false, t4Var);
            t4Var.f287088c.setTypeface(android.graphics.Typeface.defaultFromStyle(0));
            t4Var.f39493x8ad70635.setPadding(0, 0, 0, 0);
            t4Var.m80054x4906274a(t4Var.f39493x8ad70635, t4Var.f287091f);
            ot0.b bVar = (ot0.b) v17.y(ot0.b.class);
            java.lang.String str2 = f9Var.A0() == 1 ? bVar.f429914g : bVar.f429913f;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                str2 = v17.f430191g;
                t4Var.f287088c.setSingleLine(false);
                t4Var.f287088c.setMaxLines(3);
            } else {
                t4Var.f287088c.setSingleLine(true);
            }
            t4Var.f287088c.setText(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(dVar.g(), str2, t4Var.f287092g));
            t4Var.f287088c.setTextSize(0, t4Var.f287092g);
            if (com.p314xaae8f345.mm.ui.bk.C()) {
                long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(bVar.f429928u, -1L);
                if (V >= 0) {
                    t4Var.f287088c.setTextColor((int) V);
                }
            } else {
                long V2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(bVar.f429915h, -1L);
                if (V2 >= 0) {
                    t4Var.f287088c.setTextColor((int) V2);
                }
            }
            t4Var.f287089d.setText(f9Var.A0() == 1 ? bVar.f429918k : bVar.f429919l);
            if (com.p314xaae8f345.mm.ui.bk.C()) {
                long V3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(bVar.f429930w, -1L);
                if (V3 >= 0) {
                    t4Var.f287089d.setTextColor((int) V3);
                }
            } else {
                long V4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(bVar.f429920m, -1L);
                if (V4 >= 0) {
                    t4Var.f287089d.setTextColor((int) V4);
                }
            }
            t4Var.f287090e.setText(f9Var.A0() == 1 ? bVar.f429916i : bVar.f429917j);
            if (com.p314xaae8f345.mm.ui.bk.C()) {
                long V5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(bVar.f429932y, -1L);
                if (V5 >= 0) {
                    t4Var.f287090e.setTextColor((int) V5);
                }
            } else {
                long V6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(bVar.f429933z, -1L);
                if (V6 >= 0) {
                    t4Var.f287090e.setTextColor((int) V6);
                }
            }
            t4Var.f287087b.setImageBitmap(null);
            if (!com.p314xaae8f345.mm.ui.bk.C() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.f429912e)) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.f429911d)) {
                    if (bVar.f429911d.startsWith("http")) {
                        o11.f fVar = new o11.f();
                        fVar.f423616g = g83.a.b();
                        fVar.f423611b = true;
                        fVar.f423628s = true;
                        n11.a.b().h(bVar.f429911d, t4Var.f287087b, fVar.a());
                    } else {
                        int identifier = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getIdentifier(bVar.f429911d, "drawable", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
                        if (identifier > 0) {
                            t4Var.f287087b.setImageResource(identifier);
                        }
                    }
                }
            } else if (bVar.f429912e.startsWith("http")) {
                o11.f fVar2 = new o11.f();
                fVar2.f423616g = g83.a.b();
                fVar2.f423611b = true;
                fVar2.f423628s = true;
                n11.a.b().h(bVar.f429912e, t4Var.f287087b, fVar2.a());
            } else {
                int identifier2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getIdentifier(bVar.f429912e, "drawable", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
                if (identifier2 > 0) {
                    t4Var.f287087b.setImageResource(identifier2);
                }
            }
        }
        g0Var.f39493x8ad70635.setOnClickListener(w(dVar));
        g0Var.f39493x8ad70635.setOnLongClickListener(u(dVar));
        g0Var.f39493x8ad70635.setOnTouchListener(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) dVar.f542241c.a(sb5.z.class))).B1);
        g0Var.f39493x8ad70635.setTag(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er(dVar2, this.f287196s.D(), g0Var, null));
    }
}
