package ze5;

/* loaded from: classes9.dex */
public abstract class s2 extends ze5.w8 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f553720s;

    @Override // ze5.w8, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean P(android.view.MenuItem item, yb5.d ui6, rd5.d msgData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = msgData.f475787d.f526833b;
        int itemId = item.getItemId();
        if (itemId == 100) {
            return true;
        }
        if (itemId != 111) {
            return false;
        }
        android.content.Intent intent = new android.content.Intent(ui6.g(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.class);
        intent.putExtra("Retr_Msg_content", c01.w9.l(ui6.D(), f9Var.j(), f9Var.A0()));
        intent.putExtra("Retr_Msg_Type", 2);
        intent.putExtra("Retr_Msg_Id", f9Var.m124847x74d37ac6());
        intent.putExtra("Retr_MsgTalker", f9Var.Q0());
        intent.putExtra("scene_from", 17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(ui6, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgGameShareMvvm", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        ui6.a0((android.content.Intent) arrayList.get(0));
        yj0.a.f(ui6, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgGameShareMvvm", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return false;
    }

    @Override // ze5.w8, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean Q(db5.g4 menu, android.view.View v17, rd5.d msgData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = msgData.f475787d.f526833b;
        java.lang.Object tag = v17.getTag();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = tag instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er ? (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) tag : null;
        if (erVar == null) {
            return true;
        }
        int d17 = erVar.d();
        menu.c(d17, 111, 0, v17.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574369i24), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
        menu.c(d17, 136, 0, v17.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3v), com.p314xaae8f345.mm.R.raw.f79874x420fae64);
        yb5.d dVar = this.f553720s;
        if (dVar != null && M() && ((f9Var.P0() == 2 || f9Var.P0() == 3 || f9Var.h2() == 1) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.L(f9Var, dVar) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.J(f9Var.Q0()) && !dVar.A())) {
            menu.c(d17, 123, 0, v17.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572402b40), com.p314xaae8f345.mm.R.raw.f79868x8752620f);
        }
        return true;
    }

    @Override // ze5.w8
    public void h0(ze5.n8 holder, yb5.d ui6, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        this.f553720s = ui6;
        ot0.q v17 = ot0.q.v(msg.U1());
        if (v17 == null) {
            return;
        }
        ((l63.h) ((m63.g) i95.n0.c(m63.g.class))).wi(v17, java.lang.Long.valueOf(msg.I0()), 1);
    }

    @Override // ze5.w8
    public q31.p i0(yb5.d ui6, rd5.d msgData, java.lang.String str) {
        ot0.q v17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = msgData.f475787d.f526833b;
        java.lang.String U1 = f9Var.U1();
        if (!(!(U1 == null || r26.n0.N(U1)))) {
            U1 = null;
        }
        if (U1 != null && (v17 = ot0.q.v(U1)) != null) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g0 g0Var = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g0) v17.y(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g0.class);
            z01.r rVar = new z01.r();
            rVar.f550678d = v17.f430187f;
            rVar.f550679e = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v17.f430191g) ? v17.f430191g : v17.S1;
            rVar.f550680f = 0;
            rVar.f550681g = g0Var != null && g0Var.f273168g == 1;
            rVar.f550688q = new ze5.p2(v17, ui6, f9Var, this);
            rVar.f550686o = new ze5.q2(v17, ui6, this);
            rVar.f550687p = false;
            rVar.f550682h = new ze5.r2(f9Var, ui6);
            return rVar;
        }
        return new z01.r();
    }
}
