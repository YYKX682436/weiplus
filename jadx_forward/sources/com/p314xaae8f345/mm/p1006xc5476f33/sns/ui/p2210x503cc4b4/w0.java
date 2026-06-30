package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4;

/* loaded from: classes4.dex */
public class w0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i f251393d;

    public w0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar) {
        this.f251393d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$40");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$40", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f251393d.D(view);
        if (view.getTag() != null && (view.getTag() instanceof ca4.n) && (k17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(((ca4.n) view.getTag()).f121534b)) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0 s0Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0;
            java.lang.String m70374x6bf53a6c = k17.m70374x6bf53a6c();
            s0Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportWechatWorkUnlike", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7141x85bb31b6 c7141x85bb31b6 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7141x85bb31b6();
            c7141x85bb31b6.f144511f = c7141x85bb31b6.b("OpenimUsername", m70374x6bf53a6c, true);
            c7141x85bb31b6.f144509d = 1L;
            c7141x85bb31b6.f144510e = 1L;
            c7141x85bb31b6.k();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportWechatWorkUnlike", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q2 q2Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q2(k17.f68891x29d1292e, 9);
            gm0.j1.i();
            gm0.j1.n().f354821b.g(q2Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$40", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$40");
    }
}
