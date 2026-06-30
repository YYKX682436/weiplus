package ze5;

/* loaded from: classes9.dex */
public final class l9 {
    public l9(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final boolean a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 chattingItem, android.view.MenuItem item, yb5.d ui6, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chattingItem, "chattingItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        if (item.getItemId() != 111) {
            return false;
        }
        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.la.a(msg)) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.s1.c(ui6, msg, chattingItem.A(ui6, msg), 2000, new ze5.k9(msg, chattingItem));
            return false;
        }
        db5.e1.y(ui6.g(), ui6.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c96), "", ui6.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_e), null);
        return false;
    }

    public final boolean b(yb5.d ui6, db5.g4 menu, android.view.View v17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, boolean z17) {
        ot0.q v18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.Object tag = v17.getTag();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ItemDataTag");
        int d17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) tag).d();
        if (msg.j() == null || (v18 = ot0.q.v(c01.w9.l(ui6.D(), msg.j(), msg.A0()))) == null) {
            return true;
        }
        if (93 != v18.f430199i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemTingCategoryMvvm", "onCreateContextMenu(from), not ting list type, but enter here.");
            return true;
        }
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str = v18.f430179d;
        ((kt.c) i0Var).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m j17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.j(str, false, false);
        if (((kt.c) i0Var).nj(j17) && !com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.k(msg) && !com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.j(msg) && msg.P0() != 1) {
            menu.c(d17, 111, 0, ui6.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574369i24), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
        }
        if (!z17 && ((msg.P0() == 2 || msg.P0() == 3 || msg.h2() == 1) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.L(msg, ui6) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.J(msg.Q0()) && !ui6.A())) {
            menu.c(d17, 123, 0, v17.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572402b40), com.p314xaae8f345.mm.R.raw.f79868x8752620f);
        }
        j45.l.g("favorite");
        if (j17 == null || !j17.k()) {
            menu.c(d17, 116, 0, v17.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg), com.p314xaae8f345.mm.R.raw.f79735x2a2da63f);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5348xb8e1a564 c5348xb8e1a564 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5348xb8e1a564();
        long m124847x74d37ac6 = msg.m124847x74d37ac6();
        am.b6 b6Var = c5348xb8e1a564.f135674g;
        b6Var.f87752a = m124847x74d37ac6;
        b6Var.f87753b = msg.Q0();
        c5348xb8e1a564.e();
        if (c5348xb8e1a564.f135675h.f87869a) {
            menu.c(d17, 129, 0, v17.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3x), com.p314xaae8f345.mm.R.raw.f79841xc8521962);
        }
        if (!ui6.F()) {
            menu.c(d17, 100, 0, ui6.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
        }
        return true;
    }

    public final boolean c(yb5.d ui6, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.mm.p959x883644fd.b.d(msg, com.p314xaae8f345.mm.p959x883644fd.a.Click, ui6.f542255q, ui6.k());
        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(msg.Q0(), 1);
        if (msg.j() == null) {
            return false;
        }
        ot0.q v17 = ot0.q.v(c01.w9.l(ui6.D(), msg.j(), msg.A0()));
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.o6 o6Var = com.p314xaae8f345.mm.ui.p2650x55bb7a46.o6.f283598a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(v17);
        return o6Var.c(v17, msg);
    }

    public final z01.e0 d(yb5.d ui6, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.String U1 = msg.U1();
        if (!(true ^ (U1 == null || r26.n0.N(U1)))) {
            U1 = null;
        }
        if (U1 == null) {
            return new z01.e0();
        }
        l15.c cVar = new l15.c();
        cVar.m126728xdc93280d(U1);
        if (cVar.k() == null) {
            return new z01.e0();
        }
        z01.e0 e0Var = new z01.e0();
        ot0.q v17 = ot0.q.v(msg.U1());
        ot0.h y17 = v17.y(il4.a.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(y17, "piece(...)");
        android.app.Activity g17 = ui6.g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getContext(...)");
        r45.lm6 a17 = il4.d.a(g17, (il4.a) y17, v17, msg);
        android.app.Activity g18 = ui6.g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g18, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18735xc3936731 c18735xc3936731 = new com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18735xc3936731(g18);
        c18735xc3936731.c();
        c18735xc3936731.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562777ob);
        c18735xc3936731.g(a17, null);
        java.lang.String str = a17.f461170d;
        if (str == null) {
            str = "";
        }
        e0Var.f550533e = str;
        java.lang.String str2 = a17.f461171e;
        e0Var.f550534f = str2 != null ? str2 : "";
        e0Var.f550532d = c18735xc3936731;
        e0Var.f550535g = com.p314xaae8f345.mm.R.C30861xcebc809e.f562777ob;
        return e0Var;
    }
}
