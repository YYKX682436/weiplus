package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui;

/* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMobileStatusUI */
/* loaded from: classes5.dex */
public class ActivityC11365x86ed685 extends com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f154545z = 0;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f154546e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f154547f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f154548g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.Button f154549h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f154550i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f154551m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Boolean f154552n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Boolean f154553o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.RelativeLayout f154554p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.RelativeLayout f154555q;

    /* renamed from: r, reason: collision with root package name */
    public int f154556r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p957x53236a1b.C11133xdc5bf27e f154557s;

    /* renamed from: t, reason: collision with root package name */
    public int f154558t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f154559u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f154560v;

    /* renamed from: w, reason: collision with root package name */
    public android.content.SharedPreferences f154561w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.HashMap f154562x;

    /* renamed from: y, reason: collision with root package name */
    public final android.util.SparseArray f154563y;

    public ActivityC11365x86ed685() {
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        this.f154552n = bool;
        this.f154553o = bool;
        this.f154562x = new java.util.HashMap();
        this.f154563y = new android.util.SparseArray(3);
    }

    public static void Z6(android.content.Context context, boolean z17, boolean z18) {
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
        sharedPreferences.edit().putBoolean("settings_find_me_by_mobile", z17 ^ true).commit();
        sharedPreferences.edit().putBoolean("settings_recommend_mobilefriends_to_me", z18 ^ true).commit();
        int p17 = c01.z1.p();
        int i17 = z17 ? p17 | 512 : p17 & (-513);
        gm0.j1.u().c().w(7, java.lang.Integer.valueOf(z18 ? i17 | 256 : i17 & (-257)));
        r45.p53 p53Var = new r45.p53();
        p53Var.f464294d = 8;
        p53Var.f464295e = z18 ? 1 : 2;
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
        r45.p53 p53Var2 = new r45.p53();
        p53Var2.f464294d = 7;
        p53Var.f464295e = z17 ? 1 : 2;
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var2));
        ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Zi();
    }

    public final boolean a7(boolean z17, int i17, int i18) {
        if (z17) {
            this.f154556r = i17 | this.f154556r;
        } else {
            this.f154556r = (~i17) & this.f154556r;
        }
        this.f154562x.put(java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(z17 ? 1 : 2));
        java.lang.String str = (java.lang.String) this.f154563y.get(i18);
        if (this.f154561w != null && str != null && str.length() > 0) {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
            if (i18 == 8 || i18 == 7) {
                valueOf = java.lang.Boolean.valueOf(!z17);
            }
            this.f154561w.edit().putBoolean(str, valueOf.booleanValue()).commit();
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569731k8;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f154546e = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f564915ai2);
        this.f154548g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f564913ai0);
        this.f154547f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ahz);
        this.f154549h = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.f564914ai1);
        this.f154550i = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.aio);
        this.f154551m = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.ain);
        this.f154554p = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.ahw);
        this.f154555q = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.ahx);
        int i17 = this.f154558t;
        if (i17 == 0) {
            this.f154554p.setVisibility(8);
            this.f154555q.setVisibility(8);
            a7(!this.f154559u, 512, 8);
            a7(!this.f154560v, 256, 7);
        } else if (i17 == 1) {
            this.f154554p.setVisibility(0);
            this.f154554p.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562493gf);
            this.f154555q.setVisibility(8);
        }
        com.p314xaae8f345.mm.p957x53236a1b.C11133xdc5bf27e c11133xdc5bf27e = this.f154557s;
        if (c11133xdc5bf27e != null && c11133xdc5bf27e.f152811f.intValue() == 2) {
            this.f154547f.setVisibility(8);
        }
        this.f154549h.setVisibility(8);
        mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5), new p61.g2(this));
        if (r61.q0.b() == js.x0.SUCC || r61.q0.b() == js.x0.SUCC_UNLOAD) {
            this.f154546e.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bgj);
            java.lang.String str = (java.lang.String) gm0.j1.u().c().l(6, null);
            if (str == null || str.equals("")) {
            }
        } else {
            this.f154546e.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bgg);
            this.f154547f.setVisibility(8);
            this.f154548g.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.aft));
        }
        this.f154550i.setOnClickListener(new p61.h2(this));
        this.f154551m.setOnClickListener(new p61.i2(this));
        this.f154549h.setOnClickListener(new p61.j2(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f154561w = getSharedPreferences(getPackageName() + "_preferences", 0);
        this.f154556r = c01.z1.p();
        android.util.SparseArray sparseArray = this.f154563y;
        sparseArray.put(8, "settings_find_me_by_mobile");
        sparseArray.put(7, "settings_recommend_mobilefriends_to_me");
        sparseArray.put(32, "settings_autoadd_mobilefriends");
        a7(false, 512, 8);
        a7(false, 256, 7);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f572250ah2);
        this.f154557s = (com.p314xaae8f345.mm.p957x53236a1b.C11133xdc5bf27e) getIntent().getParcelableExtra("kstyle_bind_wording");
        this.f154558t = getIntent().getIntExtra("kstyle_bind_recommend_show", 0);
        this.f154559u = getIntent().getBooleanExtra("Kfind_friend_by_mobile_flag", false);
        this.f154560v = getIntent().getBooleanExtra("Krecom_friends_by_mobile_flag", false);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        W6(1);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        gm0.j1.u().c().w(7, java.lang.Integer.valueOf(this.f154556r));
        java.util.HashMap hashMap = this.f154562x;
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            int intValue = ((java.lang.Integer) entry.getKey()).intValue();
            int intValue2 = ((java.lang.Integer) entry.getValue()).intValue();
            r45.p53 p53Var = new r45.p53();
            p53Var.f464294d = intValue;
            p53Var.f464295e = intValue2;
            ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
        }
        hashMap.clear();
        super.onPause();
    }
}
