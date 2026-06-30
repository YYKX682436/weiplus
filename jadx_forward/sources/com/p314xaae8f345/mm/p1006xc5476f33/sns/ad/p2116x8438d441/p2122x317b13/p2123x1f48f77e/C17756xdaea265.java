package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2123x1f48f77e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/timeline/item/adSlideCard/AdSlideCardLayoutManager;", "Lcom/tencent/mm/plugin/sns/ad/widget/recyclerview/CardLayoutManager;", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutManager */
/* loaded from: classes4.dex */
public final class C17756xdaea265 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 {
    public final int A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17756xdaea265(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        super(recyclerView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        this.A = 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollHorizontallyBy */
    public int mo2419x96d40915(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 recycler, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("scrollHorizontallyBy", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recycler, "recycler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        if (this.f245313d <= 0 && i17 < 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("scrollHorizontallyBy", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutManager");
            return 0;
        }
        int t17 = t(m8020x7e414b06() - 1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getOverSlideDistance", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutManager");
        int i18 = this.A;
        int s17 = ca4.m0.s((i18 == 1 || i18 != 2) ? 60 : 30);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOverSlideDistance", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutManager");
        int mo2419x96d40915 = super.mo2419x96d40915(e06.p.f(this.f245313d + i17, 0, t17 + s17) - this.f245313d, recycler, state);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("scrollHorizontallyBy", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutManager");
        return mo2419x96d40915;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: smoothScrollToPosition */
    public void mo7942xd1b4653f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, int i17) {
        java.lang.Object m143895xf1229813;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("smoothScrollToPosition", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getViewItemWidth", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        int i18 = this.f245314e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewItemWidth", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        if (i18 != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getViewItemHeight", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            int i19 = this.f245315f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewItemHeight", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            if (i19 != 0) {
                try {
                    p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    jz5.f0 f0Var = null;
                    java.lang.Integer valueOf = h3Var != null ? java.lang.Integer.valueOf(h3Var.b()) : null;
                    if (valueOf != null && valueOf.intValue() == 0) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("smoothScrollToPosition", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutManager");
                        return;
                    }
                    int t17 = t(i17);
                    if (c1163xf1deaba4 != null) {
                        c1163xf1deaba4.b1(t17 - this.f245313d, 0, s74.q4.f486046a.f());
                        f0Var = jz5.f0.f384359a;
                    }
                    m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
                } catch (java.lang.Throwable th6) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
                }
                if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
                    ca4.q.c("AdSlideCardLayoutManager", p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813));
                }
                p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("smoothScrollToPosition", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutManager");
                return;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("smoothScrollToPosition", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutManager");
    }
}
