package com.tencent.mm.plugin.account.friend.ui;

/* loaded from: classes15.dex */
public class FindMContactAddUI extends com.tencent.mm.ui.MMWizardActivity {

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ListView f73116e;

    /* renamed from: f, reason: collision with root package name */
    public r61.n0 f73117f;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f73119h;

    /* renamed from: u, reason: collision with root package name */
    public int f73129u;

    /* renamed from: v, reason: collision with root package name */
    public java.util.List f73130v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f73131w;

    /* renamed from: g, reason: collision with root package name */
    public android.app.ProgressDialog f73118g = null;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f73120i = null;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f73121m = null;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f73122n = null;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f73123o = null;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.Button f73124p = null;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f73125q = null;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f73126r = null;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f73127s = "";

    /* renamed from: t, reason: collision with root package name */
    public int f73128t = 2;

    /* renamed from: x, reason: collision with root package name */
    public boolean f73132x = true;

    /* renamed from: y, reason: collision with root package name */
    public final r61.l0 f73133y = new s61.g(this);

    public static void Z6(com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI findMContactAddUI) {
        findMContactAddUI.hideVKB();
        if (findMContactAddUI.f73117f.c() == 0) {
            db5.e1.A(findMContactAddUI, findMContactAddUI.getString(com.tencent.mm.R.string.cgt), "", findMContactAddUI.getString(com.tencent.mm.R.string.cg6), findMContactAddUI.getString(com.tencent.mm.R.string.cg7), new s61.l(findMContactAddUI), new s61.m(findMContactAddUI));
            return;
        }
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        s61.a aVar = new s61.a(findMContactAddUI);
        findMContactAddUI.f73126r = aVar;
        d17.a(30, aVar);
        findMContactAddUI.f73118g = db5.e1.Q(findMContactAddUI.getContext(), findMContactAddUI.getString(com.tencent.mm.R.string.f490573yv), findMContactAddUI.getString(com.tencent.mm.R.string.cgj), true, true, new s61.b(findMContactAddUI));
        r61.n0 n0Var = findMContactAddUI.f73117f;
        n0Var.getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        int i17 = 0;
        while (true) {
            java.util.LinkedList linkedList3 = n0Var.f392910e;
            if (i17 >= linkedList3.size()) {
                ((ms.a) ((ns.k) i95.n0.c(ns.k.class))).getClass();
                new r35.e4(n0Var.f392909d, null).g(linkedList, linkedList2);
                return;
            } else {
                if (n0Var.f392914i[i17] == 1) {
                    linkedList.add(((r45.g74) linkedList3.get(i17)).f374944e);
                    linkedList2.add(52);
                }
                i17++;
            }
        }
    }

    public final void a7() {
        n71.a.e(this.f73131w);
        hideVKB();
        W6(1);
    }

