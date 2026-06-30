package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui;

/* renamed from: com.tencent.mm.plugin.account.friend.ui.RecommendFriendUI */
/* loaded from: classes8.dex */
public class ActivityC11378xa7f41e6e extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f154694p = 0;

    /* renamed from: e, reason: collision with root package name */
    public s61.c0 f154696e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ListView f154697f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f154698g;

    /* renamed from: n, reason: collision with root package name */
    public boolean f154702n;

    /* renamed from: d, reason: collision with root package name */
    public android.app.ProgressDialog f154695d = null;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f154699h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f154700i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public int f154701m = -1;

    /* renamed from: o, reason: collision with root package name */
    public boolean f154703o = false;

    public final void T6() {
        iz5.a.g("dealGetInviteFriendGroupSuccess just only qq", this.f154701m == 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecommendFriendUI", "dealGetInviteFriendGroupSuccess  respList.size:" + this.f154700i.size());
        s61.c0 c0Var = this.f154696e;
        c0Var.f484866f = this.f154700i;
        this.f154697f.setAdapter((android.widget.ListAdapter) c0Var);
        mo74408xb0dfae51(false);
        this.f154702n = true;
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.irk);
        s61.c0 c0Var2 = this.f154696e;
        c0Var2.f484867g = this.f154702n;
        c0Var2.notifyDataSetChanged();
    }

    public final void U6(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecommendFriendUI", "dealGetInviteFriendSuccess  respList.size:" + this.f154699h.size());
        s61.c0 c0Var = this.f154696e;
        java.util.LinkedList linkedList = this.f154699h;
        if (i17 < 0) {
            c0Var.f484865e = linkedList;
        } else {
            c0Var.getClass();
            c0Var.f484865e = new java.util.LinkedList();
            for (int i18 = 0; i18 < linkedList.size(); i18++) {
                if (i17 == ((r45.ku4) linkedList.get(i18)).f460497m) {
                    c0Var.f484865e.add((r45.ku4) linkedList.get(i18));
                }
            }
        }
        c0Var.f484868h = new boolean[c0Var.f484865e.size()];
        this.f154697f.setAdapter((android.widget.ListAdapter) this.f154696e);
        this.f154702n = false;
        if (this.f154701m == 0) {
            java.lang.String str = "";
            for (int i19 = 0; i19 < this.f154700i.size(); i19++) {
                if (i17 == ((r45.e53) this.f154700i.get(i19)).f454552d) {
                    str = ((r45.e53) this.f154700i.get(i19)).f454553e;
                }
            }
            mo54450xbf7c1df6(str);
        }
        s61.c0 c0Var2 = this.f154696e;
        c0Var2.f484867g = this.f154702n;
        c0Var2.notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.blc;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f154698g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dfx);
        int i17 = this.f154701m;
        if (i17 == 1) {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.ix9);
            this.f154698g.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ixc);
        } else if (i17 == 2) {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.ix8);
            this.f154698g.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ixb);
        } else {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.irk);
            this.f154698g.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ixd);
        }
        this.f154696e = new s61.c0(getLayoutInflater());
        android.widget.ListView listView = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.hfc);
        this.f154697f = listView;
        listView.setOnItemClickListener(new s61.l0(this));
        this.f154697f.setAdapter((android.widget.ListAdapter) this.f154696e);
        mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.g27), new s61.o0(this));
        mo74408xb0dfae51(false);
        this.f154703o = true;
        r61.g1 g1Var = new r61.g1(this.f154701m);
        gm0.j1.d().g(g1Var);
        this.f154695d = db5.e1.Q(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g2_), true, true, new s61.r0(this, g1Var));
        mo54448x9c8c0d33(new s61.p0(this));
        m78597x53c22598(new s61.q0(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f154701m = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(getIntent().getStringExtra("recommend_type"), 0);
        this.f154702n = false;
        gm0.j1.d().a(135, this);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        gm0.j1.d().q(135, this);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        if (this.f154701m != 0) {
            finish();
            return true;
        }
        if (this.f154702n || this.f154703o) {
            finish();
            return true;
        }
        T6();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecommendFriendUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        android.app.ProgressDialog progressDialog = this.f154695d;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f154695d = null;
        }
        if (i17 != 0 || i18 != 0 || m1Var.mo808xfb85f7b0() != 135) {
            this.f154698g.setVisibility(0);
            this.f154697f.setVisibility(8);
            return;
        }
        r45.hu4 hu4Var = (r45.hu4) ((r61.g1) m1Var).f474405d.f152244b.f152233a;
        java.util.LinkedList linkedList = hu4Var.f457982e;
        this.f154699h = linkedList;
        this.f154700i = hu4Var.f457984g;
        this.f154703o = false;
        if (linkedList.size() <= 0) {
            this.f154698g.setVisibility(0);
            this.f154697f.setVisibility(8);
        } else if (this.f154701m == 0 && this.f154700i.size() <= 0) {
            this.f154698g.setVisibility(0);
            this.f154697f.setVisibility(8);
        } else if (this.f154701m != 0) {
            U6(-1);
        } else {
            T6();
        }
    }
}
