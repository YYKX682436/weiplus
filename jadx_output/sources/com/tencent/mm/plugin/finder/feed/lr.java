package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class lr implements ym5.q1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.RefreshLoadMoreLayout f107322d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.xr f107323e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.kr f107324f;

    public lr(com.tencent.mm.plugin.finder.feed.xr xrVar, com.tencent.mm.plugin.finder.feed.kr krVar) {
        this.f107323e = xrVar;
        this.f107324f = krVar;
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = xrVar.f111098g;
        if (refreshLoadMoreLayout != null) {
            this.f107322d = refreshLoadMoreLayout;
        } else {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
    }

    @Override // ym5.m1
    public void onChanged() {
        this.f107322d.onChanged();
    }

    @Override // ym5.m1
    public void onItemRangeChanged(int i17, int i18) {
        this.f107322d.onItemRangeChanged(i17, i18);
    }

    @Override // ym5.m1
    public void onItemRangeInserted(int i17, int i18) {
        this.f107322d.onItemRangeInserted(i17, i18);
    }

    @Override // ym5.m1
    public void onItemRangeMoved(int i17, int i18, int i19) {
        this.f107322d.onItemRangeMoved(i17, i18, i19);
    }

    @Override // ym5.m1
    public void onItemRangeRemoved(int i17, int i18) {
        com.tencent.mm.plugin.finder.feed.xr xrVar = this.f107323e;
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = xrVar.f111098g;
        if (refreshLoadMoreLayout == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        refreshLoadMoreLayout.onItemRangeRemoved(i17, i18);
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = xrVar.f111098g;
        if (refreshLoadMoreLayout2 == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        androidx.recyclerview.widget.f2 adapter = refreshLoadMoreLayout2.getRecyclerView().getAdapter();
        if (adapter == null || adapter.getItemCount() >= 10) {
            return;
        }
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestLoadMore$default(this.f107324f.m(), false, 1, null);
    }

    @Override // ym5.p1
    public void onPreFinishLoadMore(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f107322d;
        refreshLoadMoreLayout.getClass();
        refreshLoadMoreLayout.O(reason);
    }

    @Override // ym5.p1
    public void onPreFinishLoadMoreSmooth(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        this.f107322d.onPreFinishLoadMoreSmooth(reason);
    }

    @Override // ym5.p1
    public void onPreFinishRefresh(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f107322d;
        refreshLoadMoreLayout.getClass();
        refreshLoadMoreLayout.Q(reason);
    }

    @Override // ym5.m1
    public void onItemRangeChanged(int i17, int i18, java.lang.Object obj) {
        this.f107322d.onItemRangeChanged(i17, i18, obj);
    }
}
