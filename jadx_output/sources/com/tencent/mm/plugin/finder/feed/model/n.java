package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class n extends com.tencent.mm.plugin.finder.feed.model.internal.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderAudioCollectionLoader f108205d;

    public n(com.tencent.mm.plugin.finder.feed.model.FinderAudioCollectionLoader finderAudioCollectionLoader) {
        this.f108205d = finderAudioCollectionLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse callInit() {
        com.tencent.mm.plugin.finder.feed.model.o oVar = new com.tencent.mm.plugin.finder.feed.model.o(0, 0, "");
        com.tencent.mm.plugin.finder.feed.model.r9 cache = this.f108205d.getCache();
        if (cache != null) {
            oVar.setIncrementList(cache.f108300a);
            oVar.setLastBuffer(cache.f108301b);
        }
        return oVar;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.i iVar, com.tencent.mm.protobuf.f fVar) {
        boolean z17;
        r45.vx0 vx0Var;
        if (!(iVar instanceof db2.o0) || !(fVar instanceof r45.d51)) {
            return null;
        }
        boolean z18 = (i17 == 0 && i18 == 0 && ((r45.d51) fVar).getInteger(3) == 0) ? false : true;
        com.tencent.mm.plugin.finder.feed.model.o oVar = new com.tencent.mm.plugin.finder.feed.model.o(i17, i18, str);
        oVar.setHasMore(z18);
        db2.o0 o0Var = (db2.o0) iVar;
        oVar.setPullType(o0Var.f228104t);
        if (i17 == 0 && i18 == 0) {
            r45.d51 d51Var = (r45.d51) fVar;
            oVar.setLastBuffer(d51Var.getByteString(4));
            if (o0Var.f228104t == 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.LinkedList<r45.vx0> list = d51Var.getList(1);
                kotlin.jvm.internal.o.f(list, "getCollection_info(...)");
                for (r45.vx0 vx0Var2 : list) {
                    java.util.AbstractCollection<so2.j5> dataList = this.f108205d.getDataList();
                    if (!(dataList instanceof java.util.Collection) || !dataList.isEmpty()) {
                        for (so2.j5 j5Var : dataList) {
                            ms2.b bVar = j5Var instanceof ms2.b ? (ms2.b) j5Var : null;
                            if ((bVar == null || (vx0Var = bVar.f330968d) == null || vx0Var.getLong(0) != vx0Var2.getLong(0)) ? false : true) {
                                z17 = true;
                                break;
                            }
                        }
                    }
                    z17 = false;
                    if (!z17) {
                        kotlin.jvm.internal.o.d(vx0Var2);
                        arrayList.add(new ms2.b(vx0Var2));
                    }
                }
                oVar.setIncrementList(arrayList);
                com.tencent.mars.xlog.Log.i(getTAG(), "enter, audio collection incrementList size=" + arrayList.size() + ", cgiDataSize=" + d51Var.getList(1).size() + ", hasMore=" + z18);
            } else {
                java.util.LinkedList<r45.vx0> list2 = d51Var.getList(1);
                kotlin.jvm.internal.o.f(list2, "getCollection_info(...)");
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list2, 10));
                for (r45.vx0 vx0Var3 : list2) {
                    kotlin.jvm.internal.o.d(vx0Var3);
                    arrayList2.add(new ms2.b(vx0Var3));
                }
                oVar.setIncrementList(arrayList2);
                java.lang.String tag = getTAG();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("bottom, audio collection incrementList size=");
                java.util.List incrementList = oVar.getIncrementList();
                sb6.append(incrementList != null ? java.lang.Integer.valueOf(incrementList.size()) : null);
                sb6.append(", hasMore=");
                sb6.append(z18);
                com.tencent.mars.xlog.Log.i(tag, sb6.toString());
            }
        }
        return oVar;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genLoadMoreCgi() {
        com.tencent.mm.plugin.finder.feed.model.FinderAudioCollectionLoader finderAudioCollectionLoader = this.f108205d;
        db2.o0 o0Var = new db2.o0(finderAudioCollectionLoader.f107393d, finderAudioCollectionLoader.getLastBuffer(), finderAudioCollectionLoader.getContextObj(), 1, 0, 16, null);
        o0Var.f228104t = 2;
        return o0Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genRefreshCgi() {
        com.tencent.mm.plugin.finder.feed.model.FinderAudioCollectionLoader finderAudioCollectionLoader = this.f108205d;
        db2.o0 o0Var = new db2.o0(finderAudioCollectionLoader.f107393d, null, finderAudioCollectionLoader.getContextObj(), 1, 0, 16, null);
        o0Var.f228104t = 0;
        return o0Var;
    }
}
