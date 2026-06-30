package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* renamed from: com.tencent.mm.plugin.account.ui.RegSetInfoUI */
/* loaded from: classes14.dex */
public class ActivityC11466x7d774b0 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public static final /* synthetic */ int V = 0;
    public android.widget.ImageView A;
    public android.widget.ProgressBar B;
    public android.widget.ImageView D;
    public android.view.View E;
    public android.widget.TextView F;
    public db5.d5 I;

    /* renamed from: J, reason: collision with root package name */
    public android.view.View f155161J;
    public x51.f L;
    public java.lang.String M;
    public int N;
    public java.lang.String P;
    public java.lang.String Q;
    public java.lang.String R;
    public int S;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.EditText f155162d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.EditText f155163e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f155164f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f155166h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f155167i;

    /* renamed from: m, reason: collision with root package name */
    public int f155168m;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f155170o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f155171p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f155172q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f155173r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f155174s;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.ImageView f155177v;

    /* renamed from: y, reason: collision with root package name */
    public int f155180y;

    /* renamed from: g, reason: collision with root package name */
    public android.app.ProgressDialog f155165g = null;

    /* renamed from: n, reason: collision with root package name */
    public int f155169n = 0;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2641xabe4e85a.C21463x46cf9db f155175t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f155176u = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f155178w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f155179x = 3;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.LinkedList f155181z = new java.util.LinkedList();
    public java.lang.String C = "";
    public java.lang.String G = null;
    public boolean H = false;
    public boolean K = false;
    public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6968xc4cd5a52 T = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6968xc4cd5a52();
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 U = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.myLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.yg(this), true);

    public static void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11466x7d774b0 activityC11466x7d774b0) {
        com.p314xaae8f345.mm.p957x53236a1b.z0 z0Var;
        activityC11466x7d774b0.P = activityC11466x7d774b0.f155162d.getText().toString().trim();
        activityC11466x7d774b0.Q = activityC11466x7d774b0.f155163e.getText().toString().trim();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC11466x7d774b0.P)) {
            db5.e1.i(activityC11466x7d774b0, com.p314xaae8f345.mm.R.C30867xcad56011.f574967k60, com.p314xaae8f345.mm.R.C30867xcad56011.hwx);
            return;
        }
        if (activityC11466x7d774b0.B.getVisibility() == 0) {
            activityC11466x7d774b0.f155165g = db5.e1.Q(activityC11466x7d774b0, activityC11466x7d774b0.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC11466x7d774b0.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hxk), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.rg(activityC11466x7d774b0));
            return;
        }
        if (activityC11466x7d774b0.X6() && activityC11466x7d774b0.Z6() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC11466x7d774b0.Q)) {
            java.lang.String charSequence = activityC11466x7d774b0.f155173r.getText().toString();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(charSequence) || charSequence.equals(activityC11466x7d774b0.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hxy))) {
                charSequence = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC11466x7d774b0.G) ? activityC11466x7d774b0.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574340hy1) : activityC11466x7d774b0.G;
            }
            db5.e1.s(activityC11466x7d774b0, charSequence, "");
            return;
        }
        activityC11466x7d774b0.mo48674x36654fab();
        int V6 = activityC11466x7d774b0.V6();
        gm0.j1.d().a(126, activityC11466x7d774b0);
        if (activityC11466x7d774b0.Z6()) {
            java.util.LinkedList linkedList = activityC11466x7d774b0.f155181z;
            int i17 = (linkedList == null || linkedList.size() == 0) ? 0 : linkedList.contains(activityC11466x7d774b0.Q) ? 1 : 2;
            z0Var = new com.p314xaae8f345.mm.p957x53236a1b.z0("", activityC11466x7d774b0.f155171p, activityC11466x7d774b0.P, activityC11466x7d774b0.f155168m, activityC11466x7d774b0.f155167i, activityC11466x7d774b0.f155166h, "", "", activityC11466x7d774b0.f155170o, V6, activityC11466x7d774b0.Q, "", "", activityC11466x7d774b0.f155176u, activityC11466x7d774b0.f155178w);
            ((o45.bi) z0Var.f152989e.mo47979x2d63726f()).f424442a.f472957z = i17;
        } else {
            z0Var = new com.p314xaae8f345.mm.p957x53236a1b.z0("", activityC11466x7d774b0.f155171p, activityC11466x7d774b0.P, activityC11466x7d774b0.f155168m, activityC11466x7d774b0.f155167i, activityC11466x7d774b0.f155166h, "", "", activityC11466x7d774b0.f155170o, V6, "", "", "", activityC11466x7d774b0.f155176u, activityC11466x7d774b0.f155178w);
        }
        z0Var.L(activityC11466x7d774b0.M);
        z0Var.M(activityC11466x7d774b0.R);
        ((o45.bi) z0Var.f152989e.mo47979x2d63726f()).f424442a.N = activityC11466x7d774b0.f155180y;
        gm0.j1.d().g(z0Var);
        activityC11466x7d774b0.f155165g = db5.e1.Q(activityC11466x7d774b0, activityC11466x7d774b0.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC11466x7d774b0.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hxk), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.sg(activityC11466x7d774b0, z0Var));
    }

    public final java.lang.String U6() {
        int i17 = this.f155169n;
        if (!(i17 == 1)) {
            if (!(i17 == 4)) {
                return this.f155172q;
            }
        }
        return this.f155166h;
    }

    public final int V6() {
        int i17 = this.f155169n;
        if (i17 == 1) {
            return 4;
        }
        return i17 == 4 ? 1 : 2;
    }

    public final void W6() {
        mo48674x36654fab();
        int i17 = this.f155169n;
        if (i17 == 1) {
            db5.e1.u(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hxs), "", new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.fh(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.gh(this));
            return;
        }
        if (i17 == 0) {
            db5.e1.u(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hxr), "", new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.hh(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ih(this));
            return;
        }
        n71.a.e("R200_100");
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc.class);
        intent.putExtra("mobile_input_purpose", 2);
        intent.addFlags(67108864);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/RegSetInfoUI", "goback", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/account/ui/RegSetInfoUI", "goback", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
    }

    public final boolean X6() {
        return this.A.getVisibility() == 8 || this.H;
    }

    public boolean Y6(int i17, int i18, java.lang.String str) {
        java.lang.String str2;
        if (this.L.c(this, new x51.r1(i17, i18, str))) {
            return true;
        }
        o25.s1 wi6 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        ((com.p314xaae8f345.mm.app.o7) wi6).getClass();
        if (com.p314xaae8f345.mm.ui.pc.a(mo55332x76847179, i17, i18, str, 4)) {
            return true;
        }
        if (i18 == -2023 || i18 == -100) {
            gm0.m.o();
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = mo55332x76847179();
            gm0.j1.b();
            if (android.text.TextUtils.isEmpty(gm0.m.f354768x)) {
                str2 = i65.a.r(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.gqn);
            } else {
                gm0.j1.b();
                str2 = gm0.m.f354768x;
            }
            db5.e1.M(mo55332x768471792, str2, mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.dh(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.eh(this));
            return true;
        }
        if (i18 == -75) {
            db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.f571531i0, com.p314xaae8f345.mm.R.C30867xcad56011.hv6);
            return true;
        }
        if (i18 != -48) {
            if (i18 != -10 && i18 != -7) {
                return false;
            }
            db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.f574326hv5, com.p314xaae8f345.mm.R.C30867xcad56011.hv6);
            return true;
        }
        tm.a b17 = tm.a.b(str);
        if (b17 != null) {
            b17.c(this, null, null);
        } else {
            db5.e1.s(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hxx), "");
        }
        return true;
    }

    public final boolean Z6() {
        return (this.f155179x & 2) > 0;
    }

    public final void a7(boolean z17, boolean z18) {
        boolean z19 = false;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f155163e.getText().toString().trim())) {
            z17 = false;
        }
        this.A.setImageResource(z18 ? com.p314xaae8f345.mm.R.C30861xcebc809e.bne : com.p314xaae8f345.mm.R.C30861xcebc809e.bnb);
        this.A.setVisibility(z17 ? 0 : 8);
        if (z17 && z18) {
            z19 = true;
        }
        this.H = z19;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cdt;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f155161J = findViewById(com.p314xaae8f345.mm.R.id.kzb);
        this.E = findViewById(com.p314xaae8f345.mm.R.id.mnq);
        this.f155177v = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.mnp);
        this.f155162d = (android.widget.EditText) findViewById(com.p314xaae8f345.mm.R.id.lro);
        this.F = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.mns);
        this.f155163e = (android.widget.EditText) findViewById(com.p314xaae8f345.mm.R.id.lrv);
        this.f155173r = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f564468s9);
        this.f155174s = findViewById(com.p314xaae8f345.mm.R.id.lsa);
        this.A = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.pjf);
        this.B = (android.widget.ProgressBar) findViewById(com.p314xaae8f345.mm.R.id.lbj);
        this.D = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.mnr);
        this.f155164f = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.kao);
        this.A.setVisibility(8);
        this.B.setVisibility(8);
        this.D.setVisibility(8);
        this.f155178w = false;
        this.H = false;
        android.view.View view = this.E;
        int i17 = (this.f155179x & 1) > 0 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/RegSetInfoUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/account/ui/RegSetInfoUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f155174s;
        int i18 = Z6() ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/account/ui/RegSetInfoUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/account/ui/RegSetInfoUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f155173r.setVisibility(Z6() ? 0 : 8);
        if (((this.f155179x & 1) > 0) && Z6()) {
            this.F.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.hxw));
        } else {
            if (!((this.f155179x & 1) > 0) || Z6()) {
                if (((this.f155179x & 1) > 0) || !Z6()) {
                    this.F.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.hxt));
                } else {
                    this.F.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.hxv));
                }
            } else {
                this.F.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.hxu));
            }
        }
        gm0.j1.e().g(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.kh(this));
        this.f155162d.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.lh(this));
        this.f155164f.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.mh(this));
        this.f155163e.setOnFocusChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.nh(this));
        this.f155163e.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ph(this));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.qh(this));
        this.f155162d.setOnEditorActionListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.rh(this));
        this.f155162d.setOnKeyListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ng(this));
        this.f155163e.setOnEditorActionListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.og(this));
        this.f155163e.setOnKeyListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.pg(this));
        this.f155177v.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.qg(this));
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(lp0.b.j());
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.b3 b3Var = com.p314xaae8f345.mm.vfs.a3.f294314a;
        com.p314xaae8f345.mm.vfs.z2 m17 = b3Var.m(a17, null);
        if (!(m17.a() ? m17.f294799a.F(m17.f294800b) : false)) {
            com.p314xaae8f345.mm.vfs.z2 m18 = b3Var.m(a17, m17);
            if (m18.a()) {
                m18.f294799a.r(m18.f294800b);
            }
        }
        this.f155164f.setEnabled(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f155162d.getText().toString().trim()));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RegSetInfoUI", "onAcvityResult requestCode:%d, resultCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        android.graphics.Bitmap Vi = ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Vi(this, i17, i18, intent);
        if (Vi != null) {
            this.f155177v.setImageBitmap(Vi);
            this.f155178w = true;
            this.D.setVisibility(0);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.hxz);
        if (o45.wf.f424566k) {
            string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572028wp) + j65.v.b(this);
        } else {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        }
        mo54450xbf7c1df6(string);
        ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
        com.p314xaae8f345.mm.ui.vb.e();
        this.f155166h = getIntent().getStringExtra("regsetinfo_user");
        this.f155167i = getIntent().getStringExtra("regsetinfo_bind_email");
        this.f155170o = getIntent().getStringExtra("regsetinfo_ticket");
        this.f155171p = getIntent().getStringExtra("regsetinfo_pwd");
        this.f155172q = getIntent().getStringExtra("regsetinfo_binduin");
        this.f155180y = getIntent().getIntExtra("mobile_check_type", 0);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f155172q)) {
            this.f155168m = kk.v.b(this.f155172q);
        }
        this.f155169n = getIntent().getExtras().getInt("regsetinfo_ismobile", 0);
        this.f155176u = getIntent().getExtras().getBoolean("regsetinfo_isForce", false);
        this.f155179x = getIntent().getIntExtra("regsetinfo_NextControl", 3);
        this.M = getIntent().getStringExtra("regsession_id");
        this.R = getIntent().getStringExtra("reg_3d_app_ticket");
        this.S = getIntent().getIntExtra("reg_3d_app_type", 0);
        this.N = getIntent().getIntExtra("key_reg_style", 1);
        mo43517x10010bd5();
        if (this.f155169n == 1) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            gm0.j1.b();
            sb6.append(gm0.m.e());
            sb6.append(",");
            sb6.append(getClass().getName());
            sb6.append(",R200_900_phone,");
            gm0.j1.b();
            sb6.append(gm0.m.f("R200_900_phone"));
            sb6.append(",1");
            n71.a.c(10645, true, sb6.toString());
            n71.a.d("R200_900_phone");
        }
        this.K = false;
        this.L = new x51.f();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f155169n == 1) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            gm0.j1.b();
            sb6.append(gm0.m.e());
            sb6.append(",");
            sb6.append(getClass().getName());
            sb6.append(",R200_900_phone,");
            gm0.j1.b();
            sb6.append(gm0.m.f("R200_900_phone"));
            sb6.append(",2");
            n71.a.c(10645, false, sb6.toString());
        }
        x51.f fVar = this.L;
        if (fVar != null) {
            fVar.a();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        W6();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f155162d.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.jh(this), 500L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01e2  */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v6 */
    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo815x76e0bfae(int r26, int r27, java.lang.String r28, com.p314xaae8f345.mm.p944x882e457a.m1 r29) {
        /*
            Method dump skipped, instructions count: 997
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11466x7d774b0.mo815x76e0bfae(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
