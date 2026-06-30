package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class g2 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f191601d;

    /* renamed from: e, reason: collision with root package name */
    public int f191602e = 2;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13949x90d2cfd6 f191603f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f191604g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f191605h;

    public g2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13949x90d2cfd6 activityC13949x90d2cfd6, r45.qt2 qt2Var, java.lang.String str) {
        this.f191603f = activityC13949x90d2cfd6;
        this.f191604g = qt2Var;
        this.f191605h = str;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        ey2.u uVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderFeedListUI$createFeedLoader$1$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        if ((i17 == 1 || i17 == 2) && this.f191601d && this.f191602e == 2 && (uVar = (ey2.u) ey2.l0.f338955a.a(this.f191605h, ey2.u.class, null)) != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13949x90d2cfd6 activityC13949x90d2cfd6 = this.f191603f;
            sb6.append(activityC13949x90d2cfd6.B);
            sb6.append('-');
            sb6.append(pm0.v.u(uVar.f339071t));
            java.lang.String sb7 = sb6.toString();
            r45.qt2 qt2Var = this.f191604g;
            jz5.l lVar = new jz5.l("finder_tab_context_id", qt2Var.m75945x2fec8307(2));
            jz5.l lVar2 = new jz5.l("finder_context_id", qt2Var.m75945x2fec8307(1));
            jz5.l lVar3 = new jz5.l("comment_scene", java.lang.String.valueOf(qt2Var.m75939xb282bd08(5)));
            so2.n1 n1Var = uVar.f339058d;
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("column_flow_slide_bottom", this, kz5.c1.k(lVar, lVar2, lVar3, new jz5.l("feed_id", pm0.v.u(n1Var.mo2128x1ed62e84())), new jz5.l("column_trace_id", sb7), new jz5.l("feed_columnid", java.lang.String.valueOf(activityC13949x90d2cfd6.B)), new jz5.l("session_buffer", n1Var.g0()), new jz5.l("column_card_feedid", pm0.v.u(n1Var.mo2128x1ed62e84()))), 29179);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderFeedListUI$createFeedLoader$1$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0074, code lost:
    
        if (r10.getBottom() <= (r8.getHeight() - r8.getPaddingBottom())) goto L24;
     */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 r8, int r9, int r10) {
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
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r9)
            r9 = 1
            if (r10 <= 0) goto L33
            r10 = 2
            goto L39
        L33:
            if (r10 >= 0) goto L37
            r10 = r9
            goto L39
        L37:
            int r10 = r7.f191602e
        L39:
            r7.f191602e = r10
            androidx.recyclerview.widget.RecyclerView$LayoutManager r10 = r8.getLayoutManager()
            boolean r0 = r10 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de
            if (r0 == 0) goto L46
            androidx.recyclerview.widget.LinearLayoutManager r10 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) r10
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
            int r5 = r10.m8020x7e414b06()
            android.view.View r10 = r10.mo7935xa188593e(r4)
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
            r7.f191601d = r9
            yj0.a.h(r7, r3, r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.g2.mo482x8d21972b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
