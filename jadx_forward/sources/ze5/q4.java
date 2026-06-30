package ze5;

/* loaded from: classes9.dex */
public final class q4 {
    public q4(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static final z01.z a(ze5.q4 q4Var, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        q4Var.getClass();
        z01.z zVar = new z01.z();
        l15.c cVar = new l15.c();
        java.lang.String j17 = f9Var.j();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(j17, "getContent(...)");
        cVar.m126728xdc93280d(j17);
        v05.b k17 = cVar.k();
        zVar.f550725d = k17 != null ? (u05.a) k17.m75936x14adae67(k17.f513848e + 60) : null;
        zVar.f550728g = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.h0(dVar, new ze5.p4(f9Var, dVar));
        return zVar;
    }

    public static final boolean b(ze5.q4 q4Var, db5.g4 g4Var, android.view.View view, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, yb5.d dVar) {
        u05.a aVar;
        q4Var.getClass();
        java.lang.Object tag = view.getTag();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = tag instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er ? (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) tag : null;
        if (erVar == null) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.q qVar = erVar.f285441d;
        int mo79416xf806b362 = qVar != null ? qVar.mo79416xf806b362() : 0;
        l15.c cVar = new l15.c();
        java.lang.String j17 = f9Var.j();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(j17, "getContent(...)");
        cVar.m126728xdc93280d(j17);
        v05.b k17 = cVar.k();
        if (k17 == null || (aVar = (u05.a) k17.m75936x14adae67(k17.f513848e + 60)) == null) {
            return false;
        }
        if (aVar.m167302x6c03c64c().length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemAppMsgPhotoAccountNameCardMvvm", "onCreateLongClickMenu, parse possible friend msg failed");
            return false;
        }
        int n17 = aVar.n();
        java.util.Set set = c01.e2.f118650a;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.D3(n17) || (f9Var.mo78013xfb85f7b0() != 66 && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(dVar.x()) && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.n4(dVar.x()))) {
            g4Var.c(mo79416xf806b362, 118, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574369i24), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
        }
        if (!f9Var.t2() && ((f9Var.P0() == 2 || f9Var.P0() == 3 || f9Var.h2() == 1) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.L(f9Var, dVar) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.J(f9Var.Q0()))) {
            g4Var.c(mo79416xf806b362, 123, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572402b40), com.p314xaae8f345.mm.R.raw.f79868x8752620f);
        }
        if (!dVar.F()) {
            g4Var.c(mo79416xf806b362, 100, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
        }
        return true;
    }

