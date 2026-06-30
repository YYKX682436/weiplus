package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* renamed from: com.tencent.mm.plugin.game.ui.GameMessageUI */
/* loaded from: classes8.dex */
public class ActivityC15982xf89d78e9 extends com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.AbstractActivityC15945x98cc0336 implements android.widget.AdapterView.OnItemClickListener, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f222463w = 0;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ListView f222464h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.b5 f222465i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f222466m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f222467n;

    /* renamed from: o, reason: collision with root package name */
    public int f222468o;

    /* renamed from: s, reason: collision with root package name */
    public long f222472s;

    /* renamed from: t, reason: collision with root package name */
    public android.content.DialogInterface.OnClickListener f222473t;

    /* renamed from: u, reason: collision with root package name */
    public android.content.DialogInterface.OnClickListener f222474u;

    /* renamed from: p, reason: collision with root package name */
    public boolean f222469p = false;

    /* renamed from: q, reason: collision with root package name */
    public int f222470q = 0;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f222471r = "";

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.AbsListView.OnScrollListener f222475v = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.k5(this);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.AbstractActivityC15939x24508632
    public java.lang.String T6() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.AbstractActivityC15939x24508632
    public java.lang.String U6() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.AbstractActivityC15939x24508632
    public int V6() {
        return 13;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.AbstractActivityC15939x24508632
    public int W6() {
        return this.f222468o;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.AbstractActivityC15939x24508632
    public int X6() {
        return 1300;
    }

    public final void Z6(int i17) {
        if (this.f222466m == null) {
            this.f222466m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.gnn);
        }
        this.f222466m.setVisibility(i17);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bh6;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.fnq);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.f5(this));
        mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571886sl), new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.i5(this));
        this.f222468o = getIntent().getIntExtra("game_report_from_scene", 0);
        android.widget.ListView listView = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.gno);
        this.f222464h = listView;
        listView.setOnItemClickListener(this);
        if (this.f222470q > 20) {
            if (getSharedPreferences("game_center_pref", 0).getBoolean("show_message_tips", true)) {
                android.view.View inflate = android.view.View.inflate(this, com.p314xaae8f345.mm.R.C30864xbddafb2a.bhc, null);
                this.f222467n = inflate;
                inflate.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.l5(this));
                this.f222464h.addHeaderView(this.f222467n);
                android.view.View view = this.f222467n;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/GameMessageUI", "enableTipsView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/game/ui/GameMessageUI", "enableTipsView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                getSharedPreferences("game_center_pref", 0).edit().putBoolean("show_message_tips", false).apply();
            } else {
                android.view.View view2 = this.f222467n;
                if (view2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/game/ui/GameMessageUI", "enableTipsView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/game/ui/GameMessageUI", "enableTipsView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1();
        e1Var.f221809b3 = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.b5 b5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.b5(this, e1Var, this.f222468o, this.f222472s);
        this.f222465i = b5Var;
        b5Var.r(true);
        Z6(8);
        this.f222465i.f294144h = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.j5(this);
        this.f222464h.setOnScrollListener(this.f222475v);
        this.f222464h.setAdapter((android.widget.ListAdapter) this.f222465i);
        android.widget.ListView listView2 = this.f222464h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.b5 b5Var2 = this.f222465i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameMessageAdapter", "init position:%d", java.lang.Integer.valueOf(b5Var2.f222590y));
        if (b5Var2.f222590y > b5Var2.getCount() - 1) {
            b5Var2.f222590y = b5Var2.getCount() - 1;
        }
        listView2.setSelection(b5Var2.f222590y);
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.d(mo55332x76847179(), 13, 1300, 0, 1, 0, null, this.f222468o, 0, null, null, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.AbstractActivityC15945x98cc0336, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.AbstractActivityC15939x24508632, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        gm0.j1.d().a(573, this);
        this.f222470q = getIntent().getIntExtra("game_unread_msg_count", 0);
        this.f222471r = getIntent().getStringExtra("game_manage_url");
        long longExtra = getIntent().getLongExtra("game_msg_ui_from_msgid", 0L);
        this.f222472s = longExtra;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameMessageUI", "init msgId:%d", java.lang.Long.valueOf(longExtra));
        mo43517x10010bd5();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Ai().e();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.AbstractActivityC15939x24508632, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.b5 b5Var = this.f222465i;
        if (b5Var != null) {
            b5Var.c();
        }
        gm0.j1.d().q(573, this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameMessageStorage", "clearMessageStorage: [%b], [%s]", java.lang.Boolean.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().m145253xb158737d("GameRawMessage", "delete from GameRawMessage where createTime < (select createTime from GameRawMessage order by createTime desc limit 100000,1)")), "delete from GameRawMessage where createTime < (select createTime from GameRawMessage order by createTime desc limit 100000,1)");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().T1();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameMessageUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1) adapterView.getAdapter().getItem(i17);
        if (e1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameMessageUI", "get message null: position:[%d]", java.lang.Integer.valueOf(i17));
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameMessageUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        e1Var.t0();
        java.lang.String a17 = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.a(null, null, e1Var.U2, null);
        int i18 = e1Var.f68469xc4aab016;
        if (i18 == 100) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e1Var.f221832x2)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.r0 r0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.r0) e1Var.f221815g2.get(e1Var.f221832x2);
                if (r0Var == null) {
                    yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameMessageUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                    return;
                } else {
                    int a18 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.g1.a(this, e1Var, r0Var, e1Var.f68449x28d45f97, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.n.f34632x366c91de);
                    if (a18 != 0) {
                        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.d(mo55332x76847179(), 13, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.n.f34632x366c91de, 4, a18, 0, e1Var.f68449x28d45f97, this.f222468o, e1Var.S2, e1Var.f68458xd54c6aa5, e1Var.T2, a17);
                    }
                }
            }
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameMessageUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        int i19 = e1Var.Z2;
        int i27 = 3;
        if (i19 == 0) {
            if (i18 == 2 || i18 == 5) {
                lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
                java.lang.String str = e1Var.f68449x28d45f97;
                ((kt.c) i0Var).getClass();
                if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.r(this, str)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.f.j(this, e1Var.f68449x28d45f97);
                } else {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putCharSequence("game_app_id", e1Var.f68449x28d45f97);
                    bundle.putInt("game_report_from_scene", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.n.f34632x366c91de);
                    i27 = r53.f.o(this, e1Var.f68449x28d45f97, null, bundle, 0);
                }
                com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.d(mo55332x76847179(), 13, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.n.f34632x366c91de, 4, i27, 0, e1Var.f68449x28d45f97, this.f222468o, e1Var.f68469xc4aab016, e1Var.f68458xd54c6aa5, e1Var.T2, a17);
            } else if (i18 != 6) {
                if ((i18 == 10 || i18 == 11) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e1Var.V1)) {
                    com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.d(mo55332x76847179(), 13, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.n.f34632x366c91de, 4, r53.f.v(this, e1Var.V1, null, null), 0, e1Var.f68449x28d45f97, this.f222468o, e1Var.f68469xc4aab016, e1Var.f68458xd54c6aa5, e1Var.T2, a17);
                }
            } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e1Var.f221827s2)) {
                com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.d(mo55332x76847179(), 13, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.n.f34632x366c91de, 4, r53.f.v(this, e1Var.f221827s2, null, null), 0, e1Var.f68449x28d45f97, this.f222468o, e1Var.f68469xc4aab016, e1Var.f68458xd54c6aa5, e1Var.T2, a17);
            }
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameMessageUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (i19 != 1) {
            if (i19 == 2) {
                lt.i0 i0Var2 = (lt.i0) i95.n0.c(lt.i0.class);
                java.lang.String str2 = e1Var.f68449x28d45f97;
                ((kt.c) i0Var2).getClass();
                if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.r(this, str2)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.f.j(this, e1Var.f68449x28d45f97);
                } else {
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    bundle2.putCharSequence("game_app_id", e1Var.f68449x28d45f97);
                    bundle2.putInt("game_report_from_scene", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.n.f34632x366c91de);
                    i27 = r53.f.o(this, e1Var.f68449x28d45f97, null, bundle2, 0);
                }
                com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.d(mo55332x76847179(), 13, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.n.f34632x366c91de, 4, i27, 0, e1Var.f68449x28d45f97, this.f222468o, e1Var.f68469xc4aab016, e1Var.f68458xd54c6aa5, e1Var.T2, a17);
            } else if (i19 != 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameMessageUI", "unknowed jumptype : " + e1Var.Z2);
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e1Var.f221807a3)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameMessageUI", "jumpurl is null");
            } else {
                com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.d(mo55332x76847179(), 13, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.n.f34632x366c91de, 4, r53.f.v(this, e1Var.f221807a3, null, null), 0, e1Var.f68449x28d45f97, this.f222468o, e1Var.f68469xc4aab016, e1Var.f68458xd54c6aa5, e1Var.T2, a17);
            }
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e1Var.f68449x28d45f97)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameMessageUI", "appid is null");
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameMessageUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        } else {
            android.os.Bundle bundle3 = new android.os.Bundle();
            bundle3.putCharSequence("game_app_id", e1Var.f68449x28d45f97);
            bundle3.putInt("game_report_from_scene", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.n.f34632x366c91de);
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.d(mo55332x76847179(), 13, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.n.f34632x366c91de, 4, r53.f.o(this, e1Var.f68449x28d45f97, null, bundle3, 0), 0, e1Var.f68449x28d45f97, this.f222468o, e1Var.f68469xc4aab016, e1Var.f68458xd54c6aa5, e1Var.T2, a17);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameMessageUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().T1();
        finish();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.AbstractActivityC15939x24508632, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        android.view.View view;
        super.onResume();
        this.f222465i.notifyDataSetChanged();
        if (!this.f222469p || (view = this.f222467n) == null) {
            return;
        }
        this.f222464h.removeHeaderView(view);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameMessageUI", "onSceneEnd: errType:[%d], errCode:[%d], type:[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()));
        if (i17 == 0 && i18 == 0) {
            if (m1Var.mo808xfb85f7b0() == 573) {
                Z6(8);
                this.f222465i.mo735xb0dfc7d8(null, null);
                return;
            }
            return;
        }
        if (this.f222465i.getCount() > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameMessageUI", "has local message, do not show error tips");
            return;
        }
        ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
        if (com.p314xaae8f345.mm.ui.pc.a(this, i17, i18, str, 4)) {
            return;
        }
        dp.a.m125854x26a183b(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.fma, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
    }
}
