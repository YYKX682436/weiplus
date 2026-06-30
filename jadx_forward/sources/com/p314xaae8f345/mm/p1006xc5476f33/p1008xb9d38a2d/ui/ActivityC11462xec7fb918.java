package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI */
/* loaded from: classes14.dex */
public class ActivityC11462xec7fb918 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f155116z = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f155121h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f155122i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f155123m;

    /* renamed from: n, reason: collision with root package name */
    public android.app.ProgressDialog f155124n;

    /* renamed from: o, reason: collision with root package name */
    public int f155125o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.Button f155126p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.Button f155127q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f155128r;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f155131u;

    /* renamed from: v, reason: collision with root package name */
    public int f155132v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f155133w;

    /* renamed from: x, reason: collision with root package name */
    public int f155134x;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f155117d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f155118e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f155119f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f155120g = "";

    /* renamed from: s, reason: collision with root package name */
    public boolean f155129s = false;

    /* renamed from: t, reason: collision with root package name */
    public int f155130t = 15;

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6968xc4cd5a52 f155135y = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6968xc4cd5a52();

    public static void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11462xec7fb918 activityC11462xec7fb918, java.lang.String str, java.lang.String str2) {
        activityC11462xec7fb918.getClass();
        gm0.j1.d().a(701, activityC11462xec7fb918);
        gm0.j1.d().a(252, activityC11462xec7fb918);
        new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.fa(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.sf(activityC11462xec7fb918), str, str2, activityC11462xec7fb918.f155117d).b(activityC11462xec7fb918);
    }

    public final void U6() {
        if (c01.uc.f119048d) {
            c01.uc ucVar = c01.uc.f119047c;
            ucVar.a(c01.z1.r());
            ucVar.g(c01.z1.r(), c01.z1.q());
            c01.uc.f119048d = false;
        }
    }

    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 V6(java.lang.String str) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0(str);
        int indexOf = str.indexOf(32) + 1;
        f0Var.c(new android.text.style.AbsoluteSizeSpan(getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561388h4)), indexOf, str.length(), 33);
        f0Var.c(new android.text.style.ForegroundColorSpan(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560739su)), indexOf, str.length(), 33);
        return f0Var;
    }

    public final void W6() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f155128r;
        if (b4Var != null) {
            b4Var.d();
        }
        this.f155127q.setText(com.p314xaae8f345.mm.R.C30867xcad56011.hwk);
        this.f155127q.setEnabled(true);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c2b;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        super.mo43517x10010bd5();
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568381mm3)).setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.hwq, this.f155117d));
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568378mm0)).setText(V6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.hwp, this.f155118e)));
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568382mm4)).setText(V6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.hws, this.f155119f)));
        this.f155126p = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.mlz);
        this.f155127q = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.kao);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(this.f155117d, this.f155119f, this.f155118e)) {
            this.f155126p.setEnabled(false);
            this.f155127q.setEnabled(false);
        } else {
            this.f155127q.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.vf(this));
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wo.w0.o())) {
            this.f155126p.setVisibility(8);
        } else {
            this.f155126p.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.wf(this));
        }
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.hwr);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.xf(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f155132v = getIntent().getIntExtra("key_reg_style", 1);
        java.lang.String stringExtra = getIntent().getStringExtra("from_mobile");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f155117d = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("to_mobile");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f155119f = stringExtra2;
        java.lang.String stringExtra3 = getIntent().getStringExtra("verify_code");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.f155118e = stringExtra3;
        java.lang.String stringExtra4 = getIntent().getStringExtra("regsession_id");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        this.f155120g = stringExtra4;
        java.lang.String stringExtra5 = getIntent().getStringExtra("reg_3d_app_ticket");
        if (stringExtra5 == null) {
            stringExtra5 = "";
        }
        this.f155133w = stringExtra5;
        java.lang.String stringExtra6 = getIntent().getStringExtra("kintent_nickname");
        if (stringExtra6 == null) {
            stringExtra6 = "";
        }
        this.f155122i = stringExtra6;
        java.lang.String stringExtra7 = getIntent().getStringExtra("kintent_password");
        this.f155121h = stringExtra7 != null ? stringExtra7 : "";
        this.f155123m = getIntent().getBooleanExtra("kintent_hasavatar", false);
        this.f155134x = getIntent().getIntExtra("reg_3d_app_type", 0);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        db5.e1.u(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hwm), "", new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.uf(this), null);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        gm0.j1.d().a(145, this);
        gm0.j1.d().a(701, this);
        gm0.j1.d().a(252, this);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RegByMobileSendSmsUI", "errType %s, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        android.app.ProgressDialog progressDialog = this.f155124n;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        int mo808xfb85f7b0 = m1Var.mo808xfb85f7b0();
        boolean z17 = false;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6968xc4cd5a52 c6968xc4cd5a52 = this.f155135y;
        if (mo808xfb85f7b0 == 145) {
            h11.e eVar = (h11.e) m1Var;
            if (eVar.M() == 15) {
                com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var = eVar.f359604d;
                this.f155131u = ((h11.d) v0Var).f359602b.f424458a.f455042d;
                if (i18 == 0) {
                    W6();
                    if (this.f155132v == 1) {
                        gm0.j1.d().a(126, this);
                        com.p314xaae8f345.mm.p957x53236a1b.z0 z0Var = new com.p314xaae8f345.mm.p957x53236a1b.z0("", this.f155121h, this.f155122i, 0, "", this.f155117d, "", "", this.f155131u, 1, "", "", "", true, this.f155123m);
                        z0Var.L(this.f155120g);
                        z0Var.M(this.f155133w);
                        ((o45.bi) z0Var.f152989e.mo47979x2d63726f()).f424442a.N = 1;
                        gm0.j1.d().g(z0Var);
                        this.f155124n = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hxk), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.yf(this, z0Var));
                        return;
                    }
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("regsetinfo_ticket", this.f155131u);
                    intent.putExtra("regsetinfo_user", this.f155117d);
                    intent.putExtra("regsetinfo_pwd", this.f155121h);
                    intent.putExtra("regsession_id", this.f155120g);
                    intent.putExtra("reg_3d_app_ticket", this.f155133w);
                    intent.putExtra("reg_3d_app_type", this.f155134x);
                    intent.putExtra("mobile_check_type", 1);
                    intent.putExtra("regsetinfo_ismobile", 4);
                    intent.putExtra("regsetinfo_NextControl", eVar.L());
                    intent.putExtra("key_reg_style", this.f155132v);
                    intent.setClass(this, com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11466x7d774b0.class);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/RegByMobileSendSmsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(this, "com/tencent/mm/plugin/account/ui/RegByMobileSendSmsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    return;
                }
                if (i18 == -35) {
                    W6();
                    tm.a b17 = tm.a.b(str);
                    c6968xc4cd5a52.f142767d = this.f155134x;
                    c6968xc4cd5a52.f142768e = 7L;
                    c6968xc4cd5a52.k();
                    if (b17 != null) {
                        b17.c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.zf(this, eVar), new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ag(this));
                        return;
                    } else {
                        db5.e1.u(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.afq), null, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.bg(this, eVar), new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.cg(this));
                        return;
                    }
                }
                if (i18 != -212) {
                    if (i18 == -442) {
                        r45.z66 z66Var = ((o45.eh) v0Var.mo47979x2d63726f()).f424455a.A;
                        if (z66Var != null && z66Var.f473287e == 1) {
                            z17 = true;
                        }
                        if (!z17) {
                            this.f155129s = true;
                            return;
                        }
                    }
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                        return;
                    }
                    W6();
                    tm.a b18 = tm.a.b(str);
                    if (b18 != null) {
                        b18.c(this, null, null);
                        return;
                    }
                    return;
                }
                W6();
                android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11456xd84e63d3.class);
                intent2.putExtra("ticket", this.f155131u);
                intent2.putExtra("moble", this.f155117d);
                intent2.putExtra("regsession_id", this.f155120g);
                intent2.putExtra("reg_3d_app_ticket", this.f155133w);
                intent2.putExtra("reg_3d_app_type", this.f155134x);
                intent2.putExtra("next_controll", eVar.L());
                intent2.putExtra(dm.i4.f66875xa013b0d5, eVar.Q());
                intent2.putExtra("password", eVar.P());
                intent2.putExtra("nickname", eVar.O());
                intent2.putExtra("avatar_url", eVar.N());
                intent2.putExtra("mobile_check_type", 1);
                intent2.putExtra("kintent_hasavatar", this.f155123m);
                intent2.putExtra("kintent_nickname", this.f155122i);
                intent2.putExtra("kintent_password", this.f155121h);
                intent2.putExtra("key_reg_style", this.f155132v);
                intent2.putExtra("need_do_post_check", ((h11.d) v0Var).f359602b.f424458a.F);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent2);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/account/ui/RegByMobileSendSmsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(this, "com/tencent/mm/plugin/account/ui/RegByMobileSendSmsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
            }
        }
        if (m1Var.mo808xfb85f7b0() == 126) {
            com.p314xaae8f345.mm.p957x53236a1b.z0 z0Var2 = (com.p314xaae8f345.mm.p957x53236a1b.z0) m1Var;
            if (i17 != 0 || i18 != 0) {
                tm.a b19 = tm.a.b(str);
                if (b19 != null) {
                    b19.c(this, null, null);
                    return;
                }
                return;
            }
            java.lang.String str2 = this.f155117d;
            c6968xc4cd5a52.f142767d = this.f155134x;
            c6968xc4cd5a52.f142768e = 6L;
            c6968xc4cd5a52.k();
            gm0.m.E();
            gm0.m.f354765u = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.b1.f(1, 8);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.b1.f(1, 3);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.b1.f(1, 1);
            if (this.f155123m) {
                java.lang.String str3 = lp0.b.j() + "temp.avatar";
                java.lang.String str4 = lp0.b.j() + "temp.avatar.hd";
                com.p314xaae8f345.mm.vfs.w6.w(str3, str4);
                com.p314xaae8f345.mm.vfs.w6.h(str3);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.x(str4, 156, 156, android.graphics.Bitmap.CompressFormat.JPEG, 90, str3, true);
                kv.l0 l0Var = (kv.l0) i95.n0.c(kv.l0.class);
                java.lang.String str5 = lp0.b.j() + "temp.avatar";
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.k0) l0Var).getClass();
                new com.p314xaae8f345.mm.p943x351df9c2.y0(this, str5, true).a(1, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.dg(this, z0Var2, str2), new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.rf(this, z0Var2, str2));
                return;
            }
            this.f155131u = z0Var2.K();
            c01.b9.f118602c.d("login_user_name", str2);
            android.content.Intent b27 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.b(this);
            b27.addFlags(67108864);
            b27.putExtra("LauncherUI.enter_from_reg", true);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(b27);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(this, arrayList3.toArray(), "com/tencent/mm/plugin/account/ui/RegByMobileSendSmsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList3.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/account/ui/RegByMobileSendSmsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            finish();
            U6();
            n71.a.e("RE900_100");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            gm0.j1.b();
            sb6.append(gm0.m.e());
            sb6.append(",");
            sb6.append(getClass().getName());
            sb6.append(",R200_600,");
            gm0.j1.b();
            sb6.append(gm0.m.f("R200_600"));
            sb6.append(",4");
            n71.a.c(10645, false, sb6.toString());
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        W6();
        gm0.j1.d().q(145, this);
        gm0.j1.d().q(701, this);
        gm0.j1.d().q(252, this);
    }
}
