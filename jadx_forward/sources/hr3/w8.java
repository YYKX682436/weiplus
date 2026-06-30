package hr3;

/* loaded from: classes9.dex */
public class w8 implements t25.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f365679d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f365680e = null;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f365681f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe f365682g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe f365683h;

    public w8(android.content.Context context) {
        this.f365679d = context;
    }

    @Override // t25.a
    public boolean Q(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetWxGame", "onAttach");
        this.f365681f = rVar;
        this.f365680e = z3Var;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar;
        h0Var.g(com.p314xaae8f345.mm.R.xml.f576393a4);
        this.f365682g = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h0Var.h("contact_info_wxgame_top");
        this.f365683h = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h0Var.h("contact_info_wxgame_not_disturb");
        b();
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetWxGame", "handleEvent, key: " + str);
        if (str == null) {
            return false;
        }
        str.getClass();
        char c17 = 65535;
        switch (str.hashCode()) {
            case -1884795432:
                if (str.equals("contact_info_wxgame_go_to")) {
                    c17 = 0;
                    break;
                }
                break;
            case -1342339903:
                if (str.equals("contact_info_wxgame_install")) {
                    c17 = 1;
                    break;
                }
                break;
            case -998595717:
                if (str.equals("contact_info_wxgame_top")) {
                    c17 = 2;
                    break;
                }
                break;
            case -841195146:
                if (str.equals("contact_info_wxgame_clear_data")) {
                    c17 = 3;
                    break;
                }
                break;
            case 77887290:
                if (str.equals("contact_info_wxgame_invite_friend")) {
                    c17 = 4;
                    break;
                }
                break;
            case 1039481017:
                if (str.equals("contact_info_wxgame_not_disturb")) {
                    c17 = 5;
                    break;
                }
                break;
            case 1094963909:
                if (str.equals("contact_info_wxgame_push_setting")) {
                    c17 = 6;
                    break;
                }
                break;
            case 2141869704:
                if (str.equals("contact_info_wxgame_uninstall")) {
                    c17 = 7;
                    break;
                }
                break;
        }
        android.content.Context context = this.f365679d;
        switch (c17) {
            case 0:
                if (context instanceof android.app.Activity) {
                    android.app.Activity activity = (android.app.Activity) context;
                    int intExtra = activity.getIntent().getIntExtra("key_wxgame_setting_from_scene", 0);
                    if (((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) ((m33.l1) i95.n0.c(m33.l1.class))).Ui()) {
                        if (intExtra == 3) {
                            activity.finish();
                        }
                    } else if (intExtra == 1) {
                        activity.finish();
                    }
                    return true;
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Chat_User", this.f365680e.d1());
                intent.putExtra("finish_direct", true);
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) ((m33.l1) i95.n0.c(m33.l1.class))).Ui()) {
                    intent.putExtra("game_plugun_click_time", java.lang.System.currentTimeMillis());
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) ((m33.l1) i95.n0.c(m33.l1.class))).hj(context, intent);
                } else {
                    j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
                }
                return true;
            case 1:
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iwq), true, true, null);
                Q.show();
                gm0.j1.d().a(30, new hr3.u8(this, Q));
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add("gh_25d9ac85a4bc");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(1);
                gm0.j1.d().g(new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3(1, arrayList, arrayList2, "", ""));
                return true;
            case 2:
                if (this.f365682g.N()) {
                    c01.e2.t0(this.f365680e.d1(), true, true);
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7129xc57f051c c7129xc57f051c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7129xc57f051c();
                    c7129xc57f051c.f144444d = 2L;
                    c7129xc57f051c.f144445e = 3L;
                    c7129xc57f051c.f144446f = c7129xc57f051c.b("BizContent", null, true);
                    c7129xc57f051c.k();
                } else {
                    c01.e2.B0(this.f365680e.d1(), true, true);
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7129xc57f051c c7129xc57f051c2 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7129xc57f051c();
                    c7129xc57f051c2.f144444d = 2L;
                    c7129xc57f051c2.f144445e = 4L;
                    c7129xc57f051c2.f144446f = c7129xc57f051c2.b("BizContent", null, true);
                    c7129xc57f051c2.k();
                }
                return true;
            case 3:
                db5.e1.A(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bcu), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571886sl), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new hr3.t8(this), null);
                return true;
            case 4:
                java.lang.String d17 = this.f365680e.d1();
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("Select_Talker_Name", this.f365680e.d1());
                intent2.putExtra("Select_block_List", d17);
                intent2.putExtra("Select_Conv_Type", 3);
                intent2.putExtra("Select_Send_Card", true);
                intent2.putExtra("mutil_select_is_ret", true);
                j45.l.v(context, ".ui.transmit.SelectConversationUI", intent2, 1);
                return true;
            case 5:
                boolean N = this.f365683h.N();
                a("mute", N);
                if (N) {
                    c01.e2.p0(this.f365680e, true);
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7129xc57f051c c7129xc57f051c3 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7129xc57f051c();
                    c7129xc57f051c3.f144444d = 3L;
                    c7129xc57f051c3.f144445e = 3L;
                    c7129xc57f051c3.f144446f = c7129xc57f051c3.b("BizContent", null, true);
                    c7129xc57f051c3.k();
                } else {
                    c01.e2.z0(this.f365680e, true);
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7129xc57f051c c7129xc57f051c4 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7129xc57f051c();
                    c7129xc57f051c4.f144444d = 3L;
                    c7129xc57f051c4.f144445e = 4L;
                    c7129xc57f051c4.f144446f = c7129xc57f051c4.b("BizContent", null, true);
                    c7129xc57f051c4.k();
                }
                return true;
            case 6:
                android.content.Intent intent3 = new android.content.Intent();
                intent3.setClassName(context, "com.tencent.mm.plugin.wxgamecard.ui.WxGamePushSettingUI");
                android.content.Context context2 = this.f365679d;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(intent3);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(context2, arrayList3.toArray(), "com/tencent/mm/plugin/profile/ui/ContactWidgetWxGame", "gotoPushSettingUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context2.startActivity((android.content.Intent) arrayList3.get(0));
                yj0.a.f(context2, "com/tencent/mm/plugin/profile/ui/ContactWidgetWxGame", "gotoPushSettingUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return true;
            case 7:
                db5.e1.A(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iws), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571886sl), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new hr3.v8(this), null);
                return true;
            default:
                return false;
        }
    }

    public final void a(java.lang.String str, boolean z17) {
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) ((m33.l1) i95.n0.c(m33.l1.class))).Ui()) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put(str, z17);
            } catch (org.json.JSONException unused) {
            }
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.k("wxalite7f2b757eb3c356d7b3d4291ded2f7743", "game.gamePluginDataChange", jSONObject);
        }
    }

    public final void b() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19708x15855336 c19708x15855336 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19708x15855336) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365681f).h("contact_info_wxgame_header_helper");
        c19708x15855336.M(this.f365680e.d1(), this.f365680e.f2(), this.f365679d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bji));
        if (!this.f365680e.r2()) {
            c19708x15855336.N(0);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365681f).m("contact_info_wxgame_install", false);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365681f).m("contact_info_wxgame_uninstall", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365681f).m("contact_info_wxgame_go_to", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365681f).m("contact_info_wxgame_invite_friend", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365681f).m("contact_info_wxgame_top", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365681f).m("contact_info_wxgame_not_disturb", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365681f).m("contact_info_wxgame_push_setting", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365681f).m("contact_info_wxgame_clear_data", true);
            return;
        }
        c19708x15855336.N(1);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365681f).m("contact_info_wxgame_install", true);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365681f).m("contact_info_wxgame_uninstall", false);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365681f).m("contact_info_wxgame_go_to", false);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365681f).m("contact_info_wxgame_invite_friend", false);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365681f).m("contact_info_wxgame_top", false);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365681f).m("contact_info_wxgame_not_disturb", false);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365681f).m("contact_info_wxgame_push_setting", false);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365681f).m("contact_info_wxgame_clear_data", false);
        this.f365682g.O(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().K(this.f365680e.d1()));
        this.f365683h.O(c01.e2.P(this.f365680e));
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
                ((dk5.s5) tg3.t1.a()).Di("gh_25d9ac85a4bc", str, com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str), null);
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetWxGame", "onDetach");
        return true;
    }
}
