package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* renamed from: com.tencent.mm.plugin.fts.ui.FTSBaseUI */
/* loaded from: classes12.dex */
public abstract class AbstractActivityC15594x3d6ad6ca extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a implements com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.w0, tj5.w, tj5.n, com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.d0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f219436d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0 f219437e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f219438f;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 f219440h;

    /* renamed from: g, reason: collision with root package name */
    public boolean f219439g = false;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f219441i = null;

    /* renamed from: m, reason: collision with root package name */
    public boolean f219442m = false;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f219443n = "";

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f219444o = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.v0(this);

    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        if (oVar == tj5.o.UserInput) {
            java.lang.String p17 = o13.n.p(str);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f219443n) || !this.f219443n.equals(p17)) {
                V6(p17);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSBaseUI", "Same query %s %s", this.f219443n, p17);
            }
        }
    }

    public boolean G0() {
        mo48674x36654fab();
        this.f219440h.m80997xdc5215a6().d();
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.d0
    public void R3(int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSBaseUI", "onEnd resultCount=%d | isFinished=%b", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        if (z17) {
            if (i17 > 0) {
                a7();
            } else {
                b7();
            }
        } else if (i17 > 0) {
            a7();
        } else {
            c7();
        }
        if (this.f219439g) {
            this.f219439g = false;
            this.f219436d.setSelection(0);
        }
    }

    @Override // tj5.n
    public void U1(boolean z17) {
    }

    public abstract com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0 U6(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.w0 w0Var);

    public void V6(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            e7();
            return;
        }
        this.f219443n = str;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f219444o;
        n3Var.mo50303x856b99f0(1);
        n3Var.mo50307xb9e94560(1, 300L);
    }

    public java.lang.String W6() {
        java.lang.String str = this.f219441i;
        return str != null ? str : getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572082y8);
    }

    public void X6() {
    }

    public void Y6() {
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb92 = new com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92((android.content.Context) this, false);
        this.f219440h = c22482x50bddb92;
        c22482x50bddb92.m81002xcd6a5043(this);
        this.f219440h.m80997xdc5215a6().m80989x764b0e09(W6());
        this.f219440h.m80997xdc5215a6().g();
        this.f219440h.m80997xdc5215a6().m80988xce28f7ee(this);
        this.f219440h.m80997xdc5215a6().m80980x55355581(false);
        mo2533x106ab264().y(this.f219440h);
        this.f219436d = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.mfg);
        if (mo63598x42edd6d6() != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSBaseUI", "searchResultLV addFooterView");
            this.f219436d.addFooterView(mo63598x42edd6d6());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0 U6 = U6(this);
        this.f219437e = U6;
        U6.f219587n = this;
        this.f219436d.setAdapter((android.widget.ListAdapter) U6);
        this.f219436d.setOnScrollListener(this.f219437e);
        this.f219436d.setOnItemClickListener(this.f219437e);
        this.f219436d.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.t0(this));
        this.f219438f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.kcl);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.u0(this));
    }

    public void Z6() {
        this.f219438f.setVisibility(8);
        this.f219436d.setVisibility(8);
    }

    public void a7() {
        this.f219438f.setVisibility(8);
        this.f219436d.setVisibility(0);
    }

    public void b7() {
        this.f219438f.setVisibility(0);
        this.f219438f.setText(o13.q.m(getString(com.p314xaae8f345.mm.R.C30867xcad56011.icq), getString(com.p314xaae8f345.mm.R.C30867xcad56011.icp), this.f219443n));
        this.f219436d.setVisibility(8);
    }

    public void c7() {
        this.f219438f.setVisibility(8);
        this.f219436d.setVisibility(8);
    }

    public void d7() {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0 f0Var = this.f219437e;
        if (f0Var == null) {
            return;
        }
        this.f219439g = true;
        java.lang.String str = this.f219443n;
        f0Var.f219585i = this.f219442m;
        f0Var.o(str, null);
        c7();
    }

    public void e7() {
        this.f219443n = "";
        this.f219444o.mo50303x856b99f0(1);
        this.f219439g = false;
        this.f219437e.p();
        this.f219440h.m80997xdc5215a6().m80989x764b0e09(W6());
        Z6();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.w0
    /* renamed from: getContext */
    public /* bridge */ /* synthetic */ android.content.Context mo63597x76847179() {
        return super.mo55332x76847179();
    }

    /* renamed from: getFooterView */
    public android.view.View mo63598x42edd6d6() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.w0
    /* renamed from: getListView */
    public android.widget.ListView mo63599xcc101dd9() {
        return this.f219436d;
    }

    @Override // tj5.n
    public void o3(int i17, tj5.x xVar) {
    }

    /* renamed from: onClickBackBtn */
    public void mo56568x81ab18cc(android.view.View view) {
        mo48674x36654fab();
        finish();
    }

    /* renamed from: onClickCancelBtn */
    public void m63600x91b34899(android.view.View view) {
    }

    /* renamed from: onClickClearTextBtn */
    public void mo56570x81f2906b(android.view.View view) {
        e7();
        if (this.f219440h.m80997xdc5215a6().k()) {
            mo26063x7b383410();
        } else {
            this.f219440h.m80997xdc5215a6().m();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        m78601x22395ca8();
        mo54450xbf7c1df6("");
        mo64405x4dab7448(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a));
        X6();
        Y6();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        this.f219444o.mo50303x856b99f0(1);
        this.f219437e.g();
        super.onDestroy();
    }

    @Override // tj5.n
    public void x0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSBaseUI", "on tap search key");
    }

    public void x6(android.view.View view, u13.g gVar, boolean z17) {
    }
}
