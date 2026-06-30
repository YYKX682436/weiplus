package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class a implements com.tencent.mm.plugin.finder.feed.model.internal.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.BizProfileTimelineUI f109638a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.biz.FinderBizProfileLoader f109639b;

    public a(com.tencent.mm.plugin.finder.feed.ui.BizProfileTimelineUI bizProfileTimelineUI, com.tencent.mm.plugin.finder.biz.FinderBizProfileLoader finderBizProfileLoader) {
        this.f109638a = bizProfileTimelineUI;
        this.f109639b = finderBizProfileLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.q0
    public void call(int i17) {
        com.tencent.mm.plugin.finder.feed.ui.BizProfileTimelineUI bizProfileTimelineUI = this.f109638a;
        ab2.h0 h0Var = bizProfileTimelineUI.f109196y;
        if (h0Var == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = h0Var.getRecyclerView().getLayoutManager();
        com.tencent.mm.plugin.finder.biz.FinderBizProfileLoader finderBizProfileLoader = this.f109639b;
        if (layoutManager != null) {
            com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager;
            int initPos = finderBizProfileLoader.getInitPos();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            arrayList.add(java.lang.Integer.valueOf(initPos));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(finderLinearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/BizProfileTimelineUI$initOnCreate$1$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            finderLinearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(finderLinearLayoutManager, "com/tencent/mm/plugin/finder/feed/ui/BizProfileTimelineUI$initOnCreate$1$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
        java.util.AbstractCollection<so2.j5> dataList = finderBizProfileLoader.getDataList();
        bizProfileTimelineUI.getClass();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (so2.j5 j5Var : dataList) {
            com.tencent.mm.plugin.finder.storage.FinderItem feedObject = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject() : null;
            if (feedObject != null) {
                arrayList2.add(feedObject);
            }
        }
        pf5.u uVar = pf5.u.f353936a;
        androidx.lifecycle.c1 a17 = uVar.e(zy2.b6.class).a(xc2.k0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        xc2.k0.f7((xc2.k0) a17, arrayList2, 120, null, 0, null, null, 60, null);
        com.tencent.mm.plugin.finder.viewmodel.component.gg ggVar = (com.tencent.mm.plugin.finder.viewmodel.component.gg) uVar.c(bizProfileTimelineUI).a(com.tencent.mm.plugin.finder.viewmodel.component.gg.class);
        ab2.h0 h0Var2 = bizProfileTimelineUI.f109196y;
        if (h0Var2 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        ggVar.Q6(h0Var2.getRecyclerView());
    }
}
