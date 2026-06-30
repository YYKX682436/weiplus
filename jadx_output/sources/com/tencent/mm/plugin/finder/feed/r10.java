package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public class r10 extends com.tencent.mm.plugin.finder.feed.k0 {
    public int A;
    public final com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter$feedProgressListener$1 B;
    public c50.m0 C;
    public final ym5.q1 D;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f108865i;

    /* renamed from: m, reason: collision with root package name */
    public int f108866m;

    /* renamed from: n, reason: collision with root package name */
    public long f108867n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f108868o;

    /* renamed from: p, reason: collision with root package name */
    public int f108869p;

    /* renamed from: q, reason: collision with root package name */
    public r45.r03 f108870q;

    /* renamed from: r, reason: collision with root package name */
    public long f108871r;

    /* renamed from: s, reason: collision with root package name */
    public r45.zi2 f108872s;

    /* renamed from: t, reason: collision with root package name */
    public r45.o03 f108873t;

    /* renamed from: u, reason: collision with root package name */
    public int f108874u;

    /* renamed from: v, reason: collision with root package name */
    public int f108875v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.z00 f108876w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f108877x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f108878y;

    /* renamed from: z, reason: collision with root package name */
    public final ey2.p2 f108879z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v8, types: [com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter$feedProgressListener$1] */
    public r10(com.tencent.mm.ui.MMActivity context, int i17, int i18, com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader loader) {
        super(context, i17, i18, loader);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(loader, "loader");
        this.f108865i = "Finder.FinderTopicFeedUIContract.TopicFeedPresenter";
        this.f108868o = "";
        r45.r03 r03Var = new r45.r03();
        com.tencent.mm.plugin.finder.view.ql qlVar = com.tencent.mm.plugin.finder.view.FinderTagView.f131494w;
        r03Var.set(1, -1L);
        this.f108870q = r03Var;
        this.f108876w = new com.tencent.mm.plugin.finder.feed.z00(null, 1, null);
        androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(c61.l7.class).a(ey2.p2.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        this.f108879z = (ey2.p2) a17;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.B = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedPostProgressEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter$feedProgressListener$1
            {
                this.__eventId = 1870727551;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedPostProgressEvent feedPostProgressEvent) {
                com.tencent.mm.autogen.events.FeedPostProgressEvent event = feedPostProgressEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.plugin.finder.feed.r10 r10Var = com.tencent.mm.plugin.finder.feed.r10.this;
                java.lang.String str = r10Var.f108865i;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feedProgressListener localId:");
                am.ga gaVar = event.f54250g;
                sb6.append(gaVar.f6749a);
                sb6.append(", progress:");
                sb6.append(gaVar.f6750b);
                com.tencent.mars.xlog.Log.i(str, sb6.toString());
                com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = r10Var.f107156e;
                kotlin.jvm.internal.o.e(baseFeedLoader, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader");
                ((com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader) baseFeedLoader).updateProgressByLocalId(gaVar.f6749a);
                return true;
            }
        };
        this.D = new com.tencent.mm.plugin.finder.feed.e10(this, context);
    }

    public final boolean A(r45.r03 tag) {
        kotlin.jvm.internal.o.g(tag, "tag");
        long j17 = tag.getLong(1);
        com.tencent.mm.plugin.finder.view.ql qlVar = com.tencent.mm.plugin.finder.view.FinderTagView.f131494w;
        return j17 == -1;
    }

    public final void B(yz5.a aVar) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.RecyclerView recyclerView2;
        com.tencent.mm.plugin.finder.feed.a1 a1Var = this.f107157f;
        if (a1Var != null && (recyclerView2 = a1Var.getRecyclerView()) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(recyclerView2, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter", "scrollToTop", "(Lkotlin/jvm/functions/Function0;)V", "Undefined", "scrollToPosition", "(I)V");
            recyclerView2.a1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(recyclerView2, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter", "scrollToTop", "(Lkotlin/jvm/functions/Function0;)V", "Undefined", "scrollToPosition", "(I)V");
        }
        com.tencent.mm.plugin.finder.feed.a1 a1Var2 = this.f107157f;
        if (a1Var2 == null || (recyclerView = a1Var2.getRecyclerView()) == null) {
            return;
        }
        recyclerView.post(new com.tencent.mm.plugin.finder.feed.q10(aVar));
    }

    public final void C(ym5.s3 reason) {
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout;
        android.view.View f213435x;
        android.widget.TextView textView;
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2;
        android.view.View f213435x2;
        android.widget.TextView textView2;
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout3;
        android.view.View f213435x3;
        android.widget.TextView textView3;
        android.widget.TextView textView4;
        kotlin.jvm.internal.o.g(reason, "reason");
        java.lang.Object obj = reason.f463520e;
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader.TopicResponse");
        com.tencent.mm.plugin.finder.feed.model.f9 f9Var = (com.tencent.mm.plugin.finder.feed.model.f9) obj;
        if (f9Var.getHasMore()) {
            com.tencent.mm.plugin.finder.feed.a1 a1Var = this.f107157f;
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout4 = a1Var != null ? a1Var.f106180m : null;
            if (refreshLoadMoreLayout4 == null) {
                return;
            }
            refreshLoadMoreLayout4.setEnableLoadMore(true);
            return;
        }
        if (this.f108866m != 7) {
            com.tencent.mm.plugin.finder.feed.a1 a1Var2 = this.f107157f;
            if (a1Var2 != null && (refreshLoadMoreLayout2 = a1Var2.f106180m) != null && (f213435x2 = refreshLoadMoreLayout2.getF213435x()) != null && (textView2 = (android.widget.TextView) f213435x2.findViewById(com.tencent.mm.R.id.ili)) != null) {
                textView2.setText(com.tencent.mm.R.string.f491896el3);
            }
            com.tencent.mm.plugin.finder.feed.a1 a1Var3 = this.f107157f;
            if (a1Var3 == null || (refreshLoadMoreLayout = a1Var3.f106180m) == null || (f213435x = refreshLoadMoreLayout.getF213435x()) == null || (textView = (android.widget.TextView) f213435x.findViewById(com.tencent.mm.R.id.ili)) == null) {
                return;
            }
            textView.setTextColor(this.f107155d.getResources().getColor(com.tencent.mm.R.color.FG_2));
            return;
        }
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f107156e;
        int size = baseFeedLoader.getSize();
        java.lang.String str = "setNoMoreForActivity :" + reason + " response:" + f9Var.f107862b + " size:" + baseFeedLoader.getDataList().size() + " size11: " + size;
        java.lang.String str2 = this.f108865i;
        com.tencent.mars.xlog.Log.i(str2, str);
        com.tencent.mm.plugin.finder.feed.a1 a1Var4 = this.f107157f;
        if (a1Var4 == null || (refreshLoadMoreLayout3 = a1Var4.f106180m) == null || (f213435x3 = refreshLoadMoreLayout3.getF213435x()) == null) {
            return;
        }
        android.content.Context context = f213435x3.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        boolean a27 = ((com.tencent.mm.plugin.finder.activity.uic.o) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.activity.uic.o.class)).a2();
        com.tencent.mm.plugin.finder.feed.a1 a1Var5 = this.f107157f;
        com.tencent.mm.plugin.finder.feed.x10 x10Var = a1Var5 instanceof com.tencent.mm.plugin.finder.feed.x10 ? (com.tencent.mm.plugin.finder.feed.x10) a1Var5 : null;
        android.view.View view = x10Var != null ? x10Var.M : null;
        com.tencent.mars.xlog.Log.i(str2, "setNoMoreForActivity size:" + size);
        if (size <= 0) {
            android.view.View view2 = view;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(f213435x3, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter", "setNoMoreForActivity", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$TopicResponse;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f213435x3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(f213435x3, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter", "setNoMoreForActivity", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$TopicResponse;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter", "setNoMoreForActivity", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$TopicResponse;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter", "setNoMoreForActivity", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$TopicResponse;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById = view2 != null ? view2.findViewById(com.tencent.mm.R.id.dft) : null;
            if (findViewById != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                android.view.View view3 = findViewById;
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter", "setNoMoreForActivity", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$TopicResponse;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter", "setNoMoreForActivity", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$TopicResponse;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById2 = view2 != null ? view2.findViewById(com.tencent.mm.R.id.m2g) : null;
            if (findViewById2 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                android.view.View view4 = findViewById2;
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter", "setNoMoreForActivity", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$TopicResponse;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter", "setNoMoreForActivity", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$TopicResponse;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById3 = view2 != null ? view2.findViewById(com.tencent.mm.R.id.lbi) : null;
            if (findViewById3 != null) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                android.view.View view5 = findViewById3;
                yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter", "setNoMoreForActivity", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$TopicResponse;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter", "setNoMoreForActivity", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$TopicResponse;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (a27) {
                if (view2 == null || (textView4 = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.dft)) == null) {
                    return;
                }
                textView4.setTextColor(f213435x3.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3));
                return;
            }
            if (view2 == null || (textView3 = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.dft)) == null) {
                return;
            }
            textView3.setTextColor(f213435x3.getResources().getColor(com.tencent.mm.R.color.FG_2));
            return;
        }
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList6.add(0);
        java.util.Collections.reverse(arrayList6);
        android.view.View view6 = view;
        yj0.a.d(f213435x3, arrayList6.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter", "setNoMoreForActivity", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$TopicResponse;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        f213435x3.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(f213435x3, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter", "setNoMoreForActivity", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$TopicResponse;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById4 = f213435x3.findViewById(com.tencent.mm.R.id.ili);
        if (findViewById4 != null) {
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(findViewById4, arrayList7.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter", "setNoMoreForActivity", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$TopicResponse;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter", "setNoMoreForActivity", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$TopicResponse;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById5 = f213435x3.findViewById(com.tencent.mm.R.id.ilg);
        if (findViewById5 != null) {
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(0);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(findViewById5, arrayList8.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter", "setNoMoreForActivity", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$TopicResponse;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById5.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(findViewById5, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter", "setNoMoreForActivity", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$TopicResponse;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (view6 != null) {
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            arrayList9.add(8);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(view6, arrayList9.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter", "setNoMoreForActivity", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$TopicResponse;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter", "setNoMoreForActivity", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$TopicResponse;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (a27) {
            int color = f213435x3.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3);
            android.view.View findViewById6 = f213435x3.findViewById(com.tencent.mm.R.id.bdv);
            if (findViewById6 != null) {
                findViewById6.setBackground(f213435x3.getResources().getDrawable(com.tencent.mm.R.drawable.f481637yr));
            }
            android.view.View findViewById7 = f213435x3.findViewById(com.tencent.mm.R.id.i0a);
            if (findViewById7 != null) {
                findViewById7.setBackgroundColor(color);
            }
            android.view.View findViewById8 = f213435x3.findViewById(com.tencent.mm.R.id.m3v);
            if (findViewById8 != null) {
                findViewById8.setBackgroundColor(color);
                return;
            }
            return;
        }
        int color2 = f213435x3.getResources().getColor(com.tencent.mm.R.color.FG_2);
        android.view.View findViewById9 = f213435x3.findViewById(com.tencent.mm.R.id.bdv);
        if (findViewById9 != null) {
            findViewById9.setBackground(f213435x3.getResources().getDrawable(com.tencent.mm.R.drawable.f481639yt));
        }
        android.view.View findViewById10 = f213435x3.findViewById(com.tencent.mm.R.id.i0a);
        if (findViewById10 != null) {
            findViewById10.setBackgroundColor(color2);
        }
        android.view.View findViewById11 = f213435x3.findViewById(com.tencent.mm.R.id.m3v);
        if (findViewById11 != null) {
            findViewById11.setBackgroundColor(color2);
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.k0
    public in5.s c() {
        int i17 = this.f108866m;
        if (i17 == 7) {
            return new in5.s() { // from class: com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter$buildCampaignConvert$1
                @Override // in5.s
                public in5.r getItemConvert(int type) {
                    if (type == -5) {
                        return new com.tencent.mm.plugin.finder.convert.xh();
                    }
                    if (type == -3) {
                        return new com.tencent.mm.plugin.finder.convert.ik();
                    }
                    if (type != 2) {
                        if (type != 4 && type != 9) {
                            if (type != 3001) {
                                if (type != 3002) {
                                    return new com.tencent.mm.plugin.finder.convert.z2();
                                }
                            }
                        }
                        com.tencent.mm.plugin.finder.convert.zk zkVar = new com.tencent.mm.plugin.finder.convert.zk(0, null, null, null, 15, null);
                        zkVar.f103069o = com.tencent.mm.plugin.finder.feed.r10.this.f108876w;
                        return zkVar;
                    }
                    com.tencent.mm.plugin.finder.convert.eh ehVar = new com.tencent.mm.plugin.finder.convert.eh(0, null, null, null, 15, null);
                    ehVar.f103069o = com.tencent.mm.plugin.finder.feed.r10.this.f108876w;
                    return ehVar;
                }
            };
        }
        if (i17 == 15 || i17 == 18) {
            final boolean z17 = i17 == 15;
            final java.util.List i18 = i17 == 15 ? kz5.c0.i(com.tencent.mm.plugin.finder.convert.ys.f105037f, com.tencent.mm.plugin.finder.convert.ys.f105036e, com.tencent.mm.plugin.finder.convert.ys.f105035d) : kz5.c0.i(com.tencent.mm.plugin.finder.convert.ys.f105039h, com.tencent.mm.plugin.finder.convert.ys.f105036e, com.tencent.mm.plugin.finder.convert.ys.f105035d, com.tencent.mm.plugin.finder.convert.ys.f105040i);
            return new in5.s() { // from class: com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter$buildMusicConvert$1
                /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
                
                    if (r3.f111024u == true) goto L24;
                 */
                @Override // in5.s
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public in5.r getItemConvert(int r7) {
                    /*
                        r6 = this;
                        r0 = 2
                        if (r7 == r0) goto L18
                        r1 = 4
                        if (r7 == r1) goto L18
                        r1 = 9
                        if (r7 == r1) goto L18
                        r1 = 3001(0xbb9, float:4.205E-42)
                        if (r7 == r1) goto L18
                        r1 = 3002(0xbba, float:4.207E-42)
                        if (r7 == r1) goto L18
                        com.tencent.mm.plugin.finder.convert.z2 r7 = new com.tencent.mm.plugin.finder.convert.z2
                        r7.<init>()
                        return r7
                    L18:
                        com.tencent.mm.plugin.finder.convert.dt r7 = new com.tencent.mm.plugin.finder.convert.dt
                        java.util.List<com.tencent.mm.plugin.finder.convert.ys> r1 = r1
                        boolean r2 = r2
                        com.tencent.mm.plugin.finder.feed.r10 r3 = r3
                        com.tencent.mm.plugin.finder.feed.a1 r3 = r3.f107157f
                        boolean r4 = r3 instanceof com.tencent.mm.plugin.finder.feed.x10
                        if (r4 == 0) goto L29
                        com.tencent.mm.plugin.finder.feed.x10 r3 = (com.tencent.mm.plugin.finder.feed.x10) r3
                        goto L2a
                    L29:
                        r3 = 0
                    L2a:
                        r4 = 0
                        if (r3 == 0) goto L33
                        r5 = 1
                        boolean r3 = r3.f111024u
                        if (r3 != r5) goto L33
                        goto L34
                    L33:
                        r5 = r4
                    L34:
                        if (r5 == 0) goto L37
                        r0 = 3
                    L37:
                        r7.<init>(r4, r1, r2, r0)
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter$buildMusicConvert$1.getItemConvert(int):in5.r");
                }
            };
        }
        final com.tencent.mm.plugin.finder.feed.g10 g10Var = new com.tencent.mm.plugin.finder.feed.g10(this);
        final com.tencent.mm.plugin.finder.feed.i10 i10Var = new com.tencent.mm.plugin.finder.feed.i10(this);
        return new in5.s() { // from class: com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter$buildItemCoverts$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return new com.tencent.mm.plugin.finder.storage.f80(com.tencent.mm.plugin.finder.feed.r10.this.f107155d, null, 0, null, 14, null).g(type, g10Var, i10Var);
            }
        };
    }

    @Override // com.tencent.mm.plugin.finder.feed.k0
    public ym5.q1 f() {
        return this.D;
    }

    @Override // com.tencent.mm.plugin.finder.feed.k0
    public void g() {
        com.tencent.mm.plugin.finder.feed.a1 a1Var = this.f107157f;
        if (a1Var != null) {
            a1Var.r(this.f107156e.getDataListJustForAdapter());
        }
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderTagClickEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderTagClickEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter$initViewCallback$1
            {
                this.__eventId = 1775861366;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderTagClickEvent finderTagClickEvent) {
                com.tencent.mm.autogen.events.FinderTagClickEvent event = finderTagClickEvent;
                kotlin.jvm.internal.o.g(event, "event");
                pm0.v.X(new com.tencent.mm.plugin.finder.feed.m10(event, com.tencent.mm.plugin.finder.feed.r10.this));
                return true;
            }
        };
        this.f108877x = iListener;
        iListener.alive();
    }

    @Override // com.tencent.mm.plugin.finder.feed.k0
    public void i() {
        boolean A = A(this.f108870q);
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f107156e;
        if (A) {
            kotlin.jvm.internal.o.e(baseFeedLoader, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader");
            int i17 = this.f108869p;
            int i18 = com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader.B;
            ((com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader) baseFeedLoader).d(i17, null);
            return;
        }
        r45.xn5 xn5Var = new r45.xn5();
        xn5Var.set(0, new java.util.LinkedList());
        xn5Var.getList(0).add(this.f108870q);
        kotlin.jvm.internal.o.e(baseFeedLoader, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader");
        ((com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader) baseFeedLoader).d(this.f108869p, xn5Var);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k0
    public void m(com.tencent.mm.plugin.finder.feed.a1 callback) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        kotlin.jvm.internal.o.g(callback, "callback");
        super.m(callback);
        alive();
        com.tencent.mm.plugin.finder.feed.a1 a1Var = this.f107157f;
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f107156e;
        if (a1Var != null) {
            byte[] byteArrayExtra = a1Var.getActivity().getIntent().getByteArrayExtra("key_topic_poi_location");
            if (byteArrayExtra != null) {
                r45.ze2 ze2Var = new r45.ze2();
                ze2Var.parseFrom(byteArrayExtra);
                kotlin.jvm.internal.o.e(baseFeedLoader, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader");
                ((com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader) baseFeedLoader).f107674m = ze2Var;
            }
            long longExtra = a1Var.getActivity().getIntent().getLongExtra("key_ref_object_id", 0L);
            if (this.f108866m != 7) {
                kotlin.jvm.internal.o.e(baseFeedLoader, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader");
                ((com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader) baseFeedLoader).f107675n = java.lang.Long.valueOf(longExtra);
            }
            if (this.f108866m == 4) {
                a1Var.f106180m.getRecyclerView().i(new com.tencent.mm.plugin.finder.feed.n10(this, a1Var));
            }
            if (this.f108866m == 7) {
                final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
                com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ActivityFeedRemoveEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ActivityFeedRemoveEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter$onAttach$1$3
                    {
                        this.__eventId = -478908231;
                    }

                    @Override // com.tencent.mm.sdk.event.IListener
                    public boolean callback(com.tencent.mm.autogen.events.ActivityFeedRemoveEvent activityFeedRemoveEvent) {
                        com.tencent.mm.autogen.events.ActivityFeedRemoveEvent event = activityFeedRemoveEvent;
                        kotlin.jvm.internal.o.g(event, "event");
                        pm0.v.X(new com.tencent.mm.plugin.finder.feed.o10(event, com.tencent.mm.plugin.finder.feed.r10.this));
                        return false;
                    }
                };
                this.f108878y = iListener;
                iListener.alive();
            }
        }
        kotlin.jvm.internal.o.e(baseFeedLoader, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader");
        ((com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader) baseFeedLoader).A = new com.tencent.mm.plugin.finder.feed.p10(this);
        com.tencent.mm.plugin.finder.feed.a1 a1Var2 = this.f107157f;
        if (a1Var2 != null && (recyclerView = a1Var2.getRecyclerView()) != null) {
            gp2.v0 v0Var = (gp2.v0) ((ws5.e) pf5.u.f353936a.e(ws5.g.class).c(ws5.e.class));
            com.tencent.mm.ui.MMActivity mMActivity = this.f107155d;
            v0Var.N6(mMActivity);
            com.tencent.mm.plugin.finder.feed.a1 a1Var3 = this.f107157f;
            if (a1Var3 instanceof com.tencent.mm.plugin.finder.feed.x10) {
            }
            ws5.g gVar = (ws5.g) i95.n0.c(ws5.g.class);
            java.util.List dataListJustForAdapter = baseFeedLoader.getDataListJustForAdapter();
            com.tencent.mm.plugin.finder.feed.a1 a1Var4 = this.f107157f;
            kotlin.jvm.internal.o.d(a1Var4);
            c50.m0 Ai = ((wo2.k) gVar).Ai(mMActivity, recyclerView, dataListJustForAdapter, a1Var4.o());
            this.C = Ai;
            if (Ai != null) {
                ((gp2.l0) Ai).e(null);
            }
        }
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestInit$default(baseFeedLoader, false, 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x014e, code lost:
    
        if (r5 == null) goto L38;
     */
    @Override // com.tencent.mm.plugin.finder.feed.k0, fs2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDetach() {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.r10.onDetach():void");
    }

    @Override // com.tencent.mm.plugin.finder.feed.k0
    public void q() {
        c50.m0 m0Var = this.C;
        if (m0Var != null) {
            c50.m0.c(m0Var, null, 1, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.k0
    public void s() {
        com.tencent.mm.plugin.finder.feed.a1 a1Var = this.f107157f;
        com.tencent.mm.plugin.finder.feed.x10 x10Var = a1Var instanceof com.tencent.mm.plugin.finder.feed.x10 ? (com.tencent.mm.plugin.finder.feed.x10) a1Var : null;
        android.view.KeyEvent.Callback callback = x10Var != null ? x10Var.f111027x : null;
        uo2.k0 k0Var = callback instanceof uo2.k0 ? (uo2.k0) callback : null;
        if (k0Var != null) {
            com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView finderFollowTopicHeaderView = (com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView) k0Var;
            if (finderFollowTopicHeaderView.I == null) {
                android.content.Context context = finderFollowTopicHeaderView.getContext();
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                kotlinx.coroutines.l.d(((com.tencent.mm.ui.MMActivity) context).getLifecycleAsyncScope(), null, null, new uo2.o(null), 3, null);
            }
            sr2.l5 l5Var = finderFollowTopicHeaderView.f121423J;
            if (l5Var != null) {
                l5Var.onResume();
            }
        }
        c50.m0 m0Var = this.C;
        if (m0Var != null) {
            ((gp2.l0) m0Var).g();
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.k0
    public void v() {
        boolean A = A(this.f108870q);
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f107156e;
        if (A) {
            kotlin.jvm.internal.o.e(baseFeedLoader, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader");
            int i17 = this.f108869p;
            int i18 = com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader.B;
            ((com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader) baseFeedLoader).e(i17, null, -1);
            return;
        }
        r45.xn5 xn5Var = new r45.xn5();
        xn5Var.set(0, new java.util.LinkedList());
        xn5Var.getList(0).add(this.f108870q);
        kotlin.jvm.internal.o.e(baseFeedLoader, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader");
        ((com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader) baseFeedLoader).e(this.f108869p, xn5Var, 4);
    }

    public final java.lang.String y() {
        r45.mb4 mb4Var;
        java.util.List<E> listOfType = this.f107156e.getListOfType(com.tencent.mm.plugin.finder.model.BaseFinderFeed.class);
        if (!(!listOfType.isEmpty()) || (mb4Var = (r45.mb4) kz5.n0.a0(((com.tencent.mm.plugin.finder.model.BaseFinderFeed) listOfType.get(0)).getFeedObject().getMediaList(), 0)) == null) {
            return "";
        }
        return mb4Var.getString(1) + mb4Var.getString(19);
    }

    public final r45.xn5 z() {
        if (A(this.f108870q)) {
            return null;
        }
        r45.xn5 xn5Var = new r45.xn5();
        xn5Var.set(0, new java.util.LinkedList());
        xn5Var.getList(0).add(this.f108870q);
        return xn5Var;
    }
}
