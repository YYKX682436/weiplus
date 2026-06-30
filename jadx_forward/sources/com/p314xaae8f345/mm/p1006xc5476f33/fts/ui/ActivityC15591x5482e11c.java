package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.fts.ui.FTSAddWw */
/* loaded from: classes12.dex */
public class ActivityC15591x5482e11c extends com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca {
    public static final /* synthetic */ int P = 0;
    public android.widget.TextView A;
    public android.widget.TextView B;
    public boolean C;
    public boolean D;
    public com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.ViewOnClickListenerC15621xc82ac57 F;
    public com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.j H;
    public long I;

    /* renamed from: J, reason: collision with root package name */
    public r45.cx5 f219422J;
    public int K;
    public android.app.Dialog L;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f219424q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f219425r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f219426s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f219427t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f219428u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f219429v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f219430w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.ImageView f219431x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f219432y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f219433z;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f219423p = "";
    public int E = 1;
    public java.lang.String G = "";
    public int M = -1;
    public final q01.e N = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a0(this);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca, tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        super.C3(str, str2, list, oVar);
        this.C = false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca, tj5.n
    public boolean G0() {
        f7(this.f219443n);
        mo48674x36654fab();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca
    public com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0 U6(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.w0 w0Var) {
        if (this.H == null) {
            this.H = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.j(w0Var);
        }
        return this.H;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca
    public void Y6() {
        super.Y6();
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.y(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca
    public void d7() {
        super.d7();
        android.view.View view = this.f219425r;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddWw", "startSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSAddWw", "startSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca
    public void e7() {
        super.e7();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6802x562a2fb9 c6802x562a2fb9 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6802x562a2fb9();
        c6802x562a2fb9.p(this.G);
        c6802x562a2fb9.f141325e = 3L;
        c6802x562a2fb9.k();
        android.view.View view = this.f219425r;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddWw", "stopSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSAddWw", "stopSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void f7(java.lang.String str) {
        this.C = true;
        this.D = false;
        this.E = 1;
        if (str == null || str.length() == 0 || str.trim().length() == 0) {
            return;
        }
        this.M = java.lang.Character.isDigit(str.charAt(0)) ? 15 : 3;
        this.K = 0;
        ((za0.k) ((ab0.b0) i95.n0.c(ab0.b0.class))).getClass();
        l41.e0 e0Var = new l41.e0(str, 1);
        gm0.j1.d().g(e0Var);
        this.L = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.icm), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.b0(this, e0Var));
    }

    public final void g7() {
        java.lang.String str = this.f219422J.f453433d;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if ((str == null ? "" : str).length() > 0) {
            int i17 = this.f219422J.f453441o;
            if (2 == i17) {
                this.M = 15;
            } else if (1 == i17) {
                this.M = 1;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", str);
            intent.putExtra("AntispamTicket", this.f219422J.f453443q);
            if (this.M == 15 && 2 == this.f219422J.f453441o) {
                intent.putExtra("Contact_Search_Mobile", this.f219423p.trim());
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f219422J.f453444r)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSAddFriendUI", "FinderUsername is empty");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSAddFriendUI", "FinderUsername is " + this.f219422J.f453444r);
            }
            intent.putExtra("key_add_contact_openim_appid", this.f219422J.f453440n);
            intent.putExtra("key_add_contact_openim_finder_username", this.f219422J.f453444r);
            intent.putExtra("Contact_Nick", this.f219422J.f453434e);
            intent.putExtra("Contact_PyInitial", this.f219422J.f453435f);
            intent.putExtra("Contact_QuanPin", this.f219422J.f453436g);
            intent.putExtra("Contact_Sex", this.f219422J.f453437h);
            intent.putExtra("key_add_contact_custom_detail_visible", this.f219422J.f453442p.f451928d);
            intent.putExtra("key_add_contact_custom_detail", this.f219422J.f453442p.f451929e);
            intent.putExtra("Contact_Scene", this.M);
            intent.putExtra("key_ww_add_session_id", this.G);
            intent.putExtra("add_more_friend_search_scene", 2);
            j45.l.j(this, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bbs;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6802x562a2fb9 c6802x562a2fb9 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6802x562a2fb9();
        c6802x562a2fb9.p(this.G);
        c6802x562a2fb9.f141325e = 2L;
        c6802x562a2fb9.k();
        finish();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca, tj5.w
    /* renamed from: onClickBackBtn */
    public void mo56568x81ab18cc(android.view.View view) {
        super.mo56568x81ab18cc(view);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6802x562a2fb9 c6802x562a2fb9 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6802x562a2fb9();
        c6802x562a2fb9.p(this.G);
        c6802x562a2fb9.f141325e = 2L;
        c6802x562a2fb9.k();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca, tj5.n
    /* renamed from: onClickClearTextBtn */
    public void mo56570x81f2906b(android.view.View view) {
        super.mo56570x81f2906b(view);
        if (this.f219440h.m80997xdc5215a6().k()) {
            return;
        }
        this.f219440h.m80997xdc5215a6().m();
        mo26063x7b383410();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.G = kk.k.g((java.lang.System.currentTimeMillis() + "").getBytes());
        o13.p.f423783c = o13.n.g(16);
        android.transition.Transition inflateTransition = android.transition.TransitionInflater.from(this).inflateTransition(android.R.transition.fade);
        inflateTransition.excludeTarget(getWindow().getDecorView().findViewById(com.p314xaae8f345.mm.R.id.f563968ei), true);
        inflateTransition.excludeTarget(android.R.id.statusBarBackground, true);
        getWindow().setEnterTransition(inflateTransition);
        mo64405x4dab7448(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a07));
        mo78530x8b45058f();
        this.f219441i = mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bkh);
        this.f219440h.m80997xdc5215a6().m80989x764b0e09(W6());
        this.f219424q = findViewById(com.p314xaae8f345.mm.R.id.ago);
        this.f219425r = findViewById(com.p314xaae8f345.mm.R.id.cag);
        this.f219426s = findViewById(com.p314xaae8f345.mm.R.id.f566745gx3);
        this.f219430w = findViewById(com.p314xaae8f345.mm.R.id.cah);
        this.f219427t = findViewById(com.p314xaae8f345.mm.R.id.f567676kc2);
        this.f219428u = findViewById(com.p314xaae8f345.mm.R.id.ji8);
        this.f219429v = findViewById(com.p314xaae8f345.mm.R.id.mdu);
        this.F = (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.ViewOnClickListenerC15621xc82ac57) findViewById(com.p314xaae8f345.mm.R.id.lts);
        this.f219431x = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.ca7);
        this.f219432y = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.cfq);
        this.f219433z = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.cal);
        this.A = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.cam);
        this.B = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.mdw);
        try {
            java.lang.String optString = su4.o2.d("webSearchBar").optString("wording");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSAddFriendUI", "set searchNetworkTips %s", optString);
            this.B.setText(optString);
        } catch (java.lang.Exception unused) {
        }
        m78513xc2a54588().postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.w(this), 128L);
        this.f219424q.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.x(this));
        gm0.j1.d().o(vb1.e.f77260x366c91de, this, this.N);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (!this.C || this.D) {
            return;
        }
        su4.k3.c(this.f219443n, this.E, 3, 16);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        su4.r2.o();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca, com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.w0
    public void x6(android.view.View view, u13.g gVar, boolean z17) {
        if (!(gVar instanceof e23.c) || java.lang.System.currentTimeMillis() - this.I <= 1000) {
            return;
        }
        this.I = java.lang.System.currentTimeMillis();
        this.f219423p = gVar.i();
        f7(gVar.i());
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6802x562a2fb9 c6802x562a2fb9 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6802x562a2fb9();
        c6802x562a2fb9.p(this.G);
        c6802x562a2fb9.f141325e = 1L;
        c6802x562a2fb9.k();
    }
}
