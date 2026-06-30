package vc4;

/* loaded from: classes4.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc4.p f516824d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2193x317b13.p2194xb734e28d.C18258x7ccfbc06 f516825e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f516826f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(xc4.p pVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2193x317b13.p2194xb734e28d.C18258x7ccfbc06 c18258x7ccfbc06, java.lang.ref.WeakReference weakReference) {
        super(1);
        this.f516824d = pVar;
        this.f516825e = c18258x7ccfbc06;
        this.f516826f = weakReference;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter$loadFinderPostView$1$callback$1");
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter$loadFinderPostView$1$callback$1");
        xc4.p pVar = this.f516824d;
        wa4.f0 b17 = wa4.b0.f525736a.b(pVar.W0());
        if (b17 != null && booleanValue) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setShouldShowShare", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo");
            b17.f525762e = false;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setShouldShowShare", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo");
            ym5.a1.f(new vc4.k(this.f516826f));
        }
        ta4.k1.f498328a.d("sns_post_finder_return", booleanValue ? 1 : 2, pVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2193x317b13.p2194xb734e28d.C18258x7ccfbc06.e(this.f516825e, "MicroMsg.Improve.ItemFooter", "loadFinderPostView -> hasClickPost: " + booleanValue);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter$loadFinderPostView$1$callback$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter$loadFinderPostView$1$callback$1");
        return f0Var;
    }
}
