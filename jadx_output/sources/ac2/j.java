package ac2;

/* loaded from: classes2.dex */
public final class j implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ac2.t f3034a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f3035b;

    public j(ac2.t tVar, long j17) {
        this.f3034a = tVar;
        this.f3035b = j17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.util.ArrayList dataList;
        java.util.AbstractList dataList2;
        java.util.AbstractCollection dataList3;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        ac2.t tVar = this.f3034a;
        com.tencent.mars.xlog.Log.i(tVar.B, "requestFirstFeed errType %d errCode %d", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2);
        if (finderObject != null) {
            if (tVar.f3058z == this.f3035b) {
                if (fVar.f70616b == 0 || finderObject.getId() != 0) {
                    com.tencent.mm.plugin.finder.storage.FinderItem a17 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 1);
                    com.tencent.mm.ui.MMActivity context = tVar.f106421d;
                    kotlin.jvm.internal.o.g(context, "context");
                    com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                    a17.setCommentScene(nyVar != null ? nyVar.f135380n : 0);
                    com.tencent.mm.plugin.finder.model.BaseFinderFeed p17 = cu2.u.f222441a.p(a17);
                    com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = tVar.f106570t;
                    java.util.ArrayList dataList4 = baseFeedLoader != null ? baseFeedLoader.getDataList() : null;
                    if (dataList4 == null || dataList4.isEmpty()) {
                        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader2 = tVar.f106570t;
                        if (baseFeedLoader2 != null && (dataList3 = baseFeedLoader2.getDataList()) != null) {
                            dataList3.add(p17);
                        }
                        ac2.y yVar = tVar.E;
                        if (yVar != null) {
                            yVar.a().notifyDataSetChanged();
                        }
                        ac2.y yVar2 = tVar.E;
                        if (yVar2 != null) {
                            yVar2.z();
                        }
                    } else {
                        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader3 = tVar.f106570t;
                        if (baseFeedLoader3 != null && (dataList = baseFeedLoader3.getDataList()) != null) {
                            java.util.Iterator it = dataList.iterator();
                            int i17 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    i17 = -1;
                                    break;
                                }
                                if (((so2.j5) it.next()).getItemId() == finderObject.getId()) {
                                    break;
                                }
                                i17++;
                            }
                            if (i17 != -1) {
                                com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader4 = tVar.f106570t;
                                if (baseFeedLoader4 != null && (dataList2 = baseFeedLoader4.getDataList()) != null) {
                                }
                                ac2.y yVar3 = tVar.E;
                                if (yVar3 != null) {
                                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter a18 = yVar3.a();
                                    a18.notifyItemChanged(i17, new jz5.l(12, null));
                                    a18.notifyItemChanged(i17, new jz5.l(45, null));
                                    a18.notifyItemChanged(i17, new jz5.l(48, null));
                                    a18.notifyItemChanged(i17, new jz5.l(49, null));
                                }
                            }
                        }
                    }
                }
            }
            return jz5.f0.f302826a;
        }
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader5 = tVar.f106570t;
        if (baseFeedLoader5 != null) {
            baseFeedLoader5.requestRefresh();
        }
        return jz5.f0.f302826a;
    }
}
