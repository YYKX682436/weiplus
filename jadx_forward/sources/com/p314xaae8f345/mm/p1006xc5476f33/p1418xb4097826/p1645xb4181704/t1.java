package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704;

/* loaded from: classes10.dex */
public final class t1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public int f211942d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a2 f211943e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f211944f;

    public t1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a2 a2Var, android.content.Context context) {
        this.f211943e = a2Var;
        this.f211944f = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        if (r8 != 5) goto L21;
     */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 r7, int r8) {
        /*
            r6 = this;
            java.lang.String r0 = "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder$onBuildDrawerBody$1"
            java.lang.String r1 = "androidx/recyclerview/widget/RecyclerView$OnScrollListener"
            java.lang.String r2 = "onScrollStateChanged"
            java.lang.String r3 = "(Landroidx/recyclerview/widget/RecyclerView;I)V"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r7)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r4.add(r5)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r6
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            java.lang.String r0 = "recyclerView"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r0)
            com.tencent.mm.plugin.finder.uniComments.a2 r0 = r6.f211943e
            if (r8 == 0) goto L53
            r1 = 1
            r2 = 3
            if (r8 == r1) goto L38
            if (r8 == r2) goto L38
            r1 = 4
            if (r8 == r1) goto L53
            r1 = 5
            if (r8 == r1) goto L53
            goto La3
        L38:
            int r7 = r6.f211942d
            if (r7 == r2) goto L48
            java.lang.String r7 = "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity"
            android.content.Context r1 = r6.f211944f
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r1, r7)
            com.tencent.mm.ui.MMFragmentActivity r1 = (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) r1
            r1.mo48674x36654fab()
        L48:
            com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter r7 = r0.f()
            r0 = 0
            java.lang.String r1 = ""
            r7.h(r1, r1, r0)
            goto La3
        L53:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r7 = r7.getLayoutManager()
            java.lang.String r1 = "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r7, r1)
            androidx.recyclerview.widget.LinearLayoutManager r7 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) r7
            com.tencent.mm.plugin.finder.uniComments.d r0 = r0.f211700d
            int r7 = r7.y()
            com.tencent.mm.plugin.finder.uniComments.o0 r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0) r0
            com.tencent.mm.plugin.finder.uniComments.o1 r1 = r0.f211859h
            java.util.ArrayList r1 = r1.f211875a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "preloadNextPage, onScrollIdle, lastVisiblePosition:"
            r2.<init>(r3)
            r2.append(r7)
            java.lang.String r3 = ", dataList size:"
            r2.append(r3)
            int r3 = r1.size()
            r2.append(r3)
            java.lang.String r3 = ", canPreload:"
            r2.append(r3)
            boolean r0 = r0.B
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "MicroMsg.TextStatus.TextStatusCommentDrawerPresenter"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
            if (r7 < 0) goto La3
            int r0 = r1.size()
            if (r7 >= r0) goto La3
            r1.size()
            com.tencent.mm.plugin.finder.storage.t70 r7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a
            r7.s()
        La3:
            r6.f211942d = r8
            java.lang.String r7 = "onScrollStateChanged"
            java.lang.String r8 = "(Landroidx/recyclerview/widget/RecyclerView;I)V"
            java.lang.String r0 = "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder$onBuildDrawerBody$1"
            java.lang.String r1 = "androidx/recyclerview/widget/RecyclerView$OnScrollListener"
            yj0.a.h(r6, r0, r1, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.t1.mo481x4d79408f(androidx.recyclerview.widget.RecyclerView, int):void");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder$onBuildDrawerBody$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder$onBuildDrawerBody$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
