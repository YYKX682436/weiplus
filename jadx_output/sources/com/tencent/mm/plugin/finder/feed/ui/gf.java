package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class gf extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveWhiteListUI f110085d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf(com.tencent.mm.plugin.finder.feed.ui.FinderLiveWhiteListUI finderLiveWhiteListUI) {
        super(0);
        this.f110085d = finderLiveWhiteListUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.plugin.finder.feed.ui.FinderLiveWhiteListUI.F;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("before updateChooseList size:");
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveWhiteListUI finderLiveWhiteListUI = this.f110085d;
        java.util.LinkedList linkedList = finderLiveWhiteListUI.B;
        sb6.append(linkedList.size());
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveWhiteListUI", sb6.toString());
        linkedList.clear();
        for (bm2.r8 r8Var : finderLiveWhiteListUI.E) {
            if (r8Var.f22278a) {
                linkedList.add(r8Var.f22279b);
            }
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveWhiteListUI", "after updateChooseList size:" + linkedList.size());
        finderLiveWhiteListUI.e7();
        return jz5.f0.f302826a;
    }
}
