package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class wv implements ym5.q1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.xv f111009d;

    public wv(com.tencent.mm.plugin.finder.feed.xv xvVar) {
        this.f111009d = xvVar;
    }

    public final com.tencent.mm.view.recyclerview.WxRecyclerAdapter a() {
        return ((com.tencent.mm.plugin.finder.feed.cw) this.f111009d.c()).g();
    }

    @Override // ym5.m1
    public void onChanged() {
        com.tencent.mm.plugin.finder.feed.xv xvVar = this.f111009d;
        int size = xvVar.f111114p.getSize();
        xvVar.f111114p.getDataListJustForAdapter().clear();
        onItemRangeRemoved(0, size);
        xvVar.f111114p.getDataListJustForAdapter().addAll(xvVar.f111105d.getDataListJustForAdapter());
        onItemRangeInserted(0, xvVar.f111105d.getSize());
    }

    @Override // ym5.m1
    public void onItemRangeChanged(int i17, int i18) {
        ((com.tencent.mm.plugin.finder.feed.cw) this.f111009d.c()).j().onItemRangeChanged(i17 + a().a0(), i18);
    }

    @Override // ym5.m1
    public void onItemRangeInserted(int i17, int i18) {
        ((com.tencent.mm.plugin.finder.feed.cw) this.f111009d.c()).j().onItemRangeInserted(i17 + a().a0(), i18);
    }

    @Override // ym5.m1
    public void onItemRangeMoved(int i17, int i18, int i19) {
        ((com.tencent.mm.plugin.finder.feed.cw) this.f111009d.c()).j().onItemRangeMoved(i17 + a().a0(), i18 + a().a0(), i19);
    }

    @Override // ym5.m1
    public void onItemRangeRemoved(int i17, int i18) {
        ((com.tencent.mm.plugin.finder.feed.cw) this.f111009d.c()).j().onItemRangeRemoved(i17 + a().a0(), i18);
    }

    @Override // ym5.p1
    public void onPreFinishLoadMore(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        ((com.tencent.mm.plugin.finder.feed.cw) this.f111009d.c()).j().O(reason);
    }

    @Override // ym5.p1
    public void onPreFinishLoadMoreSmooth(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        ((com.tencent.mm.plugin.finder.feed.cw) this.f111009d.c()).j().onPreFinishLoadMoreSmooth(reason);
    }

    @Override // ym5.p1
    public void onPreFinishRefresh(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        ((com.tencent.mm.plugin.finder.feed.cw) this.f111009d.c()).j().Q(reason);
    }

    @Override // ym5.m1
    public void onItemRangeChanged(int i17, int i18, java.lang.Object obj) {
        ((com.tencent.mm.plugin.finder.feed.cw) this.f111009d.c()).j().onItemRangeChanged(i17 + a().a0(), i18, obj);
    }
}
