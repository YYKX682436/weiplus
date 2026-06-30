package com.p314xaae8f345.mm.p648x55baa833.ui;

/* renamed from: com.tencent.mm.chatroom.ui.SeeRoomMemberUI */
/* loaded from: classes11.dex */
public class ActivityC10365x4886147c extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0, pn.a {

    /* renamed from: z, reason: collision with root package name */
    public static int f145467z = 5;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.GridView f145468d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p648x55baa833.ui.cc f145469e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.a3 f145470f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f145471g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f145472h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f145473i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f145474m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f145475n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f145476o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f145477p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f145478q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f145479r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f145480s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f145481t;

    /* renamed from: u, reason: collision with root package name */
    public int f145482u;

    /* renamed from: v, reason: collision with root package name */
    public int f145483v;

    /* renamed from: w, reason: collision with root package name */
    public int f145484w;

    /* renamed from: x, reason: collision with root package name */
    public final android.widget.AdapterView.OnItemClickListener f145485x = new com.p314xaae8f345.mm.p648x55baa833.ui.tb(this);

    /* renamed from: y, reason: collision with root package name */
    public pn.m f145486y = null;

    public static java.lang.String U6(com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var, java.lang.String str) {
        return a3Var == null ? "" : a3Var.z0(str);
    }

    public final void T6(java.lang.String str) {
        if (str == null || str.equals("")) {
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(str);
        com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.a b17 = ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi(this.f145472h).b(this.f145472h, linkedList, 0);
        b17.f273779b = new com.p314xaae8f345.mm.p648x55baa833.ui.vb(this);
        b17.f273780c = new com.p314xaae8f345.mm.p648x55baa833.ui.wb(this);
        b17.c(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.i4_), true, true, new com.p314xaae8f345.mm.p648x55baa833.ui.xb(this, b17));
    }

