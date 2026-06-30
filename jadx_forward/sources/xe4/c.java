package xe4;

/* loaded from: classes9.dex */
public class c implements t25.a, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String f535501m = "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyn) + "/cgi-bin/mmsupport-bin/readtemplate?t=wechat_movement_faq/index";

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f535502d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f535503e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f535504f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe f535505g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe f535506h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f535507i;

    public c(android.content.Context context) {
        this.f535502d = context;
    }

    @Override // t25.a
    public boolean Q(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17, int i17) {
        this.f535504f = rVar;
        this.f535503e = z3Var;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar;
        h0Var.g(com.p314xaae8f345.mm.R.xml.f576390a1);
        this.f535505g = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h0Var.h("contact_info_top_sport");
        this.f535506h = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h0Var.h("contact_info_not_disturb");
        a();
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        boolean equals = "contact_info_record_data".equals(str);
        android.content.Context context = this.f535502d;
        if (equals) {
            android.content.Intent intent = new android.content.Intent();
            intent.setClassName(context, "com.tencent.mm.plugin.exdevice.ui.ExdeviceRankDataSourceUI");
            android.content.Context context2 = this.f535502d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/sport/ui/widget/ContactWidgetSport", "handleEvent", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context2, "com/tencent/mm/plugin/sport/ui/widget/ContactWidgetSport", "handleEvent", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if ("contact_info_top_sport".equals(str)) {
            if (this.f535505g.N()) {
                ve4.g.a(20);
                c01.e2.t0(this.f535503e.d1(), true, true);
            } else {
                ve4.g.a(21);
                c01.e2.B0(this.f535503e.d1(), true, true);
            }
        } else if ("contact_info_not_disturb".equals(str)) {
            if (this.f535506h.N()) {
                ve4.g.a(22);
                c01.e2.p0(this.f535503e, true);
            } else {
                ve4.g.a(23);
                c01.e2.z0(this.f535503e, true);
            }
        } else if ("contact_info_go_to_sport".equals(str)) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Chat_User", this.f535503e.d1());
            intent2.putExtra("finish_direct", true);
            j45.l.u(context, ".ui.chatting.ChattingUI", intent2, null);
            ve4.g.a(19);
        } else if ("contact_info_go_to_my_profile".equals(str)) {
            java.lang.String r17 = c01.z1.r();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sport.ContactWidgetSport", "Get username from UserInfo return null or nil.");
                return false;
            }
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra(dm.i4.f66875xa013b0d5, r17);
            j45.l.j(context, "exdevice", ".ui.ExdeviceProfileUI", intent3, null);
            ve4.g.a(3);
        } else if ("contact_info_invite_friend".equals(str)) {
            android.content.Intent intent4 = new android.content.Intent();
            intent4.putExtra("Select_Talker_Name", this.f535503e.d1());
            intent4.putExtra("Select_block_List", this.f535503e.d1());
            intent4.putExtra("Select_Conv_Type", 3);
            intent4.putExtra("Select_Send_Card", true);
            intent4.putExtra("mutil_select_is_ret", true);
            j45.l.v(context, ".ui.transmit.SelectConversationUI", intent4, 1);
            ve4.g.a(4);
        } else if ("contact_info_common_problem".equals(str)) {
            android.content.Intent intent5 = new android.content.Intent();
            intent5.putExtra("KPublisherId", "custom_menu");
            intent5.putExtra("pre_username", this.f535503e.d1());
            intent5.putExtra("prePublishId", "custom_menu");
            intent5.putExtra("preUsername", this.f535503e.d1());
            intent5.putExtra("preChatName", this.f535503e.d1());
            intent5.putExtra("preChatTYPE", c01.h2.a(this.f535503e.d1(), this.f535503e.d1()));
            intent5.putExtra("rawUrl", f535501m);
            intent5.putExtra("geta8key_username", this.f535503e.d1());
            intent5.putExtra("from_scence", 1);
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent5, null);
            ve4.g.a(5);
        } else if ("contact_info_privacy_and_notification".equals(str)) {
            j45.l.h(context, "exdevice", ".ui.ExdeviceSettingUI");
        } else if ("contact_info_sport_install".equals(str)) {
            ve4.g.a(13);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iwq), true, true, null);
            this.f535507i = Q;
            Q.show();
            c01.d9.e().a(30, this);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add("gh_43f2581f6fd6");
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            linkedList2.add(1);
            c01.d9.e().g(new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3(1, linkedList, linkedList2, "", ""));
            com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.t.b(true);
        } else if ("contact_info_sport_uninstall".equals(str)) {
            ve4.g.a(14);
            db5.e1.A(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iws), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571886sl), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new xe4.b(this), null);
        } else if ("contact_info_clear_data".equals(str)) {
            android.content.Context context3 = this.f535502d;
            db5.e1.A(context3, context3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bcu), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571886sl), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new xe4.a(this), null);
        }
        return false;
    }

    public final void a() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19708x15855336 c19708x15855336 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19708x15855336) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f535504f).h("contact_info_header_helper");
        c19708x15855336.M(this.f535503e.d1(), this.f535503e.g2(), this.f535502d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bir));
        if (!this.f535503e.r2()) {
            c19708x15855336.N(0);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f535504f).m("contact_info_sport_install", false);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f535504f).m("contact_info_sport_uninstall", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f535504f).m("contact_info_go_to_sport", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f535504f).m("contact_info_go_to_my_profile", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f535504f).m("contact_info_invite_friend", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f535504f).m("contact_info_common_problem", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f535504f).m("contact_info_record_data", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f535504f).m("contact_info_privacy_and_notification", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f535504f).m("contact_info_top_sport", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f535504f).m("contact_info_not_disturb", true);
            return;
        }
        c19708x15855336.N(1);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f535504f).m("contact_info_sport_install", true);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f535504f).m("contact_info_sport_uninstall", false);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f535504f).m("contact_info_go_to_sport", false);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f535504f).m("contact_info_go_to_my_profile", false);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f535504f).m("contact_info_invite_friend", false);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f535504f).m("contact_info_common_problem", false);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f535504f).m("contact_info_record_data", false);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f535504f).m("contact_info_privacy_and_notification", false);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f535504f).m("contact_info_top_sport", false);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f535504f).m("contact_info_not_disturb", false);
        if (((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).K(this.f535503e.d1())) {
            this.f535505g.O(true);
        } else {
            this.f535505g.O(false);
        }
        if (c01.e2.P(this.f535503e)) {
            this.f535506h.O(true);
        } else {
            this.f535506h.O(false);
        }
    }

    @Override // t25.a
    /* renamed from: onActivityResult */
    public void mo67449x9d4787cb(int i17, int i18, android.content.Intent intent) {
        if (i18 == -1 && i17 == 1 && intent != null) {
            java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(intent.getStringExtra("received_card_name").split(","));
            java.lang.String stringExtra = intent.getStringExtra("custom_send_text");
            java.util.Iterator it = P1.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                ((dk5.s5) tg3.t1.a()).Di("gh_43f2581f6fd6", str, com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str), null);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5990xd50ae361 c5990xd50ae361 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5990xd50ae361();
                    am.mt mtVar = c5990xd50ae361.f136285g;
                    mtVar.f88895a = str;
                    mtVar.f88896b = stringExtra;
                    mtVar.f88897c = c01.e2.C(str);
                    mtVar.f88898d = 0;
                    c5990xd50ae361.e();
                }
            }
        }
    }

    @Override // t25.a
    /* renamed from: onDetach */
    public boolean mo67450x3f5eee52() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        qk.o oVar;
        if (m1Var instanceof com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3) {
            c01.d9.e().q(30, this);
            if (i17 == 0 && i18 == 0) {
                java.lang.String J2 = ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3) m1Var).J();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.ContactWidgetSport", "bind fitness contact %s success", J2);
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n("gh_43f2581f6fd6", true);
                if (n17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(J2)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sport.ContactWidgetSport", "respUsername == " + J2 + ", contact = " + n17);
                } else {
                    if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.E4(n17.d1())) {
                        java.lang.String d17 = n17.d1();
                        if (d17 == null) {
                            d17 = "";
                        }
                        oVar = r01.z.b(d17);
                        if (oVar != null) {
                            oVar.f66748xdec927b = J2;
                        }
                        r01.q3.cj().d(d17);
                        n17.K1(d17);
                    } else {
                        oVar = null;
                    }
                    n17.X1(J2);
                    if (((int) n17.E2) == 0) {
                        ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).i0(n17);
                    }
                    if (((int) n17.E2) <= 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sport.ContactWidgetSport", "addContact : insert contact failed");
                    } else {
                        c01.e2.m0(n17);
                        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n18 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(n17.d1(), true);
                        if (oVar != null) {
                            r01.q3.cj().mo880xb970c2b9(oVar);
                        } else {
                            qk.o b17 = r01.z.b(n18.d1());
                            if (b17 == null || b17.U0()) {
                                c01.n8.a().c(n18.d1(), 21);
                                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).bj(n18.d1());
                            } else if (n18.X4()) {
                                c01.n8.a().c(n18.d1(), 21);
                                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).bj(n18.d1());
                            }
                        }
                    }
                }
                r01.q3.cj().mo11260x413cb2b4(r01.q3.cj().b1(n17.d1()));
                c01.d9.b().p().w(327825, java.lang.Boolean.TRUE);
                rn3.i.Di().h(3, 1, 0, "", null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTips.NewTipsManager", "dancy register local newtips, tipsId:%s, tipsVersion:%s, key:%s", 3, 1, "");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sport.ContactWidgetSport", "errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
                if (i17 == 4 && ((i18 == -2 || i18 == -101 || i18 == -24) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str))) {
                    dp.a.m125854x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str, 1).show();
                }
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f535507i;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            a();
        }
    }
}
