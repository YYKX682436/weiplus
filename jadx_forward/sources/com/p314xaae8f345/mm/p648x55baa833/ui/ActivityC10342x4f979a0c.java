package com.p314xaae8f345.mm.p648x55baa833.ui;

/* renamed from: com.tencent.mm.chatroom.ui.DelChatroomMemberUI */
/* loaded from: classes11.dex */
public class ActivityC10342x4f979a0c extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f145279d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p648x55baa833.ui.v2 f145280e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f145281f;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.a3 f145284i;

    /* renamed from: m, reason: collision with root package name */
    public int f145285m;

    /* renamed from: n, reason: collision with root package name */
    public int f145286n;

    /* renamed from: o, reason: collision with root package name */
    public int f145287o;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 f145291s;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f145282g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f145283h = new java.util.ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public boolean f145288p = false;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.a f145289q = null;

    /* renamed from: r, reason: collision with root package name */
    public android.app.ProgressDialog f145290r = null;

    public static com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.a T6(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10342x4f979a0c activityC10342x4f979a0c, java.lang.String str, boolean z17) {
        activityC10342x4f979a0c.getClass();
        if (str == null || str.equals("")) {
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(str);
        com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.a b17 = ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi(activityC10342x4f979a0c.f145281f).b(activityC10342x4f979a0c.f145281f, linkedList, activityC10342x4f979a0c.f145285m);
        b17.f273779b = new com.p314xaae8f345.mm.p648x55baa833.ui.k2(activityC10342x4f979a0c, str, z17, linkedList);
        b17.f273780c = new com.p314xaae8f345.mm.p648x55baa833.ui.n2(activityC10342x4f979a0c, str);
        if (z17) {
            b17.b();
            return b17;
        }
        b17.c(activityC10342x4f979a0c, activityC10342x4f979a0c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC10342x4f979a0c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i4_), true, true, new com.p314xaae8f345.mm.p648x55baa833.ui.o2(activityC10342x4f979a0c, b17));
        return b17;
    }

    public static void U6(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10342x4f979a0c activityC10342x4f979a0c, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17, java.util.List list, int i18, int i19, int i27, java.lang.String str) {
        activityC10342x4f979a0c.getClass();
        vg3.j4 j4Var = (vg3.j4) i95.n0.c(vg3.j4.class);
        java.lang.String str2 = activityC10342x4f979a0c.f145281f;
        int size = list != null ? list.size() : 0;
        long E1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(f9Var != null ? f9Var.Y1() : "");
        ((y04.e) j4Var).getClass();
        a14.h.a(str2, size, i18, i17, i19, i27, E1, str);
    }

    public static gd0.f V6(java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17, java.lang.String str2, o65.f fVar) {
        if (f9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DelChatroomMemberUI", "revokeRecord msgInfo is null");
            return null;
        }
        r45.qw3 qw3Var = new r45.qw3();
        qw3Var.f465844d = f9Var.I0();
        qw3Var.f465845e = java.lang.Long.parseLong(f9Var.Y1());
        qw3Var.f465846f = str;
        qw3Var.f465847g = i17;
        if (i17 == 2) {
            qw3Var.f465848h = str2;
        }
        qw3Var.f465849i = c01.y1.a(c01.z1.r(), f9Var.mo78012x3fdd41df());
        ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).getClass();
        com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.h hVar = new com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.h(true);
        xg3.p0 p0Var = new xg3.p0(com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50628x98affc23, qw3Var);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(p0Var);
        hVar.f273799f = new e21.k(linkedList);
        hVar.f273781d = fVar;
        hVar.b();
        return hVar;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569938se;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.i4q);
        this.f145279d = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.f567424jg1);
        com.p314xaae8f345.mm.p648x55baa833.ui.v2 v2Var = new com.p314xaae8f345.mm.p648x55baa833.ui.v2(this);
        this.f145280e = v2Var;
        java.util.LinkedList<java.lang.String> linkedList = this.f145282g;
        if (linkedList != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DelChatroomMemberAdapter", "initData members.size %d", java.lang.Integer.valueOf(linkedList.size()));
            java.util.LinkedList linkedList2 = (java.util.LinkedList) v2Var.f146122d;
            linkedList2.clear();
            for (java.lang.String str : linkedList) {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
                if (n17 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.d1()) && n17.d1().equals(str)) {
                    linkedList2.add(n17);
                }
            }
        }
        this.f145279d.setAdapter((android.widget.ListAdapter) this.f145280e);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p648x55baa833.ui.i2(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f145281f = getIntent().getStringExtra("RoomInfo_Id");
        this.f145285m = getIntent().getIntExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
        this.f145286n = getIntent().getIntExtra("local_scene", 0);
        this.f145287o = getIntent().getIntExtra("select_record_report_opt", 0);
        this.f145288p = getIntent().getBooleanExtra("revoke_record", false);
        if (this.f145286n == 1) {
            this.f145291s = pt0.f0.Li(this.f145281f, getIntent().getLongExtra("msg_id", -1L));
        }
        java.lang.String stringExtra = getIntent().getStringExtra("members");
        this.f145283h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.O1(getIntent().getStringExtra("origin_members"), ",");
        for (java.lang.String str : stringExtra.split(",")) {
            this.f145282g.add(str);
        }
        this.f145284i = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f145281f);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DelChatroomMemberUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
    }
}
