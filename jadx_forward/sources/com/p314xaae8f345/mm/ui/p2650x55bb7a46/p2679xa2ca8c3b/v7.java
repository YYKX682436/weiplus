package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public final class v7 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 implements com.p314xaae8f345.mm.ui.p2650x55bb7a46.l6 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f287373s;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater inflater, android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inflater, "inflater");
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(inflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570077wl);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.t7 t7Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.t7();
        t7Var.a(xgVar, true);
        xgVar.setTag(t7Var);
        return xgVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean M() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean P(android.view.MenuItem item, yb5.d ui6, rd5.d msgData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = msgData.f475787d.f526833b;
        if (item.getItemId() != 111) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.w7 w7Var = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.w7.f287444a;
        android.app.Activity g17 = ui6.g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getContext(...)");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.w7.a(w7Var, g17, f9Var);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean Q(db5.g4 menu, android.view.View v17, rd5.d msgData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = msgData.f475787d.f526833b;
        java.lang.Object tag = v17.getTag();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ItemDataTag");
        int d17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) tag).d();
        if (f9Var != null) {
            if ((f9Var.P0() == 2 || f9Var.P0() == 3 || f9Var.h2() == 1) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.L(f9Var, this.f287373s) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.J(f9Var.Q0())) {
                yb5.d dVar = this.f287373s;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar);
                if (!dVar.A()) {
                    menu.c(d17, 123, 0, v17.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572402b40), com.p314xaae8f345.mm.R.raw.f79868x8752620f);
                }
            }
            if (!c01.ia.A(f9Var) && !c01.ia.x(f9Var)) {
                menu.c(d17, 111, 0, v17.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574369i24), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean R(android.view.View v17, yb5.d ui6, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.w7.f287444a.b(ui6, msg);
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.l6
    public void d(android.view.View v17, yb5.d ui6, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        if (msg.k2()) {
            android.util.Pair z17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.z(msg);
            if (z17 == null || z17.second != null) {
                c01.w9.f(msg.m124847x74d37ac6(), msg.Q0());
            }
            ui6.L(true);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 tag, yb5.d ui6, rd5.d msgData, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = msgData.f475787d.f526833b;
        this.f287373s = ui6;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.t7 t7Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.t7) tag;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 != null) {
            zy2.h hVar = (zy2.h) v17.y(zy2.h.class);
            if (hVar != null) {
                mn2.g1 g1Var = mn2.g1.f411508a;
                vo0.d a17 = g1Var.a();
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                mn2.h3 e17 = ya2.l.f542035a.e(hVar.f558926d, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f);
                android.widget.ImageView imageView = t7Var.f287098b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
                a17.c(e17, imageView, g1Var.h(mn2.f1.f411495p));
                android.widget.TextView textView = t7Var.f287099c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.app.Activity g17 = ui6.g();
                java.lang.String str2 = hVar.f558927e;
                ((ke0.e) xVar).getClass();
                textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(g17, str2));
            }
            t7Var.f39493x8ad70635.setOnClickListener(w(ui6));
            t7Var.f39493x8ad70635.setOnLongClickListener(u(ui6));
            t7Var.f39493x8ad70635.setOnTouchListener(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) ui6.f542241c.a(sb5.z.class))).B1);
            yb5.d dVar = this.f287373s;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar);
            t7Var.f39493x8ad70635.setTag(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er(msgData, dVar.D(), t7Var, null));
        }
        android.widget.ImageView imageView2 = t7Var.f287100d;
        if (imageView2 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView2);
            imageView2.setVisibility(8);
        }
        Z(t7Var, f9Var.P0() < 2, true);
        V(t7Var, msgData, ui6.t(), ui6.D(), ui6, this);
    }
}
