package hr3;

/* loaded from: classes9.dex */
public class a8 implements t25.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f364919d;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f364921f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe f364922g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe f364923h;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f364920e = null;

    /* renamed from: i, reason: collision with root package name */
    public hr3.z7 f364924i = null;

    public a8(android.content.Context context) {
        this.f364919d = context;
    }

    @Override // t25.a
    public boolean Q(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetMiniShopHelper", "onAttach");
        this.f364921f = rVar;
        this.f364920e = z3Var;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar;
        h0Var.g(com.p314xaae8f345.mm.R.xml.f576383w);
        this.f364922g = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h0Var.h("contact_info_mini_shop_helper_top");
        this.f364923h = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h0Var.h("contact_info_mini_shop_helper_not_disturb");
        b();
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetMiniShopHelper", "handleEvent, key: " + str);
        if (str == null) {
            return false;
        }
        str.getClass();
        char c17 = 65535;
        switch (str.hashCode()) {
            case -2027998924:
                if (str.equals("contact_info_mini_shop_helper_go_to")) {
                    c17 = 0;
                    break;
                }
                break;
            case -1521942243:
                if (str.equals("contact_info_mini_shop_helper_install")) {
                    c17 = 1;
                    break;
                }
                break;
            case -1450872065:
                if (str.equals("contact_info_mini_shop_helper_help")) {
                    c17 = 2;
                    break;
                }
                break;
            case 154744730:
                if (str.equals("contact_info_mini_shop_helper_clear_data")) {
                    c17 = 3;
                    break;
                }
                break;
            case 1338682839:
                if (str.equals("contact_info_mini_shop_helper_top")) {
                    c17 = 4;
                    break;
                }
                break;
            case 1342712804:
                if (str.equals("contact_info_mini_shop_helper_uninstall")) {
                    c17 = 5;
                    break;
                }
                break;
            case 1848846101:
                if (str.equals("contact_info_mini_shop_helper_not_disturb")) {
                    c17 = 6;
                    break;
                }
                break;
        }
        android.content.Context context = this.f364919d;
        switch (c17) {
            case 0:
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Chat_User", this.f364920e.d1());
                intent.putExtra("finish_direct", true);
                j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
                a().a(1, 1);
                return true;
            case 1:
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iwq), true, true, null);
                Q.show();
                gm0.j1.d().a(30, new hr3.x7(this, Q));
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add("gh_579db1f2cf89");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(1);
                gm0.j1.d().g(new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3(1, arrayList, arrayList2, "", ""));
                return true;
            case 2:
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("rawUrl", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_minishop_plugin_helpcenter, "https://developers.weixin.qq.com/community/minihome/article/doc/000000208c8018662cda04cf35b813", true));
                intent2.putExtra("showShare", true);
                intent2.putExtra("allow_mix_content_mode", false);
                j45.l.j(context, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent2, null);
                a().a(5, 1);
                return true;
            case 3:
                db5.e1.A(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bcu), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571886sl), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new hr3.w7(this), null);
                return true;
            case 4:
                boolean N = this.f364922g.N();
                hr3.z7 a17 = a();
                a17.getClass();
                a17.a(3, N ? 2 : 3);
                if (N) {
                    c01.e2.t0(this.f364920e.d1(), true, true);
                } else {
                    c01.e2.B0(this.f364920e.d1(), true, true);
                }
                return true;
            case 5:
                db5.e1.A(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iws), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571886sl), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new hr3.y7(this), null);
                return true;
            case 6:
                boolean N2 = this.f364923h.N();
                hr3.z7 a18 = a();
                a18.getClass();
                a18.a(4, N2 ? 2 : 3);
                if (N2) {
                    c01.e2.p0(this.f364920e, true);
                } else {
                    c01.e2.z0(this.f364920e, true);
                }
                return true;
            default:
                return false;
        }
    }

    public final hr3.z7 a() {
        if (this.f364924i == null) {
            this.f364924i = new hr3.z7(null);
        }
        return this.f364924i;
    }

    public final void b() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19708x15855336 c19708x15855336 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19708x15855336) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f364921f).h("contact_info_mini_shop_helper_header_helper");
        c19708x15855336.M(this.f364920e.d1(), this.f364920e.f2(), this.f364919d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bf6));
        if (!this.f364920e.r2()) {
            c19708x15855336.N(0);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f364921f).m("contact_info_mini_shop_helper_install", false);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f364921f).m("contact_info_mini_shop_helper_uninstall", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f364921f).m("contact_info_mini_shop_helper_go_to", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f364921f).m("contact_info_mini_shop_helper_top", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f364921f).m("contact_info_mini_shop_helper_not_disturb", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f364921f).m("contact_info_mini_shop_helper_help", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f364921f).m("contact_info_mini_shop_helper_clear_data", true);
            return;
        }
        c19708x15855336.N(1);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f364921f).m("contact_info_mini_shop_helper_install", true);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f364921f).m("contact_info_mini_shop_helper_uninstall", false);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f364921f).m("contact_info_mini_shop_helper_go_to", false);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f364921f).m("contact_info_mini_shop_helper_top", false);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f364921f).m("contact_info_mini_shop_helper_not_disturb", false);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f364921f).m("contact_info_mini_shop_helper_help", false);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f364921f).m("contact_info_mini_shop_helper_clear_data", false);
        this.f364922g.O(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().K(this.f364920e.d1()));
        this.f364923h.O(c01.e2.P(this.f364920e));
    }

    @Override // t25.a
    /* renamed from: onActivityResult */
    public void mo67449x9d4787cb(int i17, int i18, android.content.Intent intent) {
    }

    @Override // t25.a
    /* renamed from: onDetach */
    public boolean mo67450x3f5eee52() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetMiniShopHelper", "onDetach");
        return true;
    }
}
