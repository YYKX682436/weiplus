package ze5;

/* loaded from: classes9.dex */
public final class s9 {
    public s9(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
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
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.s1.c(ui6, msg, chattingItem.A(ui6, msg), 2000, ze5.r9.f553717a);
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
        if (133 != v18.f430199i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemTingSpaceMvvm", "onCreateContextMenu, not ting space type, but enter here.");
            return true;
        }
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str = v18.f430179d;
        ((kt.c) i0Var).getClass();
        if (((kt.c) i0Var).nj(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.j(str, false, false)) && !com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.k(msg) && !com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.j(msg) && msg.P0() != 1) {
            menu.c(d17, 111, 0, ui6.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574369i24), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
        }
        if (!z17 && ((msg.P0() == 2 || msg.P0() == 3 || msg.h2() == 1) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.L(msg, ui6) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.J(msg.Q0()) && !ui6.A())) {
            menu.c(d17, 123, 0, v17.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572402b40), com.p314xaae8f345.mm.R.raw.f79868x8752620f);
        }
        if (!ui6.F()) {
            menu.c(d17, 100, 0, ui6.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
        }
        return true;
    }

    public final boolean c(yb5.d ui6, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg) {
        ot0.q v17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        if (msg.j() == null || (v17 = ot0.q.v(msg.U1())) == null) {
            return false;
        }
        il4.a aVar = (il4.a) v17.y(il4.a.class);
        bw5.o50 o50Var = aVar != null ? aVar.f373628e : null;
        if (o50Var == null) {
            return false;
        }
        qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
        android.app.Activity g17 = ui6.g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getContext(...)");
        ((rk4.k8) aj6).E(g17, o50Var);
        return true;
    }

    public final z01.f0 d(yb5.d ui6, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg) {
        java.lang.String d17;
        bw5.g60 e17;
        bw5.mc0 b17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.String U1 = msg.U1();
        if (!(!(U1 == null || r26.n0.N(U1)))) {
            U1 = null;
        }
        if (U1 == null) {
            return new z01.f0();
        }
        l15.c cVar = new l15.c();
        cVar.m126728xdc93280d(U1);
        if (cVar.k() == null) {
            return new z01.f0();
        }
        z01.f0 f0Var = new z01.f0();
        ot0.q v17 = ot0.q.v(msg.U1());
        il4.a aVar = v17 != null ? (il4.a) v17.y(il4.a.class) : null;
        bw5.o50 o50Var = aVar != null ? aVar.f373628e : null;
        f0Var.f550541d = ui6.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.piq);
        android.content.res.Resources s17 = ui6.s();
        java.lang.Object[] objArr = new java.lang.Object[2];
        java.lang.String m12487x8010e5e4 = (o50Var == null || (b17 = o50Var.b()) == null) ? null : b17.m12487x8010e5e4();
        if (m12487x8010e5e4 == null) {
            m12487x8010e5e4 = "";
        }
        objArr[0] = m12487x8010e5e4;
        java.lang.String m12637xfb82e301 = o50Var != null ? o50Var.m12637xfb82e301() : null;
        objArr[1] = m12637xfb82e301 != null ? m12637xfb82e301 : "";
        f0Var.f550542e = s17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pir, objArr);
        java.util.List b18 = kz5.b0.b();
        java.util.LinkedList linkedList = (o50Var == null || (e17 = o50Var.e()) == null) ? null : e17.f109234e;
        if (!(linkedList == null || linkedList.isEmpty())) {
            ((lz5.e) b18).addAll(kz5.n0.K0(linkedList, 4));
        } else if (o50Var != null && (d17 = o50Var.d()) != null) {
            java.lang.String str = d17.length() > 0 ? d17 : null;
            if (str != null) {
                ((lz5.e) b18).add(str);
            }
        }
        java.util.List a17 = kz5.b0.a(b18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a17, "<set-?>");
        f0Var.f550544g = a17;
        f0Var.f550543f = com.p314xaae8f345.mm.R.C30861xcebc809e.f562777ob;
        return f0Var;
    }
}
