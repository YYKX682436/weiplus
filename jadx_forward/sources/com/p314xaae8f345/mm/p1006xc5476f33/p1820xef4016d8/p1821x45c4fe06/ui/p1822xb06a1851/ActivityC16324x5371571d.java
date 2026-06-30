package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1822xb06a1851;

/* renamed from: com.tencent.mm.plugin.luckymoney.appbrand.ui.detail.WxaLuckyMoneyDetailUI */
/* loaded from: classes9.dex */
public class ActivityC16324x5371571d extends com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.AbstractActivityC16322x2b9a639d implements nb3.b {
    public static final /* synthetic */ int A = 0;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ListView f226550n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f226551o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f226552p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f226553q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ImageView f226554r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f226555s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f226556t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f226557u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f226558v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f226559w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f226560x;

    /* renamed from: y, reason: collision with root package name */
    public nb3.d f226561y;

    /* renamed from: h, reason: collision with root package name */
    public final nb3.a f226547h = new nb3.i();

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f226548i = null;

    /* renamed from: m, reason: collision with root package name */
    public android.content.Intent f226549m = null;

    /* renamed from: z, reason: collision with root package name */
    public final android.widget.AbsListView.OnScrollListener f226562z = new nb3.e(this);

    public final void U6(lb3.j jVar) {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.b(this.f226551o, jVar.f399297b, jVar.f399296a);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.E(mo55332x76847179, this.f226552p, jVar.f399298c);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.E(mo55332x76847179, this.f226553q, jVar.f399302g);
        if (jVar.f399301f == 1) {
            this.f226554r.setVisibility(0);
            this.f226554r.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c_h);
        } else {
            this.f226554r.setVisibility(8);
        }
        if (jVar.f399300e == 2) {
            this.f226556t.setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.o(jVar.f399299d / 100.0d));
            this.f226561y.getClass();
            android.view.View view = this.f226555s;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/detail/WxaLuckyMoneyDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/appbrand/model/WxaLuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/appbrand/ui/detail/WxaLuckyMoneyDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/appbrand/model/WxaLuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view2 = this.f226555s;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/detail/WxaLuckyMoneyDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/appbrand/model/WxaLuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/appbrand/ui/detail/WxaLuckyMoneyDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/appbrand/model/WxaLuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jVar.f399303h)) {
            android.view.View view3 = this.f226557u;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/detail/WxaLuckyMoneyDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/appbrand/model/WxaLuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/luckymoney/appbrand/ui/detail/WxaLuckyMoneyDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/appbrand/model/WxaLuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view4 = this.f226557u;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/detail/WxaLuckyMoneyDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/appbrand/model/WxaLuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/luckymoney/appbrand/ui/detail/WxaLuckyMoneyDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/appbrand/model/WxaLuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f226558v.setText(jVar.f399303h);
            this.f226558v.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560900xm));
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jVar.f399304i)) {
            this.f226559w.setText((java.lang.CharSequence) null);
        } else {
            this.f226559w.setText(jVar.f399304i);
        }
    }

    public void V6() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f226548i;
        if (u3Var == null || !u3Var.isShowing()) {
            return;
        }
        this.f226548i.dismiss();
    }

    public void W6(int i17, java.util.List list, java.util.List list2) {
        nb3.d dVar = this.f226561y;
        if (list2 == null) {
            dVar.getClass();
            dVar.f417575d = new java.util.LinkedList();
        } else {
            dVar.f417575d = list2;
        }
        dVar.notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bub;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.gjt);
        mo54448x9c8c0d33(new nb3.f(this));
        this.f226550n = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.izx);
        this.f226561y = new nb3.d(mo55332x76847179());
        android.view.View inflate = android.view.LayoutInflater.from(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bu7, (android.view.ViewGroup) null);
        this.f226560x = inflate;
        this.f226550n.addHeaderView(inflate);
        this.f226550n.setAdapter((android.widget.ListAdapter) this.f226561y);
        this.f226561y.getClass();
        this.f226550n.setOnScrollListener(this.f226562z);
        this.f226551o = (android.widget.ImageView) this.f226560x.findViewById(com.p314xaae8f345.mm.R.id.f567299j01);
        this.f226552p = (android.widget.TextView) this.f226560x.findViewById(com.p314xaae8f345.mm.R.id.j0j);
        this.f226554r = (android.widget.ImageView) this.f226560x.findViewById(com.p314xaae8f345.mm.R.id.izf);
        this.f226553q = (android.widget.TextView) this.f226560x.findViewById(com.p314xaae8f345.mm.R.id.j0m);
        this.f226555s = this.f226560x.findViewById(com.p314xaae8f345.mm.R.id.iyx);
        this.f226556t = (android.widget.TextView) this.f226560x.findViewById(com.p314xaae8f345.mm.R.id.iyw);
        this.f226557u = this.f226560x.findViewById(com.p314xaae8f345.mm.R.id.izi);
        this.f226558v = (android.widget.TextView) this.f226560x.findViewById(com.p314xaae8f345.mm.R.id.j0e);
        this.f226559w = (android.widget.TextView) this.f226560x.findViewById(com.p314xaae8f345.mm.R.id.f567295iz3);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(mo55332x76847179(), null, getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), true, true, new nb3.g(this));
        this.f226548i = Q;
        Q.show();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        android.content.Intent intent = this.f226549m;
        if (intent != null) {
            setResult(0, intent);
        } else {
            setResult(-1, null);
        }
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.AbstractActivityC16322x2b9a639d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            super.onCreate(r7)
            r6.mo43517x10010bd5()
            nb3.a r7 = r6.f226547h
            android.content.Intent r0 = r6.getIntent()
            nb3.i r7 = (nb3.i) r7
            r7.getClass()
            r7.f417586a = r6
            java.lang.String r1 = "key_sendid"
            java.lang.String r1 = r0.getStringExtra(r1)
            r7.f417587b = r1
            java.lang.String r1 = "key_appid"
            java.lang.String r1 = r0.getStringExtra(r1)
            r7.f417588c = r1
            java.lang.String r1 = "key_data"
            byte[] r1 = r0.getByteArrayExtra(r1)
            java.lang.String r2 = "key_from"
            java.lang.String r0 = r0.getStringExtra(r2)
            r2 = 0
            if (r0 == 0) goto Lba
            java.lang.String r3 = "value_open"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto Lba
            java.lang.String r0 = "MicroMsg.WxaLuckyMoneyLogicDetail"
            if (r1 == 0) goto L5c
            int r3 = r1.length
            if (r3 != 0) goto L43
            goto L5c
        L43:
            r45.b25 r3 = new r45.b25
            r3.<init>()
            r3.mo11468x92b714fd(r1)     // Catch: java.io.IOException -> L51
            java.lang.String r1 = "parseFrom succeed."
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
            goto L62
        L51:
            r1 = move-exception
            java.lang.String r3 = "parseFrom failed. IOException: %s"
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r3, r1)
            goto L61
        L5c:
            java.lang.String r1 = "parseFrom failed. No data found."
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r1)
        L61:
            r3 = 0
        L62:
            if (r3 != 0) goto L6d
            java.lang.String r1 = "parse OpenWxaHBResponse failed."
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r1)
            r7.b(r2)
            goto Lbd
        L6d:
            int r0 = r3.f452014w
            r7.f417589d = r0
            java.util.List r0 = r7.f417591f
            java.util.LinkedList r1 = r3.f452007p
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            r0.addAll(r1)
            nb3.b r0 = r7.f417586a
            com.tencent.mm.plugin.luckymoney.appbrand.ui.detail.WxaLuckyMoneyDetailUI r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1822xb06a1851.ActivityC16324x5371571d) r0
            r0.V6()
            nb3.b r7 = r7.f417586a
            com.tencent.mm.plugin.luckymoney.appbrand.ui.detail.WxaLuckyMoneyDetailUI r7 = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1822xb06a1851.ActivityC16324x5371571d) r7
            r7.getClass()
            lb3.j r0 = new lb3.j
            r0.<init>()
            java.lang.String r2 = r3.f452009r
            r0.f399296a = r2
            java.lang.String r2 = r3.f452011t
            r0.f399297b = r2
            java.lang.String r2 = r3.f452010s
            r0.f399298c = r2
            long r4 = r3.f452001g
            r0.f399299d = r4
            java.lang.String r2 = r3.f452015x
            r0.f399303h = r2
            java.lang.String r2 = r3.f452013v
            r0.f399304i = r2
            int r2 = r3.f452006o
            r0.f399301f = r2
            int r2 = r3.f452000f
            r0.f399300e = r2
            java.lang.String r2 = r3.f452008q
            r0.f399302g = r2
            r7.U6(r0)
            int r0 = r3.f452014w
            r7.W6(r0, r1, r1)
            goto Lbd
        Lba:
            r7.b(r2)
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1822xb06a1851.ActivityC16324x5371571d.onCreate(android.os.Bundle):void");
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i17, android.view.Menu menu) {
        boolean onCreatePanelMenu = super.onCreatePanelMenu(i17, menu);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f564019fu);
        if (textView != null) {
            textView.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560882x3));
        }
        return onCreatePanelMenu;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.AbstractActivityC16322x2b9a639d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f226548i;
        if (u3Var == null || !u3Var.isShowing()) {
            return;
        }
        this.f226548i.dismiss();
    }
}
