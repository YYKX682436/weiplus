package com.p314xaae8f345.mm.ui.p2649x8f4dc54e;

/* renamed from: com.tencent.mm.ui.brandservice.BrandServiceNotifyUI */
/* loaded from: classes11.dex */
public class ActivityC21598xfb43db0b extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f279552x = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f279553d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ListView f279554e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2649x8f4dc54e.l f279555f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.l4 f279556g;

    /* renamed from: h, reason: collision with root package name */
    public rl5.r f279557h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f279558i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f279559m;

    /* renamed from: s, reason: collision with root package name */
    public long f279565s;

    /* renamed from: n, reason: collision with root package name */
    public int f279560n = 1;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f279561o = "";

    /* renamed from: p, reason: collision with root package name */
    public long f279562p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f279563q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f279564r = 0;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f279566t = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("brandService_accounts");

    /* renamed from: u, reason: collision with root package name */
    public boolean f279567u = false;

    /* renamed from: v, reason: collision with root package name */
    public final db5.t4 f279568v = new com.p314xaae8f345.mm.ui.p2649x8f4dc54e.g(this);

    /* renamed from: w, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f279569w = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5160x33ad8273>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.ui.brandservice.BrandServiceNotifyUI.20
        {
            this.f39173x3fe91575 = 2123042947;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5160x33ad8273 c5160x33ad8273) {
            am.q qVar;
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5160x33ad8273 c5160x33ad82732 = c5160x33ad8273;
            if (c5160x33ad82732 == null || (qVar = c5160x33ad82732.f135510g) == null || qVar.f89217a) {
                return false;
            }
            com.p314xaae8f345.mm.ui.p2649x8f4dc54e.ActivityC21598xfb43db0b.this.f279562p = 0L;
            return false;
        }
    };

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d1c;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54450xbf7c1df6(this.f279559m);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.ui.p2649x8f4dc54e.h(this));
        m78588xfb5745ae(new com.p314xaae8f345.mm.ui.p2649x8f4dc54e.i(this));
        this.f279554e = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.odk);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dfo);
        this.f279553d = textView;
        textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.mfw);
        this.f279555f = new com.p314xaae8f345.mm.ui.p2649x8f4dc54e.l(this, this.f279558i, new com.p314xaae8f345.mm.ui.p2649x8f4dc54e.k(this));
        this.f279555f.getClass();
        this.f279554e.setAdapter((android.widget.ListAdapter) this.f279555f);
        this.f279557h = new rl5.r(this);
        this.f279554e.setOnItemClickListener(new com.p314xaae8f345.mm.ui.p2649x8f4dc54e.a(this));
        this.f279554e.setOnTouchListener(new com.p314xaae8f345.mm.ui.p2649x8f4dc54e.b(this));
        this.f279554e.setOnItemLongClickListener(new com.p314xaae8f345.mm.ui.p2649x8f4dc54e.c(this));
        this.f279555f.getClass();
        this.f279555f.getClass();
        this.f279555f.getClass();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        java.lang.String str = this.f279561o;
        if (str == null || str.isEmpty()) {
            return;
        }
        this.f279561o = "";
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BrandServiceConversationUI", "onCreate acc not ready!!!");
            finish();
            return;
        }
        this.f279565s = getIntent().getLongExtra("biz_time_line_line_session_id", 0L);
        this.f279560n = getIntent().getIntExtra("biz_enter_source", 1);
        this.f279558i = "service_officialaccounts";
        java.lang.String stringExtra = getIntent().getStringExtra("enterprise_biz_display_name");
        this.f279559m = stringExtra;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            this.f279559m = getString(com.p314xaae8f345.mm.R.C30867xcad56011.m7b);
        }
        mo43517x10010bd5();
        ((l75.a1) c01.d9.b().r()).a(this.f279555f);
        this.f279562p = java.lang.System.currentTimeMillis();
        this.f279569w.mo48813x58998cd();
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(this.f279561o, true);
        if (n17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BrandServiceConversationUI", "onCreateContextMenu, contact is null, talker = " + this.f279561o);
            return;
        }
        java.lang.String g27 = n17.g2();
        if (g27.toLowerCase().endsWith("@chatroom") && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.P0())) {
            g27 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.b5v);
        }
        android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (android.widget.AdapterView.AdapterContextMenuInfo) contextMenuInfo;
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        contextMenu.setHeaderTitle(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(this, g27));
        if (n17.r2()) {
            contextMenu.add(adapterContextMenuInfo.position, 2, 0, com.p314xaae8f345.mm.R.C30867xcad56011.gqb);
        }
        contextMenu.add(adapterContextMenuInfo.position, 3, 0, com.p314xaae8f345.mm.R.C30867xcad56011.gqi);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        gm0.j1.e().j(new com.p314xaae8f345.mm.ui.p2649x8f4dc54e.j(this));
        this.f279569w.mo48814x2efc64();
        if (gm0.j1.a()) {
            ((l75.a1) c01.d9.b().r()).e(this.f279555f);
        }
        com.p314xaae8f345.mm.ui.p2649x8f4dc54e.l lVar = this.f279555f;
        if (lVar != null) {
            lVar.E();
        }
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandServiceConversationUI", "on pause");
        com.p314xaae8f345.mm.ui.p2649x8f4dc54e.l lVar = this.f279555f;
        if (lVar != null) {
            lVar.F();
        }
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.mm.ui.p2649x8f4dc54e.l lVar = this.f279555f;
        if (lVar != null) {
            lVar.G();
        }
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.addAll(super.mo43419xa59964ef());
        hashSet.add(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b8.class);
    }
}
