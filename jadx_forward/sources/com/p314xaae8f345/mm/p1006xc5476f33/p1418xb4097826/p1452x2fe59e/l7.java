package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public abstract class l7 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 {

    /* renamed from: u, reason: collision with root package name */
    public final p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f188813u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f188814v;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l7(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf r12, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 r13, int r14, int r15, boolean r16, int r17, p3321xbce91901.jvm.p3324x21ffc6bd.i r18) {
        /*
            r11 = this;
            r9 = r11
            r10 = r13
            r0 = r17 & 16
            if (r0 == 0) goto L9
            r0 = 0
            r4 = r0
            goto Lb
        L9:
            r4 = r16
        Lb:
            java.lang.String r0 = "context"
            r1 = r12
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r12, r0)
            java.lang.String r0 = "fragment"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r13, r0)
            r5 = 0
            r6 = 0
            r7 = 48
            r8 = 0
            r0 = r11
            r2 = r14
            r3 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.f188813u = r10
            java.lang.String r0 = "Finder.FinderFavFeedUIContract.FavFeedViewCallback"
            r9.f188814v = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.l7.<init>(com.tencent.mm.ui.MMActivity, androidx.fragment.app.Fragment, int, int, boolean, int, kotlin.jvm.internal.i):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public java.lang.CharSequence B(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f187707d;
        int dimension = (int) abstractActivityC21394xb3d2c0cf.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
        java.lang.String string = abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cuo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return hc2.x0.k(string, this.f187707d, '#', com.p314xaae8f345.mm.R.raw.f80315x74d6a2b9, com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832, dimension, dimension, 0, 0, 0, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public void C(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        if (reason.f545054f) {
            return;
        }
        W();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public void D(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        android.view.View t17 = t();
        if (t17 != null) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = m56022x4905e9fa().mo7946xf939df19();
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19 : null;
            if (reason.f545050b != -1) {
                if ((c22848x6ddd90cf != null ? c22848x6ddd90cf.x() : 0) <= 0) {
                    U();
                    com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f187713m;
                    if (c22801x87cbdc00 == null) {
                        return;
                    }
                    c22801x87cbdc00.setVisibility(0);
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(t17, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "handleRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                t17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(t17, "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "handleRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc002 = this.f187713m;
                if (c22801x87cbdc002 != null) {
                    c22801x87cbdc002.setVisibility(0);
                }
                if (reason.f545054f) {
                    return;
                }
                W();
                android.view.View f294968x = this.f187713m.getF294968x();
                if (f294968x == null) {
                    return;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(f294968x, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "handleRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                f294968x.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(f294968x, "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "handleRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(t17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "handleRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            t17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(t17, "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "handleRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = (android.widget.TextView) t17.findViewById(com.p314xaae8f345.mm.R.id.dft);
            if (textView != null) {
                textView.setVisibility(8);
            }
            android.widget.TextView textView2 = (android.widget.TextView) t17.findViewById(com.p314xaae8f345.mm.R.id.m2g);
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            android.view.View findViewById = t17.findViewById(com.p314xaae8f345.mm.R.id.lbi);
            if (findViewById != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(findViewById, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "handleRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "handleRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById2 = t17.findViewById(com.p314xaae8f345.mm.R.id.m2g);
            if (findViewById2 != null) {
                findViewById2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k7(t17, this));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = z().f188689e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(abstractC13919x46aff122, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader");
            java.util.AbstractCollection m56387xe6796cde = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13859xe71bc226) abstractC13919x46aff122).m56387xe6796cde();
            if (!m56387xe6796cde.isEmpty()) {
                m56387xe6796cde.clear();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff1222 = z().f188689e;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 abstractC13834x56f46d28 = abstractC13919x46aff1222 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28) abstractC13919x46aff1222 : null;
                if (abstractC13834x56f46d28 != null) {
                    abstractC13834x56f46d28.mo56108xf050804b();
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public boolean E(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public void K(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapter);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallbackcom/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback", "onGridItemClick", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/View;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        w04.l.INSTANCE.b(540999706);
        int a07 = i17 - ((in5.n0) adapter).a0();
        if (a07 >= 0 && a07 < z().f188689e.m56393xfb854877()) {
            so2.j5 j5Var = (so2.j5) z().f188689e.m56388xcaeb60d0().get(a07);
            if (!(j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5)) {
                yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallbackcom/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback", "onGridItemClick", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/View;I)V");
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick ");
            sb6.append(a07);
            sb6.append(" id:");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var;
            sb6.append(abstractC14490x69736cb5.getFeedObject().m59251x5db1b11());
            sb6.append(", pos:");
            sb6.append(a07);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f188814v, sb6.toString());
            android.content.Intent intent = new android.content.Intent();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122.m56348xdbd6b4a2(z().f188689e, intent, a07, null, 4, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = z().f188689e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13859xe71bc226 c13859xe71bc226 = abstractC13919x46aff122 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13859xe71bc226 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13859xe71bc226) abstractC13919x46aff122 : null;
            intent.putExtra("key_active_topic_id", c13859xe71bc226 != null ? c13859xe71bc226.f188947m : 0L);
            wa2.x.e(intent, view, 0L, false, false, wa2.u.Ui(wa2.u.f525714d, m56022x4905e9fa(), abstractC14490x69736cb5.getFeedObject().m59251x5db1b11(), z().f188689e.m56388xcaeb60d0(), null, 8, null), 14, null);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).fj(this.f187707d, intent, 10001);
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment = this.f188813u;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
            r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.b(fragment).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.wj((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17, V6, j5Var.mo2128x1ed62e84(), ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var).w(), this.f187713m.m82555x4905e9fa(), 0, null, 0L, null, 240, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.l0.f206642a.b(V6, j5Var, 18);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallbackcom/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback", "onGridItemClick", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/View;I)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public void M() {
        if (z().f188689e.m56393xfb854877() <= this.f187712i * 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = z().f188689e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(abstractC13919x46aff122, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader");
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13859xe71bc226) abstractC13919x46aff122).f188945h) {
                com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.K(this.f187713m, false, 1, null);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff1222 = z().f188689e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(abstractC13919x46aff1222, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13859xe71bc226 c13859xe71bc226 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13859xe71bc226) abstractC13919x46aff1222;
        int i17 = c13859xe71bc226.f188944g - 1;
        c13859xe71bc226.f188944g = i17;
        android.view.View view = this.f187718r;
        android.widget.TextView textView = view != null ? (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565583cu2) : null;
        if (textView == null) {
            return;
        }
        textView.setText(this.f187707d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cuu, java.lang.Integer.valueOf(i17)));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public void U() {
        android.view.View t17 = t();
        if (t17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(t17, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            t17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(t17, "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = (android.widget.TextView) t17.findViewById(com.p314xaae8f345.mm.R.id.dft);
            if (textView != null) {
                textView.setVisibility(0);
            }
            android.view.View findViewById = t17.findViewById(com.p314xaae8f345.mm.R.id.lbi);
            if (findViewById != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById2 = t17.findViewById(com.p314xaae8f345.mm.R.id.m2g);
            if (findViewById2 == null) {
                return;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void W() {
        android.widget.TextView textView;
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = z().f188689e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(abstractC13919x46aff122, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader");
        boolean z17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13859xe71bc226) abstractC13919x46aff122).f188947m == 0;
        android.view.View f294968x = this.f187713m.getF294968x();
        if (f294968x != null && (textView = (android.widget.TextView) f294968x.findViewById(com.p314xaae8f345.mm.R.id.ili)) != null) {
            if (z17) {
                java.util.AbstractCollection m56387xe6796cde = z().f188689e.m56387xe6796cde();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : m56387xe6796cde) {
                    if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                        arrayList.add(obj);
                    }
                }
                int size = arrayList.size();
                java.lang.String d17 = cu2.f0.f303924a.d("FinderObjectDynamicItemKey_FinderFavFeedFooterHint");
                if (d17 != null) {
                    str = java.lang.String.format(d17, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(size)}, 1));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "format(...)");
                } else {
                    str = null;
                }
                if (str == null) {
                    str = textView.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cun, java.lang.Integer.valueOf(size));
                }
                textView.setText(str);
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
        }
        android.view.View f294968x2 = this.f187713m.getF294968x();
        android.view.View findViewById = f294968x2 != null ? f294968x2.findViewById(com.p314xaae8f345.mm.R.id.ilg) : null;
        if (findViewById != null) {
            int i17 = z17 ? 8 : 0;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "refreshFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "refreshFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // fs2.c
    /* renamed from: getActivity */
    public com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f mo978x19263085() {
        return this.f187707d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public void r(java.util.ArrayList data) {
        fc2.o Z6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        super.r(data);
        android.widget.TextView textView = (android.widget.TextView) l(com.p314xaae8f345.mm.R.id.dft);
        if (textView != null) {
            java.lang.String d17 = cu2.f0.f303924a.d("FinderObjectDynamicItemKey_FinderFavEmptyTips");
            if (d17 == null) {
                d17 = this.f187707d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cul);
            }
            textView.setText(d17);
        }
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment = this.f188813u;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.b(fragment).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        if (nyVar == null || (Z6 = nyVar.Z6(-1)) == null) {
            return;
        }
        Z6.d(m56022x4905e9fa());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public java.lang.String s(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        java.lang.Object obj = reason.f545052d;
        if (obj == null || !(obj instanceof java.lang.Integer)) {
            return null;
        }
        android.content.res.Resources resources = this.f187707d.getResources();
        java.lang.Object obj2 = reason.f545052d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.Int");
        return resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cuu, obj2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public android.view.View t() {
        android.view.View l17 = l(com.p314xaae8f345.mm.R.id.f565762dg3);
        if (l17 instanceof android.view.View) {
            return l17;
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public android.view.View w() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 x() {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.jj0) this.f187717q).getClass();
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ij0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager y(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return this.f187717q.d(context);
    }
}
