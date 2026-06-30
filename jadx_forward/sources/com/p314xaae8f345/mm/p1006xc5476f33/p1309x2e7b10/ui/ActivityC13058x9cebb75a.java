package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* renamed from: com.tencent.mm.plugin.card.ui.CardShopUI */
/* loaded from: classes4.dex */
public class ActivityC13058x9cebb75a extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements wt1.i0 {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f176434s = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f176435d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.ProgressDialog f176436e;

    /* renamed from: g, reason: collision with root package name */
    public tt1.j f176438g;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f176440i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.f4 f176441m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.LinearLayout f176442n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f176443o;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f176437f = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f176439h = "";

    /* renamed from: p, reason: collision with root package name */
    public boolean f176444p = false;

    /* renamed from: q, reason: collision with root package name */
    public final android.content.BroadcastReceiver f176445q = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b4(this);

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View.OnClickListener f176446r = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.c4(this);

    public final void T6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardShopUI", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.g0.f34402x24728b);
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.LOCALE_CHANGED");
        registerReceiver(this.f176445q, intentFilter);
        if (!((com.p314xaae8f345.mm.sdk.p2603x2137b148.n2.a() || com.p314xaae8f345.mm.sdk.p2603x2137b148.n2.b()) ? false : true)) {
            U6();
        } else {
            db5.e1.u(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.auo, getString(com.p314xaae8f345.mm.R.C30867xcad56011.ari)), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), new lu1.l(this), new lu1.m());
        }
    }

    public final void U6() {
        boolean z17;
        wt1.j0 bj6 = xt1.t0.bj();
        java.lang.String str = this.f176439h;
        java.lang.String str2 = this.f176440i;
        bj6.f530832f = str;
        synchronized (bj6.f530830d) {
            if (!((java.util.HashMap) bj6.f530830d).containsKey(str)) {
                ((java.util.HashMap) bj6.f530830d).put(str, new java.util.HashSet());
            }
            if (!((java.util.Set) ((java.util.HashMap) bj6.f530830d).get(str)).contains(this)) {
                ((java.util.Set) ((java.util.HashMap) bj6.f530830d).get(str)).add(this);
            }
        }
        synchronized (bj6.f530831e) {
            if (!android.text.TextUtils.isEmpty(str2)) {
                bj6.f530831e.put(str, str2);
            }
        }
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h e17 = i11.h.e();
        boolean z18 = true;
        if (e17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardShopLBSManager", "getShopList fail, get IGetLocation fail, plugin no loaded?");
            z17 = false;
        } else {
            e17.l(bj6, true, false, false);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.b1.f(22, 10);
            z17 = true;
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardShopLBSManager", "getShopList fail, get IGetLocation fail, plugin no loaded?");
            z18 = false;
        } else if (bj6.f530834h != null) {
            gm0.j1.n().f354821b.d(bj6.f530834h);
        }
        if (z18) {
            this.f176436e = db5.e1.Q(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.asg), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.a4(this));
        } else {
            db5.e1.T(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.asf));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569895r8;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        if (android.text.TextUtils.isEmpty(this.f176438g.s0().Y)) {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.ari);
        } else {
            mo54450xbf7c1df6(this.f176438g.s0().Y);
        }
        this.f176435d = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.f565117bc1);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) android.view.View.inflate(getBaseContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f569870qj, null);
        this.f176442n = linearLayout;
        this.f176435d.addHeaderView(linearLayout);
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.f4 f4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.f4(this, null);
        this.f176441m = f4Var;
        this.f176435d.setAdapter((android.widget.ListAdapter) f4Var);
        this.f176435d.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.y3(this, getIntent()));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.z3(this));
        android.view.View inflate = android.view.View.inflate(this, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569869qi, null);
        this.f176443o = inflate;
        android.widget.LinearLayout linearLayout2 = this.f176442n;
        if (linearLayout2 != null) {
            linearLayout2.addView(inflate);
        }
        ((android.widget.TextView) this.f176443o.findViewById(com.p314xaae8f345.mm.R.id.bah)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.avj);
        android.view.View view = this.f176443o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/CardShopUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/card/ui/CardShopUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f176438g = (tt1.j) getIntent().getParcelableExtra("key_card_info_data");
        java.lang.String stringExtra = getIntent().getStringExtra("KEY_CARD_TP_ID");
        java.lang.String stringExtra2 = getIntent().getStringExtra("KEY_CARD_ID");
        if (this.f176438g != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardShopUI", "onCreate  mCardInfo != null");
            this.f176439h = this.f176438g.f();
            this.f176440i = this.f176438g.g();
        } else if (!android.text.TextUtils.isEmpty(stringExtra)) {
            this.f176439h = stringExtra;
            if (android.text.TextUtils.isEmpty(stringExtra2)) {
                stringExtra2 = "";
            }
            this.f176440i = stringExtra2;
        }
        if (android.text.TextUtils.isEmpty(this.f176439h)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardShopUI", "onCreate  mCardTpid == null");
            finish();
        }
        boolean Di = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Di(this, new java.lang.String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 69, null, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardShopUI", "checkPermission checkLocation[%b]", java.lang.Boolean.valueOf(Di));
        this.f176444p = Di;
        if (Di) {
            T6();
        }
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        if (this.f176444p) {
            unregisterReceiver(this.f176445q);
        }
        xt1.t0.bj().a(this.f176439h, this);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardShopUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardShopUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 69) {
            return;
        }
        if (iArr[0] != 0) {
            db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhm), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.baz), false, new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.d4(this), null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardShopUI", "onMPermissionGranted LocationPermissionGranted " + this.f176444p);
        if (this.f176444p) {
            return;
        }
        this.f176444p = true;
        T6();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.h4.class);
    }
}
