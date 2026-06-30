package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public class b9 extends com.tencent.mm.plugin.finder.feed.c0 {

    /* renamed from: s, reason: collision with root package name */
    public final boolean f106362s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f106363t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.ArrayList f106364u;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.FinderFeedDetailUIContract$Presenter$feedChangeListener$1 f106365v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f106366w;

    /* renamed from: x, reason: collision with root package name */
    public final yz5.l f106367x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f106368y;

    /* renamed from: z, reason: collision with root package name */
    public final yz5.l f106369z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.tencent.mm.plugin.finder.feed.FinderFeedDetailUIContract$Presenter$feedChangeListener$1] */
    public b9(int i17, com.tencent.mm.ui.MMActivity context, boolean z17, boolean z18, boolean z19, int i18, kotlin.jvm.internal.i iVar) {
        super(context, 0, 2, null);
        z17 = (i18 & 4) != 0 ? false : z17;
        z18 = (i18 & 8) != 0 ? false : z18;
        kotlin.jvm.internal.o.g(context, "context");
        this.f106362s = z17;
        this.f106363t = z18;
        this.f106364u = new java.util.ArrayList();
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f106365v = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedUpdateEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.FinderFeedDetailUIContract$Presenter$feedChangeListener$1
            {
                this.__eventId = 439877283;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent) {
                com.tencent.mm.autogen.events.FeedUpdateEvent event = feedUpdateEvent;
                kotlin.jvm.internal.o.g(event, "event");
                pm0.v.V(0L, new com.tencent.mm.plugin.finder.feed.x8(com.tencent.mm.plugin.finder.feed.b9.this, event));
                return true;
            }
        };
        this.f106367x = new com.tencent.mm.plugin.finder.feed.z8(this);
        this.f106369z = new com.tencent.mm.plugin.finder.feed.y8(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void B() {
        com.tencent.mm.plugin.finder.feed.i0 i0Var = this.f106424g;
        if (i0Var != null) {
            i0Var.r(this.f106364u);
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void C() {
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void D(com.tencent.mm.plugin.finder.feed.i0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        super.D(callback);
        alive();
        com.tencent.mm.ui.MMActivity activity = this.f106421d;
        kotlin.jvm.internal.o.g(activity, "activity");
        ((com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC.class)).P6(callback.getRecyclerView());
        com.tencent.mm.plugin.finder.feed.i0 i0Var = this.f106424g;
        androidx.recyclerview.widget.RecyclerView recyclerView = i0Var != null ? i0Var.getRecyclerView() : null;
        com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView finderRecyclerView = recyclerView instanceof com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView ? (com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView) recyclerView : null;
        if (finderRecyclerView != null) {
            finderRecyclerView.setSkipsTouchInterceptionListener(this.f106367x);
        }
        com.tencent.mm.plugin.finder.feed.i0 i0Var2 = this.f106424g;
        android.view.ViewParent recyclerView2 = i0Var2 != null ? i0Var2.getRecyclerView() : null;
        com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView finderRecyclerView2 = recyclerView2 instanceof com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView ? (com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView) recyclerView2 : null;
        if (finderRecyclerView2 == null) {
            return;
        }
        finderRecyclerView2.setInterceptTouchEventListener(this.f106369z);
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void P() {
    }

    public final so2.j5 Q() {
        java.util.ArrayList arrayList = this.f106364u;
        if (com.tencent.mm.sdk.platformtools.t8.L0(arrayList)) {
            return null;
        }
        return (so2.j5) arrayList.get(0);
    }

    @Override // com.tencent.mm.plugin.finder.feed.fp
    public int c(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed) {
        kotlin.jvm.internal.o.g(feed, "feed");
        so2.j5 Q = Q();
        return Q != null && (feed.getItemId() > Q.getItemId() ? 1 : (feed.getItemId() == Q.getItemId() ? 0 : -1)) == 0 ? 0 : -1;
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0, com.tencent.mm.plugin.finder.feed.k8
    public boolean d0() {
        return this.f106363t;
    }

    @Override // com.tencent.mm.plugin.finder.feed.fp
    public java.util.ArrayList f() {
        return this.f106364u;
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public in5.s h() {
        return new in5.s() { // from class: com.tencent.mm.plugin.finder.feed.FinderFeedDetailUIContract$Presenter$buildItemCoverts$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type != 2) {
                    if (type != 4) {
                        if (type == 9) {
                            com.tencent.mm.plugin.finder.feed.b9 b9Var = com.tencent.mm.plugin.finder.feed.b9.this;
                            return new com.tencent.mm.plugin.finder.convert.zf(b9Var.f106429o, b9Var, b9Var.f106362s, 0, 0, 24, null);
                        }
                        if (type != 3001) {
                            if (type != 3002) {
                                hc2.l.a(com.tencent.mm.plugin.finder.feed.b9.this.v(), type);
                                return new com.tencent.mm.plugin.finder.convert.z2();
                            }
                        }
                    }
                    com.tencent.mm.plugin.finder.feed.b9 b9Var2 = com.tencent.mm.plugin.finder.feed.b9.this;
                    return new com.tencent.mm.plugin.finder.convert.bh(b9Var2.f106429o, b9Var2, b9Var2.f106362s, 0, false, 24, null);
                }
                com.tencent.mm.plugin.finder.feed.b9 b9Var3 = com.tencent.mm.plugin.finder.feed.b9.this;
                return new com.tencent.mm.plugin.finder.convert.df(b9Var3, b9Var3.f106362s, 0, false, 12, null);
            }
        };
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void m(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, db5.g4 menu, com.tencent.mm.ui.widget.dialog.k0 sheet, in5.s0 holder) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        kotlin.jvm.internal.o.g(holder, "holder");
        if (this.f106363t) {
            menu.b(108, com.tencent.mm.R.string.f490367t0, com.tencent.mm.R.raw.icons_outlined_delete);
            com.tencent.mm.ui.MMActivity context = this.f106421d;
            kotlin.jvm.internal.o.g(context, "context");
            if (feed.getFeedObject().isCommentClose() || !com.tencent.mm.plugin.finder.assist.y4.f102714a.c0(context)) {
                menu.g(107, context.getString(com.tencent.mm.R.string.cwf), com.tencent.mm.R.raw.icons_outlined_comment);
            } else {
                menu.g(106, context.getString(com.tencent.mm.R.string.f491363cv4), com.tencent.mm.R.raw.icons_outlined_comment_close);
            }
        }
        super.m(feed, menu, sheet, holder);
        com.tencent.mars.xlog.Log.i(v(), "createSecond MenumentionListSelected : " + feed.getFeedObject().getMentionListSelected());
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0, fs2.a
    public void onDetach() {
        super.onDetach();
        dead();
        com.tencent.mm.plugin.finder.feed.i0 i0Var = this.f106424g;
        androidx.recyclerview.widget.RecyclerView recyclerView = i0Var != null ? i0Var.getRecyclerView() : null;
        com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView finderRecyclerView = recyclerView instanceof com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView ? (com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView) recyclerView : null;
        if (finderRecyclerView != null) {
            finderRecyclerView.setSkipsTouchInterceptionListener(null);
        }
        com.tencent.mm.plugin.finder.feed.i0 i0Var2 = this.f106424g;
        androidx.recyclerview.widget.RecyclerView recyclerView2 = i0Var2 != null ? i0Var2.getRecyclerView() : null;
        com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView finderRecyclerView2 = recyclerView2 instanceof com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView ? (com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView) recyclerView2 : null;
        if (finderRecyclerView2 == null) {
            return;
        }
        finderRecyclerView2.setInterceptTouchEventListener(null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public boolean q() {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public so2.j5 s(int i17) {
        return Q();
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer y() {
        so2.j5 Q = Q();
        return Q != null ? new com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer(Q, null, 2, null) : new com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer(null, 1, null);
    }
}
