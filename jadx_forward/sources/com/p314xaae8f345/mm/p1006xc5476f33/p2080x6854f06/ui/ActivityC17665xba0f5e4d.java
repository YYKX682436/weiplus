package com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui;

/* renamed from: com.tencent.mm.plugin.shake.ui.ShakeMsgListUI */
/* loaded from: classes11.dex */
public class ActivityC17665xba0f5e4d extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.a0 f243636e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ListView f243637f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f243638g;

    /* renamed from: n, reason: collision with root package name */
    public int f243642n;

    /* renamed from: o, reason: collision with root package name */
    public long f243643o;

    /* renamed from: d, reason: collision with root package name */
    public c34.u f243635d = null;

    /* renamed from: h, reason: collision with root package name */
    public int f243639h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f243640i = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f243641m = 0;

    /* renamed from: p, reason: collision with root package name */
    public final db5.t4 f243644p = new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.i0(this);

    public final void T6() {
        this.f243638g.setText(com.p314xaae8f345.mm.R.C30867xcad56011.j2y);
        this.f243638g.setVisibility(0);
        m78501x43e00957(false);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cmo;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54450xbf7c1df6(getIntent().getStringExtra("shake_msg_list_title"));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.b0(this));
        mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571886sl), new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.e0(this));
        this.f243638g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dfo);
        if (this.f243640i == 0) {
            T6();
        }
        this.f243637f = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.mr8);
        android.view.View inflate = getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.chj, (android.view.ViewGroup) null);
        inflate.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.f0(this, inflate));
        int i17 = this.f243640i;
        if (i17 > 0 && this.f243639h < i17) {
            this.f243637f.addFooterView(inflate);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.a0 a0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.a0(this);
        this.f243636e = a0Var;
        a0Var.f243770q = this.f243639h;
        this.f243637f.setAdapter((android.widget.ListAdapter) a0Var);
        this.f243637f.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.g0(this));
        this.f243637f.setOnItemLongClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.h0(this, new com.p314xaae8f345.mm.ui.p2740x696c9db.s6(this)));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getIntent().getIntExtra("shake_msg_type", 0);
        c34.u Ri = c34.h0.Ri();
        this.f243635d = Ri;
        int f17 = Ri.f();
        this.f243641m = f17;
        if (f17 == 0) {
            f17 = 8;
        }
        this.f243639h = f17;
        this.f243640i = this.f243635d.mo78086x7444f759();
        int intExtra = getIntent().getIntExtra("shake_msg_from", 1);
        this.f243642n = intExtra;
        if (intExtra == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11313, java.lang.Integer.valueOf(this.f243641m), com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.f1.a());
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11315, java.lang.Integer.valueOf(this.f243641m), com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.f1.a());
        }
        c34.u uVar = this.f243635d;
        uVar.getClass();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("status", (java.lang.Integer) 1);
        uVar.f119776d.p(uVar.mo145255x88e404c3(), contentValues, "status!=? ", new java.lang.String[]{"1"});
        mo43517x10010bd5();
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (android.widget.AdapterView.AdapterContextMenuInfo) contextMenuInfo;
        this.f243643o = ((c34.t) this.f243636e.getItem(adapterContextMenuInfo.position)).f4166x29d4cc45;
        contextMenu.add(adapterContextMenuInfo.position, 0, 0, com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        this.f243636e.c();
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f243640i != this.f243635d.mo78086x7444f759()) {
            int mo78086x7444f759 = this.f243635d.mo78086x7444f759();
            this.f243640i = mo78086x7444f759;
            if (mo78086x7444f759 == 0) {
                T6();
            }
            this.f243636e.q();
        }
        this.f243636e.notifyDataSetChanged();
    }
}
