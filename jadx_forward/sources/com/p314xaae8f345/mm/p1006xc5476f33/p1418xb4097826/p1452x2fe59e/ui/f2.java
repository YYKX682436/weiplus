package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class f2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13949x90d2cfd6 f191534d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13949x90d2cfd6 activityC13949x90d2cfd6) {
        super(1);
        this.f191534d = activityC13949x90d2cfd6;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        int w17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa it = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        boolean hasMore = it.getHasMore();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13949x90d2cfd6 activityC13949x90d2cfd6 = this.f191534d;
        if (hasMore) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g9 g9Var = activityC13949x90d2cfd6.f190766y;
            if (g9Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.r(g9Var.o(), false, null, null, 7, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g9 g9Var2 = activityC13949x90d2cfd6.f190766y;
            if (g9Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView = g9Var2.m56068x4905e9fa();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = recyclerView.getLayoutManager();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
            if (c1162x665295de != null && (mo7946xf939df19 = recyclerView.mo7946xf939df19()) != null && (w17 = c1162x665295de.w() + 1) < mo7946xf939df19.mo1894x7e414b06()) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(w17));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderFeedListUI", "tryScrollToNextFeed", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Undefined", "smoothScrollToPosition", "(I)V");
                recyclerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/feed/ui/FinderFeedListUI", "tryScrollToNextFeed", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Undefined", "smoothScrollToPosition", "(I)V");
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g9 g9Var3 = activityC13949x90d2cfd6.f190766y;
            if (g9Var3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            android.view.View f294968x = g9Var3.o().getF294968x();
            if (f294968x != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(f294968x, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderFeedListUI$createFeedLoader$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                f294968x.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(f294968x, "com/tencent/mm/plugin/finder/feed/ui/FinderFeedListUI$createFeedLoader$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g9 g9Var4 = activityC13949x90d2cfd6.f190766y;
            if (g9Var4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.I(g9Var4.o(), null, 1, null);
        }
        return jz5.f0.f384359a;
    }
}
