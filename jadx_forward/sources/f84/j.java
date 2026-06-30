package f84;

/* loaded from: classes4.dex */
public final class j extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f84.u f341726d;

    public j(f84.u uVar) {
        this.f341726d = uVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        java.lang.Integer valueOf;
        int intValue;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemOffsets", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent$initRecycleView$1$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        f84.u uVar = this.f341726d;
        java.lang.String j17 = uVar.j();
        try {
            valueOf = java.lang.Integer.valueOf(parent.u0(view));
        } catch (java.lang.Throwable th6) {
            ca4.q.c(j17, th6);
        }
        if (valueOf.intValue() == -1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemOffsets", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent$initRecycleView$1$1");
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = parent.mo7946xf939df19();
        int mo1894x7e414b06 = mo7946xf939df19 != null ? mo7946xf939df19.mo1894x7e414b06() : 0;
        boolean z17 = valueOf.intValue() == mo1894x7e414b06 + (-1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(uVar.j(), "itemPosition is " + valueOf + ", childCount is " + mo1894x7e414b06 + ", isLastItem is " + z17);
        if (z17) {
            intValue = 0;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMItemSpace", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMItemSpace", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
            intValue = ((java.lang.Number) ((jz5.n) uVar.K).mo141623x754a37bb()).intValue();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMItemSpace", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMItemSpace", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        }
        outRect.left = 0;
        outRect.top = 0;
        outRect.right = intValue;
        outRect.bottom = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemOffsets", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent$initRecycleView$1$1");
    }
}
