package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class h4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCommentDrawer f106895d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f106896e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f106897f;

    public h4(com.tencent.mm.plugin.finder.view.FinderCommentDrawer finderCommentDrawer, int i17, com.tencent.mm.plugin.finder.feed.a7 a7Var) {
        this.f106895d = finderCommentDrawer;
        this.f106896e = i17;
        this.f106897f = a7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        com.tencent.mm.plugin.finder.view.FinderCommentDrawer finderCommentDrawer = this.f106895d;
        if (finderCommentDrawer.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON java.lang.String() == 4 || finderCommentDrawer.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON java.lang.String() == 10001 || finderCommentDrawer.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON java.lang.String() == 5 || (i17 = this.f106896e) <= 0) {
            return;
        }
        com.tencent.mm.plugin.finder.feed.a7 a7Var = this.f106897f;
        if (i17 < a7Var.f106210g.h()) {
            yw2.a0 a0Var = a7Var.f106216o;
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = (a0Var == null || (recyclerView = a0Var.s().getRecyclerView()) == null) ? null : recyclerView.getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$onAttach$8", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            linearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$onAttach$8", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
    }
}
