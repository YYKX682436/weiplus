package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class hc extends com.tencent.mm.plugin.finder.feed.dj {
    public final zy2.h8 A;

    /* renamed from: y, reason: collision with root package name */
    public final int f106914y;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.l0 f106915z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hc(com.tencent.mm.ui.MMActivity context, int i17, int i18, int i19, kotlin.jvm.internal.i iVar) {
        super(context);
        i18 = (i19 & 4) != 0 ? 0 : i18;
        kotlin.jvm.internal.o.g(context, "context");
        this.f106914y = i17;
        this.f106427m = i18;
        pf5.z zVar = pf5.z.f353948a;
        this.f106915z = ((com.tencent.mm.plugin.finder.viewmodel.component.w6) zVar.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.w6.class)).f136307d;
        this.A = ((te2.e4) ((zy2.g8) zVar.a(context).c(zy2.g8.class))).f417974d;
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
        com.tencent.mm.plugin.finder.report.v1.o(com.tencent.mm.plugin.finder.report.v1.f125393a, 2, false, null, false, 0L, false, 60, null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void P() {
    }

    @Override // com.tencent.mm.plugin.finder.feed.dj
    public void X(com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader model, com.tencent.mm.plugin.finder.feed.gj callback) {
        fc2.c n17;
        fc2.c n18;
        kotlin.jvm.internal.o.g(model, "model");
        kotlin.jvm.internal.o.g(callback, "callback");
        super.X(model, callback);
        com.tencent.mm.plugin.finder.feed.fc fcVar = new com.tencent.mm.plugin.finder.feed.fc(this);
        com.tencent.mm.plugin.finder.feed.model.l0 l0Var = this.f106915z;
        l0Var.N0(this.f106914y, this.f106422e, fcVar);
        com.tencent.mm.ui.MMActivity context = this.f106421d;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar != null && (n18 = zy2.ra.n1(nyVar, 0, 1, null)) != null) {
            n18.a(l0Var);
        }
        zy2.h8 h8Var = this.A;
        com.tencent.mm.plugin.finder.feed.gc gcVar = new com.tencent.mm.plugin.finder.feed.gc(this);
        com.tencent.mm.plugin.finder.feed.i0 i0Var = this.f106424g;
        ((com.tencent.mm.plugin.finder.feed.model.s3) h8Var).N0(gcVar, i0Var != null ? i0Var.getRecyclerView() : null);
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar2 == null || (n17 = zy2.ra.n1(nyVar2, 0, 1, null)) == null) {
            return;
        }
        com.tencent.mm.plugin.finder.feed.model.s3 s3Var = (com.tencent.mm.plugin.finder.feed.model.s3) h8Var;
        s3Var.getClass();
        n17.a(s3Var);
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void m(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, db5.g4 menu, com.tencent.mm.ui.widget.dialog.k0 sheet, in5.s0 holder) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        kotlin.jvm.internal.o.g(holder, "holder");
        super.m(feed, menu, sheet, holder);
        if (hc2.b0.i(feed)) {
            return;
        }
        com.tencent.mm.plugin.finder.assist.y4.f102714a.h(this.f106421d, menu, feed);
    }

    @Override // com.tencent.mm.plugin.finder.feed.dj, com.tencent.mm.plugin.finder.feed.c0, fs2.a
    public void onDetach() {
        fc2.c n17;
        fc2.c n18;
        com.tencent.mm.plugin.finder.feed.model.l0 l0Var = this.f106915z;
        l0Var.onDetach();
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        com.tencent.mm.ui.MMActivity mMActivity = this.f106421d;
        com.tencent.mm.plugin.finder.viewmodel.component.ny e17 = iyVar.e(mMActivity);
        if (e17 != null && (n18 = zy2.ra.n1(e17, 0, 1, null)) != null) {
            n18.d(l0Var);
        }
        zy2.h8 h8Var = this.A;
        ((com.tencent.mm.plugin.finder.feed.model.s3) h8Var).onDetach();
        com.tencent.mm.plugin.finder.viewmodel.component.ny e18 = iyVar.e(mMActivity);
        if (e18 != null && (n17 = zy2.ra.n1(e18, 0, 1, null)) != null) {
            com.tencent.mm.plugin.finder.feed.model.s3 s3Var = (com.tencent.mm.plugin.finder.feed.model.s3) h8Var;
            s3Var.getClass();
            n17.d(s3Var);
        }
        com.tencent.mm.plugin.finder.report.v1 v1Var = com.tencent.mm.plugin.finder.report.v1.f125393a;
        com.tencent.mm.plugin.finder.viewmodel.component.ny e19 = iyVar.e(mMActivity);
        v1Var.x(2, e19 != null ? e19.V6() : null);
        super.onDetach();
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void onRefreshEnd(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.plugin.finder.report.v1 v1Var = com.tencent.mm.plugin.finder.report.v1.f125393a;
        com.tencent.mm.ui.MMActivity activity = this.f106421d;
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.report.v1.o(v1Var, 2, false, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), false, 0L, false, 56, null);
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.Kh((zy2.zb) c17, null, ml2.x1.f328202f, "16", ml2.y.f328242g, 0, 0L, 0, 112, null);
    }
}
