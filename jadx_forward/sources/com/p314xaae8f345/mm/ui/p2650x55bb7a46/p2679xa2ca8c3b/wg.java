package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public abstract class wg {
    public static void a(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17, boolean z18, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.lang.String str3 = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemCard", "dealClickCardMsgEvent, fromUser:%s, groupChat:%s, recv:%s, msgType:%s,msgContent:%s", str3, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(f9Var.mo78013xfb85f7b0()), str2);
        com.p314xaae8f345.mm.p2621x8fb0427b.y8 D3 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).D3((z17 && z18) ? c01.w9.u(str2) : str2);
        java.lang.String str4 = D3.f277891a;
        if ((com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str4) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.q4(str4)) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.GlobalWeCom.k(context, null)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        int i17 = D3.f277907q;
        java.util.Set set = c01.e2.f118650a;
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.D3(i17)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.A(1430, 0);
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str4, true);
            if (n17 == null || !n17.r2()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.u7 y07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.w7) c01.d9.b().t()).y0(str4);
                if (y07 == null || x51.t1.b(y07.f66599xdec927b)) {
                    if (y07 == null || x51.t1.b(y07.f66597xdd77ad16)) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.u7 u7Var = new com.p314xaae8f345.mm.p2621x8fb0427b.u7();
                        u7Var.f66597xdd77ad16 = str4 == null ? "" : str4;
                        u7Var.f66598x15b870c = java.lang.System.currentTimeMillis();
                        u7Var.f66598x15b870c = java.lang.System.currentTimeMillis();
                        if (!((com.p314xaae8f345.mm.p2621x8fb0427b.w7) c01.d9.b().t()).mo11260x413cb2b4(u7Var)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemCard", "add friendUser fail, encryptUsername:%s", str4);
                        }
                    }
                    intent.putExtra("force_get_contact", true);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemCard", "need to get contact to judge if Friend, KForceGetContact is true");
                    g0Var.A(1430, 3);
                } else {
                    str4 = y07.f66599xdec927b;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemCard", "find in FriendUser Map, friend:%s", n17.d1());
                    g0Var.A(1430, 2);
                }
            } else {
                str4 = n17.d1();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemCard", "find in contact, friend:%s", n17.d1());
                g0Var.A(1430, 1);
            }
        } else {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.SessionOa.k(context, null)) {
                return;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n18 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str4, true);
            if (n18 != null && ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
                int h47 = ((uh4.c0) i95.n0.c(uh4.c0.class)).h4();
                if (h47 == 0 && !n18.r2()) {
                    ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(context);
                    ((qk.s6) gm0.j1.s(qk.s6.class)).U6(z17 ? 2 : 1, str4, D3.f277892b);
                    return;
                } else if (h47 == 2) {
                    ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(context);
                    ((qk.s6) gm0.j1.s(qk.s6.class)).U6(z17 ? 2 : 1, str4, D3.f277892b);
                    return;
                } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.P4(n18.d1())) {
                    ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(context);
                    ((qk.s6) gm0.j1.s(qk.s6.class)).U6(z17 ? 2 : 1, str4, D3.f277892b);
                    return;
                }
            }
        }
        java.lang.String str5 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.L3(D3.D) ? D3.D : com.p314xaae8f345.mm.p2621x8fb0427b.z3.L3(str4) ? str4 : null;
        if (!android.text.TextUtils.isEmpty(str5)) {
            ((vh0.f3) ((vh0.n1) i95.n0.c(vh0.n1.class))).aj(context, 14, str5, false, null, null);
            return;
        }
        intent.putExtra("Contact_User", str4);
        intent.putExtra("Contact_Alias", D3.f277893c);
        intent.putExtra("Contact_Nick", D3.f277892b);
        intent.putExtra("Contact_QuanPin", D3.f277894d);
        intent.putExtra("Contact_PyInitial", D3.f277895e);
        intent.putExtra("Contact_Uin", D3.f277900j);
        intent.putExtra("Contact_Mobile_MD5", D3.f277898h);
        intent.putExtra("Contact_full_Mobile_MD5", D3.f277899i);
        intent.putExtra("Contact_QQNick", D3.g());
        intent.putExtra("User_From_Fmessage", false);
        intent.putExtra("Contact_Scene", D3.f277897g);
        intent.putExtra("Contact_FMessageCard", true);
        intent.putExtra("Contact_RemarkName", D3.f277902l);
        intent.putExtra("Contact_VUser_Info_Flag", D3.f277907q);
        intent.putExtra("Contact_VUser_Info", D3.f277908r);
        intent.putExtra("Contact_BrandIconURL", D3.f277909s);
        intent.putExtra("Contact_Province", D3.f());
        intent.putExtra("Contact_City", D3.b());
        intent.putExtra("Contact_Sex", D3.f277905o);
        intent.putExtra("Contact_Signature", D3.f277906p);
        intent.putExtra("Contact_ShowUserName", true);
        intent.putExtra("Contact_KSnsIFlag", 0);
        intent.putExtra("Contact_Source_FMessage", 17);
        intent.putExtra("source_from_user_name", str3);
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        intent.putExtra("source_from_nick_name", c01.a2.b(str));
        intent.putExtra("AntispamTicket", D3.f277915y);
        intent.putExtra("key_add_contact_openim_appid", D3.f277916z);
        intent.putExtra("key_add_contact_custom_detail", D3.B);
        intent.putExtra("key_forward_flag", (f9Var.F & 512) > 0);
        intent.putExtra("key_msg_id", f9Var.m124847x74d37ac6());
        intent.putExtra("key_msg_talker", f9Var.Q0());
        if ((D3.f277907q & 8) > 0) {
            if (x51.t1.b(str) || !((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str3, true).k2()) {
                intent.putExtra("Contact_Scene", 17);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10298, D3.f277891a + ",17");
            } else {
                intent.putExtra("Contact_Scene", 41);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10298, D3.f277891a + ",41");
            }
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(D3.f277891a) && D3.f277897g == 0) {
            intent.putExtra("Contact_Scene", 17);
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.D3(D3.f277907q)) {
            if (z17) {
                intent.putExtra("preChatTYPE", 2);
            } else {
                intent.putExtra("preChatTYPE", 1);
            }
            intent.putExtra("prePublishId", "msg_" + f9Var.I0());
            if (x51.t1.b(str)) {
                str3 = c01.z1.r();
            }
            intent.putExtra("preUsername", str3);
            intent.putExtra("preChatName", f9Var.Q0());
        }
        j45.l.j(context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
        k45.a.a(D3.f277897g);
    }
}
