package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class r7 extends com.tencent.mm.plugin.finder.feed.model.internal.x {

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f108295d = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(kotlinx.coroutines.t3.a(null, 1, null)));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f108296e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderRingtoneTimelineLoader f108297f;

    public r7(com.tencent.mm.plugin.finder.feed.model.FinderRingtoneTimelineLoader finderRingtoneTimelineLoader) {
        this.f108297f = finderRingtoneTimelineLoader;
        this.f108296e = jz5.h.b(new com.tencent.mm.plugin.finder.feed.model.q7(finderRingtoneTimelineLoader, this));
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse callInit() {
        com.tencent.mars.xlog.Log.i(getTAG(), "fetchInit");
        com.tencent.mm.plugin.finder.feed.model.s7 s7Var = new com.tencent.mm.plugin.finder.feed.model.s7(0, 0, "");
        com.tencent.mm.plugin.finder.feed.model.FinderRingtoneTimelineLoader finderRingtoneTimelineLoader = this.f108297f;
        com.tencent.mm.plugin.finder.feed.model.r9 cache = finderRingtoneTimelineLoader.getCache();
        s7Var.setIncrementList(cache != null ? cache.f108300a : null);
        com.tencent.mm.plugin.finder.feed.model.r9 cache2 = finderRingtoneTimelineLoader.getCache();
        s7Var.setLastBuffer(cache2 != null ? cache2.f108301b : null);
        return s7Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x, com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void dead() {
        kotlinx.coroutines.z0.e(this.f108295d, null, 1, null);
        super.dead();
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.i iVar, com.tencent.mm.protobuf.f fVar) {
        if (!(fVar instanceof r45.h51)) {
            return null;
        }
        com.tencent.mm.plugin.finder.feed.model.s7 s7Var = new com.tencent.mm.plugin.finder.feed.model.s7(i17, i18, str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        r45.h51 h51Var = (r45.h51) fVar;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) h51Var.getCustom(2);
        if (finderObject != null) {
            arrayList.add(finderObject);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(cu2.u.f222441a.p(com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a((com.tencent.mm.protocal.protobuf.FinderObject) it.next(), 256)));
        }
        s7Var.setIncrementList(arrayList2);
        cu2.u.f222441a.j(arrayList, 256, this.f108297f.getContextObj());
        java.lang.String tag = getTAG();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("incrementList size: ");
        java.util.List incrementList = s7Var.getIncrementList();
        sb6.append(incrementList != null ? java.lang.Integer.valueOf(incrementList.size()) : null);
        com.tencent.mars.xlog.Log.i(tag, sb6.toString());
        s7Var.setPullType(0);
        s7Var.setLastBuffer(h51Var.getByteString(3));
        s7Var.setHasMore(false);
        return s7Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x, com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchLoadMore(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback, boolean z17) {
        kotlin.jvm.internal.o.g(callback, "callback");
        kotlinx.coroutines.l.d(this.f108295d, null, null, new com.tencent.mm.plugin.finder.feed.model.p7(this, callback, null), 3, null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genLoadMoreCgi() {
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genRefreshCgi() {
        com.tencent.mm.plugin.finder.feed.model.FinderRingtoneTimelineLoader finderRingtoneTimelineLoader = this.f108297f;
        return new db2.g4(finderRingtoneTimelineLoader.f107639d, finderRingtoneTimelineLoader.f107640e, 2, 2, "", false, null, null, 0L, null, false, false, null, finderRingtoneTimelineLoader.getContextObj(), 0, null, false, null, null, null, null, null, 0, 0, null, null, false, null, null, 536862688, null);
    }
}
