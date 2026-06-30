package x64;

/* loaded from: classes4.dex */
public class m extends w64.a {
    public m(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9) {
        this.f524816a = c17702x544f64e9;
    }

    @Override // w64.a
    public boolean c(android.view.View view, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9, v64.d dVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderTopicActionButtonClick");
        if (c17933xe8d1b226 == null || c17702x544f64e9 == null || view == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.FinderTopicActionButton", "the input param is invalid!!!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderTopicActionButtonClick");
            return false;
        }
        boolean a17 = d44.i.a(view.getContext(), c17702x544f64e9.f244111e0, c17702x544f64e9.f244113f0, c17933xe8d1b226, 6, dVar);
        if (a17 && dVar != null) {
            a84.u0.a((com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad) dVar.a("snsAdClick", null), 46);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderTopicActionButtonClick");
        return a17;
    }
}
