package com.tencent.mm.plugin.account.friend.ui;

/* loaded from: classes15.dex */
public class FindMContactInviteUI extends com.tencent.mm.ui.MMWizardActivity {

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ListView f73134e;

    /* renamed from: f, reason: collision with root package name */
    public r61.n0 f73135f;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f73137h;

    /* renamed from: t, reason: collision with root package name */
    public int f73146t;

    /* renamed from: u, reason: collision with root package name */
    public java.util.List f73147u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f73148v;

    /* renamed from: g, reason: collision with root package name */
    public android.app.ProgressDialog f73136g = null;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f73138i = null;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f73139m = null;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f73140n = null;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f73141o = null;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.Button f73142p = null;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f73143q = null;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f73144r = null;

    /* renamed from: s, reason: collision with root package name */
    public int f73145s = 2;

    /* renamed from: w, reason: collision with root package name */
    public boolean f73149w = true;

    /* renamed from: x, reason: collision with root package name */
    public final r61.l0 f73150x = new s61.s(this);

    public static void Z6(com.tencent.mm.plugin.account.friend.ui.FindMContactInviteUI findMContactInviteUI) {
        findMContactInviteUI.hideVKB();
        if (findMContactInviteUI.f73135f.c() != 0) {
            db5.e1.u(findMContactInviteUI, findMContactInviteUI.getString(com.tencent.mm.R.string.cgf), "", new s61.a0(findMContactInviteUI), new s61.n(findMContactInviteUI));
            return;
        }
        n71.a.e(findMContactInviteUI.f73148v);
        findMContactInviteUI.hideVKB();
        findMContactInviteUI.W6(1);
    }

