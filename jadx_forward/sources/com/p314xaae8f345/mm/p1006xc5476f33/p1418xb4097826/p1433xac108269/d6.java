package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes.dex */
public final class d6 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f183618a;

    public d6(java.util.LinkedList linkedList) {
        this.f183618a = linkedList;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152149b;
        java.util.LinkedList linkedList = this.f183618a;
        if (i17 == 0 && fVar.f152148a == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderShareManager", "liveShareStatsReport successfully! size=" + linkedList.size());
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderShareManager", "liveShareStatsReport fail to report! size=" + linkedList.size());
        }
        return jz5.f0.f384359a;
    }
}
