package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "EmojiStoreEmptyFragment", "g22/v", "g22/w", "g22/x", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeUI */
/* loaded from: classes11.dex */
public final class ActivityC13364x933d260b extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f179966v = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f179967d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f179968e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f179969f;

    /* renamed from: h, reason: collision with root package name */
    public int f179971h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f179972i;

    /* renamed from: n, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff f179974n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d f179975o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.List f179976p;

    /* renamed from: q, reason: collision with root package name */
    public g22.u f179977q;

    /* renamed from: s, reason: collision with root package name */
    public g22.w f179979s;

    /* renamed from: g, reason: collision with root package name */
    public int f179970g = -1;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashMap f179973m = new java.util.HashMap();

    /* renamed from: r, reason: collision with root package name */
    public boolean f179978r = true;

    /* renamed from: t, reason: collision with root package name */
    public final yz5.l f179980t = new g22.z(this);

    /* renamed from: u, reason: collision with root package name */
    public final p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener f179981u = new g22.e0(this);

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeUI$EmojiStoreEmptyFragment;", "Lcom/tencent/mm/ui/MMFragment;", "<init>", "()V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeUI$EmojiStoreEmptyFragment */
    /* loaded from: classes11.dex */
    public static final class EmojiStoreEmptyFragment extends com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 {
        @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
        /* renamed from: getLayoutId */
        public int getF153758d() {
            return -1;
        }
    }

    public final com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 T6(int i17) {
        com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010;
        if (i17 == 0) {
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m7421x83a782ea = p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670.m7421x83a782ea(this, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.C13363x4414a00.class.getName(), null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m7421x83a782ea, "null cannot be cast to non-null type com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment");
            abstractViewOnAttachStateChangeListenerC21400xb429b010 = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.AbstractC13361x415b318) m7421x83a782ea;
        } else if (i17 != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EmojiStoreV3HomeUI", "create fragment failed.");
            abstractViewOnAttachStateChangeListenerC21400xb429b010 = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.ActivityC13364x933d260b.EmojiStoreEmptyFragment();
        } else {
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m7421x83a782ea2 = p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670.m7421x83a782ea(this, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.C13346x1b6d5cdc.class.getName(), null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m7421x83a782ea2, "null cannot be cast to non-null type com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment");
            abstractViewOnAttachStateChangeListenerC21400xb429b010 = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.AbstractC13342x6ac9a618) m7421x83a782ea2;
        }
        abstractViewOnAttachStateChangeListenerC21400xb429b010.m78698x1cf75fac(this);
        return abstractViewOnAttachStateChangeListenerC21400xb429b010;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a8h;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        g22.u uVar = this.f179977q;
        if (uVar != null) {
            com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010 = (com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010) uVar.f349404e.mo146xb9724478(java.lang.Integer.valueOf(this.f179971h));
            if (abstractViewOnAttachStateChangeListenerC21400xb429b010 != null) {
                abstractViewOnAttachStateChangeListenerC21400xb429b010.mo7496x9d4787cb(i17, i18, intent);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        g22.v vVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.C13367x36ad0482 c13367x36ad0482;
        android.widget.ImageView imageView;
        oa.i k17;
        g22.v vVar2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.C13367x36ad0482 c13367x36ad04822;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff;
        android.view.View view;
        android.view.View view2;
        super.onCreate(bundle);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiStoreV3HomeUI", "exit in teen mode");
            ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(this);
            finish();
            return;
        }
        this.f179970g = getIntent().getIntExtra("download_entrance_scene", -1);
        java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("ShowPersonalEmotion");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiStoreV3HomeUI", "get dynamic config value:%s", d17);
        boolean z17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(d17, 0) == 1;
        this.f179978r = z17;
        if (z17) {
            this.f179971h = getIntent().getIntExtra("emoji_tab", 0);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d c21470xb673f8d = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d) findViewById(com.p314xaae8f345.mm.R.id.dem);
        this.f179975o = c21470xb673f8d;
        if (c21470xb673f8d != null) {
            c21470xb673f8d.m80853x40341e13(0);
            this.f179977q = new g22.u(this, this.f179971h, this.f179981u, c21470xb673f8d, this.f179978r, this.f179980t);
        }
        this.f179967d = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f564007fi);
        this.f179968e = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f78239x65c2f76a);
        this.f179969f = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f564028g3);
        android.widget.ImageView imageView2 = this.f179968e;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new g22.b0(this));
        }
        android.widget.ImageView imageView3 = this.f179967d;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new g22.c0(this));
        }
        android.widget.ImageView imageView4 = this.f179969f;
        if (imageView4 != null) {
            imageView4.setOnClickListener(new g22.d0(this));
        }
        android.widget.ImageView imageView5 = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.hmu);
        if (imageView5 != null) {
            this.f179979s = new g22.w(imageView5);
            ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
            rn3.i.Di().k(this.f179979s);
        }
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        if (mo2533x106ab264 != null) {
            mo2533x106ab264.o();
        }
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff2 = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff) findViewById(com.p314xaae8f345.mm.R.id.nup);
        this.f179974n = c2718xca2902ff2;
        if (c2718xca2902ff2 != null) {
            c2718xca2902ff2.setVisibility(0);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : this.f179978r ? kz5.c0.k(mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.byw), mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572644bz2)) : kz5.c0.k(mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bzu))) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            arrayList.add(new g22.v(str));
        }
        this.f179976p = arrayList;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g22.v vVar3 = (g22.v) it.next();
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff3 = this.f179974n;
            android.view.View view3 = null;
            oa.i l17 = c2718xca2902ff3 != null ? c2718xca2902ff3.l() : null;
            vVar3.f349410b = l17;
            if (l17 != null) {
                l17.c(com.p314xaae8f345.mm.R.C30864xbddafb2a.a8g);
            }
            oa.i iVar = vVar3.f349410b;
            if (iVar != null && (view2 = iVar.f425316f) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.C13367x36ad0482 c13367x36ad04823 = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.C13367x36ad0482) view2.findViewById(com.p314xaae8f345.mm.R.id.f569004oq2);
                vVar3.f349412d = c13367x36ad04823;
                if (c13367x36ad04823 != null) {
                    c13367x36ad04823.m54853xdc742163(vVar3.f349409a);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.C13367x36ad0482 c13367x36ad04824 = vVar3.f349412d;
                if (c13367x36ad04824 != null) {
                    c13367x36ad04824.m54855x59160c04(ym5.x.a(mo55332x76847179(), 15.0f));
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.C13367x36ad0482 c13367x36ad04825 = vVar3.f349412d;
                if (c13367x36ad04825 != null) {
                    c13367x36ad04825.m54854xc8cc83c0(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.C13367x36ad0482 c13367x36ad04826 = vVar3.f349412d;
                if (c13367x36ad04826 != null) {
                    android.widget.TextView textView = c13367x36ad04826.f180006e;
                    com.p314xaae8f345.mm.ui.bk.s0(textView != null ? textView.getPaint() : null);
                }
                java.util.List list = this.f179976p;
                if ((list != null ? ((java.util.ArrayList) list).size() : 0) > 1) {
                    vVar3.f349413e = view2.findViewById(com.p314xaae8f345.mm.R.id.f568733nv4);
                }
            }
            oa.i iVar2 = vVar3.f349410b;
            if (iVar2 != null && (view = iVar2.f425316f) != null) {
                view3 = view.findViewById(com.p314xaae8f345.mm.R.id.dea);
            }
            vVar3.f349411c = view3;
            if (view3 != null) {
                view3.setPadding((int) mo55332x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561920wi), view3.getPaddingTop(), (int) mo55332x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561920wi), view3.getPaddingBottom());
            }
            oa.i iVar3 = vVar3.f349410b;
            if (iVar3 != null && (c2718xca2902ff = this.f179974n) != null) {
                c2718xca2902ff.d(iVar3, false);
            }
        }
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff4 = this.f179974n;
        if (c2718xca2902ff4 != null) {
            c2718xca2902ff4.a(new g22.a0(this));
        }
        java.util.List list2 = this.f179976p;
        if (list2 != null && (vVar2 = (g22.v) ((java.util.ArrayList) list2).get(0)) != null && (c13367x36ad04822 = vVar2.f349412d) != null) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.o.a().f179122e)) {
                java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.o.a().f179122e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getMainTabWording(...)");
                c13367x36ad04822.m54853xdc742163(str2);
            } else if (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.o.a().f179121d) {
                c13367x36ad04822.m54852xdc742163(com.p314xaae8f345.mm.R.C30867xcad56011.byx);
            } else {
                c13367x36ad04822.m54852xdc742163(com.p314xaae8f345.mm.R.C30867xcad56011.byw);
            }
            if (!this.f179978r) {
                c13367x36ad04822.m54852xdc742163(com.p314xaae8f345.mm.R.C30867xcad56011.bzu);
            }
        }
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff5 = this.f179974n;
        if (c2718xca2902ff5 != null && (k17 = c2718xca2902ff5.k(0)) != null) {
            k17.b();
        }
        gm0.j1.e().j(new g22.x());
        if (this.f179978r && this.f179974n != null) {
            java.util.List list3 = this.f179976p;
            if ((list3 != null ? ((java.util.ArrayList) list3).size() : 0) > 1) {
                java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_STORE_NEW_ORIGINAL_BOOLEAN, java.lang.Boolean.FALSE);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.Boolean");
                boolean booleanValue = ((java.lang.Boolean) m17).booleanValue();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiStoreV3HomeUI", "updatePersonPoint: " + booleanValue);
                java.util.List list4 = this.f179976p;
                if (list4 != null && (vVar = (g22.v) ((java.util.ArrayList) list4).get(1)) != null && (c13367x36ad0482 = vVar.f349412d) != null && (imageView = c13367x36ad0482.f180007f) != null) {
                    imageView.setVisibility(booleanValue ? 0 : 4);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.mo68477x336bdfd8(406L, 0L, 1L, false);
        g0Var.mo68477x336bdfd8(406L, 2L, java.lang.System.currentTimeMillis() - currentTimeMillis, false);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiStoreV3HomeUI", "onDestroy");
        super.onDestroy();
        if (this.f179979s != null) {
            ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
            rn3.i.Di().r(this.f179979s);
            this.f179979s = null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        android.os.Looper.myQueue().addIdleHandler(g22.y.f349415d);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, android.app.Activity
    public void setRequestedOrientation(int i17) {
        super.setRequestedOrientation(1);
    }
}
