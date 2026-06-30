package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class ok implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.tl f108663d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f108664e;

    public ok(com.tencent.mm.plugin.finder.feed.tl tlVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f108663d = tlVar;
        this.f108664e = baseFinderFeed;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        kotlin.jvm.internal.o.d(g4Var);
        com.tencent.mm.plugin.finder.feed.tl tlVar = this.f108663d;
        tlVar.getClass();
        com.tencent.mm.plugin.finder.model.BaseFinderFeed feed = this.f108664e;
        kotlin.jvm.internal.o.g(feed, "feed");
        if (hc2.b0.i(feed)) {
            return;
        }
        com.tencent.mm.plugin.finder.assist.y4.f102714a.h(tlVar.f109069d, g4Var, feed);
    }
}
