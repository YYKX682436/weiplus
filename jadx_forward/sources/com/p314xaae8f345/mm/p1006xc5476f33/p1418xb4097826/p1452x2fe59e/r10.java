package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public class r10 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k0 {
    public int A;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13812x6b06ca5e B;
    public c50.m0 C;
    public final ym5.q1 D;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f190398i;

    /* renamed from: m, reason: collision with root package name */
    public int f190399m;

    /* renamed from: n, reason: collision with root package name */
    public long f190400n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f190401o;

    /* renamed from: p, reason: collision with root package name */
    public int f190402p;

    /* renamed from: q, reason: collision with root package name */
    public r45.r03 f190403q;

    /* renamed from: r, reason: collision with root package name */
    public long f190404r;

    /* renamed from: s, reason: collision with root package name */
    public r45.zi2 f190405s;

    /* renamed from: t, reason: collision with root package name */
    public r45.o03 f190406t;

    /* renamed from: u, reason: collision with root package name */
    public int f190407u;

    /* renamed from: v, reason: collision with root package name */
    public int f190408v;

    /* renamed from: w, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.z00 f190409w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f190410x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f190411y;

    /* renamed from: z, reason: collision with root package name */
    public final ey2.p2 f190412z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v8, types: [com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter$feedProgressListener$1] */
    public r10(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 loader) {
        super(context, i17, i18, loader);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loader, "loader");
        this.f190398i = "Finder.FinderTopicFeedUIContract.TopicFeedPresenter";
        this.f190401o = "";
        r45.r03 r03Var = new r45.r03();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ql qlVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15352x8ed10a39.f213027w;
        r03Var.set(1, -1L);
        this.f190403q = r03Var;
        this.f190409w = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.z00(null, 1, null);
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.u.f435469a.e(c61.l7.class).a(ey2.p2.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        this.f190412z = (ey2.p2) a17;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.B = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter$feedProgressListener$1
            {
                this.f39173x3fe91575 = 1870727551;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f c5442xd807898f) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f event = c5442xd807898f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r10 r10Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r10.this;
                java.lang.String str = r10Var.f190398i;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feedProgressListener localId:");
                am.ga gaVar = event.f135783g;
                sb6.append(gaVar.f88282a);
                sb6.append(", progress:");
                sb6.append(gaVar.f88283b);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = r10Var.f188689e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(abstractC13919x46aff122, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28) abstractC13919x46aff122).m56136x5a0b1819(gaVar.f88282a);
                return true;
            }
        };
        this.D = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.e10(this, context);
    }

    public final boolean A(r45.r03 tag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        long m75942xfb822ef2 = tag.m75942xfb822ef2(1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ql qlVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15352x8ed10a39.f213027w;
        return m75942xfb822ef2 == -1;
    }

    public final void B(yz5.a aVar) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56022x4905e9fa;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56022x4905e9fa2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var = this.f188690f;
        if (a1Var != null && (m56022x4905e9fa2 = a1Var.m56022x4905e9fa()) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(m56022x4905e9fa2, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter", "scrollToTop", "(Lkotlin/jvm/functions/Function0;)V", "Undefined", "scrollToPosition", "(I)V");
            m56022x4905e9fa2.a1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(m56022x4905e9fa2, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter", "scrollToTop", "(Lkotlin/jvm/functions/Function0;)V", "Undefined", "scrollToPosition", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var2 = this.f188690f;
        if (a1Var2 == null || (m56022x4905e9fa = a1Var2.m56022x4905e9fa()) == null) {
            return;
        }
        m56022x4905e9fa.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.q10(aVar));
    }

    public final void C(ym5.s3 reason) {
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00;
        android.view.View f294968x;
        android.widget.TextView textView;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc002;
        android.view.View f294968x2;
        android.widget.TextView textView2;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc003;
        android.view.View f294968x3;
        android.widget.TextView textView3;
        android.widget.TextView textView4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        java.lang.Object obj = reason.f545053e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader.TopicResponse");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.f9 f9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.f9) obj;
        if (f9Var.getHasMore()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var = this.f188690f;
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc004 = a1Var != null ? a1Var.f187713m : null;
            if (c22801x87cbdc004 == null) {
                return;
            }
            c22801x87cbdc004.m82688x390c1d00(true);
            return;
        }
        if (this.f190399m != 7) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var2 = this.f188690f;
            if (a1Var2 != null && (c22801x87cbdc002 = a1Var2.f187713m) != null && (f294968x2 = c22801x87cbdc002.getF294968x()) != null && (textView2 = (android.widget.TextView) f294968x2.findViewById(com.p314xaae8f345.mm.R.id.ili)) != null) {
                textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f573429el3);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var3 = this.f188690f;
            if (a1Var3 == null || (c22801x87cbdc00 = a1Var3.f187713m) == null || (f294968x = c22801x87cbdc00.getF294968x()) == null || (textView = (android.widget.TextView) f294968x.findViewById(com.p314xaae8f345.mm.R.id.ili)) == null) {
                return;
            }
            textView.setTextColor(this.f188688d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = this.f188689e;
        int m56393xfb854877 = abstractC13919x46aff122.m56393xfb854877();
        java.lang.String str = "setNoMoreForActivity :" + reason + " response:" + f9Var.f189395b + " size:" + abstractC13919x46aff122.m56387xe6796cde().size() + " size11: " + m56393xfb854877;
        java.lang.String str2 = this.f190398i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var4 = this.f188690f;
        if (a1Var4 == null || (c22801x87cbdc003 = a1Var4.f187713m) == null || (f294968x3 = c22801x87cbdc003.getF294968x()) == null) {
            return;
        }
        android.content.Context context = f294968x3.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        boolean a27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.o) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.o.class)).a2();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var5 = this.f188690f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x10 x10Var = a1Var5 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x10 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x10) a1Var5 : null;
        android.view.View view = x10Var != null ? x10Var.M : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "setNoMoreForActivity size:" + m56393xfb854877);
        if (m56393xfb854877 <= 0) {
            android.view.View view2 = view;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(f294968x3, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter", "setNoMoreForActivity", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$TopicResponse;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f294968x3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(f294968x3, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter", "setNoMoreForActivity", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$TopicResponse;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter", "setNoMoreForActivity", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$TopicResponse;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter", "setNoMoreForActivity", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$TopicResponse;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById = view2 != null ? view2.findViewById(com.p314xaae8f345.mm.R.id.dft) : null;
            if (findViewById != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                android.view.View view3 = findViewById;
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter", "setNoMoreForActivity", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$TopicResponse;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter", "setNoMoreForActivity", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$TopicResponse;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById2 = view2 != null ? view2.findViewById(com.p314xaae8f345.mm.R.id.m2g) : null;
            if (findViewById2 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                android.view.View view4 = findViewById2;
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter", "setNoMoreForActivity", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$TopicResponse;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter", "setNoMoreForActivity", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$TopicResponse;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById3 = view2 != null ? view2.findViewById(com.p314xaae8f345.mm.R.id.lbi) : null;
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
                if (view2 == null || (textView4 = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.dft)) == null) {
                    return;
                }
                textView4.setTextColor(f294968x3.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b));
                return;
            }
            if (view2 == null || (textView3 = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.dft)) == null) {
                return;
            }
            textView3.setTextColor(f294968x3.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
            return;
        }
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList6.add(0);
        java.util.Collections.reverse(arrayList6);
        android.view.View view6 = view;
        yj0.a.d(f294968x3, arrayList6.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter", "setNoMoreForActivity", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$TopicResponse;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        f294968x3.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(f294968x3, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter", "setNoMoreForActivity", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$TopicResponse;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById4 = f294968x3.findViewById(com.p314xaae8f345.mm.R.id.ili);
        if (findViewById4 != null) {
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(findViewById4, arrayList7.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter", "setNoMoreForActivity", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$TopicResponse;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter", "setNoMoreForActivity", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$TopicResponse;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById5 = f294968x3.findViewById(com.p314xaae8f345.mm.R.id.ilg);
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
            int color = f294968x3.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b);
            android.view.View findViewById6 = f294968x3.findViewById(com.p314xaae8f345.mm.R.id.bdv);
            if (findViewById6 != null) {
                findViewById6.setBackground(f294968x3.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563170yr));
            }
            android.view.View findViewById7 = f294968x3.findViewById(com.p314xaae8f345.mm.R.id.i0a);
            if (findViewById7 != null) {
                findViewById7.setBackgroundColor(color);
            }
            android.view.View findViewById8 = f294968x3.findViewById(com.p314xaae8f345.mm.R.id.m3v);
            if (findViewById8 != null) {
                findViewById8.setBackgroundColor(color);
                return;
            }
            return;
        }
        int color2 = f294968x3.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834);
        android.view.View findViewById9 = f294968x3.findViewById(com.p314xaae8f345.mm.R.id.bdv);
        if (findViewById9 != null) {
            findViewById9.setBackground(f294968x3.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563172yt));
        }
        android.view.View findViewById10 = f294968x3.findViewById(com.p314xaae8f345.mm.R.id.i0a);
        if (findViewById10 != null) {
            findViewById10.setBackgroundColor(color2);
        }
        android.view.View findViewById11 = f294968x3.findViewById(com.p314xaae8f345.mm.R.id.m3v);
        if (findViewById11 != null) {
            findViewById11.setBackgroundColor(color2);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k0
    public in5.s c() {
        int i17 = this.f190399m;
        if (i17 == 7) {
            return new in5.s() { // from class: com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter$buildCampaignConvert$1
                @Override // in5.s
                /* renamed from: getItemConvert */
                public in5.r mo43555xf2bb75ea(int type) {
                    if (type == -5) {
                        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.xh();
                    }
                    if (type == -3) {
                        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ik();
                    }
                    if (type != 2) {
                        if (type != 4 && type != 9) {
                            if (type != 3001) {
                                if (type != 3002) {
                                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z2();
                                }
                            }
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zk zkVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zk(0, null, null, null, 15, null);
                        zkVar.f184602o = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r10.this.f190409w;
                        return zkVar;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.eh ehVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.eh(0, null, null, null, 15, null);
                    ehVar.f184602o = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r10.this.f190409w;
                    return ehVar;
                }
            };
        }
        if (i17 == 15 || i17 == 18) {
            final boolean z17 = i17 == 15;
            final java.util.List i18 = i17 == 15 ? kz5.c0.i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ys.f186570f, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ys.f186569e, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ys.f186568d) : kz5.c0.i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ys.f186572h, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ys.f186569e, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ys.f186568d, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ys.f186573i);
            return new in5.s() { // from class: com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter$buildMusicConvert$1
                /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
                
                    if (r3.f192557u == true) goto L24;
                 */
                @Override // in5.s
                /* renamed from: getItemConvert */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public in5.r mo43555xf2bb75ea(int r7) {
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
                        com.tencent.mm.plugin.finder.feed.a1 r3 = r3.f188690f
                        boolean r4 = r3 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x10
                        if (r4 == 0) goto L29
                        com.tencent.mm.plugin.finder.feed.x10 r3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x10) r3
                        goto L2a
                    L29:
                        r3 = 0
                    L2a:
                        r4 = 0
                        if (r3 == 0) goto L33
                        r5 = 1
                        boolean r3 = r3.f192557u
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
                    throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13811xe0668a57.mo43555xf2bb75ea(int):in5.r");
                }
            };
        }
        final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g10 g10Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g10(this);
        final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i10 i10Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i10(this);
        return new in5.s() { // from class: com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter$buildItemCoverts$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.f80(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r10.this.f188688d, null, 0, null, 14, null).g(type, g10Var, i10Var);
            }
        };
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k0
    public ym5.q1 f() {
        return this.D;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k0
    public void g() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var = this.f188690f;
        if (a1Var != null) {
            a1Var.r(this.f188689e.m56388xcaeb60d0());
        }
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5539x720c286> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5539x720c286>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter$initViewCallback$1
            {
                this.f39173x3fe91575 = 1775861366;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5539x720c286 c5539x720c286) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5539x720c286 event = c5539x720c286;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.m10(event, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r10.this));
                return true;
            }
        };
        this.f190410x = abstractC20980x9b9ad01d;
        abstractC20980x9b9ad01d.mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k0
    public void i() {
        boolean A = A(this.f190403q);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = this.f188689e;
        if (A) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(abstractC13919x46aff122, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader");
            int i17 = this.f190402p;
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13918xdafe8cba.B;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13918xdafe8cba) abstractC13919x46aff122).d(i17, null);
            return;
        }
        r45.xn5 xn5Var = new r45.xn5();
        xn5Var.set(0, new java.util.LinkedList());
        xn5Var.m75941xfb821914(0).add(this.f190403q);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(abstractC13919x46aff122, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13918xdafe8cba) abstractC13919x46aff122).d(this.f190402p, xn5Var);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k0
    public void m(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 callback) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56022x4905e9fa;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        super.m(callback);
        mo48813x58998cd();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var = this.f188690f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = this.f188689e;
        if (a1Var != null) {
            byte[] byteArrayExtra = a1Var.mo978x19263085().getIntent().getByteArrayExtra("key_topic_poi_location");
            if (byteArrayExtra != null) {
                r45.ze2 ze2Var = new r45.ze2();
                ze2Var.mo11468x92b714fd(byteArrayExtra);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(abstractC13919x46aff122, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13918xdafe8cba) abstractC13919x46aff122).f189207m = ze2Var;
            }
            long longExtra = a1Var.mo978x19263085().getIntent().getLongExtra("key_ref_object_id", 0L);
            if (this.f190399m != 7) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(abstractC13919x46aff122, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13918xdafe8cba) abstractC13919x46aff122).f189208n = java.lang.Long.valueOf(longExtra);
            }
            if (this.f190399m == 4) {
                a1Var.f187713m.m82555x4905e9fa().i(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.n10(this, a1Var));
            }
            if (this.f190399m == 7) {
                final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
                com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5150x445b2cc9> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5150x445b2cc9>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter$onAttach$1$3
                    {
                        this.f39173x3fe91575 = -478908231;
                    }

                    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
                    /* renamed from: callback */
                    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5150x445b2cc9 c5150x445b2cc9) {
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5150x445b2cc9 event = c5150x445b2cc9;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.o10(event, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r10.this));
                        return false;
                    }
                };
                this.f190411y = abstractC20980x9b9ad01d;
                abstractC20980x9b9ad01d.mo48813x58998cd();
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(abstractC13919x46aff122, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13918xdafe8cba) abstractC13919x46aff122).A = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p10(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var2 = this.f188690f;
        if (a1Var2 != null && (m56022x4905e9fa = a1Var2.m56022x4905e9fa()) != null) {
            gp2.v0 v0Var = (gp2.v0) ((ws5.e) pf5.u.f435469a.e(ws5.g.class).c(ws5.e.class));
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f188688d;
            v0Var.N6(abstractActivityC21394xb3d2c0cf);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var3 = this.f188690f;
            if (a1Var3 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x10) {
            }
            ws5.g gVar = (ws5.g) i95.n0.c(ws5.g.class);
            java.util.List m56388xcaeb60d0 = abstractC13919x46aff122.m56388xcaeb60d0();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var4 = this.f188690f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a1Var4);
            c50.m0 Ai = ((wo2.k) gVar).Ai(abstractActivityC21394xb3d2c0cf, m56022x4905e9fa, m56388xcaeb60d0, a1Var4.o());
            this.C = Ai;
            if (Ai != null) {
                ((gp2.l0) Ai).e(null);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122.m56345x587162dc(abstractC13919x46aff122, false, 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x014e, code lost:
    
        if (r5 == null) goto L38;
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k0, fs2.a
    /* renamed from: onDetach */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo979x3f5eee52() {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r10.mo979x3f5eee52():void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k0
    public void q() {
        c50.m0 m0Var = this.C;
        if (m0Var != null) {
            c50.m0.c(m0Var, null, 1, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k0
    public void s() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var = this.f188690f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x10 x10Var = a1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x10 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x10) a1Var : null;
        android.view.KeyEvent.Callback callback = x10Var != null ? x10Var.f192560x : null;
        uo2.k0 k0Var = callback instanceof uo2.k0 ? (uo2.k0) callback : null;
        if (k0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14492xad25b4ca c14492xad25b4ca = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14492xad25b4ca) k0Var;
            if (c14492xad25b4ca.I == null) {
                android.content.Context context = c14492xad25b4ca.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                p3325xe03a0797.p3326xc267989b.l.d(((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).getLifecycleAsyncScope(), null, null, new uo2.o(null), 3, null);
            }
            sr2.l5 l5Var = c14492xad25b4ca.f202956J;
            if (l5Var != null) {
                l5Var.mo2284x57429eec();
            }
        }
        c50.m0 m0Var = this.C;
        if (m0Var != null) {
            ((gp2.l0) m0Var).g();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k0
    public void v() {
        boolean A = A(this.f190403q);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = this.f188689e;
        if (A) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(abstractC13919x46aff122, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader");
            int i17 = this.f190402p;
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13918xdafe8cba.B;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13918xdafe8cba) abstractC13919x46aff122).e(i17, null, -1);
            return;
        }
        r45.xn5 xn5Var = new r45.xn5();
        xn5Var.set(0, new java.util.LinkedList());
        xn5Var.m75941xfb821914(0).add(this.f190403q);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(abstractC13919x46aff122, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13918xdafe8cba) abstractC13919x46aff122).e(this.f190402p, xn5Var, 4);
    }

    public final java.lang.String y() {
        r45.mb4 mb4Var;
        java.util.List<E> m56392xfc5c33e5 = this.f188689e.m56392xfc5c33e5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5.class);
        if (!(!m56392xfc5c33e5.isEmpty()) || (mb4Var = (r45.mb4) kz5.n0.a0(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) m56392xfc5c33e5.get(0)).getFeedObject().m59264x7efe73ec(), 0)) == null) {
            return "";
        }
        return mb4Var.m75945x2fec8307(1) + mb4Var.m75945x2fec8307(19);
    }

    public final r45.xn5 z() {
        if (A(this.f190403q)) {
            return null;
        }
        r45.xn5 xn5Var = new r45.xn5();
        xn5Var.set(0, new java.util.LinkedList());
        xn5Var.m75941xfb821914(0).add(this.f190403q);
        return xn5Var;
    }
}
