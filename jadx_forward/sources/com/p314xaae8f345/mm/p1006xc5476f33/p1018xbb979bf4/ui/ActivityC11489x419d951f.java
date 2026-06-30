package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

@db5.a(m123858x6ac9171 = 8192)
/* renamed from: com.tencent.mm.plugin.address.ui.InvoiceListUI */
/* loaded from: classes15.dex */
public class ActivityC11489x419d951f extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f155957o = 0;

    /* renamed from: d, reason: collision with root package name */
    public i83.b f155958d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.b0 f155959e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ListView f155960f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f155961g = new java.lang.Object();

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f155962h = null;

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f155963i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public boolean f155964m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f155965n = false;

    public final void T6(int i17) {
        android.content.Intent intent = new android.content.Intent();
        if (i17 != 0) {
            intent.setClass(this, com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11492x2ff66a73.class);
            intent.putExtra("invoice_id", i17);
        } else {
            intent.setClass(this, com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11486x99e55700.class);
            intent.putExtra("launch_from_invoicelist_webview", this.f155964m);
            intent.putExtra("invoice_id", i17);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/address/ui/InvoiceListUI", "editInvoiceUI", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/address/ui/InvoiceListUI", "editInvoiceUI", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void U6() {
        synchronized (this.f155961g) {
            o71.l.wi();
            java.util.LinkedList linkedList = o71.l.Ai().f434006a.f371166d;
            this.f155963i = linkedList;
            this.f155959e.f156054e = linkedList;
            linkedList.size();
            this.f155959e.notifyDataSetChanged();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.blg;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.hb7);
        this.f155962h = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        if (this.f155964m) {
            android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.hp_);
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
        } else {
            android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.hp_);
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
        }
        this.f155962h.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.t(this));
        this.f155960f = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.mpv);
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.b0 b0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.b0(this, this);
        this.f155959e = b0Var;
        this.f155960f.setAdapter((android.widget.ListAdapter) b0Var);
        this.f155960f.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.u(this));
        this.f155960f.setOnItemLongClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.w(this));
        this.f155959e.notifyDataSetChanged();
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.x(this));
        m78478x84f07bce(0, com.p314xaae8f345.mm.R.C30867xcad56011.ip6, com.p314xaae8f345.mm.R.raw.f78351x6c69febc, new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.y(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        i83.b bVar;
        if (i17 == 1) {
            if (-1 == i18) {
                if (intent == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.InvoiceUtil", "intent is null");
                    bVar = null;
                } else {
                    bVar = new i83.b();
                    java.lang.String stringExtra = intent.getStringExtra("type");
                    bVar.f371168e = stringExtra;
                    if (stringExtra == null || !stringExtra.equals("1")) {
                        bVar.f371169f = intent.getStringExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
                        bVar.f371171h = intent.getStringExtra("tax_number");
                        bVar.f371178r = intent.getStringExtra("company_address");
                        bVar.f371175o = intent.getStringExtra("telephone");
                        bVar.f371173m = intent.getStringExtra("bank_name");
                        bVar.f371172i = intent.getStringExtra("bank_account");
                    } else {
                        bVar.f371170g = intent.getStringExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
                    }
                }
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("choose_invoice_title_info", t71.e.a(bVar));
                setResult(-1, intent2);
            } else {
                setResult(0);
            }
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        this.f155964m = intent.getBooleanExtra("launch_from_webview", false);
        boolean booleanExtra = intent.getBooleanExtra("launch_from_appbrand", false);
        if (this.f155964m || booleanExtra) {
            this.f155964m = true;
        }
        if (this.f155964m) {
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 p17 = c01.d9.b().p();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_INVOICE_HAS_SHOW_DISCLAIMER_DIALOG_BOOLEAN_SYNC;
            boolean booleanValue = ((java.lang.Boolean) p17.m(u3Var, java.lang.Boolean.TRUE)).booleanValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.InvoiceListUI", "showDisclaimerDailog..isShowDisclaimerDialog " + booleanValue);
            if (booleanValue) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.InvoiceListUI", "showDisclaimerDialog");
                db5.e1.E(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573866g33), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573867g34), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571241h), false, new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.z(this));
                c01.d9.b().p().x(u3Var, java.lang.Boolean.FALSE);
            }
        }
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.itr);
        c01.d9.e().a(tj.d.f76812x366c91de, this);
        c01.d9.e().a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.n.f34699x366c91de, this);
        mo43517x10010bd5();
        U6();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        c01.d9.e().q(tj.d.f76812x366c91de, this);
        c01.d9.e().q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.n.f34699x366c91de, this);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        c01.d9.e().g(new q71.m());
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            if (m1Var.mo808xfb85f7b0() != 1191) {
                if (m1Var.mo808xfb85f7b0() == 1194) {
                    c01.d9.e().g(new q71.m());
                    this.f155965n = true;
                    return;
                }
                return;
            }
            U6();
            if (this.f155964m) {
                o71.l.wi();
                if (o71.l.Ai().f434006a.f371166d.size() != 0 || this.f155965n) {
                    return;
                }
                android.content.Intent intent = new android.content.Intent();
                intent.setClass(this, com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11486x99e55700.class);
                intent.putExtra("launch_from_webview", true);
                startActivityForResult(intent, 1);
            }
        }
    }
}
