package com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui;

/* renamed from: com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI */
/* loaded from: classes12.dex */
public class ActivityC16486x3260b8cc extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.sdk.p2603x2137b148.q7, com.p314xaae8f345.mm.p944x882e457a.x0, com.p314xaae8f345.mm.p944x882e457a.y0 {

    /* renamed from: q, reason: collision with root package name */
    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.C21000x8b2f716 f230058q;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.C16485x4d1368bb f230059d;

    /* renamed from: f, reason: collision with root package name */
    public kf3.k0 f230061f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.GestureDetectorOnGestureListenerC21510x15ed9d8c f230062g;

    /* renamed from: h, reason: collision with root package name */
    public sl.j f230063h;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f230065m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.LinearLayout f230066n;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f230060e = null;

    /* renamed from: i, reason: collision with root package name */
    public boolean f230064i = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f230067o = false;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.AdapterView.OnItemLongClickListener f230068p = new kf3.o0(this);

    public final boolean T6(java.lang.String str) {
        iz5.a.g(null, str != null);
        f230058q.b(this);
        if3.y n07 = if3.k0.Ai().n0(str);
        if (!c01.d9.b().E() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n07.d())) {
            db5.t7.k(this, null);
            return false;
        }
        if (this.f230063h == null) {
            this.f230063h = new sl.j(this, 0);
        }
        this.f230063h.h(false);
        if (!this.f230063h.g(n07.d(), this.f230064i, false, -1)) {
            dp.a.m125854x26a183b(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.b58), 0).show();
            return false;
        }
        ym1.f.Ai("music").A(this.f230064i);
        sl.j jVar = this.f230063h;
        jVar.f490576p = this;
        jVar.f490575o = this;
        return true;
    }

    public final void U6() {
        f230058q.a();
        this.f230063h.h(false);
        kf3.k0 k0Var = this.f230061f;
        k0Var.f388911q = "";
        k0Var.notifyDataSetChanged();
        this.f230059d.setKeepScreenOn(false);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.y0
    public void a() {
        U6();
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.q7
    public void f1(boolean z17) {
        sl.j jVar = this.f230063h;
        if (jVar == null) {
            return;
        }
        if (!jVar.c()) {
            this.f230063h.f(true);
            ym1.f.Ai("music").A(true);
            this.f230064i = true;
            return;
        }
        this.f230063h.f(z17);
        ym1.f.Ai("music").A(z17);
        this.f230064i = z17;
        if (z17) {
            return;
        }
        if (T6(this.f230061f.f388911q)) {
            kf3.k0 k0Var = this.f230061f;
            k0Var.f388911q = k0Var.f388911q;
            k0Var.notifyDataSetChanged();
        } else {
            kf3.k0 k0Var2 = this.f230061f;
            k0Var2.f388911q = "";
            k0Var2.notifyDataSetChanged();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bwz;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        getIntent().getBooleanExtra("finish_direct", false);
        this.f230066n = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.jcw);
        com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.C16485x4d1368bb c16485x4d1368bb = (com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.C16485x4d1368bb) findViewById(com.p314xaae8f345.mm.R.id.jcf);
        this.f230059d = c16485x4d1368bb;
        c16485x4d1368bb.setTranscriptMode(0);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.GestureDetectorOnGestureListenerC21510x15ed9d8c gestureDetectorOnGestureListenerC21510x15ed9d8c = (com.p314xaae8f345.mm.ui.p2642x2e06d1.GestureDetectorOnGestureListenerC21510x15ed9d8c) findViewById(com.p314xaae8f345.mm.R.id.jcg);
        this.f230062g = gestureDetectorOnGestureListenerC21510x15ed9d8c;
        gestureDetectorOnGestureListenerC21510x15ed9d8c.m79095x31e25658(new kf3.v0(this));
        this.f230062g.m79098x563f5e7a(true);
        this.f230062g.m79078x1c273745(new kf3.w0(this));
        this.f230062g.m79079xcab5c565(new kf3.x0(this));
        this.f230062g.m79085xcc8bf2ed(true);
        kf3.k0 k0Var = new kf3.k0(this, this.f230060e);
        this.f230061f = k0Var;
        k0Var.f294144h = new kf3.y0(this);
        this.f230065m = findViewById(com.p314xaae8f345.mm.R.id.jce);
        this.f230059d.setAdapter((android.widget.ListAdapter) this.f230061f);
        this.f230059d.setOnTouchListener(new kf3.z0(this));
        this.f230059d.setOnItemLongClickListener(this.f230068p);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.jcv);
        if (textView != null) {
            com.p314xaae8f345.mm.ui.bk.s0(textView.getPaint());
        }
        this.f230066n.setOnClickListener(new kf3.a1(this));
        ((android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.jcx)).setOnClickListener(new kf3.b1(this));
        mo54448x9c8c0d33(new kf3.m0(this));
        m78478x84f07bce(0, com.p314xaae8f345.mm.R.C30867xcad56011.f572088ye, com.p314xaae8f345.mm.R.raw.f78368xa86f0fea, new kf3.n0(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MassSendHistoryUI", "onActivityResult requestCode:%s", java.lang.Integer.valueOf(i17));
        if (i17 == 1) {
            this.f230067o = true;
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.x0
    /* renamed from: onCompletion */
    public void mo11229xa6db431b() {
        U6();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.gt9);
        this.f230067o = true;
        if (f230058q == null) {
            f230058q = new com.p314xaae8f345.mm.sdk.p2603x2137b148.C21000x8b2f716(getApplicationContext());
        }
        this.f230060e = getIntent().getStringExtra("INTENT_POSITION_MASS_INFO");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MassSendHistoryUI", "getIntent enterHighLightMsgId:" + this.f230060e);
        mo43517x10010bd5();
        sl.j jVar = new sl.j(this, 0);
        this.f230063h = jVar;
        jVar.f490576p = this;
        jVar.f490575o = this;
        this.f230061f.f388915u = new kf3.u0(this);
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39322x2305be9;
        if (gaVar != null) {
            gaVar.f290176f0 = 3;
            gaVar.f290180h0 = false;
        }
        this.f230059d.postDelayed(new kf3.t0(this), 200L);
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (android.widget.AdapterView.AdapterContextMenuInfo) contextMenuInfo;
        java.lang.String[] split = ((if3.y) this.f230061f.getItem(adapterContextMenuInfo.position)).e().split(";");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.lang.String str : split) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str, true);
            if (n17 != null) {
                sb6.append(n17.g2() + ";");
            }
        }
        contextMenu.setHeaderTitle(sb6.toString());
        contextMenu.add(adapterContextMenuInfo.position, 1, 0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        U6();
        sl.j jVar = this.f230063h;
        if (jVar != null) {
            jVar.f490576p = null;
            jVar.f490575o = null;
            jVar.i();
            this.f230063h = null;
        }
        this.f230061f.c();
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        if3.k0.Ai().mo49775xc84af884(this.f230061f);
        f230058q.a();
        sl.j jVar = this.f230063h;
        if (jVar != null && jVar.c()) {
            U6();
        }
        this.f230067o = false;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if3.k0.Ai().add(this.f230061f);
        this.f230061f.f();
        if (this.f230067o) {
            this.f230059d.setSelection(this.f230061f.getCount() - 1);
        }
    }
}
