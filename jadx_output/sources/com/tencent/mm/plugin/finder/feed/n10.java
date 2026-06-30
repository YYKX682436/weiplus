package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class n10 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.r10 f108540d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a1 f108541e;

    public n10(com.tencent.mm.plugin.finder.feed.r10 r10Var, com.tencent.mm.plugin.finder.feed.a1 a1Var) {
        this.f108540d = r10Var;
        this.f108541e = a1Var;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter$onAttach$1$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter$onAttach$1$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter$onAttach$1$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mm.plugin.finder.feed.r10 r10Var = this.f108540d;
        int i19 = r10Var.A + i18;
        r10Var.A = i19;
        if (i19 < 0) {
            i19 = 0;
        }
        r10Var.A = i19;
        float dimensionPixelOffset = r10Var.A / r10Var.f107155d.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.by);
        boolean z17 = dimensionPixelOffset == 0.0f;
        com.tencent.mm.plugin.finder.feed.a1 a1Var = this.f108541e;
        if (z17) {
            kotlin.jvm.internal.o.e(a1Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract.TopicFeedViewCallback");
            android.view.View Y = ((com.tencent.mm.plugin.finder.feed.x10) a1Var).Y();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(Y, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter$onAttach$1$2", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            Y.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(Y, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter$onAttach$1$2", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            kotlin.jvm.internal.o.e(a1Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract.TopicFeedViewCallback");
            if (((com.tencent.mm.plugin.finder.feed.x10) a1Var).Y().getVisibility() == 4) {
                com.tencent.mm.plugin.finder.report.p2.f125237a.D(r10Var.f107155d, true, 6);
            }
            kotlin.jvm.internal.o.e(a1Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract.TopicFeedViewCallback");
            android.view.View Y2 = ((com.tencent.mm.plugin.finder.feed.x10) a1Var).Y();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(Y2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter$onAttach$1$2", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            Y2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(Y2, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter$onAttach$1$2", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        kotlin.jvm.internal.o.e(a1Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract.TopicFeedViewCallback");
        android.view.View Y3 = ((com.tencent.mm.plugin.finder.feed.x10) a1Var).Y();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Float.valueOf(dimensionPixelOffset));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(Y3, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter$onAttach$1$2", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        Y3.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
        yj0.a.f(Y3, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter$onAttach$1$2", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedPresenter$onAttach$1$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
