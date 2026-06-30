package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class xo implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.zo f111088d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f111089e;

    public xo(com.tencent.mm.plugin.finder.feed.zo zoVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f111088d = zoVar;
        this.f111089e = baseFinderFeed;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.finder.feed.zo zoVar = this.f111088d;
        zoVar.getClass();
        com.tencent.mm.plugin.finder.model.BaseFinderFeed feed = this.f111089e;
        kotlin.jvm.internal.o.g(feed, "feed");
        boolean N0 = feed.N0();
        com.tencent.mm.plugin.finder.assist.y4 y4Var = com.tencent.mm.plugin.finder.assist.y4.f102714a;
        com.tencent.mm.ui.MMActivity activity = zoVar.f106421d;
        if (N0 && !zl2.q4.f473933a.C(feed)) {
            g4Var.b(108, com.tencent.mm.R.string.f490367t0, com.tencent.mm.R.raw.icons_outlined_delete);
            kotlin.jvm.internal.o.g(activity, "context");
            if (feed.getFeedObject().isCommentClose() || !y4Var.c0(activity)) {
                g4Var.g(107, activity.getString(com.tencent.mm.R.string.cwf), com.tencent.mm.R.raw.icons_outlined_comment);
            } else {
                g4Var.g(106, activity.getString(com.tencent.mm.R.string.f491363cv4), com.tencent.mm.R.raw.icons_outlined_comment_close);
            }
            if (!zoVar.f111284y.P && (feed.h() == 4 || feed.h() == 2)) {
                g4Var.g(112, activity.getString(com.tencent.mm.R.string.cwi), com.tencent.mm.R.raw.finder_icons_outlined_max_window);
            }
        }
        kotlin.jvm.internal.o.d(g4Var);
        y4Var.k(activity, g4Var, feed);
        if (!feed.N0()) {
            zl2.q4 q4Var = zl2.q4.f473933a;
            if (q4Var.C(feed)) {
                q4Var.a(g4Var);
                kotlin.jvm.internal.o.g(activity, "activity");
                r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
                i95.m c17 = i95.n0.c(zy2.zb.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                zy2.zb.I8((zy2.zb) c17, ml2.u1.T2, kz5.c1.i(new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "1")), V6.getString(1), java.lang.Integer.valueOf(V6.getInteger(5)).toString(), null, null, false, 112, null);
            }
            int i17 = zoVar.f106427m;
            if (i17 != 3 && i17 != 1 && i17 != 35) {
                y4Var.h(activity, g4Var, feed);
            }
            g4Var.g(101, activity.getString(com.tencent.mm.R.string.gys), com.tencent.mm.R.raw.icons_outlined_report_problem);
        }
        y4Var.m(activity, g4Var, feed);
        com.tencent.mm.plugin.finder.report.x3.f125432a.b(g4Var);
    }
}
