package dc4;

/* loaded from: classes4.dex */
public class x0 extends dc4.v implements z84.i, i64.k0 {
    public w74.h A;
    public w74.c C;
    public final w74.b D;

    /* renamed from: p, reason: collision with root package name */
    public android.content.Context f310387p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 f310388q;

    /* renamed from: r, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f310389r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.ViewGroup f310390s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ImageView f310391t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f310392u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2152x8ee44f23.C17817xd660a42d f310393v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f310394w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 f310395x;

    /* renamed from: y, reason: collision with root package name */
    public final i64.b1 f310396y;

    /* renamed from: z, reason: collision with root package name */
    public final z74.i f310397z = new z74.i();
    public final w74.d B = new w74.d();

    public x0(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar, i64.b1 b1Var) {
        this.f310364d = c19807x593d1720;
        this.f310365e = c17933xe8d1b226;
        this.f310371n = iVar;
        this.f310396y = b1Var;
        this.D = new w74.b(2);
    }

    @Override // z84.i
    public void b(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onItemClick", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
        try {
            l(view, this.f310365e);
            w74.b bVar = this.D;
            if (bVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateItemDataClickCount", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
                w74.a d17 = bVar.d(i17);
                if (d17 != null) {
                    d17.f525042d++;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateItemDataClickCount", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemClick", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
    }

    @Override // dc4.v
    public void c(android.view.View view, android.view.View view2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
        try {
            m(view, view2);
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.TopicCardDetail", "the init view failed");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
    }

    @Override // i64.k0
    public void d(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAdRemoved", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f310365e;
            if (c17933xe8d1b226 != null) {
                java.lang.String T = ca4.z0.T(c17933xe8d1b226);
                if (!android.text.TextUtils.isEmpty(T) && T.equals(str)) {
                    a84.t0.a(this.D);
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAdRemoved", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
    }

    @Override // dc4.v
    public void g() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
        try {
            super.g();
            w74.h hVar = this.A;
            if (hVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pausePlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
                hVar.f525085b = false;
                z74.i iVar = hVar.f525086c;
                if (iVar != null) {
                    try {
                        iVar.d();
                    } catch (java.lang.Throwable unused) {
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pausePlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d3 = this.f310395x;
            if (c17808x428917d3 != null) {
                c17808x428917d3.o();
            }
        } catch (java.lang.Throwable unused2) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
    }

    @Override // dc4.v
    public void j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refreshView", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
        try {
            w74.h hVar = this.A;
            if (hVar != null) {
                hVar.g(this.f310395x);
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshView", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
    }

    public void l(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doMaterialClick", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
        android.content.Context context = this.f310387p;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeFinderTopicCardAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.AdTimelinePartActionMaker");
        v64.c a17 = v64.a.a(5, context);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeFinderTopicCardAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.AdTimelinePartActionMaker");
        if (a17 != null) {
            v64.d dVar = new v64.d();
            i64.b1 b1Var = this.f310396y;
            if (b1Var != null) {
                dVar.a("sns_ad_statistic", b1Var);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
            if (b1Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
                i17 = b1Var.f370628j;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
                i17 = 1;
            }
            a17.a(view, i17, c17933xe8d1b226, dVar);
        }
        w74.c cVar = this.C;
        if (cVar != null) {
            cVar.a(c17933xe8d1b226, false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doMaterialClick", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
    }

    public void m(android.view.View view, android.view.View view2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226;
        android.view.ViewGroup.LayoutParams layoutParams;
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initViewInternal", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
        if (view == null || (c17933xe8d1b226 = this.f310365e) == null || c17933xe8d1b226.m70354x74235b3e() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.TopicCardDetail", "the content view is null??? the init view can't complete!!!!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initViewInternal", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
            return;
        }
        s34.h0 h0Var = this.f310365e.m70354x74235b3e().f38179x76826a54;
        if (h0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.TopicCardDetail", "the adFinderTopicInfo is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initViewInternal", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
            return;
        }
        i64.b1 b1Var = this.f310396y;
        w74.b bVar = this.D;
        if (bVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = this.f310365e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
            if (b1Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
                i17 = b1Var.f370628j;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
                i17 = 1;
            }
            bVar.e(c17933xe8d1b2262, i17, h0Var);
        }
        this.f310387p = view.getContext();
        this.f310388q = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) view.findViewById(com.p314xaae8f345.mm.R.id.n3c);
        this.f310389r = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) view.findViewById(com.p314xaae8f345.mm.R.id.n3b);
        this.f310391t = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.n39);
        this.f310392u = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.n3a);
        this.f310393v = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2152x8ee44f23.C17817xd660a42d) view.findViewById(com.p314xaae8f345.mm.R.id.n38);
        this.f310394w = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.n37);
        this.f310390s = (android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.n3_);
        android.widget.ImageView imageView = this.f310391t;
        if (imageView != null) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f81073x5800bc0f);
        }
        android.view.ViewGroup viewGroup = this.f310390s;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new dc4.w0(this));
        }
        a84.y0.l(this.f310392u, h0Var.f484186c);
        a84.y0.l(this.f310394w, h0Var.f484187d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2152x8ee44f23.C17817xd660a42d c17817xd660a42d = this.f310393v;
        if (c17817xd660a42d != null) {
            c17817xd660a42d.m69694x252cfb66(i65.a.b(this.f310387p, 6));
            int b17 = i65.a.b(this.f310387p, 20);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2152x8ee44f23.C17817xd660a42d c17817xd660a42d2 = this.f310393v;
            c17817xd660a42d2.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setChildSize", "com.tencent.mm.plugin.sns.ad.widget.stackup.StackUpLayout");
            c17817xd660a42d2.f245412e = b17;
            c17817xd660a42d2.f245413f = b17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setChildSize", "com.tencent.mm.plugin.sns.ad.widget.stackup.StackUpLayout");
            this.B.c(this.f310393v, this.f310365e);
        }
        if (this.f310388q != null) {
            float b18 = i65.a.b(this.f310387p, 8);
            this.f310388q.b(b18, b18, 0.0f, 0.0f);
        }
        if (this.f310389r != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetRecyclerViewLayoutParams", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f310389r;
            if (c1163xf1deaba4 != null && (layoutParams = c1163xf1deaba4.getLayoutParams()) != null) {
                layoutParams.height = i65.a.b(this.f310387p, com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10111xba02d508);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetRecyclerViewLayoutParams", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
            this.f310395x = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3(this.f310389r);
            w74.h hVar = new w74.h(this.f310397z, bVar);
            this.A = hVar;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2263 = this.f310365e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
            hVar.f525087d = c17933xe8d1b2263;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
            this.f310395x.D(new z84.g(i65.a.b(this.f310387p, 12), i65.a.b(this.f310387p, 8)));
            this.f310395x.E(this.A);
            this.f310389r.mo7967x900dcbe1(this.f310395x);
            w74.e eVar = new w74.e(this.f310389r, this.f310365e);
            eVar.mo8164xbbdced85(true);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setItemClickListener", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
            eVar.f525071h = this;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setItemClickListener", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
            this.f310389r.mo7960x6cab2c8d(eVar);
        }
        android.content.Context context = this.f310387p;
        if (context instanceof android.app.Activity) {
            w74.c cVar = new w74.c((android.app.Activity) context, this.f310394w, this.f310389r);
            this.C = cVar;
            cVar.a(this.f310365e, true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addOnRemovedListener", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
        if (b1Var != null) {
            java.lang.String T = ca4.z0.T(this.f310365e);
            if (!android.text.TextUtils.isEmpty(T) && !"0".equals(T)) {
                b1Var.a(T, this);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addOnRemovedListener", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initViewInternal", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
    }
}
