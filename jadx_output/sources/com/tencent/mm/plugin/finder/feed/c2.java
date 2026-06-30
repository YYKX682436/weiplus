package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class c2 extends com.tencent.mm.plugin.finder.feed.e1 {

    /* renamed from: i, reason: collision with root package name */
    public int f106445i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f106446m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.z00 f106447n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f106448o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(com.tencent.mm.ui.MMActivity context, int i17, int i18, ir2.a1 loader) {
        super(context, i17, i18, loader);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(loader, "loader");
        this.f106446m = "";
        com.tencent.mm.plugin.finder.feed.z00 z00Var = new com.tencent.mm.plugin.finder.feed.z00(null, 1, null);
        z00Var.f111220a = (r45.r03) ((com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC.class)).f452711w;
        this.f106447n = z00Var;
    }

    public static final void c(com.tencent.mm.plugin.finder.feed.c2 c2Var, ir2.a aVar) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        c2Var.getClass();
        if (aVar.f294087i != 0) {
            com.tencent.mm.plugin.finder.feed.s1 s1Var = c2Var.f106614f;
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = s1Var != null ? s1Var.f108963g : null;
            if (refreshLoadMoreLayout == null) {
                return;
            }
            refreshLoadMoreLayout.setEnableLoadMore(true);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setNoMoreForActivity: size:");
        ir2.a1 a1Var = c2Var.f106613e;
        sb6.append(((java.util.ArrayList) a1Var.f294091d).size());
        sb6.append(" size: ");
        sb6.append(aVar.f294129a.size());
        com.tencent.mars.xlog.Log.i("Finder.FinderCampaginFeedUIContract.TopicFeedPresenter", sb6.toString());
        com.tencent.mm.plugin.finder.feed.s1 s1Var2 = c2Var.f106614f;
        com.tencent.mm.plugin.finder.feed.h2 h2Var = s1Var2 instanceof com.tencent.mm.plugin.finder.feed.h2 ? (com.tencent.mm.plugin.finder.feed.h2) s1Var2 : null;
        if (h2Var != null) {
            int size = ((java.util.ArrayList) a1Var.f294091d).size();
            android.view.View f213435x = h2Var.f108963g.getF213435x();
            if (f213435x != null) {
                android.content.Context context = f213435x.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                boolean a27 = ((com.tencent.mm.plugin.finder.activity.uic.o) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.activity.uic.o.class)).a2();
                android.view.View view = h2Var.f106884s;
                com.tencent.mars.xlog.Log.i("Finder.FinderTopicFeedUIContract.TopicFeedViewCallback", "setNoMoreForActivity size:" + size);
                if (size <= 0) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(f213435x, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback", "setNoMoreForActivity", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    f213435x.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(f213435x, "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback", "setNoMoreForActivity", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    if (view != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(0);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback", "setNoMoreForActivity", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback", "setNoMoreForActivity", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View findViewById = view != null ? view.findViewById(com.tencent.mm.R.id.dft) : null;
                    if (findViewById != null) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(0);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback", "setNoMoreForActivity", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback", "setNoMoreForActivity", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View findViewById2 = view != null ? view.findViewById(com.tencent.mm.R.id.m2g) : null;
                    if (findViewById2 != null) {
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        arrayList4.add(8);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback", "setNoMoreForActivity", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback", "setNoMoreForActivity", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View findViewById3 = view != null ? view.findViewById(com.tencent.mm.R.id.lbi) : null;
                    if (findViewById3 != null) {
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        arrayList5.add(8);
                        java.util.Collections.reverse(arrayList5);
                        yj0.a.d(findViewById3, arrayList5.toArray(), "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback", "setNoMoreForActivity", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                        yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback", "setNoMoreForActivity", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    if (a27) {
                        if (view == null || (textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.dft)) == null) {
                            return;
                        }
                        textView2.setTextColor(f213435x.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3));
                        return;
                    }
                    if (view == null || (textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.dft)) == null) {
                        return;
                    }
                    textView.setTextColor(f213435x.getResources().getColor(com.tencent.mm.R.color.FG_2));
                    return;
                }
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList6.add(0);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(f213435x, arrayList6.toArray(), "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback", "setNoMoreForActivity", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                f213435x.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(f213435x, "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback", "setNoMoreForActivity", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View findViewById4 = f213435x.findViewById(com.tencent.mm.R.id.ili);
                if (findViewById4 != null) {
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    arrayList7.add(8);
                    java.util.Collections.reverse(arrayList7);
                    yj0.a.d(findViewById4, arrayList7.toArray(), "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback", "setNoMoreForActivity", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById4.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                    yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback", "setNoMoreForActivity", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View findViewById5 = f213435x.findViewById(com.tencent.mm.R.id.ilg);
                if (findViewById5 != null) {
                    java.util.ArrayList arrayList8 = new java.util.ArrayList();
                    arrayList8.add(0);
                    java.util.Collections.reverse(arrayList8);
                    yj0.a.d(findViewById5, arrayList8.toArray(), "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback", "setNoMoreForActivity", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById5.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                    yj0.a.f(findViewById5, "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback", "setNoMoreForActivity", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (view != null) {
                    java.util.ArrayList arrayList9 = new java.util.ArrayList();
                    arrayList9.add(8);
                    java.util.Collections.reverse(arrayList9);
                    yj0.a.d(view, arrayList9.toArray(), "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback", "setNoMoreForActivity", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback", "setNoMoreForActivity", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (a27) {
                    int color = f213435x.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3);
                    android.view.View findViewById6 = f213435x.findViewById(com.tencent.mm.R.id.bdv);
                    if (findViewById6 != null) {
                        findViewById6.setBackground(f213435x.getResources().getDrawable(com.tencent.mm.R.drawable.f481637yr));
                    }
                    android.view.View findViewById7 = f213435x.findViewById(com.tencent.mm.R.id.i0a);
                    if (findViewById7 != null) {
                        findViewById7.setBackgroundColor(color);
                    }
                    android.view.View findViewById8 = f213435x.findViewById(com.tencent.mm.R.id.m3v);
                    if (findViewById8 != null) {
                        findViewById8.setBackgroundColor(color);
                        return;
                    }
                    return;
                }
                int color2 = f213435x.getResources().getColor(com.tencent.mm.R.color.FG_2);
                android.view.View findViewById9 = f213435x.findViewById(com.tencent.mm.R.id.bdv);
                if (findViewById9 != null) {
                    findViewById9.setBackground(f213435x.getResources().getDrawable(com.tencent.mm.R.drawable.f481639yt));
                }
                android.view.View findViewById10 = f213435x.findViewById(com.tencent.mm.R.id.i0a);
                if (findViewById10 != null) {
                    findViewById10.setBackgroundColor(color2);
                }
                android.view.View findViewById11 = f213435x.findViewById(com.tencent.mm.R.id.m3v);
                if (findViewById11 != null) {
                    findViewById11.setBackgroundColor(color2);
                }
            }
        }
    }

    @Override // fs2.a
    public void onDetach() {
        this.f106613e.f294098n = null;
        com.tencent.mm.sdk.event.IListener iListener = this.f106448o;
        if (iListener != null) {
            iListener.dead();
        }
    }
}
