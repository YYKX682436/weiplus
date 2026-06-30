package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class qo implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.to f108841d;

    public qo(com.tencent.mm.plugin.finder.feed.to toVar) {
        this.f108841d = toVar;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader baseFinderFeedLoader;
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer<T> dataListJustForAdapter;
        com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader baseFinderFeedLoader2;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.feed.to toVar = this.f108841d;
        toVar.getClass();
        int a07 = i17 - ((in5.n0) adapter).a0();
        if (a07 >= 0) {
            com.tencent.mm.plugin.finder.feed.no noVar = toVar.f109095i;
            if (a07 < ((noVar == null || (baseFinderFeedLoader2 = noVar.f108587d) == null) ? 0 : baseFinderFeedLoader2.getSize())) {
                com.tencent.mm.plugin.finder.feed.no noVar2 = toVar.f109095i;
                so2.j5 j5Var = (noVar2 == null || (baseFinderFeedLoader = noVar2.f108587d) == null || (dataListJustForAdapter = baseFinderFeedLoader.getDataListJustForAdapter()) == 0) ? null : (so2.j5) dataListJustForAdapter.get(a07);
                if (j5Var instanceof so2.t4) {
                }
            }
        }
    }
}
