package s02;

/* loaded from: classes9.dex */
public class g implements t25.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f483487d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f483488e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f483489f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f483490g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe f483491h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe f483492i;

    public g(android.content.Context context) {
        this.f483487d = context;
    }

    @Override // t25.a
    public boolean Q(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17, int i17) {
        this.f483489f = rVar;
        this.f483488e = z3Var;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar;
        h0Var.g(com.p314xaae8f345.mm.R.xml.f576375o);
        this.f483491h = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h0Var.h("contact_info_top_downloader");
        this.f483492i = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h0Var.h("contact_info_not_disturb");
        b();
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        boolean equals = "contact_info_go_to_downloader".equals(str);
        android.content.Context context = this.f483487d;
        if (equals) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Chat_User", this.f483488e.d1());
            intent.putExtra("finish_direct", true);
            j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
            return true;
        }
        if ("contact_info_downloader_manager".equals(str)) {
            ((l02.q) ((m02.s) i95.n0.c(m02.s.class))).Ri(context, null, null);
            return true;
        }
        if ("contact_info_common_problem".equals(str)) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("KPublisherId", "custom_menu");
            intent2.putExtra("pre_username", this.f483488e.d1());
            intent2.putExtra("prePublishId", "custom_menu");
            intent2.putExtra("preUsername", this.f483488e.d1());
            intent2.putExtra("preChatName", this.f483488e.d1());
            intent2.putExtra("preChatTYPE", c01.h2.a(this.f483488e.d1(), this.f483488e.d1()));
            intent2.putExtra("rawUrl", "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyn) + "/cgi-bin/mmsupport-bin/readtemplate?t=wechat_movement_faq/index");
            intent2.putExtra("geta8key_username", this.f483488e.d1());
            intent2.putExtra("from_scence", 1);
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent2, null);
            return true;
        }
        if ("contact_info_top_downloader".equals(str)) {
            if (this.f483491h.N()) {
                c01.e2.t0(this.f483488e.d1(), true, true);
            } else {
                c01.e2.B0(this.f483488e.d1(), true, true);
            }
            return true;
        }
        if ("contact_info_not_disturb".equals(str)) {
            if (this.f483492i.N()) {
                c01.e2.p0(this.f483488e, true);
            } else {
                c01.e2.z0(this.f483488e, true);
            }
            return true;
        }
        if ("contact_info_clear_data".equals(str)) {
            android.content.Context context2 = this.f483487d;
            db5.e1.A(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bcu), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571886sl), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new s02.a(this), null);
            return true;
        }
        if ("contact_info_downloader_install".equals(str)) {
            a(context, true);
            return true;
        }
        if (!"contact_info_downloader_uninstall".equals(str)) {
            return false;
        }
        ((l02.q) ((m02.s) i95.n0.c(m02.s.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.s0.d();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.s0.f178862a.size() > 0) {
            android.content.Context context3 = this.f483487d;
            db5.e1.A(context3, context3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bsr), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bss), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bsq), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bse), new s02.b(this), new s02.c(this));
        } else {
            android.content.Context context4 = this.f483487d;
            db5.e1.A(context4, context4.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iws), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571886sl), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new s02.d(this), null);
        }
        return true;
    }

    public final void a(android.content.Context context, boolean z17) {
        gm0.j1.e().j(new s02.f(this, z17, db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), context.getString(z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.iwq : com.p314xaae8f345.mm.R.C30867xcad56011.iww), true, true, null), context));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean, int] */
    public final void b() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19708x15855336 c19708x15855336 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19708x15855336) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f483489f).h("contact_info_header_helper");
        c19708x15855336.M(this.f483488e.d1(), this.f483488e.g2(), this.f483487d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bsa));
        ?? r17 = (c01.z1.n() & 134217728) == 0 ? 1 : 0;
        this.f483490g = r17;
        c19708x15855336.N(r17);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f483489f).m("contact_info_downloader_install", this.f483490g);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f483489f).m("contact_info_downloader_uninstall", !this.f483490g);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f483489f).m("contact_info_go_to_downloader", !this.f483490g);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f483489f).m("contact_info_downloader_manager", !this.f483490g);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f483489f).m("contact_info_common_problem", true);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f483489f).m("contact_info_top_downloader", !this.f483490g);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f483489f).m("contact_info_not_disturb", !this.f483490g);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f483489f).m("contact_info_clear_data", !this.f483490g);
        if (this.f483490g) {
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().K(this.f483488e.d1())) {
                this.f483491h.O(true);
            } else {
                this.f483491h.O(false);
            }
            if (c01.e2.P(this.f483488e)) {
                this.f483492i.O(true);
            } else {
                this.f483492i.O(false);
            }
        }
    }

    @Override // t25.a
    /* renamed from: onActivityResult */
    public void mo67449x9d4787cb(int i17, int i18, android.content.Intent intent) {
    }

    @Override // t25.a
    /* renamed from: onDetach */
    public boolean mo67450x3f5eee52() {
        return true;
    }
}
