package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class es implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs f249794d;

    public es(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs bsVar) {
        this.f249794d = bsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        a84.r0 r0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$4");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTimeLineBaseAdapter", "showCommentBtn");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs bsVar = this.f249794d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var = bsVar.f249569b;
        l1Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("freeLikeActionLock", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        l1Var.f251238f = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("freeLikeActionLock", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$600", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        android.view.View view2 = bsVar.D;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$600", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        if (view2 == view) {
            bsVar.p();
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$702", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            bsVar.E = true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$702", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$602", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        bsVar.D = view;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$602", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2087xab215833.a.f244096a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clearNotInterestMenu", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearNotInterestMenu", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager");
        if (!(view.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsTimeLineBaseAdapter", "showCommentBtn err1");
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$4");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder) view.getTag();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720 = baseViewHolder.f38402x94f64b00;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = bsVar.f249575h;
        if (c19807x593d1720 != null && c19807x593d1720.f39014x86965dde.f451370e == 21) {
            r45.kj4 kj4Var = baseViewHolder.f250806h0;
            if (!c01.z1.r().equals(baseViewHolder.f38402x94f64b00.f39018xf3f56116) && (kj4Var == null || kj4Var.D == 0)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTimeLineBaseAdapter", "snsCommentFix showTipsDialog.");
                ja4.d.a(abstractActivityC21394xb3d2c0cf, baseViewHolder.T.g(0));
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$4");
                return;
            }
        }
        if (baseViewHolder.f38400x3172ed) {
            java.lang.String str = baseViewHolder.f250801f;
            i64.b1 b1Var = bsVar.f249569b.f251235c;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createFeedbackReportData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
            try {
                r0Var = j74.b.c(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(str), true, view, b1Var);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createFeedbackReportData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
            } catch (java.lang.Throwable unused) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createFeedbackReportData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
                r0Var = null;
            }
            a84.t0.a(r0Var);
        }
        if (abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.r4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTimeLineBaseAdapter", "snsCommentFix addCommentView.");
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.r4) abstractActivityC21394xb3d2c0cf).L5(view);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$800", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.r4 r4Var = bsVar.f249592y;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$800", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            if (r4Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$800", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.r4 r4Var2 = bsVar.f249592y;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$800", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                r4Var2.L5(view);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$4");
    }
}
