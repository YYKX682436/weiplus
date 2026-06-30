package com.tencent.mm.plugin.emoji.ui.v3;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "EmojiStoreEmptyFragment", "g22/v", "g22/w", "g22/x", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class EmojiStoreV3HomeUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f98433v = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f98434d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f98435e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f98436f;

    /* renamed from: h, reason: collision with root package name */
    public int f98438h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f98439i;

    /* renamed from: n, reason: collision with root package name */
    public com.google.android.material.tabs.TabLayout f98441n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.base.CustomViewPager f98442o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.List f98443p;

    /* renamed from: q, reason: collision with root package name */
    public g22.u f98444q;

    /* renamed from: s, reason: collision with root package name */
    public g22.w f98446s;

    /* renamed from: g, reason: collision with root package name */
    public int f98437g = -1;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashMap f98440m = new java.util.HashMap();

    /* renamed from: r, reason: collision with root package name */
    public boolean f98445r = true;

    /* renamed from: t, reason: collision with root package name */
    public final yz5.l f98447t = new g22.z(this);

    /* renamed from: u, reason: collision with root package name */
    public final androidx.viewpager.widget.ViewPager.OnPageChangeListener f98448u = new g22.e0(this);

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeUI$EmojiStoreEmptyFragment;", "Lcom/tencent/mm/ui/MMFragment;", "<init>", "()V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes11.dex */
    public static final class EmojiStoreEmptyFragment extends com.tencent.mm.ui.MMFragment {
        @Override // com.tencent.mm.ui.MMFragment
        /* renamed from: getLayoutId */
        public int getF72225d() {
            return -1;
        }
    }

    public final com.tencent.mm.ui.MMFragment T6(int i17) {
        com.tencent.mm.ui.MMFragment mMFragment;
        if (i17 == 0) {
            androidx.fragment.app.Fragment instantiate = androidx.fragment.app.Fragment.instantiate(this, com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeMainFragment.class.getName(), null);
            kotlin.jvm.internal.o.e(instantiate, "null cannot be cast to non-null type com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment");
            mMFragment = (com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment) instantiate;
        } else if (i17 != 1) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EmojiStoreV3HomeUI", "create fragment failed.");
            mMFragment = new com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeUI.EmojiStoreEmptyFragment();
        } else {
            androidx.fragment.app.Fragment instantiate2 = androidx.fragment.app.Fragment.instantiate(this, com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2PersonFragment.class.getName(), null);
            kotlin.jvm.internal.o.e(instantiate2, "null cannot be cast to non-null type com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment");
            mMFragment = (com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment) instantiate2;
        }
        mMFragment.setParent(this);
        return mMFragment;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a8h;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        g22.u uVar = this.f98444q;
        if (uVar != null) {
            com.tencent.mm.ui.MMFragment mMFragment = (com.tencent.mm.ui.MMFragment) uVar.f267871e.invoke(java.lang.Integer.valueOf(this.f98438h));
            if (mMFragment != null) {
                mMFragment.onActivityResult(i17, i18, intent);
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        g22.v vVar;
        com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3TabView emojiStoreV3TabView;
        android.widget.ImageView imageView;
        oa.i k17;
        g22.v vVar2;
        com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3TabView emojiStoreV3TabView2;
        com.google.android.material.tabs.TabLayout tabLayout;
        android.view.View view;
        android.view.View view2;
        super.onCreate(bundle);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiStoreV3HomeUI", "exit in teen mode");
            ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(this);
            finish();
            return;
        }
        this.f98437g = getIntent().getIntExtra("download_entrance_scene", -1);
        java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("ShowPersonalEmotion");
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiStoreV3HomeUI", "get dynamic config value:%s", d17);
        boolean z17 = !com.tencent.mm.sdk.platformtools.t8.K0(d17) && com.tencent.mm.sdk.platformtools.t8.D1(d17, 0) == 1;
        this.f98445r = z17;
        if (z17) {
            this.f98438h = getIntent().getIntExtra("emoji_tab", 0);
        }
        com.tencent.mm.ui.base.CustomViewPager customViewPager = (com.tencent.mm.ui.base.CustomViewPager) findViewById(com.tencent.mm.R.id.dem);
        this.f98442o = customViewPager;
        if (customViewPager != null) {
            customViewPager.setOffscreenPageLimit(0);
            this.f98444q = new g22.u(this, this.f98438h, this.f98448u, customViewPager, this.f98445r, this.f98447t);
        }
        this.f98434d = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f482474fi);
        this.f98435e = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.actionbar_up_indicator_btn);
        this.f98436f = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f482495g3);
        android.widget.ImageView imageView2 = this.f98435e;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new g22.b0(this));
        }
        android.widget.ImageView imageView3 = this.f98434d;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new g22.c0(this));
        }
        android.widget.ImageView imageView4 = this.f98436f;
        if (imageView4 != null) {
            imageView4.setOnClickListener(new g22.d0(this));
        }
        android.widget.ImageView imageView5 = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.hmu);
        if (imageView5 != null) {
            this.f98446s = new g22.w(imageView5);
            ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
            rn3.i.Di().k(this.f98446s);
        }
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o();
        }
        com.google.android.material.tabs.TabLayout tabLayout2 = (com.google.android.material.tabs.TabLayout) findViewById(com.tencent.mm.R.id.nup);
        this.f98441n = tabLayout2;
        if (tabLayout2 != null) {
            tabLayout2.setVisibility(0);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : this.f98445r ? kz5.c0.k(getContext().getResources().getString(com.tencent.mm.R.string.byw), getContext().getResources().getString(com.tencent.mm.R.string.f491111bz2)) : kz5.c0.k(getContext().getResources().getString(com.tencent.mm.R.string.bzu))) {
            kotlin.jvm.internal.o.d(str);
            arrayList.add(new g22.v(str));
        }
        this.f98443p = arrayList;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g22.v vVar3 = (g22.v) it.next();
            com.google.android.material.tabs.TabLayout tabLayout3 = this.f98441n;
            android.view.View view3 = null;
            oa.i l17 = tabLayout3 != null ? tabLayout3.l() : null;
            vVar3.f267877b = l17;
            if (l17 != null) {
                l17.c(com.tencent.mm.R.layout.a8g);
            }
            oa.i iVar = vVar3.f267877b;
            if (iVar != null && (view2 = iVar.f343783f) != null) {
                com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3TabView emojiStoreV3TabView3 = (com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3TabView) view2.findViewById(com.tencent.mm.R.id.f487471oq2);
                vVar3.f267879d = emojiStoreV3TabView3;
                if (emojiStoreV3TabView3 != null) {
                    emojiStoreV3TabView3.setTitleText(vVar3.f267876a);
                }
                com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3TabView emojiStoreV3TabView4 = vVar3.f267879d;
                if (emojiStoreV3TabView4 != null) {
                    emojiStoreV3TabView4.setTitleTextSize(ym5.x.a(getContext(), 15.0f));
                }
                com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3TabView emojiStoreV3TabView5 = vVar3.f267879d;
                if (emojiStoreV3TabView5 != null) {
                    emojiStoreV3TabView5.setTitleTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.FG_1));
                }
                com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3TabView emojiStoreV3TabView6 = vVar3.f267879d;
                if (emojiStoreV3TabView6 != null) {
                    android.widget.TextView textView = emojiStoreV3TabView6.f98473e;
                    com.tencent.mm.ui.bk.s0(textView != null ? textView.getPaint() : null);
                }
                java.util.List list = this.f98443p;
                if ((list != null ? ((java.util.ArrayList) list).size() : 0) > 1) {
                    vVar3.f267880e = view2.findViewById(com.tencent.mm.R.id.f487200nv4);
                }
            }
            oa.i iVar2 = vVar3.f267877b;
            if (iVar2 != null && (view = iVar2.f343783f) != null) {
                view3 = view.findViewById(com.tencent.mm.R.id.dea);
            }
            vVar3.f267878c = view3;
            if (view3 != null) {
                view3.setPadding((int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.f480387wi), view3.getPaddingTop(), (int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.f480387wi), view3.getPaddingBottom());
            }
            oa.i iVar3 = vVar3.f267877b;
            if (iVar3 != null && (tabLayout = this.f98441n) != null) {
                tabLayout.d(iVar3, false);
            }
        }
        com.google.android.material.tabs.TabLayout tabLayout4 = this.f98441n;
        if (tabLayout4 != null) {
            tabLayout4.a(new g22.a0(this));
        }
        java.util.List list2 = this.f98443p;
        if (list2 != null && (vVar2 = (g22.v) ((java.util.ArrayList) list2).get(0)) != null && (emojiStoreV3TabView2 = vVar2.f267879d) != null) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(com.tencent.mm.plugin.emoji.model.o.a().f97589e)) {
                java.lang.String str2 = com.tencent.mm.plugin.emoji.model.o.a().f97589e;
                kotlin.jvm.internal.o.f(str2, "getMainTabWording(...)");
                emojiStoreV3TabView2.setTitleText(str2);
            } else if (com.tencent.mm.plugin.emoji.model.o.a().f97588d) {
                emojiStoreV3TabView2.setTitleText(com.tencent.mm.R.string.byx);
            } else {
                emojiStoreV3TabView2.setTitleText(com.tencent.mm.R.string.byw);
            }
            if (!this.f98445r) {
                emojiStoreV3TabView2.setTitleText(com.tencent.mm.R.string.bzu);
            }
        }
        com.google.android.material.tabs.TabLayout tabLayout5 = this.f98441n;
        if (tabLayout5 != null && (k17 = tabLayout5.k(0)) != null) {
            k17.b();
        }
        gm0.j1.e().j(new g22.x());
        if (this.f98445r && this.f98441n != null) {
            java.util.List list3 = this.f98443p;
            if ((list3 != null ? ((java.util.ArrayList) list3).size() : 0) > 1) {
                java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_EMOJI_STORE_NEW_ORIGINAL_BOOLEAN, java.lang.Boolean.FALSE);
                kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Boolean");
                boolean booleanValue = ((java.lang.Boolean) m17).booleanValue();
                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiStoreV3HomeUI", "updatePersonPoint: " + booleanValue);
                java.util.List list4 = this.f98443p;
                if (list4 != null && (vVar = (g22.v) ((java.util.ArrayList) list4).get(1)) != null && (emojiStoreV3TabView = vVar.f267879d) != null && (imageView = emojiStoreV3TabView.f98474f) != null) {
                    imageView.setVisibility(booleanValue ? 0 : 4);
                }
            }
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.idkeyStat(406L, 0L, 1L, false);
        g0Var.idkeyStat(406L, 2L, java.lang.System.currentTimeMillis() - currentTimeMillis, false);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiStoreV3HomeUI", "onDestroy");
        super.onDestroy();
        if (this.f98446s != null) {
            ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
            rn3.i.Di().r(this.f98446s);
            this.f98446s = null;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        android.os.Looper.myQueue().addIdleHandler(g22.y.f267882d);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, android.app.Activity
    public void setRequestedOrientation(int i17) {
        super.setRequestedOrientation(1);
    }
}
