package com.tencent.mm.plugin.finder.feed.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderLiveRelatedFeedColumnLoader;", "Lcom/tencent/mm/plugin/finder/live/model/FinderLiveRelatedBaseLoader;", "com/tencent/mm/plugin/finder/feed/model/v3", "com/tencent/mm/plugin/finder/feed/model/w3", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderLiveRelatedFeedColumnLoader extends com.tencent.mm.plugin.finder.live.model.FinderLiveRelatedBaseLoader {

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f107490o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Object f107491p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FinderLiveRelatedFeedColumnLoader(android.content.Context context, r45.qt2 qt2Var, java.lang.String feedVMKey) {
        super(qt2Var);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feedVMKey, "feedVMKey");
        this.f107490o = feedVMKey;
        this.f107491p = new java.lang.Object();
        com.tencent.mars.xlog.Log.i(getF123427d(), "FinderGlobalVMStore getViewModel init:" + feedVMKey);
        ey2.u e17 = e();
        if (e17 != null) {
            e17.f257542x.observe((androidx.lifecycle.y) context, new com.tencent.mm.plugin.finder.feed.model.t3(this));
        }
        createDataFetch();
    }

    @Override // com.tencent.mm.plugin.finder.live.model.FinderLiveRelatedBaseLoader
    public java.lang.String b() {
        r45.dy0 dy0Var;
        ey2.u e17 = e();
        if (e17 == null || (dy0Var = e17.f257533o) == null) {
            return null;
        }
        return dy0Var.getString(0);
    }

    @Override // com.tencent.mm.plugin.finder.live.model.FinderLiveRelatedBaseLoader
    public boolean c() {
        if (e() != null) {
            return ((java.lang.Boolean) ((lb2.j) ((jz5.n) ae2.in.E).getValue()).r()).booleanValue();
        }
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
        com.tencent.mars.xlog.Log.i(getF123427d(), "FinderGlobalVMStore getViewModel createDataFetch:" + this.f107490o);
        return new com.tencent.mm.plugin.finder.feed.model.v3(this, e());
    }

    @Override // com.tencent.mm.plugin.finder.live.model.FinderLiveRelatedBaseLoader
    /* renamed from: d */
    public boolean getF111732m() {
        return false;
    }

    public final ey2.u e() {
        return (ey2.u) ey2.l0.f257422a.a(this.f107490o, ey2.u.class, null);
    }

    public final java.util.List f(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (obj instanceof so2.h1) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            km2.m mVar = new km2.m(((so2.h1) it.next()).getFeedObject().getFeedObject());
            mVar.f309136n = true;
            arrayList2.add(mVar);
        }
        return arrayList2;
    }

    @Override // com.tencent.mm.plugin.finder.live.model.FinderLiveRelatedBaseLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0
    public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        kotlin.jvm.internal.o.g(response, "response");
        yz5.l lVar = this.f111726d;
        if (lVar != null) {
            lVar.invoke(response);
        }
        if (4 != response.getPullType()) {
            setInnerLoadingMore(false);
        }
    }
}
