package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class g implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.m f189406a;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.m mVar) {
        this.f189406a = mVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        com.p314xaae8f345.mm.p944x882e457a.f fVar2 = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdInfoPreLoader", "errType: " + fVar2.f152148a + " erroCode:" + fVar2.f152149b);
        int i17 = fVar2.f152148a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.m mVar = this.f189406a;
        if (i17 != 0 || fVar2.f152149b != 0 || (fVar = fVar2.f152151d) == null) {
            mVar.f189699m.clear();
            return jz5.f0.f384359a;
        }
        java.util.LinkedList<r45.dl2> m75941xfb821914 = ((r45.ov0) fVar).m75941xfb821914(1);
        if (m75941xfb821914 == null) {
            return null;
        }
        mVar.getClass();
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (r45.dl2 dl2Var : m75941xfb821914) {
                mVar.c(dl2Var, arrayList);
                mVar.d(dl2Var, arrayList2);
                mVar.f189699m.remove(java.lang.Long.valueOf(dl2Var.m75942xfb822ef2(0)));
                mVar.f189700n.add(java.lang.Long.valueOf(dl2Var.m75942xfb822ef2(0)));
            }
            mVar.h(arrayList, arrayList2);
            return m75941xfb821914;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.AdInfoPreLoader", e17, "FinderAdInfoPreLoader exception", new java.lang.Object[0]);
            return m75941xfb821914;
        }
    }
}
