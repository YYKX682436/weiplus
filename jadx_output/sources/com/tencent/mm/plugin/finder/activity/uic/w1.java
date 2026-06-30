package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes2.dex */
public abstract class w1 extends com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC {

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.r10 f101964p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.x10 f101965q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader f101966r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f101967s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.FrameLayout f101968t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.ProgressBar f101969u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
    }

    @Override // com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC
    public void X6(com.tencent.mm.autogen.events.FeedStickyEvent feedStickyEvent) {
        if (feedStickyEvent != null && feedStickyEvent.f54251g.f6828a == 1001 && this.f101741d == 1) {
            com.tencent.mm.plugin.finder.feed.r10 r10Var = this.f101964p;
            if (r10Var != null) {
                r10Var.v();
            } else {
                kotlin.jvm.internal.o.o("presenter");
                throw null;
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC
    public void Y6() {
        android.widget.TextView textView = this.f101967s;
        if (textView == null) {
            return;
        }
        textView.setVisibility(0);
    }

    @Override // com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC
    public void Z6(r45.e21 e21Var) {
        setCoveredStyle();
    }

    public com.tencent.mm.plugin.finder.feed.x10 a7(int i17, int i18, int i19) {
        android.view.View view;
        android.view.View view2;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.plugin.finder.feed.x10 x10Var = new com.tencent.mm.plugin.finder.feed.x10((com.tencent.mm.ui.MMActivity) activity, 2, i17, false, W6(), null, 40, null);
        java.lang.String str = this.f101742e;
        kotlin.jvm.internal.o.g(str, "<set-?>");
        x10Var.F = str;
        x10Var.D = i18;
        x10Var.P = b7();
        androidx.fragment.app.Fragment fragment = getFragment();
        android.view.View view3 = null;
        com.tencent.mm.view.RefreshLoadMoreLayout rlLayout = (fragment == null || (view2 = fragment.getView()) == null) ? null : (com.tencent.mm.view.RefreshLoadMoreLayout) view2.findViewById(com.tencent.mm.R.id.m6e);
        if (rlLayout == null) {
            rlLayout = U6().f434523b;
            kotlin.jvm.internal.o.f(rlLayout, "rlLayout");
        }
        x10Var.f106180m = rlLayout;
        rlLayout.setSuperNestedScroll(true);
        if (getIntent().getBooleanExtra("key_has_cover", false)) {
            x10Var.f106180m.setBackgroundResource(com.tencent.mm.R.color.a9e);
        }
        x10Var.f111023J = i19;
        androidx.fragment.app.Fragment fragment2 = getFragment();
        if (fragment2 != null && (view = fragment2.getView()) != null) {
            view3 = view.findViewById(com.tencent.mm.R.id.f484229dg3);
        }
        x10Var.M = view3;
        return x10Var;
    }

    public final int b7() {
        androidx.fragment.app.Fragment fragment = getFragment();
        com.tencent.mm.plugin.finder.activity.fragment.FinderActivityFragment finderActivityFragment = fragment instanceof com.tencent.mm.plugin.finder.activity.fragment.FinderActivityFragment ? (com.tencent.mm.plugin.finder.activity.fragment.FinderActivityFragment) fragment : null;
        if (finderActivityFragment != null) {
            return finderActivityFragment.f101752t;
        }
        return 0;
    }

    public final com.tencent.mm.plugin.finder.feed.x10 c7() {
        com.tencent.mm.plugin.finder.feed.x10 x10Var = this.f101965q;
        if (x10Var != null) {
            return x10Var;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }

    public void d7() {
    }

    public void e7() {
    }

    @Override // com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        androidx.fragment.app.Fragment fragment = getFragment();
        kotlin.jvm.internal.o.d(fragment);
        pf5.z zVar = pf5.z.f353948a;
        final r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.b(fragment).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        if (V6()) {
            final int O6 = O6(this.f101741d);
            final java.lang.String str = this.f101742e;
            final java.lang.String str2 = this.f101743f;
            com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader finderTopicFeedLoader = new com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader(this, O6, str, V6, str2) { // from class: com.tencent.mm.plugin.finder.activity.uic.FinderTopicContentUIC$FinderNewestLoader
                public final /* synthetic */ com.tencent.mm.plugin.finder.activity.uic.w1 C;

                {
                    kotlin.jvm.internal.o.g(str, "topicContent");
                    this.C = this;
                }

                @Override // com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader
                public void d(int i17, r45.xn5 xn5Var) {
                    super.d(i17, xn5Var);
                    this.C.e7();
                }

                @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, mv2.w0
                public void onPostStart(long j17) {
                    super.onPostStart(j17);
                    com.tencent.mm.plugin.finder.activity.uic.w1 w1Var = this.C;
                    com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC.t7(w1Var.R6(), w1Var.Q6(), false, 2, null);
                }
            };
            finderTopicFeedLoader.initFromCache(getIntent());
            finderTopicFeedLoader.f107680s = this.f101744g;
            finderTopicFeedLoader.f107681t = this.f101745h;
            finderTopicFeedLoader.f107682u = this.f101741d;
            finderTopicFeedLoader.f107675n = java.lang.Long.valueOf(getIntent().getLongExtra("key_feed_ref_id", 0L));
            finderTopicFeedLoader.f107671g = b7();
            this.f101966r = finderTopicFeedLoader;
        } else {
            com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader finderTopicFeedLoader2 = new com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader(this, O6(this.f101741d), this.f101742e, V6, this.f101743f) { // from class: com.tencent.mm.plugin.finder.activity.uic.FinderTopicContentUIC$FinderHottestFeedLoader
                public final /* synthetic */ com.tencent.mm.plugin.finder.activity.uic.w1 C;

                {
                    kotlin.jvm.internal.o.g(topicContent, "topicContent");
                    this.C = this;
                }

                @Override // com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader
                public void d(int i17, r45.xn5 xn5Var) {
                    super.d(i17, xn5Var);
                    this.C.e7();
                }

                @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
                public void onFeedUpdateEventCallback(com.tencent.mm.autogen.events.FeedUpdateEvent event) {
                    kotlin.jvm.internal.o.g(event, "event");
                    super.onFeedUpdateEventCallback(event);
                }

                @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
                public void onFetchRefreshDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
                    kotlin.jvm.internal.o.g(response, "response");
                    super.onFetchRefreshDone(response);
                    this.C.d7();
                }
            };
            finderTopicFeedLoader2.initFromCache(getIntent());
            finderTopicFeedLoader2.f107680s = this.f101744g;
            finderTopicFeedLoader2.f107681t = this.f101745h;
            finderTopicFeedLoader2.f107682u = this.f101741d;
            finderTopicFeedLoader2.f107675n = java.lang.Long.valueOf(getIntent().getLongExtra("key_feed_ref_id", 0L));
            finderTopicFeedLoader2.f107671g = b7();
            this.f101966r = finderTopicFeedLoader2;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feedLoader : ");
        com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader finderTopicFeedLoader3 = this.f101966r;
        if (finderTopicFeedLoader3 == null) {
            kotlin.jvm.internal.o.o("feedLoader");
            throw null;
        }
        sb6.append(finderTopicFeedLoader3);
        sb6.append(" this.innerTabType : ");
        com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader finderTopicFeedLoader4 = this.f101966r;
        if (finderTopicFeedLoader4 == null) {
            kotlin.jvm.internal.o.o("feedLoader");
            throw null;
        }
        sb6.append(finderTopicFeedLoader4.f107682u);
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, sb6.toString());
        int T6 = T6();
        int P6 = P6();
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) activity;
        com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader finderTopicFeedLoader5 = this.f101966r;
        if (finderTopicFeedLoader5 == null) {
            kotlin.jvm.internal.o.o("feedLoader");
            throw null;
        }
        com.tencent.mm.plugin.finder.feed.r10 r10Var = new com.tencent.mm.plugin.finder.feed.r10(mMActivity, 2, P6, finderTopicFeedLoader5);
        java.lang.String str3 = this.f101742e;
        kotlin.jvm.internal.o.g(str3, "<set-?>");
        r10Var.f108868o = str3;
        r10Var.f108866m = T6;
        b7();
        this.f101964p = r10Var;
        com.tencent.mm.plugin.finder.feed.x10 a76 = a7(P6, T6, this.f101741d);
        kotlin.jvm.internal.o.g(a76, "<set-?>");
        this.f101965q = a76;
        com.tencent.mm.plugin.finder.feed.x10 c76 = c7();
        com.tencent.mm.plugin.finder.feed.r10 r10Var2 = this.f101964p;
        if (r10Var2 == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        c76.f106182o = r10Var2;
        if (r10Var2 == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        r10Var2.m(c7());
        androidx.fragment.app.Fragment fragment2 = getFragment();
        if (fragment2 != null) {
            com.tencent.mm.plugin.finder.feed.x10 c77 = c7();
            androidx.lifecycle.c1 a17 = zVar.b(fragment2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            fc2.o Z6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) a17).Z6(-1);
            if (Z6 != null) {
                Z6.d(c77.f106180m.getRecyclerView());
            }
            c77.K = fragment2;
            ((com.tencent.mm.plugin.finder.viewmodel.component.ut) zVar.b(fragment2).a(com.tencent.mm.plugin.finder.viewmodel.component.ut.class)).P6("activityid", pm0.v.u(this.f101744g));
        }
        this.f101967s = (android.widget.TextView) getActivity().findViewById(com.tencent.mm.R.id.m2g);
        this.f101968t = (android.widget.FrameLayout) getActivity().findViewById(com.tencent.mm.R.id.f484229dg3);
        this.f101969u = (android.widget.ProgressBar) getActivity().findViewById(com.tencent.mm.R.id.f482619ji);
        android.widget.TextView textView = this.f101967s;
        if (textView != null) {
            textView.setOnClickListener(new com.tencent.mm.plugin.finder.activity.uic.v1(this));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        int X6 = R6().X6();
        int i17 = this.f101741d;
        if (i17 - 1 == X6) {
            com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader finderTopicFeedLoader = this.f101966r;
            if (finderTopicFeedLoader == null) {
                kotlin.jvm.internal.o.o("feedLoader");
                throw null;
            }
            finderTopicFeedLoader.f107683v = i17;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPause check visible activeIndex :");
        sb6.append(X6);
        sb6.append(" empty View :");
        android.view.View t17 = c7().t();
        sb6.append(t17 != null ? java.lang.Integer.valueOf(t17.getVisibility()) : null);
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, sb6.toString());
    }

    @Override // com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC, com.tencent.mm.ui.component.UIComponent
    public void onPreDestroyed() {
        super.onPreDestroyed();
        com.tencent.mm.plugin.finder.feed.r10 r10Var = this.f101964p;
        if (r10Var != null) {
            r10Var.onDetach();
        } else {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "onResume");
        com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader finderTopicFeedLoader = this.f101966r;
        if (finderTopicFeedLoader != null) {
            finderTopicFeedLoader.f107683v = -1;
        } else {
            kotlin.jvm.internal.o.o("feedLoader");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC
    public void setCoveredStyle() {
        java.lang.String str;
        r45.e21 e21Var = this.f101746i;
        if (e21Var == null || (str = e21Var.getString(5)) == null) {
            str = "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) c7().f106180m.findViewById(com.tencent.mm.R.id.ili);
        if (textView != null) {
            textView.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3));
        }
        android.view.View findViewById = c7().f106180m.findViewById(com.tencent.mm.R.id.i0a);
        if (findViewById != null) {
            findViewById.setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_1));
        }
        android.view.View findViewById2 = c7().f106180m.findViewById(com.tencent.mm.R.id.m3v);
        if (findViewById2 != null) {
            findViewById2.setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_1));
        }
        android.view.View findViewById3 = c7().f106180m.findViewById(com.tencent.mm.R.id.bdv);
        if (findViewById3 != null) {
            findViewById3.setBackgroundResource(com.tencent.mm.R.drawable.f481638ys);
        }
        android.widget.TextView textView2 = (android.widget.TextView) c7().f106180m.findViewById(com.tencent.mm.R.id.dft);
        if (textView2 != null) {
            textView2.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.f479254u6));
        }
        android.widget.TextView textView3 = (android.widget.TextView) c7().f106180m.findViewById(com.tencent.mm.R.id.m2g);
        if (textView3 != null) {
            textView3.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.f479254u6));
        }
    }
}
