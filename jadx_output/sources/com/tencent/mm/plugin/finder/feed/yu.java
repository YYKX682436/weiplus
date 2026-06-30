package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class yu implements ym5.q1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.zu f111208d;

    public yu(com.tencent.mm.plugin.finder.feed.zu zuVar) {
        this.f111208d = zuVar;
    }

    public final com.tencent.mm.view.recyclerview.WxRecyclerAdapter a() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f111208d.g().getRecyclerView();
        androidx.recyclerview.widget.f2 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter) {
            return (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter;
        }
        return null;
    }

    @Override // ym5.m1
    public void onChanged() {
        com.tencent.mm.view.RefreshLoadMoreLayout f17 = this.f111208d.g().f();
        if (f17 != null) {
            f17.onChanged();
        }
    }

    @Override // ym5.m1
    public void onItemRangeChanged(int i17, int i18) {
        com.tencent.mm.view.RefreshLoadMoreLayout f17 = this.f111208d.g().f();
        if (f17 != null) {
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter a17 = a();
            f17.onItemRangeChanged(i17 + (a17 != null ? a17.a0() : 0), i18);
        }
    }

    @Override // ym5.m1
    public void onItemRangeInserted(int i17, int i18) {
        com.tencent.mm.view.RefreshLoadMoreLayout f17 = this.f111208d.g().f();
        if (f17 != null) {
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter a17 = a();
            f17.onItemRangeInserted(i17 + (a17 != null ? a17.a0() : 0), i18);
        }
    }

    @Override // ym5.m1
    public void onItemRangeMoved(int i17, int i18, int i19) {
        com.tencent.mm.view.RefreshLoadMoreLayout f17 = this.f111208d.g().f();
        if (f17 != null) {
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter a17 = a();
            int a07 = i17 + (a17 != null ? a17.a0() : 0);
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter a18 = a();
            f17.onItemRangeMoved(a07, i18 + (a18 != null ? a18.a0() : 0), i19);
        }
    }

    @Override // ym5.m1
    public void onItemRangeRemoved(int i17, int i18) {
        com.tencent.mm.view.RefreshLoadMoreLayout f17 = this.f111208d.g().f();
        if (f17 != null) {
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter a17 = a();
            f17.onItemRangeRemoved(i17 + (a17 != null ? a17.a0() : 0), i18);
        }
    }

    @Override // ym5.p1
    public void onPreFinishLoadMore(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.view.RefreshLoadMoreLayout f17 = this.f111208d.g().f();
        if (f17 != null) {
            f17.O(reason);
        }
    }

    @Override // ym5.p1
    public void onPreFinishLoadMoreSmooth(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.view.RefreshLoadMoreLayout f17 = this.f111208d.g().f();
        if (f17 != null) {
            f17.onPreFinishLoadMoreSmooth(reason);
        }
    }

    @Override // ym5.p1
    public void onPreFinishRefresh(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.view.RefreshLoadMoreLayout f17 = this.f111208d.g().f();
        if (f17 != null) {
            f17.Q(reason);
        }
    }

    @Override // ym5.m1
    public void onItemRangeChanged(int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.view.RefreshLoadMoreLayout f17 = this.f111208d.g().f();
        if (f17 != null) {
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter a17 = a();
            f17.onItemRangeChanged(i17 + (a17 != null ? a17.a0() : 0), i18, obj);
        }
    }
}
