package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI */
/* loaded from: classes9.dex */
public class ActivityC16367x1189c620 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {
    public static final /* synthetic */ int C = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f227653d;

    /* renamed from: e, reason: collision with root package name */
    public int f227654e;

    /* renamed from: f, reason: collision with root package name */
    public int f227655f;

    /* renamed from: g, reason: collision with root package name */
    public int f227656g;

    /* renamed from: h, reason: collision with root package name */
    public int f227657h;

    /* renamed from: i, reason: collision with root package name */
    public int f227658i;

    /* renamed from: m, reason: collision with root package name */
    public int f227659m;

    /* renamed from: n, reason: collision with root package name */
    public int f227660n;

    /* renamed from: o, reason: collision with root package name */
    public int f227661o;

    /* renamed from: p, reason: collision with root package name */
    public int f227662p;

    /* renamed from: q, reason: collision with root package name */
    public int f227663q;

    /* renamed from: r, reason: collision with root package name */
    public int f227664r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.FrameLayout f227665s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f227666t;

    /* renamed from: u, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f227667u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f227668v;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f227671y;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.ArrayList f227669w = new java.util.ArrayList();

    /* renamed from: x, reason: collision with root package name */
    public final java.util.List f227670x = new java.util.ArrayList();

    /* renamed from: z, reason: collision with root package name */
    public boolean f227672z = true;
    public java.lang.String A = "";
    public boolean B = true;

    public final void T6(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyHistoryEnvelopeUI", "do get show source: %s", java.lang.Boolean.valueOf(this.f227672z));
        if (!this.f227672z) {
            this.f227666t.N(0);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n0 g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n0.g();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 O = !z17 ? db5.e1.O(mo55332x76847179(), null, 3, com.p314xaae8f345.mm.R.C30868x68b1db1.f575789i6, getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.m4(this, g17)) : null;
        g17.f295418c = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h(this.A, 2);
        g17.c(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.n4(this, O), true);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.buj;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f227665s = (android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.f567318j20);
        this.f227666t = (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) findViewById(com.p314xaae8f345.mm.R.id.f567198ij4);
        this.f227667u = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.f567199ij5);
        this.f227666t.m82690xd3a27e96(false);
        this.f227666t.m82683xb165a19d(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.b5(this));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d(mo55332x76847179(), 2);
        c1161x57298f5d.B = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.c5(this, c1161x57298f5d);
        this.f227667u.mo7967x900dcbe1(c1161x57298f5d);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI.4
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int i17) {
                return i17 == 1 ? new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.t5(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16367x1189c620.this) : new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.v5(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16367x1189c620.this);
            }
        }, this.f227669w, false);
        this.f227668v = c22848x6ddd90cf;
        c22848x6ddd90cf.f374638o = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.d5(this);
        c22848x6ddd90cf.f374637n = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.e5(this);
        this.f227667u.mo7960x6cab2c8d(c22848x6ddd90cf);
        this.f227667u.N(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.f5(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a));
        mo78530x8b45058f();
        mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.gka));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.y4(this));
        java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.f226985a;
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_lucky_money_dynamic_history_close_switch, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyUtil", "needCloseLuckyMoneyDynamicConfigHistory：%s ", java.lang.Boolean.valueOf(fj6));
        this.B = fj6;
        this.f227671y = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.o(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        getWindow().getDecorView().post(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.a5(this));
        mo43517x10010bd5();
        T6(false);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }
}
