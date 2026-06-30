package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyIndexUI */
/* loaded from: classes9.dex */
public class ActivityC16368x343578ee extends com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d {

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f227673g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f227674h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f227675i;

    /* renamed from: m, reason: collision with root package name */
    public int f227676m;

    public static void V6(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16368x343578ee activityC16368x343578ee, int i17) {
        activityC16368x343578ee.getClass();
        android.content.Intent intent = new android.content.Intent();
        ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).bj();
        intent.setClass(activityC16368x343578ee.mo55332x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13.class);
        intent.putExtra("key_way", 3);
        intent.putExtra("key_type", i17);
        intent.putExtra("pay_channel", activityC16368x343578ee.f227676m);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC16368x343578ee, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyIndexUI", "goPrepareLuckmoney", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC16368x343578ee.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC16368x343578ee, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyIndexUI", "goPrepareLuckmoney", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void W6() {
        java.lang.String stringExtra = getIntent().getStringExtra("key_username");
        java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.f226985a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.c1 a17 = c01.e2.S(stringExtra) ? hb3.o.Ni().Di().a() : hb3.o.Ni().wi().a();
        if (a17 == null) {
            return;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.j2d);
        if ((a17.f226722n & 1) != 1) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c_q);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyIndexUI", "initView: topBg use money bg");
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c_p);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bum;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f573978go2);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.x5(this));
        this.f227673g = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.j2c);
        this.f227674h = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.j2a);
        this.f227675i = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.j28);
        ((android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.j2b)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.y5(this));
        ((android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.j2_)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.z5(this));
        m78494xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.glo), new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.b6(this), null, com.p314xaae8f345.mm.ui.fb.TRANSPARENT_GOLD_TEXT);
        W6();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi().k(this, null);
        mo43517x10010bd5();
        java.lang.String stringExtra = getIntent().getStringExtra("key_username");
        java.lang.String stringExtra2 = getIntent().getStringExtra("key_username");
        java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.f226985a;
        if (c01.e2.S(stringExtra2)) {
            m66165x5406100e(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.y5("v1.0", ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_ENVELOPE_HAS_SOURCE_INT_SYNC, 0)).intValue(), stringExtra), false);
        } else {
            m66165x5406100e(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.x5(com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(stringExtra) ? 0 : 25, "v1.0", ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_ENVELOPE_HAS_SOURCE_INT_SYNC, 0)).intValue(), stringExtra), false);
        }
        this.f227676m = getIntent().getIntExtra("pay_channel", -1);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11701, 3, 0, 0, 0, 1);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        cu4.g wi6 = ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi();
        wi6.e(this, wi6.i(), null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d
    /* renamed from: onSceneEnd */
    public boolean mo66056x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (!(m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.x5)) {
            return false;
        }
        if (i17 != 0 || i18 != 0) {
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.x5 x5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.x5) m1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ok okVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ok();
        okVar.f228816a = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560892xe);
        okVar.f228819d = 101;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.rk.b(this, this.f227673g, x5Var.f227239u, okVar, "Text");
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ok okVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ok();
        okVar2.f228816a = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560892xe);
        okVar2.f228819d = 100;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.rk.b(this, this.f227674h, x5Var.f227241w, okVar2, "Text");
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ok okVar3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ok();
        okVar3.f228819d = 102;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.rk.b(this, this.f227675i, x5Var.f227238t, okVar3, "Pic");
        W6();
        return true;
    }
}
