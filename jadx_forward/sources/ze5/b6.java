package ze5;

/* loaded from: classes9.dex */
public final class b6 {
    public b6(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static final z01.j a(ze5.b6 b6Var, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        b6Var.getClass();
        z01.j jVar = new z01.j();
        m15.a aVar = new m15.a();
        java.lang.String j17 = f9Var.j();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(j17, "getContent(...)");
        aVar.m126728xdc93280d(j17);
        jVar.f550592d = aVar;
        jVar.f550595g = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.h0(dVar, new ze5.a6(f9Var, dVar));
        return jVar;
    }

    public static final boolean b(ze5.b6 b6Var, db5.g4 g4Var, android.view.View view, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, yb5.d dVar) {
        b6Var.getClass();
        java.lang.Object tag = view.getTag();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = tag instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er ? (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) tag : null;
        if (erVar == null) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.q qVar = erVar.f285441d;
        int mo79416xf806b362 = qVar != null ? qVar.mo79416xf806b362() : 0;
        com.p314xaae8f345.mm.p2621x8fb0427b.y8 D3 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).D3(f9Var.j());
        java.lang.String str = D3.f277891a;
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemContactCardMvvm", "onCreateLongClickMenu, parse possible friend msg failed");
            return false;
        }
        int i17 = D3.f277907q;
        java.util.Set set = c01.e2.f118650a;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.D3(i17) || (f9Var.mo78013xfb85f7b0() != 66 && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(dVar.x()) && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.n4(dVar.x()))) {
            g4Var.c(mo79416xf806b362, 118, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574369i24), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
        }
        if (!f9Var.t2() && ((f9Var.P0() == 2 || f9Var.P0() == 3 || f9Var.h2() == 1) && f9Var.E2() && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.L(f9Var, dVar) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.J(f9Var.Q0()))) {
            g4Var.c(mo79416xf806b362, 123, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572402b40), com.p314xaae8f345.mm.R.raw.f79868x8752620f);
        }
        if (!dVar.F()) {
            g4Var.c(mo79416xf806b362, 100, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
        }
        return true;
    }

    public static final boolean c(ze5.b6 b6Var, android.view.MenuItem menuItem, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        b6Var.getClass();
        if (menuItem.getItemId() == 118) {
            android.app.Activity g17 = dVar.g();
            if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.p(f9Var)) {
                db5.e1.y(g17, g17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fef), "", g17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_e), null);
            } else if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.q(f9Var)) {
                db5.e1.y(g17, g17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.feg), "", g17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_e), null);
            } else {
                android.content.Intent intent = new android.content.Intent(g17, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.class);
                intent.putExtra("Retr_Msg_content", c01.w9.l(dVar.D(), f9Var.j(), f9Var.A0()));
                intent.putExtra("Retr_Msg_Type", 8);
                intent.putExtra("Retr_Msg_Id", f9Var.m124847x74d37ac6());
                intent.putExtra("Retr_MsgTalker", f9Var.Q0());
                intent.putExtra("scene_from", 17);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemContactCardMvvm$Companion", "onSelectedLongClickMenu", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                dVar.a0((android.content.Intent) arrayList.get(0));
                yj0.a.f(dVar, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemContactCardMvvm$Companion", "onSelectedLongClickMenu", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
        return false;
    }
}
