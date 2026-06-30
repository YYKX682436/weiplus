package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class ni implements com.tencent.mm.plugin.finder.feed.model.internal.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewFeedLoader f110345a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewUI f110346b;

    public ni(com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewFeedLoader finderPostPreviewFeedLoader, com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewUI finderPostPreviewUI) {
        this.f110345a = finderPostPreviewFeedLoader;
        this.f110346b = finderPostPreviewUI;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.q0
    public void call(int i17) {
        com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewFeedLoader finderPostPreviewFeedLoader = this.f110345a;
        java.lang.Object Z = kz5.n0.Z(finderPostPreviewFeedLoader.getDataList());
        so2.u1 u1Var = Z instanceof so2.u1 ? (so2.u1) Z : null;
        com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewUI finderPostPreviewUI = this.f110346b;
        if (u1Var != null) {
            u1Var.getFeedObject().setPostFinish();
            r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(u1Var.getFeedObject().getMediaList());
            if (mb4Var != null && u1Var.getIsPreview() && ((r45.h70) mb4Var.getCustom(21)) != null) {
                r45.h70 h70Var = (r45.h70) mb4Var.getCustom(21);
                kotlin.jvm.internal.o.d(h70Var);
                r45.i70 i70Var = h70Var.f375902i;
                kotlin.jvm.internal.o.d(i70Var);
                if (i70Var.f376794z != null) {
                    if (finderPostPreviewUI.P) {
                        android.graphics.Rect rect = new android.graphics.Rect();
                        bg0.v vVar = (bg0.v) i95.n0.c(bg0.v.class);
                        r45.vl5 vl5Var = i70Var.f376794z.f390730d;
                        ((b92.u2) vVar).getClass();
                        com.tencent.mm.plugin.vlog.model.x.f(vl5Var, rect);
                        mb4Var.set(4, java.lang.Float.valueOf(rect.width()));
                        mb4Var.set(5, java.lang.Float.valueOf(rect.height()));
                    } else {
                        android.graphics.Rect rect2 = new android.graphics.Rect();
                        bg0.v vVar2 = (bg0.v) i95.n0.c(bg0.v.class);
                        r45.vl5 vl5Var2 = i70Var.A.f390730d;
                        ((b92.u2) vVar2).getClass();
                        com.tencent.mm.plugin.vlog.model.x.f(vl5Var2, rect2);
                        mb4Var.set(4, java.lang.Float.valueOf(rect2.width()));
                        mb4Var.set(5, java.lang.Float.valueOf(rect2.height()));
                    }
                } else if (finderPostPreviewUI.P) {
                    mb4Var.set(4, java.lang.Float.valueOf(i70Var.f376776e));
                    mb4Var.set(5, java.lang.Float.valueOf(i70Var.f376777f));
                } else {
                    android.graphics.Rect rect3 = new android.graphics.Rect();
                    bg0.v vVar3 = (bg0.v) i95.n0.c(bg0.v.class);
                    r45.vl5 vl5Var3 = i70Var.f376778g;
                    ((b92.u2) vVar3).getClass();
                    com.tencent.mm.plugin.vlog.model.x.f(vl5Var3, rect3);
                    mb4Var.set(4, java.lang.Float.valueOf(rect3.width()));
                    mb4Var.set(5, java.lang.Float.valueOf(rect3.height()));
                }
            }
        }
        java.lang.Object Z2 = kz5.n0.Z(finderPostPreviewFeedLoader.getDataList());
        so2.d1 d1Var = Z2 instanceof so2.d1 ? (so2.d1) Z2 : null;
        if (d1Var != null && d1Var.getIsPreview()) {
            d1Var.getFeedObject().setPostFinish();
        }
        com.tencent.mm.plugin.finder.feed.ap apVar = finderPostPreviewUI.f109503z;
        if (apVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = apVar.o().getRecyclerView().getLayoutManager();
        com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = layoutManager instanceof com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager ? (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager : null;
        if (finderLinearLayoutManager != null) {
            int initPos = finderPostPreviewFeedLoader.getInitPos();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            arrayList.add(java.lang.Integer.valueOf(initPos));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(finderLinearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI$initOnCreate$4$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            finderLinearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(finderLinearLayoutManager, "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI$initOnCreate$4$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            finderLinearLayoutManager.C = false;
        }
        java.lang.Object Z3 = kz5.n0.Z(finderPostPreviewFeedLoader.getDataList());
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = Z3 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) Z3 : null;
        if (baseFinderFeed != null && baseFinderFeed.getIsPreview()) {
            bg0.a0 a0Var = (bg0.a0) i95.n0.c(bg0.a0.class);
            int i18 = finderPostPreviewUI.P ? 1 : 2;
            ((b92.z2) a0Var).getClass();
            com.tencent.mm.autogen.mmdata.rpt.FinderPostPagePreviewStruct finderPostPagePreviewStruct = xo4.c.f455769a;
            finderPostPagePreviewStruct.f57551i = i18;
            finderPostPagePreviewStruct.f57552j = 2;
            finderPostPagePreviewStruct.k();
        }
        if (i17 > 0) {
            android.view.View findViewById = finderPostPreviewUI.findViewById(com.tencent.mm.R.id.imf);
            if (findViewById == null) {
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI$initOnCreate$4$1", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI$initOnCreate$4$1", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View findViewById2 = finderPostPreviewUI.findViewById(com.tencent.mm.R.id.imf);
        if (findViewById2 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI$initOnCreate$4$1", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI$initOnCreate$4$1", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById3 = finderPostPreviewUI.findViewById(com.tencent.mm.R.id.oai);
        if (findViewById3 == null) {
            return;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(findViewById3, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI$initOnCreate$4$1", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI$initOnCreate$4$1", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
