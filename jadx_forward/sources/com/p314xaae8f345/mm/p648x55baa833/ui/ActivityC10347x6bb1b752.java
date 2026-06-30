package com.p314xaae8f345.mm.p648x55baa833.ui;

/* renamed from: com.tencent.mm.chatroom.ui.ManagerRoomByWeworkUI */
/* loaded from: classes12.dex */
public class ActivityC10347x6bb1b752 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public static final /* synthetic */ int I = 0;
    public android.widget.LinearLayout A;
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 B;
    public android.widget.LinearLayout C;
    public android.widget.ImageView D;
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de E;
    public com.p314xaae8f345.mm.p648x55baa833.ui.q4 F;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f145329d;

    /* renamed from: e, reason: collision with root package name */
    public int f145330e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f145331f;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.Button f145341s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.Button f145342t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f145343u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 f145344v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f145345w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f145346x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.LinearLayout f145347y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.LinearLayout f145348z;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f145332g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f145333h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f145334i = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashMap f145335m = new java.util.HashMap();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashMap f145336n = new java.util.HashMap();

    /* renamed from: o, reason: collision with root package name */
    public int f145337o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f145338p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f145339q = 0;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f145340r = null;
    public int G = 0;
    public int H = 0;

    public static void T6(java.lang.String str, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6642xe5851e42 c6642xe5851e42 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6642xe5851e42();
        c6642xe5851e42.f139929d = c6642xe5851e42.b("Roomid", str, true);
        c6642xe5851e42.f139930e = i17;
        c6642xe5851e42.f139931f = i18;
        c6642xe5851e42.f139932g = i19;
        c6642xe5851e42.k();
    }

    public static void U6(java.lang.String str, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e0913) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || c19659x677e0913 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ManagerRoomByWeworkUI", "username or avatarIv null");
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(c19659x677e0913, str, null);
        }
    }

    public static void X6(android.content.Context context, java.lang.String str, android.widget.TextView textView, android.widget.TextView textView2, boolean z17) {
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        java.lang.CharSequence bj6 = ((ke0.e) xVar).bj(context, c01.a2.e(str), i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia));
        if (z17) {
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            bj6 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.a(context, bj6, com.p314xaae8f345.mm.R.raw.f80792xe33cabf8);
        }
        textView.setText(bj6);
        int wi6 = ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true).d1());
        if (wi6 == 0) {
            textView2.setVisibility(8);
            return;
        }
        textView2.setVisibility(0);
        textView2.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k4y, wi6 + ""));
    }

    public void V6(int i17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6645x34f16f5b c6645x34f16f5b = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6645x34f16f5b();
        c6645x34f16f5b.f139941d = this.G;
        c6645x34f16f5b.f139942e = this.H;
        com.p314xaae8f345.mm.p648x55baa833.ui.q4 q4Var = this.F;
        c6645x34f16f5b.f139943f = q4Var == null ? 0L : q4Var.f145979m;
        c6645x34f16f5b.f139944g = q4Var != null ? q4Var.f145980n : 0L;
        c6645x34f16f5b.f139945h = i17;
        java.lang.String str = this.f145331f;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        c6645x34f16f5b.f139946i = c6645x34f16f5b.b("TicketId", str, true);
        c6645x34f16f5b.f139947j = this.f145339q;
        c6645x34f16f5b.k();
    }

    public final boolean W6() {
        java.util.List P0 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().P0(c01.v1.q());
        java.util.HashSet hashSet = new java.util.HashSet(this.f145334i);
        java.util.Iterator it = ((java.util.ArrayList) P0).iterator();
        while (it.hasNext()) {
            if (!hashSet.contains((java.lang.String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public final void Y6(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, boolean z17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f145340r;
        if (u3Var == null) {
            this.f145340r = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572001vx), true, z17, new com.p314xaae8f345.mm.p648x55baa833.ui.o4(this, m1Var));
        } else {
            if (u3Var.isShowing()) {
                return;
            }
            this.f145340r.show();
        }
    }

    public final void Z6() {
        if (this.f145330e != 3) {
            this.f145341s.setVisibility(0);
            this.f145342t.setVisibility(8);
            return;
        }
        if ((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_wework_select_other_room_switch, 1) == 1) && W6() && ((java.util.ArrayList) this.f145332g).size() == 0 && ((java.util.ArrayList) this.f145334i).size() == 0) {
            this.f145341s.setVisibility(8);
            this.f145342t.setVisibility(0);
            return;
        }
        this.f145341s.setVisibility(0);
        this.f145342t.setVisibility(8);
        com.p314xaae8f345.mm.p648x55baa833.ui.q4 q4Var = this.F;
        if (q4Var == null || q4Var.f145977h <= 0) {
            this.f145341s.setEnabled(false);
        } else {
            this.f145341s.setEnabled(true);
        }
    }

    public final boolean a7() {
        if (!(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_wework_select_other_room_switch, 1) == 1) || !W6()) {
            this.C.setVisibility(8);
            this.D.setVisibility(8);
            return false;
        }
        if (((java.util.ArrayList) this.f145332g).size() == 0 && ((java.util.ArrayList) this.f145334i).size() == 0) {
            this.C.setVisibility(8);
        } else {
            this.C.setVisibility(0);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569942si;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ManagerRoomByWeworkUI", "requestCode=%d | resultCode=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i18 == -1 && i17 == 0) {
            java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
            java.util.ArrayList arrayList = (java.util.ArrayList) this.f145333h;
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(((com.p314xaae8f345.mm.p2621x8fb0427b.z3) it.next()).d1(), stringExtra)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ManagerRoomByWeworkUI", "onActivityResult contain");
                    return;
                }
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(stringExtra, true);
            arrayList.add(n17);
            ((java.util.ArrayList) this.f145334i).add(stringExtra);
            this.f145335m.put(n17.d1(), java.lang.Boolean.TRUE);
            this.F.m8146xced61ae5();
            a7();
            com.p314xaae8f345.mm.p648x55baa833.ui.q4 q4Var = this.F;
            q4Var.f145980n++;
            q4Var.f145977h++;
            p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89 c1095x65355f89 = (p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89) findViewById(com.p314xaae8f345.mm.R.id.f78309xcc53afe2);
            android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.cgc);
            android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.f569035ot1);
            android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.auq);
            if (c1095x65355f89 != null) {
                c1095x65355f89.post(new com.p314xaae8f345.mm.ui.p2740x696c9db.i8(findViewById, findViewById3, this, 48, findViewById2, 0.0f, c1095x65355f89, false));
            }
            Z6();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        boolean z17;
        super.onCreate(bundle);
        mo54450xbf7c1df6("");
        this.f145329d = getIntent().getStringExtra("RoomInfo_Id");
        this.f145330e = getIntent().getIntExtra("upgrade_openim_room_from_scene", 0);
        this.f145331f = getIntent().getStringExtra("ticket");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ManagerRoomByWeworkUI", "mFromScene:%s", java.lang.Integer.valueOf(this.f145330e));
        if (this.f145330e == 3) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f145331f)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ManagerRoomByWeworkUI", "mTicket is null");
                finish();
                z17 = false;
            }
            z17 = true;
        } else {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f145329d)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ManagerRoomByWeworkUI", "mRoomId is null");
                finish();
                z17 = false;
            }
            z17 = true;
        }
        if (z17) {
            gm0.j1.d().a(3553, this);
            gm0.j1.d().a(3927, this);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ManagerRoomByWeworkUI", "doFetchCollectPubFill() roomId:%s", this.f145329d);
            kn.r rVar = this.f145330e == 3 ? new kn.r(this.f145331f, true) : new kn.r(this.f145329d);
            gm0.j1.d().g(rVar);
            Y6(rVar, this.f145330e != 3);
            mo54450xbf7c1df6("");
            mo78530x8b45058f();
            mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
            m78561xe5bc8f21(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c);
            mo54448x9c8c0d33(new com.p314xaae8f345.mm.p648x55baa833.ui.k4(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        gm0.j1.d().q(3553, this);
        gm0.j1.d().q(3927, this);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        int i18 = this.f145330e;
        if (i18 != 3) {
            T6(this.f145329d, i18, 0, 0);
        } else {
            V6(0);
        }
        return super.onKeyUp(i17, keyEvent);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        boolean z17;
        java.util.List list;
        java.util.List list2;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ManagerRoomByWeworkUI", "onSceneEnd errType = %d, errCode = %d, errMsg = %s, scenetype:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()));
        int i19 = 0;
        if (this.f145330e != 3 || (m1Var instanceof kn.r)) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = this.f145340r;
            if (u3Var2 != null && u3Var2.isShowing()) {
                this.f145340r.dismiss();
            }
        } else {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ManagerRoomByWeworkUI", "NetSceneUpgradeAssociateChatRoom %s", ((kn.d0) m1Var).f390919g);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ManagerRoomByWeworkUI", "NetSceneUpgradeAssociateChatRoom Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
            }
            int i27 = this.f145337o + 1;
            this.f145337o = i27;
            if (i27 == this.f145338p && (u3Var = this.f145340r) != null && u3Var.isShowing()) {
                this.f145340r.dismiss();
            }
        }
        java.util.List list3 = this.f145332g;
        java.util.HashMap hashMap = this.f145336n;
        if (i17 == 0 && i18 == 0) {
            if (m1Var instanceof kn.r) {
                r45.ca3 ca3Var = ((kn.r) m1Var).f390983f;
                if (ca3Var == null) {
                    ca3Var = null;
                }
                if (ca3Var == null) {
                    db5.t7.m123883x26a183b(mo55332x76847179(), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.k4u) : str, 0).show();
                    finish();
                    return;
                }
                super.mo43517x10010bd5();
                this.f145341s = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.f569046ou4);
                this.f145342t = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.mj6);
                this.f145343u = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.bhd);
                this.f145344v = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) findViewById(com.p314xaae8f345.mm.R.id.bgj);
                this.f145345w = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565159bh5);
                this.f145346x = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565463ci1);
                this.f145347y = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.chj);
                this.f145348z = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.f566721gu5);
                this.A = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.bgr);
                this.B = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.a5b);
                this.C = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.mj8);
                this.D = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.mj7);
                android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.cgc);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI", "initView", "(Lcom/tencent/mm/protocal/protobuf/GetAssociateChatRoomManageInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI", "initView", "(Lcom/tencent/mm/protocal/protobuf/GetAssociateChatRoomManageInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f145341s.setOnClickListener(new com.p314xaae8f345.mm.p648x55baa833.ui.l4(this));
                int i28 = this.f145330e;
                if (i28 == 1 || i28 == 2) {
                    this.A.setVisibility(0);
                    this.f145348z.setVisibility(8);
                    U6(this.f145329d, this.f145344v);
                    java.lang.String str2 = this.f145329d;
                    android.widget.TextView textView = this.f145345w;
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str2, true);
                    java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.P0()) ? ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(n17.d1()) == 0 ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574013gt1) : getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573666fc0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574013gt1), java.lang.Integer.valueOf(((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(n17.d1()))) : getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573666fc0, n17.f2(), java.lang.Integer.valueOf(((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(n17.d1())));
                    le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                    android.text.SpannableString bj6 = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(this, string, i65.a.h(this, com.p314xaae8f345.mm.R.C30860x5b28f31.f561101k));
                    ((ke0.e) xVar).getClass();
                    textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.a(this, bj6, com.p314xaae8f345.mm.R.raw.f80792xe33cabf8));
                } else if (i28 == 3) {
                    this.A.setVisibility(8);
                    this.f145348z.setVisibility(0);
                    com.p314xaae8f345.mm.p648x55baa833.ui.m4 m4Var = new com.p314xaae8f345.mm.p648x55baa833.ui.m4(this);
                    this.C.setOnClickListener(m4Var);
                    this.f145342t.setOnClickListener(m4Var);
                    java.util.ArrayList arrayList2 = (java.util.ArrayList) c01.e2.j();
                    if (arrayList2.size() != 0) {
                        java.util.Iterator it = arrayList2.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            list = this.f145334i;
                            list2 = this.f145333h;
                            if (!hasNext) {
                                break;
                            }
                            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) it.next();
                            if (c01.e2.F(z3Var.d1())) {
                                com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(z3Var.d1());
                                if (z07 == null) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ManagerRoomByWeworkUI", "initContactList %s member is null", z3Var.d1());
                                } else if (z07.f69098xbcb1bed0 < c01.v1.q() && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(z07.f69107x5be1edb3, c01.z1.r())) {
                                    ((java.util.ArrayList) list2).add(z3Var);
                                    ((java.util.ArrayList) list).add(z3Var.d1());
                                    ((java.util.ArrayList) list3).add(z3Var.d1());
                                }
                            }
                        }
                        java.util.ArrayList arrayList3 = (java.util.ArrayList) list2;
                        int size = arrayList3.size();
                        this.G = size;
                        if (size == 0) {
                            java.util.List<java.lang.String> c17 = o13.n.c();
                            java.util.HashSet hashSet = new java.util.HashSet(((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().P0(c01.v1.q()));
                            java.util.LinkedList linkedList = new java.util.LinkedList();
                            for (java.lang.String str3 : c17) {
                                if (linkedList.size() >= 5) {
                                    break;
                                } else if (hashSet.contains(str3) && !c01.e2.E(str3)) {
                                    linkedList.add(str3);
                                }
                            }
                            java.util.Iterator it6 = ((java.util.ArrayList) g95.e.f351334a.f(linkedList)).iterator();
                            while (it6.hasNext()) {
                                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) it6.next();
                                arrayList3.add(z3Var2);
                                ((java.util.ArrayList) list).add(z3Var2.d1());
                                ((java.util.ArrayList) list3).add(z3Var2.d1());
                            }
                            this.G = arrayList3.size();
                        }
                        this.f145339q = ((java.util.ArrayList) ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().P0(c01.v1.q())).size() - this.G;
                        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this);
                        this.E = c1162x665295de;
                        c1162x665295de.Q(1);
                        this.B.mo7967x900dcbe1(this.E);
                        this.B.N(new com.p314xaae8f345.mm.p648x55baa833.ui.r4(mo55332x76847179(), 0.5f, 96.0f));
                        com.p314xaae8f345.mm.p648x55baa833.ui.q4 q4Var = new com.p314xaae8f345.mm.p648x55baa833.ui.q4(mo55332x76847179(), list2, this.f145335m, list3, new com.p314xaae8f345.mm.p648x55baa833.ui.n4(this));
                        this.F = q4Var;
                        this.B.mo7960x6cab2c8d(q4Var);
                        this.B.setNestedScrollingEnabled(false);
                        this.F.m8146xced61ae5();
                        if (((java.util.ArrayList) list2).size() != 0) {
                            z17 = true;
                            if (!z17 && !a7()) {
                                android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.f565761dg2);
                                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                                arrayList4.add(0);
                                java.util.Collections.reverse(arrayList4);
                                yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI", "initView", "(Lcom/tencent/mm/protocal/protobuf/GetAssociateChatRoomManageInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                                yj0.a.f(findViewById2, "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI", "initView", "(Lcom/tencent/mm/protocal/protobuf/GetAssociateChatRoomManageInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.f569046ou4);
                                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                                arrayList5.add(8);
                                java.util.Collections.reverse(arrayList5);
                                yj0.a.d(findViewById3, arrayList5.toArray(), "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI", "initView", "(Lcom/tencent/mm/protocal/protobuf/GetAssociateChatRoomManageInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                findViewById3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                                yj0.a.f(findViewById3, "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI", "initView", "(Lcom/tencent/mm/protocal/protobuf/GetAssociateChatRoomManageInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                this.f145348z.setVisibility(8);
                            }
                        }
                    }
                    z17 = false;
                    if (!z17) {
                        android.view.View findViewById22 = findViewById(com.p314xaae8f345.mm.R.id.f565761dg2);
                        java.util.ArrayList arrayList42 = new java.util.ArrayList();
                        arrayList42.add(0);
                        java.util.Collections.reverse(arrayList42);
                        yj0.a.d(findViewById22, arrayList42.toArray(), "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI", "initView", "(Lcom/tencent/mm/protocal/protobuf/GetAssociateChatRoomManageInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById22.setVisibility(((java.lang.Integer) arrayList42.get(0)).intValue());
                        yj0.a.f(findViewById22, "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI", "initView", "(Lcom/tencent/mm/protocal/protobuf/GetAssociateChatRoomManageInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        android.view.View findViewById32 = findViewById(com.p314xaae8f345.mm.R.id.f569046ou4);
                        java.util.ArrayList arrayList52 = new java.util.ArrayList();
                        arrayList52.add(8);
                        java.util.Collections.reverse(arrayList52);
                        yj0.a.d(findViewById32, arrayList52.toArray(), "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI", "initView", "(Lcom/tencent/mm/protocal/protobuf/GetAssociateChatRoomManageInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById32.setVisibility(((java.lang.Integer) arrayList52.get(0)).intValue());
                        yj0.a.f(findViewById32, "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI", "initView", "(Lcom/tencent/mm/protocal/protobuf/GetAssociateChatRoomManageInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        this.f145348z.setVisibility(8);
                    }
                }
                Z6();
                this.f145343u.setText(ca3Var.f452931g);
                android.widget.TextView textView2 = this.f145346x;
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
                java.lang.String str4 = ca3Var.f452928d;
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                textView2.setText(((ke0.e) xVar2).hj(mo55332x76847179, str4 == null ? "" : str4, (int) this.f145346x.getTextSize(), 1, null));
                java.util.LinkedList linkedList2 = ca3Var.f452929e;
                if (linkedList2 != null && linkedList2.size() > 0) {
                    this.f145347y.removeAllViews();
                    android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) mo55332x76847179().getSystemService("layout_inflater");
                    java.util.Iterator it7 = linkedList2.iterator();
                    int i29 = 0;
                    while (it7.hasNext()) {
                        java.lang.String str5 = (java.lang.String) it7.next();
                        android.view.View inflate = layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569944sk, (android.view.ViewGroup) this.f145347y, false);
                        i29++;
                        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.klr)).setText(i29 + ".");
                        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.cut)).setText(str5);
                        this.f145347y.addView(inflate);
                    }
                }
                p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89 c1095x65355f89 = (p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89) findViewById(com.p314xaae8f345.mm.R.id.f78309xcc53afe2);
                android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.cgc);
                android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.f569035ot1);
                android.view.View findViewById6 = findViewById(com.p314xaae8f345.mm.R.id.auq);
                if (c1095x65355f89 == null) {
                    return;
                }
                c1095x65355f89.post(new com.p314xaae8f345.mm.ui.p2740x696c9db.i8(findViewById4, findViewById6, this, 48, findViewById5, 0.0f, c1095x65355f89, false));
                return;
            }
            if (m1Var instanceof kn.d0) {
                kn.d0 d0Var = (kn.d0) m1Var;
                r45.lt6 lt6Var = d0Var.f390918f;
                if (lt6Var == null) {
                    lt6Var = null;
                }
                int i37 = this.f145330e;
                if (i37 != 3) {
                    if (lt6Var == null) {
                        db5.t7.m123883x26a183b(mo55332x76847179(), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.k4u) : str, 0).show();
                        T6(this.f145329d, this.f145330e, 2, 4);
                        finish();
                        return;
                    }
                    T6(this.f145329d, i37, 1, 0);
                    android.content.Intent intent = new android.content.Intent();
                    intent.setClass(this, com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10377x84ecdd3.class);
                    intent.putExtra("RoomInfo_Id", this.f145329d);
                    java.lang.String str6 = lt6Var.f461355d;
                    if (str6 == null) {
                        str6 = "";
                    }
                    intent.putExtra("popup_wording", str6);
                    intent.putExtra("upgrade_openim_room_from_scene", this.f145330e);
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    arrayList6.add(intent);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(this, arrayList6.toArray(), "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((android.content.Intent) arrayList6.get(0));
                    yj0.a.f(this, "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    finish();
                    super.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea, com.p314xaae8f345.mm.R.C30854x2dc211.f559415e6);
                    return;
                }
                java.lang.String str7 = d0Var.f390919g;
                if (lt6Var != null) {
                    hashMap.put(str7, java.lang.Boolean.TRUE);
                } else {
                    hashMap.put(str7, java.lang.Boolean.FALSE);
                }
            }
        } else if (m1Var instanceof kn.r) {
            db5.t7.m123883x26a183b(mo55332x76847179(), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.k4u) : str, 0).show();
            finish();
            return;
        } else if (m1Var instanceof kn.d0) {
            int i38 = this.f145330e;
            if (i38 != 3) {
                T6(this.f145329d, i38, 2, 4);
                db5.t7.m123883x26a183b(mo55332x76847179(), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.k4u) : str, 0).show();
                return;
            }
            hashMap.put(((kn.d0) m1Var).f390919g, java.lang.Boolean.FALSE);
        }
        if (this.f145330e == 3 && (m1Var instanceof kn.d0) && this.f145337o == this.f145338p) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ManagerRoomByWeworkUI", "NetSceneUpgradeAssociateChatRoom finish");
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            for (java.util.Map.Entry entry : hashMap.entrySet()) {
                if (((java.lang.Boolean) entry.getValue()).booleanValue()) {
                    arrayList7.add((java.lang.String) entry.getKey());
                } else {
                    arrayList8.add((java.lang.String) entry.getKey());
                }
            }
            android.content.Intent intent2 = new android.content.Intent();
            intent2.setClass(this, com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10377x84ecdd3.class);
            intent2.putExtra("upgrade_openim_room_from_scene", this.f145330e);
            intent2.putExtra("wework_upgrade_success_list", arrayList7);
            intent2.putExtra("wework_upgrade_fail_list", arrayList8);
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            arrayList9.add(intent2);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(this, arrayList9.toArray(), "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList9.get(0));
            yj0.a.f(this, "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            finish();
            super.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea, com.p314xaae8f345.mm.R.C30854x2dc211.f559415e6);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.Iterator it8 = arrayList7.iterator();
            int i39 = 0;
            while (it8.hasNext()) {
                java.lang.String str8 = (java.lang.String) it8.next();
                if (((java.util.ArrayList) list3).contains(str8)) {
                    i19++;
                } else {
                    i39++;
                }
                sb6.append(str8);
                sb6.append("|");
            }
            if (sb6.length() - 1 >= 0) {
                sb6.deleteCharAt(sb6.length() - 1);
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6644x15329af c6644x15329af = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6644x15329af();
            c6644x15329af.f139935d = i19;
            com.p314xaae8f345.mm.p648x55baa833.ui.q4 q4Var2 = this.F;
            c6644x15329af.f139936e = q4Var2 == null ? 0L : q4Var2.f145979m - i19;
            c6644x15329af.f139937f = i39;
            c6644x15329af.f139938g = q4Var2 != null ? q4Var2.f145980n - i39 : 0L;
            c6644x15329af.f139939h = c6644x15329af.b("sucRoomList", sb6.toString(), true);
            java.lang.String str9 = this.f145331f;
            if (str9 == null) {
                str9 = "";
            }
            c6644x15329af.f139940i = c6644x15329af.b("ticketId", str9, true);
            c6644x15329af.k();
        }
    }
}
