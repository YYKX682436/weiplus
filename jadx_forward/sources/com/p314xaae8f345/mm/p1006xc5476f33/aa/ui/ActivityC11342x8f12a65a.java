package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* renamed from: com.tencent.mm.plugin.aa.ui.AAQueryListUI */
/* loaded from: classes9.dex */
public class ActivityC11342x8f12a65a extends com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.AbstractActivityC11345xc0d00306 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.f7 {

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ListView f153977h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.w f153978i;

    /* renamed from: m, reason: collision with root package name */
    public android.app.Dialog f153979m;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f153982p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.C11340x3c0307bc f153983q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f153984r;

    /* renamed from: g, reason: collision with root package name */
    public final k61.d f153976g = (k61.d) this.f154007e.a(this, k61.d.class);

    /* renamed from: n, reason: collision with root package name */
    public boolean f153980n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f153981o = false;

    /* renamed from: s, reason: collision with root package name */
    public int f153985s = 1;

    public final void f7(boolean z17, int i17) {
        if (this.f153980n) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AAQueryListUI", "getNextPage, loading");
            return;
        }
        if (z17) {
            this.f153981o = false;
            this.f153977h.removeFooterView(this.f153983q);
        }
        this.f153980n = true;
        k61.c cVar = this.f153976g.f386025b;
        cVar.getClass();
        ((km5.q) ((km5.q) km5.u.f(java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17))).n(cVar).h(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.e0(this, z17))).s(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.d0(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569404a8;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1 && i18 == -1) {
            boolean booleanExtra = intent.getBooleanExtra("close_aa", false);
            int intExtra = intent.getIntExtra("item_position", 0);
            int intExtra2 = intent.getIntExtra("item_offset", 0);
            if (booleanExtra) {
                this.f153977h.setSelectionFromTop(intExtra, intExtra2);
                f7(true, this.f153985s);
            }
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.AbstractActivityC11345xc0d00306, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.x(this));
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f571287ar);
        mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.c0(this));
        android.widget.ListView listView = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.f563842ay);
        this.f153977h = listView;
        listView.setOnScrollListener(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.y(this));
        this.f153977h.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.z(this));
        this.f153982p = new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.C11341x9dd66ed0(this);
        this.f153983q = new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.C11340x3c0307bc(this);
        this.f153979m = com.p314xaae8f345.mm.p2802xd031a825.ui.b2.e(this, false, false, null);
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.w wVar = new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.w(this, this.f153985s);
        this.f153978i = wVar;
        this.f153977h.setAdapter((android.widget.ListAdapter) wVar);
        this.f153977h.setVisibility(4);
        f7(false, this.f153985s);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.AbstractActivityC11345xc0d00306, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.t) ((ct.d3) i95.n0.c(ct.d3.class))).Bi(mo55332x76847179(), this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.AbstractActivityC11345xc0d00306, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.t) ((ct.d3) i95.n0.c(ct.d3.class))).wi(mo55332x76847179(), this);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(h61.b.class);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.w wVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AAQueryListUI", "onScreenShot");
        if (((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).ij() || (wVar = this.f153978i) == null || ((java.util.ArrayList) wVar.f154394d).size() <= 0) {
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = ((java.util.ArrayList) this.f153978i.f154394d).iterator();
        while (it.hasNext()) {
            r45.p pVar = (r45.p) it.next();
            if (pVar != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(pVar.f464165d)) {
                linkedList.add(pVar.f464165d);
            }
        }
        if (linkedList.size() > 0) {
            int i17 = this.f153985s;
            if (i17 == 1) {
                ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).wi("client_aa_pay_record_launch_page", linkedList, 0);
            } else if (i17 == 2) {
                ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).wi("client_aa_pay_record_participate_page", linkedList, 0);
            }
        }
    }
}
