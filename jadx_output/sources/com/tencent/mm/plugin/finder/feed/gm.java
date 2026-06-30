package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class gm extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.hm f106853d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.em f106854e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gm(com.tencent.mm.plugin.finder.feed.hm hmVar, com.tencent.mm.plugin.finder.feed.em emVar) {
        super(1);
        this.f106853d = hmVar;
        this.f106854e = emVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006f, code lost:
    
        if (r4 != ((r6 == null || (r6 = r6.getDataList()) == null) ? -1 : kz5.c0.h(r6))) goto L18;
     */
    @Override // yz5.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r9) {
        /*
            r8 = this;
            android.view.MotionEvent r9 = (android.view.MotionEvent) r9
            java.lang.String r0 = "ev"
            kotlin.jvm.internal.o.g(r9, r0)
            com.tencent.mm.plugin.finder.feed.hm r0 = r8.f106853d
            com.tencent.mm.ui.MMActivity r1 = r0.f106968d
            java.lang.String r2 = "activity"
            kotlin.jvm.internal.o.g(r1, r2)
            pf5.z r2 = pf5.z.f353948a
            pf5.v r1 = r2.a(r1)
            java.lang.Class<com.tencent.mm.plugin.finder.member.preview.k> r2 = com.tencent.mm.plugin.finder.member.preview.k.class
            androidx.lifecycle.c1 r1 = r1.a(r2)
            com.tencent.mm.plugin.finder.member.preview.k r1 = (com.tencent.mm.plugin.finder.member.preview.k) r1
            android.view.View r1 = r1.O6()
            r2 = 2131317194(0x7f0951ca, float:1.825289E38)
            android.view.View r1 = r1.findViewById(r2)
            com.google.android.material.appbar.AppBarLayout r1 = (com.google.android.material.appbar.AppBarLayout) r1
            r2 = 0
            if (r1 == 0) goto L33
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            goto L34
        L33:
            r1 = r2
        L34:
            androidx.coordinatorlayout.widget.c r1 = (androidx.coordinatorlayout.widget.c) r1
            if (r1 == 0) goto L3a
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r2 = r1.f11006a
        L3a:
            com.google.android.material.appbar.AppBarLayout$Behavior r2 = (com.google.android.material.appbar.AppBarLayout.Behavior) r2
            androidx.recyclerview.widget.RecyclerView r1 = r0.getRecyclerView()
            java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView"
            kotlin.jvm.internal.o.e(r1, r3)
            com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView r1 = (com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView) r1
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r1.getLayoutManager()
            java.lang.String r4 = "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"
            kotlin.jvm.internal.o.e(r3, r4)
            androidx.recyclerview.widget.LinearLayoutManager r3 = (androidx.recyclerview.widget.LinearLayoutManager) r3
            int r4 = r9.getAction()
            r5 = 0
            if (r4 != 0) goto L71
            int r4 = r3.t()
            com.tencent.mm.plugin.finder.feed.em r6 = r8.f106854e
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader r6 = r6.f106570t
            if (r6 == 0) goto L6e
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r6 = r6.getDataList()
            if (r6 == 0) goto L6e
            int r6 = kz5.c0.h(r6)
            goto L6f
        L6e:
            r6 = -1
        L6f:
            if (r4 == r6) goto L75
        L71:
            boolean r4 = r0.f106931u
            if (r4 == 0) goto Lc7
        L75:
            float r4 = r9.getY()
            float r6 = r0.f106930t
            float r4 = r4 - r6
            float r6 = r9.getY()
            r0.f106930t = r6
            int r9 = r9.getAction()
            r6 = 1
            if (r9 == 0) goto Lc1
            if (r9 == r6) goto Lb0
            r7 = 2
            if (r9 == r7) goto L95
            r2 = 3
            if (r9 == r2) goto Lb0
            r1.requestDisallowInterceptTouchEvent(r5)
            goto Lca
        L95:
            r9 = 0
            int r9 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r9 >= 0) goto L9e
            r1.requestDisallowInterceptTouchEvent(r6)
            goto Lca
        L9e:
            if (r2 == 0) goto La5
            int r9 = r2.y()
            goto La6
        La5:
            r9 = r5
        La6:
            if (r9 >= 0) goto Lac
            r1.requestDisallowInterceptTouchEvent(r6)
            goto Lca
        Lac:
            r1.requestDisallowInterceptTouchEvent(r5)
            goto Lca
        Lb0:
            r1.requestDisallowInterceptTouchEvent(r5)
            r1.f1()
            com.tencent.mm.plugin.finder.feed.fm r9 = new com.tencent.mm.plugin.finder.feed.fm
            r9.<init>(r1, r3)
            r1.post(r9)
            r0.f106931u = r5
            goto Lca
        Lc1:
            r0.f106931u = r6
            r1.requestDisallowInterceptTouchEvent(r6)
            goto Lca
        Lc7:
            r1.requestDisallowInterceptTouchEvent(r5)
        Lca:
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.gm.invoke(java.lang.Object):java.lang.Object");
    }
}
