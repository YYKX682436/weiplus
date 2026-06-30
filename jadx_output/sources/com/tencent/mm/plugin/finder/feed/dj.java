package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public abstract class dj extends com.tencent.mm.plugin.finder.feed.c0 {

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f106569s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader f106570t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f106571u;

    /* renamed from: v, reason: collision with root package name */
    public final yz5.l f106572v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f106573w;

    /* renamed from: x, reason: collision with root package name */
    public final yz5.l f106574x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj(com.tencent.mm.ui.MMActivity context) {
        super(context, 0, 2, null);
        kotlin.jvm.internal.o.g(context, "context");
        this.f106569s = "Finder.FinderLoaderFeedUIContract.Presenter";
        this.f106572v = new com.tencent.mm.plugin.finder.feed.cj(this);
        this.f106574x = new com.tencent.mm.plugin.finder.feed.bj(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void B() {
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader;
        com.tencent.mm.plugin.finder.feed.i0 i0Var = this.f106424g;
        kotlin.jvm.internal.o.e(i0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderLoaderFeedUIContract.ViewCallback");
        ym5.q1 w17 = ((com.tencent.mm.plugin.finder.feed.gj) i0Var).w();
        if (w17 != null && (baseFeedLoader = this.f106570t) != null) {
            com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher.register$default(baseFeedLoader, w17, false, 2, null);
        }
        com.tencent.mm.plugin.finder.feed.i0 i0Var2 = this.f106424g;
        kotlin.jvm.internal.o.d(i0Var2);
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader2 = this.f106570t;
        kotlin.jvm.internal.o.d(baseFeedLoader2);
        i0Var2.r(baseFeedLoader2.getDataListJustForAdapter());
    }

    public boolean Q() {
        return false;
    }

    public void V() {
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f106570t;
        if (baseFeedLoader != null) {
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestInit$default(baseFeedLoader, false, 1, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void X(com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r13, com.tencent.mm.plugin.finder.feed.gj r14) {
        /*
            r12 = this;
            java.lang.String r0 = "model"
            kotlin.jvm.internal.o.g(r13, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.o.g(r14, r0)
            r12.f106570t = r13
            super.D(r14)
            androidx.recyclerview.widget.RecyclerView r14 = r14.getRecyclerView()
            r0 = 2131305185(0x7f0922e1, float:1.8228534E38)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r14.setTag(r0, r1)
            com.tencent.mm.ui.MMActivity r0 = r12.f106421d
            java.lang.String r1 = "activity"
            kotlin.jvm.internal.o.g(r0, r1)
            pf5.z r2 = pf5.z.f353948a
            pf5.v r2 = r2.a(r0)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC> r3 = com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC.class
            androidx.lifecycle.c1 r2 = r2.a(r3)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC r2 = (com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC) r2
            r2.P6(r14)
            com.tencent.mm.plugin.finder.storage.t70 r2 = com.tencent.mm.plugin.finder.storage.t70.f127590a
            jz5.g r2 = com.tencent.mm.plugin.finder.storage.t70.f127797l0
            jz5.n r2 = (jz5.n) r2
            java.lang.Object r2 = r2.getValue()
            nb2.a r2 = (nb2.a) r2
            java.lang.Object r2 = r2.r()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L68
            com.tencent.mm.plugin.finder.storage.t70 r2 = com.tencent.mm.plugin.finder.storage.t70.f127590a
            jz5.g r2 = com.tencent.mm.plugin.finder.storage.t70.f127815m0
            jz5.n r2 = (jz5.n) r2
            java.lang.Object r2 = r2.getValue()
            nb2.a r2 = (nb2.a) r2
            java.lang.Object r2 = r2.r()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L66
            goto L68
        L66:
            r2 = r3
            goto L69
        L68:
            r2 = r4
        L69:
            r5 = 0
            if (r2 == 0) goto La5
            kotlin.jvm.internal.o.g(r0, r1)
            pf5.z r1 = pf5.z.f353948a
            pf5.v r1 = r1.a(r0)
            java.lang.Class<ni3.n> r2 = ni3.n.class
            androidx.lifecycle.c1 r1 = r1.a(r2)
            r6 = r1
            ni3.n r6 = (ni3.n) r6
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r7 = r13.getDataListJustForAdapter()
            r8 = 0
            cw2.f8 r9 = r12.f106429o
            java.lang.String r13 = "context"
            kotlin.jvm.internal.o.g(r0, r13)
            pf5.z r13 = pf5.z.f353948a
            pf5.v r13 = r13.a(r0)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.ny> r0 = com.tencent.mm.plugin.finder.viewmodel.component.ny.class
            androidx.lifecycle.c1 r13 = r13.a(r0)
            com.tencent.mm.plugin.finder.viewmodel.component.ny r13 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) r13
            if (r13 == 0) goto La0
            fc2.c r13 = zy2.ra.n1(r13, r3, r4, r5)
            r10 = r13
            goto La1
        La0:
            r10 = r5
        La1:
            r11 = -1
            r6.P6(r7, r8, r9, r10, r11)
        La5:
            boolean r13 = r14 instanceof com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView
            if (r13 == 0) goto Lad
            r0 = r14
            com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView r0 = (com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView) r0
            goto Lae
        Lad:
            r0 = r5
        Lae:
            if (r0 != 0) goto Lb1
            goto Lb6
        Lb1:
            yz5.l r1 = r12.f106572v
            r0.setSkipsTouchInterceptionListener(r1)
        Lb6:
            if (r13 == 0) goto Lbb
            r5 = r14
            com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView r5 = (com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView) r5
        Lbb:
            if (r5 != 0) goto Lbe
            goto Lc3
        Lbe:
            yz5.l r13 = r12.f106574x
            r5.setInterceptTouchEventListener(r13)
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.dj.X(com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.gj):void");
    }

    @Override // com.tencent.mm.plugin.finder.feed.fp
    public int c(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed) {
        java.util.AbstractList dataListJustForAdapter;
        kotlin.jvm.internal.o.g(feed, "feed");
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f106570t;
        if (baseFeedLoader == null || (dataListJustForAdapter = baseFeedLoader.getDataListJustForAdapter()) == null) {
            return -1;
        }
        return dataListJustForAdapter.indexOf(feed);
    }

    @Override // com.tencent.mm.plugin.finder.feed.fp
    public java.util.ArrayList f() {
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f106570t;
        if (baseFeedLoader != null) {
            return baseFeedLoader.getDataListJustForAdapter();
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public in5.s h() {
        return new com.tencent.mm.plugin.finder.feed.FinderLoaderFeedUIContract$Presenter$buildItemCoverts$1(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0, fs2.a
    public void onDetach() {
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader;
        com.tencent.mm.plugin.finder.feed.i0 i0Var = this.f106424g;
        kotlin.jvm.internal.o.e(i0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderLoaderFeedUIContract.ViewCallback");
        ym5.q1 w17 = ((com.tencent.mm.plugin.finder.feed.gj) i0Var).w();
        if (w17 != null && (baseFeedLoader = this.f106570t) != null) {
            baseFeedLoader.unregister(w17);
        }
        super.onDetach();
        com.tencent.mm.plugin.finder.feed.i0 i0Var2 = this.f106424g;
        androidx.recyclerview.widget.RecyclerView recyclerView = i0Var2 != null ? i0Var2.getRecyclerView() : null;
        com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView finderRecyclerView = recyclerView instanceof com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView ? (com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView) recyclerView : null;
        if (finderRecyclerView != null) {
            finderRecyclerView.setSkipsTouchInterceptionListener(null);
        }
        com.tencent.mm.plugin.finder.feed.i0 i0Var3 = this.f106424g;
        androidx.recyclerview.widget.RecyclerView recyclerView2 = i0Var3 != null ? i0Var3.getRecyclerView() : null;
        com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView finderRecyclerView2 = recyclerView2 instanceof com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView ? (com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView) recyclerView2 : null;
        if (finderRecyclerView2 == null) {
            return;
        }
        finderRecyclerView2.setInterceptTouchEventListener(null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public so2.j5 s(int i17) {
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f106570t;
        if (baseFeedLoader != null) {
            return (so2.j5) baseFeedLoader.safeGet(i17);
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public java.lang.String v() {
        return this.f106569s;
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer y() {
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f106570t;
        kotlin.jvm.internal.o.d(baseFeedLoader);
        return baseFeedLoader.getDataListJustForAdapter();
    }
}
