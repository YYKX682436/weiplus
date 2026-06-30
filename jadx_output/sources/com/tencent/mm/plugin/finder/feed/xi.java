package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class xi extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.yi f111071d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xi(com.tencent.mm.plugin.finder.feed.yi yiVar) {
        super(1);
        this.f111071d = yiVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.feed.zi ziVar;
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse resp = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetchEndCallback called, data size: ");
        com.tencent.mm.plugin.finder.feed.yi yiVar = this.f111071d;
        sb6.append(yiVar.f111172d.getDataListJustForAdapter().size());
        com.tencent.mars.xlog.Log.i("FinderLiveReservedNoticeListContract", sb6.toString());
        resp.getHasMore();
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = yiVar.f111172d;
        java.util.Iterator it = baseFeedLoader.getDataListJustForAdapter().iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mars.xlog.Log.i("FinderLiveReservedNoticeListContract", "Data[" + i17 + "]: " + ((so2.j5) next).getClass().getSimpleName());
            i17 = i18;
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = yiVar.f111174f;
        if ((wxRecyclerAdapter != null && wxRecyclerAdapter.x() == 0) && baseFeedLoader.getDataListJustForAdapter().size() == 0 && (ziVar = yiVar.f111173e) != null) {
            ziVar.f111271g.setVisibility(0);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = yiVar.f111174f;
        if (wxRecyclerAdapter2 != null) {
            wxRecyclerAdapter2.notifyDataSetChanged();
        }
        return jz5.f0.f302826a;
    }
}