    public static final boolean c(ze5.q4 q4Var, android.view.MenuItem menuItem, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        q4Var.getClass();
        if (menuItem.getItemId() == 118) {
            android.app.Activity g17 = dVar.g();
            if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.p(f9Var)) {
                db5.e1.y(g17, g17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fef), "", g17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_e), null);
            } else if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.q(f9Var)) {
                db5.e1.y(g17, g17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.feg), "", g17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_e), null);
            } else {
                android.content.Intent intent = new android.content.Intent(g17, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.class);
                intent.putExtra("Retr_Msg_content", c01.w9.l(dVar.D(), f9Var.j(), f9Var.A0()));
                intent.putExtra("Retr_Msg_Type", 43);
                intent.putExtra("Retr_Msg_Id", f9Var.m124847x74d37ac6());
                intent.putExtra("Retr_MsgTalker", f9Var.Q0());
                intent.putExtra("scene_from", 17);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgPhotoAccountNameCardMvvm$Companion", "onSelectedLongClickMenu", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                dVar.a0((android.content.Intent) arrayList.get(0));
                yj0.a.f(dVar, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgPhotoAccountNameCardMvvm$Companion", "onSelectedLongClickMenu", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
        return false;
    }

    public final void d(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17, boolean z18, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg) {
        u05.a aVar;
        java.lang.String str3 = str;
        java.lang.String msgContent = str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgContent, "msgContent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgPhotoAccountNameCardMvvm", "dealClickPhotoAccountNameCardMsgEvent, fromUser:%s, groupChat:%s, recv:%s, msgType:%s,msgContent:%s", str3, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(msg.mo78013xfb85f7b0()), msgContent);
        if (z17 && z18) {
            msgContent = c01.w9.u(str2);
        }
        l15.c cVar = new l15.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(msgContent);
        cVar.m126728xdc93280d(msgContent);
        v05.b k17 = cVar.k();
        if (k17 == null || (aVar = (u05.a) k17.m75936x14adae67(k17.f513848e + 60)) == null) {
            return;
        }
        java.lang.String m167302x6c03c64c = aVar.m167302x6c03c64c();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.SessionOa.k(context, null)) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(m167302x6c03c64c, true);
            if (n17 != null && ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
                int h47 = ((uh4.c0) i95.n0.c(uh4.c0.class)).h4();
                if (h47 == 0 && !n17.r2()) {
                    ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(context);
                    ((qk.s6) gm0.j1.s(qk.s6.class)).U6(z17 ? 2 : 1, m167302x6c03c64c, aVar.m167298x8010e5e4());
                    return;
                } else if (h47 == 2) {
                    ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(context);
                    ((qk.s6) gm0.j1.s(qk.s6.class)).U6(z17 ? 2 : 1, m167302x6c03c64c, aVar.m167298x8010e5e4());
                    return;
                }
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", m167302x6c03c64c);
            intent.putExtra("Contact_Alias", aVar.j());
            intent.putExtra("Contact_Nick", aVar.m167298x8010e5e4());
            intent.putExtra("Contact_QuanPin", aVar.q());
            intent.putExtra("Contact_PyInitial", aVar.u());
            intent.putExtra("User_From_Fmessage", false);
            intent.putExtra("Contact_Scene", aVar.m167300x7520bed6());
            intent.putExtra("Contact_FMessageCard", true);
            intent.putExtra("Contact_VUser_Info_Flag", aVar.n());
            intent.putExtra("Contact_VUser_Info", aVar.o());
            intent.putExtra("Contact_BrandIconURL", aVar.k());
            intent.putExtra("Contact_Province", aVar.m167299x40fe68a6());
            intent.putExtra("Contact_City", aVar.m167296xfb7e01e1());
            intent.putExtra("Contact_Sex", aVar.m167301xb5886d30());
            intent.putExtra("Contact_Signature", aVar.w());
            intent.putExtra("Contact_ShowUserName", true);
            intent.putExtra("Contact_KSnsIFlag", 0);
            intent.putExtra("Contact_Source_FMessage", 17);
            intent.putExtra("source_from_user_name", str3);
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            intent.putExtra("source_from_nick_name", c01.a2.b(str));
            intent.putExtra("key_add_contact_openim_appid", aVar.r());
            intent.putExtra("key_forward_flag", (msg.F & 512) > 0);
            intent.putExtra("key_msg_id", msg.m124847x74d37ac6());
            intent.putExtra("key_msg_talker", msg.Q0());
            if ((aVar.n() & 8) > 0) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str3, true).k2()) {
                    intent.putExtra("Contact_Scene", 17);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10298, aVar.m167297xc0914d16() + ",17");
                } else {
                    intent.putExtra("Contact_Scene", 41);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10298, aVar.m167297xc0914d16() + ",41");
                }
            }
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(aVar.m167297xc0914d16()) && aVar.m167300x7520bed6() == 0) {
                intent.putExtra("Contact_Scene", 17);
            }
            int n18 = aVar.n();
            java.util.Set set = c01.e2.f118650a;
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.D3(n18)) {
                intent.putExtra("preChatTYPE", z17 ? 2 : 1);
                intent.putExtra("prePublishId", "msg_" + msg.I0());
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    str3 = c01.z1.r();
                }
                intent.putExtra("preUsername", str3);
                intent.putExtra("preChatName", msg.Q0());
            }
            j45.l.j(context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
        }
    }
}
