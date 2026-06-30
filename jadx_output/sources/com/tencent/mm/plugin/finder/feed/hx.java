package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class hx implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.pz f106961d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f106962e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f106963f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f106964g;

    public hx(com.tencent.mm.plugin.finder.feed.pz pzVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.ui.widget.dialog.k0 k0Var, in5.s0 s0Var) {
        this.f106961d = pzVar;
        this.f106962e = baseFinderFeed;
        this.f106963f = k0Var;
        this.f106964g = s0Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.finder.feed.pz pzVar = this.f106961d;
        pzVar.getClass();
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f106962e;
        boolean N0 = baseFinderFeed.N0();
        com.tencent.mm.plugin.finder.assist.y4 y4Var = com.tencent.mm.plugin.finder.assist.y4.f102714a;
        com.tencent.mm.ui.MMActivity context = pzVar.f108755g;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f106963f;
        in5.s0 s0Var = this.f106964g;
        if (!N0) {
            kotlin.jvm.internal.o.d(g4Var);
            com.tencent.mm.plugin.finder.feed.pz.I0(pzVar, baseFinderFeed, g4Var, k0Var, s0Var);
            y4Var.x(context, baseFinderFeed, g4Var);
            zl2.q4 q4Var = zl2.q4.f473933a;
            if (q4Var.C(baseFinderFeed)) {
                q4Var.a(g4Var);
                kotlin.jvm.internal.o.g(context, "activity");
                r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
                i95.m c17 = i95.n0.c(zy2.zb.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                zy2.zb.I8((zy2.zb) c17, ml2.u1.T2, kz5.c1.i(new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "1")), V6.getString(1), java.lang.Integer.valueOf(V6.getInteger(5)).toString(), null, null, false, 112, null);
            }
            y4Var.h(context, g4Var, baseFinderFeed);
            g4Var.g(101, context.getString(com.tencent.mm.R.string.gys), com.tencent.mm.R.raw.icons_outlined_report_problem);
            y4Var.q(context, g4Var, baseFinderFeed);
            y4Var.m(context, g4Var, baseFinderFeed);
            y4Var.c(context, g4Var, baseFinderFeed, s0Var);
            y4Var.z(context, baseFinderFeed, g4Var);
            if (q4Var.C(baseFinderFeed)) {
                kotlin.jvm.internal.o.g(context, "context");
                if (baseFinderFeed.getShouldShowLiveFeedDanmakuSwitch()) {
                    if (baseFinderFeed.getIsUserOpenLiveFeedDanmaku()) {
                        g4Var.g(404, context.getString(com.tencent.mm.R.string.gyu), com.tencent.mm.R.raw.bullet_screen_off_regular);
                    } else {
                        g4Var.g(405, context.getString(com.tencent.mm.R.string.gyy), com.tencent.mm.R.raw.bullet_screen_on_regular);
                    }
                    r45.qt2 V62 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
                    i95.m c18 = i95.n0.c(zy2.zb.class);
                    kotlin.jvm.internal.o.f(c18, "getService(...)");
                    zy2.zb zbVar = (zy2.zb) c18;
                    ml2.u1 u1Var = ml2.u1.Z2;
                    jz5.l[] lVarArr = new jz5.l[2];
                    r45.nw1 liveInfo = baseFinderFeed.getFeedObject().getLiveInfo();
                    lVarArr[0] = new jz5.l("liveId", java.lang.String.valueOf(liveInfo != null ? java.lang.Long.valueOf(liveInfo.getLong(0)) : null));
                    lVarArr[1] = new jz5.l("status_type", java.lang.String.valueOf(baseFinderFeed.getIsUserOpenLiveFeedDanmaku() ? 1 : 0));
                    zy2.zb.I8(zbVar, u1Var, kz5.c1.l(lVarArr), V62.getString(1), java.lang.Integer.valueOf(V62.getInteger(5)).toString(), null, null, false, 112, null);
                }
            }
            y4Var.H(context, baseFinderFeed, g4Var);
        } else if (!zl2.q4.f473933a.C(baseFinderFeed)) {
            kotlin.jvm.internal.o.d(g4Var);
            y4Var.t(context, g4Var, baseFinderFeed);
            y4Var.g(context, g4Var, baseFinderFeed);
            g4Var.b(108, com.tencent.mm.R.string.f490367t0, com.tencent.mm.R.raw.icons_outlined_delete);
            y4Var.d(context, baseFinderFeed, g4Var);
            y4Var.q(context, g4Var, baseFinderFeed);
            y4Var.m(context, g4Var, baseFinderFeed);
            y4Var.c(context, g4Var, baseFinderFeed, s0Var);
            y4Var.z(context, baseFinderFeed, g4Var);
            y4Var.H(context, baseFinderFeed, g4Var);
            com.tencent.mm.plugin.finder.feed.pz.I0(pzVar, baseFinderFeed, g4Var, k0Var, s0Var);
        }
        kotlin.jvm.internal.o.d(g4Var);
        y4Var.b(context, baseFinderFeed, g4Var);
        y4Var.r(context, baseFinderFeed, g4Var);
        y4Var.p(context, baseFinderFeed, g4Var);
        y4Var.e(context, baseFinderFeed, g4Var);
        y4Var.j(context, baseFinderFeed, g4Var);
        y4Var.f(context, baseFinderFeed, g4Var);
        y4Var.n(context, g4Var, baseFinderFeed);
        int indexOf = pzVar.C.getDataListJustForAdapter().indexOf(baseFinderFeed);
        if (indexOf < 0) {
            com.tencent.mars.xlog.Log.i(pzVar.U, "pos is error " + indexOf + ' ' + baseFinderFeed);
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
        com.tencent.mm.plugin.finder.feed.pz.J0(pzVar, baseFinderFeed, g4Var);
        com.tencent.mm.plugin.finder.report.x3.f125432a.b(g4Var);
    }
}
