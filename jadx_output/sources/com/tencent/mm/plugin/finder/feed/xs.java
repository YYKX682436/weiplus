package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class xs extends com.tencent.mm.plugin.finder.feed.a1 {

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f111102u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xs(com.tencent.mm.ui.MMActivity context, int i17, int i18, boolean z17) {
        super(context, i17, i18, z17, 0, false, 48, null);
        kotlin.jvm.internal.o.g(context, "context");
        this.f111102u = "Finder.FinderSnsPostUIContract.ViewCallback";
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public java.lang.CharSequence B(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        return "";
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public void J(in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.View p17 = holder.p(com.tencent.mm.R.id.e_e);
        if (p17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderSnsPostUIContract$ViewCallback", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/feed/FinderSnsPostUIContract$ViewCallback", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View p18 = holder.p(com.tencent.mm.R.id.fuv);
        if (p18 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderSnsPostUIContract$ViewCallback", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/feed/FinderSnsPostUIContract$ViewCallback", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View p19 = holder.p(com.tencent.mm.R.id.f483299a85);
        if (p19 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(p19, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/FinderSnsPostUIContract$ViewCallback", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p19.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(p19, "com/tencent/mm/plugin/finder/feed/FinderSnsPostUIContract$ViewCallback", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View p27 = holder.p(com.tencent.mm.R.id.eig);
        if (p27 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(p27, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/FinderSnsPostUIContract$ViewCallback", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p27.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(p27, "com/tencent/mm/plugin/finder/feed/FinderSnsPostUIContract$ViewCallback", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ebv);
        if (textView != null && textView.getVisibility() == 8) {
            android.view.View p28 = holder.p(com.tencent.mm.R.id.f484870fs4);
            if (p28 == null) {
                return;
            }
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(p28, arrayList5.toArray(), "com/tencent/mm/plugin/finder/feed/FinderSnsPostUIContract$ViewCallback", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p28.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(p28, "com/tencent/mm/plugin/finder/feed/FinderSnsPostUIContract$ViewCallback", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View p29 = holder.p(com.tencent.mm.R.id.f484870fs4);
        if (p29 != null) {
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(p29, arrayList6.toArray(), "com/tencent/mm/plugin/finder/feed/FinderSnsPostUIContract$ViewCallback", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p29.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(p29, "com/tencent/mm/plugin/finder/feed/FinderSnsPostUIContract$ViewCallback", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p29.setBackgroundColor(holder.f293121e.getResources().getColor(com.tencent.mm.R.color.f478514w));
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ebv);
        if (textView2 != null) {
            textView2.setTextColor(-1);
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public void K(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17) {
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        int a07 = i17 - ((in5.n0) adapter).a0();
        if (a07 < 0 || a07 >= z().f107156e.getSize()) {
            return;
        }
        so2.j5 j5Var = (so2.j5) z().f107156e.getDataListJustForAdapter().get(a07);
        if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick ");
            sb6.append(a07);
            sb6.append(" id:");
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
            sb6.append(baseFinderFeed.getFeedObject().getId());
            sb6.append(", pos:");
            sb6.append(a07);
            com.tencent.mars.xlog.Log.i(this.f111102u, sb6.toString());
            boolean isPostFinish = baseFinderFeed.getFeedObject().isPostFinish();
            com.tencent.mm.ui.MMActivity activity = this.f106174d;
            if (!isPostFinish) {
                db5.t7.makeText(activity, com.tencent.mm.R.string.cwz, 0).show();
                return;
            }
            com.tencent.mm.plugin.finder.assist.n7.F(com.tencent.mm.plugin.finder.assist.n7.f102406a, this.f106174d, baseFinderFeed, null, 5, 0, 20, null);
            com.tencent.mm.plugin.finder.feed.ui.FinderSnsGridFeedUI finderSnsGridFeedUI = activity instanceof com.tencent.mm.plugin.finder.feed.ui.FinderSnsGridFeedUI ? (com.tencent.mm.plugin.finder.feed.ui.FinderSnsGridFeedUI) activity : null;
            if (finderSnsGridFeedUI != null) {
                finderSnsGridFeedUI.f109554v = true;
            }
            com.tencent.mm.plugin.finder.report.o4 o4Var = com.tencent.mm.plugin.finder.report.o4.f125220a;
            kotlin.jvm.internal.o.g(activity, "activity");
            java.lang.String str = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135385q;
            if (str == null) {
                str = "";
            }
            com.tencent.mm.plugin.finder.report.o4.a(o4Var, str, 3, null, false, false, baseFinderFeed.getFeedObject().getId(), 28, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public void M() {
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public void U() {
        super.U();
        android.view.View t17 = t();
        android.view.View findViewById = t17 != null ? t17.findViewById(com.tencent.mm.R.id.dfl) : null;
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderSnsPostUIContract$ViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderSnsPostUIContract$ViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.findViewById(com.tencent.mm.R.id.f484223df5).setOnClickListener(new com.tencent.mm.plugin.finder.feed.ws(this));
            android.view.View findViewById2 = this.f106174d.findViewById(com.tencent.mm.R.id.f482437ek);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderSnsPostUIContract$ViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/FinderSnsPostUIContract$ViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // fs2.c
    public com.tencent.mm.ui.MMFragmentActivity getActivity() {
        return this.f106174d;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public java.lang.String s(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        return "";
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public android.view.View t() {
        return this.f106174d.findViewById(com.tencent.mm.R.id.f484229dg3);
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public /* bridge */ /* synthetic */ android.view.View w() {
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public androidx.recyclerview.widget.p2 x() {
        ((com.tencent.mm.plugin.finder.storage.jj0) this.f106184q).getClass();
        return new com.tencent.mm.plugin.finder.storage.ij0();
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public androidx.recyclerview.widget.RecyclerView.LayoutManager y(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return this.f106184q.d(context);
    }
}
