package c74;

/* loaded from: classes4.dex */
public abstract class a implements v64.c {
    @Override // v64.c
    public boolean a(android.view.View view, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, v64.d dVar) {
        i64.b1 b1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.AbsFinderTopicCardClickAction");
        if (view == null || c17933xe8d1b226 == null || c17933xe8d1b226.m70354x74235b3e() == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.AbsFinderTopicCardClickAction");
            return false;
        }
        s34.h0 h0Var = c17933xe8d1b226.m70354x74235b3e().f38179x76826a54;
        if (h0Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.AbsFinderTopicCardClickAction");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.impl.FinderTopicCardAction");
        boolean a17 = d44.i.a(view.getContext(), h0Var.f484184a, h0Var.f484185b, c17933xe8d1b226, 6, dVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.impl.FinderTopicCardAction");
        if (a17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("afterClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.AbsFinderTopicCardClickAction");
            com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad = new com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad(i17, i17 == 0 ? 1 : 2, c17933xe8d1b226.f68891x29d1292e, 32, 46);
            if (dVar != null && (b1Var = (i64.b1) dVar.a("sns_ad_statistic", null)) != null) {
                ca4.m0.f(c11137xb05b06ad, b1Var, c17933xe8d1b226, 32);
            }
            ca4.z0.x0(c11137xb05b06ad);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("afterClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.AbsFinderTopicCardClickAction");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.AbsFinderTopicCardClickAction");
        return a17;
    }
}
