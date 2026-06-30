package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class dg extends com.tencent.mm.plugin.finder.feed.dj {
    public final long A;
    public final com.tencent.mm.plugin.finder.feed.model.l0 B;
    public final zy2.h8 C;
    public fc2.d D;

    /* renamed from: y, reason: collision with root package name */
    public final int f109945y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.List f109946z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg(com.tencent.mm.ui.MMActivity context, int i17, java.util.List feedIdList, int i18, int i19, long j17, boolean z17) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feedIdList, "feedIdList");
        this.f109945y = i17;
        this.f109946z = feedIdList;
        this.A = j17;
        this.B = ((com.tencent.mm.plugin.finder.viewmodel.component.w6) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.w6.class)).f136307d;
        this.C = ((te2.e4) ((zy2.g8) pf5.z.f353948a.a(context).c(zy2.g8.class))).f417974d;
    }

    @Override // com.tencent.mm.plugin.finder.feed.dj, com.tencent.mm.plugin.finder.feed.c0
    public void B() {
        com.tencent.mm.view.RefreshLoadMoreLayout o17;
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader;
        com.tencent.mm.plugin.finder.feed.i0 i0Var = this.f106424g;
        if (i0Var != null && (o17 = i0Var.o()) != null && (baseFeedLoader = this.f106570t) != null) {
            com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher.register$default(baseFeedLoader, o17, false, 2, null);
        }
        com.tencent.mm.plugin.finder.feed.i0 i0Var2 = this.f106424g;
        kotlin.jvm.internal.o.d(i0Var2);
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader2 = this.f106570t;
        kotlin.jvm.internal.o.d(baseFeedLoader2);
        i0Var2.r(baseFeedLoader2.getDataListJustForAdapter());
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void C() {
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f106570t;
        if (baseFeedLoader != null) {
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestLoadMore$default(baseFeedLoader, false, 1, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void G(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.ui.bg(this, reason));
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void P() {
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f106570t;
        if (baseFeedLoader != null) {
            baseFeedLoader.requestRefresh();
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.dj
    public void V() {
        super.V();
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.ui.yf(this));
    }

    @Override // com.tencent.mm.plugin.finder.feed.dj
    public void X(com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader model, com.tencent.mm.plugin.finder.feed.gj callback) {
        fc2.c n17;
        fc2.c n18;
        fc2.c n19;
        kotlin.jvm.internal.o.g(model, "model");
        kotlin.jvm.internal.o.g(callback, "callback");
        super.X(model, callback);
        com.tencent.mm.plugin.finder.feed.ui.zf zfVar = new com.tencent.mm.plugin.finder.feed.ui.zf(this);
        com.tencent.mm.plugin.finder.feed.model.l0 l0Var = this.B;
        l0Var.N0(this.f109945y, this.f106422e, zfVar);
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        com.tencent.mm.ui.MMActivity activity = this.f106421d;
        com.tencent.mm.plugin.finder.viewmodel.component.ny e17 = iyVar.e(activity);
        if (e17 != null && (n19 = zy2.ra.n1(e17, 0, 1, null)) != null) {
            n19.a(l0Var);
        }
        kotlin.jvm.internal.o.g(activity, "activity");
        this.D = new com.tencent.mm.plugin.finder.report.w3(((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6()).f125421b;
        com.tencent.mm.plugin.finder.viewmodel.component.ny e18 = iyVar.e(activity);
        if (e18 != null && (n18 = zy2.ra.n1(e18, 0, 1, null)) != null) {
            fc2.d dVar = this.D;
            if (dVar == null) {
                kotlin.jvm.internal.o.o("observerForExposeReport");
                throw null;
            }
            n18.a(dVar);
        }
        zy2.h8 h8Var = this.C;
        com.tencent.mm.plugin.finder.feed.ui.ag agVar = new com.tencent.mm.plugin.finder.feed.ui.ag(this);
        com.tencent.mm.plugin.finder.feed.i0 i0Var = this.f106424g;
        ((com.tencent.mm.plugin.finder.feed.model.s3) h8Var).N0(agVar, i0Var != null ? i0Var.getRecyclerView() : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e19 = iyVar.e(activity);
        if (e19 == null || (n17 = zy2.ra.n1(e19, 0, 1, null)) == null) {
            return;
        }
        com.tencent.mm.plugin.finder.feed.model.s3 s3Var = (com.tencent.mm.plugin.finder.feed.model.s3) h8Var;
        s3Var.getClass();
        n17.a(s3Var);
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void i(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, db5.g4 menu, com.tencent.mm.ui.widget.dialog.k0 sheet, int i17) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        super.i(feed, menu, sheet, i17);
        com.tencent.mm.ui.MMActivity activity = this.f106421d;
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.report.b6.f124969a.c(((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), i17 == 1 ? "forward" : "tridot", true, new cl0.g());
    }

    @Override // com.tencent.mm.plugin.finder.feed.dj, com.tencent.mm.plugin.finder.feed.c0, fs2.a
    public void onDetach() {
        com.tencent.mm.view.RefreshLoadMoreLayout o17;
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader;
        fc2.c n17;
        fc2.c n18;
        fc2.c n19;
        com.tencent.mm.plugin.finder.feed.model.l0 l0Var = this.B;
        l0Var.onDetach();
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        com.tencent.mm.ui.MMActivity mMActivity = this.f106421d;
        com.tencent.mm.plugin.finder.viewmodel.component.ny e17 = iyVar.e(mMActivity);
        if (e17 != null && (n19 = zy2.ra.n1(e17, 0, 1, null)) != null) {
            n19.d(l0Var);
        }
        zy2.h8 h8Var = this.C;
        ((com.tencent.mm.plugin.finder.feed.model.s3) h8Var).onDetach();
        com.tencent.mm.plugin.finder.viewmodel.component.ny e18 = iyVar.e(mMActivity);
        if (e18 != null && (n18 = zy2.ra.n1(e18, 0, 1, null)) != null) {
            com.tencent.mm.plugin.finder.feed.model.s3 s3Var = (com.tencent.mm.plugin.finder.feed.model.s3) h8Var;
            s3Var.getClass();
            n18.d(s3Var);
        }
        com.tencent.mm.plugin.finder.viewmodel.component.ny e19 = iyVar.e(mMActivity);
        if (e19 != null && (n17 = zy2.ra.n1(e19, 0, 1, null)) != null) {
            fc2.d dVar = this.D;
            if (dVar == null) {
                kotlin.jvm.internal.o.o("observerForExposeReport");
                throw null;
            }
            n17.d(dVar);
        }
        com.tencent.mm.plugin.finder.feed.i0 i0Var = this.f106424g;
        if (i0Var != null && (o17 = i0Var.o()) != null && (baseFeedLoader = this.f106570t) != null) {
            baseFeedLoader.unregister(o17);
        }
        super.onDetach();
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void onRefreshEnd(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.ui.cg(this, reason));
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        com.tencent.mm.plugin.finder.feed.i0 i0Var = this.f106424g;
        zy2.zb.Kh(zbVar, i0Var != null ? i0Var.getRecyclerView() : null, ml2.x1.f328203g, "21", ml2.y.f328242g, 0, 0L, 0, 112, null);
    }
}
