package com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui;

/* renamed from: com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI */
/* loaded from: classes11.dex */
public class ActivityC16726x80180cff extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.n1 f233644e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ListView f233645f;

    /* renamed from: o, reason: collision with root package name */
    public an3.f f233651o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f233652p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f233653q;

    /* renamed from: r, reason: collision with root package name */
    public long f233654r;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.u8 f233643d = null;

    /* renamed from: g, reason: collision with root package name */
    public int f233646g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f233647h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f233648i = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f233649m = 0;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f233650n = null;

    /* renamed from: s, reason: collision with root package name */
    public final db5.t4 f233655s = new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.x0(this);

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bps;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        int i17;
        this.f233645f = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.m_0);
        if (!m25.a.c()) {
            android.view.View inflate = getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.chj, (android.view.ViewGroup) null);
            inflate.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.z0(this, inflate));
            int i18 = this.f233647h;
            if (i18 > 0 && this.f233646g < i18) {
                this.f233645f.addFooterView(inflate);
            }
        }
        mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571886sl), new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.c1(this));
        if (this.f233647h == 0) {
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dfo);
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.i8k);
            textView.setVisibility(0);
            m78501x43e00957(false);
        }
        if (this.f233653q && (i17 = this.f233649m) != 0 && this.f233648i >= i17 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P0(this)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.C16721x4d034a70 c16721x4d034a70 = new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.C16721x4d034a70(this);
            this.f233652p = c16721x4d034a70;
            c16721x4d034a70.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.e1(this));
            this.f233645f.addHeaderView(this.f233652p);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.n1 n1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.n1(this, this, this.f233643d, this.f233646g);
        this.f233644e = n1Var;
        n1Var.f233723s = new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.f1(this);
        n1Var.f233722r = new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.g1(this);
        n1Var.f233724t = new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.h1(this);
        this.f233645f.setAdapter((android.widget.ListAdapter) n1Var);
        this.f233645f.setOnItemLongClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.i1(this, new com.p314xaae8f345.mm.ui.p2740x696c9db.s6(this)));
        this.f233645f.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.j1(this));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.k1(this));
        m78597x53c22598(new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.w0(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        setResult(0);
        super.onBackPressed();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f233649m = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("ThresholdToCleanLocation"), 0);
        this.f233653q = getIntent().getBooleanExtra("show_clear_header", false);
        gm0.j1.b().c();
        this.f233643d = (com.p314xaae8f345.mm.p2621x8fb0427b.u8) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Zi();
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.i8h);
        this.f233648i = this.f233643d.f();
        this.f233647h = this.f233643d.mo78086x7444f759();
        if (m25.a.c()) {
            this.f233646g = this.f233647h;
        } else {
            int i17 = this.f233648i;
            if (i17 == 0) {
                i17 = 8;
            }
            this.f233646g = i17;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.u8 u8Var = this.f233643d;
        u8Var.getClass();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("status", (java.lang.Integer) 4);
        if (u8Var.f277798d.p(u8Var.mo145255x88e404c3(), contentValues, "status!=? ", new java.lang.String[]{"4"}) != 0) {
            u8Var.m145262xf35bbb4();
        }
        mo43517x10010bd5();
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (android.widget.AdapterView.AdapterContextMenuInfo) contextMenuInfo;
        com.p314xaae8f345.mm.p2621x8fb0427b.t8 t8Var = (com.p314xaae8f345.mm.p2621x8fb0427b.t8) this.f233644e.getItem(adapterContextMenuInfo.position);
        if (t8Var != null) {
            contextMenu.add(0, 0, 0, com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0);
            this.f233654r = t8Var.f66517x29d4cc45;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SayHiListUI", "onItemLongClick, item is null, pos = " + adapterContextMenuInfo.position);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        this.f233644e.c();
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        gm0.j1.d().q(148, this);
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f233647h != this.f233643d.mo78086x7444f759()) {
            int mo78086x7444f759 = this.f233643d.mo78086x7444f759();
            this.f233647h = mo78086x7444f759;
            if (mo78086x7444f759 == 0) {
                android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dfo);
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.i8k);
                textView.setVisibility(0);
                m78501x43e00957(false);
            }
            this.f233644e.q();
        }
        this.f233644e.notifyDataSetChanged();
        gm0.j1.d().a(148, this);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiListUI", "onSceneEnd: errType=%d, errCode=%d, errMsg=%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f233650n;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f233650n = null;
        }
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SayHiListUI", "[cpan] clear location failed.");
        } else if (((an3.f) m1Var).I() == 2) {
            db5.e1.t(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.h5y), "", new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.y0(this));
            this.f233651o = null;
        }
    }
}
