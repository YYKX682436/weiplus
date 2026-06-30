package com.p314xaae8f345.mm.p648x55baa833.ui;

/* renamed from: com.tencent.mm.chatroom.ui.SeeRoomManagerUI */
/* loaded from: classes11.dex */
public class ActivityC10364x5bffdef3 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements l75.q0 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f145461i = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.GridView f145462d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.a3 f145463e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f145464f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p648x55baa833.ui.lb f145465g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f145466h;

    public static void T6(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10364x5bffdef3 activityC10364x5bffdef3, java.util.List list) {
        mo.b v07;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SeeRoomManagerUI", "[delRoomManagerSuccessful] roomName:%s size:%s", activityC10364x5bffdef3.f145464f, java.lang.Integer.valueOf(list.size()));
        java.util.LinkedList linkedList = new java.util.LinkedList(activityC10364x5bffdef3.f145465g.f145842d);
        ((java.util.ArrayList) activityC10364x5bffdef3.f145465g.f145842d).clear();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p648x55baa833.ui.ib ibVar = (com.p314xaae8f345.mm.p648x55baa833.ui.ib) it.next();
            int i17 = ibVar.f145767a;
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = ibVar.f145768b;
            if (i17 == 1 && !list.contains(z3Var.d1())) {
                ((java.util.ArrayList) activityC10364x5bffdef3.f145465g.f145842d).add(ibVar);
            } else if (ibVar.f145767a == 1 && list.contains(z3Var.d1()) && (v07 = activityC10364x5bffdef3.f145463e.v0(z3Var.d1())) != null) {
                v07.f411782f &= -2049;
            }
        }
        ((java.util.ArrayList) activityC10364x5bffdef3.f145465g.f145842d).add(new com.p314xaae8f345.mm.p648x55baa833.ui.ib(activityC10364x5bffdef3, 2, null));
        if (((java.util.ArrayList) activityC10364x5bffdef3.f145465g.f145842d).size() > 1) {
            ((java.util.ArrayList) activityC10364x5bffdef3.f145465g.f145842d).add(new com.p314xaae8f345.mm.p648x55baa833.ui.ib(activityC10364x5bffdef3, 3, null));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SeeRoomManagerUI", "[delRoomManagerSuccessful] roomName:%s size:%s mAdapter.dataList size:%s", activityC10364x5bffdef3.f145464f, java.lang.Integer.valueOf(list.size()), activityC10364x5bffdef3.f145465g.f145842d);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SeeRoomManagerUI", "[delRoomManagerSuccessful] ret:%s", java.lang.Boolean.valueOf(((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().mo11260x413cb2b4(activityC10364x5bffdef3.f145463e)));
    }

    public static void U6(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10364x5bffdef3 activityC10364x5bffdef3, java.util.List list) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SeeRoomManagerUI", "[addRoomManagerSuccessful] roomName:%s size:%s", activityC10364x5bffdef3.f145464f, java.lang.Integer.valueOf(list.size()));
        java.util.LinkedList linkedList = new java.util.LinkedList(activityC10364x5bffdef3.f145465g.f145842d);
        ((java.util.ArrayList) activityC10364x5bffdef3.f145465g.f145842d).clear();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p648x55baa833.ui.ib ibVar = (com.p314xaae8f345.mm.p648x55baa833.ui.ib) it.next();
            if (ibVar.f145767a == 1) {
                ((java.util.ArrayList) activityC10364x5bffdef3.f145465g.f145842d).add(ibVar);
            }
        }
        java.util.Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n((java.lang.String) it6.next(), true);
            ((java.util.ArrayList) activityC10364x5bffdef3.f145465g.f145842d).add(new com.p314xaae8f345.mm.p648x55baa833.ui.ib(activityC10364x5bffdef3, 1, n17));
            mo.b v07 = activityC10364x5bffdef3.f145463e.v0(n17.d1());
            if (v07 != null) {
                v07.f411782f |= 2048;
            }
        }
        ((java.util.ArrayList) activityC10364x5bffdef3.f145465g.f145842d).add(new com.p314xaae8f345.mm.p648x55baa833.ui.ib(activityC10364x5bffdef3, 2, null));
        if (((java.util.ArrayList) activityC10364x5bffdef3.f145465g.f145842d).size() > 1) {
            ((java.util.ArrayList) activityC10364x5bffdef3.f145465g.f145842d).add(new com.p314xaae8f345.mm.p648x55baa833.ui.ib(activityC10364x5bffdef3, 3, null));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SeeRoomManagerUI", "[addRoomManagerSuccessful] roomName:%s size:%s mAdapter.dataList size:%s", activityC10364x5bffdef3.f145464f, java.lang.Integer.valueOf(list.size()), activityC10364x5bffdef3.f145465g.f145842d);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SeeRoomManagerUI", "[addRoomManagerSuccessful] ret:%s", java.lang.Boolean.valueOf(((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().mo11260x413cb2b4(activityC10364x5bffdef3.f145463e)));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cj_;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        super.mo43517x10010bd5();
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.i58);
        this.f145462d = (android.widget.GridView) findViewById(com.p314xaae8f345.mm.R.id.jbi);
        com.p314xaae8f345.mm.p648x55baa833.ui.lb lbVar = new com.p314xaae8f345.mm.p648x55baa833.ui.lb(this, this);
        this.f145465g = lbVar;
        this.f145462d.setAdapter((android.widget.ListAdapter) lbVar);
        this.f145462d.setOnTouchListener(new com.p314xaae8f345.mm.p648x55baa833.ui.bb(this));
        this.f145462d.post(new com.p314xaae8f345.mm.p648x55baa833.ui.cb(this));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p648x55baa833.ui.db(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (intent == null || i18 != -1) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Boolean.valueOf(intent == null);
            objArr[1] = java.lang.Integer.valueOf(i18);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SeeRoomManagerUI", "[onActivityResult] data is null? %s resultCode:%s", objArr);
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SeeRoomManagerUI", "[onActivityResult] roomName:%s requestCode:%s userListString:%s", this.f145464f, java.lang.Integer.valueOf(i17), stringExtra);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SeeRoomManagerUI", "[onActivityResult] userListString is null!");
            return;
        }
        java.lang.String[] split = stringExtra.split(",");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.lang.String str : split) {
            linkedList.add(str);
        }
        if (i17 == 0) {
            this.f145466h = db5.e1.Q(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.i3n), true, false, null);
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(this.f145464f)) {
                pq5.g l17 = new kn.b(this.f145464f, linkedList).l();
                l17.f(this);
                l17.h(new com.p314xaae8f345.mm.p648x55baa833.ui.eb(this, linkedList));
                return;
            } else {
                pq5.g l18 = new kn.f(this.f145464f, linkedList).l();
                l18.f(this);
                l18.h(new com.p314xaae8f345.mm.p648x55baa833.ui.fb(this, linkedList));
                return;
            }
        }
        if (i17 != 1) {
            return;
        }
        this.f145466h = db5.e1.Q(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.i49), true, false, null);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(this.f145464f)) {
            pq5.g l19 = new kn.e(this.f145464f, linkedList).l();
            l19.f(this);
            l19.h(new com.p314xaae8f345.mm.p648x55baa833.ui.gb(this, linkedList));
        } else {
            pq5.g l27 = new kn.g(this.f145464f, linkedList).l();
            l27.f(this);
            l27.h(new com.p314xaae8f345.mm.p648x55baa833.ui.hb(this, linkedList));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().add(this);
        this.f145464f = getIntent().getStringExtra("RoomInfo_Id");
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().mo49775xc84af884(this);
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        if (w0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SeeRoomManagerUI", "[onNotifyChange] event:%s [%s:%s]", str, w0Var.f398506a, java.lang.Integer.valueOf(w0Var.f398507b));
        }
    }
}
