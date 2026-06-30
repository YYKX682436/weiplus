package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes2.dex */
public class u1 extends com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC {

    /* renamed from: p, reason: collision with root package name */
    public ir2.a1 f101953p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.c2 f101954q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.h2 f101955r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.activity.uic.s1 f101956s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f101956s = new com.tencent.mm.plugin.finder.activity.uic.s1();
    }

    @Override // com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC
    public void X6(com.tencent.mm.autogen.events.FeedStickyEvent feedStickyEvent) {
        if (feedStickyEvent != null && feedStickyEvent.f54251g.f6828a == 1001 && this.f101741d == 1) {
            com.tencent.mm.plugin.finder.feed.c2 c2Var = this.f101954q;
            if (c2Var == null) {
                kotlin.jvm.internal.o.o("presenter");
                throw null;
            }
            ir2.a1 a1Var = c2Var.f106613e;
            a1Var.getClass();
            pf5.e.launch$default(a1Var, null, null, new ir2.x0(a1Var, null), 3, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC
    public void Y6() {
        com.tencent.mm.plugin.finder.feed.h2 h2Var = this.f101955r;
        if (h2Var == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        android.widget.TextView textView = h2Var.f106887v;
        if (textView == null) {
            return;
        }
        textView.setVisibility(0);
    }

    @Override // com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC
    public void Z6(r45.e21 e21Var) {
        java.lang.String str;
        com.tencent.mm.plugin.finder.feed.h2 h2Var = this.f101955r;
        if (h2Var == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        if (e21Var == null || (str = e21Var.getString(5)) == null) {
            str = "";
        }
        h2Var.o(str);
    }

    public final int a7() {
        androidx.fragment.app.Fragment fragment = getFragment();
        com.tencent.mm.plugin.finder.activity.fragment.FinderActivityFragment finderActivityFragment = fragment instanceof com.tencent.mm.plugin.finder.activity.fragment.FinderActivityFragment ? (com.tencent.mm.plugin.finder.activity.fragment.FinderActivityFragment) fragment : null;
        if (finderActivityFragment != null) {
            return finderActivityFragment.f101752t;
        }
        return 0;
    }

    @Override // com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC, com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ado;
    }

    @Override // com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        in5.s sVar;
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout;
        android.view.View view;
        android.view.View view2;
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("FinderCampaignContentUIC", "topic:" + this.f101742e + " topicType:7 tabType:" + this.f101741d + " eventTopicId:" + this.f101744g + " encryptedEventTopicId:" + this.f101745h);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.plugin.finder.feed.h2 h2Var = new com.tencent.mm.plugin.finder.feed.h2((com.tencent.mm.ui.MMActivity) activity, 2, 59, false, this instanceof ea2.j0, null, 40, null);
        java.lang.String str = this.f101742e;
        kotlin.jvm.internal.o.g(str, "<set-?>");
        h2Var.f106879n = str;
        h2Var.f106878m = 7;
        androidx.fragment.app.Fragment fragment = getFragment();
        com.tencent.mm.view.RefreshLoadMoreLayout rlLayout = (fragment == null || (view2 = fragment.getView()) == null) ? null : (com.tencent.mm.view.RefreshLoadMoreLayout) view2.findViewById(com.tencent.mm.R.id.m6e);
        if (rlLayout == null) {
            rlLayout = U6().f434523b;
            kotlin.jvm.internal.o.f(rlLayout, "rlLayout");
        }
        h2Var.f108963g = rlLayout;
        rlLayout.setSuperNestedScroll(true);
        if (getIntent().getBooleanExtra("key_has_cover", false)) {
            h2Var.f108963g.setBackgroundResource(com.tencent.mm.R.color.a9e);
        }
        h2Var.f106882q = this.f101741d;
        h2Var.f106886u = a7();
        androidx.fragment.app.Fragment fragment2 = getFragment();
        h2Var.f106884s = (fragment2 == null || (view = fragment2.getView()) == null) ? null : view.findViewById(com.tencent.mm.R.id.f484229dg3);
        this.f101955r = h2Var;
        long longExtra = getIntent().getLongExtra("key_feed_ref_id", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("key_feed_ref_dup_flag");
        androidx.fragment.app.Fragment fragment3 = getFragment();
        kotlin.jvm.internal.o.d(fragment3);
        pf5.z zVar = pf5.z.f353948a;
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.b(fragment3).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        int a76 = a7();
        int i17 = this.f101741d;
        r45.a34 a34Var = new r45.a34();
        a34Var.set(0, java.lang.Integer.valueOf(getIntent().getIntExtra("KEY_JSAPI_SOURCE_TYPE", 0)));
        java.lang.String stringExtra2 = getIntent().getStringExtra("KEY_JSAPI_SOURCE_BUFFER");
        if (stringExtra2 != null) {
            a34Var.set(1, stringExtra2);
        }
        java.lang.String b17 = ey2.o2.b(ey2.p2.f257467g, this.f101744g, this.f101745h, null, a76, i17, 4, null);
        ba2.a aVar = new ba2.a(O6(this.f101741d), this.f101744g, java.lang.Long.valueOf(longExtra), stringExtra, this.f101745h, this.f101741d, null, V6, this.f101743f, b17, a7(), a34Var);
        ba2.d dVar = new ba2.d(b17);
        com.tencent.mars.xlog.Log.i("FinderCampaignContentUIC", "finderEventTopicId:" + this.f101744g + " refObjectId:" + longExtra + " cacheKey:" + b17 + " tabType:" + this.f101741d + ' ');
        com.tencent.mm.plugin.finder.feed.h2 h2Var2 = this.f101955r;
        if (h2Var2 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        ir2.z1 z1Var = new ir2.z1(h2Var2.f108963g, true, null, null);
        androidx.fragment.app.Fragment fragment4 = getFragment();
        kotlin.jvm.internal.o.d(fragment4);
        androidx.lifecycle.c1 a17 = zVar.b(fragment4).a(ir2.a1.class);
        kotlin.jvm.internal.o.e(a17, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.newloader.Loader<T of com.tencent.mm.plugin.finder.newloader.Loader.LoaderBuilder>");
        ir2.a1 a1Var = (ir2.a1) a17;
        a1Var.f294093f = dVar;
        a1Var.f294094g = null;
        a1Var.f294095h = aVar;
        a1Var.f294096i = aVar;
        a1Var.f294097m = aVar;
        a1Var.f294098n = z1Var;
        this.f101953p = a1Var;
        androidx.fragment.app.Fragment fragment5 = getFragment();
        kotlin.jvm.internal.o.d(fragment5);
        com.tencent.mm.plugin.finder.activity.uic.r1 r1Var = new com.tencent.mm.plugin.finder.activity.uic.r1(this, a1Var, fragment5, a7());
        ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).getClass();
        mv2.f0.f331561a.a(r1Var);
        r1Var.f294192h.alive();
        r1Var.f294194m.alive();
        r1Var.f294195n.alive();
        r1Var.f294193i.alive();
        r1Var.f294197p.alive();
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) activity2;
        ir2.a1 a1Var2 = this.f101953p;
        if (a1Var2 == null) {
            kotlin.jvm.internal.o.o("newLoader");
            throw null;
        }
        com.tencent.mm.plugin.finder.feed.c2 c2Var = new com.tencent.mm.plugin.finder.feed.c2(mMActivity, 2, 59, a1Var2);
        java.lang.String str2 = this.f101742e;
        kotlin.jvm.internal.o.g(str2, "<set-?>");
        c2Var.f106446m = str2;
        c2Var.f106445i = 7;
        a7();
        this.f101954q = c2Var;
        androidx.fragment.app.Fragment fragment6 = getFragment();
        if (fragment6 != null) {
            com.tencent.mm.plugin.finder.feed.h2 h2Var3 = this.f101955r;
            if (h2Var3 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            androidx.lifecycle.c1 a18 = zVar.b(fragment6).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            kotlin.jvm.internal.o.f(a18, "get(...)");
            fc2.o Z6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) a18).Z6(-1);
            if (Z6 != null) {
                Z6.d(h2Var3.f108963g.getRecyclerView());
            }
            h2Var3.f106883r = fragment6;
            ((com.tencent.mm.plugin.finder.viewmodel.component.ut) zVar.b(fragment6).a(com.tencent.mm.plugin.finder.viewmodel.component.ut.class)).P6("activityid", pm0.v.u(this.f101744g));
        }
        com.tencent.mm.plugin.finder.feed.h2 h2Var4 = this.f101955r;
        if (h2Var4 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        final com.tencent.mm.plugin.finder.feed.c2 c2Var2 = this.f101954q;
        if (c2Var2 == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        h2Var4.f108962f = c2Var2;
        c2Var2.f106614f = h2Var4;
        ir2.a1 a1Var3 = c2Var2.f106613e;
        java.util.List list = a1Var3.f294091d;
        kotlin.jvm.internal.o.e(list, "null cannot be cast to non-null type java.util.ArrayList<com.tencent.mm.plugin.finder.model.RVFeed>{ kotlin.collections.TypeAliasesKt.ArrayList<com.tencent.mm.plugin.finder.model.RVFeed> }");
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        androidx.recyclerview.widget.RecyclerView recyclerView = h2Var4.f108963g.getRecyclerView();
        com.tencent.mm.ui.MMActivity context = h2Var4.f108960d;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.storage.vj0 vj0Var = h2Var4.f106890y;
        androidx.recyclerview.widget.RecyclerView.LayoutManager d17 = vj0Var.d(context);
        kotlin.jvm.internal.o.g(d17, "<set-?>");
        h2Var4.f108965i = d17;
        com.tencent.mm.plugin.finder.view.vc vcVar = com.tencent.mm.plugin.finder.view.FinderLikeDrawer.D;
        android.view.Window window = context.getWindow();
        kotlin.jvm.internal.o.f(window, "getWindow(...)");
        com.tencent.mm.plugin.finder.view.vc.a(vcVar, context, window, 1, false, false, 24, null);
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = h2Var4.f108965i;
        if (layoutManager == null) {
            kotlin.jvm.internal.o.o("finderManager");
            throw null;
        }
        recyclerView.setLayoutManager(layoutManager);
        final com.tencent.mm.plugin.finder.feed.c2 c2Var3 = (com.tencent.mm.plugin.finder.feed.c2) h2Var4.g();
        if (c2Var3.f106445i == 7) {
            sVar = new in5.s() { // from class: com.tencent.mm.plugin.finder.feed.FinderCampaignFeedUIContract$TopicFeedPresenter$buildCampaignConvert$1
                @Override // in5.s
                public in5.r getItemConvert(int type) {
                    if (type == -5) {
                        return new com.tencent.mm.plugin.finder.convert.xh();
                    }
                    if (type == -3) {
                        return new com.tencent.mm.plugin.finder.convert.ik();
                    }
                    if (type == 2) {
                        com.tencent.mm.plugin.finder.convert.eh ehVar = new com.tencent.mm.plugin.finder.convert.eh(0, null, null, null, 15, null);
                        ehVar.f103069o = com.tencent.mm.plugin.finder.feed.c2.this.f106447n;
                        ehVar.f103063f.f422131a = false;
                        return ehVar;
                    }
                    if (type != 4 && type != 9) {
                        if (type == 3001) {
                            com.tencent.mm.plugin.finder.convert.eh ehVar2 = new com.tencent.mm.plugin.finder.convert.eh(0, null, null, null, 15, null);
                            ehVar2.f103069o = com.tencent.mm.plugin.finder.feed.c2.this.f106447n;
                            ehVar2.f103063f.f422131a = false;
                            return ehVar2;
                        }
                        if (type != 3002) {
                            return new com.tencent.mm.plugin.finder.convert.z2();
                        }
                    }
                    com.tencent.mm.plugin.finder.convert.zk zkVar = new com.tencent.mm.plugin.finder.convert.zk(0, null, null, null, 15, null);
                    zkVar.f103069o = com.tencent.mm.plugin.finder.feed.c2.this.f106447n;
                    zkVar.f103063f.f422131a = false;
                    return zkVar;
                }
            };
        } else {
            final com.tencent.mm.plugin.finder.feed.v1 v1Var = new com.tencent.mm.plugin.finder.feed.v1(c2Var3);
            final com.tencent.mm.plugin.finder.feed.x1 x1Var = new com.tencent.mm.plugin.finder.feed.x1(c2Var3);
            sVar = new in5.s() { // from class: com.tencent.mm.plugin.finder.feed.FinderCampaignFeedUIContract$TopicFeedPresenter$buildItemCoverts$1
                @Override // in5.s
                public in5.r getItemConvert(int type) {
                    return new com.tencent.mm.plugin.finder.storage.f80(com.tencent.mm.plugin.finder.feed.c2.this.f106612d, null, 0, null, 14, null).g(type, v1Var, x1Var);
                }
            };
        }
        com.tencent.mm.plugin.finder.feed.f1 f1Var = new com.tencent.mm.plugin.finder.feed.f1(arrayList, h2Var4, sVar, false);
        h2Var4.f108964h = f1Var;
        recyclerView.setAdapter(f1Var);
        recyclerView.N(new com.tencent.mm.plugin.finder.storage.oj0((com.tencent.mm.plugin.finder.storage.pj0) vj0Var));
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = h2Var4.f108964h;
        if (wxRecyclerAdapter == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        wxRecyclerAdapter.f293105o = new com.tencent.mm.plugin.finder.feed.g1(h2Var4);
        h2Var4.f108963g.setActionCallback(new com.tencent.mm.plugin.finder.feed.l1(h2Var4));
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        int i18 = h2Var4.f108961e;
        fc2.o Z62 = nyVar.Z6(i18);
        if (Z62 != null) {
            Z62.d(recyclerView);
        }
        java.util.regex.Pattern pattern = pm0.v.f356802a;
        pm0.v.J(km5.u.d(), new com.tencent.mm.plugin.finder.feed.p1(h2Var4));
        if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.S1().r()).intValue() == 1) {
            recyclerView.i(new sc2.c8("Finder.FinderBaseGridFeedUIContract.ViewCallback", new com.tencent.mm.plugin.finder.feed.m1(h2Var4)));
        }
        androidx.lifecycle.c1 a19 = zVar.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        kotlin.jvm.internal.o.f(a19, "get(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) a19;
        r45.qt2 W6 = nyVar2.n7() ? nyVar2.W6(i18) : nyVar2.V6();
        boolean j17 = h2Var4.j(W6);
        com.tencent.mm.plugin.finder.feed.r1 r1Var2 = com.tencent.mm.plugin.finder.feed.r1.f108864d;
        if (j17) {
            in5.o.b(recyclerView, new com.tencent.mm.plugin.finder.feed.q1(W6, null, null), r1Var2);
        }
        if (h2Var4.j(W6)) {
            in5.o.b(recyclerView, new com.tencent.mm.plugin.finder.feed.q1(W6, new com.tencent.mm.plugin.finder.feed.o1(h2Var4, W6), new com.tencent.mm.plugin.finder.feed.n1(h2Var4, W6)), r1Var2);
        } else {
            h2Var4.g().f106616h.b(recyclerView, W6);
        }
        h2Var4.f106887v = (android.widget.TextView) context.findViewById(com.tencent.mm.R.id.m2g);
        h2Var4.f106888w = (android.widget.FrameLayout) context.findViewById(com.tencent.mm.R.id.f484229dg3);
        h2Var4.f106889x = (android.widget.ProgressBar) context.findViewById(com.tencent.mm.R.id.f482619ji);
        android.widget.TextView textView = h2Var4.f106887v;
        if (textView != null) {
            textView.setOnClickListener(new com.tencent.mm.plugin.finder.feed.e2(h2Var4));
        }
        com.tencent.mm.plugin.finder.feed.s1 s1Var = c2Var2.f106614f;
        if (s1Var != null && (refreshLoadMoreLayout = s1Var.f108963g) != null) {
            c2Var2.f106615g = new ir2.z1(refreshLoadMoreLayout, true, new com.tencent.mm.plugin.finder.feed.b1(c2Var2), new com.tencent.mm.plugin.finder.feed.c1(c2Var2));
        }
        ir2.z1 z1Var2 = c2Var2.f106615g;
        if (z1Var2 != null) {
            a1Var3.f294098n = z1Var2;
            a1Var3.R6(new com.tencent.mm.plugin.finder.feed.d1(z1Var2));
        }
        com.tencent.mm.plugin.finder.feed.s1 s1Var2 = c2Var2.f106614f;
        if (s1Var2 != null) {
            if (c2Var2.f106445i == 7) {
                final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
                com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ActivityFeedRemoveEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ActivityFeedRemoveEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.FinderCampaignFeedUIContract$TopicFeedPresenter$initListener$1
                    {
                        this.__eventId = -478908231;
                    }

                    @Override // com.tencent.mm.sdk.event.IListener
                    public boolean callback(com.tencent.mm.autogen.events.ActivityFeedRemoveEvent activityFeedRemoveEvent) {
                        com.tencent.mm.autogen.events.ActivityFeedRemoveEvent event = activityFeedRemoveEvent;
                        kotlin.jvm.internal.o.g(event, "event");
                        pm0.v.X(new com.tencent.mm.plugin.finder.feed.y1(event, com.tencent.mm.plugin.finder.feed.c2.this));
                        return false;
                    }
                };
                c2Var2.f106448o = iListener;
                iListener.alive();
            }
            a1Var3.R6(new com.tencent.mm.plugin.finder.feed.b2(c2Var2));
            s1Var2.getRecyclerView();
            ((gp2.v0) ((ws5.e) pf5.u.f353936a.e(ws5.g.class).c(ws5.e.class))).N6(c2Var2.f106612d);
        }
        pf5.e.launch$default(a1Var3, null, null, new ir2.m0(a1Var3, null), 3, null);
        com.tencent.mm.plugin.finder.feed.h2 h2Var5 = this.f101955r;
        if (h2Var5 != null) {
            h2Var5.getRecyclerView().i(this.f101956s);
        } else {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        com.tencent.mm.plugin.finder.feed.h2 h2Var = this.f101955r;
        if (h2Var != null) {
            zy2.zb.Kh(zbVar, h2Var.getRecyclerView(), ml2.x1.f328202f, "59", ml2.y.f328241f, 0, 0L, 0, 112, null);
        } else {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC, com.tencent.mm.ui.component.UIComponent
    public void onPreDestroyed() {
        super.onPreDestroyed();
        com.tencent.mm.plugin.finder.feed.c2 c2Var = this.f101954q;
        if (c2Var == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        c2Var.onDetach();
        com.tencent.mm.plugin.finder.feed.h2 h2Var = this.f101955r;
        if (h2Var != null) {
            h2Var.getRecyclerView().V0(this.f101956s);
        } else {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        com.tencent.mm.plugin.finder.feed.h2 h2Var = this.f101955r;
        if (h2Var != null) {
            zy2.zb.Kh(zbVar, h2Var.getRecyclerView(), ml2.x1.f328202f, "59", ml2.y.f328240e, 0, 0L, 0, 112, null);
        } else {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC
    public void setCoveredStyle() {
        getRootView().post(new com.tencent.mm.plugin.finder.activity.uic.t1(this));
    }
}