    public final void a7() {
        this.f73136g = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.gwe), true, true, new s61.q(this));
        gm0.j1.e().g(new s61.r(this));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ad8;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.jmw)).setText(com.tencent.mm.R.string.gwc);
        this.f73134e = (android.widget.ListView) findViewById(com.tencent.mm.R.id.jmy);
        int i17 = this.f73145s;
        if (i17 == 2) {
            android.view.View inflate = android.view.LayoutInflater.from(this).inflate(com.tencent.mm.R.layout.ad9, (android.view.ViewGroup) null);
            this.f73137h = inflate;
            this.f73138i = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.g5n);
            this.f73139m = (android.widget.TextView) this.f73137h.findViewById(com.tencent.mm.R.id.g5q);
            this.f73140n = (android.widget.TextView) this.f73137h.findViewById(com.tencent.mm.R.id.e57);
            this.f73142p = (android.widget.Button) this.f73137h.findViewById(com.tencent.mm.R.id.f484401e56);
            this.f73139m.setText(getString(com.tencent.mm.R.string.cgl));
            this.f73140n.setText(getString(com.tencent.mm.R.string.cgi));
            this.f73142p.setText(getString(com.tencent.mm.R.string.cgg, 0));
            this.f73141o = (android.widget.TextView) this.f73137h.findViewById(com.tencent.mm.R.id.jmr);
        } else if (i17 == 1) {
            android.view.View inflate2 = android.view.LayoutInflater.from(this).inflate(com.tencent.mm.R.layout.ad_, (android.view.ViewGroup) null);
            this.f73137h = inflate2;
            this.f73138i = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.g5n);
            this.f73139m = (android.widget.TextView) this.f73137h.findViewById(com.tencent.mm.R.id.g5q);
            this.f73140n = (android.widget.TextView) this.f73137h.findViewById(com.tencent.mm.R.id.e57);
            this.f73142p = (android.widget.Button) this.f73137h.findViewById(com.tencent.mm.R.id.f484401e56);
            this.f73139m.setText(getString(com.tencent.mm.R.string.cgi));
            this.f73140n.setText(getString(com.tencent.mm.R.string.cgi));
            this.f73142p.setText(getString(com.tencent.mm.R.string.cgh));
        } else {
            android.view.View inflate3 = android.view.LayoutInflater.from(this).inflate(com.tencent.mm.R.layout.ad9, (android.view.ViewGroup) null);
            this.f73137h = inflate3;
            this.f73138i = (android.widget.TextView) inflate3.findViewById(com.tencent.mm.R.id.g5n);
            this.f73139m = (android.widget.TextView) this.f73137h.findViewById(com.tencent.mm.R.id.g5q);
            this.f73140n = (android.widget.TextView) this.f73137h.findViewById(com.tencent.mm.R.id.e57);
            this.f73142p = (android.widget.Button) this.f73137h.findViewById(com.tencent.mm.R.id.f484401e56);
            this.f73139m.setText(getString(com.tencent.mm.R.string.cgl));
            this.f73140n.setText(getString(com.tencent.mm.R.string.cgi));
            this.f73142p.setText(getString(com.tencent.mm.R.string.cgg, 0));
            this.f73141o = (android.widget.TextView) this.f73137h.findViewById(com.tencent.mm.R.id.jmr);
        }
        this.f73135f = new r61.n0(this, this.f73150x, 2);
        this.f73142p.setOnClickListener(new s61.t(this));
        android.widget.TextView textView = this.f73141o;
        if (textView != null) {
            textView.setOnClickListener(new s61.u(this));
            this.f73141o.setVisibility(8);
        }
        this.f73134e.addHeaderView(this.f73137h);
        this.f73134e.setAdapter((android.widget.ListAdapter) this.f73135f);
        this.f73134e.setOnScrollListener(new bb5.a());
        this.f73134e.setOnTouchListener(new s61.v(this));
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490441v5), new s61.w(this));
        setToTop(new s61.x(this));
    }

    @Override // com.tencent.mm.ui.MMWizardActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.cgk);
        ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
        com.tencent.mm.ui.vb.e();
        this.f73143q = getIntent().getStringExtra("regsetinfo_ticket");
        this.f73146t = getIntent().getIntExtra("login_type", 0);
        this.f73145s = getIntent().getIntExtra("regsetinfo_NextStyle", 2);
        this.f73148v = n71.a.a();
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        bb5.g gVar;
        if (this.f73144r != null) {
            gm0.j1.d().q(com.tencent.wxmm.v2helper.EMethodSetSendToNetworkOn, this.f73144r);
            this.f73144r = null;
        }
        r61.n0 n0Var = this.f73135f;
        if (n0Var != null && (gVar = n0Var.f392917o) != null) {
            gVar.a();
            n0Var.f392917o = null;
        }
        ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
        gm0.j1.b().c();
        m61.k.Ai().getClass();
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        n71.a.e(this.f73148v);
        hideVKB();
        W6(1);
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.f73146t == 1) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            gm0.j1.b();
            sb6.append(gm0.m.e());
            sb6.append(",");
            sb6.append(getClass().getName());
            sb6.append(",R300_400_QQ,");
            gm0.j1.b();
            sb6.append(gm0.m.f("R300_400_QQ"));
            sb6.append(",2");
            n71.a.c(10645, false, sb6.toString());
            return;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb7.append(gm0.m.e());
        sb7.append(",");
        sb7.append(getClass().getName());
        sb7.append(",R300_400_phone,");
        gm0.j1.b();
        sb7.append(gm0.m.f("R300_400_phone"));
        sb7.append(",2");
        n71.a.c(10645, false, sb7.toString());
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FindMContactInviteUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FindMContactInviteUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 48) {
            return;
        }
        if (iArr[0] == 0) {
            a7();
        } else {
            this.f73149w = false;
            db5.e1.C(this, getString(com.tencent.mm.R.string.hhf), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.f490347sg), false, new s61.o(this), new s61.p(this));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f73135f.notifyDataSetChanged();
        if (this.f73146t == 1) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            gm0.j1.b();
            sb6.append(gm0.m.e());
            sb6.append(",");
            sb6.append(getClass().getName());
            sb6.append(",R300_400_QQ,");
            gm0.j1.b();
            sb6.append(gm0.m.f("R300_400_QQ"));
            sb6.append(",1");
            n71.a.c(10645, true, sb6.toString());
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            gm0.j1.b();
            sb7.append(gm0.m.e());
            sb7.append(",");
            sb7.append(getClass().getName());
            sb7.append(",R300_400_phone,");
            gm0.j1.b();
            sb7.append(gm0.m.f("R300_400_phone"));
            sb7.append(",1");
            n71.a.c(10645, true, sb7.toString());
        }
        if (this.f73149w) {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            boolean a17 = j35.u.a(this, "android.permission.READ_CONTACTS", 48, null, null);
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i("MicroMsg.FindMContactInviteUI", "summerper checkPermission checkContacts[%b],stack[%s]", valueOf, new com.tencent.mm.sdk.platformtools.z3());
            if (a17) {
                a7();
            }
        }
    }
}
