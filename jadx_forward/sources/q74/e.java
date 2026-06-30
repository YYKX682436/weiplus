package q74;

/* loaded from: classes4.dex */
public class e extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5 implements xd4.d, z84.i, z84.h, i64.k0 {
    public d94.g A;
    public android.widget.FrameLayout B;
    public q74.z E;
    public z84.k F;
    public w64.n G;
    public q74.d0 H;

    /* renamed from: q, reason: collision with root package name */
    public q74.d f441977q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f441978r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 f441979s;

    /* renamed from: u, reason: collision with root package name */
    public q74.b1 f441981u;

    /* renamed from: v, reason: collision with root package name */
    public q74.b0 f441982v;

    /* renamed from: w, reason: collision with root package name */
    public w64.n f441983w;

    /* renamed from: x, reason: collision with root package name */
    public int f441984x;

    /* renamed from: y, reason: collision with root package name */
    public android.graphics.Point f441985y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.ViewGroup f441986z;

    /* renamed from: t, reason: collision with root package name */
    public final z74.i f441980t = new z74.i();
    public final android.graphics.Rect C = new android.graphics.Rect();
    public final android.graphics.Point D = new android.graphics.Point();
    public final d94.a I = new q74.b(this);

    public void F(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        if (c17933xe8d1b226 == null || c17933xe8d1b226.m70354x74235b3e() == null || c17933xe8d1b226.m70354x74235b3e().f38210x95847c91 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
            return;
        }
        s34.a1 a1Var = c17933xe8d1b226.m70354x74235b3e().f38210x95847c91;
        java.util.List<s34.x0> list = a1Var.f76695x5800ff2c;
        if (list == null || list.size() <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
            return;
        }
        s34.x0 x0Var = a1Var.f76695x5800ff2c.get(i17);
        if (x0Var == null || x0Var.f76730xf7a0a3ac == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
            return;
        }
        int a17 = a1Var.a(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9 = x0Var.f76730xf7a0a3ac;
        c17702x544f64e9.f244102a = 3;
        this.f441983w.o(c17702x544f64e9, c17933xe8d1b226, a17);
        this.f441983w.k(view);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void G(q74.d r18, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 r19, s34.a1 r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.String r3 = "fillSlideFullCardContent"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r3, r4)
            q74.b1 r5 = r0.f441981u
            if (r5 == 0) goto L1e
            java.lang.String r6 = "setSnsInfo"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r6, r7)
            r5.f441954d = r2
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r6, r7)
        L1e:
            com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView r5 = r1.F0
            if (r5 == 0) goto Lb6
            androidx.recyclerview.widget.f2 r6 = r5.mo7946xf939df19()
            boolean r7 = r6 instanceof q74.x0
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter"
            r9 = 1
            if (r7 == 0) goto L5c
            r7 = r6
            q74.x0 r7 = (q74.x0) r7
            r7.getClass()
            java.lang.String r10 = "isSameSnsInfo"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r10, r8)
            r11 = 0
            if (r2 != 0) goto L40
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r10, r8)
            goto L55
        L40:
            com.tencent.mm.plugin.sns.storage.SnsInfo r7 = r7.f442093e     // Catch: java.lang.Throwable -> L52
            java.lang.String r7 = ca4.z0.T(r7)     // Catch: java.lang.Throwable -> L52
            java.lang.String r12 = ca4.z0.T(r19)     // Catch: java.lang.Throwable -> L52
            boolean r7 = java.util.Objects.equals(r7, r12)     // Catch: java.lang.Throwable -> L52
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r10, r8)
            goto L56
        L52:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r10, r8)
        L55:
            r7 = r11
        L56:
            if (r7 == 0) goto L5c
            r6.m8146xced61ae5()
            goto L5d
        L5c:
            r11 = r9
        L5d:
            if (r11 == 0) goto Lb6
            com.tencent.mm.plugin.sns.ui.bs r6 = r0.f250784h
            q74.x0 r7 = new q74.x0
            com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView r10 = r1.F0
            w64.n r15 = new w64.n
            android.app.Activity r12 = r0.f250782f
            r13 = 0
            i64.b1 r14 = r0.I(r6)
            r16 = 0
            q74.c r11 = new q74.c
            r11.<init>(r0, r6, r1)
            r1 = r11
            r11 = r15
            r6 = r15
            r15 = r16
            r16 = r1
            r11.<init>(r12, r13, r14, r15, r16)
            r7.<init>(r10, r2, r6)
            int r1 = r0.f441984x
            r7.y(r1)
            java.lang.String r1 = "getItemMaterialSize"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r1, r8)
            android.graphics.Point r2 = new android.graphics.Point
            int r6 = r7.f442099n
            int r10 = r7.f442100o
            r2.<init>(r6, r10)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r1, r8)
            r0.f441985y = r2
            r7.mo8164xbbdced85(r9)
            java.lang.String r1 = "setItemClickListener"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r1, r8)
            r7.f442096h = r0
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r1, r8)
            java.lang.String r1 = "setItemActionBtnClickListener"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r1, r8)
            r7.f442097i = r0
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r1, r8)
            r5.mo7960x6cab2c8d(r7)
        Lb6:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q74.e.G(q74.d, com.tencent.mm.plugin.sns.storage.SnsInfo, s34.a1):void");
    }

    public final void H(q74.d dVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        if (dVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
            return;
        }
        android.view.ViewGroup viewGroup = this.f441977q.D0;
        if (viewGroup == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdSlideFullCardTimeLineItem", "fillViewHolder::the root null, is it right????");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
            return;
        }
        dVar.E0 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.n5p);
        dVar.F0 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2124x2ad8c7ad.C17758x730d4dd2) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.n5o);
        dVar.H0 = (android.view.ViewStub) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.qpg);
        android.view.View view = dVar.f250810j0;
        if (view instanceof android.view.ViewGroup) {
            this.f441986z = (android.view.ViewGroup) view;
        }
        if (dVar.F0 != null) {
            this.f441984x = q74.t0.c(this.f250782f, 0, this.f250780d);
            dVar.F0.m7963x830bc99d(true);
            this.f441979s = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3(dVar.F0);
            this.f441981u = new q74.b1(this.f441980t, this.f441982v, 0);
            z84.k kVar = new z84.k(i65.a.b(this.f250782f, 12), i65.a.b(this.f250782f, 8));
            this.F = kVar;
            this.f441979s.D(kVar);
            this.f441979s.E(this.f441981u);
            dVar.F0.mo7967x900dcbe1(this.f441979s);
            this.f441983w = new w64.n(this.f250782f, 0, I(this.f250784h), null, new q74.a(this, dVar));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
    }

    public i64.b1 I(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs bsVar) {
        i64.b1 b1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        if (bsVar == null || (l1Var = bsVar.f249569b) == null || (b1Var = l1Var.f251235c) == null) {
            b1Var = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        return b1Var;
    }

    public void J(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        q74.b1 b1Var = this.f441981u;
        if (b1Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pausePlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
            b1Var.f441952b = false;
            z74.i iVar = b1Var.f441953c;
            if (iVar != null) {
                try {
                    iVar.d();
                } catch (java.lang.Throwable unused) {
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pausePlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
        }
        if (c17808x428917d3 != null) {
            c17808x428917d3.o();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
    }

    @Override // z84.h
    public void a(android.view.View view, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onItemActionBtnClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        try {
            q74.b0 b0Var = this.f441982v;
            if (b0Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateItemDataBtnClickCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
                q74.a0 d17 = b0Var.d(i17);
                if (d17 != null) {
                    d17.f441926f++;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateItemDataBtnClickCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemActionBtnClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
    }

    @Override // z84.i
    public void b(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onItemClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        try {
            F(view, this.f441978r, i17);
            q74.b0 b0Var = this.f441982v;
            if (b0Var != null) {
                b0Var.g(i17);
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
    }

    @Override // xd4.d
    public void c(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        try {
            xd4.o0.d().j();
            xd4.g.a().d(this);
            q74.b1 b1Var = this.f441981u;
            if (b1Var != null) {
                b1Var.l(this.f441979s);
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
    }

    @Override // i64.k0
    public void d(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        try {
            q74.b0 b0Var = this.f441982v;
            if (b0Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetCurrentIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
                b0Var.f441950j = -1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetCurrentIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
            }
            if (this.f250782f instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.ActivityC18203x35bf69b5) {
                J(this.f441979s);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f441978r;
            if (c17933xe8d1b226 != null) {
                java.lang.String T = ca4.z0.T(c17933xe8d1b226);
                if (!android.text.TextUtils.isEmpty(T) && T.equals(str)) {
                    a84.t0.a(this.f441982v);
                }
            }
            q74.d0 d0Var = this.H;
            if (d0Var != null) {
                d0Var.c();
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportTouchDuration", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = this.f441978r.m70354x74235b3e();
            boolean z17 = (m70354x74235b3e == null || m70354x74235b3e.f38275x3163e578 == null || this.B == null) ? false : true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2124x2ad8c7ad.C17758x730d4dd2 c17758x730d4dd2 = this.f441977q.F0;
            int m69490x91c80705 = (int) c17758x730d4dd2.m69490x91c80705();
            int m69489x6f36753e = c17758x730d4dd2.m69489x6f36753e();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetTouchReportData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdSlideRecyclerView", "reset");
            c17758x730d4dd2.f244744c2 = 0L;
            c17758x730d4dd2.f244746e2 = 0L;
            c17758x730d4dd2.f244745d2 = 0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetTouchReportData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView");
            a84.t0.a(new q74.v(this.f441978r, 1, m69490x91c80705, m69489x6f36753e, z17));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdSlideFullCardTimeLineItem", "reportTouchDuration, exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportTouchDuration", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
    }

    @Override // xd4.d
    public void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUIPause", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        try {
            J(this.f441979s);
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUIPause", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
    }

    @Override // z84.h
    public void f(android.view.View view, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onItemProductClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        q74.b0 b0Var = this.f441982v;
        if (b0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateItemDataProductClickCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
            q74.a0 d17 = b0Var.d(i17);
            if (d17 != null) {
                d17.f441934n++;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateItemDataProductClickCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemProductClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
    }

    @Override // xd4.d
    /* renamed from: getDisplayRect */
    public android.graphics.Rect mo69493x4003fc90() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDisplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        try {
            q74.d dVar = this.f441977q;
            if (dVar != null && (c22646x1e9ca55 = dVar.E0) != null) {
                int[] iArr = new int[2];
                c22646x1e9ca55.getLocationOnScreen(iArr);
                int i17 = iArr[0];
                int i18 = iArr[1];
                android.graphics.Rect rect = new android.graphics.Rect(i17, i18, dVar.E0.getWidth() + i17, dVar.E0.getHeight() + i18);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDisplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
                return rect;
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDisplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5
    public void h(android.view.ViewStub viewStub, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        if (!(baseViewHolder instanceof q74.d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdSlideFullCardTimeLineItem", "buildContent::the holder is not type of AdSlideFullCardItemViewHolder!!!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
            return;
        }
        this.f441977q = (q74.d) baseViewHolder;
        try {
            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.r(baseViewHolder) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.r(baseViewHolder).setLayoutResource(com.p314xaae8f345.mm.R.C30864xbddafb2a.cq_);
                if (!baseViewHolder.f250823q) {
                    this.f441977q.D0 = (android.view.ViewGroup) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.r(baseViewHolder).inflate();
                    baseViewHolder.f250823q = true;
                }
            } else if (!baseViewHolder.f250823q) {
                this.f441977q.D0 = (android.view.ViewGroup) baseViewHolder.f250805h.findViewById(com.p314xaae8f345.mm.R.id.n5j);
                baseViewHolder.f250823q = true;
            }
            this.f441982v = new q74.b0(1);
            H(this.f441977q);
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:17|(6:18|19|(3:25|(1:27)|28)|29|(1:31)|32)|(3:104|105|(21:107|108|109|110|35|(1:103)(4:39|40|41|42)|43|(3:45|46|47)(1:96)|48|(2:50|(1:54))|55|56|(1:58)(1:93)|59|(1:92)(5:63|(5:65|66|67|(1:69)(1:88)|70)(1:91)|71|(1:75)|76)|77|78|(1:80)|82|83|84))|34|35|(1:37)|103|43|(0)(0)|48|(0)|55|56|(0)(0)|59|(1:61)|92|77|78|(0)|82|83|84) */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0228, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0229, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r14, "setTouchAnimConfig, exp=" + r0.toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015b A[Catch: all -> 0x017f, TryCatch #6 {all -> 0x017f, blocks: (B:47:0x014b, B:48:0x0150, B:50:0x015b, B:52:0x0165, B:54:0x016d, B:55:0x0170), top: B:46:0x014b }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0222 A[Catch: all -> 0x0228, TRY_LEAVE, TryCatch #3 {all -> 0x0228, blocks: (B:78:0x021e, B:80:0x0222), top: B:77:0x021e }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x014f  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder r27, int r28, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ns r29, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 r30, int r31, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs r32) {
        /*
            Method dump skipped, instructions count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q74.e.p(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder, int, com.tencent.mm.plugin.sns.ui.ns, com.tencent.mm.protocal.protobuf.TimeLineObject, int, com.tencent.mm.plugin.sns.ui.bs):void");
    }

    @Override // xd4.d
    /* renamed from: pause */
    public void mo69495x65825f6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pause", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        try {
            J(this.f441979s);
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pause", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
    }

    @Override // xd4.d
    /* renamed from: stop */
    public void mo69496x360802() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stop", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        try {
            z74.i iVar = this.f441980t;
            if (iVar != null) {
                iVar.j();
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stop", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5
    public java.lang.String u() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        return "AdSlideFullCardTimeLineItem";
    }
}
