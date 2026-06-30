package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class al implements com.tencent.mm.plugin.finder.feed.model.internal.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.xj f106300a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.tl f106301b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader f106302c;

    public al(com.tencent.mm.plugin.finder.feed.xj xjVar, com.tencent.mm.plugin.finder.feed.tl tlVar, com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader) {
        this.f106300a = xjVar;
        this.f106301b = tlVar;
        this.f106302c = finderFeedShareRelativeListLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.q0
    public void call(int i17) {
        com.tencent.mm.plugin.finder.feed.xj xjVar = this.f106300a;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = xjVar.f111075d;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = wxRecyclerView.getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        com.tencent.mm.plugin.finder.feed.tl tlVar = this.f106301b;
        tlVar.j(false);
        com.tencent.mm.plugin.finder.feed.tl.a(tlVar, false);
        wxRecyclerView.post(new com.tencent.mm.plugin.finder.feed.zk(this.f106302c, (androidx.recyclerview.widget.LinearLayoutManager) layoutManager, tlVar, xjVar));
        xjVar.d();
    }
}
