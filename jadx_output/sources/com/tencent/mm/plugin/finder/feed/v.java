package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class v implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.c0 f110842d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f110843e;

    public v(com.tencent.mm.plugin.finder.feed.c0 c0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f110842d = c0Var;
        this.f110843e = baseFinderFeed;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        kotlin.jvm.internal.o.d(g4Var);
        this.f110842d.getClass();
        com.tencent.mm.plugin.finder.model.BaseFinderFeed feed = this.f110843e;
        kotlin.jvm.internal.o.g(feed, "feed");
    }
}
