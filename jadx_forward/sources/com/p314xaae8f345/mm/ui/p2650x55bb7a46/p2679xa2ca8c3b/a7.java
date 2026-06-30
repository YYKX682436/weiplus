package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public final class a7 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a7 f284818a = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a7();

    public static final void a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a7 a7Var, android.app.Activity activity, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        boolean z17;
        ot0.q v17;
        java.lang.String U1;
        a7Var.getClass();
        if (f9Var != null && (U1 = f9Var.U1()) != null) {
            if (U1.length() > 0) {
                z17 = true;
                if (z17 || (v17 = ot0.q.v(f9Var.U1())) == null) {
                }
                android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.class);
                intent.putExtra("Retr_Msg_Id", f9Var.m124847x74d37ac6());
                intent.putExtra("Retr_MsgTalker", f9Var.Q0());
                intent.putExtra("Retr_Msg_Type", 40);
                intent.putExtra("Multi_Retr", true);
                intent.putExtra("Retr_Msg_content", ot0.q.u(v17, null, null));
                intent.putExtra("Retr_go_to_chattingUI", false);
                intent.putExtra("Retr_show_success_tips", true);
                intent.putExtra("scene_from", 17);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderCollection", "retransmit", "(Landroid/app/Activity;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activity.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(activity, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderCollection", "retransmit", "(Landroid/app/Activity;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
            }
        }
        z17 = false;
        if (z17) {
        }
    }

    public final java.util.Map b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, java.lang.String username) {
        r45.ev2 ev2Var;
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        ot0.q v17 = ot0.q.v(msg.U1());
        zy2.g gVar = (zy2.g) v17.y(zy2.g.class);
        if (gVar == null || (ev2Var = gVar.f558916b) == null) {
            return null;
        }
        boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(msg.Q0());
        r45.fv2 fv2Var = r45.fv2.SingleChat;
        if (R4) {
            username = username + '-' + msg.Q0();
            fv2Var = r45.fv2.GroupChat;
            i17 = 3;
        } else {
            i17 = 2;
        }
        return kz5.c1.k(new jz5.l("share_src_username", username), new jz5.l("collection_id", pm0.v.u(ev2Var.m75942xfb822ef2(0))), new jz5.l("share_src_scene", java.lang.Integer.valueOf(fv2Var.f456153d)), new jz5.l("share_content_type", java.lang.Integer.valueOf(v17.f430199i == 119 ? 2 : 3)), new jz5.l("longpress_fav_scene", java.lang.Integer.valueOf(i17)), new jz5.l("finder_username", ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)));
    }

    public final void c(yb5.d ui6, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg) {
        zy2.g gVar;
        r45.ev2 ev2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        ot0.q v17 = ot0.q.v(msg.U1());
        if (v17 == null || (gVar = (zy2.g) v17.y(zy2.g.class)) == null || (ev2Var = gVar.f558916b) == null || ev2Var.m75942xfb822ef2(0) == 0) {
            return;
        }
        int i17 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(msg.Q0()) ? 3 : 2;
        int i18 = v17.f430199i;
        ya2.e1 e1Var = ya2.e1.f542005a;
        if (i18 == 119) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            android.app.Activity g17 = ui6.g();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getContext(...)");
            e1Var.u(g17, ev2Var, i17);
            return;
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        android.app.Activity g18 = ui6.g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g18, "getContext(...)");
        e1Var.n(g18, ev2Var, i17);
    }

    public final void d(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, java.lang.String username) {
        r45.ev2 ev2Var;
        long j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        ot0.q v17 = ot0.q.v(msg.U1());
        zy2.g gVar = (zy2.g) v17.y(zy2.g.class);
        if (gVar == null || (ev2Var = gVar.f558916b) == null) {
            return;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(msg.Q0())) {
            username = username + '-' + msg.Q0();
            j17 = 2;
        } else {
            j17 = 1;
        }
        long j18 = v17.f430199i == 119 ? 7L : 8L;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6482xaec7839c c6482xaec7839c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6482xaec7839c();
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        c6482xaec7839c.f138238d = c6482xaec7839c.b("SessionId", Ri, true);
        c6482xaec7839c.f138239e = j17;
        c6482xaec7839c.f138240f = j18;
        c6482xaec7839c.f138241g = c6482xaec7839c.b("SourceUsr", username, true);
        c6482xaec7839c.f138255u = c6482xaec7839c.b("collection_id", pm0.v.u(ev2Var.m75942xfb822ef2(0)), true);
        c6482xaec7839c.f138254t = ev2Var.m75939xb282bd08(13);
        c6482xaec7839c.f138256v = msg.mo78012x3fdd41df();
        c6482xaec7839c.f138257w = c6482xaec7839c.b("messageid", java.lang.String.valueOf(msg.I0()), true);
        c6482xaec7839c.k();
    }

    public final void e(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, java.lang.String str) {
        zy2.g gVar;
        r45.ev2 ev2Var;
        java.lang.String username = str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        ot0.q v17 = ot0.q.v(msg.U1());
        if (v17 == null || (gVar = (zy2.g) v17.y(zy2.g.class)) == null || (ev2Var = gVar.f558916b) == null) {
            return;
        }
        boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(msg.Q0());
        if (R4) {
            username = username + '-' + msg.Q0();
        }
        java.lang.String str2 = username;
        int i17 = R4 ? 2 : 1;
        int i18 = v17.f430199i == 119 ? 7 : 8;
        ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.m0.f206653d.c(i17, i18, str2, null, "", ev2Var.m75939xb282bd08(13), str2, pm0.v.u(ev2Var.m75942xfb822ef2(0)), msg.mo78012x3fdd41df(), pm0.v.u(msg.I0()));
    }
}
