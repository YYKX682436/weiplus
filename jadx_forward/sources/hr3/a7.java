package hr3;

/* loaded from: classes9.dex */
public class a7 implements t25.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f364911d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f364912e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f364913f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f364914g;

    /* renamed from: i, reason: collision with root package name */
    public final hr3.i9 f364916i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f364917m = null;

    /* renamed from: n, reason: collision with root package name */
    public boolean f364918n = false;

    /* renamed from: h, reason: collision with root package name */
    public int f364915h = -1;

    public a7(android.content.Context context) {
        this.f364911d = context;
        this.f364916i = new hr3.b9(context);
    }

    @Override // t25.a
    public boolean Q(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17, int i17) {
        iz5.a.g(null, rVar != null);
        iz5.a.g(null, z3Var != null);
        iz5.a.g(null, com.p314xaae8f345.mm.p2621x8fb0427b.z3.Y3(z3Var.d1()));
        this.f364912e = rVar;
        this.f364913f = z17;
        this.f364914g = z3Var;
        if (this.f364915h == -1) {
            this.f364915h = c01.z1.p();
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar;
        h0Var.g(com.p314xaae8f345.mm.R.xml.f576378r);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h0Var.h("contact_info_recommend_qqfriends_to_me");
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe2 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h0Var.h("contact_info_recommend_mobilefriends_to_me");
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe3 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h0Var.h("contact_info_recommend_fbfriends_to_me");
        c21541x1c1b08fe2.O(!((this.f364915h & 256) != 0));
        c21541x1c1b08fe.O(!((this.f364915h & 128) != 0));
        c21541x1c1b08fe3.O((c01.z1.o() & 4) != 0);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16856x15855336) h0Var.h("contact_info_header_helper")).N(z3Var, this.f364916i);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) c01.d9.b().p().l(9, null)) != 0) {
            h0Var.v(h0Var.h("contact_info_bind_qq_entry"));
            h0Var.v(h0Var.h("contact_info_bind_qq_entry_tip"));
        } else {
            h0Var.v(c21541x1c1b08fe);
            if (!u11.c.d()) {
                h0Var.v(h0Var.h("contact_info_bind_qq_entry"));
                h0Var.v(h0Var.h("contact_info_bind_qq_entry_tip"));
            }
        }
        if (r61.q0.b() == js.x0.SUCC) {
            h0Var.v(h0Var.h("contact_info_bind_mobile_entry"));
            h0Var.v(h0Var.h("contact_info_bind_mobile_entry_tip"));
        } else {
            h0Var.v(c21541x1c1b08fe2);
            h0Var.h("contact_info_bind_mobile_entry").G(com.p314xaae8f345.mm.R.C30867xcad56011.ipy);
        }
        if ((c01.z1.n() & 8192) == 0) {
            boolean u17 = c01.z1.u();
            h0Var.v(c21541x1c1b08fe3);
            if (u17) {
                h0Var.h("contact_info_bind_fb_entry").G(com.p314xaae8f345.mm.R.C30867xcad56011.bde);
            } else {
                h0Var.h("contact_info_bind_fb_entry").G(com.p314xaae8f345.mm.R.C30867xcad56011.ipy);
            }
        } else {
            h0Var.v(h0Var.h("contact_info_bind_fb_entry"));
            h0Var.v(h0Var.h("contact_info_bind_fb_entry_tip"));
            h0Var.v(c21541x1c1b08fe3);
        }
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if ((str == null ? "" : str).length() <= 0) {
            return false;
        }
        if (str.equals("contact_info_recommend_qqfriends_to_me")) {
            a(!((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f364912e).h("contact_info_recommend_qqfriends_to_me")).N(), 128, 6);
            return true;
        }
        if (str.equals("contact_info_recommend_mobilefriends_to_me")) {
            a(!((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f364912e).h("contact_info_recommend_mobilefriends_to_me")).N(), 256, 7);
            return true;
        }
        if (str.equals("contact_info_recommend_fbfriends_to_me")) {
            boolean N = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f364912e).h("contact_info_recommend_fbfriends_to_me")).N();
            int o17 = c01.z1.o();
            c01.d9.b().p().w(40, java.lang.Integer.valueOf(N ? o17 | 4 : o17 & (-5)));
            ((e21.z0) c01.d9.b().w()).c(new e21.o(18, N ? 1 : 2));
            return true;
        }
        boolean equals = str.equals("contact_info_view_message");
        android.content.Context context = this.f364911d;
        if (equals) {
            android.content.Intent intent = new android.content.Intent();
            if (this.f364913f) {
                intent.putExtra("Chat_User", this.f364914g.d1());
                intent.putExtra("Chat_Mode", 1);
                intent.addFlags(67108864);
                android.app.Activity activity = (android.app.Activity) context;
                activity.setResult(-1, intent);
                activity.finish();
            } else {
                intent.putExtra("Chat_User", this.f364914g.d1());
                intent.putExtra("Chat_Mode", 1);
                intent.addFlags(67108864);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.j(intent, context);
                ((android.app.Activity) context).finish();
            }
            return true;
        }
        if (str.equals("contact_info_bind_mobile_entry")) {
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.g(new android.content.Intent(), context, -1);
            return true;
        }
        if (str.equals("contact_info_bind_qq_entry")) {
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.i(new android.content.Intent(), context);
            return true;
        }
        if (str.equals("contact_info_bind_fb_entry")) {
            j45.l.j(context, "account", ".ui.FacebookAuthUI", new android.content.Intent(), null);
            return true;
        }
        if (!str.equals("contact_info_fmessage_clear_data")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactWidgetFMessage", "handleEvent : unExpected key = ".concat(str));
            return false;
        }
        android.content.Context context2 = this.f364911d;
        db5.e1.A(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bcu), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571886sl), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new hr3.x6(this), null);
        return true;
    }

    public final void a(boolean z17, int i17, int i18) {
        if (z17) {
            this.f364915h = i17 | this.f364915h;
        } else {
            this.f364915h = (~i17) & this.f364915h;
        }
        c01.d9.b().p().w(7, java.lang.Integer.valueOf(this.f364915h));
        ((e21.z0) c01.d9.b().w()).c(new e21.o(i18, z17 ? 1 : 2));
    }

    @Override // t25.a
    /* renamed from: onActivityResult */
    public void mo67449x9d4787cb(int i17, int i18, android.content.Intent intent) {
    }

    @Override // t25.a
    /* renamed from: onDetach */
    public boolean mo67450x3f5eee52() {
        hr3.i9 i9Var;
        ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Zi();
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16856x15855336 c16856x15855336 = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16856x15855336) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f364912e).h("contact_info_header_helper");
        if (c16856x15855336 == null || (i9Var = c16856x15855336.R) == null) {
            return true;
        }
        i9Var.mo133943x3f5eee52();
        return true;
    }
}
