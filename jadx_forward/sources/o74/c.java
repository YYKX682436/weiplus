package o74;

/* loaded from: classes4.dex */
public class c extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5 implements xd4.d, z84.i, i64.k0 {

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 f425091q;

    /* renamed from: s, reason: collision with root package name */
    public o74.b f425093s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f425094t;

    /* renamed from: u, reason: collision with root package name */
    public w74.c f425095u;

    /* renamed from: v, reason: collision with root package name */
    public w74.h f425096v;

    /* renamed from: x, reason: collision with root package name */
    public w74.b f425098x;

    /* renamed from: r, reason: collision with root package name */
    public final z74.i f425092r = new z74.i();

    /* renamed from: w, reason: collision with root package name */
    public final w74.d f425097w = new w74.d();

    public void F(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doMaterialClick", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        android.app.Activity activity = this.f250782f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeFinderTopicCardAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.AdTimelinePartActionMaker");
        v64.c a17 = v64.a.a(5, activity);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeFinderTopicCardAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.AdTimelinePartActionMaker");
        if (a17 != null) {
            a17.a(view, 0, c17933xe8d1b226, new v64.d());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = this.f425094t;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doDynamicRequest", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
            w74.c cVar = this.f425095u;
            if (cVar != null) {
                cVar.a(c17933xe8d1b2262, false);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doDynamicRequest", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doMaterialClick", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void G(o74.b r10, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 r11, s34.h0 r12) {
        /*
            r9 = this;
            java.lang.String r12 = "fillTopicCardContent"
            java.lang.String r0 = "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r12, r0)
            w74.h r1 = r9.f425096v
            if (r1 == 0) goto L18
            java.lang.String r2 = "setSnsInfo"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r2, r3)
            r1.f525087d = r11
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r3)
        L18:
            androidx.recyclerview.widget.RecyclerView r1 = r10.F0
            if (r1 == 0) goto L71
            androidx.recyclerview.widget.f2 r2 = r1.mo7946xf939df19()
            boolean r3 = r2 instanceof w74.e
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter"
            r5 = 1
            if (r3 == 0) goto L56
            r3 = r2
            w74.e r3 = (w74.e) r3
            r3.getClass()
            java.lang.String r6 = "isSameSnsInfo"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r6, r4)
            r7 = 0
            if (r11 != 0) goto L3a
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r6, r4)
            goto L4f
        L3a:
            com.tencent.mm.plugin.sns.storage.SnsInfo r3 = r3.f525069f     // Catch: java.lang.Throwable -> L4c
            java.lang.String r3 = ca4.z0.T(r3)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r8 = ca4.z0.T(r11)     // Catch: java.lang.Throwable -> L4c
            boolean r3 = java.util.Objects.equals(r3, r8)     // Catch: java.lang.Throwable -> L4c
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r6, r4)
            goto L50
        L4c:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r6, r4)
        L4f:
            r3 = r7
        L50:
            if (r3 == 0) goto L56
            r2.m8146xced61ae5()
            goto L57
        L56:
            r7 = r5
        L57:
            if (r7 == 0) goto L71
            w74.e r2 = new w74.e
            androidx.recyclerview.widget.RecyclerView r10 = r10.F0
            r2.<init>(r10, r11)
            r2.mo8164xbbdced85(r5)
            java.lang.String r10 = "setItemClickListener"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r10, r4)
            r2.f525071h = r9
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r10, r4)
            r1.mo7960x6cab2c8d(r2)
        L71:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r12, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o74.c.G(o74.b, com.tencent.mm.plugin.sns.storage.SnsInfo, s34.h0):void");
    }

    public final void H(o74.b bVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        if (bVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
            return;
        }
        android.view.ViewGroup viewGroup = bVar.D0;
        if (viewGroup == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.FinderTopicTimeLineItem", "fillViewHolder::the root null, is it right????");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
            return;
        }
        bVar.E0 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.n3c);
        bVar.F0 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.n3b);
        bVar.H0 = (android.widget.ImageView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.n39);
        bVar.I0 = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.n3a);
        bVar.J0 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2152x8ee44f23.C17817xd660a42d) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.n38);
        bVar.K0 = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.n37);
        bVar.G0 = (android.view.ViewGroup) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.n3_);
        android.widget.ImageView imageView = bVar.H0;
        if (imageView != null) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f81073x5800bc0f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2152x8ee44f23.C17817xd660a42d c17817xd660a42d = bVar.J0;
        if (c17817xd660a42d != null) {
            c17817xd660a42d.m69694x252cfb66(i65.a.b(this.f250782f, 6));
            int b17 = i65.a.b(this.f250782f, 20);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setChildSize", "com.tencent.mm.plugin.sns.ad.widget.stackup.StackUpLayout");
            c17817xd660a42d.f245412e = b17;
            c17817xd660a42d.f245413f = b17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setChildSize", "com.tencent.mm.plugin.sns.ad.widget.stackup.StackUpLayout");
        }
        if (bVar.E0 != null) {
            float b18 = i65.a.b(this.f250782f, 8);
            bVar.E0.b(b18, b18, 0.0f, 0.0f);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = bVar.F0;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.m7963x830bc99d(true);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d3 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3(bVar.F0);
            this.f425091q = c17808x428917d3;
            this.f425096v = new w74.h(this.f425092r, this.f425098x);
            c17808x428917d3.D(new z84.g(i65.a.b(this.f250782f, 12), i65.a.b(this.f250782f, 8)));
            this.f425091q.E(this.f425096v);
            bVar.F0.mo7967x900dcbe1(this.f425091q);
        }
        this.f425095u = new w74.c(this.f250782f, bVar.K0, bVar.F0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
    }

    @Override // z84.i
    public void b(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onItemClick", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        try {
            F(view, this.f425094t);
            w74.b bVar = this.f425098x;
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
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemClick", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
    }

    @Override // xd4.d
    public void c(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        try {
            xd4.o0.d().j();
            xd4.g.a().d(this);
            w74.h hVar = this.f425096v;
            if (hVar != null) {
                hVar.g(this.f425091q);
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
    }

    @Override // i64.k0
    public void d(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f425094t;
            if (c17933xe8d1b226 != null) {
                java.lang.String T = ca4.z0.T(c17933xe8d1b226);
                if (!android.text.TextUtils.isEmpty(T) && T.equals(str)) {
                    a84.t0.a(this.f425098x);
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
    }

    @Override // xd4.d
    public void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUIPause", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d3 = this.f425091q;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
            w74.h hVar = this.f425096v;
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
            if (c17808x428917d3 != null) {
                c17808x428917d3.o();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        } catch (java.lang.Throwable unused2) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUIPause", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
    }

    @Override // xd4.d
    /* renamed from: getDisplayRect */
    public android.graphics.Rect mo69493x4003fc90() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDisplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        try {
            o74.b bVar = this.f425093s;
            if (bVar != null && (c22646x1e9ca55 = bVar.E0) != null) {
                int[] iArr = new int[2];
                c22646x1e9ca55.getLocationOnScreen(iArr);
                int i17 = iArr[0];
                int i18 = iArr[1];
                android.graphics.Rect rect = new android.graphics.Rect(i17, i18, bVar.E0.getWidth() + i17, bVar.E0.getHeight() + i18);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDisplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
                return rect;
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDisplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5
    public void h(android.view.ViewStub viewStub, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        if (!(baseViewHolder instanceof o74.b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.FinderTopicTimeLineItem", "buildContent::the holder is not type of FinderTopicItemViewHolder!!!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
            return;
        }
        this.f425093s = (o74.b) baseViewHolder;
        try {
            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.r(baseViewHolder) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.r(baseViewHolder).setLayoutResource(com.p314xaae8f345.mm.R.C30864xbddafb2a.cot);
                if (!baseViewHolder.f250823q) {
                    this.f425093s.D0 = (android.view.ViewGroup) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.r(baseViewHolder).inflate();
                    baseViewHolder.f250823q = true;
                }
            } else if (!baseViewHolder.f250823q) {
                this.f425093s.D0 = (android.view.ViewGroup) baseViewHolder.f250805h.findViewById(com.p314xaae8f345.mm.R.id.f564158jn);
                baseViewHolder.f250823q = true;
            }
            this.f425098x = new w74.b(1);
            H(this.f425093s);
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5
    public void p(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ns nsVar, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720, int i18, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs bsVar) {
        i64.b1 b1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        if (!(baseViewHolder instanceof o74.b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.FinderTopicTimeLineItem", "fillItem::the holder is not type of FinderTopicItemViewHolder!!!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
            return;
        }
        if (nsVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.FinderTopicTimeLineItem", "fillItem::the struct is null!!!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
            return;
        }
        if (baseViewHolder.f250836w0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.FinderTopicTimeLineItem", "holder is busy");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
            return;
        }
        baseViewHolder.f250836w0 = true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = nsVar.f251558a;
        if (c17933xe8d1b226 == null || c17933xe8d1b226.m70354x74235b3e() == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
            return;
        }
        this.f425094t = c17933xe8d1b226;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ad fillItem, finderTopicItem, pos=");
        sb6.append(i17);
        sb6.append(", snsId=");
        sb6.append(c19807x593d1720 == null ? "" : c19807x593d1720.Id);
        sb6.append(", hash=");
        sb6.append(hashCode());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.FinderTopicTimeLineItem", sb6.toString());
        try {
            o74.b bVar = (o74.b) baseViewHolder;
            s34.h0 h0Var = c17933xe8d1b226.m70354x74235b3e().f38179x76826a54;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillRelationAvatarAndText", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
            a84.y0.l(bVar.K0, h0Var.f484187d);
            this.f425097w.c(bVar.J0, c17933xe8d1b226);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillRelationAvatarAndText", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillTopicRearFlagTextAndImage", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
            android.widget.TextView textView = bVar.I0;
            if (textView != null) {
                textView.setText(h0Var.f484186c);
            }
            android.view.ViewGroup viewGroup = bVar.G0;
            if (viewGroup != null) {
                viewGroup.setOnClickListener(new o74.a(this, c17933xe8d1b226));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillTopicRearFlagTextAndImage", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
            G(bVar, c17933xe8d1b226, h0Var);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doDynamicRequest", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
            w74.c cVar = this.f425095u;
            if (cVar != null) {
                cVar.a(c17933xe8d1b226, true);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doDynamicRequest", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
            w74.b bVar2 = this.f425098x;
            if (bVar2 != null) {
                bVar2.e(c17933xe8d1b226, 0, h0Var);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addOnRemovedListener", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
            if (bsVar == null || (l1Var = bsVar.f249569b) == null || (b1Var = l1Var.f251235c) == null) {
                b1Var = null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
            if (b1Var != null) {
                java.lang.String T = ca4.z0.T(c17933xe8d1b226);
                if (!android.text.TextUtils.isEmpty(T) && !"0".equals(T)) {
                    b1Var.a(T, this);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addOnRemovedListener", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        } catch (java.lang.Throwable unused) {
        }
        baseViewHolder.f250836w0 = false;
        g(nsVar, 3);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
    }

    @Override // xd4.d
    /* renamed from: pause */
    public void mo69495x65825f6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pause", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d3 = this.f425091q;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
            w74.h hVar = this.f425096v;
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
            if (c17808x428917d3 != null) {
                c17808x428917d3.o();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        } catch (java.lang.Throwable unused2) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pause", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
    }

    @Override // xd4.d
    /* renamed from: stop */
    public void mo69496x360802() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stop", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        try {
            z74.i iVar = this.f425092r;
            if (iVar != null) {
                iVar.j();
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stop", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5
    public java.lang.String u() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        return "AdFinderTopicTimeLineItem";
    }
}
