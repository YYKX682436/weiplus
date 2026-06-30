package hr3;

/* loaded from: classes11.dex */
public class w6 implements t25.b {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f365671d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f365672e = null;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f365673f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ViewOnClickListenerC16860xc669c20a f365674g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe f365675h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe f365676i;

    /* renamed from: m, reason: collision with root package name */
    public cr3.d0 f365677m;

    public w6(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        this.f365671d = abstractActivityC21394xb3d2c0cf;
    }

    @Override // t25.a
    public boolean Q(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetChatBot", "onAttach");
        this.f365673f = rVar;
        this.f365672e = z3Var;
        if (this.f365677m == null) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f365671d;
            cr3.d0 d0Var = new cr3.d0(abstractActivityC21394xb3d2c0cf, z3Var);
            this.f365677m = d0Var;
            abstractActivityC21394xb3d2c0cf.m78478x84f07bce(0, com.p314xaae8f345.mm.R.C30867xcad56011.w_, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, d0Var);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar;
        h0Var.g(com.p314xaae8f345.mm.R.xml.f576374da);
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ViewOnClickListenerC16860xc669c20a viewOnClickListenerC16860xc669c20a = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ViewOnClickListenerC16860xc669c20a) h0Var.h("contact_profile_header_normal");
        this.f365674g = viewOnClickListenerC16860xc669c20a;
        if (viewOnClickListenerC16860xc669c20a != null) {
            viewOnClickListenerC16860xc669c20a.S = h0Var;
            viewOnClickListenerC16860xc669c20a.M(z3Var, i17, z17, null);
        }
        this.f365675h = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h0Var.h("contact_info_chatbot_top");
        this.f365676i = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h0Var.h("contact_info_chatbot_not_disturb");
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21554xcdf33ced c21554xcdf33ced = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21554xcdf33ced) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365673f).h("contact_info_chatbot_intro");
        if (c21554xcdf33ced != null) {
            c21554xcdf33ced.S(Integer.MAX_VALUE);
            c21554xcdf33ced.P = false;
            c21554xcdf33ced.E(8);
            try {
                org.json.JSONArray bj6 = ((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).bj(this.f365672e.d1());
                if (bj6 != null && bj6.length() > 0) {
                    c21554xcdf33ced.H(bj6.getJSONObject(0).optString("content"));
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactWidgetChatBot", "KEY_INTRO parse error");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ContactWidgetChatBot", e17, "", new java.lang.Object[0]);
            }
        }
        this.f365675h.O(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().K(this.f365672e.d1()));
        this.f365676i.O(c01.e2.P(this.f365672e));
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365673f).m("contact_info_chatbot_send_msg", false);
        a();
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetChatBot", "handleEvent, key: " + str);
        if (str == null) {
            return false;
        }
        str.getClass();
        char c17 = 65535;
        switch (str.hashCode()) {
            case -1502154324:
                if (str.equals("contact_info_chatbot_send_msg")) {
                    c17 = 0;
                    break;
                }
                break;
            case -1040926223:
                if (str.equals("contact_info_chatbot_not_disturb")) {
                    c17 = 1;
                    break;
                }
                break;
            case -322249549:
                if (str.equals("contact_info_chatbot_top")) {
                    c17 = 2;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Chat_User", this.f365672e.d1());
                intent.putExtra("finish_direct", true);
                j45.l.u(this.f365671d, ".ui.chatting.ChattingUI", intent, null);
                return true;
            case 1:
                if (this.f365676i.N()) {
                    c01.e2.p0(this.f365672e, true);
                } else {
                    c01.e2.z0(this.f365672e, true);
                }
                return true;
            case 2:
                if (this.f365675h.N()) {
                    c01.e2.t0(this.f365672e.d1(), true, true);
                } else {
                    c01.e2.B0(this.f365672e.d1(), true, true);
                }
                return true;
            default:
                return false;
        }
    }

    public final void a() {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f365671d;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.l2v);
        if (frameLayout == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactWidgetChatBot", "[-] bottomContainer was not found, there must be some issues.");
            return;
        }
        vh0.f2 f2Var = (vh0.f2) ((vh0.d1) i95.n0.c(vh0.d1.class));
        java.util.List Ai = f2Var.Ai(this.f365672e.d1());
        if (Ai.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactWidgetChatBot", "[-] no service agreements found, hide bottom container.");
            frameLayout.removeAllViews();
            frameLayout.setVisibility(8);
        } else {
            frameLayout.removeAllViews();
            if (f2Var.wi(abstractActivityC21394xb3d2c0cf, frameLayout, this.f365672e.d1(), Ai)) {
                frameLayout.setVisibility(0);
            } else {
                frameLayout.setVisibility(8);
            }
        }
    }

    @Override // t25.a
    /* renamed from: onActivityResult */
    public void mo67449x9d4787cb(int i17, int i18, android.content.Intent intent) {
    }

    @Override // t25.b
    /* renamed from: onBackPress */
    public boolean mo67617x4ceae47d() {
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetChatBot", "onDetach");
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ViewOnClickListenerC16860xc669c20a viewOnClickListenerC16860xc669c20a = this.f365674g;
        if (viewOnClickListenerC16860xc669c20a == null) {
            return true;
        }
        viewOnClickListenerC16860xc669c20a.T();
        return true;
    }

    @Override // t25.b
    /* renamed from: onPause */
    public void mo67620xb01dfb57() {
    }

    @Override // t25.b
    /* renamed from: onResume */
    public void mo67621x57429eec() {
        a();
    }
}
