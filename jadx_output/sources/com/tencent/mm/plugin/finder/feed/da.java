package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class da extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FinderTimelineRefreshEvent f106554d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.oa f106555e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da(com.tencent.mm.autogen.events.FinderTimelineRefreshEvent finderTimelineRefreshEvent, com.tencent.mm.plugin.finder.feed.oa oaVar) {
        super(0);
        this.f106554d = finderTimelineRefreshEvent;
        this.f106555e = oaVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = this.f106554d.f54334g.f7420a;
        com.tencent.mm.plugin.finder.feed.oa oaVar = this.f106555e;
        if (i17 == oaVar.f108627m) {
            com.tencent.mars.xlog.Log.i("FinderFollowFeedUIContract.Presenter", "autoRefreshEventListener: trigger refresh tabType = " + oaVar.f108627m);
            com.tencent.mm.plugin.finder.feed.a1 a1Var = oaVar.f107157f;
            com.tencent.mm.plugin.finder.feed.xa xaVar = a1Var instanceof com.tencent.mm.plugin.finder.feed.xa ? (com.tencent.mm.plugin.finder.feed.xa) a1Var : null;
            if (xaVar != null) {
                xaVar.f106180m.postDelayed(new com.tencent.mm.plugin.finder.feed.qa(xaVar, false), 150L);
            }
        }
        return jz5.f0.f302826a;
    }
}
