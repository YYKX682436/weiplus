package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class f9 extends com.tencent.mm.plugin.finder.feed.dj {
    public final zy2.h8 A;
    public fc2.d B;

    /* renamed from: y, reason: collision with root package name */
    public final int f106728y;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.l0 f106729z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9(com.tencent.mm.ui.MMActivity context, int i17) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f106728y = i17;
        this.f106729z = ((com.tencent.mm.plugin.finder.viewmodel.component.w6) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.w6.class)).f136307d;
        this.A = ((te2.e4) ((zy2.g8) pf5.z.f353948a.a(context).c(zy2.g8.class))).f417974d;
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void C() {
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f106570t;
        if (baseFeedLoader != null) {
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestLoadMore$default(baseFeedLoader, false, 1, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void P() {
    }

    @Override // com.tencent.mm.plugin.finder.feed.dj
    public void X(com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader model, com.tencent.mm.plugin.finder.feed.gj callback) {
        fc2.c n17;
        fc2.c n18;
        fc2.c n19;
        kotlin.jvm.internal.o.g(model, "model");
        kotlin.jvm.internal.o.g(callback, "callback");
        super.X(model, callback);
        com.tencent.mm.plugin.finder.feed.d9 d9Var = new com.tencent.mm.plugin.finder.feed.d9(this);
        com.tencent.mm.plugin.finder.feed.model.l0 l0Var = this.f106729z;
        l0Var.N0(this.f106728y, this.f106422e, d9Var);
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        com.tencent.mm.ui.MMActivity activity = this.f106421d;
        com.tencent.mm.plugin.finder.viewmodel.component.ny e17 = iyVar.e(activity);
        if (e17 != null && (n19 = zy2.ra.n1(e17, 0, 1, null)) != null) {
            n19.a(l0Var);
        }
        kotlin.jvm.internal.o.g(activity, "activity");
        this.B = new com.tencent.mm.plugin.finder.report.w3(((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6()).f125421b;
        com.tencent.mm.plugin.finder.viewmodel.component.ny e18 = iyVar.e(activity);
        if (e18 != null && (n18 = zy2.ra.n1(e18, 0, 1, null)) != null) {
            fc2.d dVar = this.B;
            if (dVar == null) {
                kotlin.jvm.internal.o.o("observerForExposeReport");
                throw null;
            }
            n18.a(dVar);
        }
        zy2.h8 h8Var = this.A;
        com.tencent.mm.plugin.finder.feed.e9 e9Var = new com.tencent.mm.plugin.finder.feed.e9(this);
        com.tencent.mm.plugin.finder.feed.i0 i0Var = this.f106424g;
        ((com.tencent.mm.plugin.finder.feed.model.s3) h8Var).N0(e9Var, i0Var != null ? i0Var.getRecyclerView() : null);
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
        fc2.c n17;
        fc2.c n18;
        fc2.c n19;
        com.tencent.mm.plugin.finder.feed.model.l0 l0Var = this.f106729z;
        l0Var.onDetach();
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        com.tencent.mm.ui.MMActivity mMActivity = this.f106421d;
        com.tencent.mm.plugin.finder.viewmodel.component.ny e17 = iyVar.e(mMActivity);
        if (e17 != null && (n19 = zy2.ra.n1(e17, 0, 1, null)) != null) {
            n19.d(l0Var);
        }
        zy2.h8 h8Var = this.A;
        ((com.tencent.mm.plugin.finder.feed.model.s3) h8Var).onDetach();
        com.tencent.mm.plugin.finder.viewmodel.component.ny e18 = iyVar.e(mMActivity);
        if (e18 != null && (n18 = zy2.ra.n1(e18, 0, 1, null)) != null) {
            com.tencent.mm.plugin.finder.feed.model.s3 s3Var = (com.tencent.mm.plugin.finder.feed.model.s3) h8Var;
            s3Var.getClass();
            n18.d(s3Var);
        }
        com.tencent.mm.plugin.finder.viewmodel.component.ny e19 = iyVar.e(mMActivity);
        if (e19 != null && (n17 = zy2.ra.n1(e19, 0, 1, null)) != null) {
            fc2.d dVar = this.B;
            if (dVar == null) {
                kotlin.jvm.internal.o.o("observerForExposeReport");
                throw null;
            }
            n17.d(dVar);
        }
        super.onDetach();
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void onRefreshEnd(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        com.tencent.mm.plugin.finder.feed.i0 i0Var = this.f106424g;
        zy2.zb.Kh(zbVar, i0Var != null ? i0Var.getRecyclerView() : null, ml2.x1.f328203g, "280", ml2.y.f328242g, 0, 0L, 0, 112, null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public boolean q() {
        return false;
    }
}
