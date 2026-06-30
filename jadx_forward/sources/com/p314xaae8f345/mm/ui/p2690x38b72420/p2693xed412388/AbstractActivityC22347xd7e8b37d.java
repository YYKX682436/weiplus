package com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388;

@db5.a(m123858x6ac9171 = 32768)
/* renamed from: com.tencent.mm.ui.contact.privacy.ContactMgrUIBase */
/* loaded from: classes10.dex */
public abstract class AbstractActivityC22347xd7e8b37d extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.ui.p2690x38b72420.l4, l75.z0, com.p314xaae8f345.mm.p944x882e457a.u0 {
    public static final /* synthetic */ int E = 0;
    public boolean A;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ListView f288635f;

    /* renamed from: g, reason: collision with root package name */
    public uf5.w0 f288636g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f288637h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f288638i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f288639m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2690x38b72420.C22293x1808c434 f288640n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.EditText f288641o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.Button f288642p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.Button f288643q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.Button f288644r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f288645s;

    /* renamed from: t, reason: collision with root package name */
    public int f288646t;

    /* renamed from: x, reason: collision with root package name */
    public int f288650x;

    /* renamed from: y, reason: collision with root package name */
    public int f288651y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f288652z;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f288633d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f288634e = new java.util.ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f288647u = null;

    /* renamed from: v, reason: collision with root package name */
    public final int f288648v = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMBatchModContactTypeMaxNumForServer", 30);

    /* renamed from: w, reason: collision with root package name */
    public final int f288649w = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMBatchModContactTypeMaxNumForClient", 30);
    public final android.os.Handler B = new android.os.Handler(android.os.Looper.getMainLooper());
    public final java.lang.Runnable C = new uf5.k0(this);
    public final uf5.j1 D = new uf5.j1(this);

    public android.widget.ListView O3() {
        return this.f288635f;
    }

    public abstract uf5.w0 T6(com.p314xaae8f345.mm.ui.p2690x38b72420.l4 l4Var);

    public java.lang.CharSequence U6() {
        return getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hlf);
    }

    public abstract void V6();

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public java.lang.String W5(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        return null;
    }

    public abstract void W6();

    public void X6(android.content.Intent intent, android.content.Context context) {
    }

    public abstract boolean Y6(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17);

    public abstract void Z6(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17);

    public void a7(android.content.Intent intent, android.content.Context context) {
    }

    public void b7(android.content.Intent intent) {
        intent.putExtra("already_select_contact", (java.lang.String[]) this.f288633d.toArray(new java.lang.String[0]));
        intent.putExtra("privacy_del_tips", this.f288645s);
        intent.putExtra("privacy_source_type", this.f288636g.v());
    }

    public void c7() {
        if (this.f288652z) {
            this.f288652z = false;
            android.widget.Toast.makeText(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hld), 0).show();
        }
        if (this.A) {
            this.A = false;
            android.widget.Toast.makeText(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hle), 0).show();
        }
    }

    public void d7() {
        if (this.f288652z) {
            this.f288652z = false;
            android.widget.Toast.makeText(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571421ej), 0).show();
        }
        if (this.A) {
            this.A = false;
            android.widget.Toast.makeText(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571424em), 0).show();
        }
    }

    public void e7() {
        this.f288640n.m80405x92401221(this.f288636g.u());
        this.f288637h.setVisibility(this.f288636g.u() == 0 ? 0 : 8);
        this.f288643q.setEnabled(this.f288636g.u() > 0);
    }

    public synchronized void f7() {
        this.B.removeCallbacksAndMessages(null);
        this.B.post(this.C);
    }

    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactMgrUIBase", "onNotifyChange: event = " + i17 + " stg = " + a1Var + " obj = " + obj);
        if (i17 == 4) {
            g7();
        }
    }

    public synchronized void g7() {
        this.B.removeCallbacksAndMessages(null);
        this.B.postDelayed(this.C, 350L);
    }

    /* renamed from: getActivity */
    public android.app.Activity mo8774x19263085() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c_y;
    }

    public void h7() {
    }

    public void i7() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c8, code lost:
    
        if ("@social.black.android".equals(r5) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x003c, code lost:
    
        if (r9 != 6) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r9 != 6) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        r9 = false;
     */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(int r8, int r9, android.content.Intent r10) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56583xbf7c1df6(U6());
        this.f288635f = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.f567413jf5);
        m78597x53c22598(new uf5.l0(this));
        this.f288637h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dfx);
        this.f288638i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f564983aw0);
        this.f288636g = T6(this);
        this.f288639m = findViewById(com.p314xaae8f345.mm.R.id.meq);
        java.lang.String stringExtra = getIntent().getStringExtra("intent_status_show_bottom_tips");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            this.f288638i.setVisibility(8);
        } else {
            this.f288638i.setText(stringExtra);
            this.f288638i.setVisibility(0);
        }
        this.f288635f.setOnItemClickListener(new uf5.m0(this));
        this.f288635f.setOnItemLongClickListener(new uf5.p0(this));
        this.f288635f.setOnTouchListener(new uf5.q0(this));
        this.f288635f.setAdapter((android.widget.ListAdapter) this.f288636g);
        android.widget.ListView listView = this.f288635f;
        com.p314xaae8f345.mm.ui.p2690x38b72420.C22293x1808c434 c22293x1808c434 = new com.p314xaae8f345.mm.ui.p2690x38b72420.C22293x1808c434(this);
        this.f288640n = c22293x1808c434;
        listView.addFooterView(c22293x1808c434, null, false);
        this.f288640n.m80406xcd1079b0(false);
        ((com.p314xaae8f345.mm.p648x55baa833.ui.C10371xec3c2bd0) findViewById(com.p314xaae8f345.mm.R.id.jft)).m79298x40d747ee(new uf5.r0(this));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) findViewById(com.p314xaae8f345.mm.R.id.mjh);
        this.f288641o = c22621x7603e017;
        c22621x7603e017.addTextChangedListener(new uf5.t0(this));
        android.view.View view = this.f288639m;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/contact/privacy/ContactMgrUIBase", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/contact/privacy/ContactMgrUIBase", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f288642p = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.f564225lf);
        this.f288643q = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.f566989hq1);
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.crz);
        this.f288644r = button;
        button.setEnabled(false);
        this.f288642p.setVisibility(0);
        this.f288643q.setVisibility(0);
        this.f288644r.setVisibility(8);
        this.f288642p.setOnClickListener(new uf5.u0(this));
        this.f288643q.setOnClickListener(new uf5.v0(this));
        mo54448x9c8c0d33(new uf5.h0(this));
        e7();
        gm0.j1.i();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(3990, this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        this.D.c();
        gm0.j1.i();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this);
        gm0.j1.i();
        gm0.j1.n().f354821b.q(3990, this);
        this.f288636g.k();
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactMgrUIBase", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str + ", scene type = " + m1Var.mo808xfb85f7b0());
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public boolean p5(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        return false;
    }

    public boolean t4(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        if (!(dVar instanceof com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u)) {
            return false;
        }
        return ((java.util.LinkedList) this.f288636g.f508851r).contains(((com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u) dVar).f288352z);
    }
}
