package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public class xr implements fs2.c {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f111095d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f111096e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.kr f111097f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.view.RefreshLoadMoreLayout f111098g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f111099h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f111100i;

    /* renamed from: m, reason: collision with root package name */
    public final ym5.q1 f111101m;

    public xr(com.tencent.mm.ui.MMActivity context, final com.tencent.mm.plugin.finder.feed.kr presenter) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(presenter, "presenter");
        this.f111095d = context;
        this.f111096e = "Finder.FinderProfileTimelineContract.ProfileTimelineViewCallback";
        this.f111097f = presenter;
        this.f111100i = true;
        jz5.h.b(com.tencent.mm.plugin.finder.feed.wr.f111005d);
        jz5.g b17 = jz5.h.b(com.tencent.mm.plugin.finder.feed.nr.f108596d);
        android.view.View findViewById = context.findViewById(com.tencent.mm.R.id.m6e);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = (com.tencent.mm.view.RefreshLoadMoreLayout) findViewById;
        this.f111098g = refreshLoadMoreLayout;
        androidx.recyclerview.widget.RecyclerView recyclerView = refreshLoadMoreLayout.getRecyclerView();
        this.f111099h = recyclerView;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = new com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager(context);
        finderLinearLayoutManager.f132639x = 25.0f;
        ((cq.k) i95.n0.c(cq.k.class)).getClass();
        finderLinearLayoutManager.f132640y = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.R1().r()).intValue();
        finderLinearLayoutManager.f132641z = 100;
        recyclerView.setLayoutManager(finderLinearLayoutManager);
        recyclerView.setRecycledViewPool((androidx.recyclerview.widget.y2) ((jz5.n) b17).getValue());
        recyclerView.setTag(com.tencent.mm.R.id.tcy, java.lang.Boolean.TRUE);
        recyclerView.setAdapter(new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter$buildItemCoverts$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type != 2) {
                    if (type != 4) {
                        if (type == 9) {
                            com.tencent.mm.plugin.finder.feed.kr krVar = com.tencent.mm.plugin.finder.feed.kr.this;
                            cw2.f8 f8Var = krVar.I;
                            com.tencent.mm.ui.MMActivity context2 = krVar.f107230d;
                            kotlin.jvm.internal.o.g(context2, "context");
                            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                            return new com.tencent.mm.plugin.finder.convert.zf(f8Var, krVar, false, 0, nyVar != null ? nyVar.f135380n : 0);
                        }
                        if (type == 15) {
                            return new com.tencent.mm.plugin.finder.convert.oj(com.tencent.mm.plugin.finder.feed.hp.f106943d, com.tencent.mm.plugin.finder.feed.kr.this, 0);
                        }
                        if (type != 3001) {
                            if (type != 3002) {
                                hc2.l.a(com.tencent.mm.plugin.finder.feed.kr.this.f107243t, type);
                                return new com.tencent.mm.plugin.finder.convert.z2();
                            }
                        }
                    }
                    com.tencent.mm.plugin.finder.feed.kr krVar2 = com.tencent.mm.plugin.finder.feed.kr.this;
                    return new com.tencent.mm.plugin.finder.convert.bh(krVar2.I, krVar2, false, 0, false, 28, null);
                }
                return new com.tencent.mm.plugin.finder.convert.df(com.tencent.mm.plugin.finder.feed.kr.this, false, 0, false, 14, null);
            }
        }, presenter.m().getDataListJustForAdapter(), false));
        new com.tencent.mm.plugin.finder.ui.o6().b(recyclerView);
        this.f111101m = new com.tencent.mm.plugin.finder.feed.lr(this, presenter);
        if (presenter.f107234h) {
            int dimension = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479727dj);
            int dimension2 = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479679cf);
            android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.d0x, (android.view.ViewGroup) null);
            android.view.ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
            layoutParams = layoutParams == null ? new android.view.ViewGroup.MarginLayoutParams(-1, dimension2) : layoutParams;
            layoutParams.height = dimension2;
            inflate.setMinimumHeight(dimension2);
            inflate.setLayoutParams(layoutParams);
            refreshLoadMoreLayout.setEnableRefresh(true);
            refreshLoadMoreLayout.setRefreshHeaderView(inflate);
            refreshLoadMoreLayout.setLimitTopRequest(dimension2 - dimension);
            refreshLoadMoreLayout.setRefreshTargetY(dimension - dimension2);
            refreshLoadMoreLayout.setDamping(1.6f);
        }
    }

    public final void a(com.tencent.mm.protocal.protobuf.FinderObject finderObject, com.tencent.mm.plugin.finder.feed.yr promotionAdPosition, com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataList, int i17) {
        java.lang.String str;
        int i18;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed;
        int i19;
        int i27;
        r45.cl2 cl2Var;
        r45.s56 s56Var;
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(promotionAdPosition, "promotionAdPosition");
        kotlin.jvm.internal.o.g(dataList, "dataList");
        com.tencent.mm.plugin.finder.feed.kr krVar = this.f111097f;
        if (finderObject == null) {
            krVar.s("debug:finderObject返回空");
            return;
        }
        com.tencent.mm.ui.MMActivity activity = this.f111095d;
        kotlin.jvm.internal.o.g(activity, "activity");
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        com.tencent.mm.plugin.finder.storage.FinderItem a17 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 1);
        cu2.t tVar = cu2.u.f222441a;
        java.util.List c17 = kz5.b0.c(a17.getFeedObject());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : c17) {
            if (hc2.o0.C((com.tencent.mm.protocal.protobuf.FinderObject) obj2)) {
                arrayList.add(obj2);
            }
        }
        kotlin.jvm.internal.o.g(activity, "activity");
        java.util.List j17 = tVar.j(arrayList, 2, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6());
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(j17, 10));
        java.util.Iterator it = j17.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            str = this.f111096e;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = null;
            if (!hasNext) {
                break;
            }
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = (com.tencent.mm.plugin.finder.storage.FinderItem) it.next();
            java.util.Iterator it6 = krVar.f107245v.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it6.next();
                java.util.Iterator it7 = it6;
                if (((com.tencent.mm.plugin.finder.feed.yr) obj).f111190c == finderObject.getId()) {
                    break;
                } else {
                    it6 = it7;
                }
            }
            if (obj != null) {
                r45.dm2 object_extend = finderObject.getObject_extend();
                java.lang.String string = object_extend != null ? object_extend.getString(62) : null;
                if (string == null || string.length() == 0) {
                    promotionAdPosition.f111191d = null;
                    krVar.s("debug:广告重复，忽略 getPosition " + promotionAdPosition.f111188a + (char) 65292 + pm0.v.u(finderObject.getId()));
                    arrayList2.add(baseFinderFeed2);
                }
            }
            java.util.ArrayList<so2.j5> arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj3 : dataList) {
                if (((so2.j5) obj3).getItemId() == finderItem.getId()) {
                    arrayList3.add(obj3);
                }
            }
            com.tencent.mm.protocal.protobuf.FinderObject feedObject = finderItem.getFeedObject();
            com.tencent.mars.xlog.Log.i(str, "updateDupFeed ".concat(pm0.v.u(feedObject.getId())));
            for (so2.j5 j5Var : arrayList3) {
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed3 = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
                if (baseFinderFeed3 != null) {
                    baseFinderFeed3.getFeedObject().setFavCount(feedObject.getFavCount());
                    baseFinderFeed3.getFeedObject().setCommentCount(feedObject.getCommentCount());
                    baseFinderFeed3.getFeedObject().setLikeCount(feedObject.getLikeCount());
                    baseFinderFeed3.getFeedObject().setForwardCount(feedObject.getForwardCount());
                }
            }
            baseFinderFeed2 = cu2.u.f222441a.p(finderItem);
            baseFinderFeed2.J1(true);
            arrayList2.add(baseFinderFeed2);
        }
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed4 = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) kz5.n0.Z(arrayList2);
        if (baseFinderFeed4 != null) {
            r45.dm2 object_extend2 = baseFinderFeed4.getFeedObject().getFeedObject().getObject_extend();
            java.lang.Integer valueOf = (object_extend2 == null || (cl2Var = (r45.cl2) object_extend2.getCustom(4)) == null || (s56Var = (r45.s56) cl2Var.getCustom(15)) == null) ? null : java.lang.Integer.valueOf(s56Var.getInteger(0));
            int i28 = promotionAdPosition.f111189b;
            int intValue = (valueOf == null || valueOf.intValue() == 0) ? i28 : valueOf.intValue();
            if (intValue == 0) {
                com.tencent.mars.xlog.Log.i(str, "checkInsertFeed skip: showPosition is 0, newShowPosition " + valueOf + " originShowPosition " + i28 + " feedId " + pm0.v.u(finderObject.getId()));
                krVar.s("debug:showPosition 为0，不插入 ".concat(pm0.v.u(finderObject.getId())));
                promotionAdPosition.f111191d = null;
                return;
            }
            int totalSize = dataList.getTotalSize();
            int i29 = i17;
            int i37 = 0;
            while (true) {
                if (i29 >= totalSize) {
                    i18 = -1;
                    break;
                }
                so2.j5 j5Var2 = (so2.j5) dataList.get(i29);
                int i38 = totalSize;
                if (j5Var2 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                    com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed5 = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var2;
                    if (!baseFinderFeed5.getIsProfileAdFeed() && kotlin.jvm.internal.o.b(baseFinderFeed5.getFeedObject().getUserName(), krVar.f107231e)) {
                        if (intValue == i37) {
                            i18 = i29;
                            break;
                        }
                        i37++;
                    }
                }
                i29++;
                totalSize = i38;
            }
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = getRecyclerView().getLayoutManager();
            com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = layoutManager instanceof com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager ? (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager : null;
            if (finderLinearLayoutManager == null) {
                baseFinderFeed = baseFinderFeed4;
                i27 = -1;
            } else {
                int w17 = finderLinearLayoutManager.w();
                int y17 = finderLinearLayoutManager.y();
                baseFinderFeed = baseFinderFeed4;
                if (w17 <= y17) {
                    int i39 = 0;
                    i19 = -1;
                    while (true) {
                        androidx.recyclerview.widget.k3 q07 = getRecyclerView().q0(w17, false);
                        if (q07 != null) {
                            android.view.View itemView = q07.itemView;
                            kotlin.jvm.internal.o.f(itemView, "itemView");
                            android.graphics.Rect rect = kn5.f.f309807a;
                            itemView.getLocalVisibleRect(rect);
                            if (rect.height() > i39) {
                                i19 = w17;
                                i39 = rect.height();
                            }
                        }
                        if (w17 == y17) {
                            break;
                        } else {
                            w17++;
                        }
                    }
                } else {
                    i19 = -1;
                }
                i27 = i19;
            }
            if (i18 != -1 && (i18 <= i27 || i27 == -1)) {
                com.tencent.mars.xlog.Log.i(str, "checkInsertFeed return insertIndex:" + i18 + " focusIndex " + i27 + " newShowPosition " + valueOf + " originShowPosition " + i28);
                krVar.s("debug:已滑过showPosition " + intValue + "(origin " + i28 + ") insertIndex " + i18 + "，忽略 " + pm0.v.u(finderObject.getId()));
                promotionAdPosition.f111191d = finderObject;
                return;
            }
            androidx.lifecycle.c1 a18 = pf5.u.f353936a.e(zy2.b6.class).a(xc2.k0.class);
            kotlin.jvm.internal.o.f(a18, "get(...)");
            int i47 = intValue;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed6 = baseFinderFeed;
            xc2.k0.e7((xc2.k0) a18, finderObject, V6.getInteger(5), V6, 0, null, null, 56, null);
            ym5.q1 q1Var = this.f111101m;
            if (i18 == -1) {
                dataList.add(baseFinderFeed6);
                ((com.tencent.mm.plugin.finder.feed.lr) q1Var).onItemRangeInserted(dataList.size() - 1, 1);
                krVar.s("debug:插入在末尾 showPosition " + i47 + "(origin " + i28 + ")，" + pm0.v.u(finderObject.getId()));
            } else {
                dataList.add(i18, baseFinderFeed6);
                ((com.tencent.mm.plugin.finder.feed.lr) q1Var).onItemRangeInserted(i18, 1);
                krVar.s("debug:插入 showPosition " + i47 + "(origin " + i28 + ")，" + pm0.v.u(finderObject.getId()));
            }
            promotionAdPosition.f111190c = finderObject.getId();
            promotionAdPosition.f111191d = null;
        }
    }

    public final int g(long j17) {
        int i17;
        com.tencent.mm.plugin.finder.feed.kr krVar = this.f111097f;
        java.util.Iterator it = krVar.m().getDataListJustForAdapter().iterator();
        kotlin.jvm.internal.o.f(it, "iterator(...)");
        while (true) {
            i17 = -1;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            kotlin.jvm.internal.o.f(next, "next(...)");
            so2.j5 j5Var = (so2.j5) next;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
            if (baseFinderFeed != null && baseFinderFeed.getIsProfileAdFeed()) {
                java.util.Iterator it6 = krVar.m().getDataList().iterator();
                int i18 = 0;
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    if (((so2.j5) it6.next()).getItemId() == j5Var.getItemId()) {
                        i17 = i18;
                        break;
                    }
                    i18++;
                }
                it.remove();
                ((com.tencent.mm.plugin.finder.feed.lr) this.f111101m).onItemRangeRemoved(i17, 1);
            }
        }
        java.util.Iterator it7 = krVar.m().getDataList().iterator();
        int i19 = 0;
        while (true) {
            if (!it7.hasNext()) {
                break;
            }
            if (((so2.j5) it7.next()).getItemId() == j17) {
                i17 = i19;
                break;
            }
            i19++;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f111099h;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderProfileTimelineContract$ProfileTimelineViewCallback", "scrollToFeed", "(J)I", "Undefined", "scrollToPosition", "(I)V");
        recyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/feed/FinderProfileTimelineContract$ProfileTimelineViewCallback", "scrollToFeed", "(J)I", "Undefined", "scrollToPosition", "(I)V");
        com.tencent.mars.xlog.Log.i(this.f111096e, "scrollToFeed index:" + i17 + " feed:" + pm0.v.u(j17));
        return i17;
    }

    @Override // fs2.c
    public com.tencent.mm.ui.MMFragmentActivity getActivity() {
        return this.f111095d;
    }

    public final androidx.recyclerview.widget.RecyclerView getRecyclerView() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f111099h;
        if (recyclerView != null) {
            return recyclerView;
        }
        kotlin.jvm.internal.o.o("recyclerView");
        throw null;
    }

    public final void j(androidx.recyclerview.widget.RecyclerView recyclerView, boolean z17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = layoutManager instanceof com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager ? (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager : null;
        java.lang.String str = this.f111096e;
        if (finderLinearLayoutManager == null) {
            com.tencent.mars.xlog.Log.w(str, "[smoothScrollToNeighborPosition] layoutManager is not FinderLinearLayoutManager");
            return;
        }
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        boolean z18 = false;
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        int w17 = z17 ? finderLinearLayoutManager.w() + 1 : finderLinearLayoutManager.w() - 1;
        if (w17 >= 0 && w17 < itemCount) {
            z18 = true;
        }
        if (z18) {
            com.tencent.mars.xlog.Log.i(str, "[smoothScrollToNeighborPosition] position=" + w17);
            recyclerView.post(new com.tencent.mm.plugin.finder.feed.vr(recyclerView, w17));
        }
    }
}
