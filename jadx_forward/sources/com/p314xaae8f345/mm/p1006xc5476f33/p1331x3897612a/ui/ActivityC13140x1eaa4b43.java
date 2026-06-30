package com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui;

@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.collect.ui.CollectBillListUI */
/* loaded from: classes9.dex */
public class ActivityC13140x1eaa4b43 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f177875d;

    /* renamed from: e, reason: collision with root package name */
    public zw1.d f177876e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f177877f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f177878g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.C13145x888fbdf6 f177879h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f177880i;

    /* renamed from: m, reason: collision with root package name */
    public android.app.Dialog f177881m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f177882n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f177883o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f177884p = false;

    /* renamed from: q, reason: collision with root package name */
    public int f177885q = 0;

    /* renamed from: r, reason: collision with root package name */
    public final int f177886r = 20;

    /* renamed from: s, reason: collision with root package name */
    public int f177887s = 0;

    /* renamed from: t, reason: collision with root package name */
    public long f177888t = 0;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.List f177889u = new java.util.ArrayList();

    public final void U6() {
        int count = this.f177876e.getCount();
        if (count > 0) {
            long j17 = ((ww1.n1) ((java.util.ArrayList) this.f177876e.f558133e).get(count - 1)).f531782b;
            if (j17 < this.f177888t) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CollectBillListUI", "server lastTimestamp is error! %s, %s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(this.f177888t));
                this.f177888t = j17;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CollectBillListUI", "get next page, type: %d, timestamp: %s", java.lang.Integer.valueOf(this.f177885q), java.lang.Long.valueOf(this.f177888t));
        m83099x5406100e(new ww1.x1(this.f177885q, this.f177888t, 0, this.f177886r, 0), false);
        this.f177882n = true;
    }

    public final void V6(int i17, long j17, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CollectBillListUI", "get retry page, type: %d, timestamp: %s, tryNum: %d, directFlag: %d, chooseFlag: %d", java.lang.Integer.valueOf(this.f177885q), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        m83099x5406100e(new ww1.x1(this.f177885q, j17, i18, this.f177886r, i19, i17), false);
        this.f177887s++;
    }

    public final void W6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.C13145x888fbdf6 c13145x888fbdf6 = this.f177879h;
        c13145x888fbdf6.scrollTo(0, c13145x888fbdf6.m79077xde699c26());
    }

    public final void X6() {
        this.f177875d.setVisibility(8);
        this.f177878g.setVisibility(0);
        this.f177880i.setVisibility(0);
    }

    public final void Y6(java.lang.String str) {
        if (this.f177876e.getCount() != 0) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                return;
            }
            dp.a.m125854x26a183b(mo55332x76847179(), str, 1).show();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CollectBillListUI", "show empty view");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            this.f177880i.setText(str);
        } else if (this.f177884p) {
            this.f177880i.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.b9l));
        } else {
            this.f177880i.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.b9l) + getString(com.p314xaae8f345.mm.R.C30867xcad56011.b9m));
        }
        X6();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570165z2;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f177875d = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.c1w);
        this.f177878g = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.c1u);
        this.f177880i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.c1v);
        this.f177877f = com.p314xaae8f345.mm.ui.id.b(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570167z4, (android.view.ViewGroup) this.f177875d, false);
        android.view.View view = new android.view.View(this);
        view.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, i65.a.b(this, 5)));
        this.f177875d.addHeaderView(view, null, true);
        new android.view.View(this).setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, i65.a.b(this, 10)));
        this.f177875d.addFooterView(view, null, true);
        this.f177875d.setOverScrollMode(2);
        zw1.d dVar = new zw1.d(this);
        this.f177876e = dVar;
        this.f177875d.setAdapter((android.widget.ListAdapter) dVar);
        this.f177875d.setOnItemClickListener(new zw1.g(this));
        this.f177875d.setOnScrollListener(new zw1.h(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.C13145x888fbdf6 c13145x888fbdf6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.C13145x888fbdf6) findViewById(com.p314xaae8f345.mm.R.id.c1y);
        this.f177879h = c13145x888fbdf6;
        c13145x888fbdf6.m79098x563f5e7a(false);
        this.f177879h.m79088x648e109b(false);
        this.f177879h.m79082x1e1922a0(true);
        this.f177879h.m79085xcc8bf2ed(false);
        this.f177879h.m79083x49531bcc(true);
        this.f177879h.m79079xcab5c565(new zw1.i(this));
        this.f177879h.m79078x1c273745(new zw1.j(this));
        this.f177879h.m79095x31e25658(new zw1.k(this));
        this.f177879h.m79090x3b8dba10(new zw1.e(this));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.b9n);
        this.f177881m = com.p314xaae8f345.mm.p2802xd031a825.ui.b2.h(this, false, new zw1.f(this));
        U6();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13944, 4);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        int i19;
        int i27;
        if (!(m1Var instanceof ww1.x1)) {
            return false;
        }
        ww1.x1 x1Var = (ww1.x1) m1Var;
        if (this.f177881m.isShowing()) {
            this.f177881m.dismiss();
        }
        this.f177879h.m54563xa7b06749(true);
        if (i17 != 0 || i18 != 0) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
            java.lang.Integer valueOf3 = java.lang.Integer.valueOf(x1Var.f531868f);
            int i28 = x1Var.f531869g;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CollectBillListUI", "net error, errType: %s, errCode: %s, errMsg: %s, chooseFlag: %d, direcFlag: %d", valueOf, valueOf2, str, valueOf3, java.lang.Integer.valueOf(i28));
            if (x1Var.f531868f != 0) {
                this.f177883o = false;
            } else if (i28 == 0) {
                this.f177882n = false;
                W6();
            }
            if (this.f177876e.isEmpty()) {
                X6();
            }
            dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.b9k, 1).show();
            return true;
        }
        int i29 = x1Var.f531868f;
        java.util.List list = this.f177889u;
        java.util.List list2 = x1Var.f531874o;
        boolean z17 = x1Var.f531867e;
        if (i29 != 0) {
            this.f177884p = x1Var.f531866d;
            if (z17) {
                if (!((java.util.ArrayList) list2).isEmpty()) {
                    ((java.util.ArrayList) list).addAll(list2);
                }
                int i37 = x1Var.f531870h;
                if (i37 != 0 || x1Var.f531871i <= 0) {
                    this.f177887s = 0;
                    this.f177888t = x1Var.f531872m;
                    if (i37 == 0) {
                        this.f177884p = false;
                    } else {
                        this.f177884p = true;
                    }
                    if (((java.util.ArrayList) list).size() > 0) {
                        zw1.d dVar = this.f177876e;
                        java.util.ArrayList arrayList = (java.util.ArrayList) dVar.f558133e;
                        arrayList.clear();
                        arrayList.addAll(list);
                        dVar.notifyDataSetChanged();
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CollectBillListUI", "still empty data, show empty view");
                        X6();
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x1Var.f531873n)) {
                            this.f177880i.setText(x1Var.f531873n);
                            this.f177880i.setVisibility(0);
                        }
                        zw1.d dVar2 = this.f177876e;
                        ((java.util.ArrayList) dVar2.f558133e).clear();
                        dVar2.notifyDataSetChanged();
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CollectBillListUI", "continue retry: %d", java.lang.Integer.valueOf(this.f177887s));
                    V6(x1Var.f531871i, x1Var.f531872m, x1Var.f531869g, x1Var.f531868f);
                }
                return true;
            }
            java.util.ArrayList arrayList2 = (java.util.ArrayList) list2;
            if (!arrayList2.isEmpty()) {
                zw1.d dVar3 = this.f177876e;
                java.util.ArrayList arrayList3 = (java.util.ArrayList) dVar3.f558133e;
                arrayList3.clear();
                arrayList3.addAll(list2);
                dVar3.notifyDataSetChanged();
                long j17 = ((ww1.n1) arrayList2.get(0)).f531782b;
                this.f177888t = ((ww1.n1) arrayList2.get(arrayList2.size() - 1)).f531782b;
            } else if (x1Var.f531870h != 0 || (i19 = x1Var.f531871i) <= 0) {
                X6();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CollectBillListUI", "need retry, tryNum: %d, timestamp: %s", java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(x1Var.f531872m));
                V6(x1Var.f531871i, x1Var.f531872m, x1Var.f531869g, x1Var.f531868f);
                ((java.util.ArrayList) list).clear();
            }
            this.f177883o = false;
        } else {
            if (this.f177883o) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CollectBillListUI", "is loading filter, skip!");
                return true;
            }
            if (x1Var.f531869g == 1) {
                java.util.ArrayList arrayList4 = (java.util.ArrayList) list2;
                if (!arrayList4.isEmpty()) {
                    zw1.d dVar4 = this.f177876e;
                    ((java.util.ArrayList) dVar4.f558133e).addAll(0, list2);
                    dVar4.notifyDataSetChanged();
                    long j18 = ((ww1.n1) arrayList4.get(0)).f531782b;
                }
            } else {
                this.f177884p = x1Var.f531866d;
                this.f177875d.setVisibility(0);
                this.f177878g.setVisibility(8);
                if (z17) {
                    java.util.ArrayList arrayList5 = (java.util.ArrayList) list2;
                    if (!arrayList5.isEmpty()) {
                        ((java.util.ArrayList) list).addAll(list2);
                    }
                    if (x1Var.f531870h == 0 && x1Var.f531871i > 0 && arrayList5.isEmpty()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CollectBillListUI", "continue retry: %d", java.lang.Integer.valueOf(this.f177887s));
                        V6(x1Var.f531871i, x1Var.f531872m, x1Var.f531869g, x1Var.f531868f);
                    } else {
                        this.f177887s = 0;
                        if (((java.util.ArrayList) list).size() > 0) {
                            zw1.d dVar5 = this.f177876e;
                            ((java.util.ArrayList) dVar5.f558133e).addAll(list);
                            dVar5.notifyDataSetChanged();
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CollectBillListUI", "retry data is empty");
                            Y6(x1Var.f531873n);
                        }
                        this.f177882n = false;
                        this.f177888t = x1Var.f531872m;
                        W6();
                        this.f177879h.m79082x1e1922a0(!this.f177884p);
                    }
                    return true;
                }
                java.util.ArrayList arrayList6 = (java.util.ArrayList) list2;
                if (!arrayList6.isEmpty()) {
                    zw1.d dVar6 = this.f177876e;
                    ((java.util.ArrayList) dVar6.f558133e).addAll(list2);
                    dVar6.notifyDataSetChanged();
                    long j19 = ((ww1.n1) arrayList6.get(arrayList6.size() - 1)).f531782b;
                    this.f177888t = j19;
                    long j27 = x1Var.f531872m;
                    if (j19 > j27) {
                        this.f177888t = j27;
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CollectBillListUI", "last record timestamp is less than fromtimestamp, %s, %s", java.lang.Long.valueOf(j19), java.lang.Long.valueOf(x1Var.f531872m));
                    }
                    this.f177882n = false;
                    W6();
                    this.f177879h.m79082x1e1922a0(!this.f177884p);
                } else if (x1Var.f531870h != 0 || (i27 = x1Var.f531871i) <= 0) {
                    this.f177882n = false;
                    W6();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CollectBillListUI", "next loading is empty without retry");
                    Y6(x1Var.f531873n);
                    this.f177879h.m79082x1e1922a0(!this.f177884p);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CollectBillListUI", "need retry, tryNum: %d, timestamp: %s", java.lang.Integer.valueOf(i27), java.lang.Long.valueOf(x1Var.f531872m));
                    V6(x1Var.f531871i, x1Var.f531872m, x1Var.f531869g, x1Var.f531868f);
                    ((java.util.ArrayList) list).clear();
                }
            }
        }
        return true;
    }
}
