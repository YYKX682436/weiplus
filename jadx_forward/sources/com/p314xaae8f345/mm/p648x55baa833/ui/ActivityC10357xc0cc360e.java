package com.p314xaae8f345.mm.p648x55baa833.ui;

@java.lang.Deprecated
/* renamed from: com.tencent.mm.chatroom.ui.RoomInfoDetailUI */
/* loaded from: classes11.dex */
public class ActivityC10357xc0cc360e extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f145376d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f145377e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f145378f;

    /* renamed from: g, reason: collision with root package name */
    public int f145379g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f145380h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p648x55baa833.ui.p652xa8fcbcdb.C10383x60c27393 f145381i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe f145382m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe f145383n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe f145384o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f145385p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f145386q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f145387r = false;

    public static void V6(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10357xc0cc360e activityC10357xc0cc360e, android.app.ProgressDialog progressDialog) {
        c01.w9.h(activityC10357xc0cc360e.f145380h.d1(), new com.p314xaae8f345.mm.p648x55baa833.ui.a9(activityC10357xc0cc360e, progressDialog));
        de0.j jVar = (de0.j) i95.n0.c(de0.j.class);
        java.lang.String d17 = activityC10357xc0cc360e.f145380h.d1();
        ((ce0.e) jVar).getClass();
        com.p314xaae8f345.mm.p957x53236a1b.g1.I(d17, 15);
    }

    public final boolean W6() {
        return (((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f145385p).f69086x7ba563ee & 2) == 0;
    }

    public final void X6() {
        if (this.f145376d) {
            android.content.SharedPreferences sharedPreferences = getSharedPreferences(this.f145378f, 0);
            int i17 = this.f145379g;
            if (i17 == 0) {
                m78594xca3c3c9a(0);
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = this.f145382m;
                if (c21541x1c1b08fe != null) {
                    c21541x1c1b08fe.O(true);
                    sharedPreferences.edit().putBoolean("room_msg_notify", true).commit();
                }
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe2 = this.f145384o;
                if (c21541x1c1b08fe2 != null) {
                    c21541x1c1b08fe2.O(W6());
                }
            } else if (i17 == 1) {
                m78594xca3c3c9a(8);
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe3 = this.f145382m;
                if (c21541x1c1b08fe3 != null) {
                    c21541x1c1b08fe3.O(false);
                    sharedPreferences.edit().putBoolean("room_msg_notify", false).commit();
                }
            }
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f145377e).m("room_show_msg_count", this.f145379g == 1);
        }
    }

    public final void Y6() {
        if (this.f145380h == null || this.f145381i == null) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f145385p);
        java.lang.String str = z07 == null ? "" : z07.f69109x43482a3c;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = c01.z1.l();
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            this.f145381i.H("");
            return;
        }
        com.p314xaae8f345.mm.p648x55baa833.ui.p652xa8fcbcdb.C10383x60c27393 c10383x60c27393 = this.f145381i;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        if (str.length() <= 0) {
            str = getString(com.p314xaae8f345.mm.R.C30867xcad56011.iy8);
        }
        ((ke0.e) xVar).getClass();
        c10383x60c27393.H(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(this, str));
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576449bi;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.i77);
        this.f145377e = m79336x8b97809d();
        this.f145378f = getPackageName() + "_preferences";
        this.f145376d = getIntent().getBooleanExtra("Is_Chatroom", true);
        java.lang.String stringExtra = getIntent().getStringExtra("RoomInfo_Id");
        this.f145385p = stringExtra;
        if (stringExtra == null) {
            this.f145385p = getIntent().getStringExtra("Single_Chat_Talker");
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f145385p, true);
        this.f145380h = n17;
        if (this.f145376d) {
            this.f145379g = n17.T;
            this.f145381i = (com.p314xaae8f345.mm.p648x55baa833.ui.p652xa8fcbcdb.C10383x60c27393) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f145377e).h("room_name");
            this.f145382m = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f145377e).h("room_msg_notify");
            this.f145384o = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f145377e).h("room_show_msg_count");
            this.f145383n = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f145377e).h("room_msg_show_username");
            this.f145384o.f279318v = false;
        } else {
            this.f145379g = 1;
        }
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p648x55baa833.ui.v8(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i18 != -1) {
            return;
        }
        if (i17 == 1) {
            if (i18 == -1) {
                setResult(-1);
                finish();
                return;
            }
            return;
        }
        if (i17 == 2 && intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("Contact_Nick");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (stringExtra == null) {
                stringExtra = "";
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                return;
            }
            java.lang.String r17 = c01.z1.r();
            com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f145385p);
            if (z07 == null) {
                z07 = new com.p314xaae8f345.mm.p2621x8fb0427b.a3();
            }
            z07.f69088x37548063 = this.f145385p;
            z07.f69109x43482a3c = stringExtra;
            ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().mo9952xce0038c9(z07, new java.lang.String[0]);
            r45.on4 on4Var = new r45.on4();
            on4Var.f463911d = this.f145385p;
            on4Var.f463912e = r17;
            on4Var.f463913f = stringExtra;
            ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(48, on4Var));
            Y6();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.f145387r) {
            com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f145385p);
            ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().mo9952xce0038c9(z07, new java.lang.String[0]);
            java.lang.String r17 = c01.z1.r();
            int i17 = z07.f69096x75b86ab7 > 0 ? 1 : 0;
            r45.pn4 pn4Var = new r45.pn4();
            pn4Var.f464761d = this.f145385p;
            pn4Var.f464762e = r17;
            pn4Var.f464763f = 1;
            pn4Var.f464764g = i17;
            ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(49, pn4Var));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        java.lang.String str = c21560x1fce98fb.f279313q;
        if (str.equals("room_name")) {
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(this, com.p314xaae8f345.mm.ui.r2.class);
            intent.putExtra("Contact_mode_name_type", 4);
            java.lang.String r17 = c01.z1.r();
            com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f145385p);
            intent.putExtra("Contact_Nick", z07 == null ? "" : z07.f69109x43482a3c);
            intent.putExtra("Contact_User", r17);
            intent.putExtra("MMActivity.OverrideEnterAnimation", com.p314xaae8f345.mm.R.C30854x2dc211.f559316bc);
            intent.putExtra("MMActivity.OverrideExitAnimation", com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
            mo55332x76847179().startActivityForResult(intent, 2);
        }
        if (str.equals("room_msg_show_username")) {
            com.p314xaae8f345.mm.p2621x8fb0427b.a3 z08 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f145385p);
            z08.f69096x75b86ab7 = (z08.f69096x75b86ab7 > 0 ? 1 : 0) ^ 1;
            this.f145387r = true;
        }
        if (str.equals("room_msg_notify")) {
            this.f145379g = this.f145379g == 0 ? 1 : 0;
            ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new mn.a(this.f145385p, this.f145379g, 0));
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f145385p, true);
            this.f145380h = n17;
            n17.J2(this.f145379g);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().p0(this.f145385p, this.f145380h);
            X6();
            this.f145380h = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f145385p, true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f145377e).notifyDataSetChanged();
        }
        if (str.equals("room_set_chatting_background")) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("isApplyToAll", false);
            intent2.putExtra(dm.i4.f66875xa013b0d5, this.f145380h.d1());
            j45.l.n(this, "setting", ".ui.setting.SettingsChattingBackgroundUI", intent2, 1);
        }
        if (str.equals("room_clear_chatting_history")) {
            db5.e1.e(this, this.f145376d ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.fc9) : getString(com.p314xaae8f345.mm.R.C30867xcad56011.fc7, this.f145380h.g2()), new java.lang.String[]{getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574419i46)}, null, new com.p314xaae8f345.mm.p648x55baa833.ui.z8(this));
        }
        if (str.equals("room_placed_to_the_top")) {
            android.content.SharedPreferences sharedPreferences = getSharedPreferences(this.f145378f, 0);
            if (this.f145380h != null) {
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().K(this.f145380h.d1())) {
                    c01.e2.B0(this.f145380h.d1(), true, true);
                } else {
                    c01.e2.t0(this.f145380h.d1(), true, true);
                }
                sharedPreferences.edit().putBoolean("room_placed_to_the_top", ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().K(this.f145380h.d1())).commit();
            }
        }
        if ("room_show_msg_count".equals(str)) {
            boolean z17 = !W6();
            com.p314xaae8f345.mm.p2621x8fb0427b.a3 z09 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f145385p);
            if (z17) {
                if (z09.I0(z09.f275277b2)) {
                    z09.t0();
                }
                z09.f69086x7ba563ee = (z09.f275277b2.f411773e & (-3)) | 0;
            } else {
                if (z09.I0(z09.f275277b2)) {
                    z09.t0();
                }
                z09.f69086x7ba563ee = (z09.f275277b2.f411773e & (-3)) | 2;
            }
            ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().mo9952xce0038c9(z09, new java.lang.String[0]);
            java.lang.String r18 = c01.z1.r();
            r45.pn4 pn4Var = new r45.pn4();
            pn4Var.f464761d = this.f145385p;
            pn4Var.f464762e = r18;
            pn4Var.f464763f = 2;
            pn4Var.f464764g = z17 ? 2 : 1;
            ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(49, pn4Var));
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = this.f145384o;
            if (c21541x1c1b08fe != null) {
                c21541x1c1b08fe.O(z17);
            }
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f145377e).notifyDataSetChanged();
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        X6();
        Y6();
        if (this.f145380h != null && this.f145383n != null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.a3 W0 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().W0(this.f145385p);
            android.content.SharedPreferences sharedPreferences = getSharedPreferences(this.f145378f, 0);
            if (W0.f69096x75b86ab7 > 0) {
                this.f145383n.O(true);
                sharedPreferences.edit().putBoolean("room_msg_show_username", true).commit();
            } else {
                this.f145383n.O(false);
                sharedPreferences.edit().putBoolean("room_msg_show_username", false).commit();
            }
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f145377e).notifyDataSetChanged();
    }
}
