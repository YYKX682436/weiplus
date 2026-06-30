package w74;

/* loaded from: classes4.dex */
public class h implements z84.c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f525084a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f525085b;

    /* renamed from: c, reason: collision with root package name */
    public final z74.i f525086c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f525087d;

    /* renamed from: e, reason: collision with root package name */
    public final w74.b f525088e;

    public h(z74.i iVar, w74.b bVar) {
        this.f525086c = iVar;
        this.f525088e = bVar;
    }

    @Override // z84.c
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d3, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVisibleItemChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
        try {
            w74.b bVar = this.f525088e;
            if (bVar != null) {
                bVar.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateItemDataExposure", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
                if (i17 == bVar.f525055f) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateItemDataExposure", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
                } else {
                    bVar.f525055f = i17;
                    w74.a d17 = bVar.d(i17);
                    if (d17 != null) {
                        d17.f525041c++;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateItemDataExposure", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("triggerPlayByItemChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
            e(c17808x428917d3, i17, false);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("triggerPlayByItemChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVisibleItemChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
    }

    @Override // z84.c
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d3, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScrollStateChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
        try {
            if (i17 == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onRecyclerViewPressed", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
                this.f525084a = true;
                if (c17808x428917d3 != null) {
                    c17808x428917d3.o();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onRecyclerViewPressed", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onRecyclerViewPressReleased", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
                this.f525084a = false;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onRecyclerViewPressReleased", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrollStateChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
    }

    @Override // z84.c
    public void c(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAutoScrollNextItem", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAutoScrollNextItem", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
    }

    @Override // z84.c
    public void d(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onNotifyActionUp", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onNotifyActionUp", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:6|7|8|(11:10|11|12|13|14|(4:16|17|18|(2:53|54)(4:24|(2:26|(2:28|(1:48)(5:32|(2:34|(3:36|(1:38)(1:(1:(1:44)(1:45))(1:46))|39))|47|(0)(0)|39))(2:49|(1:51)))(1:52)|40|41))|56|18|(0)|53|54)|59|12|13|14|(0)|56|18|(0)|53|54) */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039 A[Catch: all -> 0x003f, TRY_LEAVE, TryCatch #1 {all -> 0x003f, blocks: (B:14:0x0031, B:16:0x0039), top: B:13:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 r12, int r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w74.h.e(com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager, int, boolean):void");
    }

    public final void f(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d3, android.view.ViewGroup viewGroup, xd4.j0 j0Var) {
        z74.i iVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
        if (c17983xb14a9c8d != null && (iVar = this.f525086c) != null) {
            a84.y0.i(c17983xb14a9c8d);
            a84.y0.o(c17983xb14a9c8d, -1, -1);
            a84.y0.b(viewGroup, c17983xb14a9c8d, 0);
            a84.y0.p(c17983xb14a9c8d, true);
            c17983xb14a9c8d.m70653xee64f44b(android.widget.ImageView.ScaleType.CENTER_CROP);
            c17983xb14a9c8d.m70656x5981726b(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.COVER);
            c17983xb14a9c8d.m70655x360a109e(new w74.g(this, c17808x428917d3, c17983xb14a9c8d));
            iVar.h(c17983xb14a9c8d, j0Var, j0Var.f535195d, j0Var.f535192a.f459388d);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
    }

    public void g(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("triggerPlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.TopicCardVideoPlayHelper", "resumePlayByTimeline is called!");
        this.f525085b = true;
        if (c17808x428917d3 != null) {
            try {
                int p17 = c17808x428917d3.p();
                if (p17 >= 0) {
                    e(c17808x428917d3, p17, true);
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("triggerPlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
    }
}
