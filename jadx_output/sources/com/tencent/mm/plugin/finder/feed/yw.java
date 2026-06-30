package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class yw extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.pz f111210d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader f111211e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f111212f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw(com.tencent.mm.plugin.finder.feed.pz pzVar, com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader, int i17) {
        super(0);
        this.f111210d = pzVar;
        this.f111211e = finderTimelineFeedLoader;
        this.f111212f = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment;
        long j17;
        com.tencent.mm.plugin.finder.feed.ct ctVar;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.RecyclerView recyclerView2;
        androidx.recyclerview.widget.RecyclerView recyclerView3;
        dw2.c0 c0Var;
        androidx.recyclerview.widget.RecyclerView recyclerView4;
        com.tencent.mm.plugin.finder.feed.pz pzVar = this.f111210d;
        com.tencent.mm.plugin.finder.feed.ct ctVar2 = pzVar.f108759m;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = (ctVar2 == null || (recyclerView4 = ((com.tencent.mm.plugin.finder.feed.v00) ctVar2).getRecyclerView()) == null) ? null : recyclerView4.getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager;
        com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader = this.f111211e;
        eb2.f0 f0Var = finderTimelineFeedLoader.f107650f;
        boolean z17 = false;
        boolean z18 = (f0Var != null && f0Var.f250753l) && (finderTimelineFeedLoader.getDataList().isEmpty() ^ true);
        int i17 = pzVar.f108762p;
        boolean z19 = ((z18 || pzVar.c1()) && !finderTimelineFeedLoader.f107656o && i17 == 4) || ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127712g7).getValue()).r()).intValue() == 1;
        boolean z27 = pzVar.f108765q;
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment2 = pzVar.f108756h;
        if (z27 && !z19 && (c0Var = pzVar.F.f223703n) != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(finderHomeTabFragment2 != null ? finderHomeTabFragment2.getClass().getSimpleName() : null);
            sb6.append("#onAttach");
            dw2.c0.h(c0Var, sb6.toString(), true, false, 4, null);
        }
        ey2.o0 o0Var = pzVar.f108761o;
        if (o0Var != null) {
            com.tencent.mm.plugin.finder.feed.ct ctVar3 = pzVar.f108759m;
            androidx.recyclerview.widget.f2 adapter = (ctVar3 == null || (recyclerView3 = ((com.tencent.mm.plugin.finder.feed.v00) ctVar3).getRecyclerView()) == null) ? null : recyclerView3.getAdapter();
            kotlin.jvm.internal.o.e(adapter, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.RecyclerViewAdapterEx<@[FlexibleNullability] androidx.recyclerview.widget.RecyclerView.ViewHolder?>");
            int a07 = o0Var.f257445e + ((in5.n0) adapter).a0();
            int i18 = o0Var.f257446f;
            java.lang.String f123427d = finderTimelineFeedLoader.getF123427d();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("TimelineInit initdone: canTimelineRefresh=");
            sb7.append(pzVar.f108765q);
            sb7.append(", isUnLock=");
            sb7.append(z19);
            sb7.append("enableExitFeedReplaceFirst=");
            jz5.g gVar = finderTimelineFeedLoader.f107661t;
            sb7.append(((java.lang.Boolean) ((jz5.n) gVar).getValue()).booleanValue());
            sb7.append(", tabType=");
            sb7.append(i17);
            sb7.append("  lastPos=");
            sb7.append(a07);
            sb7.append(" fromTopPixel=");
            sb7.append(i18);
            sb7.append(" incrementCount:");
            sb7.append(this.f111212f);
            com.tencent.mars.xlog.Log.i(f123427d, sb7.toString());
            if (a07 <= 0 || o0Var.f257445e >= finderTimelineFeedLoader.getDataList().size() || (((java.lang.Boolean) ((jz5.n) gVar).getValue()).booleanValue() && pzVar.f108765q)) {
                finderHomeTabFragment = finderHomeTabFragment2;
                j17 = 0;
                pzVar.a1(0L, false);
            } else {
                java.lang.Object obj = finderTimelineFeedLoader.getDataList().get(o0Var.f257445e);
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj : null;
                if (baseFinderFeed != null) {
                    baseFinderFeed.G1(1);
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i18));
                arrayList.add(java.lang.Integer.valueOf(a07));
                java.util.Collections.reverse(arrayList);
                finderHomeTabFragment = finderHomeTabFragment2;
                yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter$feedLoader$2$2$call$1", "invoke", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                linearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
                yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter$feedLoader$2$2$call$1", "invoke", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                com.tencent.mm.plugin.finder.feed.ct ctVar4 = pzVar.f108759m;
                if (ctVar4 != null && (recyclerView2 = ((com.tencent.mm.plugin.finder.feed.v00) ctVar4).getRecyclerView()) != null) {
                    recyclerView2.post(new com.tencent.mm.plugin.finder.feed.vw(linearLayoutManager, a07, i18));
                }
                j17 = 0;
            }
            ym5.s3 s3Var = (ym5.s3) com.tencent.mm.plugin.finder.feed.pz.N1.get(pzVar.S0());
            if (s3Var != null && !s3Var.f463521f) {
                pzVar.Q0(s3Var, false);
            }
            pzVar.O0(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        } else {
            finderHomeTabFragment = finderHomeTabFragment2;
            j17 = 0;
        }
        if (i17 == com.tencent.mm.plugin.finder.convert.dv.f103202d && (ctVar = pzVar.f108759m) != null && (recyclerView = ((com.tencent.mm.plugin.finder.feed.v00) ctVar).getRecyclerView()) != null) {
            androidx.recyclerview.widget.f2 adapter2 = recyclerView.getAdapter();
            int itemCount = adapter2 != null ? adapter2.getItemCount() : 0;
            int i19 = com.tencent.mm.plugin.finder.convert.dv.f103203e;
            if (i19 >= 0 && i19 < itemCount) {
                z17 = true;
            }
            if (z17) {
                recyclerView.post(new com.tencent.mm.plugin.finder.feed.ww(recyclerView, i19, pzVar));
            }
        }
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment3 = finderHomeTabFragment;
        if (finderHomeTabFragment3 != null) {
            pm0.v.V(j17, new com.tencent.mm.plugin.finder.feed.xw(finderHomeTabFragment3, pzVar));
        }
        return jz5.f0.f302826a;
    }
}
