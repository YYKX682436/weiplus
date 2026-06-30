package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public class w8 extends com.tencent.mm.plugin.finder.feed.gj {

    /* renamed from: r, reason: collision with root package name */
    public final boolean f110959r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f110960s;

    /* renamed from: t, reason: collision with root package name */
    public final ym5.q1 f110961t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8(com.tencent.mm.ui.MMActivity context, com.tencent.mm.plugin.finder.feed.t8 presenter, int i17, int i18, boolean z17, boolean z18) {
        super(context, presenter, i17, i18);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(presenter, "presenter");
        this.f110959r = z17;
        this.f110960s = z18;
        this.f110961t = new com.tencent.mm.plugin.finder.feed.u8(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.i0
    public android.view.View j() {
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.i0
    public void q(java.util.ArrayList data) {
        kotlin.jvm.internal.o.g(data, "data");
        super.q(data);
        com.tencent.mm.view.RefreshLoadMoreLayout o17 = o();
        com.tencent.mm.ui.MMActivity mMActivity = this.f106968d;
        android.view.View inflate = com.tencent.mm.ui.id.b(mMActivity).inflate(com.tencent.mm.R.layout.dxa, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        o17.setLoadMoreFooter(inflate);
        android.view.View findViewById = mMActivity.findViewById(com.tencent.mm.R.id.f486458la3);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById;
        if (recyclerView instanceof com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView) {
            com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView finderRecyclerView = (com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView) recyclerView;
            if (finderRecyclerView.getLayoutManager() instanceof androidx.recyclerview.widget.LinearLayoutManager) {
                androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = finderRecyclerView.getLayoutManager();
                kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView.i1(finderRecyclerView, (androidx.recyclerview.widget.LinearLayoutManager) layoutManager, null, 2, null);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.i0
    public boolean s() {
        return this.f110960s;
    }

    @Override // com.tencent.mm.plugin.finder.feed.i0
    public void t(int i17) {
        com.tencent.mm.ui.MMActivity activity = this.f106968d;
        if (activity instanceof com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI) {
            kotlin.jvm.internal.o.g(activity, "activity");
            ((qt2.u) pf5.z.f353948a.a(activity).a(qt2.u.class)).R6("onItemChange");
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.gj, com.tencent.mm.plugin.finder.feed.i0
    public void u() {
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader;
        androidx.recyclerview.widget.RecyclerView recyclerView = getRecyclerView();
        recyclerView.setItemAnimator(new uw2.n0());
        boolean z17 = true;
        recyclerView.setHasFixedSize(true);
        java.lang.String stringExtra = this.f106968d.getIntent().getStringExtra("FLOAT_BALL_KEY");
        if (stringExtra != null && stringExtra.length() != 0) {
            z17 = false;
        }
        com.tencent.mm.plugin.finder.feed.c0 c0Var = this.f106969e;
        if (!z17) {
            com.tencent.mm.plugin.finder.feed.t8 t8Var = c0Var instanceof com.tencent.mm.plugin.finder.feed.t8 ? (com.tencent.mm.plugin.finder.feed.t8) c0Var : null;
            if (((t8Var == null || (baseFeedLoader = t8Var.f106570t) == null) ? null : baseFeedLoader.getCache()) != null) {
                com.tencent.mm.plugin.finder.feed.t8 t8Var2 = c0Var instanceof com.tencent.mm.plugin.finder.feed.t8 ? (com.tencent.mm.plugin.finder.feed.t8) c0Var : null;
                if (t8Var2 != null) {
                    t8Var2.V();
                    return;
                }
                return;
            }
        }
        kotlin.jvm.internal.o.e(c0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderFeedDetailRelUIContract.Presenter");
        com.tencent.mm.plugin.finder.feed.t8 t8Var3 = (com.tencent.mm.plugin.finder.feed.t8) c0Var;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = t8Var3.K;
        if (baseFinderFeed != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cache exit!,show cache first size:");
            java.util.ArrayList f17 = t8Var3.f();
            sb6.append(f17 != null ? java.lang.Integer.valueOf(f17.size()) : null);
            sb6.append(" feed:");
            sb6.append(baseFinderFeed);
            com.tencent.mars.xlog.Log.i("Finder.FinderFeedDetailRelUIContract.ViewCallback", sb6.toString());
            java.util.ArrayList f18 = t8Var3.f();
            if (f18 != null) {
                f18.clear();
            }
            java.util.ArrayList f19 = t8Var3.f();
            if (f19 != null) {
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = t8Var3.K;
                kotlin.jvm.internal.o.d(baseFinderFeed2);
                f19.add(baseFinderFeed2);
            }
            a().notifyDataSetChanged();
        }
        super.u();
    }

    @Override // com.tencent.mm.plugin.finder.feed.gj
    public ym5.q1 w() {
        return this.f110961t;
    }

    public final void y(boolean z17, boolean z18, java.lang.String finderMemberUsername, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        android.view.View findViewById;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        kotlin.jvm.internal.o.g(finderMemberUsername, "finderMemberUsername");
        if (finderMemberUsername.length() == 0) {
            if (!((baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null || !feedObject.isMemberFeed()) ? false : true)) {
                return;
            }
        }
        com.tencent.mm.ui.MMActivity activity = this.f106968d;
        android.view.View findViewById2 = activity.findViewById(com.tencent.mm.R.id.g2i);
        if (findViewById2 == null || (findViewById = findViewById2.findViewById(com.tencent.mm.R.id.f485876jf3)) == null) {
            return;
        }
        if (!z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderFeedDetailRelUIContract$ViewCallback", "refreshMemberView", "(ZZLjava/lang/String;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/FinderFeedDetailRelUIContract$ViewCallback", "refreshMemberView", "(ZZLjava/lang/String;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderFeedDetailRelUIContract$ViewCallback", "refreshMemberView", "(ZZLjava/lang/String;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderFeedDetailRelUIContract$ViewCallback", "refreshMemberView", "(ZZLjava/lang/String;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            kotlin.jvm.internal.o.g(activity, "activity");
            androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.gg.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            ((com.tencent.mm.plugin.finder.viewmodel.component.gg) a17).W6(true, false);
            return;
        }
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.viewmodel.component.f2 f2Var = (com.tencent.mm.plugin.finder.viewmodel.component.f2) pf5.z.f353948a.a(activity).e(com.tencent.mm.plugin.finder.viewmodel.component.f2.class);
        if (f2Var != null) {
            pm0.v.V(0L, new com.tencent.mm.plugin.finder.viewmodel.component.w1(f2Var));
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/FinderFeedDetailRelUIContract$ViewCallback", "refreshMemberView", "(ZZLjava/lang/String;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/FinderFeedDetailRelUIContract$ViewCallback", "refreshMemberView", "(ZZLjava/lang/String;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!z18 || baseFinderFeed == null) {
            return;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(findViewById, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/FinderFeedDetailRelUIContract$ViewCallback", "refreshMemberView", "(ZZLjava/lang/String;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderFeedDetailRelUIContract$ViewCallback", "refreshMemberView", "(ZZLjava/lang/String;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a18 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.gg.class);
        kotlin.jvm.internal.o.f(a18, "get(...)");
        ((com.tencent.mm.plugin.finder.viewmodel.component.gg) a18).W6(false, false);
        ya2.b2 contact = baseFinderFeed.getContact();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById.findViewById(com.tencent.mm.R.id.kqg);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById.findViewById(com.tencent.mm.R.id.jew);
        android.widget.TextView textView = (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.jfb);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById.findViewById(com.tencent.mm.R.id.jex);
        android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById.findViewById(com.tencent.mm.R.id.jeu);
        viewGroup.setPadding(0, com.tencent.mm.ui.bl.h(activity), 0, 0);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.m1 m1Var = ya2.m1.f460511a;
        kotlin.jvm.internal.o.d(imageView2);
        zy2.tb.a(m1Var, imageView2, contact != null ? contact.field_authInfo : null, 0, 4, null);
        if (contact != null) {
            mn2.g1 g1Var = mn2.g1.f329975a;
            vo0.d a19 = g1Var.a();
            java.lang.String avatarUrl = contact.getAvatarUrl();
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            mn2.n nVar = new mn2.n(avatarUrl, com.tencent.mm.plugin.finder.storage.y90.X);
            kotlin.jvm.internal.o.d(imageView);
            a19.c(nVar, imageView, g1Var.h(mn2.f1.f329957h));
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String w07 = contact.w0();
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(activity, w07));
        }
        linearLayout.setOnClickListener(new com.tencent.mm.plugin.finder.feed.v8(baseFinderFeed, this, finderMemberUsername));
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(findViewById, arrayList5.toArray(), "com/tencent/mm/plugin/finder/feed/FinderFeedDetailRelUIContract$ViewCallback", "refreshMemberView", "(ZZLjava/lang/String;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderFeedDetailRelUIContract$ViewCallback", "refreshMemberView", "(ZZLjava/lang/String;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
