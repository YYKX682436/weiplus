package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class bm implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f106396d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.em f106397e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f106398f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f106399g;

    public bm(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.feed.em emVar, com.tencent.mm.ui.widget.dialog.k0 k0Var, in5.s0 s0Var) {
        this.f106396d = baseFinderFeed;
        this.f106397e = emVar;
        this.f106398f = k0Var;
        this.f106399g = s0Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.finder.feed.em emVar;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f106396d;
        boolean i17 = hc2.b0.i(baseFinderFeed);
        in5.s0 s0Var = this.f106399g;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f106398f;
        com.tencent.mm.plugin.finder.assist.y4 y4Var = com.tencent.mm.plugin.finder.assist.y4.f102714a;
        com.tencent.mm.plugin.finder.feed.em emVar2 = this.f106397e;
        if (i17 && emVar2.d0()) {
            g4Var.b(108, com.tencent.mm.R.string.f490367t0, com.tencent.mm.R.raw.icons_outlined_delete);
            boolean z17 = false;
            emVar = emVar2;
            com.tencent.mm.plugin.finder.assist.y4.u(y4Var, g4Var, emVar2.f106421d, baseFinderFeed.getFeedObject().getMediaType(), 206, 205, baseFinderFeed.getFeedObject().getPrivate_flag() == 1, false, 64, null);
            y4Var.g(emVar.f106421d, g4Var, baseFinderFeed);
            y4Var.a(emVar.f106421d, g4Var, baseFinderFeed);
            y4Var.d(emVar.f106421d, baseFinderFeed, g4Var);
            so2.u1 u1Var = baseFinderFeed instanceof so2.u1 ? (so2.u1) baseFinderFeed : null;
            if (u1Var != null && u1Var.i2()) {
                z17 = true;
            }
            if (z17) {
                if (hc2.o0.g(baseFinderFeed.getFeedObject().getFeedObject()) && y4Var.c0(emVar.f106421d)) {
                    g4Var.g(304, emVar.f106421d.getString(com.tencent.mm.R.string.gyt), com.tencent.mm.R.raw.bullet_screen_lock_regular);
                } else {
                    g4Var.g(303, emVar.f106421d.getString(com.tencent.mm.R.string.gyx), com.tencent.mm.R.raw.bullet_screen_regular);
                }
            }
            com.tencent.mm.plugin.finder.feed.em.Z(emVar, baseFinderFeed, g4Var, k0Var);
            y4Var.c(emVar.f106421d, g4Var, baseFinderFeed, s0Var);
        } else {
            emVar = emVar2;
            if (!hc2.b0.i(baseFinderFeed)) {
                kotlin.jvm.internal.o.d(g4Var);
                com.tencent.mm.plugin.finder.feed.em.Z(emVar, baseFinderFeed, g4Var, k0Var);
                y4Var.c(emVar.f106421d, g4Var, baseFinderFeed, s0Var);
                if (!emVar.d0()) {
                    y4Var.z(emVar.f106421d, baseFinderFeed, g4Var);
                }
                g4Var.b(101, com.tencent.mm.R.string.gys, com.tencent.mm.R.raw.icons_outlined_report_problem);
                y4Var.q(emVar.f106421d, g4Var, baseFinderFeed);
            }
        }
        com.tencent.mm.ui.MMActivity mMActivity = emVar.f106421d;
        kotlin.jvm.internal.o.d(g4Var);
        y4Var.p(mMActivity, baseFinderFeed, g4Var);
        y4Var.e(emVar.f106421d, baseFinderFeed, g4Var);
        y4Var.j(emVar.f106421d, baseFinderFeed, g4Var);
        com.tencent.mm.plugin.finder.report.x3.f125432a.b(g4Var);
    }
}
