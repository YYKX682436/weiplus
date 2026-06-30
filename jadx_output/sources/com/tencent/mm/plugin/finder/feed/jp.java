package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class jp implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.kr f107126a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f107127b;

    public jp(com.tencent.mm.plugin.finder.feed.kr krVar, yz5.a aVar) {
        this.f107126a = krVar;
        this.f107127b = aVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        androidx.recyclerview.widget.f2 adapter;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70615a == 0 && fVar.f70616b == 0 && (finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2)) != null) {
            com.tencent.mm.plugin.finder.storage.FinderItem a17 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 1);
            com.tencent.mm.plugin.finder.model.BaseFinderFeed p17 = cu2.u.f222441a.p(a17);
            long id6 = finderObject.getId();
            com.tencent.mm.plugin.finder.feed.kr krVar = this.f107126a;
            krVar.f107236m = id6;
            sc2.p2.f406143b.a().a(kz5.b0.c(a17));
            krVar.m().setFeedId(krVar.f107236m);
            krVar.m().getDataList().clear();
            krVar.m().getDataList().add(p17);
            com.tencent.mm.plugin.finder.feed.xr xrVar = krVar.f107247x;
            if (xrVar != null && (adapter = xrVar.getRecyclerView().getAdapter()) != null) {
                adapter.notifyDataSetChanged();
            }
            pm0.v.V(300L, new com.tencent.mm.plugin.finder.feed.ip(krVar));
            this.f107127b.invoke();
        }
        return jz5.f0.f302826a;
    }
}
