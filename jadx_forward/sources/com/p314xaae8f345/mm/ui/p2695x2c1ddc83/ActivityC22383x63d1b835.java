package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* renamed from: com.tencent.mm.ui.conversation.ServiceNotifyConversationUI */
/* loaded from: classes9.dex */
public class ActivityC22383x63d1b835 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f288948d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ListView f288949e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ya f288950f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.l4 f288951g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f288952h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f288953i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f288954m = "";

    /* renamed from: n, reason: collision with root package name */
    public xg3.h0 f288955n;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ckg;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.qa.class);
        return hashSet;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54450xbf7c1df6(this.f288953i);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ta(this));
        m78588xfb5745ae(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ua(this));
        this.f288949e = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.odk);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dfo);
        this.f288948d = textView;
        textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.hc9);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) findViewById(com.p314xaae8f345.mm.R.id.mjh);
        java.lang.String str = te5.v1.f500291b;
        c22621x7603e017.setOnClickListener(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.va(this, str));
        this.f288950f = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ya(this, this.f288952h, new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.wa(this));
        this.f288949e.setAdapter((android.widget.ListAdapter) this.f288950f);
        this.f288949e.setOnItemClickListener(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.xa(this, str));
        this.f288950f.getClass();
        this.f288950f.getClass();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        java.lang.String str = this.f288954m;
        if (str == null || str.isEmpty()) {
            return;
        }
        this.f288954m = "";
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ServiceNotifyConversationUI", "onCreate acc not ready!!!");
            finish();
            return;
        }
        this.f288952h = "notifymessage";
        this.f288953i = getIntent().getStringExtra("enterprise_biz_display_name");
        getIntent().getStringExtra("service_notify_session_id");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f288953i)) {
            this.f288953i = getString(com.p314xaae8f345.mm.R.C30867xcad56011.fuw);
        }
        mo43517x10010bd5();
        m78548x39037dd1();
        m78480x84f07bce(0, com.p314xaae8f345.mm.R.C30867xcad56011.f571351cm, com.p314xaae8f345.mm.R.raw.f78368xa86f0fea, false, (android.view.MenuItem.OnMenuItemClickListener) new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.sa(this));
        ((l75.a1) c01.d9.b().r()).a(this.f288950f);
        this.f288955n = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ra(this);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().n0(this.f288955n, android.os.Looper.getMainLooper());
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        if (this.f288955n != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().za(this.f288955n);
            this.f288955n = null;
        }
        if (gm0.j1.a()) {
            ((l75.a1) c01.d9.b().r()).e(this.f288950f);
        }
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ya yaVar = this.f288950f;
        if (yaVar != null) {
            yaVar.E();
        }
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ServiceNotifyConversationUI", "on pause");
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ya yaVar = this.f288950f;
        if (yaVar != null) {
            yaVar.F();
        }
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ya yaVar = this.f288950f;
        if (yaVar != null) {
            yaVar.G();
        }
        super.onResume();
    }
}
