package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class rp implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f108935d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.kr f108936e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f108937f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f108938g;

    public rp(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.feed.kr krVar, com.tencent.mm.ui.widget.dialog.k0 k0Var, in5.s0 s0Var) {
        this.f108935d = baseFinderFeed;
        this.f108936e = krVar;
        this.f108937f = k0Var;
        this.f108938g = s0Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.finder.feed.kr krVar;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f108935d;
        boolean i17 = hc2.b0.i(baseFinderFeed);
        in5.s0 s0Var = this.f108938g;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f108937f;
        com.tencent.mm.plugin.finder.assist.y4 y4Var = com.tencent.mm.plugin.finder.assist.y4.f102714a;
        com.tencent.mm.plugin.finder.feed.kr krVar2 = this.f108936e;
        if (i17 && krVar2.B) {
            com.tencent.mars.xlog.Log.i(krVar2.f107243t, "getCreateSecondMoreMenuListener: username=" + krVar2.f107231e + ", feedId=" + pm0.v.u(baseFinderFeed.getItemId()));
            com.tencent.mm.ui.MMActivity mMActivity = krVar2.f107230d;
            kotlin.jvm.internal.o.d(g4Var);
            y4Var.t(mMActivity, g4Var, baseFinderFeed);
            krVar2.E.a(g4Var, krVar2.f107230d, 204, 203, baseFinderFeed.getFeedObject().getStickyTime() != 0);
            y4Var.g(krVar2.f107230d, g4Var, baseFinderFeed);
            g4Var.b(108, com.tencent.mm.R.string.f490367t0, com.tencent.mm.R.raw.icons_outlined_delete);
            com.tencent.mm.plugin.finder.assist.y4.u(y4Var, g4Var, krVar2.f107230d, baseFinderFeed.getFeedObject().getMediaType(), 206, 205, baseFinderFeed.getFeedObject().getPrivate_flag() == 1, false, 64, null);
            krVar = krVar2;
            y4Var.a(krVar.f107230d, g4Var, baseFinderFeed);
            y4Var.d(krVar.f107230d, baseFinderFeed, g4Var);
            so2.u1 u1Var = baseFinderFeed instanceof so2.u1 ? (so2.u1) baseFinderFeed : null;
            if (u1Var != null && u1Var.i2()) {
                if (hc2.o0.g(baseFinderFeed.getFeedObject().getFeedObject()) && y4Var.c0(krVar.f107230d)) {
                    g4Var.g(304, krVar.f107230d.getString(com.tencent.mm.R.string.gyt), com.tencent.mm.R.raw.bullet_screen_lock_regular);
                } else {
                    g4Var.g(303, krVar.f107230d.getString(com.tencent.mm.R.string.gyx), com.tencent.mm.R.raw.bullet_screen_regular);
                }
            }
            com.tencent.mm.plugin.finder.feed.kr.g(krVar, baseFinderFeed, g4Var, k0Var);
            y4Var.x(krVar.f107230d, baseFinderFeed, g4Var);
            y4Var.q(krVar.f107230d, g4Var, baseFinderFeed);
            y4Var.m(krVar.f107230d, g4Var, baseFinderFeed);
            y4Var.c(krVar.f107230d, g4Var, baseFinderFeed, s0Var);
            y4Var.H(krVar.f107230d, baseFinderFeed, g4Var);
        } else {
            krVar = krVar2;
            if (!hc2.b0.i(baseFinderFeed)) {
                kotlin.jvm.internal.o.d(g4Var);
                com.tencent.mm.plugin.finder.feed.kr.g(krVar, baseFinderFeed, g4Var, k0Var);
                y4Var.x(krVar.f107230d, baseFinderFeed, g4Var);
                zl2.q4 q4Var = zl2.q4.f473933a;
                if (q4Var.C(baseFinderFeed)) {
                    q4Var.a(g4Var);
                    com.tencent.mm.ui.MMActivity activity = krVar.f107230d;
                    kotlin.jvm.internal.o.g(activity, "activity");
                    r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
                    i95.m c17 = i95.n0.c(zy2.zb.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    zy2.zb.I8((zy2.zb) c17, ml2.u1.T2, kz5.c1.i(new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "1")), V6.getString(1), java.lang.Integer.valueOf(V6.getInteger(5)).toString(), null, null, false, 112, null);
                }
                y4Var.h(krVar.f107230d, g4Var, baseFinderFeed);
                g4Var.b(101, com.tencent.mm.R.string.gys, com.tencent.mm.R.raw.icons_outlined_report_problem);
                y4Var.q(krVar.f107230d, g4Var, baseFinderFeed);
                y4Var.m(krVar.f107230d, g4Var, baseFinderFeed);
                y4Var.c(krVar.f107230d, g4Var, baseFinderFeed, s0Var);
                if (!krVar.B) {
                    y4Var.z(krVar.f107230d, baseFinderFeed, g4Var);
                }
                y4Var.H(krVar.f107230d, baseFinderFeed, g4Var);
            }
        }
        com.tencent.mm.ui.MMActivity mMActivity2 = krVar.f107230d;
        kotlin.jvm.internal.o.d(g4Var);
        y4Var.b(mMActivity2, baseFinderFeed, g4Var);
        y4Var.r(krVar.f107230d, baseFinderFeed, g4Var);
        y4Var.p(krVar.f107230d, baseFinderFeed, g4Var);
        y4Var.e(krVar.f107230d, baseFinderFeed, g4Var);
        y4Var.j(krVar.f107230d, baseFinderFeed, g4Var);
        y4Var.f(krVar.f107230d, baseFinderFeed, g4Var);
        com.tencent.mm.plugin.finder.report.x3.f125432a.b(g4Var);
        y4Var.n(krVar.f107230d, g4Var, baseFinderFeed);
    }
}
