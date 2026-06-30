package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class iy implements i35.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.pz f107056d;

    public iy(com.tencent.mm.plugin.finder.feed.pz pzVar) {
        this.f107056d = pzVar;
    }

    @Override // i35.e
    public final void K0(java.lang.String str, int i17, r45.g25 g25Var) {
        java.lang.Object obj;
        com.tencent.mm.plugin.finder.feed.pz pzVar = this.f107056d;
        com.tencent.mars.xlog.Log.i(pzVar.U, "onDeleteContact: ret = " + i17 + ", oplogErrMsg = " + g25Var + ", bizUsername = " + str);
        if (i17 == 0) {
            java.util.Iterator it = pzVar.C.getDataListJustForAdapter().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                so2.j5 j5Var = (so2.j5) obj;
                boolean z17 = false;
                if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                    r45.xk bizInfo = ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject().getBizInfo();
                    if (kotlin.jvm.internal.o.b(bizInfo != null ? bizInfo.getString(0) : null, str)) {
                        z17 = true;
                    }
                }
                if (z17) {
                    break;
                }
            }
            so2.j5 j5Var2 = (so2.j5) obj;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = j5Var2 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var2 : null;
            if (baseFinderFeed != null) {
                java.lang.String str2 = pzVar.U;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDeleteContact: biz nickname = ");
                r45.xk bizInfo2 = baseFinderFeed.getFeedObject().getBizInfo();
                sb6.append(bizInfo2 != null ? bizInfo2.getString(1) : null);
                com.tencent.mars.xlog.Log.i(str2, sb6.toString());
                ((nv2.v) ((nv2.g0) i95.n0.c(nv2.g0.class))).Ai(1, baseFinderFeed.getFeedObject().getUserName(), true);
            }
            kotlin.jvm.internal.o.d(str);
            com.tencent.mm.plugin.finder.feed.pz.L0(pzVar, str);
        }
    }
}
