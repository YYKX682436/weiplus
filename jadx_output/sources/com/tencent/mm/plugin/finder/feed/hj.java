package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class hj extends com.tencent.mm.plugin.finder.view.mj {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.xj f106925e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj(com.tencent.mm.plugin.finder.feed.xj xjVar, com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout) {
        super(finderRefreshLayout);
        this.f106925e = xjVar;
    }

    @Override // com.tencent.mm.plugin.finder.view.mj
    public int a() {
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f106925e.f111076e;
        if (wxRecyclerAdapter != null) {
            return wxRecyclerAdapter.a0();
        }
        kotlin.jvm.internal.o.o("adapter");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.view.mj, ym5.p1
    public void onPreFinishLoadMore(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        super.onPreFinishLoadMore(reason);
        com.tencent.mm.plugin.finder.feed.xj xjVar = this.f106925e;
        com.tencent.mm.plugin.finder.feed.tl tlVar = xjVar.f111073b;
        tlVar.getClass();
        tlVar.g().g(false);
        xjVar.d();
        xjVar.c(xjVar.f111083l);
    }

    @Override // com.tencent.mm.plugin.finder.view.mj, ym5.p1
    public void onPreFinishLoadMoreSmooth(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        super.onPreFinishLoadMoreSmooth(reason);
        com.tencent.mm.plugin.finder.feed.xj xjVar = this.f106925e;
        com.tencent.mm.plugin.finder.feed.tl tlVar = xjVar.f111073b;
        tlVar.getClass();
        tlVar.g().g(false);
        xjVar.d();
        xjVar.c(xjVar.f111083l);
    }
}
