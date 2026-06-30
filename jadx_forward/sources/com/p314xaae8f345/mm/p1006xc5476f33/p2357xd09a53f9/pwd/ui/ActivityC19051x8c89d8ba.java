package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletLuckyMoneyRefundWayUI */
/* loaded from: classes9.dex */
public class ActivityC19051x8c89d8ba extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f260445d;

    /* renamed from: e, reason: collision with root package name */
    public long f260446e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb f260447f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.C19037xa7790f87 f260448g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.C19037xa7790f87 f260449h;

    /* renamed from: i, reason: collision with root package name */
    public gs4.f f260450i;

    public final void V6(int i17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7049x74612385 c7049x74612385 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7049x74612385();
        c7049x74612385.f143634d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B0(this.f260446e & 3, 2L) ? 2 : 1;
        c7049x74612385.f143635e = i17;
        c7049x74612385.k();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f260447f = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f260445d).h("refund_way_detail");
        this.f260448g = (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.C19037xa7790f87) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f260445d).h("refund_way_detail_lq");
        this.f260449h = (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.C19037xa7790f87) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f260445d).h("refund_way_detail_origin");
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb = this.f260447f;
        if (c21560x1fce98fb != null) {
            c21560x1fce98fb.L(this.f260450i.f356621h);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.C19037xa7790f87 c19037xa7790f87 = this.f260448g;
        if (c19037xa7790f87 != null) {
            c19037xa7790f87.L(this.f260450i.f356617d);
            this.f260448g.H(this.f260450i.f356618e);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.C19037xa7790f87 c19037xa7790f872 = this.f260449h;
        if (c19037xa7790f872 != null) {
            c19037xa7790f872.L(this.f260450i.f356619f);
            this.f260449h.H(this.f260450i.f356620g);
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.C19037xa7790f87 c19037xa7790f873 = this.f260449h;
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.g1 g1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.g1(this);
            c19037xa7790f873.Q = com.p314xaae8f345.mm.R.C30861xcebc809e.cdu;
            c19037xa7790f873.R = g1Var;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B0(this.f260446e & 3, 2L)) {
            this.f260448g.H = com.p314xaae8f345.mm.R.C30864xbddafb2a.c0t;
            this.f260449h.H = com.p314xaae8f345.mm.R.C30864xbddafb2a.c0s;
        } else {
            this.f260448g.H = com.p314xaae8f345.mm.R.C30864xbddafb2a.c0s;
            this.f260449h.H = com.p314xaae8f345.mm.R.C30864xbddafb2a.c0t;
        }
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.h1(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        m78503xa10faa4c(true);
        super.onCreate(bundle);
        mo64405x4dab7448(mo78508x85b50c3c());
        java.lang.String stringExtra = getIntent().getStringExtra("key_hb_refund_config");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLuckyMoneyRefundWayUI", "mHbRefundConfig == null");
            finish();
        } else {
            this.f260450i = gs4.f.a(stringExtra);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r m79336x8b97809d = m79336x8b97809d();
        this.f260445d = m79336x8b97809d;
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d).g(com.p314xaae8f345.mm.R.xml.f576506d2);
        mo54450xbf7c1df6(this.f260450i.f356615b);
        gm0.j1.i();
        long longValue = ((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXT_PAY_SETTING_LONG_SYNC, 0L)).longValue();
        this.f260446e = longValue;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLuckyMoneyRefundWayUI", "origin extStatus: %s", java.lang.Long.toBinaryString(longValue));
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        r45.oo4 oo4Var = new r45.oo4();
        long j17 = this.f260446e;
        if ((((long) 1) & j17) != 0) {
            oo4Var.f463929d = 1L;
            oo4Var.f463930e = 2L;
        } else {
            if ((((long) 2) & j17) != 0) {
                oo4Var.f463929d = 2L;
                oo4Var.f463930e = 1L;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLuckyMoneyRefundWayUI", "doSettingsOplog() extStatus: %s, set_bitmask: %s, clear_bitmask:%s", java.lang.Long.toBinaryString(j17), java.lang.Long.toBinaryString(oo4Var.f463929d), java.lang.Long.toBinaryString(oo4Var.f463930e));
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(218, oo4Var));
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        java.lang.String str = c21560x1fce98fb.f279313q;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLuckyMoneyRefundWayUI", "onPreferenceTreeClick() key:%s", str);
        if ("refund_way_detail_lq".equals(str)) {
            this.f260448g.H = com.p314xaae8f345.mm.R.C30864xbddafb2a.c0s;
            this.f260449h.H = com.p314xaae8f345.mm.R.C30864xbddafb2a.c0t;
            V6(1);
            this.f260446e = (this.f260446e | 1) & (-3);
        } else if ("refund_way_detail_origin".equals(str)) {
            this.f260448g.H = com.p314xaae8f345.mm.R.C30864xbddafb2a.c0t;
            this.f260449h.H = com.p314xaae8f345.mm.R.C30864xbddafb2a.c0s;
            V6(2);
            this.f260446e = (this.f260446e & (-2)) | 2;
        }
        gm0.j1.i();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXT_PAY_SETTING_LONG_SYNC, java.lang.Long.valueOf(this.f260446e));
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f260445d).notifyDataSetChanged();
        finish();
        return true;
    }
}
