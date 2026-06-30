package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class r2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager f110475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderFloatBallDetailLoader f110476e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderFloatBallDetailUI f110477f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f110478g;

    public r2(com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager, com.tencent.mm.plugin.finder.feed.model.FinderFloatBallDetailLoader finderFloatBallDetailLoader, com.tencent.mm.plugin.finder.feed.ui.FinderFloatBallDetailUI finderFloatBallDetailUI, androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f110475d = finderLinearLayoutManager;
        this.f110476e = finderFloatBallDetailLoader;
        this.f110477f = finderFloatBallDetailUI;
        this.f110478g = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = this.f110475d;
        int initPos = this.f110476e.getInitPos();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        arrayList.add(java.lang.Integer.valueOf(initPos));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(finderLinearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderFloatBallDetailUI$initOnCreate$1$1$call$1$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        finderLinearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(finderLinearLayoutManager, "com/tencent/mm/plugin/finder/feed/ui/FinderFloatBallDetailUI$initOnCreate$1$1$call$1$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        long longExtra = this.f110477f.getIntent().getLongExtra("KEY_VIDEO_START_PLAY_TIME_MS", 0L);
        if (longExtra > 0) {
            pm0.v.V(0L, new com.tencent.mm.plugin.finder.feed.ui.q2(this.f110475d, this.f110478g, this.f110477f, longExtra));
        }
    }
}
