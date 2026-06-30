package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class uj implements com.tencent.mm.plugin.finder.feed.model.internal.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderRingtoneTimelineUI f110617a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderRingtoneTimelineLoader f110618b;

    public uj(com.tencent.mm.plugin.finder.feed.ui.FinderRingtoneTimelineUI finderRingtoneTimelineUI, com.tencent.mm.plugin.finder.feed.model.FinderRingtoneTimelineLoader finderRingtoneTimelineLoader) {
        this.f110617a = finderRingtoneTimelineUI;
        this.f110618b = finderRingtoneTimelineLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.q0
    public void call(int i17) {
        com.tencent.mm.plugin.finder.feed.ui.FinderRingtoneTimelineUI finderRingtoneTimelineUI = this.f110617a;
        com.tencent.mm.plugin.finder.feed.os osVar = finderRingtoneTimelineUI.f109534x;
        if (osVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        com.tencent.mm.plugin.finder.feed.model.FinderRingtoneTimelineLoader finderRingtoneTimelineLoader = this.f110618b;
        osVar.A = finderRingtoneTimelineLoader.getInitPos();
        com.tencent.mm.plugin.finder.feed.ps psVar = finderRingtoneTimelineUI.f109535y;
        if (psVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = psVar.getRecyclerView().getLayoutManager();
        if (layoutManager != null) {
            com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager;
            int initPos = finderRingtoneTimelineLoader.getInitPos();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            arrayList.add(java.lang.Integer.valueOf(initPos));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(finderLinearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI$initData$3$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            finderLinearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(finderLinearLayoutManager, "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI$initData$3$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
    }
}