    public final void b7() {
        this.f73118g = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.gwe), true, true, new s61.e(this));
        gm0.j1.e().g(new s61.f(this));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ad8;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.jmw)).setText(com.tencent.mm.R.string.gwc);
        this.f73116e = (android.widget.ListView) findViewById(com.tencent.mm.R.id.jmy);
        int i17 = this.f73128t;
        if (i17 == 2) {
            android.view.View inflate = android.view.LayoutInflater.from(this).inflate(com.tencent.mm.R.layout.ad9, (android.view.ViewGroup) null);
            this.f73119h = inflate;
            this.f73120i = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.g5n);
            this.f73121m = (android.widget.TextView) this.f73119h.findViewById(com.tencent.mm.R.id.g5q);
            this.f73122n = (android.widget.TextView) this.f73119h.findViewById(com.tencent.mm.R.id.e57);
            this.f73124p = (android.widget.Button) this.f73119h.findViewById(com.tencent.mm.R.id.f484401e56);
            this.f73121m.setText(getString(com.tencent.mm.R.string.f491243ch4));
            this.f73122n.setText(getString(com.tencent.mm.R.string.f491244ch5));
            this.f73124p.setText(getString(com.tencent.mm.R.string.cg8, 0));
            this.f73123o = (android.widget.TextView) this.f73119h.findViewById(com.tencent.mm.R.id.jmr);
        } else if (i17 == 1) {
            android.view.View inflate2 = android.view.LayoutInflater.from(this).inflate(com.tencent.mm.R.layout.ad_, (android.view.ViewGroup) null);
            this.f73119h = inflate2;
            this.f73120i = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.g5n);
            this.f73121m = (android.widget.TextView) this.f73119h.findViewById(com.tencent.mm.R.id.g5q);
            this.f73122n = (android.widget.TextView) this.f73119h.findViewById(com.tencent.mm.R.id.e57);
            this.f73124p = (android.widget.Button) this.f73119h.findViewById(com.tencent.mm.R.id.f484401e56);
            this.f73121m.setText(getString(com.tencent.mm.R.string.f491243ch4));
            this.f73122n.setText(getString(com.tencent.mm.R.string.f491244ch5));
            this.f73124p.setText(getString(com.tencent.mm.R.string.cg9));
        } else {
            android.view.View inflate3 = android.view.LayoutInflater.from(this).inflate(com.tencent.mm.R.layout.ad9, (android.view.ViewGroup) null);
            this.f73119h = inflate3;
            this.f73120i = (android.widget.TextView) inflate3.findViewById(com.tencent.mm.R.id.g5n);
            this.f73121m = (android.widget.TextView) this.f73119h.findViewById(com.tencent.mm.R.id.g5q);
            this.f73122n = (android.widget.TextView) this.f73119h.findViewById(com.tencent.mm.R.id.e57);
            this.f73124p = (android.widget.Button) this.f73119h.findViewById(com.tencent.mm.R.id.f484401e56);
            this.f73121m.setText(getString(com.tencent.mm.R.string.f491243ch4));
            this.f73122n.setText(getString(com.tencent.mm.R.string.f491244ch5));
            this.f73124p.setText(getString(com.tencent.mm.R.string.cg8, 0));
            this.f73123o = (android.widget.TextView) this.f73119h.findViewById(com.tencent.mm.R.id.jmr);
        }
        this.f73117f = new r61.n0(this, this.f73133y, 1);
        this.f73124p.setOnClickListener(new s61.h(this));
        android.widget.TextView textView = this.f73123o;
        if (textView != null) {
            textView.setOnClickListener(new s61.i(this));
            this.f73123o.setVisibility(8);
        }
        this.f73116e.addHeaderView(this.f73119h);
        this.f73116e.setAdapter((android.widget.ListAdapter) this.f73117f);
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490502ww), new s61.j(this));
        setToTop(new s61.k(this));
    }

    @Override // com.tencent.mm.ui.MMWizardActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.cgc);
        ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
        com.tencent.mm.ui.vb.e();
        this.f73125q = getIntent().getStringExtra("regsetinfo_ticket");
        this.f73127s = getIntent().getStringExtra("regsetinfo_NextStep");
        this.f73128t = getIntent().getIntExtra("regsetinfo_NextStyle", 2);
        this.f73129u = getIntent().getIntExtra("login_type", 0);
        this.f73131w = n71.a.a();
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        if (this.f73126r != null) {
            gm0.j1.d().q(30, this.f73126r);
            this.f73126r = null;
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        a7();
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.f73129u == 1) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            gm0.j1.b();
            sb6.append(gm0.m.e());
            sb6.append(",");
            sb6.append(getClass().getName());
            sb6.append(",R300_300_QQ,");
            gm0.j1.b();
            sb6.append(gm0.m.f("R300_300_QQ"));
            sb6.append(",2");
            n71.a.c(10645, false, sb6.toString());
            return;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb7.append(gm0.m.e());
        sb7.append(",");
        sb7.append(getClass().getName());
        sb7.append(",R300_300_phone,");
        gm0.j1.b();
        sb7.append(gm0.m.f("R300_300_phone"));
        sb7.append(",2");
        n71.a.c(10645, false, sb7.toString());
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FindMContactAddUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FindMContactAddUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 48) {
            return;
        }
        if (iArr[0] == 0) {
            b7();
        } else {
            this.f73132x = false;
            db5.e1.C(this, getString(com.tencent.mm.R.string.hhf), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.f490347sg), false, new s61.c(this), new s61.d(this));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f73117f.notifyDataSetChanged();
        if (this.f73129u == 1) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            gm0.j1.b();
            sb6.append(gm0.m.e());
            sb6.append(",");
            sb6.append(getClass().getName());
            sb6.append(",R300_300_QQ,");
            gm0.j1.b();
            sb6.append(gm0.m.f("R300_300_QQ"));
            sb6.append(",1");
            n71.a.c(10645, true, sb6.toString());
            n71.a.d("R300_300_QQ");
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            gm0.j1.b();
            sb7.append(gm0.m.e());
            sb7.append(",");
            sb7.append(getClass().getName());
            sb7.append(",R300_300_phone,");
            gm0.j1.b();
            sb7.append(gm0.m.f("R300_300_phone"));
            sb7.append(",1");
            n71.a.c(10645, true, sb7.toString());
            n71.a.d("R300_300_phone");
        }
        if (this.f73132x) {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            boolean a17 = j35.u.a(this, "android.permission.READ_CONTACTS", 48, null, null);
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i("MicroMsg.FindMContactAddUI", "summerper checkPermission checkContacts[%b],stack[%s]", valueOf, new com.tencent.mm.sdk.platformtools.z3());
            if (a17) {
                b7();
            }
        }
    }
}
