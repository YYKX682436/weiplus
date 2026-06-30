package ac2;

/* loaded from: classes2.dex */
public final class y extends com.tencent.mm.plugin.finder.feed.gj {

    /* renamed from: r, reason: collision with root package name */
    public final ac2.t f3066r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f3067s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f3068t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.model.BaseFinderFeed f3069u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3070v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.ui.MMActivity context, ac2.t presenter, int i17, int i18) {
        super(context, presenter, i17, i18);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(presenter, "presenter");
        this.f3066r = presenter;
    }

    public final void A(java.lang.String str) {
        android.widget.TextView textView = (android.widget.TextView) this.f106968d.findViewById(com.tencent.mm.R.id.ggm);
        if (str == null || str.length() == 0) {
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
        } else {
            if (textView != null) {
                textView.setVisibility(0);
            }
            if (textView == null) {
                return;
            }
            textView.setText(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        if (r11.isNativeDramaFeed() == true) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(com.tencent.mm.plugin.finder.model.BaseFinderFeed r11) {
        /*
            r10 = this;
            r0 = 2131308683(0x7f09308b, float:1.8235628E38)
            com.tencent.mm.ui.MMActivity r1 = r10.f106968d
            android.view.View r0 = r1.findViewById(r0)
            if (r0 != 0) goto Lc
            return
        Lc:
            r1 = 0
            if (r11 == 0) goto L1d
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r11.getFeedObject()
            if (r11 == 0) goto L1d
            boolean r11 = r11.isNativeDramaFeed()
            r2 = 1
            if (r11 != r2) goto L1d
            goto L1e
        L1d:
            r2 = r1
        L1e:
            if (r2 == 0) goto L67
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.lang.ThreadLocal r2 = zj0.c.f473285a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r11.add(r2)
            java.util.Collections.reverse(r11)
            java.lang.Object[] r3 = r11.toArray()
            java.lang.String r4 = "com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaTimelineContract$ViewCallback"
            java.lang.String r5 = "showFloatBall"
            java.lang.String r6 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r2 = r0
            yj0.a.d(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r11 = r11.get(r1)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r0.setVisibility(r11)
            java.lang.String r3 = "com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaTimelineContract$ViewCallback"
            java.lang.String r4 = "showFloatBall"
            java.lang.String r5 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r2 = r0
            yj0.a.f(r2, r3, r4, r5, r6, r7, r8)
            goto Laf
        L67:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.lang.ThreadLocal r2 = zj0.c.f473285a
            r2 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r11.add(r2)
            java.util.Collections.reverse(r11)
            java.lang.Object[] r3 = r11.toArray()
            java.lang.String r4 = "com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaTimelineContract$ViewCallback"
            java.lang.String r5 = "showFloatBall"
            java.lang.String r6 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r2 = r0
            yj0.a.d(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r11 = r11.get(r1)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r0.setVisibility(r11)
            java.lang.String r3 = "com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaTimelineContract$ViewCallback"
            java.lang.String r4 = "showFloatBall"
            java.lang.String r5 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r2 = r0
            yj0.a.f(r2, r3, r4, r5, r6, r7, r8)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ac2.y.B(com.tencent.mm.plugin.finder.model.BaseFinderFeed):void");
    }

    public final void C() {
        android.view.View view = this.f3067s;
        if (view == null) {
            kotlin.jvm.internal.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaTimelineContract$ViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaTimelineContract$ViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f3068t;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("retryView");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaTimelineContract$ViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaTimelineContract$ViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void D(boolean z17) {
        com.tencent.mars.xlog.Log.i("FinderNativeDramaTimelineContract", "dramaReq noMore down " + z17);
        if (z17) {
            com.tencent.mm.view.RefreshLoadMoreLayout.I(o(), null, 1, null);
        } else {
            o().setCanRefresh(false);
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.i0
    public android.view.View j() {
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.i0
    public void q(java.util.ArrayList data) {
        kotlin.jvm.internal.o.g(data, "data");
        super.q(data);
        com.tencent.mm.ui.MMActivity activity = this.f106968d;
        kotlin.jvm.internal.o.g(activity, "activity");
        ac2.g gVar = (ac2.g) pf5.z.f353948a.a(activity).a(ac2.g.class);
        androidx.recyclerview.widget.RecyclerView recyclerView = o().getRecyclerView();
        gVar.getClass();
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        gVar.f3026d = recyclerView;
        recyclerView.i(new ac2.a(gVar));
        android.view.View findViewById = activity.findViewById(com.tencent.mm.R.id.f484895ts4);
        if (findViewById != null) {
            findViewById.setOnClickListener(new ac2.v(this));
        }
        o().getRecyclerView().i(new ac2.w(this));
        getRecyclerView().P(new ac2.u(new kotlin.jvm.internal.e0(), new kotlin.jvm.internal.c0(), this));
        int dimension = (int) activity.getResources().getDimension(com.tencent.mm.R.dimen.f479727dj);
        int dimension2 = (int) activity.getResources().getDimension(com.tencent.mm.R.dimen.f479679cf);
        android.view.View inflate = com.tencent.mm.ui.id.b(activity).inflate(com.tencent.mm.R.layout.d0x, (android.view.ViewGroup) null);
        android.view.ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new android.view.ViewGroup.MarginLayoutParams(-1, dimension2);
        }
        layoutParams.height = dimension2;
        inflate.setMinimumHeight(dimension2);
        inflate.setLayoutParams(layoutParams);
        o().setEnableRefresh(true);
        o().setRefreshHeaderView(inflate);
        o().setLimitTopRequest(dimension2 - dimension);
        o().setRefreshTargetY(dimension - dimension2);
        o().setDamping(1.6f);
        o().setHasTopMore(true);
        o().setCanRefresh(false);
    }

    public final int y() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = o().getRecyclerView().getLayoutManager();
        com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = layoutManager instanceof com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager ? (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager : null;
        int i17 = -1;
        if (finderLinearLayoutManager == null) {
            return -1;
        }
        int w17 = finderLinearLayoutManager.w();
        int y17 = finderLinearLayoutManager.y();
        if (w17 <= y17) {
            int i18 = 0;
            while (true) {
                androidx.recyclerview.widget.k3 q07 = o().getRecyclerView().q0(w17, false);
                if (q07 != null) {
                    android.view.View itemView = q07.itemView;
                    kotlin.jvm.internal.o.f(itemView, "itemView");
                    android.graphics.Rect rect = kn5.f.f309807a;
                    itemView.getLocalVisibleRect(rect);
                    if (rect.height() > i18) {
                        i18 = rect.height();
                        i17 = w17;
                    }
                }
                if (w17 == y17) {
                    break;
                }
                w17++;
            }
        }
        return i17;
    }

    public final void z() {
        android.view.View view = this.f3067s;
        if (view == null) {
            kotlin.jvm.internal.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaTimelineContract$ViewCallback", "hideLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaTimelineContract$ViewCallback", "hideLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
