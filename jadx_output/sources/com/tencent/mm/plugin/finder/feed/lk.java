package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class lk implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.tl f107307d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f107308e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f107309f;

    public lk(com.tencent.mm.plugin.finder.feed.tl tlVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.ui.widget.dialog.k0 k0Var, int i17) {
        this.f107307d = tlVar;
        this.f107308e = baseFinderFeed;
        this.f107309f = k0Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        ec2.d e27;
        kotlin.jvm.internal.o.d(g4Var);
        com.tencent.mm.plugin.finder.feed.tl tlVar = this.f107307d;
        tlVar.getClass();
        com.tencent.mm.plugin.finder.model.BaseFinderFeed feed = this.f107308e;
        kotlin.jvm.internal.o.g(feed, "feed");
        com.tencent.mm.ui.widget.dialog.k0 sheet = this.f107309f;
        kotlin.jvm.internal.o.g(sheet, "sheet");
        com.tencent.mm.plugin.finder.assist.y4 y4Var = com.tencent.mm.plugin.finder.assist.y4.f102714a;
        com.tencent.mm.plugin.finder.assist.i4 N = com.tencent.mm.plugin.finder.assist.y4.N(y4Var, tlVar.f109069d, feed, 0, null, null, 28, null);
        com.tencent.mm.ui.MMActivity mMActivity = tlVar.f109069d;
        y4Var.B(mMActivity, g4Var, feed, N);
        y4Var.C(mMActivity, g4Var, feed, N);
        y4Var.l(mMActivity, g4Var, feed);
        y4Var.i(mMActivity, g4Var, feed, N);
        y4Var.o(mMActivity, g4Var, feed);
        y4Var.A(mMActivity, g4Var, feed);
        y4Var.D(mMActivity, g4Var, feed);
        y4Var.w(mMActivity, g4Var, feed);
        y4Var.v(mMActivity, feed, g4Var);
        y4Var.F(mMActivity, feed, g4Var);
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).bj(feed.getItemId(), tlVar.f109072g);
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(mMActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar != null && (e27 = zy2.ra.e2(nyVar, 0, 1, null)) != null) {
            e27.a(new ec2.a(16, feed.getItemId(), feed.w()));
        }
        com.tencent.mm.plugin.finder.report.x3.f125432a.a(g4Var);
    }
}
