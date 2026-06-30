package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class d6 extends com.tencent.mm.plugin.finder.feed.model.internal.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderProfileCourseLoader f107801d;

    public d6(com.tencent.mm.plugin.finder.feed.model.FinderProfileCourseLoader finderProfileCourseLoader) {
        this.f107801d = finderProfileCourseLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse callInit() {
        com.tencent.mm.plugin.finder.feed.model.e6 e6Var = new com.tencent.mm.plugin.finder.feed.model.e6(0, 0, "");
        com.tencent.mm.plugin.finder.feed.model.FinderProfileCourseLoader finderProfileCourseLoader = this.f107801d;
        e6Var.setIncrementList(finderProfileCourseLoader.f107577f);
        e6Var.setLastBuffer(finderProfileCourseLoader.f107578g);
        return e6Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.i iVar, com.tencent.mm.protobuf.f fVar) {
        nr2.m d17;
        if (!(iVar instanceof bq.n) || !(fVar instanceof r45.yz0)) {
            return null;
        }
        com.tencent.mm.plugin.finder.feed.model.e6 e6Var = new com.tencent.mm.plugin.finder.feed.model.e6(i17, i18, str);
        r45.yz0 yz0Var = (r45.yz0) fVar;
        e6Var.setHasMore(yz0Var.getInteger(3) == 1);
        java.util.LinkedList<r45.uz0> list = yz0Var.getList(1);
        kotlin.jvm.internal.o.f(list, "getCourse_info(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (r45.uz0 uz0Var : list) {
            if (uz0Var.getInteger(13) == 1) {
                com.tencent.mars.xlog.Log.i(getTAG(), "skip course invalid ".concat(pm0.v.u(uz0Var.getLong(0))));
                d17 = null;
            } else {
                d17 = cu2.g0.f222404a.d(uz0Var);
            }
            if (d17 != null) {
                arrayList.add(d17);
            }
        }
        e6Var.setIncrementList(arrayList);
        java.lang.String string = yz0Var.getString(4);
        if (string != null) {
            byte[] bytes = string.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            e6Var.setLastBuffer(new com.tencent.mm.protobuf.g(bytes, 0, bytes.length));
        }
        e6Var.setPullType(((bq.n) iVar).f23496o);
        return e6Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genLoadMoreCgi() {
        com.tencent.mm.plugin.finder.feed.model.FinderProfileCourseLoader finderProfileCourseLoader = this.f107801d;
        return new bq.n(finderProfileCourseLoader.f107575d, finderProfileCourseLoader.getLastBuffer(), finderProfileCourseLoader.getContextObj(), 2);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genRefreshCgi() {
        com.tencent.mm.plugin.finder.feed.model.FinderProfileCourseLoader finderProfileCourseLoader = this.f107801d;
        return new bq.n(finderProfileCourseLoader.f107575d, null, finderProfileCourseLoader.getContextObj(), 0);
    }
}
