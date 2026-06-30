package com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui;

/* renamed from: com.tencent.mm.plugin.collect.ui.CollectBillUI */
/* loaded from: classes9.dex */
public class ActivityC13141xbbc9be85 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {
    public long A;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f177890d;

    /* renamed from: e, reason: collision with root package name */
    public zw1.b f177891e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f177892f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f177893g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.C13139x3d8491e3 f177894h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f177895i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f177896m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f177897n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f177898o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f177899p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.s6 f177900q;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f177905v;

    /* renamed from: w, reason: collision with root package name */
    public int f177906w;

    /* renamed from: x, reason: collision with root package name */
    public int f177907x;

    /* renamed from: y, reason: collision with root package name */
    public long f177908y;

    /* renamed from: r, reason: collision with root package name */
    public boolean f177901r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f177902s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f177903t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f177904u = true;

    /* renamed from: z, reason: collision with root package name */
    public final int f177909z = 20;
    public final com.p314xaae8f345.mm.p944x882e457a.u0 B = new zw1.m(this);
    public final db5.t4 C = new zw1.s(this);

    public final void U6() {
        this.f177890d.setVisibility(8);
        this.f177893g.setVisibility(0);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.c1m);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/collect/ui/CollectBillUI", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/collect/ui/CollectBillUI", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void V6(int i17, int i18, long j17) {
        if (this.f177904u) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.C13139x3d8491e3 c13139x3d8491e3 = this.f177894h;
            c13139x3d8491e3.f177872d.setText(ww1.d0.a(c13139x3d8491e3.getContext(), j17, this.f177906w));
            c13139x3d8491e3.f177873e.setText(ww1.d0.b(i18));
            c13139x3d8491e3.f177874f.setText(c13139x3d8491e3.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b9s, java.lang.Integer.valueOf(i17)));
            this.f177904u = false;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570161yy;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f177890d = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.c1z);
        this.f177893g = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.c1l);
        this.f177899p = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.c1i);
        this.f177892f = com.p314xaae8f345.mm.ui.id.b(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570168z5, (android.view.ViewGroup) this.f177890d, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.C13139x3d8491e3 c13139x3d8491e3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.C13139x3d8491e3(this);
        this.f177894h = c13139x3d8491e3;
        this.f177890d.addHeaderView(c13139x3d8491e3, null, false);
        zw1.b bVar = new zw1.b(this);
        this.f177891e = bVar;
        this.f177890d.setAdapter((android.widget.ListAdapter) bVar);
        this.f177890d.setOnScrollListener(new zw1.n(this));
        this.f177900q = new com.p314xaae8f345.mm.ui.p2740x696c9db.s6(this);
        this.f177890d.setOnItemClickListener(new zw1.o(this));
        this.f177890d.setOnItemLongClickListener(new zw1.p(this));
        if (this.f177907x != 2) {
            mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.b9n), new zw1.q(this));
        }
        if (this.f177907x == 2) {
            android.view.View findViewById = this.f177894h.findViewById(com.p314xaae8f345.mm.R.id.c57);
            android.view.View findViewById2 = this.f177893g.findViewById(com.p314xaae8f345.mm.R.id.f565357c56);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/collect/ui/CollectBillUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/collect/ui/CollectBillUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/collect/ui/CollectBillUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/collect/ui/CollectBillUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        this.f177895i = (android.widget.ImageView) this.f177894h.findViewById(com.p314xaae8f345.mm.R.id.f565355c54);
        this.f177896m = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) this.f177894h.findViewById(com.p314xaae8f345.mm.R.id.f565356c55);
        this.f177897n = (android.widget.ImageView) this.f177893g.findViewById(com.p314xaae8f345.mm.R.id.f565355c54);
        this.f177898o = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) this.f177893g.findViewById(com.p314xaae8f345.mm.R.id.f565356c55);
        if (tw1.f.Di().Ri()) {
            this.f177896m.m81392x52cfa5c6(true);
            this.f177898o.m81392x52cfa5c6(true);
            this.f177895i.setImageResource(com.p314xaae8f345.mm.R.raw.f78881xd6765a84);
            this.f177897n.setImageResource(com.p314xaae8f345.mm.R.raw.f78881xd6765a84);
        } else {
            this.f177896m.m81392x52cfa5c6(false);
            this.f177898o.m81392x52cfa5c6(false);
            this.f177895i.setImageResource(com.p314xaae8f345.mm.R.raw.f78880xf854f56a);
            this.f177897n.setImageResource(com.p314xaae8f345.mm.R.raw.f78880xf854f56a);
        }
        zw1.r rVar = new zw1.r(this);
        this.f177896m.m81396xb3e0a10a(rVar);
        this.f177898o.m81396xb3e0a10a(rVar);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.A = c01.z1.j();
        this.f177907x = getIntent().getIntExtra("key_from_scene", 0);
        this.f177906w = getIntent().getIntExtra("key_type", 0);
        this.f177908y = getIntent().getLongExtra("key_timestamp", java.lang.System.currentTimeMillis() / 1000);
        if (!this.f177903t) {
            m83096xe7b1ccf7(new ww1.y1(this.f177906w, this.f177908y, this.f177905v, this.f177909z));
            this.f177902s = true;
        }
        mo43517x10010bd5();
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.b9r);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(1256, this.B);
        ww1.p1 p1Var = new ww1.p1();
        gm0.j1.i();
        gm0.j1.n().f354821b.g(p1Var);
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 0, 0, com.p314xaae8f345.mm.R.C30867xcad56011.b9o);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.i();
        gm0.j1.n().f354821b.q(1256, this.B);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (!(m1Var instanceof ww1.y1)) {
            if (m1Var instanceof ww1.w1) {
                ww1.w1 w1Var = (ww1.w1) m1Var;
                if (i17 == 0 && i18 == 0) {
                    zw1.b bVar = this.f177891e;
                    java.lang.String str2 = w1Var.f531856f;
                    java.util.ArrayList arrayList = (java.util.ArrayList) bVar.f558114e;
                    java.util.Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ww1.g gVar = (ww1.g) it.next();
                        if (gVar.f531720a.equals(str2)) {
                            arrayList.remove(gVar);
                            bVar.notifyDataSetChanged();
                            break;
                        }
                    }
                    if (this.f177891e.getCount() <= 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CollectBillUI", "delete all records");
                        U6();
                    } else {
                        V6(w1Var.f531854d, w1Var.f531855e, this.f177908y);
                    }
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CollectBillUI", "net error, errType: %s, errCode: %s, errMsg: %s, billId: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, w1Var.f531856f);
                dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.b9j, 1).show();
            }
            return false;
        }
        ww1.y1 y1Var = (ww1.y1) m1Var;
        if (this.f177901r) {
            this.f177890d.removeFooterView(this.f177892f);
            this.f177901r = false;
        }
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CollectBillUI", "net error!");
            this.f177902s = false;
            dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.b9k, 1).show();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f177905v)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CollectBillUI", "first query failed, finish activity!");
            }
            return true;
        }
        this.f177903t = y1Var.f531899m;
        this.f177906w = y1Var.f531896g;
        long j17 = y1Var.f531895f;
        this.f177908y = j17;
        V6(y1Var.f531893d, y1Var.f531894e, j17);
        java.util.List list = y1Var.f531897h;
        if (((java.util.ArrayList) list).isEmpty()) {
            this.f177903t = true;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f177905v)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CollectBillUI", "no record, show empty view");
                U6();
            }
        } else {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f177905v)) {
                this.f177890d.setVisibility(0);
                this.f177893g.setVisibility(8);
            }
            zw1.b bVar2 = this.f177891e;
            ((java.util.ArrayList) bVar2.f558114e).addAll(list);
            bVar2.notifyDataSetChanged();
            this.f177905v = ((ww1.g) ((java.util.ArrayList) list).get(((java.util.ArrayList) list).size() - 1)).f531720a;
        }
        this.f177902s = false;
        return true;
    }
}
