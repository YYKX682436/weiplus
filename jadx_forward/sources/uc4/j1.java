package uc4;

/* loaded from: classes4.dex */
public final class j1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uc4.l1 f507956d;

    public j1(uc4.l1 l1Var) {
        this.f507956d = l1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveWeTagClick$openimTagUnlikeClickListener$2$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/item/click/ImproveWeTagClick$openimTagUnlikeClickListener$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getOpenIMUnlikeHelper", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveWeTagClick");
        uc4.l1 l1Var = this.f507956d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.m7 n17 = l1Var.n();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getOpenIMUnlikeHelper", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveWeTagClick");
        n17.c();
        if (view.getTag() != null && (view.getTag() instanceof ca4.n)) {
            xc4.p c17 = l1Var.c();
            if (c17 == null) {
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/item/click/ImproveWeTagClick$openimTagUnlikeClickListener$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveWeTagClick$openimTagUnlikeClickListener$2$1");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0 s0Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0;
            java.lang.String m125483x6bf53a6c = c17.m125483x6bf53a6c();
            s0Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportWechatWorkUnlike", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7141x85bb31b6 c7141x85bb31b6 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7141x85bb31b6();
            c7141x85bb31b6.f144511f = c7141x85bb31b6.b("OpenimUsername", m125483x6bf53a6c, true);
            c7141x85bb31b6.f144509d = 1L;
            c7141x85bb31b6.f144510e = 1L;
            c7141x85bb31b6.k();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportWechatWorkUnlike", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q2(c17.y0(), 9));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/item/click/ImproveWeTagClick$openimTagUnlikeClickListener$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveWeTagClick$openimTagUnlikeClickListener$2$1");
    }
}
