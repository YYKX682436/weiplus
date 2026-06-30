package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI */
/* loaded from: classes15.dex */
public class ActivityC16143x7673980 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f224183z = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String[] f224184d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String[] f224185e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String[] f224186f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f224187g;

    /* renamed from: h, reason: collision with root package name */
    public int f224188h;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f224191n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f224192o;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ListView f224196s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.y3 f224197t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f224198u;

    /* renamed from: v, reason: collision with root package name */
    public android.app.ProgressDialog f224199v;

    /* renamed from: w, reason: collision with root package name */
    public p83.f f224200w;

    /* renamed from: i, reason: collision with root package name */
    public int f224189i = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f224190m = -1;

    /* renamed from: p, reason: collision with root package name */
    public final q83.g f224193p = new q83.g();

    /* renamed from: q, reason: collision with root package name */
    public final q83.f f224194q = new q83.f();

    /* renamed from: r, reason: collision with root package name */
    public final q83.i f224195r = new q83.i();

    /* renamed from: x, reason: collision with root package name */
    public final ec0.e f224201x = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.n3(this);

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f224202y = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.l3(this);

    public final void T6(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.j a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.j.a();
        if (!a17.f224006c) {
            a17.b(false);
        }
        java.util.ArrayList arrayList = a17.f224004a;
        this.f224200w = new p83.f(arrayList.size() == 0 ? t83.c.g(t83.f.f()) : t83.c.g(((java.lang.Integer) arrayList.get(0)).toString()), str);
        c01.d9.e().g(this.f224200w);
    }

    public final void U6(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            str = getString(com.p314xaae8f345.mm.R.C30867xcad56011.g5l);
        }
        db5.e1.t(this, str, getString(com.p314xaae8f345.mm.R.C30867xcad56011.g5l), new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.v3(this));
    }

    public final boolean V6(java.lang.String str) {
        int i17;
        if ((((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("WCOSecondPurchaseSwitch", 0) > 0) && (i17 = this.f224190m) >= 0) {
            java.lang.Object item = this.f224197t.getItem(i17);
            if (item instanceof r45.l57) {
                r45.l57 l57Var = (r45.l57) item;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l57Var.f460701o)) {
                    java.lang.String str2 = l57Var.f460701o;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallRechargeUI", "tryHandleShowWebViewPayDialog:" + str2);
                    db5.e1.C(this, str, getString(com.p314xaae8f345.mm.R.C30867xcad56011.g5l), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g4z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), true, new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.k3(this, str2), null);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bm8;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        int i19;
        int i27;
        java.lang.String str;
        int i28;
        int i29;
        int i37;
        int i38;
        int i39;
        java.lang.String str2;
        int i47;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallRechargeUI", "onActivityResult. requestCode:[%d] resultCode:[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        java.lang.String str3 = "";
        if (i17 != 2001) {
            if (i17 == 2002) {
                android.app.ProgressDialog progressDialog = this.f224199v;
                if (progressDialog != null && progressDialog.isShowing()) {
                    this.f224199v.dismiss();
                }
                boolean z17 = false;
                if (intent != null) {
                    i19 = intent.getIntExtra("key_err_code", 0);
                    str3 = intent.getStringExtra("key_err_msg");
                    int intExtra = intent.getIntExtra("key_response_position", 0);
                    z17 = i19 == 100000001;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallRechargeUI", "onActivityResult restore.errCode:[%d] errMsg:[%s] errPosition:[%d] isFailedConsume:[%s]", java.lang.Integer.valueOf(i19), str3, java.lang.Integer.valueOf(intExtra), java.lang.String.valueOf(z17));
                    i27 = intExtra;
                } else {
                    i19 = 0;
                    i27 = 0;
                }
                q83.i iVar = this.f224195r;
                iVar.f442315f = i19;
                long j17 = 0;
                iVar.f442313d = j17;
                if (i18 != -1) {
                    iVar.f442314e = 2;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallRechargeUI", "onActivityResult. restore failed");
                    dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.f573884g60, 0).show();
                } else if (intent == null || i19 != 0) {
                    if (z17) {
                        iVar.f442314e = 1;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(257L, 17L, 1L, true);
                        str3 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573885g61);
                    } else if (i27 == 3) {
                        iVar.f442314e = 2;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(257L, 16L, 1L, true);
                    } else {
                        iVar.f442314e = 2;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallRechargeUI", "onActivityResult. restore not ok");
                    dp.a.m125854x26a183b(this, str3, 0).show();
                } else {
                    java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("key_response_product_ids");
                    if (stringArrayListExtra == null || stringArrayListExtra.size() <= 0) {
                        iVar.f442314e = 3;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallRechargeUI", "onActivityResult. no product can be restored");
                        dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.f573885g61, 0).show();
                    } else {
                        iVar.f442314e = j17;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(257L, 15L, 1L, true);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallRechargeUI", "onActivityResult. restore ok");
                        db5.e1.t(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573886g62), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573887g63), new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.u3(this));
                    }
                }
                iVar.getClass();
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                iVar.f442312c = java.lang.System.currentTimeMillis();
                iVar.b();
                return;
            }
            return;
        }
        if (intent != null) {
            i29 = intent.getIntExtra("key_err_code", 0);
            java.lang.String stringExtra = intent.getStringExtra("key_err_msg");
            long longExtra = intent.getLongExtra("key_launch_ts", 0L);
            int intExtra2 = intent.getIntExtra("key_gw_error_code", 0);
            int intExtra3 = intent.getIntExtra("key_response_position", 0);
            boolean z19 = i29 == 100000001;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallRechargeUI", "onActivityResult pay.errCode:[%d] errMsg:[%s] errGWCode:[%s] errPosition:[%d] isFailedConsume:[%s]", java.lang.Integer.valueOf(i29), stringExtra, java.lang.Integer.valueOf(intExtra2), java.lang.Integer.valueOf(intExtra3), java.lang.String.valueOf(z19));
            q83.f fVar = this.f224194q;
            if (i29 != 6 || intExtra2 == 0) {
                fVar.f442303h = i29;
            } else {
                fVar.f442303h = intExtra2;
            }
            if (intExtra3 == 3) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var.mo68477x336bdfd8(257L, 9L, 1L, true);
                g0Var.mo68477x336bdfd8(257L, 11L, 1L, true);
                fVar.f442303h = 0;
                fVar.f442304i = 2;
                str = getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6k);
                i39 = intExtra3;
                i47 = intExtra2;
            } else {
                if (intExtra3 != 1) {
                    if (i18 == -1 && i29 == 0) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(257L, 9L, 1L, true);
                    } else if (z19) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                        g0Var2.mo68477x336bdfd8(257L, 9L, 1L, true);
                        g0Var2.mo68477x336bdfd8(257L, 12L, 1L, true);
                        i39 = intExtra3;
                        str2 = stringExtra;
                        fVar.f442303h = 0;
                        i47 = intExtra2;
                        fVar.f442304i = 1;
                        str = str2;
                    }
                }
                i39 = intExtra3;
                str2 = stringExtra;
                i47 = intExtra2;
                str = str2;
            }
            fVar.f442302g = longExtra;
            fVar.getClass();
            boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            fVar.f442298c = java.lang.System.currentTimeMillis();
            fVar.b();
            i38 = i47;
            i37 = i39;
            i28 = -1;
        } else {
            str = "";
            i28 = -1;
            i29 = 0;
            i37 = 0;
            i38 = 0;
        }
        if (i18 == i28) {
            if (intent != null && i29 == 0) {
                java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent.getStringArrayListExtra("key_response_product_ids");
                intent.getStringArrayListExtra("key_response_series_ids");
                java.util.Iterator<java.lang.String> it = stringArrayListExtra2.iterator();
                while (it.hasNext()) {
                    java.lang.String next = it.next();
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    boolean z28 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    if (next == null) {
                        next = "";
                    }
                    objArr[0] = next;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallRechargeUI", "buy product ok productId:", objArr);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var3.mo68477x336bdfd8(257L, 6L, 1L, true);
                g0Var3.mo68477x336bdfd8(257L, 10L, 1L, true);
                dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.g5m, 0).show();
                finish();
                return;
            }
            if (intent != null && i29 == 100000002) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(257L, 6L, 1L, true);
                U6(str);
                return;
            }
            if (intent != null && i29 == 109) {
                U6(str);
                return;
            }
            if (intent != null && i29 == 1) {
                java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.g5k);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(257L, 8L, 1L, true);
                dp.a.m125854x26a183b(this, string, 0).show();
                return;
            }
            if (intent != null && i29 == 113) {
                db5.e1.t(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573883g56), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g5l), new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.t3(this));
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(257L, 7L, 1L, true);
            if (i37 == 3) {
                U6(str);
                return;
            }
            if (i29 == 100000001 || i29 == 6) {
                if (i38 == 0) {
                    dp.a.m125854x26a183b(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.g3w), 0).show();
                    return;
                }
                java.lang.String string2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.g3y);
                if (V6(string2)) {
                    return;
                }
                dp.a.m125854x26a183b(this, string2, 0).show();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        c01.d9.e().a(com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60855xafa52301, this);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.g4b);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.o3(this));
        mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.p3(this));
        this.f224196s = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.lmx);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.View.inflate(mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.bm6, null);
        this.f224196s.addFooterView(viewGroup, null, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.y3 y3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.y3(this);
        this.f224197t = y3Var;
        this.f224196s.setAdapter((android.widget.ListAdapter) y3Var);
        this.f224198u = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.o_q);
        java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.g4h);
        android.text.Spannable newSpannable = android.text.Spannable.Factory.getInstance().newSpannable(string);
        newSpannable.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.q3(this), 0, string.length(), 33);
        this.f224198u.setText(newSpannable);
        this.f224198u.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        this.f224199v = db5.e1.Q(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g3z), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.r3(this));
        T6("");
        this.f224193p.d();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(257L, 4L, 1L, true);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        q83.g gVar = this.f224193p;
        gVar.getClass();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        gVar.f442307c = java.lang.System.currentTimeMillis();
        gVar.b();
        c01.d9.e().q(com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60855xafa52301, this);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallRechargeUI", "onSceneEnd>errCode:%d,onSceneEnd>errMsg:%s", java.lang.Integer.valueOf(i18), str);
        if (m1Var instanceof p83.f) {
            q83.g gVar = this.f224193p;
            gVar.getClass();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            gVar.f442308d = java.lang.System.currentTimeMillis();
            gVar.f442309e = i18;
            int i19 = 0;
            if (i17 != 0 || i18 != 0) {
                android.app.ProgressDialog progressDialog = this.f224199v;
                if (progressDialog != null && progressDialog.isShowing()) {
                    this.f224199v.dismiss();
                }
                dp.a.m125854x26a183b(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g3w), 0).show();
                finish();
                return;
            }
            p83.f fVar = (p83.f) m1Var;
            r45.rr3 rr3Var = fVar.f434277e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.y3 y3Var = this.f224197t;
            y3Var.f224616d = rr3Var.f466668e;
            y3Var.f224618f = rr3Var;
            y3Var.notifyDataSetChanged();
            java.util.LinkedList linkedList = rr3Var.f466668e;
            this.f224184d = new java.lang.String[linkedList.size()];
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                this.f224184d[i19] = ((r45.l57) it.next()).f460694e;
                i19++;
            }
            this.f224191n = rr3Var.f466673m;
            this.f224192o = rr3Var.f466674n;
            this.f224187g = rr3Var.f466672i;
            this.f224188h = rr3Var.f466671h;
            if (fVar.f434278f) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallRechargeUI", "onSceneEnd IsUnkownCurency=true");
                java.lang.String[] strArr = this.f224184d;
                if (strArr == null || strArr.length <= 0) {
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallRechargeUI", "startQueryGooglePrice");
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.i2.a(this, this.f224184d, this.f224201x);
                return;
            }
            android.app.ProgressDialog progressDialog2 = this.f224199v;
            if (progressDialog2 != null && progressDialog2.isShowing()) {
                this.f224199v.dismiss();
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f224202y;
            if (n3Var != null) {
                n3Var.mo50305x3d8a09a2(1002);
            }
        }
    }
}
