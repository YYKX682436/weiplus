package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

@db5.a(m123858x6ac9171 = 3)
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.wallet_core.ui.ShowWxPayAgreementsUI */
/* loaded from: classes7.dex */
public class ActivityC19103x9ff95607 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 f261381d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f261382e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f261383f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f261384g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f261385h;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShowWxPayAgreementsUI", "onRefreshed");
        super.finish();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cni;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15236, 1);
        mo2533x106ab264().o();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
        getIntent().getIntExtra("agreement_type", 0);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59) m78513xc2a54588().findViewById(com.p314xaae8f345.mm.R.id.f564325o4);
        c22633x83752a59.getClass();
        this.f261381d = c22633x83752a59;
        c22633x83752a59.mo120153xd15cf999().E(true);
        this.f261381d.mo120128x74041feb(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.q0(null), "privacyPageTools");
        this.f261382e = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.f564322o1);
        this.f261383f = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.f564319ny);
        this.f261385h = getIntent().getStringExtra("agreement_content");
        this.f261384g = findViewById(com.p314xaae8f345.mm.R.id.f564311nq);
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            this.f261384g.setBackground(mo55332x76847179().getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f81436x33e945e3));
        } else {
            this.f261384g.setBackground(mo55332x76847179().getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f81437xf0852c14));
        }
        this.f261383f.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.o0(this));
        this.f261382e.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p0(this));
        this.f261381d.mo74800x23d27c02(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.m0(this));
        if (mo55332x76847179().getApplicationInfo().targetSdkVersion >= 29) {
            this.f261381d.mo74798x6dfa45b0(android.util.Base64.encodeToString(this.f261385h.getBytes(), 0), "text/html; charset=UTF-8", "base64");
        } else {
            this.f261381d.mo74798x6dfa45b0(this.f261385h, "text/html; charset=UTF-8", null);
        }
        zg0.h3 h3Var = (zg0.h3) i95.n0.c(zg0.h3.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        ((yg0.g4) h3Var).getClass();
        int a17 = hy4.b0.a(mo55332x76847179);
        if (a17 < 1 || a17 > 8) {
            a17 = 2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShowWxPayAgreementsUI", "localSetFontSize, fontSize = " + a17);
        switch (a17) {
            case 1:
                this.f261381d.mo120153xd15cf999().O(80);
                return;
            case 2:
                this.f261381d.mo120153xd15cf999().O(100);
                return;
            case 3:
                this.f261381d.mo120153xd15cf999().O(110);
                return;
            case 4:
                this.f261381d.mo120153xd15cf999().O(112);
                return;
            case 5:
                this.f261381d.mo120153xd15cf999().O(112);
                return;
            case 6:
                this.f261381d.mo120153xd15cf999().O(140);
                return;
            case 7:
                this.f261381d.mo120153xd15cf999().O(155);
                return;
            case 8:
                this.f261381d.mo120153xd15cf999().O(165);
                return;
            default:
                this.f261381d.mo120153xd15cf999().O(100);
                return;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = this.f261381d;
        if (c22633x83752a59 != null) {
            c22633x83752a59.mo52095x5cd39ffa();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            return true;
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
