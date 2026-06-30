package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public class l1 extends com.tencent.mm.plugin.finder.feed.model.internal.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader f108135d;

    public l1(com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader finderFeedRelTimelineLoader) {
        this.f108135d = finderFeedRelTimelineLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse callInit() {
        com.tencent.mm.plugin.finder.feed.model.m1 m1Var = new com.tencent.mm.plugin.finder.feed.model.m1("", 0, 0, "");
        com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader finderFeedRelTimelineLoader = this.f108135d;
        com.tencent.mm.plugin.finder.feed.model.r9 cache = finderFeedRelTimelineLoader.getCache();
        m1Var.setIncrementList(cache != null ? cache.f108300a : null);
        com.tencent.mm.plugin.finder.feed.model.r9 cache2 = finderFeedRelTimelineLoader.getCache();
        m1Var.setLastBuffer(cache2 != null ? cache2.f108301b : null);
        m1Var.setHasMore(finderFeedRelTimelineLoader.f107421i);
        return m1Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.i iVar, com.tencent.mm.protobuf.f fVar) {
        com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader finderFeedRelTimelineLoader = this.f108135d;
        finderFeedRelTimelineLoader.getClass();
        if (!(fVar instanceof r45.aa1) || !(iVar instanceof db2.t0)) {
            return null;
        }
        boolean z17 = (i17 == 0 && i18 == 0 && ((r45.aa1) fVar).getInteger(3) == 0) ? false : true;
        r45.aa1 aa1Var = (r45.aa1) fVar;
        java.lang.String string = aa1Var.getString(6);
        if (string == null) {
            string = "";
        }
        com.tencent.mm.plugin.finder.feed.model.m1 m1Var = new com.tencent.mm.plugin.finder.feed.model.m1(string, i17, i18, str);
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list = aa1Var.getList(1);
        kotlin.jvm.internal.o.f(list, "getObject(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : list) {
            com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
            kotlin.jvm.internal.o.d(finderObject);
            arrayList.add(cu2.u.f222441a.p(h90Var.a(finderObject, 256)));
        }
        java.util.LinkedList linkedList = new java.util.LinkedList(arrayList);
        java.util.LinkedList list2 = aa1Var.getList(8);
        kotlin.jvm.internal.o.f(list2, "getTxt_card(...)");
        r45.rx2 rx2Var = (r45.rx2) kz5.n0.Z(list2);
        if (rx2Var != null) {
            java.lang.String streamCardTitle = m1Var.f108172a;
            kotlin.jvm.internal.o.g(streamCardTitle, "streamCardTitle");
            linkedList.add(new com.tencent.mm.plugin.finder.feed.zs(rx2Var));
        }
        m1Var.setIncrementList(linkedList);
        m1Var.f108174c.addAll(aa1Var.getList(7));
        m1Var.f108173b = new java.util.LinkedList(aa1Var.getList(1));
        m1Var.setPullType(((db2.t0) iVar).f228162z);
        m1Var.setLastBuffer(aa1Var.getByteString(2));
        m1Var.setHasMore(z17);
        cu2.t tVar = cu2.u.f222441a;
        java.util.LinkedList list3 = aa1Var.getList(1);
        kotlin.jvm.internal.o.f(list3, "getObject(...)");
        tVar.j(list3, 1, finderFeedRelTimelineLoader.getContextObj());
        return m1Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x, com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetch(java.lang.Object obj, com.tencent.mm.plugin.finder.feed.model.internal.n0 callback, boolean z17) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f108135d.getClass();
        super.fetch(obj, callback, z17);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genLoadMoreCgi() {
        com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader finderFeedRelTimelineLoader = this.f108135d;
        db2.t0 t0Var = new db2.t0(finderFeedRelTimelineLoader.f107416d, finderFeedRelTimelineLoader.f107417e, finderFeedRelTimelineLoader.f107418f, finderFeedRelTimelineLoader.getLastBuffer(), finderFeedRelTimelineLoader.f107419g, finderFeedRelTimelineLoader.f107420h, null, null, null, null, finderFeedRelTimelineLoader.getContextObj(), finderFeedRelTimelineLoader.f107427r, finderFeedRelTimelineLoader.f107428s, 0, 0, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, 1073734592, null);
        t0Var.f228162z = 2;
        return t0Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genRefreshCgi() {
        com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader finderFeedRelTimelineLoader = this.f108135d;
        db2.t0 t0Var = new db2.t0(finderFeedRelTimelineLoader.f107416d, finderFeedRelTimelineLoader.f107417e, finderFeedRelTimelineLoader.f107418f, finderFeedRelTimelineLoader.getLastBuffer(), finderFeedRelTimelineLoader.f107419g, finderFeedRelTimelineLoader.f107420h, null, null, null, null, finderFeedRelTimelineLoader.getContextObj(), finderFeedRelTimelineLoader.f107427r, finderFeedRelTimelineLoader.f107428s, 0, 0, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, 1073734592, null);
        t0Var.f228162z = 0;
        return t0Var;
    }
}
