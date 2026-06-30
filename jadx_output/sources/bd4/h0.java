package bd4;

/* loaded from: classes4.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c50.v0 f19350d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView f19351e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f19352f;

    public h0(c50.v0 v0Var, com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView improveFinderTierView, int i17) {
        this.f19350d = v0Var;
        this.f19351e = improveFinderTierView;
        this.f19352f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView$updateReport$1");
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        cl0.g bj6 = ((c61.h9) ((c50.w0) i95.n0.c(c50.w0.class))).bj(this.f19350d);
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView improveFinderTierView = this.f19351e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$calculateFrontSnsId", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView");
        improveFinderTierView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calculateFrontSnsId", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView");
        java.lang.String t07 = ca4.z0.t0(com.tencent.mm.plugin.sns.model.l4.Fj().k2(0L, 1, true));
        kotlin.jvm.internal.o.f(t07, "longToString(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calculateFrontSnsId", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$calculateFrontSnsId", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$showUserNameStr", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView");
        improveFinderTierView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showUserNameStr", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView");
        java.lang.String optString = bj6.optString("show_username", "null");
        kotlin.jvm.internal.o.f(optString, "optString(...)");
        java.lang.String t17 = r26.i0.t(optString, "#", "|", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveFinderTierView", "report key:show_username value:".concat(t17));
        jz5.l lVar = new jz5.l("show_username", t17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showUserNameStr", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$showUserNameStr", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$isToResume$p", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView");
        boolean z17 = improveFinderTierView.f169135d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$isToResume$p", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView");
        cy1.a aVar = (cy1.a) rVar;
        aVar.gk(improveFinderTierView, kz5.c1.k(com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView.c(improveFinderTierView, bj6, "contenttype"), com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView.c(improveFinderTierView, bj6, "friend_like_count"), com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView.c(improveFinderTierView, bj6, "if_show_less"), com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView.c(improveFinderTierView, bj6, "if_show_remarks"), com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView.c(improveFinderTierView, bj6, "next_page_type"), com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView.d(improveFinderTierView, bj6, "next_page_feedid"), com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView.d(improveFinderTierView, bj6, "finder_context_id"), new jz5.l("before_show_feedid", t07), new jz5.l("appear_index", java.lang.Integer.valueOf(this.f19352f - 1)), com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView.d(improveFinderTierView, bj6, "reportext"), new jz5.l("enter_publishid", com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView.a(improveFinderTierView)), com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView.d(improveFinderTierView, bj6, "show_content"), new jz5.l("enter_username", c01.z1.r()), com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView.d(improveFinderTierView, bj6, "send_content"), com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView.d(improveFinderTierView, bj6, "tips_uuid"), lVar, new jz5.l("is_cached_page", java.lang.Integer.valueOf(z17 ? 1 : 0)), com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView.c(improveFinderTierView, bj6, "show_style"), new jz5.l("req_type", java.lang.Integer.valueOf(com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView.b(improveFinderTierView))), new jz5.l("timeline_session_id", ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni())));
        aVar.pk(improveFinderTierView, "moments_finder_recommendation");
        aVar.ik(improveFinderTierView, 128, 28620);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView$updateReport$1");
    }
}
