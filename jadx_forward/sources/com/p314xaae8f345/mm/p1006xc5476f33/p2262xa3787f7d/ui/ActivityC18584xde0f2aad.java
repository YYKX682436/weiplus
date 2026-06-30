package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainBizAcct */
/* loaded from: classes10.dex */
public class ActivityC18584xde0f2aad extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f254408d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f254409e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f254410f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f254411g;

    /* renamed from: h, reason: collision with root package name */
    public int f254412h = 0;

    public static void T6(com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18584xde0f2aad activityC18584xde0f2aad, int i17) {
        if (activityC18584xde0f2aad.f254412h == i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsTeenModeMainBizAcct", "no update, no need data report");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        int i18 = activityC18584xde0f2aad.f254412h;
        java.lang.String str = "Block";
        java.lang.String str2 = i18 != 0 ? i18 != 1 ? i18 != 2 ? "" : "Block" : "Allow" : "Limited";
        if (i17 == 0) {
            str = "Limited";
        } else if (i17 == 1) {
            str = "Allow";
        } else if (i17 != 2) {
            str = "";
        }
        g0Var.d(20917, 3, 1, 1, "OfficialAccounts", str2, str, "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsTeenModeMainBizAcct", "data report ");
    }

    public final void U6() {
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.o0e);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.o0i);
        android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.o0g);
        textView.setContentDescription(getString(com.p314xaae8f345.mm.R.C30867xcad56011.jsu));
        textView2.setContentDescription(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574868js1));
        textView3.setContentDescription(getString(com.p314xaae8f345.mm.R.C30867xcad56011.jsy));
        this.f254408d.setVisibility(8);
        this.f254409e.setVisibility(8);
        this.f254410f.setVisibility(8);
        this.f254411g.setVisibility(4);
        int i17 = this.f254412h;
        if (i17 == 0) {
            this.f254409e.setVisibility(0);
            this.f254411g.setVisibility(0);
            textView2.setContentDescription(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574867js0) + getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574868js1));
        } else if (i17 == 1) {
            this.f254408d.setVisibility(0);
            textView.setContentDescription(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574867js0) + getString(com.p314xaae8f345.mm.R.C30867xcad56011.jsu));
        } else if (i17 == 2) {
            this.f254410f.setVisibility(0);
            textView3.setContentDescription(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574867js0) + getString(com.p314xaae8f345.mm.R.C30867xcad56011.jsy));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsTeenModeMainBizAcct", "doSaveConfig: %s", java.lang.Integer.valueOf(this.f254412h));
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_TEEN_MODE_BIZ_ACCT_RANGE_INT_SYNC, java.lang.Integer.valueOf(this.f254412h));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cm9;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        this.f254408d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.o0d);
        this.f254409e = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.o0h);
        this.f254410f = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.o0f);
        this.f254411g = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.dgw);
        this.f254412h = ((uh4.c0) i95.n0.c(uh4.c0.class)).h4();
        U6();
        ((android.view.View) this.f254408d.getParent()).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.w4(this));
        ((android.view.View) this.f254409e.getParent()).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.x4(this));
        ((android.view.View) this.f254410f.getParent()).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.y4(this));
        this.f254411g.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.z4(this));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.a5(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        r45.zk6 zk6Var = new r45.zk6();
        zk6Var.f473719d = this.f254412h;
        if (((vh4.t1) i95.n0.c(vh4.t1.class)).f518671h != null) {
            r45.cu5 cu5Var = new r45.cu5();
            zk6Var.f473720e = cu5Var;
            cu5Var.d(((vh4.t1) i95.n0.c(vh4.t1.class)).f518671h.getBytes());
        }
        zk6Var.f473721f = ((vh4.t1) i95.n0.c(vh4.t1.class)).f518672i;
        ((e21.f) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).aj()).b(new xg3.p0(224, zk6Var));
        ((uh4.c0) i95.n0.c(uh4.c0.class)).b8();
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }
}
