package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectedRouterActivateStateUI */
/* loaded from: classes5.dex */
public class ActivityC13463xb23ee7a9 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f180767p = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.C13464x6f9bd54d f180768d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f180769e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f180770f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f180771g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f180772h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f180773i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f180774m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f180775n;

    /* renamed from: o, reason: collision with root package name */
    public final h32.b f180776o = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.u1(this);

    public final void T6() {
        finish();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("From_fail_notify", true);
        j45.l.u(this, "com.tencent.mm.ui.LauncherUI", intent, null);
    }

    public void U6(int i17) {
        this.f180768d.setOnClickListener(null);
        if (i17 == 1) {
            this.f180768d.setImageResource(com.p314xaae8f345.mm.R.raw.f78900x78d33355);
            this.f180768d.m55080x53b6854f(1);
            this.f180769e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572670c32);
            return;
        }
        if (i17 == 2) {
            this.f180768d.setImageResource(com.p314xaae8f345.mm.R.raw.f78901x96e94430);
            this.f180768d.m55080x53b6854f(2);
            this.f180769e.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572674c36, this.f180775n));
            mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572669c31), new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.w1(this));
            return;
        }
        if (i17 == 3) {
            this.f180768d.setImageResource(com.p314xaae8f345.mm.R.raw.f78899x4578d5da);
            this.f180768d.m55080x53b6854f(3);
            this.f180768d.f180779f = 2;
            this.f180769e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572671c33);
            this.f180770f.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572672c34, this.f180775n));
            return;
        }
        if (i17 == 4) {
            this.f180768d.setImageResource(com.p314xaae8f345.mm.R.raw.f78899x4578d5da);
            this.f180768d.m55080x53b6854f(3);
            this.f180768d.f180779f = 2;
            this.f180769e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572671c33);
            this.f180770f.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572673c35));
            return;
        }
        if (i17 != 5) {
            return;
        }
        this.f180768d.setImageResource(com.p314xaae8f345.mm.R.raw.f78899x4578d5da);
        this.f180768d.m55080x53b6854f(3);
        this.f180768d.f180779f = 2;
        this.f180769e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572671c33);
        this.f180770f.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.c37));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a9o;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.c38);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.v1(this));
        this.f180768d = (com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.C13464x6f9bd54d) findViewById(com.p314xaae8f345.mm.R.id.diy);
        this.f180769e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dix);
        this.f180770f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.diz);
        try {
            android.net.Uri parse = android.net.Uri.parse(getIntent().getStringExtra("key_connected_router"));
            this.f180771g = parse.getQueryParameter("deviceid");
            this.f180772h = parse.getQueryParameter("devicetype");
            this.f180773i = parse.getQueryParameter(com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26768x16959c15.f56763xc4fe047c);
            this.f180774m = parse.getQueryParameter("appid");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f180771g) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f180772h) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f180773i) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f180774m)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConnectedRouterActivateStateUi", "loss param %s", parse.toString());
                finish();
            }
            this.f180775n = parse.getQueryParameter(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52923xbc17776f);
            parse.toString();
            if (this.f180775n == null) {
                this.f180775n = "";
            }
        } catch (java.lang.Exception e17) {
            e17.toString();
        }
        U6(1);
        gm0.j1.n().f354821b.g(new j32.a(this.f180771g, this.f180772h, this.f180773i, this.f180774m, this.f180776o));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        T6();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
