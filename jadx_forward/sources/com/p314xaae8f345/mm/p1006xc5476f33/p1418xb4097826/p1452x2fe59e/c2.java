package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class c2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.e1 {

    /* renamed from: i, reason: collision with root package name */
    public int f187978i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f187979m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.z00 f187980n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f187981o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, int i17, int i18, ir2.a1 loader) {
        super(context, i17, i18, loader);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loader, "loader");
        this.f187979m = "";
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.z00 z00Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.z00(null, 1, null);
        z00Var.f192753a = (r45.r03) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13669xe2583a4f) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13669xe2583a4f.class)).f534244w;
        this.f187980n = z00Var;
    }

    public static final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c2 c2Var, ir2.a aVar) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        c2Var.getClass();
        if (aVar.f375620i != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.s1 s1Var = c2Var.f188147f;
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = s1Var != null ? s1Var.f190496g : null;
            if (c22801x87cbdc00 == null) {
                return;
            }
            c22801x87cbdc00.m82688x390c1d00(true);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setNoMoreForActivity: size:");
        ir2.a1 a1Var = c2Var.f188146e;
        sb6.append(((java.util.ArrayList) a1Var.f375624d).size());
        sb6.append(" size: ");
        sb6.append(aVar.f375662a.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCampaginFeedUIContract.TopicFeedPresenter", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.s1 s1Var2 = c2Var.f188147f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.h2 h2Var = s1Var2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.h2 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.h2) s1Var2 : null;
        if (h2Var != null) {
            int size = ((java.util.ArrayList) a1Var.f375624d).size();
            android.view.View f294968x = h2Var.f190496g.getF294968x();
            if (f294968x != null) {
                android.content.Context context = f294968x.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                pf5.z zVar = pf5.z.f435481a;
                if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                boolean a27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.o) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.o.class)).a2();
                android.view.View view = h2Var.f188417s;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTopicFeedUIContract.TopicFeedViewCallback", "setNoMoreForActivity size:" + size);
                if (size <= 0) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(f294968x, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback", "setNoMoreForActivity", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    f294968x.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(f294968x, "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback", "setNoMoreForActivity", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    if (view != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(0);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback", "setNoMoreForActivity", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback", "setNoMoreForActivity", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View findViewById = view != null ? view.findViewById(com.p314xaae8f345.mm.R.id.dft) : null;
                    if (findViewById != null) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(0);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback", "setNoMoreForActivity", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback", "setNoMoreForActivity", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View findViewById2 = view != null ? view.findViewById(com.p314xaae8f345.mm.R.id.m2g) : null;
                    if (findViewById2 != null) {
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        arrayList4.add(8);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback", "setNoMoreForActivity", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback", "setNoMoreForActivity", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View findViewById3 = view != null ? view.findViewById(com.p314xaae8f345.mm.R.id.lbi) : null;
                    if (findViewById3 != null) {
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        arrayList5.add(8);
                        java.util.Collections.reverse(arrayList5);
                        yj0.a.d(findViewById3, arrayList5.toArray(), "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback", "setNoMoreForActivity", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                        yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback", "setNoMoreForActivity", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    if (a27) {
                        if (view == null || (textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.dft)) == null) {
                            return;
                        }
                        textView2.setTextColor(f294968x.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b));
                        return;
                    }
                    if (view == null || (textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.dft)) == null) {
                        return;
                    }
                    textView.setTextColor(f294968x.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
                    return;
                }
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList6.add(0);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(f294968x, arrayList6.toArray(), "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback", "setNoMoreForActivity", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                f294968x.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(f294968x, "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback", "setNoMoreForActivity", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View findViewById4 = f294968x.findViewById(com.p314xaae8f345.mm.R.id.ili);
                if (findViewById4 != null) {
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    arrayList7.add(8);
                    java.util.Collections.reverse(arrayList7);
                    yj0.a.d(findViewById4, arrayList7.toArray(), "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback", "setNoMoreForActivity", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById4.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                    yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback", "setNoMoreForActivity", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View findViewById5 = f294968x.findViewById(com.p314xaae8f345.mm.R.id.ilg);
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
                    int color = f294968x.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b);
                    android.view.View findViewById6 = f294968x.findViewById(com.p314xaae8f345.mm.R.id.bdv);
                    if (findViewById6 != null) {
                        findViewById6.setBackground(f294968x.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563170yr));
                    }
                    android.view.View findViewById7 = f294968x.findViewById(com.p314xaae8f345.mm.R.id.i0a);
                    if (findViewById7 != null) {
                        findViewById7.setBackgroundColor(color);
                    }
                    android.view.View findViewById8 = f294968x.findViewById(com.p314xaae8f345.mm.R.id.m3v);
                    if (findViewById8 != null) {
                        findViewById8.setBackgroundColor(color);
                        return;
                    }
                    return;
                }
                int color2 = f294968x.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834);
                android.view.View findViewById9 = f294968x.findViewById(com.p314xaae8f345.mm.R.id.bdv);
                if (findViewById9 != null) {
                    findViewById9.setBackground(f294968x.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563172yt));
                }
                android.view.View findViewById10 = f294968x.findViewById(com.p314xaae8f345.mm.R.id.i0a);
                if (findViewById10 != null) {
                    findViewById10.setBackgroundColor(color2);
                }
                android.view.View findViewById11 = f294968x.findViewById(com.p314xaae8f345.mm.R.id.m3v);
                if (findViewById11 != null) {
                    findViewById11.setBackgroundColor(color2);
                }
            }
        }
    }

    @Override // fs2.a
    /* renamed from: onDetach */
    public void mo979x3f5eee52() {
        this.f188146e.f375631n = null;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f187981o;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48814x2efc64();
        }
    }
}
