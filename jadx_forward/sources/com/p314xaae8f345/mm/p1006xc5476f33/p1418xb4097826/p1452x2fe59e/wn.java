package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class wn implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.co f192535d;

    public wn(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.co coVar) {
        this.f192535d = coVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.l95 l95Var;
        r45.e95 e95Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (so2.j5 j5Var : this.f192535d.z().f188689e.m56388xcaeb60d0()) {
            if (j5Var instanceof so2.m4) {
                so2.m4 m4Var = (so2.m4) j5Var;
                if (m4Var.f492015e) {
                    r45.v96 v96Var = (r45.v96) m4Var.f492014d.m75936x14adae67(0);
                    java.lang.String str = (v96Var == null || (l95Var = v96Var.f469542d) == null || (e95Var = l95Var.f460774d) == null) ? null : e95Var.f454697d;
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPoiRelateUIContract", "[handleComplete], " + arrayList);
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.vn(arrayList, this.f192535d));
    }
}
