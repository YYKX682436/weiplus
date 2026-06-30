package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class s6 extends com.tencent.mm.plugin.finder.feed.model.internal.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderProfileNativeDramaLoader f108332d;

    public s6(com.tencent.mm.plugin.finder.feed.model.FinderProfileNativeDramaLoader finderProfileNativeDramaLoader) {
        this.f108332d = finderProfileNativeDramaLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse callInit() {
        com.tencent.mm.plugin.finder.feed.model.t6 t6Var = new com.tencent.mm.plugin.finder.feed.model.t6(0, 0, "");
        com.tencent.mm.plugin.finder.feed.model.FinderProfileNativeDramaLoader finderProfileNativeDramaLoader = this.f108332d;
        t6Var.setIncrementList(finderProfileNativeDramaLoader.f107596f);
        t6Var.setLastBuffer(finderProfileNativeDramaLoader.f107597g);
        return t6Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.i iVar, com.tencent.mm.protobuf.f fVar) {
        if (!(iVar instanceof bq.d1) || !(fVar instanceof r45.ak2)) {
            return null;
        }
        com.tencent.mm.plugin.finder.feed.model.t6 t6Var = new com.tencent.mm.plugin.finder.feed.model.t6(i17, i18, str);
        r45.ak2 ak2Var = (r45.ak2) fVar;
        t6Var.setLastBuffer(ak2Var.getByteString(3));
        java.util.LinkedList<r45.qj2> list = ak2Var.getList(1);
        kotlin.jvm.internal.o.f(list, "getDrama_list(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (r45.qj2 qj2Var : list) {
            kotlin.jvm.internal.o.d(qj2Var);
            arrayList.add(new zb2.a(qj2Var));
        }
        t6Var.setIncrementList(arrayList);
        t6Var.setHasMore(ak2Var.getBoolean(2));
        t6Var.setPullType(((bq.d1) iVar).f23482o);
        return t6Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genLoadMoreCgi() {
        com.tencent.mm.plugin.finder.feed.model.FinderProfileNativeDramaLoader finderProfileNativeDramaLoader = this.f108332d;
        return new bq.d1(finderProfileNativeDramaLoader.getContextObj(), finderProfileNativeDramaLoader.f107594d, 2, finderProfileNativeDramaLoader.getLastBuffer());
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genRefreshCgi() {
        com.tencent.mm.plugin.finder.feed.model.FinderProfileNativeDramaLoader finderProfileNativeDramaLoader = this.f108332d;
        return new bq.d1(finderProfileNativeDramaLoader.getContextObj(), finderProfileNativeDramaLoader.f107594d, 0, null);
    }
}
