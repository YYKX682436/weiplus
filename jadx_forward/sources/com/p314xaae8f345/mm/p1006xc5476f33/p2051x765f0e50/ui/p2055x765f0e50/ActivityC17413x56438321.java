package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAliasUI */
/* loaded from: classes5.dex */
public class ActivityC17413x56438321 extends com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: r, reason: collision with root package name */
    public static java.lang.String f241849r;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f241850e;

    /* renamed from: g, reason: collision with root package name */
    public android.app.ProgressDialog f241852g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f241853h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f241854i;

    /* renamed from: m, reason: collision with root package name */
    public int f241855m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f241856n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f241857o;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f241851f = null;

    /* renamed from: p, reason: collision with root package name */
    public boolean f241858p = false;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6746x43f2e743 f241859q = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6746x43f2e743();

    public final void Z6(boolean z17) {
        gm0.j1.d().g(new v61.k0());
        if (z17) {
            this.f241852g = db5.e1.Q(this, "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572001vx), false, false, null);
        }
    }

    public final void a7() {
        int i17 = this.f241855m;
        if (i17 == 1) {
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11471xee777578.class);
            intent.putExtra("key_scenen", 2);
            startActivityForResult(intent, 10001);
        } else if (i17 != 2) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f241857o)) {
                return;
            }
            c71.b.c(this, this.f241857o, 0, true);
        } else {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f241857o)) {
                return;
            }
            c71.b.c(this, this.f241857o, 10002, true);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570981cl3;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        this.f241850e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.mop);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.v3r);
        if (this.f241858p) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.phl);
        } else {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ipb);
        }
        java.lang.String c17 = c01.z1.c();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17)) {
            c17 = c01.z1.r();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsAliasUI", "curAlias %s", c17);
        this.f241850e.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571953uh) + c17);
        this.f241850e.setOnLongClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.x6(this));
        ((android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.mpw)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.y6(this));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.z6(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Boolean.valueOf(i18 == -1);
        objArr[2] = java.lang.Boolean.valueOf(intent == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsAliasUI", "requestCode %d, resultCode OK %s, data == null %s", objArr);
        if (intent == null) {
            return;
        }
        if (i17 == 10001) {
            if (i18 == -1) {
                android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17437x244fdb47.class);
                java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
                arrayList.add(1);
                arrayList.add(2);
                java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>();
                arrayList2.add(this.f241856n);
                arrayList2.add(intent.getStringExtra("key_ticket"));
                intent2.putIntegerArrayListExtra("key_ticket_type", arrayList);
                intent2.putStringArrayListExtra("key_ticket", arrayList2);
                com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.X6(this, intent2);
                return;
            }
            return;
        }
        if (i17 == 10002 && i18 == -1) {
            android.os.Bundle bundleExtra = intent.getBundleExtra("result_data");
            java.lang.String string = bundleExtra == null ? "" : bundleExtra.getString("result_json");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsAliasUI", "face recog, result: %s", string);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                return;
            }
            try {
                java.lang.String mo15074x2fec8307 = new cl0.g(string).mo15074x2fec8307("ticket");
                android.content.Intent intent3 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17437x244fdb47.class);
                java.util.ArrayList<java.lang.Integer> arrayList3 = new java.util.ArrayList<>();
                arrayList3.add(1);
                arrayList3.add(3);
                java.util.ArrayList<java.lang.String> arrayList4 = new java.util.ArrayList<>();
                arrayList4.add(this.f241856n);
                arrayList4.add(mo15074x2fec8307);
                intent3.putIntegerArrayListExtra("key_ticket_type", arrayList3);
                intent3.putStringArrayListExtra("key_ticket", arrayList4);
                com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.X6(this, intent3);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingsAliasUI", "jump face recog error, %s", e17.getMessage());
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        f14.j.f340220e = null;
        this.f241858p = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("AliasModifyOpt", 0) == 1;
        java.lang.String str = "set_alias_" + java.lang.System.currentTimeMillis();
        f241849r = str;
        this.f241859q.p(str);
        mo43517x10010bd5();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsAliasUI", "root class %s", getIntent().getStringExtra("WizardRootClass"));
        gm0.j1.d().a(926, this);
        Z6(false);
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableModAlias", 0) == 0) {
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.d().q(926, this);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsAliasUI", "errType %d, errCode %d, errMsg %s, doubleCheck %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Boolean.valueOf(this.f241854i));
        android.app.ProgressDialog progressDialog = this.f241852g;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        if (i17 != 0 || i18 != 0) {
            dp.a.m125854x26a183b(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571924to), 0).show();
            return;
        }
        v61.k0 k0Var = (v61.k0) m1Var;
        java.util.LinkedList linkedList = ((r45.d00) k0Var.f514986d.f152244b.f152233a).f453508d;
        this.f241851f = linkedList;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsAliasUI", "conditions %d", java.lang.Integer.valueOf(linkedList.size()));
        r45.d00 d00Var = (r45.d00) k0Var.f514986d.f152244b.f152233a;
        this.f241855m = d00Var.f453510f;
        this.f241857o = d00Var.f453511g;
        this.f241856n = d00Var.f453509e;
        java.util.List list = this.f241851f;
        if (list == null || list.isEmpty()) {
            dp.a.m125854x26a183b(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571923tn), 0).show();
            return;
        }
        this.f241853h = true;
        java.util.List list2 = this.f241851f;
        f14.j.f340220e = list2;
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            this.f241853h = this.f241853h && ((r45.e00) it.next()).f454422g;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsAliasUI", "onSceneEnd, allPass %s", java.lang.Boolean.valueOf(this.f241853h));
        if (this.f241854i) {
            if (this.f241853h) {
                a7();
            } else {
                com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.X6(this, new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17436xe5fd0ca9.class));
            }
        }
    }
}
