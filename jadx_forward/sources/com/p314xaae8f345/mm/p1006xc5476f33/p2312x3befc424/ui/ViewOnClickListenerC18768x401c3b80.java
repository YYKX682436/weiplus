package com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui;

/* renamed from: com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseAllInOneUI */
/* loaded from: classes14.dex */
public class ViewOnClickListenerC18768x401c3b80 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements android.view.View.OnClickListener {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f256817y = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f256818d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f256819e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f256820f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f256821g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f256822h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f256823i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f256824m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f256825n;

    /* renamed from: o, reason: collision with root package name */
    public int f256826o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f256827p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f256828q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f256829r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f256830s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f256831t;

    /* renamed from: u, reason: collision with root package name */
    public i11.e f256832u;

    /* renamed from: v, reason: collision with root package name */
    public i11.c f256833v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f256834w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f256835x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseAllInOneUI$1, reason: invalid class name */
    /* loaded from: classes14.dex */
    public class AnonymousClass1 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5737xb448caf1> {
        public AnonymousClass1(p012xc85e97e9.p093xedfae76a.y yVar) {
            super(yVar);
            this.f39173x3fe91575 = 829538561;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5737xb448caf1 c5737xb448caf1) {
            int i17;
            am.zk zkVar = c5737xb448caf1.f136061g;
            int i18 = zkVar.f90108b;
            int i19 = zkVar.f90107a;
            int i27 = 2;
            com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.ViewOnClickListenerC18768x401c3b80 viewOnClickListenerC18768x401c3b80 = com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.ViewOnClickListenerC18768x401c3b80.this;
            if (i18 == 0) {
                viewOnClickListenerC18768x401c3b80.f256826o = 33;
                viewOnClickListenerC18768x401c3b80.f256829r = i19 == 0;
            } else if (i18 == 1) {
                viewOnClickListenerC18768x401c3b80.f256826o = 66;
                viewOnClickListenerC18768x401c3b80.f256830s = i19 == 0;
            } else if (i18 == 2) {
                viewOnClickListenerC18768x401c3b80.f256831t = i19 == 0;
            }
            int i28 = viewOnClickListenerC18768x401c3b80.f256818d;
            if (zkVar.f90109c) {
                viewOnClickListenerC18768x401c3b80.f256826o = 100;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.a(this));
                viewOnClickListenerC18768x401c3b80.f256827p = zkVar.f90110d;
                i17 = 1000;
                if (!viewOnClickListenerC18768x401c3b80.f256829r) {
                    i27 = viewOnClickListenerC18768x401c3b80.f256830s ? 4 : viewOnClickListenerC18768x401c3b80.f256831t ? 5 : 3;
                }
            } else {
                i27 = i28;
                i17 = 0;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.b(this, i27), i17);
            return false;
        }
    }

    public final void T6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetworkDiagnoseAllInOneUI", "refreshUI, state:%d", java.lang.Integer.valueOf(this.f256818d));
        switch (this.f256818d) {
            case 0:
            case 1:
                this.f256822h.setImageResource(com.p314xaae8f345.mm.R.raw.f80712x66b91ca1);
                this.f256823i.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.bpi, java.lang.Integer.valueOf(this.f256826o)));
                this.f256824m.setText(com.p314xaae8f345.mm.R.C30867xcad56011.bpa);
                this.f256819e.setVisibility(4);
                this.f256821g.setVisibility(4);
                return;
            case 2:
                this.f256822h.setImageResource(com.p314xaae8f345.mm.R.raw.f80712x66b91ca1);
                this.f256823i.setText(com.p314xaae8f345.mm.R.C30867xcad56011.bpm);
                this.f256824m.setText(com.p314xaae8f345.mm.R.C30867xcad56011.bpd);
                this.f256819e.setVisibility(0);
                this.f256821g.setVisibility(4);
                return;
            case 3:
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, com.p314xaae8f345.mm.R.C30867xcad56011.f572033wu);
                intent.putExtra("rawUrl", getString(com.p314xaae8f345.mm.R.C30867xcad56011.h7h));
                intent.putExtra("showShare", false);
                j45.l.j(this, "webview", ".ui.tools.WebViewUI", intent, null);
                U6(false);
                finish();
                return;
            case 4:
                this.f256822h.setImageResource(com.p314xaae8f345.mm.R.raw.f80710x66b12cae);
                this.f256823i.setText(com.p314xaae8f345.mm.R.C30867xcad56011.bpl);
                this.f256824m.setText(com.p314xaae8f345.mm.R.C30867xcad56011.bpb);
                this.f256819e.setVisibility(0);
                this.f256819e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.bp8);
                this.f256821g.setVisibility(0);
                return;
            case 5:
                this.f256822h.setImageResource(com.p314xaae8f345.mm.R.raw.f80710x66b12cae);
                this.f256823i.setText(com.p314xaae8f345.mm.R.C30867xcad56011.bpj);
                this.f256824m.setText(com.p314xaae8f345.mm.R.C30867xcad56011.bpb);
                this.f256819e.setVisibility(0);
                this.f256819e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.bp8);
                this.f256821g.setVisibility(0);
                return;
            case 6:
                this.f256822h.setImageResource(com.p314xaae8f345.mm.R.raw.f80711xe851f915);
                this.f256823i.setText(com.p314xaae8f345.mm.R.C30867xcad56011.bpk);
                this.f256824m.setText(com.p314xaae8f345.mm.R.C30867xcad56011.bpc);
                this.f256819e.setVisibility(0);
                this.f256819e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.bp7);
                this.f256821g.setVisibility(4);
                return;
            default:
                return;
        }
    }

    public final void U6(boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f256827p)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetworkDiagnoseAllInOneUI", "submit action, bSendLoaction:%b", java.lang.Boolean.valueOf(z17));
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(14533, "," + this.f256827p);
            return;
        }
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        if (j35.u.a(this, "android.permission.ACCESS_FINE_LOCATION", 71, "", "")) {
            this.f256825n = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.bpo), true, true, null);
            this.f256819e.setEnabled(false);
            if (this.f256832u == null) {
                ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
                this.f256832u = i11.h.e();
            }
            ((i11.h) this.f256832u).l(this.f256833v, true, false, false);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.b1.f(22, 10);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c7i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseAllInOneUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = this.f256818d;
        if ((i17 == 5 || i17 == 4) && view == this.f256819e) {
            U6(true);
        } else {
            U6(false);
            finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseAllInOneUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
        mo54450xbf7c1df6("");
        mo2533x106ab264().o();
        android.content.Intent intent = getIntent();
        this.f256818d = intent.getIntExtra("diagnose_state", 0);
        this.f256826o = intent.getIntExtra("diagnose_percent", 1);
        this.f256827p = intent.getStringExtra("diagnose_kvInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetworkDiagnoseAllInOneUI", "get state: %d percent: %d, kv: %s", java.lang.Integer.valueOf(this.f256818d), java.lang.Integer.valueOf(this.f256826o), this.f256827p);
        if (this.f256818d == 0) {
            this.f256818d = 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetworkDiagnoseAllInOneUI", "start diagnose");
            c01.d9.e().g(new c01.ra(new com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.g(this), null));
        }
        this.f256819e = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.cy7);
        this.f256820f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565617cy5);
        this.f256821g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565616cy4);
        this.f256822h = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.cy9);
        this.f256823i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.cy_);
        this.f256824m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.cy6);
        this.f256820f.setOnClickListener(this);
        this.f256819e.setOnClickListener(this);
        this.f256821g.setOnClickListener(this);
        T6();
        com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.ViewOnClickListenerC18768x401c3b80.AnonymousClass1 anonymousClass1 = new com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.ViewOnClickListenerC18768x401c3b80.AnonymousClass1(com.p314xaae8f345.mm.app.a0.f134821d);
        this.f256828q = anonymousClass1;
        anonymousClass1.mo48813x58998cd();
        this.f256833v = new com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.e(this);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.f(this), true);
        this.f256834w = b4Var;
        int i17 = this.f256818d;
        if (i17 == 0 || i17 == 1) {
            b4Var.c(1000L, 1000L);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f256828q.mo48814x2efc64();
        i11.e eVar = this.f256832u;
        if (eVar != null) {
            ((i11.h) eVar).m(this.f256833v);
            this.f256832u = null;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f256834w;
        if (b4Var != null) {
            b4Var.d();
            this.f256834w = null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetworkDiagnoseAllInOneUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 71) {
            return;
        }
        if (iArr[0] == 0) {
            U6(true);
        } else {
            db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhm), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hh9), false, new com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.h(this), new com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.i(this));
        }
    }
}
