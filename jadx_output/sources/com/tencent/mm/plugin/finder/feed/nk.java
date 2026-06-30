package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class nk implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.tl f108580d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f108581e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f108582f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f108583g;

    public nk(com.tencent.mm.plugin.finder.feed.tl tlVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.ui.widget.dialog.k0 k0Var, in5.s0 s0Var) {
        this.f108580d = tlVar;
        this.f108581e = baseFinderFeed;
        this.f108582f = k0Var;
        this.f108583g = s0Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        kotlin.jvm.internal.o.d(g4Var);
        com.tencent.mm.plugin.finder.feed.tl tlVar = this.f108580d;
        tlVar.getClass();
        com.tencent.mm.plugin.finder.model.BaseFinderFeed feed = this.f108581e;
        kotlin.jvm.internal.o.g(feed, "feed");
        com.tencent.mm.ui.widget.dialog.k0 sheet = this.f108582f;
        kotlin.jvm.internal.o.g(sheet, "sheet");
        in5.s0 holder = this.f108583g;
        kotlin.jvm.internal.o.g(holder, "holder");
        boolean y17 = com.tencent.mm.ui.bk.y();
        com.tencent.mm.ui.MMActivity mMActivity = tlVar.f109069d;
        if (y17) {
            if (com.tencent.mm.ui.bk.z(mMActivity.getTaskId())) {
                g4Var.g(117, mMActivity.getString(com.tencent.mm.R.string.b9c), com.tencent.mm.R.raw.icons_outlined_merge);
            } else {
                g4Var.g(117, mMActivity.getString(com.tencent.mm.R.string.jjg), com.tencent.mm.R.raw.icons_outlined_sperated);
            }
        }
        com.tencent.mm.plugin.finder.assist.y4 y4Var = com.tencent.mm.plugin.finder.assist.y4.f102714a;
        y4Var.k(mMActivity, g4Var, feed);
        y4Var.s(mMActivity, g4Var, feed);
        so2.u1 u1Var = feed instanceof so2.u1 ? (so2.u1) feed : null;
        if (u1Var != null && u1Var.g2()) {
            if (gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_FINDER_FINDER_BULLET_SWITCH_BOOLEAN, true)) {
                g4Var.g(301, mMActivity.getString(com.tencent.mm.R.string.gyu), com.tencent.mm.R.raw.bullet_screen_off_regular);
            } else {
                g4Var.g(302, mMActivity.getString(com.tencent.mm.R.string.gyy), com.tencent.mm.R.raw.bullet_screen_on_regular);
            }
        }
        y4Var.y(tlVar.f109069d, feed, g4Var, sheet, 200);
        y4Var.x(mMActivity, feed, g4Var);
        if (!hc2.b0.i(feed)) {
            y4Var.h(mMActivity, g4Var, feed);
            g4Var.g(101, mMActivity.getString(com.tencent.mm.R.string.gys), com.tencent.mm.R.raw.icons_outlined_report_problem);
        }
        y4Var.q(mMActivity, g4Var, feed);
        y4Var.m(mMActivity, g4Var, feed);
        if (hc2.b0.i(feed)) {
            y4Var.t(mMActivity, g4Var, feed);
            y4Var.g(mMActivity, g4Var, feed);
        }
        y4Var.H(mMActivity, feed, g4Var);
        com.tencent.mm.plugin.finder.report.x3.f125432a.b(g4Var);
    }
}
