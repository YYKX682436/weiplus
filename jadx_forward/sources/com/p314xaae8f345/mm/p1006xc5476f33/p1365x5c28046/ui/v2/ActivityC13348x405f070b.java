package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardDetailUI */
/* loaded from: classes4.dex */
public class ActivityC13348x405f070b extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0, android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f179794d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f179795e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f179796f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f179797g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f179798h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f179799i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f179800m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f179801n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f179802o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f179803p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ListView f179804q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f179805r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.p f179806s;

    /* renamed from: t, reason: collision with root package name */
    public r45.xe3 f179807t;

    /* renamed from: u, reason: collision with root package name */
    public byte[] f179808u;

    /* renamed from: v, reason: collision with root package name */
    public z12.r f179809v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f179810w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f179811x = -1;

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f179812y = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.n(this);

    public final void T6(boolean z17) {
        if (this.f179810w || this.f179811x == 0) {
            return;
        }
        this.f179809v = new z12.r(this.f179794d, this.f179808u);
        gm0.j1.n().f354821b.g(this.f179809v);
        this.f179810w = true;
        if (z17) {
            this.f179812y.mo50307xb9e94560(1002, 200L);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a7z;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.bz9);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.o(this));
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570270a80, (android.view.ViewGroup) null);
        this.f179798h = inflate;
        this.f179799i = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.cvb);
        this.f179800m = (android.widget.TextView) this.f179798h.findViewById(com.p314xaae8f345.mm.R.id.l7a);
        this.f179801n = (android.widget.TextView) this.f179798h.findViewById(com.p314xaae8f345.mm.R.id.cvc);
        this.f179802o = (android.widget.TextView) this.f179798h.findViewById(com.p314xaae8f345.mm.R.id.m2n);
        this.f179803p = findViewById(com.p314xaae8f345.mm.R.id.m7g);
        this.f179804q = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.gyj);
        android.view.View inflate2 = com.p314xaae8f345.mm.ui.id.b(mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a7p, (android.view.ViewGroup) null);
        this.f179805r = inflate2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(inflate2, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardDetailUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(inflate2, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardDetailUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f179804q.addHeaderView(this.f179798h);
        this.f179804q.addFooterView(this.f179805r);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.p pVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.p(this, this);
        this.f179806s = pVar;
        this.f179804q.setAdapter((android.widget.ListAdapter) pVar);
        this.f179804q.setOnScrollListener(this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        z85.v vVar;
        super.onCreate(bundle);
        this.f179794d = getIntent().getStringExtra("extra_id");
        this.f179795e = getIntent().getStringExtra("extra_name");
        this.f179796f = getIntent().getStringExtra("extra_iconurl");
        this.f179797g = getIntent().getStringExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
        mo43517x10010bd5();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.n5 f17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f();
        synchronized (f17.f276696a) {
            vVar = f17.f276704i;
        }
        java.lang.String str = this.f179794d;
        vVar.getClass();
        r45.xe3 xe3Var = null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmotionRewardInfoStorage", "getEmotionRewardResponseByPID failed. productID is null.");
        } else {
            android.database.Cursor D = vVar.f552358d.D("EmotionRewardInfo", new java.lang.String[]{"content"}, "productID=?", new java.lang.String[]{str}, null, null, null, 2);
            if (D != null && D.moveToFirst()) {
                try {
                    r45.xe3 xe3Var2 = new r45.xe3();
                    xe3Var2.mo11468x92b714fd(D.getBlob(0));
                    xe3Var = xe3Var2;
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmotionRewardInfoStorage", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                }
            }
            if (D != null) {
                D.close();
            }
        }
        this.f179807t = xe3Var;
        this.f179809v = new z12.r(this.f179794d, this.f179808u);
        gm0.j1.n().f354821b.g(this.f179809v);
        n11.a b17 = n11.a.b();
        java.lang.String str2 = this.f179796f;
        b17.h(str2, this.f179799i, y12.f.b(this.f179794d, str2));
        this.f179800m.setText(this.f179795e);
        this.f179801n.setText(this.f179797g);
        r45.xe3 xe3Var3 = this.f179807t;
        if (xe3Var3 != null) {
            this.f179802o.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.bz_, java.lang.Integer.valueOf(xe3Var3.f471543e)));
        }
        gm0.j1.n().f354821b.a(299, this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.n().f354821b.q(299, this);
        n11.a.b().n(0);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        android.view.View view;
        this.f179810w = false;
        android.view.View view2 = this.f179805r;
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardDetailUI", "loadMoreFinish", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardDetailUI", "loadMoreFinish", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f179812y;
            n3Var.mo50303x856b99f0(1002);
            n3Var.mo50307xb9e94560(1001, 200L);
        }
        if (m1Var.mo808xfb85f7b0() != 299) {
            return;
        }
        z12.r rVar = (z12.r) m1Var;
        if (i17 != 0 && i17 != 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmojiStoreV2RewardDetailUI", "unknow errType:%d", java.lang.Integer.valueOf(i17));
            return;
        }
        this.f179808u = rVar.f550890f;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = rVar.f550888d;
        if (i18 == 0) {
            this.f179811x = 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
            if (((r45.ue3) fVar) != null) {
                this.f179806s.a(((r45.ue3) fVar).f468830e);
                return;
            }
            return;
        }
        boolean z17 = true;
        if (i18 != 2) {
            if (i18 == 3) {
                this.f179811x = 1;
                this.f179808u = null;
                this.f179806s.f179916e = true;
                T6(false);
                return;
            }
            return;
        }
        this.f179811x = 2;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = oVar.f152244b.f152233a;
        if (((r45.ue3) fVar2) != null) {
            this.f179806s.a(((r45.ue3) fVar2).f468830e);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.p pVar = this.f179806s;
        if (pVar != null && (view = this.f179798h) != null) {
            int i19 = pVar.f179920i + pVar.f179919h;
            int height = view.getHeight();
            int k17 = i65.a.k(this);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStoreV2RewardDetailUI", "item:%d header:%d window:%d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(height), java.lang.Integer.valueOf(k17));
            if (k17 > (i19 * this.f179806s.getCount()) + height) {
                z17 = false;
            }
        }
        if (z17) {
            return;
        }
        T6(false);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardDetailUI", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardDetailUI", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardDetailUI", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        if (i17 == 0 && absListView.getLastVisiblePosition() == absListView.getCount() - 1) {
            if (this.f179811x == 0 || this.f179810w) {
                yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardDetailUI", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
                return;
            } else {
                T6(true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStoreV2RewardDetailUI", "[onScrollStateChanged] loadMoreData.");
                n11.a.b().n(i17);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardDetailUI", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
