package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class wn implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.co f111002d;

    public wn(com.tencent.mm.plugin.finder.feed.co coVar) {
        this.f111002d = coVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.l95 l95Var;
        r45.e95 e95Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (so2.j5 j5Var : this.f111002d.z().f107156e.getDataListJustForAdapter()) {
            if (j5Var instanceof so2.m4) {
                so2.m4 m4Var = (so2.m4) j5Var;
                if (m4Var.f410482e) {
                    r45.v96 v96Var = (r45.v96) m4Var.f410481d.getCustom(0);
                    java.lang.String str = (v96Var == null || (l95Var = v96Var.f388009d) == null || (e95Var = l95Var.f379241d) == null) ? null : e95Var.f373164d;
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
            }
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderPoiRelateUIContract", "[handleComplete], " + arrayList);
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.finder.feed.vn(arrayList, this.f111002d));
    }
}
