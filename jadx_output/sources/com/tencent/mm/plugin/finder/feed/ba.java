package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class ba extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.oa f106370d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader f106371e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f106372f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba(com.tencent.mm.plugin.finder.feed.oa oaVar, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader, int i17) {
        super(0);
        this.f106370d = oaVar;
        this.f106371e = baseFeedLoader;
        this.f106372f = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.RecyclerView recyclerView2;
        androidx.recyclerview.widget.RecyclerView recyclerView3;
        com.tencent.mm.plugin.finder.feed.oa oaVar = this.f106370d;
        com.tencent.mm.plugin.finder.feed.a1 a1Var = oaVar.f107157f;
        androidx.recyclerview.widget.f2 f2Var = null;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = (a1Var == null || (recyclerView3 = a1Var.getRecyclerView()) == null) ? null : recyclerView3.getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager");
        androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager = (androidx.recyclerview.widget.StaggeredGridLayoutManager) layoutManager;
        ey2.o0 o0Var = oaVar.f108629o;
        if (o0Var != null) {
            com.tencent.mm.plugin.finder.feed.a1 a1Var2 = oaVar.f107157f;
            if (a1Var2 != null && (recyclerView2 = a1Var2.getRecyclerView()) != null) {
                f2Var = recyclerView2.getAdapter();
            }
            kotlin.jvm.internal.o.e(f2Var, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.RecyclerViewAdapterEx<@[FlexibleNullability] androidx.recyclerview.widget.RecyclerView.ViewHolder?>");
            int a07 = ((in5.n0) f2Var).a0() + o0Var.f257445e;
            int i17 = o0Var.f257446f;
            com.tencent.mars.xlog.Log.i(this.f106371e.getF123427d(), "TimelineInit initdone canTimelineRefresh tabType=" + this.f106372f + ' ' + oaVar.f108628n + " lastPos:" + a07 + " fromTopPixel:" + i17);
            if (a07 > 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(a07));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(staggeredGridLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderFollowFeedUIContract$Presenter$2$1$call$1", "invoke", "()V", "Undefined", "scrollToPosition", "(I)V");
                staggeredGridLayoutManager.scrollToPosition(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(staggeredGridLayoutManager, "com/tencent/mm/plugin/finder/feed/FinderFollowFeedUIContract$Presenter$2$1$call$1", "invoke", "()V", "Undefined", "scrollToPosition", "(I)V");
                com.tencent.mm.plugin.finder.feed.a1 a1Var3 = oaVar.f107157f;
                if (a1Var3 != null && (recyclerView = a1Var3.getRecyclerView()) != null) {
                    recyclerView.post(new com.tencent.mm.plugin.finder.feed.aa(staggeredGridLayoutManager, a07, i17));
                }
            }
            ym5.s3 s3Var = (ym5.s3) oaVar.f108632r.get(oaVar.B());
            if (s3Var != null && !s3Var.f463521f) {
                oaVar.z(s3Var, false);
            }
        }
        return jz5.f0.f302826a;
    }
}
