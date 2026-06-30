package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class fx implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.pz f106784d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f106785e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f106786f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f106787g;

    public fx(com.tencent.mm.plugin.finder.feed.pz pzVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, int i17, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f106784d = pzVar;
        this.f106785e = baseFinderFeed;
        this.f106786f = i17;
        this.f106787g = k0Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        ec2.d e27;
        com.tencent.mm.plugin.finder.assist.y4 y4Var = com.tencent.mm.plugin.finder.assist.y4.f102714a;
        com.tencent.mm.plugin.finder.feed.pz pzVar = this.f106784d;
        com.tencent.mm.ui.MMActivity mMActivity = pzVar.f108755g;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f106785e;
        int i17 = this.f106786f;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f106787g;
        com.tencent.mm.plugin.finder.assist.i4 N = com.tencent.mm.plugin.finder.assist.y4.N(y4Var, mMActivity, baseFinderFeed, 0, new com.tencent.mm.plugin.finder.feed.dx(g4Var, baseFinderFeed, i17, pzVar, k0Var), new com.tencent.mm.plugin.finder.feed.ex(g4Var, k0Var, pzVar), 4, null);
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = this.f106785e;
        boolean z17 = baseFinderFeed2 instanceof so2.h1;
        if (z17) {
            int i18 = this.f106786f;
            if (i18 == 1) {
                baseFinderFeed2.getFeedObject().setShareScene(7);
            } else if (i18 == 3) {
                baseFinderFeed2.getFeedObject().setShareScene(1);
            }
        }
        if (!N.f102259i) {
            if (z17 && ((so2.h1) baseFinderFeed2).f410381h) {
                com.tencent.mars.xlog.Log.i(pzVar.U, "showLongClickForwardGuide");
                int color = pzVar.f108755g.getResources().getColor(com.tencent.mm.R.color.f478502m);
                db5.h4 h4Var = new db5.h4(g4Var.f228346f, 102, 0);
                h4Var.f228368i = N.f102255e;
                h4Var.d(com.tencent.mm.R.raw.finder_icons_filled_share, color);
                h4Var.f228375s = N.f102251a;
                h4Var.F = java.lang.Boolean.TRUE;
                ((java.util.ArrayList) g4Var.f228344d).add(h4Var);
            } else {
                com.tencent.mm.ui.MMActivity mMActivity2 = pzVar.f108755g;
                kotlin.jvm.internal.o.d(g4Var);
                y4Var.B(mMActivity2, g4Var, baseFinderFeed2, N);
            }
            c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
            ml2.u1 u1Var = ml2.u1.f328062m;
            com.tencent.mm.ui.MMActivity activity = pzVar.f108755g;
            kotlin.jvm.internal.o.g(activity, "activity");
            ((b92.d1) zbVar).sj(u1Var, baseFinderFeed2, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6());
        }
        com.tencent.mm.ui.MMActivity mMActivity3 = pzVar.f108755g;
        kotlin.jvm.internal.o.d(g4Var);
        y4Var.C(mMActivity3, g4Var, baseFinderFeed2, N);
        com.tencent.mm.ui.MMActivity context = pzVar.f108755g;
        y4Var.l(context, g4Var, baseFinderFeed2);
        y4Var.E(g4Var, N);
        y4Var.i(context, g4Var, baseFinderFeed2, N);
        y4Var.o(context, g4Var, baseFinderFeed2);
        y4Var.A(context, g4Var, baseFinderFeed2);
        y4Var.D(context, g4Var, baseFinderFeed2);
        y4Var.w(context, g4Var, baseFinderFeed2);
        y4Var.v(context, baseFinderFeed2, g4Var);
        y4Var.F(context, baseFinderFeed2, g4Var);
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar != null) {
            ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).bj(baseFinderFeed2.getItemId(), nyVar.f135380n);
        }
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar2 != null && (e27 = zy2.ra.e2(nyVar2, 0, 1, null)) != null) {
            e27.a(new ec2.a(16, baseFinderFeed2.getItemId(), baseFinderFeed2.w()));
        }
        com.tencent.mm.plugin.finder.report.x3.f125432a.a(g4Var);
    }
}
