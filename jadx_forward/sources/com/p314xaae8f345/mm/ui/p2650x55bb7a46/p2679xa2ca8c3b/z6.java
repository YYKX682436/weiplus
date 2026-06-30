package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public final class z6 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 implements com.p314xaae8f345.mm.ui.p2650x55bb7a46.l6 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f287648s;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.e1r);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.v6 v6Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.v6();
        v6Var.a(xgVar, true);
        xgVar.setTag(v6Var);
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
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a7 a7Var = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a7.f284818a;
        android.app.Activity g17 = ui6.g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getContext(...)");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a7.a(a7Var, g17, f9Var);
        java.lang.String A = A(ui6, f9Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(A, "getUserName(...)");
        java.util.Map b17 = a7Var.b(f9Var, A);
        if (b17 == null) {
            return true;
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("long_press_forward", "view_exp", b17, 1, false);
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
            ot0.q v18 = ot0.q.v(f9Var.U1());
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a7 a7Var = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a7.f284818a;
            java.lang.String A = A(this.f287648s, f9Var);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(A, "getUserName(...)");
            java.util.Map b17 = a7Var.b(f9Var, A);
            if ((f9Var.P0() == 2 || f9Var.P0() == 3 || f9Var.h2() == 1) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.L(f9Var, this.f287648s) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.J(f9Var.Q0())) {
                yb5.d dVar = this.f287648s;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar);
                if (!dVar.A()) {
                    menu.c(d17, 123, 0, v17.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572402b40), com.p314xaae8f345.mm.R.raw.f79868x8752620f);
                }
            }
            if (!c01.ia.A(f9Var) && !c01.ia.x(f9Var)) {
                menu.c(d17, 111, 0, v17.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574369i24), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
                if (b17 != null) {
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("long_press_forward", "view_exp", b17, 1, false);
                }
            }
            if (!c01.ia.A(f9Var) && v18.f430199i != 119) {
                yb5.d dVar2 = this.f287648s;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar2);
                menu.c(d17, 116, 0, dVar2.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg), com.p314xaae8f345.mm.R.raw.f79735x2a2da63f);
                if (b17 != null) {
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("long_press_fav", "view_exp", b17, 1, false);
                }
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean R(android.view.View v17, yb5.d ui6, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a7 a7Var = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a7.f284818a;
        a7Var.c(ui6, msg);
        java.lang.String A = A(ui6, msg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(A, "getUserName(...)");
        a7Var.d(msg, A);
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.l6
    public void d(android.view.View v17, yb5.d ui6, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        if (msg.k2()) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.z(msg);
            c01.w9.f(msg.m124847x74d37ac6(), msg.Q0());
            ui6.L(true);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 tag, yb5.d ui6, rd5.d msgData, java.lang.String str) {
        zy2.g gVar;
        r45.ev2 ev2Var;
        java.lang.String string;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = msgData.f475787d.f526833b;
        this.f287648s = ui6;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.v6 v6Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.v6) tag;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 == null || (gVar = (zy2.g) v17.y(zy2.g.class)) == null || (ev2Var = gVar.f558916b) == null) {
            return;
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        ya2.l.f542035a.h(ev2Var.m75945x2fec8307(3), v6Var.f287371d, mn2.f1.B);
        android.widget.TextView textView = v6Var.f287369b;
        if (textView != null) {
            textView.setText(ev2Var.m75945x2fec8307(1));
        }
        android.widget.TextView textView2 = v6Var.f287370c;
        if (textView2 != null) {
            android.app.Activity g17 = ui6.g();
            textView2.setText(g17 != null ? g17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ok6, java.lang.Integer.valueOf(ev2Var.m75939xb282bd08(4))) : null);
        }
        android.widget.TextView textView3 = v6Var.f287372e;
        if (textView3 != null) {
            if (v17.f430199i == 119) {
                android.app.Activity g18 = ui6.g();
                if (g18 != null) {
                    string = g18.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nyc);
                    textView3.setText(string);
                }
                string = null;
                textView3.setText(string);
            } else {
                android.app.Activity g19 = ui6.g();
                if (g19 != null) {
                    string = g19.getString(com.p314xaae8f345.mm.R.C30867xcad56011.njl);
                    textView3.setText(string);
                }
                string = null;
                textView3.setText(string);
            }
        }
        v6Var.f39493x8ad70635.setOnClickListener(w(ui6));
        v6Var.f39493x8ad70635.setOnLongClickListener(u(ui6));
        android.view.View view = v6Var.f39493x8ad70635;
        sb5.z zVar = (sb5.z) ui6.f542241c.a(sb5.z.class);
        view.setOnTouchListener(zVar != null ? ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar).B1 : null);
        yb5.d dVar = this.f287648s;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er(msgData, dVar.D(), v6Var, null);
        android.view.View view2 = v6Var.f39493x8ad70635;
        if (view2 != null) {
            view2.setTag(erVar);
        }
        android.view.View convertView = v6Var.f39494xbf64baf8;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(convertView, "convertView");
        ym5.a1.h(convertView, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.y6(f9Var, this, ui6));
    }
}
