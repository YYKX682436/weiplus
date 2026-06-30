package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class g2 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f110068d;

    /* renamed from: e, reason: collision with root package name */
    public int f110069e = 2;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderFeedListUI f110070f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f110071g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f110072h;

    public g2(com.tencent.mm.plugin.finder.feed.ui.FinderFeedListUI finderFeedListUI, r45.qt2 qt2Var, java.lang.String str) {
        this.f110070f = finderFeedListUI;
        this.f110071g = qt2Var;
        this.f110072h = str;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        ey2.u uVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderFeedListUI$createFeedLoader$1$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        if ((i17 == 1 || i17 == 2) && this.f110068d && this.f110069e == 2 && (uVar = (ey2.u) ey2.l0.f257422a.a(this.f110072h, ey2.u.class, null)) != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            com.tencent.mm.plugin.finder.feed.ui.FinderFeedListUI finderFeedListUI = this.f110070f;
            sb6.append(finderFeedListUI.B);
            sb6.append('-');
            sb6.append(pm0.v.u(uVar.f257538t));
            java.lang.String sb7 = sb6.toString();
            r45.qt2 qt2Var = this.f110071g;
            jz5.l lVar = new jz5.l("finder_tab_context_id", qt2Var.getString(2));
            jz5.l lVar2 = new jz5.l("finder_context_id", qt2Var.getString(1));
            jz5.l lVar3 = new jz5.l("comment_scene", java.lang.String.valueOf(qt2Var.getInteger(5)));
            so2.n1 n1Var = uVar.f257525d;
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("column_flow_slide_bottom", this, kz5.c1.k(lVar, lVar2, lVar3, new jz5.l("feed_id", pm0.v.u(n1Var.getItemId())), new jz5.l("column_trace_id", sb7), new jz5.l("feed_columnid", java.lang.String.valueOf(finderFeedListUI.B)), new jz5.l("session_buffer", n1Var.g0()), new jz5.l("column_card_feedid", pm0.v.u(n1Var.getItemId()))), 29179);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderFeedListUI$createFeedLoader$1$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0074, code lost:
    
        if (r10.getBottom() <= (r8.getHeight() - r8.getPaddingBottom())) goto L24;
     */
    @Override // androidx.recyclerview.widget.w2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onScrolled(androidx.recyclerview.widget.RecyclerView r8, int r9, int r10) {
        /*
            r7 = this;
            java.lang.String r0 = "com/tencent/mm/plugin/finder/feed/ui/FinderFeedListUI$createFeedLoader$1$scrollListener$1"
            java.lang.String r1 = "androidx/recyclerview/widget/RecyclerView$OnScrollListener"
            java.lang.String r2 = "onScrolled"
            java.lang.String r3 = "(Landroidx/recyclerview/widget/RecyclerView;II)V"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r8)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r4.add(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r4.add(r9)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r7
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            java.lang.String r9 = "recyclerView"
            kotlin.jvm.internal.o.g(r8, r9)
            r9 = 1
            if (r10 <= 0) goto L33
            r10 = 2
            goto L39
        L33:
            if (r10 >= 0) goto L37
            r10 = r9
            goto L39
        L37:
            int r10 = r7.f110069e
        L39:
            r7.f110069e = r10
            androidx.recyclerview.widget.RecyclerView$LayoutManager r10 = r8.getLayoutManager()
            boolean r0 = r10 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L46
            androidx.recyclerview.widget.LinearLayoutManager r10 = (androidx.recyclerview.widget.LinearLayoutManager) r10
            goto L47
        L46:
            r10 = 0
        L47:
            java.lang.String r0 = "(Landroidx/recyclerview/widget/RecyclerView;II)V"
            java.lang.String r1 = "onScrolled"
            java.lang.String r2 = "androidx/recyclerview/widget/RecyclerView$OnScrollListener"
            java.lang.String r3 = "com/tencent/mm/plugin/finder/feed/ui/FinderFeedListUI$createFeedLoader$1$scrollListener$1"
            if (r10 != 0) goto L55
            yj0.a.h(r7, r3, r2, r1, r0)
            return
        L55:
            int r4 = r10.y()
            int r5 = r10.getItemCount()
            android.view.View r10 = r10.findViewByPosition(r4)
            r6 = 0
            if (r10 == 0) goto L77
            int r5 = r5 - r9
            if (r4 != r5) goto L77
            int r4 = r8.getHeight()
            int r8 = r8.getPaddingBottom()
            int r4 = r4 - r8
            int r8 = r10.getBottom()
            if (r8 > r4) goto L77
            goto L78
        L77:
            r9 = r6
        L78:
            r7.f110068d = r9
            yj0.a.h(r7, r3, r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ui.g2.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
