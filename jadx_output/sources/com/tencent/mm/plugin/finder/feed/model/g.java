package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class g implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.m f107873a;

    public g(com.tencent.mm.plugin.finder.feed.model.m mVar) {
        this.f107873a = mVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.protobuf.f fVar;
        com.tencent.mm.modelbase.f fVar2 = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("Finder.AdInfoPreLoader", "errType: " + fVar2.f70615a + " erroCode:" + fVar2.f70616b);
        int i17 = fVar2.f70615a;
        com.tencent.mm.plugin.finder.feed.model.m mVar = this.f107873a;
        if (i17 != 0 || fVar2.f70616b != 0 || (fVar = fVar2.f70618d) == null) {
            mVar.f108166m.clear();
            return jz5.f0.f302826a;
        }
        java.util.LinkedList<r45.dl2> list = ((r45.ov0) fVar).getList(1);
        if (list == null) {
            return null;
        }
        mVar.getClass();
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (r45.dl2 dl2Var : list) {
                mVar.c(dl2Var, arrayList);
                mVar.d(dl2Var, arrayList2);
                mVar.f108166m.remove(java.lang.Long.valueOf(dl2Var.getLong(0)));
                mVar.f108167n.add(java.lang.Long.valueOf(dl2Var.getLong(0)));
            }
            mVar.h(arrayList, arrayList2);
            return list;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.AdInfoPreLoader", e17, "FinderAdInfoPreLoader exception", new java.lang.Object[0]);
            return list;
        }
    }
}
