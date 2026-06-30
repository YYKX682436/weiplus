package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class ej implements ym5.q1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.RefreshLoadMoreLayout f106657d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.gj f106658e;

    public ej(com.tencent.mm.plugin.finder.feed.gj gjVar) {
        this.f106658e = gjVar;
        this.f106657d = gjVar.o();
    }

    @Override // ym5.m1
    public void onChanged() {
        this.f106657d.onChanged();
    }

    @Override // ym5.m1
    public void onItemRangeChanged(int i17, int i18) {
        com.tencent.mm.plugin.finder.feed.gj gjVar = this.f106658e;
        com.tencent.mm.view.RefreshLoadMoreLayout o17 = gjVar.o();
        gjVar.getClass();
        o17.onItemRangeChanged(i17 + 0, i18);
    }

    @Override // ym5.m1
    public void onItemRangeInserted(int i17, int i18) {
        com.tencent.mm.plugin.finder.feed.gj gjVar = this.f106658e;
        com.tencent.mm.view.RefreshLoadMoreLayout o17 = gjVar.o();
        gjVar.getClass();
        o17.onItemRangeInserted(i17 + 0, i18);
    }

    @Override // ym5.m1
    public void onItemRangeMoved(int i17, int i18, int i19) {
        com.tencent.mm.plugin.finder.feed.gj gjVar = this.f106658e;
        com.tencent.mm.view.RefreshLoadMoreLayout o17 = gjVar.o();
        gjVar.getClass();
        gjVar.getClass();
        o17.onItemRangeMoved(i17 + 0, i18 + 0, i19);
    }

    @Override // ym5.m1
    public void onItemRangeRemoved(int i17, int i18) {
        com.tencent.mm.plugin.finder.feed.gj gjVar = this.f106658e;
        com.tencent.mm.view.RefreshLoadMoreLayout o17 = gjVar.o();
        gjVar.getClass();
        o17.onItemRangeRemoved(i17 + 0, i18);
    }

    @Override // ym5.p1
    public void onPreFinishLoadMore(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        this.f106658e.getClass();
    }

    @Override // ym5.p1
    public void onPreFinishLoadMoreSmooth(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        this.f106657d.onPreFinishLoadMoreSmooth(reason);
    }

    @Override // ym5.p1
    public void onPreFinishRefresh(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        this.f106658e.x(reason);
    }

    @Override // ym5.m1
    public void onItemRangeChanged(int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.finder.feed.gj gjVar = this.f106658e;
        com.tencent.mm.view.RefreshLoadMoreLayout o17 = gjVar.o();
        gjVar.getClass();
        o17.onItemRangeChanged(i17 + 0, i18, obj);
    }
}
