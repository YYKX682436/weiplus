package hr3;

/* loaded from: classes9.dex */
public final class g8 implements t25.b {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f365111d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f365112e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f365113f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe f365114g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe f365115h;

    public g8(android.app.Activity context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f365111d = context;
    }

    @Override // t25.a
    public boolean Q(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17, int i17) {
        er3.c.f337555f.c();
        this.f365112e = z3Var;
        this.f365113f = rVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAttach: contact=");
        java.lang.Object obj = z3Var;
        if (z3Var == null) {
            obj = "?";
        }
        sb6.append(obj);
        sb6.append(", readonly=");
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetQQAssistant", sb6.toString());
        if (rVar != null) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).g(com.p314xaae8f345.mm.R.xml.f576384df);
        }
        this.f365114g = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) (rVar != null ? ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).h("contact_info_qqassistant_top") : null);
        this.f365115h = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) (rVar != null ? ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).h("contact_info_qqassistant_not_disturb") : null);
        a();
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetQQAssistant", "handleEvent " + str);
        boolean equals = "contact_info_qqassistant_view_msg".equals(str);
        android.app.Activity activity = this.f365111d;
        if (equals) {
            android.content.Intent intent = new android.content.Intent();
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f365112e;
            intent.putExtra("Chat_User", z3Var != null ? z3Var.d1() : null);
            j45.l.u(activity, ".ui.chatting.ChattingUI", intent, null);
        } else if ("contact_info_qqassistant_top".equals(str)) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = this.f365114g;
            if (c21541x1c1b08fe != null && c21541x1c1b08fe.N()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = this.f365112e;
                c01.e2.t0(z3Var2 != null ? z3Var2.d1() : null, true, true);
            } else {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var3 = this.f365112e;
                c01.e2.B0(z3Var3 != null ? z3Var3.d1() : null, true, true);
            }
        } else if ("contact_info_qqassistant_not_disturb".equals(str)) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe2 = this.f365115h;
            if (c21541x1c1b08fe2 != null && c21541x1c1b08fe2.N()) {
                c01.e2.p0(this.f365112e, true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetQQAssistant", "Set Mute");
            } else {
                c01.e2.z0(this.f365112e, true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetQQAssistant", "Set to UnMute");
            }
        } else if ("contact_info_qqassistant_uninstall".equals(str)) {
            db5.e1.A(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iws), "", activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571886sl), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new hr3.f8(this), null);
        } else if ("contact_info_qqassistant_install".equals(str)) {
            r45.zl3 a17 = er3.c.f337555f.a();
            java.lang.String str2 = a17 != null ? a17.f473726d : null;
            java.lang.String str3 = a17 != null ? a17.f473729g : null;
            java.lang.String str4 = a17 != null ? a17.f473727e : null;
            if (!(str2 == null)) {
                if (!(str3 == null)) {
                    if (!(str4 == null)) {
                        java.lang.String v17 = r26.i0.v(str3, "{weapp_param}", str4, false, 4, null);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetQQAssistant", "jump to:" + str2 + " pathWithParam: " + v17);
                        try {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
                            c12559xbdae8559.f169323f = 1035;
                            c12559xbdae8559.f169324g = "gh_051d9102de63";
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).Vi(this.f365111d, "", str2.toString(), j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20306x9e512605()) == 1 ? 2 : 0, 0, v17, c12559xbdae8559, "");
                        } catch (java.lang.Throwable th6) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactWidgetQQAssistant", "Error when jumpToBind: " + th6);
                        }
                        a();
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactWidgetQQAssistant", "need path or appID.");
            a();
        } else if ("contact_info_clear_data".equals(str)) {
            android.app.Activity activity2 = this.f365111d;
            db5.e1.A(activity2, activity2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bcu), "", activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571886sl), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), hr3.e8.f365050d, null);
        }
        return false;
    }

    public final void a() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar = this.f365113f;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19708x15855336 c19708x15855336 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19708x15855336) (rVar != null ? ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).h("contact_info_header_helper") : null);
        if (c19708x15855336 != null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f365112e;
            java.lang.String d17 = z3Var != null ? z3Var.d1() : null;
            if (d17 == null) {
                d17 = "?";
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = this.f365112e;
            java.lang.String g27 = z3Var2 != null ? z3Var2.g2() : null;
            if (g27 == null) {
                g27 = "?";
            }
            c19708x15855336.M(d17, g27, this.f365111d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nbe));
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var3 = this.f365112e;
        boolean z17 = z3Var3 != null && z3Var3.r2();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateProfile: username=");
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var4 = this.f365112e;
        java.lang.String d18 = z3Var4 != null ? z3Var4.d1() : null;
        if (d18 == null) {
            d18 = "?";
        }
        sb6.append(d18);
        sb6.append(" Display=");
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var5 = this.f365112e;
        java.lang.String g28 = z3Var5 != null ? z3Var5.g2() : null;
        sb6.append(g28 != null ? g28 : "?");
        sb6.append(" enable=");
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetQQAssistant", sb6.toString());
        if (!z17) {
            if (c19708x15855336 != null) {
                c19708x15855336.N(0);
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar2 = this.f365113f;
            if (rVar2 != null) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar2).m("contact_info_qqassistant_view_msg", true);
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar3 = this.f365113f;
            if (rVar3 != null) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar3).m("contact_info_qqassistant_top", true);
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar4 = this.f365113f;
            if (rVar4 != null) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar4).m("contact_info_qqassistant_not_disturb", true);
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar5 = this.f365113f;
            if (rVar5 != null) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar5).m("contact_info_clear_data", true);
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar6 = this.f365113f;
            if (rVar6 != null) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar6).m("contact_info_qqassistant_install", false);
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar7 = this.f365113f;
            if (rVar7 != null) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar7).m("contact_info_qqassistant_uninstall", true);
                return;
            }
            return;
        }
        if (c19708x15855336 != null) {
            c19708x15855336.N(1);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar8 = this.f365113f;
        if (rVar8 != null) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar8).m("contact_info_qqassistant_view_msg", false);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar9 = this.f365113f;
        if (rVar9 != null) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar9).m("contact_info_qqassistant_top", false);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar10 = this.f365113f;
        if (rVar10 != null) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar10).m("contact_info_qqassistant_not_disturb", false);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar11 = this.f365113f;
        if (rVar11 != null) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar11).m("contact_info_clear_data", false);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar12 = this.f365113f;
        if (rVar12 != null) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar12).m("contact_info_qqassistant_install", true);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar13 = this.f365113f;
        if (rVar13 != null) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar13).m("contact_info_qqassistant_uninstall", false);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.l8 r17 = c01.d9.b().r();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var6 = this.f365112e;
        java.lang.String d19 = z3Var6 != null ? z3Var6.d1() : null;
        if (d19 == null) {
            d19 = "";
        }
        if (((com.p314xaae8f345.mm.p2621x8fb0427b.m4) r17).K(d19)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetQQAssistant", "updateProfile: is placed top");
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = this.f365114g;
            if (c21541x1c1b08fe != null) {
                c21541x1c1b08fe.O(true);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetQQAssistant", "updateProfile: is not placed top");
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe2 = this.f365114g;
            if (c21541x1c1b08fe2 != null) {
                c21541x1c1b08fe2.O(false);
            }
        }
        if (c01.e2.P(this.f365112e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetQQAssistant", "updateProfile: is muted");
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe3 = this.f365115h;
            if (c21541x1c1b08fe3 == null) {
                return;
            }
            c21541x1c1b08fe3.O(true);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetQQAssistant", "updateProfile: is not muted");
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe4 = this.f365115h;
        if (c21541x1c1b08fe4 == null) {
            return;
        }
        c21541x1c1b08fe4.O(false);
    }

    @Override // t25.a
    /* renamed from: onActivityResult */
    public void mo67449x9d4787cb(int i17, int i18, android.content.Intent intent) {
    }

    @Override // t25.b
    /* renamed from: onBackPress */
    public boolean mo67617x4ceae47d() {
        android.app.Activity activity = this.f365111d;
        if (activity.getIntent().getBooleanExtra("Contact_NeedBackToLauncherUI", false)) {
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(268435456);
            j45.l.u(activity, ".ui.transmit.TaskRedirectUI", intent, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetQQAssistant", "back to LauncherUI");
        }
        return false;
    }

    @Override // t25.b
    /* renamed from: onCreate */
    public boolean mo67618x3e5a77bb() {
        return false;
    }

    @Override // t25.b
    /* renamed from: onDestroy */
    public boolean mo67619xac79a11b() {
        return false;
    }

    @Override // t25.a
    /* renamed from: onDetach */
    public boolean mo67450x3f5eee52() {
        return true;
    }

    @Override // t25.b
    /* renamed from: onPause */
    public void mo67620xb01dfb57() {
    }

    @Override // t25.b
    /* renamed from: onResume */
    public void mo67621x57429eec() {
    }
}
