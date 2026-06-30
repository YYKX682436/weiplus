package com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui;

/* renamed from: com.tencent.mm.plugin.shake.ui.ShakeSayHiListUI */
/* loaded from: classes11.dex */
public class ActivityC17679x4e14a258 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.g f243746e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ListView f243747f;

    /* renamed from: i, reason: collision with root package name */
    public long f243750i;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.qa f243745d = null;

    /* renamed from: g, reason: collision with root package name */
    public int f243748g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f243749h = 0;

    /* renamed from: m, reason: collision with root package name */
    public final db5.t4 f243751m = new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.k0(this);

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bps;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        android.view.View inflate = getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.chj, (android.view.ViewGroup) null);
        this.f243747f = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.m_0);
        inflate.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.l0(this, inflate));
        mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571886sl), new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.o0(this));
        if (this.f243749h == 0) {
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dfo);
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.i8k);
            textView.setVisibility(0);
            m78501x43e00957(false);
        }
        int i17 = this.f243749h;
        if (i17 > 0 && this.f243748g < i17) {
            this.f243747f.addFooterView(inflate);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.g gVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.g(this, this.f243745d, this.f243748g);
        this.f243746e = gVar;
        gVar.f243801s = new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.p0(this);
        gVar.f243800r = new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.q0(this);
        gVar.f243802t = new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.r0(this);
        this.f243747f.setAdapter((android.widget.ListAdapter) gVar);
        this.f243747f.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.s0(this));
        this.f243747f.setOnItemLongClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.t0(this, new com.p314xaae8f345.mm.ui.p2740x696c9db.s6(this)));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.u0(this));
        m78597x53c22598(new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.v0(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getIntExtra("IntentSayHiType", 1) == 1) {
            this.f243745d = r21.w.Di();
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.i8j);
        } else {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.i8h);
        }
        int f17 = this.f243745d.f();
        if (f17 == 0) {
            f17 = 8;
        }
        this.f243748g = f17;
        this.f243749h = this.f243745d.mo78086x7444f759();
        com.p314xaae8f345.mm.p2621x8fb0427b.qa qaVar = this.f243745d;
        qaVar.getClass();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("status", (java.lang.Integer) 4);
        if (qaVar.f276784d.p(qaVar.mo145255x88e404c3(), contentValues, "status!=? ", new java.lang.String[]{"4"}) != 0) {
            qaVar.m145262xf35bbb4();
        }
        mo43517x10010bd5();
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (android.widget.AdapterView.AdapterContextMenuInfo) contextMenuInfo;
        this.f243750i = ((com.p314xaae8f345.mm.p2621x8fb0427b.pa) this.f243746e.getItem(adapterContextMenuInfo.position)).f66546x29d4cc45;
        contextMenu.add(adapterContextMenuInfo.position, 0, 0, com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        this.f243746e.c();
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        db5.c6 c6Var = this.f243746e.f243803u;
        if (c6Var != null) {
            c6Var.c();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f243749h != this.f243745d.mo78086x7444f759()) {
            int mo78086x7444f759 = this.f243745d.mo78086x7444f759();
            this.f243749h = mo78086x7444f759;
            if (mo78086x7444f759 == 0) {
                android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dfo);
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.i8k);
                textView.setVisibility(0);
                m78501x43e00957(false);
            }
            this.f243746e.q();
        }
        this.f243746e.notifyDataSetChanged();
    }
}
