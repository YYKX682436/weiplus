package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes.dex */
public final class d6 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f102085a;

    public d6(java.util.LinkedList linkedList) {
        this.f102085a = linkedList;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70616b;
        java.util.LinkedList linkedList = this.f102085a;
        if (i17 == 0 && fVar.f70615a == 0) {
            com.tencent.mars.xlog.Log.i("Finder.FinderShareManager", "liveShareStatsReport successfully! size=" + linkedList.size());
        } else {
            com.tencent.mars.xlog.Log.w("Finder.FinderShareManager", "liveShareStatsReport fail to report! size=" + linkedList.size());
        }
        return jz5.f0.f302826a;
    }
}
