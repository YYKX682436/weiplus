package w74;

/* loaded from: classes4.dex */
public class g implements com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d.IVideoViewCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d f525080a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 f525081b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f525082c = false;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w74.h f525083d;

    public g(w74.h hVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d3, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d) {
        this.f525083d = hVar;
        this.f525080a = c17983xb14a9c8d;
        this.f525081b = c17808x428917d3;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d.IVideoViewCallback
    public void a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStart", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper$CardVideoViewCallback");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d3 = this.f525081b;
            if (c17808x428917d3 != null) {
                int p17 = c17808x428917d3.p();
                w74.b bVar = this.f525083d.f525088e;
                if (bVar != null && (c17983xb14a9c8d = this.f525080a) != null) {
                    bVar.f(p17, c17983xb14a9c8d.m70621x51e8b0a());
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStart", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper$CardVideoViewCallback");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d.IVideoViewCallback
    public void c(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d;
        w74.h hVar = this.f525083d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(dm.i4.f66874x4c6b1f55, "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper$CardVideoViewCallback");
        int i18 = i17 / 1000;
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d3 = this.f525081b;
            if (c17808x428917d3 != null) {
                int p17 = c17808x428917d3.p();
                if (hVar.f525088e != null && (c17983xb14a9c8d = this.f525080a) != null) {
                    java.lang.Object tag = c17983xb14a9c8d.getTag(com.p314xaae8f345.mm.R.id.f568517n33);
                    if ((tag instanceof java.lang.Integer) && ((java.lang.Integer) tag).intValue() == 1) {
                        c17983xb14a9c8d.setTag(com.p314xaae8f345.mm.R.id.f568517n33, 0);
                        this.f525082c = false;
                        w74.b bVar = hVar.f525088e;
                        bVar.getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("adjustItemDataPlayTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
                        w74.a d17 = bVar.d(p17);
                        if (d17 != null) {
                            d17.f525045g += d17.f525049k;
                            d17.f525049k = 0;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustItemDataPlayTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
                    }
                    w74.b bVar2 = hVar.f525088e;
                    int i19 = i18 * 1000;
                    bVar2.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateItemDataPlayTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
                    w74.a d18 = bVar2.d(p17);
                    if (d18 != null) {
                        d18.f525049k = i19;
                        if (d18.f525046h < i19) {
                            d18.f525046h = i19;
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateItemDataPlayTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
                    if (!this.f525082c && i18 >= 1) {
                        this.f525082c = true;
                        w74.b bVar3 = hVar.f525088e;
                        bVar3.getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateItemPlayCountOneSecond", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
                        w74.a d19 = bVar3.d(p17);
                        if (d19 != null) {
                            d19.f525043e++;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateItemPlayCountOneSecond", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
                    }
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(dm.i4.f66874x4c6b1f55, "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper$CardVideoViewCallback");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d.IVideoViewCallback
    /* renamed from: onCompletion */
    public void mo70662xa6db431b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCompletion", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper$CardVideoViewCallback");
        try {
            this.f525082c = false;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d3 = this.f525081b;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d = this.f525080a;
            w74.h hVar = this.f525083d;
            if (c17808x428917d3 != null) {
                int p17 = c17808x428917d3.p();
                w74.b bVar = hVar.f525088e;
                if (bVar != null && c17983xb14a9c8d != null) {
                    bVar.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateItemDataFinishPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
                    w74.a d17 = bVar.d(p17);
                    if (d17 != null) {
                        d17.f525044f++;
                        d17.f525045g += d17.f525047i;
                        d17.f525049k = 0;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateItemDataFinishPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
                    hVar.f525088e.f(p17, c17983xb14a9c8d.m70621x51e8b0a());
                }
            }
            hVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoCompleted", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
            if (hVar.f525084a) {
                if (c17983xb14a9c8d != null) {
                    c17983xb14a9c8d.M(0, true);
                }
            } else if (c17808x428917d3 != null) {
                c17808x428917d3.A();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoCompleted", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCompletion", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper$CardVideoViewCallback");
    }
}
