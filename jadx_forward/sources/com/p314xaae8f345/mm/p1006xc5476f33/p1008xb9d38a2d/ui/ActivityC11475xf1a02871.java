package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.account.ui.WelcomeActivity */
/* loaded from: classes14.dex */
public class ActivityC11475xf1a02871 extends com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f {

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f155224h = {"public_profile"};

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.C11476x2d696aa3 f155225d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l f155226e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6968xc4cd5a52 f155227f = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6968xc4cd5a52();

    /* renamed from: g, reason: collision with root package name */
    public final x51.c1 f155228g = new x51.c1();

    public static void S6(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11475xf1a02871 activityC11475xf1a02871) {
        activityC11475xf1a02871.getClass();
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.util.Map.Entry[] entryArr = {new java.util.AbstractMap.SimpleEntry(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52908x661c1030, wo.w0.k())};
        java.util.HashMap hashMap = new java.util.HashMap(1);
        java.util.Map.Entry entry = entryArr[0];
        java.lang.Object key = entry.getKey();
        java.util.Objects.requireNonNull(key);
        java.lang.Object value = entry.getValue();
        java.util.Objects.requireNonNull(value);
        if (hashMap.put(key, value) == null) {
            ((cy1.a) rVar).Hj("register_account", "view_clk", java.util.Collections.unmodifiableMap(hashMap), 34575);
        } else {
            throw new java.lang.IllegalArgumentException("duplicate key: " + key);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        objArr[2] = java.lang.Boolean.valueOf(intent == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WelcomeActivity", "onActivityResult, requestCode:%d, resultCode:%d, data==null:%b", objArr);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        android.content.Intent b17 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.b(this);
        b17.addFlags(67108864);
        b17.putExtra("can_finish", true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(b17);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/WelcomeActivity", "goBack", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/account/ui/WelcomeActivity", "goBack", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
        db5.f.k(this);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo2533x106ab264().o();
        getWindow().getDecorView().setSystemUiVisibility(1280);
        if (android.os.Build.VERSION.SDK_INT >= 26 && !com.p314xaae8f345.mm.ui.ga.q()) {
            getWindow().setNavigationBarColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560052a1));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.C11476x2d696aa3 c11476x2d696aa3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.C11476x2d696aa3(this);
        this.f155225d = c11476x2d696aa3;
        setContentView(c11476x2d696aa3);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.C11476x2d696aa3 c11476x2d696aa32 = this.f155225d;
        c11476x2d696aa32.a(c11476x2d696aa32.f155229d, 300L);
        c11476x2d696aa32.a(c11476x2d696aa32.f155232g, 300L);
        android.view.View view = c11476x2d696aa32.f155229d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/WelcomeSelectView", "slideView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/account/ui/WelcomeSelectView", "slideView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c11476x2d696aa32.f155232g.setVisibility(0);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.vj(c11476x2d696aa32));
        this.f155225d.f155232g.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.kj(this));
        this.f155225d.f155230e.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.lj(this));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        db5.h4 h4Var = new db5.h4(this, 1001, 0);
        h4Var.f309909t = com.p314xaae8f345.mm.R.C30867xcad56011.hvy;
        arrayList2.add(h4Var);
        db5.h4 h4Var2 = new db5.h4(this, 1002, 0);
        if (u11.c.c()) {
            h4Var2.f309909t = com.p314xaae8f345.mm.R.C30867xcad56011.hvx;
            arrayList2.add(h4Var2);
        }
        if (arrayList2.size() > 1) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) this, 1, false);
            k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.mj(this, arrayList2);
            k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.nj(this);
            k0Var.f293387d = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.oj(this);
            this.f155225d.f155231f.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.pj(this, k0Var, arrayList2, h4Var2));
        } else {
            this.f155225d.f155231f.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.qj(this));
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.AccountLoginFirstRegPage);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(this, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52908x661c1030, wo.w0.k());
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this, 4, 34575);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f155227f.k();
        com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l lVar = this.f155226e;
        if (lVar != null) {
            lVar.c(this);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        this.f155228g.c(this, i17, strArr, iArr);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.C11476x2d696aa3 c11476x2d696aa3 = this.f155225d;
        java.lang.String p17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.p(c11476x2d696aa3.f155233h.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0), c11476x2d696aa3.f155233h);
        c11476x2d696aa3.f155232g.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.g(c11476x2d696aa3.f155233h, com.p314xaae8f345.mm.R.C30856x58c7259.f559540v, com.p314xaae8f345.mm.R.C30867xcad56011.f571997vs));
        if (p17 != null && p17.equals("language_default")) {
            c11476x2d696aa3.f155232g.setText(c11476x2d696aa3.f155233h.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gi6));
        }
        c11476x2d696aa3.f155230e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.g1i);
        c11476x2d696aa3.f155231f.setText(com.p314xaae8f345.mm.R.C30867xcad56011.g1h);
    }
}
