package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class pp implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.kr f108738d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f108739e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f108740f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f108741g;

    public pp(com.tencent.mm.plugin.finder.feed.kr krVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, int i17, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f108738d = krVar;
        this.f108739e = baseFinderFeed;
        this.f108740f = i17;
        this.f108741g = k0Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        int i17;
        java.lang.Class cls;
        ec2.d e27;
        com.tencent.mm.plugin.finder.feed.kr krVar = this.f108738d;
        boolean z17 = krVar.B;
        com.tencent.mm.plugin.finder.assist.y4 y4Var = com.tencent.mm.plugin.finder.assist.y4.f102714a;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f108739e;
        com.tencent.mm.ui.MMActivity activity = krVar.f107230d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f108741g;
        int i18 = this.f108740f;
        if (z17) {
            i17 = 1;
            cls = com.tencent.mm.plugin.finder.viewmodel.component.ny.class;
            if (g4Var.z()) {
                com.tencent.mm.ui.MMActivity mMActivity = krVar.f107230d;
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = this.f108739e;
                com.tencent.mm.plugin.finder.assist.i4 N = com.tencent.mm.plugin.finder.assist.y4.N(y4Var, mMActivity, baseFinderFeed2, 0, new com.tencent.mm.plugin.finder.feed.np(g4Var, baseFinderFeed2, krVar, k0Var), new com.tencent.mm.plugin.finder.feed.op(g4Var, k0Var, krVar), 4, null);
                y4Var.B(activity, g4Var, baseFinderFeed, N);
                y4Var.C(activity, g4Var, baseFinderFeed, N);
                y4Var.l(activity, g4Var, baseFinderFeed);
                y4Var.E(g4Var, N);
                y4Var.i(activity, g4Var, baseFinderFeed, N);
                y4Var.o(activity, g4Var, baseFinderFeed);
                y4Var.A(activity, g4Var, baseFinderFeed);
                y4Var.D(activity, g4Var, baseFinderFeed);
                y4Var.w(activity, g4Var, baseFinderFeed);
                y4Var.v(activity, baseFinderFeed, g4Var);
                y4Var.F(activity, baseFinderFeed, g4Var);
                kotlin.jvm.internal.o.g(activity, "activity");
                r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(cls)).V6();
                cl0.g gVar = new cl0.g();
                gVar.h("ref_eid", i18 == 1 ? "forward" : "tridot");
                com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
                b6Var.c(V6, "delete", false, gVar);
                b6Var.c(V6, i18 != 1 ? "tridot" : "forward", true, new cl0.g());
            }
        } else {
            i17 = 1;
            cls = com.tencent.mm.plugin.finder.viewmodel.component.ny.class;
            com.tencent.mm.plugin.finder.assist.i4 N2 = com.tencent.mm.plugin.finder.assist.y4.N(y4Var, krVar.f107230d, baseFinderFeed, 0, new com.tencent.mm.plugin.finder.feed.lp(g4Var, baseFinderFeed, krVar, k0Var), new com.tencent.mm.plugin.finder.feed.mp(g4Var, k0Var, krVar), 4, null);
            if (baseFinderFeed instanceof so2.h1) {
                if (i18 == 1) {
                    baseFinderFeed.getFeedObject().setShareScene(7);
                } else if (i18 == 3) {
                    baseFinderFeed.getFeedObject().setShareScene(1);
                }
            }
            kotlin.jvm.internal.o.d(g4Var);
            y4Var.B(activity, g4Var, baseFinderFeed, N2);
            y4Var.C(activity, g4Var, baseFinderFeed, N2);
            y4Var.l(activity, g4Var, baseFinderFeed);
            y4Var.E(g4Var, N2);
            y4Var.i(activity, g4Var, baseFinderFeed, N2);
            y4Var.o(activity, g4Var, baseFinderFeed);
            y4Var.A(activity, g4Var, baseFinderFeed);
            y4Var.D(activity, g4Var, baseFinderFeed);
            y4Var.w(activity, g4Var, baseFinderFeed);
            y4Var.v(activity, baseFinderFeed, g4Var);
            y4Var.F(activity, baseFinderFeed, g4Var);
        }
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        long itemId = baseFinderFeed.getItemId();
        kotlin.jvm.internal.o.g(activity, "context");
        pf5.z zVar = pf5.z.f353948a;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(activity).a(cls);
        o3Var.bj(itemId, nyVar != null ? nyVar.f135380n : 0);
        kotlin.jvm.internal.o.g(activity, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(activity).a(cls);
        if (nyVar2 != null && (e27 = zy2.ra.e2(nyVar2, 0, i17, null)) != null) {
            e27.a(new ec2.a(16, baseFinderFeed.getItemId(), baseFinderFeed.w()));
        }
        com.tencent.mm.plugin.finder.report.x3 x3Var = com.tencent.mm.plugin.finder.report.x3.f125432a;
        kotlin.jvm.internal.o.d(g4Var);
        x3Var.a(g4Var);
    }
}
