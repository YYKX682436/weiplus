package com.p314xaae8f345.mm.p648x55baa833.ui;

/* renamed from: com.tencent.mm.chatroom.ui.RoomUpgradeUI */
/* loaded from: classes.dex */
public class ActivityC10361xc5a22f5 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f145423x = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f145424d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.ProgressDialog f145425e = null;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f145426f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f145427g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f145428h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f145429i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f145430m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f145431n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f145432o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f145433p;

    /* renamed from: q, reason: collision with root package name */
    public kn.t f145434q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.a3 f145435r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f145436s;

    /* renamed from: t, reason: collision with root package name */
    public int f145437t;

    /* renamed from: u, reason: collision with root package name */
    public int f145438u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f145439v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f145440w;

    public final void T6() {
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10351x9a4a4f60.class);
        intent.addFlags(67108864);
        intent.addFlags(65536);
        intent.putExtra("RoomInfo_Id", this.f145424d);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/chatroom/ui/RoomUpgradeUI", "doUpgrade", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/chatroom/ui/RoomUpgradeUI", "doUpgrade", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void U6() {
        java.lang.String stringExtra = getIntent().getStringExtra("room_name");
        this.f145424d = stringExtra;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoomUpgradeProductsUI", "the roomName is %s", stringExtra);
        gm0.j1.n().f354821b.a(md1.e1.f72846x366c91de, this);
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f145424d);
        this.f145435r = z07;
        if (z07 == null) {
            finish();
        } else {
            this.f145439v = c01.z1.r().equals(this.f145435r.f69107x5be1edb3);
            this.f145440w = !com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.m();
        }
    }

    public final void V6(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        java.lang.String w07 = (n17 == null || ((int) n17.E2) <= 0) ? null : n17.w0();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w07)) {
            com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = this.f145435r;
            w07 = a3Var == null ? null : a3Var.z0(str);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w07) && n17 != null && ((int) n17.E2) > 0) {
            w07 = n17.f2();
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w07)) {
            w07 = str;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.f145429i, str, null);
        this.f145430m.setVisibility(0);
        this.f145430m.setText(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(this, w07, (int) this.f145430m.getTextSize()));
    }

    public final void W6() {
        java.lang.String str = this.f145435r.f69107x5be1edb3;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 == null || ((int) n17.E2) > 0) {
            V6(str);
        } else {
            ((c01.k7) c01.n8.a()).g(str, this.f145424d, 30, new com.p314xaae8f345.mm.p648x55baa833.ui.na(this, str));
        }
        int w07 = this.f145435r.w0();
        this.f145431n.setVisibility(0);
        if (w07 <= 40) {
            this.f145431n.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574439i71, getString(com.p314xaae8f345.mm.R.C30867xcad56011.i6v)));
        } else {
            this.f145431n.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574439i71, getString(com.p314xaae8f345.mm.R.C30867xcad56011.i6u)));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569951sr;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.i6t);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p648x55baa833.ui.ja(this));
        this.f145427g = findViewById(com.p314xaae8f345.mm.R.id.otm);
        this.f145428h = findViewById(com.p314xaae8f345.mm.R.id.oto);
        this.f145429i = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.otl);
        this.f145430m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.otn);
        this.f145431n = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.otj);
        this.f145433p = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.otk);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.oti);
        this.f145432o = textView;
        textView.setOnClickListener(new com.p314xaae8f345.mm.p648x55baa833.ui.ka(this));
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.h1y);
        this.f145426f = textView2;
        textView2.setOnClickListener(new com.p314xaae8f345.mm.p648x55baa833.ui.la(this));
        if (this.f145439v) {
            this.f145425e = db5.e1.Q(this, null, getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), true, true, new com.p314xaae8f345.mm.p648x55baa833.ui.oa(this));
            this.f145434q = new kn.t(this.f145424d);
            gm0.j1.n().f354821b.g(this.f145434q);
        } else {
            W6();
            if (!this.f145440w) {
                this.f145426f.setVisibility(0);
            }
            this.f145426f.setText(com.p314xaae8f345.mm.R.C30867xcad56011.i6w);
            this.f145432o.setVisibility(8);
            this.f145433p.setVisibility(8);
        }
        if (this.f145440w) {
            this.f145426f.setVisibility(8);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 400) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RoomUpgradeProductsUI", "onActivityResult unknow request");
        } else {
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        U6();
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        gm0.j1.n().f354821b.d(this.f145434q);
        gm0.j1.n().f354821b.q(md1.e1.f72846x366c91de, this);
        android.app.ProgressDialog progressDialog = this.f145425e;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        boolean z17;
        if (intent.hasExtra("upgrade_success")) {
            z17 = intent.getBooleanExtra("upgrade_success", false);
        } else {
            if (intent.hasExtra("wizard_activity_result_code") && intent.getIntExtra("wizard_activity_result_code", -1) == -1) {
                T6();
            }
            if (intent.hasExtra("announce_ok")) {
                T6();
            }
            z17 = false;
        }
        if (z17) {
            U6();
            int intExtra = intent.getIntExtra("left_quota", 0);
            W6();
            this.f145432o.setVisibility(8);
            this.f145437t = intExtra;
            if (intExtra > 0) {
                this.f145433p.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.i6z, java.lang.Integer.valueOf(intExtra)));
            } else {
                this.f145433p.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574438i70));
            }
            if (!this.f145440w) {
                this.f145426f.setVisibility(0);
            }
            this.f145426f.setText(com.p314xaae8f345.mm.R.C30867xcad56011.i6w);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        android.app.ProgressDialog progressDialog = this.f145425e;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        if (i17 != 0 || i18 != 0) {
            db5.e1.G(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.i6y), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), false, new com.p314xaae8f345.mm.p648x55baa833.ui.pa(this));
            return;
        }
        if (i17 == 0 && i18 == 0 && m1Var.mo808xfb85f7b0() == 519) {
            kn.t tVar = (kn.t) m1Var;
            this.f145438u = tVar.f390996f;
            this.f145437t = tVar.f390997g;
            W6();
            this.f145433p.setVisibility(0);
            this.f145432o.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.i6s));
            int i19 = this.f145437t;
            if (i19 > 0) {
                this.f145433p.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.i6z, java.lang.Integer.valueOf(i19)));
            } else {
                this.f145433p.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574438i70));
            }
            if (!this.f145440w) {
                this.f145426f.setVisibility(0);
            }
            switch (this.f145438u) {
                case 1:
                case 2:
                case 5:
                    this.f145432o.setVisibility(0);
                    this.f145426f.setText(com.p314xaae8f345.mm.R.C30867xcad56011.i6x);
                    return;
                case 3:
                case 4:
                case 6:
                    this.f145432o.setVisibility(0);
                    this.f145432o.setEnabled(false);
                    this.f145426f.setText(com.p314xaae8f345.mm.R.C30867xcad56011.i6x);
                    return;
                case 7:
                    this.f145432o.setVisibility(8);
                    this.f145426f.setText(com.p314xaae8f345.mm.R.C30867xcad56011.i6w);
                    this.f145432o.setEnabled(false);
                    return;
                default:
                    return;
            }
        }
    }
}
