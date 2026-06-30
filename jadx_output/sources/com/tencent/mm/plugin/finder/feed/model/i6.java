package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class i6 extends com.tencent.mm.plugin.finder.feed.model.internal.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader f107943d;

    public i6(com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader finderProfileDraftLoader) {
        this.f107943d = finderProfileDraftLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse callInit() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader finderProfileDraftLoader = this.f107943d;
        java.lang.String str = finderProfileDraftLoader.f107580d;
        if (str == null) {
            str = "";
        }
        java.util.ArrayList c17 = com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader.c(finderProfileDraftLoader, arrayList, str);
        com.tencent.mars.xlog.Log.i(getTAG(), "callInit size:" + c17.size());
        com.tencent.mm.plugin.finder.feed.model.h6 h6Var = new com.tencent.mm.plugin.finder.feed.model.h6(0, 0, "", false, 8, null);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = c17.iterator();
        while (it.hasNext()) {
            arrayList2.add(new so2.k0((com.tencent.mm.plugin.finder.storage.x80) it.next()));
        }
        h6Var.setIncrementList(arrayList2);
        h6Var.setLastBuffer(null);
        h6Var.setHasMore(true);
        return h6Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.i iVar, com.tencent.mm.protobuf.f fVar) {
        java.util.ArrayList d17;
        if (!(iVar instanceof bq.o0) || !(fVar instanceof r45.l81)) {
            return null;
        }
        boolean z17 = false;
        boolean z18 = (i17 == 0 && i18 == 0 && ((r45.l81) fVar).f379224f == 0) ? false : true;
        com.tencent.mm.plugin.finder.feed.model.h6 h6Var = new com.tencent.mm.plugin.finder.feed.model.h6(i17, i18, str, false, 8, null);
        r45.l81 l81Var = (r45.l81) fVar;
        h6Var.setHasMore(l81Var.f379224f == 1);
        h6Var.setLastBuffer(l81Var.f379223e);
        bq.o0 o0Var = (bq.o0) iVar;
        h6Var.setPullType(o0Var.f23501o);
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127957u).getValue()).r()).intValue() == 0) {
            h6Var.setHasMore(false);
            d17 = new java.util.ArrayList();
        } else {
            cu2.o oVar = cu2.o.f222430a;
            java.util.LinkedList object = l81Var.f379222d;
            kotlin.jvm.internal.o.f(object, "object");
            d17 = oVar.d(object);
            z17 = z18;
        }
        int i19 = o0Var.f23501o;
        com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader finderProfileDraftLoader = this.f107943d;
        if (i19 == 1) {
            java.lang.String str2 = finderProfileDraftLoader.f107580d;
            if (str2 == null) {
                str2 = "";
            }
            d17 = com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader.c(finderProfileDraftLoader, d17, str2);
        }
        com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader.d(finderProfileDraftLoader, z17, d17);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(d17, 10));
        java.util.Iterator it = d17.iterator();
        while (it.hasNext()) {
            arrayList.add(new so2.k0((com.tencent.mm.plugin.finder.storage.x80) it.next()));
        }
        h6Var.setIncrementList(arrayList);
        java.lang.String tag = getTAG();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("response.incrementList size:");
        java.util.List incrementList = h6Var.getIncrementList();
        sb6.append(incrementList != null ? java.lang.Integer.valueOf(incrementList.size()) : null);
        com.tencent.mars.xlog.Log.i(tag, sb6.toString());
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genLoadMoreCgi() {
        com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader finderProfileDraftLoader = this.f107943d;
        if (kotlin.jvm.internal.o.b(xy2.c.f(finderProfileDraftLoader.getContextObj()), finderProfileDraftLoader.f107580d)) {
            return new bq.o0(finderProfileDraftLoader.f107580d, finderProfileDraftLoader.getLastBuffer(), 2, finderProfileDraftLoader.getContextObj());
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genRefreshCgi() {
        com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader finderProfileDraftLoader = this.f107943d;
        if (kotlin.jvm.internal.o.b(xy2.c.f(finderProfileDraftLoader.getContextObj()), finderProfileDraftLoader.f107580d)) {
            return new bq.o0(finderProfileDraftLoader.f107580d, null, 1, finderProfileDraftLoader.getContextObj());
        }
        return null;
    }
}
