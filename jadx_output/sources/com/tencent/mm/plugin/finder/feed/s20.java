package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class s20 extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f108968a = true;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.v20 f108969b;

    public s20(com.tencent.mm.plugin.finder.feed.v20 v20Var) {
        this.f108969b = v20Var;
    }

    @Override // ym5.q3
    public void a(int i17) {
        com.tencent.mm.plugin.finder.feed.v20 v20Var = this.f108969b;
        v20Var.getClass();
        if (!this.f108968a || i17 <= 0) {
            return;
        }
        com.tencent.mm.ui.MMActivity activity = v20Var.f106968d;
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        fc2.o Z6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) a17).Z6(-1);
        if (Z6 != null) {
            new fc2.i(Z6).onScrollStateChanged(v20Var.o().getRecyclerView(), 5);
        }
        this.f108968a = false;
    }

    @Override // ym5.q3
    public void b(int i17) {
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.finder.feed.q20(this.f108969b));
    }

    @Override // ym5.q3
    public void c(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        this.f108969b.f106969e.G(reason);
    }

    @Override // ym5.q3
    public void d(int i17, rn5.a aVar, boolean z17) {
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.finder.feed.r20(this.f108969b));
    }

    @Override // ym5.q3
    public void e(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.plugin.finder.feed.v20 v20Var = this.f108969b;
        android.view.View j17 = v20Var.j();
        if (j17 != null) {
            androidx.recyclerview.widget.f2 adapter = v20Var.getRecyclerView().getAdapter();
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
            if ((wxRecyclerAdapter != null ? wxRecyclerAdapter.x() : 0) <= 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(j17, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTopicTimelineUIContract$ViewCallback$initRecyclerView$2", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                j17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(j17, "com/tencent/mm/plugin/finder/feed/FinderTopicTimelineUIContract$ViewCallback$initRecyclerView$2", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                androidx.recyclerview.widget.RecyclerView b07 = wxRecyclerAdapter != null ? wxRecyclerAdapter.b0() : null;
                if (b07 != null) {
                    b07.setVisibility(8);
                }
                android.view.View findViewById = j17.findViewById(com.tencent.mm.R.id.m2g);
                if (findViewById != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTopicTimelineUIContract$ViewCallback$initRecyclerView$2", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderTopicTimelineUIContract$ViewCallback$initRecyclerView$2", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View findViewById2 = j17.findViewById(com.tencent.mm.R.id.lbi);
                if (findViewById2 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTopicTimelineUIContract$ViewCallback$initRecyclerView$2", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/FinderTopicTimelineUIContract$ViewCallback$initRecyclerView$2", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(j17, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTopicTimelineUIContract$ViewCallback$initRecyclerView$2", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                j17.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(j17, "com/tencent/mm/plugin/finder/feed/FinderTopicTimelineUIContract$ViewCallback$initRecyclerView$2", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                androidx.recyclerview.widget.RecyclerView b08 = wxRecyclerAdapter != null ? wxRecyclerAdapter.b0() : null;
                if (b08 != null) {
                    b08.setVisibility(0);
                }
            }
        }
        v20Var.f106969e.onRefreshEnd(reason);
    }
}