    public int V6(android.content.Context context) {
        if (context == null) {
            return 0;
        }
        int width = (int) ((((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay().getWidth() - (context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561409hp) * 1.0f)) / ((int) ((context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561417hx) * 2.0f) + context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561423i3))));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SeeRoomMemberUI", "[getWrapColNum] :%s", java.lang.Integer.valueOf(width));
        f145467z = width;
        return width;
    }

    @Override // pn.a
    public void Z0() {
        if (this.f145470f != null) {
            mo54450xbf7c1df6(this.f145471g + "(" + this.f145470f.A0().size() + ")");
        }
    }

    @Override // pn.a
    public void d1() {
        com.p314xaae8f345.mm.p2621x8fb0427b.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        java.lang.String str = this.f145473i;
        if (str == null) {
            str = this.f145472h;
        }
        this.f145470f = a17.z0(str);
        qy.i iVar = (qy.i) i95.n0.c(qy.i.class);
        java.lang.String str2 = this.f145472h;
        ((py.a) iVar).getClass();
        runOnUiThread(new com.p314xaae8f345.mm.p648x55baa833.ui.ub(this, c01.v1.m(str2)));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cjb;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54450xbf7c1df6(this.f145471g + "(" + this.f145482u + ")");
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p648x55baa833.ui.ob(this));
        this.f145480s = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) findViewById(com.p314xaae8f345.mm.R.id.f567598k13);
        android.widget.GridView gridView = (android.widget.GridView) findViewById(com.p314xaae8f345.mm.R.id.bgx);
        this.f145468d = gridView;
        gridView.setNumColumns(V6(this));
        this.f145468d.setColumnWidth(getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561409hp));
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = this.f145470f;
        java.lang.String str = this.f145472h;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(null)) {
            throw null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.ja m07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ka) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).hj()).m0("@t.qq.com");
        if (m07 != null) {
            linkedList.add(m07.f276591b);
        }
        this.f145469e = new com.p314xaae8f345.mm.p648x55baa833.ui.cc(this, this, a3Var, str, linkedList, this.f145479r);
        this.f145480s.addTextChangedListener(new com.p314xaae8f345.mm.p648x55baa833.ui.pb(this));
        this.f145468d.setOnItemClickListener(this.f145485x);
        this.f145468d.setOnItemLongClickListener(new com.p314xaae8f345.mm.p648x55baa833.ui.sb(this));
        this.f145468d.setAdapter((android.widget.ListAdapter) this.f145469e);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        boolean z17 = true;
        if (i17 != 1) {
            if (i17 == 2) {
                if (intent == null) {
                    return;
                }
                T6(intent.getStringExtra("Select_Contact"));
                return;
            } else {
                if (i17 == 132412 && intent != null) {
                    java.lang.String stringExtra = intent.getStringExtra("intent_key_invitation_reason");
                    pn.m mVar = this.f145486y;
                    if (mVar != null) {
                        mVar.b(stringExtra != null ? stringExtra : "", com.p314xaae8f345.mm.R.C30867xcad56011.g2b);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (intent == null) {
            return;
        }
        java.lang.String stringExtra2 = intent.getStringExtra("Select_Contact");
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5.LocalHistoryInfo localHistoryInfo = (com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5.LocalHistoryInfo) intent.getParcelableExtra("select_record_msg_info");
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(this.f145472h) && !c01.e2.E(this.f145472h) && !c01.t1.a(stringExtra2)) {
            db5.e1.s(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.i5c), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv));
            return;
        }
        java.lang.String r17 = c01.z1.r();
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (!(r17 != null ? r17 : "").equals(stringExtra2)) {
            qy.i iVar = (qy.i) i95.n0.c(qy.i.class);
            java.lang.String str = this.f145472h;
            ((py.a) iVar).getClass();
            java.util.List m17 = c01.v1.m(str);
            boolean z19 = false;
            if (m17 != null) {
                java.util.Iterator it = m17.iterator();
                while (it.hasNext()) {
                    if (((java.lang.String) it.next()).equals(stringExtra2)) {
                        z19 = true;
                    }
                }
            }
            z17 = z19;
        }
        if (z17) {
            db5.e1.s(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571373d8), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv));
        } else {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra2.split(",")) == null) {
                return;
            }
            this.f145486y = new pn.m(this, this.f145472h, intent.getStringExtra("Select_Contact"), localHistoryInfo, intent.getLongExtra("select_record_fake_msg_id", 0L), this);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f145468d.setNumColumns(V6(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(219L, 2L, 1L, true);
        gm0.j1.n().f354821b.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.yc.f35026x366c91de, this);
        this.f145472h = getIntent().getStringExtra("RoomInfo_Id");
        this.f145473i = getIntent().getStringExtra("Chat_User");
        getIntent().getStringExtra("Chatroom_member_list");
        this.f145476o = getIntent().getBooleanExtra("Is_Chatroom", true);
        this.f145477p = getIntent().getBooleanExtra("Is_Lbsroom", false);
        this.f145481t = getIntent().getBooleanExtra("Is_RoomOwner", false);
        this.f145479r = getIntent().getStringExtra("room_owner_name");
        this.f145471g = getIntent().getStringExtra("Add_address_titile");
        com.p314xaae8f345.mm.p2621x8fb0427b.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        java.lang.String str = this.f145473i;
        if (str == null) {
            str = this.f145472h;
        }
        this.f145470f = a17.z0(str);
        this.f145482u = getIntent().getIntExtra("room_member_count", 0);
        this.f145478q = getIntent().getStringExtra("room_name");
        this.f145483v = getIntent().getIntExtra("offset", 0);
        this.f145484w = getIntent().getIntExtra("first_pos", 0);
        mo43517x10010bd5();
        if (this.f145469e != null) {
            d1();
            this.f145468d.setSelection(this.f145484w * f145467z < this.f145469e.getCount() ? this.f145484w * f145467z : this.f145469e.getCount() - 1);
            this.f145468d.postDelayed(new com.p314xaae8f345.mm.p648x55baa833.ui.nb(this), 100L);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        gm0.j1.n().f354821b.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.yc.f35026x366c91de, this);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.mm.p648x55baa833.ui.cc ccVar = this.f145469e;
        if (ccVar != null) {
            ccVar.c(this.f145480s.getText().toString());
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        tm.a b17 = tm.a.b(str);
        if (b17 != null) {
            b17.c(this, null, null);
        }
    }
}
