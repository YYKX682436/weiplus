package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class dw implements ym5.q1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.pz f106589d;

    public dw(com.tencent.mm.plugin.finder.feed.pz pzVar) {
        this.f106589d = pzVar;
    }

    @Override // ym5.m1
    public void onChanged() {
        com.tencent.mm.plugin.finder.feed.ct ctVar = this.f106589d.f108759m;
        if (ctVar != null) {
            ((com.tencent.mm.plugin.finder.feed.v00) ctVar).l().onChanged();
        }
    }

    @Override // ym5.m1
    public void onItemRangeChanged(int i17, int i18) {
        com.tencent.mm.plugin.finder.feed.pz pzVar = this.f106589d;
        com.tencent.mm.plugin.finder.feed.ct ctVar = pzVar.f108759m;
        if (ctVar != null) {
            com.tencent.mm.view.RefreshLoadMoreLayout l17 = ((com.tencent.mm.plugin.finder.feed.v00) ctVar).l();
            in5.n0 T0 = pzVar.T0();
            l17.onItemRangeChanged(i17 + (T0 != null ? T0.a0() : 0), i18);
        }
    }

    @Override // ym5.m1
    public void onItemRangeInserted(int i17, int i18) {
        com.tencent.mm.plugin.finder.feed.pz pzVar = this.f106589d;
        com.tencent.mm.plugin.finder.feed.ct ctVar = pzVar.f108759m;
        if (ctVar != null) {
            com.tencent.mm.view.RefreshLoadMoreLayout l17 = ((com.tencent.mm.plugin.finder.feed.v00) ctVar).l();
            in5.n0 T0 = pzVar.T0();
            l17.onItemRangeInserted(i17 + (T0 != null ? T0.a0() : 0), i18);
        }
    }

    @Override // ym5.m1
    public void onItemRangeMoved(int i17, int i18, int i19) {
        com.tencent.mm.plugin.finder.feed.pz pzVar = this.f106589d;
        com.tencent.mm.plugin.finder.feed.ct ctVar = pzVar.f108759m;
        if (ctVar != null) {
            com.tencent.mm.view.RefreshLoadMoreLayout l17 = ((com.tencent.mm.plugin.finder.feed.v00) ctVar).l();
            in5.n0 T0 = pzVar.T0();
            int a07 = i17 + (T0 != null ? T0.a0() : 0);
            in5.n0 T02 = pzVar.T0();
            l17.onItemRangeMoved(a07, i18 + (T02 != null ? T02.a0() : 0), i19);
        }
    }

    @Override // ym5.m1
    public void onItemRangeRemoved(int i17, int i18) {
        com.tencent.mm.plugin.finder.feed.pz pzVar = this.f106589d;
        com.tencent.mm.plugin.finder.feed.ct ctVar = pzVar.f108759m;
        if (ctVar != null) {
            com.tencent.mm.view.RefreshLoadMoreLayout l17 = ((com.tencent.mm.plugin.finder.feed.v00) ctVar).l();
            in5.n0 T0 = pzVar.T0();
            l17.onItemRangeRemoved(i17 + (T0 != null ? T0.a0() : 0), i18);
        }
    }

    @Override // ym5.p1
    public void onPreFinishLoadMore(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.plugin.finder.feed.pz pzVar = this.f106589d;
        com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader = pzVar.C;
        if (!(finderTimelineFeedLoader instanceof com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader)) {
            finderTimelineFeedLoader = null;
        }
        if (finderTimelineFeedLoader != null) {
            finderTimelineFeedLoader.f107659r = 0;
        }
        com.tencent.mm.plugin.finder.feed.ct ctVar = pzVar.f108759m;
        if (ctVar != null) {
            ((com.tencent.mm.plugin.finder.feed.v00) ctVar).l().O(reason);
        }
    }

    @Override // ym5.p1
    public void onPreFinishLoadMoreSmooth(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.plugin.finder.feed.pz pzVar = this.f106589d;
        com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader = pzVar.C;
        if (!(finderTimelineFeedLoader instanceof com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader)) {
            finderTimelineFeedLoader = null;
        }
        if (finderTimelineFeedLoader != null) {
            finderTimelineFeedLoader.f107659r = 0;
        }
        com.tencent.mm.plugin.finder.feed.ct ctVar = pzVar.f108759m;
        if (ctVar != null) {
            ((com.tencent.mm.plugin.finder.feed.v00) ctVar).l().onPreFinishLoadMoreSmooth(reason);
        }
    }

    @Override // ym5.p1
    public void onPreFinishRefresh(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f128050z2).getValue()).r()).intValue();
        com.tencent.mm.plugin.finder.feed.pz pzVar = this.f106589d;
        if (intValue == 1) {
            java.util.ArrayList dataList = pzVar.C.getDataList();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = dataList.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                so2.j5 j5Var = (so2.j5) next;
                if ((j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) && ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getShowCommentEdu()) {
                    arrayList.add(next);
                }
            }
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                so2.j5 j5Var2 = (so2.j5) it6.next();
                kotlin.jvm.internal.o.e(j5Var2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
                long j17 = ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var2).getFeedObject().field_id;
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            }
        }
        if (pzVar.f108762p == 3 && reason.f463523h <= 0) {
            java.lang.Object obj = reason.f463519d;
            com.tencent.mm.plugin.finder.feed.model.internal.u0 u0Var = obj instanceof com.tencent.mm.plugin.finder.feed.model.internal.u0 ? (com.tencent.mm.plugin.finder.feed.model.internal.u0) obj : null;
            if (u0Var != null && u0Var.f108056e) {
                com.tencent.mars.xlog.Log.i(pzVar.U, "[checkDataReplace] data replace true");
                reason.f463523h++;
            }
        }
        com.tencent.mm.plugin.finder.feed.ct ctVar = pzVar.f108759m;
        if (ctVar != null) {
            ((com.tencent.mm.plugin.finder.feed.v00) ctVar).l().Q(reason);
        }
        if (pzVar.f108767s) {
            pzVar.f108767s = false;
            com.tencent.mm.ui.MMActivity activity = pzVar.f108755g;
            kotlin.jvm.internal.o.g(activity, "activity");
            ((com.tencent.mm.plugin.finder.viewmodel.component.h80) ((zy2.rb) pf5.z.f353948a.a(activity).c(zy2.rb.class))).O6();
        }
        pzVar.N0();
    }

    @Override // ym5.m1
    public void onItemRangeChanged(int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.finder.feed.pz pzVar = this.f106589d;
        com.tencent.mm.plugin.finder.feed.ct ctVar = pzVar.f108759m;
        if (ctVar != null) {
            com.tencent.mm.view.RefreshLoadMoreLayout l17 = ((com.tencent.mm.plugin.finder.feed.v00) ctVar).l();
            in5.n0 T0 = pzVar.T0();
            l17.onItemRangeChanged(i17 + (T0 != null ? T0.a0() : 0), i18, obj);
        }
    }
}
