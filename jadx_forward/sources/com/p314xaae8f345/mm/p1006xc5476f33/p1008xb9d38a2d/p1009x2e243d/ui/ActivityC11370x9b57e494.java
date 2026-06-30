package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui;

/* renamed from: com.tencent.mm.plugin.account.bind.ui.MobileFriendUI */
/* loaded from: classes11.dex */
public class ActivityC11370x9b57e494 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f154615o = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f154616d;

    /* renamed from: e, reason: collision with root package name */
    public p61.z3 f154617e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f154618f;

    /* renamed from: h, reason: collision with root package name */
    public r61.t1 f154620h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f154621i;

    /* renamed from: g, reason: collision with root package name */
    public android.app.ProgressDialog f154619g = null;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f154622m = null;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f154623n = null;

    public static void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11370x9b57e494 activityC11370x9b57e494, int i17) {
        activityC11370x9b57e494.getClass();
        if (r61.q0.b() != js.x0.SUCC && r61.q0.b() != js.x0.SUCC_UNLOAD) {
            android.view.View view = activityC11370x9b57e494.f154618f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/account/bind/ui/MobileFriendUI", "setShowView", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/account/bind/ui/MobileFriendUI", "setShowView", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            activityC11370x9b57e494.f154618f.setOnClickListener(new p61.n4(activityC11370x9b57e494));
            activityC11370x9b57e494.f154616d.setVisibility(8);
            activityC11370x9b57e494.f154622m.setVisibility(8);
            return;
        }
        if (activityC11370x9b57e494.f154617e.getCount() <= 0) {
            activityC11370x9b57e494.f154622m.setVisibility(0);
            activityC11370x9b57e494.f154616d.setVisibility(8);
            android.view.View view2 = activityC11370x9b57e494.f154618f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/account/bind/ui/MobileFriendUI", "setShowView", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/account/bind/ui/MobileFriendUI", "setShowView", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        activityC11370x9b57e494.f154622m.setVisibility(8);
        activityC11370x9b57e494.f154616d.setVisibility(0);
        android.view.View view3 = activityC11370x9b57e494.f154618f;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/account/bind/ui/MobileFriendUI", "setShowView", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/account/bind/ui/MobileFriendUI", "setShowView", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void U6() {
        android.app.ProgressDialog progressDialog;
        if (r61.q0.h()) {
            return;
        }
        this.f154619g = db5.e1.Q(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.gwe), true, true, new p61.q4(this));
        if (r61.q0.a()) {
            y61.e eVar = (y61.e) i95.n0.c(y61.e.class);
            p61.r4 r4Var = new p61.r4(this);
            ((m61.i) eVar).getClass();
            if (x51.e.a(r4Var) || (progressDialog = this.f154619g) == null) {
                return;
            }
            progressDialog.dismiss();
            this.f154619g = null;
            return;
        }
        java.util.List g17 = r61.q0.g();
        java.util.List e17 = r61.q0.e();
        if (((java.util.ArrayList) g17).size() == 0 && ((java.util.ArrayList) e17).size() == 0) {
            gm0.j1.d().g(new r61.h1());
        } else {
            this.f154620h = new r61.t1(r61.q0.g(), r61.q0.e());
            gm0.j1.d().g(this.f154620h);
        }
    }

    public void V6(r61.a aVar) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.i())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MobileFriendUI", "username is null");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", aVar.i());
        intent.putExtra("Contact_Nick", aVar.g());
        intent.putExtra("Contact_Mobile_MD5", aVar.e());
        intent.putExtra("Contact_Alias", aVar.A);
        intent.putExtra("Contact_Sex", aVar.f474339v);
        intent.putExtra("Contact_Signature", aVar.f474342y);
        intent.putExtra("Contact_RegionCode", com.p314xaae8f345.mm.p2621x8fb0427b.ha.q(aVar.E, aVar.f474340w, aVar.f474341x));
        intent.putExtra("Contact_Scene", 13);
        intent.putExtra("Contact_ShowUserName", false);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.l(intent, this);
    }

    public final void W6() {
        if (fp.h.c(26)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MobileFriendUI", "onCreateAfterMPermissionGranted() checkContacts(android.Manifest.permission.WRITE_CONTACTS)[%b]", java.lang.Boolean.TRUE);
        }
        U6();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.b1.f(13, 33);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c1y;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.jmw);
        this.f154622m = textView;
        textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.gwc);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dfn);
        this.f154623n = textView2;
        textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.gxl);
        this.f154618f = findViewById(com.p314xaae8f345.mm.R.id.jmz);
        this.f154616d = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.jmy);
        com.p314xaae8f345.mm.ui.p2740x696c9db.c9 c9Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.c9(true, true);
        c9Var.f291857i = new p61.s4(this);
        m78489xd6d59aa8(true, c9Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MobileFriendUI", "ABTest Type, NEW(%B)", java.lang.Boolean.TRUE);
        p61.h4 h4Var = new p61.h4(this, new p61.t4(this));
        this.f154617e = h4Var;
        this.f154616d.setAdapter((android.widget.ListAdapter) h4Var);
        this.f154616d.setOnItemClickListener(new p61.u4(this));
        ((p61.h4) this.f154617e).f433816p = new p61.v4(this);
        if (r61.q0.b() != js.x0.SUCC && r61.q0.b() != js.x0.SUCC_UNLOAD) {
            android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.jmz);
            this.f154618f = findViewById;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/account/bind/ui/MobileFriendUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/account/bind/ui/MobileFriendUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f154618f.setOnClickListener(new p61.i4(this));
            this.f154616d.setVisibility(8);
        }
        mo54448x9c8c0d33(new p61.j4(this));
        m78597x53c22598(new p61.k4(this));
        if (!((c01.z1.p() & 131072) == 0) || r61.q0.h()) {
            db5.e1.j(this, com.p314xaae8f345.mm.R.C30867xcad56011.afr, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1, com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg, new p61.l4(this), new p61.m4(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.gwg);
        ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
        m61.k.wi().f474352d.A("qqlist", "update addr_upload2 set reserved4=0");
        gm0.j1.d().a(32, this);
        gm0.j1.d().a(133, this);
        mo43517x10010bd5();
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        boolean a17 = j35.u.a(this, "android.permission.READ_CONTACTS", 48, null, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MobileFriendUI", "summerper checkPermission checkContacts(android.Manifest.permission.READ_CONTACTS)[%b]", java.lang.Boolean.valueOf(a17));
        if (a17) {
            W6();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        gm0.j1.d().q(32, this);
        gm0.j1.d().q(133, this);
        this.f154617e.c();
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MobileFriendUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MobileFriendUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 48) {
            return;
        }
        if (iArr[0] == 0) {
            W6();
        } else {
            db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhf), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new p61.o4(this), new p61.p4(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f154617e.notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        android.app.ProgressDialog progressDialog;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MobileFriendUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        if (m1Var.mo808xfb85f7b0() == 32 && (progressDialog = this.f154619g) != null) {
            progressDialog.dismiss();
            this.f154619g = null;
        }
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MobileFriendUI", "onSceneEnd: errType = " + i17 + ", errCode = " + i18);
        }
        if (m1Var.mo808xfb85f7b0() == 133) {
            gm0.j1.d().g(new r61.h1());
        }
        if (i17 == 0 && i18 == 0) {
            if (m1Var.mo808xfb85f7b0() == 32) {
                ((y61.e) i95.n0.c(y61.e.class)).getClass();
            }
            this.f154617e.f();
        } else if (m1Var.mo808xfb85f7b0() == 32) {
            dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.gwd, 0).show();
        }
    }
}
