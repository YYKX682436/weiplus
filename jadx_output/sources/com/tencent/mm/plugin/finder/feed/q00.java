package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class q00 extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f108782a = true;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.v00 f108783b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f108784c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.h00 f108785d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f108786e;

    public q00(com.tencent.mm.plugin.finder.feed.v00 v00Var, androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.plugin.finder.feed.h00 h00Var, int i17) {
        this.f108783b = v00Var;
        this.f108784c = recyclerView;
        this.f108785d = h00Var;
        this.f108786e = i17;
    }

    @Override // ym5.q3
    public void a(int i17) {
        com.tencent.mm.plugin.finder.feed.v00 v00Var = this.f108783b;
        ym5.q3 q3Var = v00Var.f110857r;
        if (q3Var != null) {
            q3Var.a(i17);
        }
        if (!this.f108782a || i17 <= 0) {
            return;
        }
        com.tencent.mm.ui.MMActivity activity = v00Var.f110846d;
        kotlin.jvm.internal.o.g(activity, "activity");
        fc2.o d76 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).d7(((com.tencent.mm.plugin.finder.feed.pz) v00Var.f110847e).f108762p);
        if (d76 != null) {
            new fc2.i(d76).onScrollStateChanged(this.f108784c, 5);
        }
        this.f108782a = false;
    }

    @Override // ym5.q3
    public void b(int i17) {
        com.tencent.mm.view.RefreshLoadMoreLayout l17;
        com.tencent.mm.plugin.finder.feed.v00 v00Var = this.f108783b;
        ym5.q3 q3Var = v00Var.f110857r;
        if (q3Var != null) {
            q3Var.b(i17);
        }
        boolean z17 = i17 == 2;
        com.tencent.mm.plugin.finder.feed.pz pzVar = (com.tencent.mm.plugin.finder.feed.pz) v00Var.f110847e;
        com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader = pzVar.C;
        eb2.f0 f0Var = finderTimelineFeedLoader.f107650f;
        boolean z18 = f0Var != null && f0Var.f250753l;
        java.lang.String str = pzVar.U;
        if (z18 || (!finderTimelineFeedLoader.f107657p && finderTimelineFeedLoader.f107658q)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadMoreData: wait show unread feed refresh end, unreadForEnter:");
            eb2.f0 f0Var2 = finderTimelineFeedLoader.f107650f;
            sb6.append(f0Var2 != null ? java.lang.Boolean.valueOf(f0Var2.f250753l) : null);
            sb6.append(", unreadForTop:");
            sb6.append(finderTimelineFeedLoader.f107658q);
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            com.tencent.mm.plugin.finder.feed.ct ctVar = pzVar.f108759m;
            l17 = ctVar != null ? ((com.tencent.mm.plugin.finder.feed.v00) ctVar).l() : null;
            if (l17 == null) {
                return;
            }
            l17.setLoadingMore(false);
            return;
        }
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.r1().r()).booleanValue()) {
            com.tencent.mm.plugin.finder.feed.ct ctVar2 = pzVar.f108759m;
            if (ctVar2 != null && ((com.tencent.mm.plugin.finder.feed.v00) ctVar2).l().isRefreshing) {
                com.tencent.mm.plugin.finder.feed.ct ctVar3 = pzVar.f108759m;
                l17 = ctVar3 != null ? ((com.tencent.mm.plugin.finder.feed.v00) ctVar3).l() : null;
                if (l17 != null) {
                    l17.setLoadingMore(false);
                }
                com.tencent.mars.xlog.Log.w(str, "loadMoreData return for isRefreshing.");
                return;
            }
            if (!pzVar.b1()) {
                pzVar.j1(null, null, false, true);
                com.tencent.mm.plugin.finder.feed.ct ctVar4 = pzVar.f108759m;
                l17 = ctVar4 != null ? ((com.tencent.mm.plugin.finder.feed.v00) ctVar4).l() : null;
                if (l17 != null) {
                    l17.setLoadingMore(false);
                }
                com.tencent.mars.xlog.Log.w(str, "loadMoreData return for enter pull fail.");
                return;
            }
        }
        com.tencent.mm.plugin.finder.report.y0 y0Var = com.tencent.mm.plugin.finder.report.y0.f125442a;
        int V0 = pzVar.V0();
        boolean z19 = pzVar.B1;
        int X0 = pzVar.X0();
        com.tencent.mm.ui.MMActivity context = pzVar.f108755g;
        kotlin.jvm.internal.o.g(context, "context");
        if (!y0Var.a()) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[onLoadMoreStart] tabType:");
            int i18 = pzVar.f108762p;
            sb7.append(i18);
            sb7.append(" itemCount:");
            sb7.append(V0);
            sb7.append(" isAuto:");
            sb7.append(z19);
            sb7.append(" curPosition:");
            sb7.append(X0);
            com.tencent.mars.xlog.Log.i("Finder.HomeActionReporter", sb7.toString());
            com.tencent.mm.plugin.finder.report.y0.f125446e = i18;
            com.tencent.mm.plugin.finder.report.w0 c17 = y0Var.c(i18);
            c17.f125413a = V0;
            c17.f125415c = true;
            c17.f125414b = X0;
            y0Var.h(i18, 7, z19);
            y0Var.g(context, i18, new jz5.l(7, 8), false);
        }
        pm0.v.K(null, new com.tencent.mm.plugin.finder.feed.zx(pzVar, z17));
    }

    @Override // ym5.q3
    public void c(ym5.s3 reason) {
        int i17;
        com.tencent.mm.plugin.finder.feed.ct ctVar;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.RecyclerView recyclerView2;
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.plugin.finder.feed.v00 v00Var = this.f108783b;
        ym5.q3 q3Var = v00Var.f110857r;
        if (q3Var != null) {
            q3Var.c(reason);
        }
        com.tencent.mars.xlog.Log.i("Finder.TimelineViewCallback", "[onLoadMoreEnd] isHasAnyMore=" + reason);
        if (!reason.f463521f) {
            androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f108784c;
            if (recyclerView3.getChildCount() > 0) {
                android.view.View childAt = recyclerView3.getChildAt(recyclerView3.getChildCount() - 1);
                androidx.recyclerview.widget.k3 m07 = recyclerView3.m0(childAt);
                java.lang.Integer valueOf = m07 != null ? java.lang.Integer.valueOf(m07.getItemViewType()) : null;
                if (childAt.getHeight() > 0 && ((valueOf != null && valueOf.intValue() == 4) || (valueOf != null && valueOf.intValue() == 8))) {
                    int height = v00Var.getResources().getDisplayMetrics().heightPixels - childAt.getHeight();
                    v00Var.l().setExtraOverScrollFooterDx(height / 3);
                    com.tencent.mars.xlog.Log.i("Finder.TimelineViewCallback", "extraOverScrollFooterDx=" + height);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1311L, 2L, 1L);
                }
            }
        }
        com.tencent.mm.plugin.finder.feed.pz pzVar = (com.tencent.mm.plugin.finder.feed.pz) v00Var.f110847e;
        pzVar.getClass();
        pzVar.P0(reason);
        com.tencent.mm.plugin.finder.feed.ct ctVar2 = pzVar.f108759m;
        if (ctVar2 != null && (recyclerView2 = ((com.tencent.mm.plugin.finder.feed.v00) ctVar2).getRecyclerView()) != null) {
            recyclerView2.post(new com.tencent.mm.plugin.finder.feed.py(pzVar));
        }
        java.util.Iterator it = com.tencent.mm.plugin.finder.feed.pz.O1.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            i17 = pzVar.f108762p;
            if (!hasNext) {
                break;
            } else {
                ((ni3.a) it.next()).a(i17, reason.f463523h);
            }
        }
        com.tencent.mm.plugin.finder.report.v1.o(com.tencent.mm.plugin.finder.report.v1.f125393a, i17, false, null, false, 0L, false, 60, null);
        java.lang.String str = "[onLoadMoreEnd] tabType:" + i17 + "  reason=" + reason + " isAutoLoadingMore=" + pzVar.B1;
        java.lang.String str2 = pzVar.U;
        com.tencent.mars.xlog.Log.i(str2, str);
        if (reason.f463524i && reason.f463521f && (ctVar = pzVar.f108759m) != null && (recyclerView = ((com.tencent.mm.plugin.finder.feed.v00) ctVar).getRecyclerView()) != null) {
            pzVar.l1(recyclerView);
        }
        com.tencent.mm.plugin.finder.report.y0 y0Var = com.tencent.mm.plugin.finder.report.y0.f125442a;
        int V0 = pzVar.V0();
        boolean z17 = pzVar.B1;
        int X0 = pzVar.X0();
        com.tencent.mm.ui.MMActivity context = pzVar.f108755g;
        kotlin.jvm.internal.o.g(context, "context");
        if (!y0Var.a()) {
            com.tencent.mars.xlog.Log.i("Finder.HomeActionReporter", "[onLoadMoreEnd] tabType:" + i17 + " itemCount:" + V0 + " isAuto:" + z17 + " curPosition:" + X0);
            com.tencent.mm.plugin.finder.report.y0.f125446e = i17;
            com.tencent.mm.plugin.finder.report.w0 c17 = y0Var.c(i17);
            c17.f125413a = V0;
            c17.f125415c = false;
            c17.f125414b = X0;
            y0Var.h(i17, 8, z17);
            y0Var.g(context, i17, new jz5.l(8, 7), true);
        }
        pzVar.Q0(reason, false);
        pzVar.B1 = false;
        com.tencent.mm.autogen.events.TestPreloadPreviewNotifyEvent testPreloadPreviewNotifyEvent = new com.tencent.mm.autogen.events.TestPreloadPreviewNotifyEvent();
        am.uy uyVar = testPreloadPreviewNotifyEvent.f54889g;
        uyVar.getClass();
        uyVar.f8143a = 2;
        uyVar.f8144b = reason.f463523h;
        uyVar.f8145c = java.lang.System.currentTimeMillis() - pzVar.C1;
        testPreloadPreviewNotifyEvent.e();
        pzVar.D1 = (!reason.f463521f || reason.f463523h <= 0) ? -1 : 1;
        if (i17 == 4 || i17 == 1 || i17 == 3 || i17 == 35) {
            if (pzVar.f108777y1) {
                pzVar.f108777y1 = false;
                boolean b07 = pm0.v.b0(pzVar.C.getDataListJustForAdapter(), com.tencent.mm.plugin.finder.feed.qy.f108856d);
                if (b07) {
                    ((com.tencent.mm.plugin.finder.feed.dw) pzVar.G).onChanged();
                    pzVar.P0(null);
                }
                com.tencent.mars.xlog.Log.i(str2, "tabType:" + i17 + " delete placeholder hasEnableRecFeed=" + b07);
            } else {
                pzVar.O0("loadMore");
            }
        }
        pzVar.N0();
    }

    @Override // ym5.q3
    public void d(int i17, rn5.a aVar, boolean z17) {
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout;
        com.tencent.mm.plugin.finder.feed.v00 v00Var = this.f108783b;
        ym5.q3 q3Var = v00Var.f110857r;
        if (q3Var != null) {
            q3Var.d(i17, aVar, z17);
        }
        com.tencent.mm.plugin.finder.feed.bt btVar = v00Var.f110847e;
        ((com.tencent.mm.plugin.finder.feed.pz) btVar).j1(aVar, null, z17, false);
        if (!v00Var.o()) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f108784c;
            if (i17 != 2) {
                recyclerView.setItemAnimator(new uw2.n0());
            } else {
                recyclerView.setItemAnimator(null);
            }
        }
        so2.j5 W0 = ((com.tencent.mm.plugin.finder.feed.pz) btVar).W0();
        in5.s0 s0Var = (in5.s0) in5.n0.Y(this.f108785d, W0 != null ? W0.getItemId() : 0L, false, 2, null);
        int maxPlayPercent = (s0Var == null || (finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k)) == null) ? 0 : finderVideoLayout.getMaxPlayPercent();
        com.tencent.mm.ui.MMActivity context = v00Var.f110846d;
        int i18 = this.f108786e;
        if (i17 != 1) {
            if (i17 == 2) {
                com.tencent.mm.plugin.finder.report.c3 c3Var = com.tencent.mm.plugin.finder.report.c3.f124978a;
                boolean z18 = aVar != null;
                kotlin.jvm.internal.o.g(context, "context");
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
                if (z18) {
                    c3Var.a(i18, V6, W0, maxPlayPercent);
                    return;
                }
                com.tencent.mm.plugin.finder.report.z2 c17 = c3Var.c(i18);
                com.tencent.mars.xlog.Log.i("Finder.RefreshReporter", "tab_" + i18 + ",自动刷新（刷新次数：" + c17.f125486c + "）,预备上报信息=" + com.tencent.mm.plugin.finder.report.c3.f124980c);
                com.tencent.mm.plugin.finder.report.y2 y2Var = com.tencent.mm.plugin.finder.report.c3.f124980c;
                if (y2Var != null && c17.f125484a) {
                    r45.qt2 qt2Var = y2Var.f125467a;
                    if (kotlin.jvm.internal.o.b(qt2Var != null ? qt2Var.getString(1) : null, V6 != null ? V6.getString(1) : null)) {
                        com.tencent.mars.xlog.Log.i("Finder.RefreshReporter", "自动刷新命中双击点击刷新！");
                        c3Var.d(y2Var.f125467a, y2Var.f125468b, y2Var.f125469c, y2Var.f125470d, y2Var.f125471e);
                    }
                }
                c17.f125484a = false;
                c17.f125485b = null;
                c17.a(i18);
                com.tencent.mm.plugin.finder.report.c3.f124980c = null;
                return;
            }
            return;
        }
        if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.Q0().r()).intValue() == 1) {
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            if (nyVar2 != null) {
                i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                ((com.tencent.mm.plugin.finder.report.o3) c18).aj(nyVar2.V6(), 3, 0);
            }
        }
        com.tencent.mm.plugin.finder.report.c3 c3Var2 = com.tencent.mm.plugin.finder.report.c3.f124978a;
        boolean z19 = aVar != null;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar3 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        r45.qt2 V62 = nyVar3 != null ? nyVar3.V6() : null;
        if (z19) {
            c3Var2.a(i18, V62, W0, maxPlayPercent);
            return;
        }
        com.tencent.mm.plugin.finder.report.z2 c19 = c3Var2.c(i18);
        com.tencent.mars.xlog.Log.i("Finder.RefreshReporter", "tab_" + i18 + ",下拉刷新（刷新次数：" + c19.f125486c + "）,playPercent=" + maxPlayPercent + ',' + c3Var2.b(W0));
        if (c19.f125486c == 0) {
            c19.a(i18);
        }
        c3Var2.d(V62, W0, maxPlayPercent, c19.f125486c, com.tencent.mm.plugin.finder.report.a3.f124942e);
        c19.f125484a = false;
        c19.f125485b = null;
        c19.a(i18);
        com.tencent.mm.plugin.finder.report.c3.f124980c = null;
    }

    @Override // ym5.q3
    public void e(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.plugin.finder.feed.v00 v00Var = this.f108783b;
        ym5.q3 q3Var = v00Var.f110857r;
        if (q3Var != null) {
            q3Var.e(reason);
        }
        com.tencent.mm.plugin.finder.feed.bt btVar = v00Var.f110847e;
        ((com.tencent.mm.plugin.finder.feed.pz) btVar).onRefreshEnd(reason);
        if (v00Var.o()) {
            v00Var.f110856q = true;
        } else {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f108784c;
            recyclerView.postDelayed(new com.tencent.mm.plugin.finder.feed.p00(recyclerView, v00Var), 1000L);
        }
        if (((com.tencent.mm.plugin.finder.feed.pz) btVar).f108762p == 1) {
            i95.m c17 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f108784c;
            ml2.x1 x1Var = ml2.x1.f328201e;
            ml2.q1 q1Var = ml2.q1.f327812e;
            zy2.zb.Kh(zbVar, recyclerView2, x1Var, "temp_9", ml2.y.f328242g, 0, 0L, 0, 112, null);
        }
        com.tencent.mm.ui.MMActivity activity = v00Var.f110846d;
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.viewmodel.component.hs hsVar = (com.tencent.mm.plugin.finder.viewmodel.component.hs) pf5.z.f353948a.a(activity).e(com.tencent.mm.plugin.finder.viewmodel.component.hs.class);
        if (hsVar != null) {
            int i17 = this.f108786e;
            if (i17 == 1) {
                hsVar.f134661q = true;
                com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", "onRefreshEnd friend tab");
            } else if (i17 == 3) {
                hsVar.f134660p = true;
                com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", "onRefreshEnd follow tab");
            } else if (i17 == 4) {
                hsVar.f134662r = true;
                com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", "onRefreshEnd machine tab");
            }
            com.tencent.mm.plugin.finder.viewmodel.component.oq oqVar = com.tencent.mm.plugin.finder.viewmodel.component.hs.f134650z;
            com.tencent.mm.plugin.finder.viewmodel.component.hs.B.clear();
            com.tencent.mm.plugin.finder.viewmodel.component.hs.C.clear();
            com.tencent.mm.plugin.finder.viewmodel.component.hs.D.clear();
        }
    }
}
