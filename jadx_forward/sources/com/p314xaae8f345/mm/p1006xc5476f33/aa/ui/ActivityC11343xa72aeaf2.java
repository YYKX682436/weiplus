package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* renamed from: com.tencent.mm.plugin.aa.ui.AARemittanceUI */
/* loaded from: classes9.dex */
public class ActivityC11343xa72aeaf2 extends com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.AbstractActivityC11345xc0d00306 {
    public java.lang.String A;
    public java.lang.String B;
    public java.lang.String C;
    public long D;
    public java.lang.String E;
    public java.lang.String F;

    /* renamed from: g, reason: collision with root package name */
    public int f153987g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ScrollView f153988h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 f153989i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f153990m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f153991n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f153992o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.RelativeLayout f153993p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f153994q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.RelativeLayout f153995r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.LinearLayout f153996s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f153997t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f153998u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f153999v;

    /* renamed from: w, reason: collision with root package name */
    public double f154000w;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f154002y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f154003z;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f154001x = "";
    public android.app.Dialog G = null;
    public final k61.w H = (k61.w) this.f154007e.a(this, k61.w.class);
    public int I = 0;

    /* renamed from: J, reason: collision with root package name */
    public final java.lang.Runnable f153986J = new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.j0(this);

    public static void f7(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11343xa72aeaf2 activityC11343xa72aeaf2) {
        activityC11343xa72aeaf2.getClass();
        ku5.u0 u0Var = ku5.t0.f394148d;
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.x0 x0Var = new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.x0(activityC11343xa72aeaf2);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(x0Var, 300L, false);
        gt4.l.b(activityC11343xa72aeaf2, activityC11343xa72aeaf2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571292aw), activityC11343xa72aeaf2.f154001x, activityC11343xa72aeaf2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hyh), true, 20, new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.z0(activityC11343xa72aeaf2), new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.b1(activityC11343xa72aeaf2));
    }

    public static void h7(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11343xa72aeaf2 activityC11343xa72aeaf2, r45.v vVar) {
        boolean z17 = activityC11343xa72aeaf2.getIntent().getIntExtra("enter_scene", 0) == 1;
        java.lang.String str = vVar.f469306f;
        activityC11343xa72aeaf2.A = vVar.f469307g;
        activityC11343xa72aeaf2.B = vVar.f469309i;
        activityC11343xa72aeaf2.C = vVar.f469311n;
        h61.o.q(activityC11343xa72aeaf2, str, z17, vVar.f469308h, activityC11343xa72aeaf2.f154002y, activityC11343xa72aeaf2.E, com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10095xfbb5a33d);
    }

    public static void i7(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11343xa72aeaf2 activityC11343xa72aeaf2, java.lang.String str) {
        activityC11343xa72aeaf2.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AARemittanceUI", "showErrorDialog,errMsg:%s", str);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activityC11343xa72aeaf2.mo55332x76847179());
        u1Var.u("");
        u1Var.g(str);
        u1Var.a(true);
        u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.ga_);
        u1Var.l(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.u0(activityC11343xa72aeaf2));
        u1Var.q(false);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569406aa;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: hideLoading */
    public void mo48627xce38d9a() {
        android.app.Dialog dialog = this.G;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        this.G.dismiss();
        this.G = null;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        super.mo43517x10010bd5();
        this.f153988h = (android.widget.ScrollView) findViewById(com.p314xaae8f345.mm.R.id.f78309xcc53afe2);
        this.f153989i = (com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223) findViewById(com.p314xaae8f345.mm.R.id.pok);
        this.f153990m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f563852b8);
        this.f153991n = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f563849b5);
        this.f153992o = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) findViewById(com.p314xaae8f345.mm.R.id.f563851b7);
        this.f153993p = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.pcn);
        this.f153994q = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.pcq);
        this.f153995r = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.pcl);
        int intExtra = getIntent().getIntExtra("amount_remind_bit", 4);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d().equals("zh_CN") || com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d().equals("zh_TW") || com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d().equals("zh_HK")) {
            this.f153993p.post(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.h0(this));
            this.f153992o.m83218xe68631a1(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.i0(this, intExtra));
        } else {
            this.f153995r.setVisibility(8);
        }
        this.f153989i.h();
        this.f153989i.m82979x8ac63285(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571291av));
        ((android.widget.RelativeLayout.LayoutParams) this.f153989i.getLayoutParams()).addRule(12);
        this.f153989i.e(false);
        m83130x21cc23c2(this.f153992o.m83169xe7297452(), true, false);
        this.f153992o.m83217x59dfe8de(true);
        this.f153992o.post(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.g0(this));
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.v0(this.f153992o.m83169xe7297452());
        this.f153992o.m83169xe7297452().setOnEditorActionListener(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.e1(this, new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.d1(this)));
        this.f153992o.b(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.f1(this));
        this.f153992o.r(7, 2);
        this.f153997t = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f563848b4);
        this.f153996s = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.f563846b2);
        this.f153998u = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568150lv4);
        this.f153999v = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f564244lu);
        k7();
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        this.f153988h.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.c1(this));
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.f153991n, this.f154002y, null);
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String str = this.f154002y;
        ((sg3.a) v0Var).getClass();
        java.lang.String e17 = c01.a2.e(str);
        java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.gxe, this.f154003z);
        this.f153990m.setText(e17 + string);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.pck);
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.pcp);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/aa/ui/AARemittanceUI", "initOtherView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/aa/ui/AARemittanceUI", "initOtherView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.pcm);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/aa/ui/AARemittanceUI", "initOtherView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/aa/ui/AARemittanceUI", "initOtherView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.chv);
            return;
        }
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.pcp);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/aa/ui/AARemittanceUI", "initOtherView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/aa/ui/AARemittanceUI", "initOtherView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.pcm);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/aa/ui/AARemittanceUI", "initOtherView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(findViewById4, "com/tencent/mm/plugin/aa/ui/AARemittanceUI", "initOtherView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        imageView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.chu);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: isHandleAutoShowNormalStWcKb */
    public boolean mo48628x7c5cc589() {
        return this.f153989i.o();
    }

    public void j7(int i17, android.content.Intent intent) {
        if (i17 != -1) {
            mo48627xce38d9a();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AARemittanceUI", "pay success, payMsgId: %s", this.A);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1 c19088xa4b300c1 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1) intent.getParcelableExtra("key_realname_guide_helper");
        if (c19088xa4b300c1 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AARemittanceUI", "do realname guide");
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("key_realname_guide_helper", c19088xa4b300c1);
            j45.l.j(this, "wallet_core", ".id_verify.RealnameDialogActivity", intent2, null);
        }
        h61.o.b(this.E);
        setResult(-1);
        finish();
        k61.w wVar = this.H;
        k61.u uVar = wVar.f386055d;
        java.lang.String str = this.A;
        java.lang.String str2 = this.f154002y;
        java.lang.String str3 = this.B;
        uVar.getClass();
        ((km5.q) km5.u.g(str, str2, str3)).n(uVar).h(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.s0(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(407L, 12L, 1L, false);
        java.lang.String stringExtra = intent.getStringExtra("key_trans_id");
        long j17 = this.D;
        java.lang.String str4 = this.C;
        k61.s sVar = wVar.f386056e;
        sVar.getClass();
        ((km5.q) km5.u.g(java.lang.Long.valueOf(j17), str4, stringExtra)).n(sVar);
    }

    public final void k7() {
        int b17 = i65.a.b(mo55332x76847179(), 16);
        int b18 = i65.a.b(mo55332x76847179(), 0);
        int b19 = i65.a.b(mo55332x76847179(), 0);
        int b27 = i65.a.b(mo55332x76847179(), 4);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f154001x)) {
            java.lang.String string = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.F) ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571293ax) : getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571292aw);
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.w0(this.f153999v, string, 0, string.length(), new com.p314xaae8f345.mm.p2802xd031a825.ui.a0((com.p314xaae8f345.mm.p2802xd031a825.ui.z) new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.v0(this), true), mo55332x76847179());
            this.f153999v.setVisibility(0);
            com.p314xaae8f345.mm.ui.bk.t0(this.f153999v.getPaint());
            this.f153998u.setVisibility(8);
        } else {
            java.lang.String string2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.hgt);
            java.lang.String string3 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.b9z, this.f154001x, string2);
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            android.text.SpannableString i17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(this, string3);
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.w0(this.f153998u, string3, i17.length() - string2.length(), i17.length(), new com.p314xaae8f345.mm.p2802xd031a825.ui.a0((com.p314xaae8f345.mm.p2802xd031a825.ui.z) new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.w0(this), true), mo55332x76847179());
            this.f153998u.setVisibility(0);
            com.p314xaae8f345.mm.ui.bk.t0(this.f153998u.getPaint());
            this.f153999v.setVisibility(8);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.F)) {
            this.f153997t.setVisibility(8);
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f153996s.getLayoutParams();
            layoutParams.removeRule(3);
            layoutParams.addRule(3, com.p314xaae8f345.mm.R.id.pco);
            this.f153999v.setPadding(b18, b19, b17, b17);
            this.f153998u.setPadding(b18, b19, b17, b17);
            return;
        }
        this.f153997t.setVisibility(0);
        this.f153997t.setText(this.F);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) this.f153996s.getLayoutParams();
        layoutParams2.removeRule(3);
        layoutParams2.addRule(3, com.p314xaae8f345.mm.R.id.f563848b4);
        this.f153999v.setPadding(b18, b27, b17, b17);
        this.f153998u.setPadding(b18, b27, b17, b17);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 233) {
            j7(i18, intent);
            return;
        }
        if (i17 == 222 && i18 == -1) {
            java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AARemittanceUI", "select chatroom：%s", stringExtra);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                return;
            }
            android.content.Intent intent2 = new android.content.Intent(mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907.class);
            intent2.putExtra("enter_scene", 3);
            intent2.putExtra("chatroom_name", stringExtra);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/aa/ui/AARemittanceUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/aa/ui/AARemittanceUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.AbstractActivityC11345xc0d00306, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f154002y = getIntent().getStringExtra("user_name");
        this.f154003z = getIntent().getStringExtra("user_real_name");
        this.E = getIntent().getStringExtra("chatroom");
        this.F = getIntent().getStringExtra("user_group_solitatire_content");
        mo43517x10010bd5();
        m83090x14f40144(2878);
        this.I = 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.AbstractActivityC11345xc0d00306, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m83121xf6ff5b27(2878);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.l
    /* renamed from: onDialogDismiss */
    public void mo48629xdbdf3083(android.app.Dialog dialog) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AARemittanceUI", "onDialogDismiss()");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(this.f153986J, 300L);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf3223 = this.f153989i;
        if (c22894x55bf3223 == null || !c22894x55bf3223.onKeyUp(i17, keyEvent)) {
            return super.onKeyUp(i17, keyEvent);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.AbstractActivityC11345xc0d00306, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AARemittanceUI", "onPause()");
        if (this.f153989i.p()) {
            return;
        }
        this.I = 3;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.AbstractActivityC11345xc0d00306, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AARemittanceUI", "onResume()");
        if (this.I == 3 && mo48628x7c5cc589()) {
            m83136xb67ebaa8();
        }
        this.I = 2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.AbstractActivityC11345xc0d00306, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AARemittanceUI", "errType:" + i17 + " errCode:" + i18 + " errMsg:" + str + " scenetype:" + m1Var.mo808xfb85f7b0());
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(h61.b.class);
    }
}
