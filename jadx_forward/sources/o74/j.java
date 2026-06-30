package o74;

/* loaded from: classes4.dex */
public class j extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5 implements xd4.d, i64.k0, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.y4 {
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.p2151xf8ffc37b.C17814xa1ba4463 B;
    public android.view.View C;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f425107t;

    /* renamed from: u, reason: collision with root package name */
    public o74.i f425108u;

    /* renamed from: w, reason: collision with root package name */
    public n74.j1 f425110w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v f425111x;

    /* renamed from: y, reason: collision with root package name */
    public a44.k f425112y;

    /* renamed from: z, reason: collision with root package name */
    public int f425113z;

    /* renamed from: q, reason: collision with root package name */
    public boolean f425104q = true;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f425105r = "";

    /* renamed from: s, reason: collision with root package name */
    public boolean f425106s = false;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f425109v = null;
    public final android.view.View.OnClickListener A = new o74.g(this);
    public final boolean D = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.p2151xf8ffc37b.C17814xa1ba4463.e();

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5
    public boolean D() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("shouldItemRecordAdClickQuality", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shouldItemRecordAdClickQuality", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        return true;
    }

    public void F() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var;
        i64.b1 b1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doPause", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdSightTimeLineItem", "doPause: %s Ad Video doPause", this);
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v.a(this.f425107t)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v vVar = this.f425111x;
            if (vVar != null) {
                vVar.g();
            }
        } else {
            o74.i iVar = this.f425108u;
            if (iVar != null && iVar.f250802f0 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f425107t;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pauseStaticVideoPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs bsVar = this.f250784h;
                if (bsVar != null && (l1Var = bsVar.f249569b) != null && (b1Var = l1Var.f251235c) != null && c17933xe8d1b226 != null) {
                    b1Var.q(c17933xe8d1b226.f68891x29d1292e);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pauseStaticVideoPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPause", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.y4
    public void F3() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScrollIdle", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.p2151xf8ffc37b.C17814xa1ba4463 c17814xa1ba4463 = this.B;
        if (c17814xa1ba4463 != null) {
            c17814xa1ba4463.F3();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrollIdle", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
    }

    public final void G(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder) {
        android.widget.FrameLayout frameLayout;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initCommonShakeLogic", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        if (baseViewHolder == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdSightTimeLineItem", "initCommonShakeLogic, viewHolder==null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initCommonShakeLogic", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
            return;
        }
        android.view.View view = this.C;
        if (view instanceof android.widget.FrameLayout) {
            frameLayout = (android.widget.FrameLayout) view;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdSightTimeLineItem", "initCommonShakeLogic, shakeViewContainer err");
            frameLayout = null;
        }
        android.widget.FrameLayout frameLayout2 = frameLayout;
        android.view.View view2 = baseViewHolder.f250834v0;
        android.app.Activity activity = this.f250782f;
        if (activity == null || frameLayout2 == null || view2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdSightTimeLineItem", "initCommonShakeLogic, params err");
        } else {
            this.B = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.p2151xf8ffc37b.C17814xa1ba4463(activity, frameLayout2, view2, 0, new o74.h(this, baseViewHolder));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initCommonShakeLogic", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
    }

    public final void H(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder, int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setVideoStatusIvVisibility", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdSightTimeLineItem", "setVideoStatusIvVisibility: setVideoStatusIvVisibility is " + i17 + ", isPlaying is " + z17);
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdSightTimeLineItem", "setVideoStatusIvVisibility: %s, but isPlaying", java.lang.Integer.valueOf(i17));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setVideoStatusIvVisibility", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        } else {
            baseViewHolder.f250802f0.f249952i.setVisibility(i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setVideoStatusIvVisibility", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        }
    }

    public void I() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showPlayBtn", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdSightTimeLineItem", "showPlayBtn: try show play btn, isPlayingSight is false");
        o74.i iVar = this.f425108u;
        if (iVar != null && iVar.f250802f0 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdSightTimeLineItem", "showPlayBtn: show play btn");
            this.f425108u.f250802f0.f249952i.setVisibility(0);
            this.f425108u.f250802f0.f249953j.setVisibility(8);
            this.f425108u.f250802f0.f249952i.setImageDrawable(i65.a.i(this.f250782f, com.p314xaae8f345.mm.R.raw.f81043x73ab7191));
            this.f425108u.f250802f0.f249952i.setContentDescription(this.f250782f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjf));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showPlayBtn", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
    }

    @Override // xd4.d
    public void c(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdSightTimeLineItem", "play, pos=" + i17);
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v.a(this.f425107t)) {
            if (this.f425111x != null) {
                xd4.o0.d().j();
                xd4.g.a().d(this);
                this.f425111x.i();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
            return;
        }
        if (this.f425104q) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("playOnlineVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
            if (baseViewHolder == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdSightTimeLineItem", "playOnlineVideo: the holder is null");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("playOnlineVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
            } else {
                r45.jj4 a17 = n74.x1.a(baseViewHolder);
                java.lang.String c17 = n74.x1.c(baseViewHolder);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(baseViewHolder.f250801f);
                i64.b1 b17 = n74.x1.b(this.f250784h);
                java.lang.String str = baseViewHolder.f250801f;
                if (a17 == null || c17 == null || k17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdSightTimeLineItem", "playOnlineVideo: the media, timelineId, sns info is null");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("playOnlineVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
                } else {
                    xd4.g.a().c();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hidePlayBtn", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdSightTimeLineItem", "hidePlayBtn: try hide play btn");
                    o74.i iVar = this.f425108u;
                    if (iVar != null && iVar.f250802f0 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdSightTimeLineItem", "hidePlayBtn: hide play btn");
                        this.f425108u.f250802f0.f249952i.setVisibility(8);
                        this.f425108u.f250802f0.f249953j.setVisibility(8);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hidePlayBtn", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
                    android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) baseViewHolder.f250802f0.f249947d.findViewById(com.p314xaae8f345.mm.R.id.ncu);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdSightTimeLineItem", "playOnlineVideo: position is " + i17 + ", timelineId is " + c17);
                    z74.h hVar = new z74.h("SnsAd.AdSightTimeLineItem");
                    hVar.a(frameLayout);
                    hVar.b(a17);
                    hVar.c(k17);
                    hVar.d(str);
                    hVar.g(c17);
                    hVar.f(b17);
                    hVar.e(1, new o74.f(this));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("playOnlineVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
    }

    @Override // i64.k0
    public void d(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v vVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v.a(this.f425107t) && (vVar = this.f425111x) != null) {
            vVar.b();
        }
        java.lang.String T = ca4.z0.T(this.f425107t);
        if (T == null || T.equals(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdSightTimeLineItem", "onAdRemoved:" + str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdSightTimeLineItem", "onAdRemoved, curSnsId=" + T + ", snsId=" + str);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1612, 123);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
    }

    @Override // xd4.d
    public void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUIPause", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdSightTimeLineItem", "onUIPause");
        F();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUIPause", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
    }

    @Override // xd4.d
    /* renamed from: getDisplayRect */
    public android.graphics.Rect mo69493x4003fc90() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDisplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        android.view.View view = this.f425109v;
        if (view == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDisplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i17 = iArr[0];
        int i18 = iArr[1];
        android.graphics.Rect rect = new android.graphics.Rect(i17, i18, this.f425109v.getMeasuredWidth() + i17, this.f425109v.getMeasuredHeight() + i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDisplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        return rect;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5
    public void h(android.view.ViewStub viewStub, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        this.f250782f.getWindowManager().getDefaultDisplay().getMetrics(new android.util.DisplayMetrics());
        this.f425108u = (o74.i) baseViewHolder;
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.r(baseViewHolder) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.r(baseViewHolder).setLayoutResource(com.p314xaae8f345.mm.R.C30864xbddafb2a.csn);
            android.view.ViewStub viewStub2 = (android.view.ViewStub) baseViewHolder.f250805h.findViewById(com.p314xaae8f345.mm.R.id.f566851ha2);
            if (!baseViewHolder.f250800e0) {
                baseViewHolder.f250802f0.f249947d = viewStub2.inflate();
                baseViewHolder.f250800e0 = true;
            }
        } else {
            baseViewHolder.f250802f0.f249947d = baseViewHolder.f250805h.findViewById(com.p314xaae8f345.mm.R.id.n_5);
            baseViewHolder.f250800e0 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g9 g9Var = baseViewHolder.f250802f0;
        g9Var.f249951h = g9Var.f249947d.findViewById(com.p314xaae8f345.mm.R.id.bkg);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g9 g9Var2 = baseViewHolder.f250802f0;
        g9Var2.f249949f = (android.widget.ImageView) g9Var2.f249951h.findViewById(com.p314xaae8f345.mm.R.id.f568828o70);
        baseViewHolder.f250802f0.f249951h.setOnClickListener(this.A);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g9 g9Var3 = baseViewHolder.f250802f0;
        g9Var3.f249952i = (android.widget.ImageView) g9Var3.f249947d.findViewById(com.p314xaae8f345.mm.R.id.nhn);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g9 g9Var4 = baseViewHolder.f250802f0;
        g9Var4.f249953j = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22626x3e1b8dda) g9Var4.f249947d.findViewById(com.p314xaae8f345.mm.R.id.lbi);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g9 g9Var5 = baseViewHolder.f250802f0;
        g9Var5.f249955l = (android.widget.TextView) g9Var5.f249947d.findViewById(com.p314xaae8f345.mm.R.id.dgp);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g9 g9Var6 = baseViewHolder.f250802f0;
        g9Var6.f249954k = (android.widget.TextView) g9Var6.f249947d.findViewById(com.p314xaae8f345.mm.R.id.dhd);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g9 g9Var7 = baseViewHolder.f250802f0;
        g9Var7.f249956m = (android.widget.ImageView) g9Var7.f249947d.findViewById(com.p314xaae8f345.mm.R.id.nar);
        this.f425108u.D0 = (android.view.ViewStub) baseViewHolder.f250802f0.f249947d.findViewById(com.p314xaae8f345.mm.R.id.n4i);
        this.f425108u.F0 = (android.view.ViewStub) baseViewHolder.f250834v0.findViewById(com.p314xaae8f345.mm.R.id.g6y);
        o74.i iVar = this.f425108u;
        android.view.View view = baseViewHolder.f250802f0.f249947d;
        iVar.G0 = view;
        this.C = view.findViewById(com.p314xaae8f345.mm.R.id.qgn);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5
    public void p(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ns nsVar, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720, int i18, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs bsVar) {
        int i19;
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226;
        n74.j1 j1Var;
        i64.b1 b1Var;
        int i27;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var;
        int i28;
        java.lang.String str3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("computeVideoPlayer", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        this.f425104q = true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("computeVideoPlayer", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        if (c19807x593d1720 != null && (str3 = c19807x593d1720.Id) != null) {
            this.f425105r = str3;
        }
        r45.a90 a90Var = c19807x593d1720.f39014x86965dde;
        r45.jj4 jj4Var = (a90Var == null || a90Var.f451373h.size() < 1) ? null : (r45.jj4) c19807x593d1720.f39014x86965dde.f451373h.get(0);
        if (nsVar.f251577p && this.f425104q) {
            l44.c0.b(nsVar.f251558a, jj4Var);
        }
        java.lang.Object tag = baseViewHolder.f250802f0.f249949f.getTag();
        if (tag instanceof java.lang.String) {
            java.lang.String str4 = (java.lang.String) tag;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4) || !str4.equals(this.f425105r)) {
                a84.y0.p(baseViewHolder.f250802f0.f249949f, false);
                baseViewHolder.f250802f0.f249949f.setImageDrawable(null);
            }
        } else {
            a84.y0.p(baseViewHolder.f250802f0.f249949f, false);
            baseViewHolder.f250802f0.f249949f.setImageDrawable(null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = nsVar.f251558a;
        this.f425107t = c17933xe8d1b2262;
        if (c17933xe8d1b2262 != null && !c17933xe8d1b2262.m70377x3172ed()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdSightTimeLineItem", "error ad snsInfo, id=" + ca4.z0.t0(this.f425107t.f68891x29d1292e));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1612, 121);
            ca4.q.c("error ad snsInfo", new java.lang.RuntimeException("normalSightItem"));
        }
        boolean f17 = xd4.o0.d().f(c19807x593d1720.Id);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdSightTimeLineItem", "ad fillItem, videoItem, pos=" + i17 + ", snsId=" + c19807x593d1720.Id + ", isPlayingVideo=" + f17 + ", hash=" + hashCode());
        android.widget.ImageView imageView = baseViewHolder.f250802f0.f249952i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 hj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj();
        baseViewHolder.f250802f0.a(c19807x593d1720, i17, nsVar.f251569h, nsVar.f251577p);
        baseViewHolder.f250802f0.f249954k.setVisibility(8);
        baseViewHolder.f250802f0.f249956m.setVisibility(8);
        baseViewHolder.f250802f0.f249959p = baseViewHolder.A;
        r45.a90 a90Var2 = c19807x593d1720.f39014x86965dde;
        if (a90Var2 == null || a90Var2.f451373h.size() < 1) {
            i19 = i17;
            str = "fillItem";
            str2 = "SnsAd.AdSightTimeLineItem";
        } else {
            long nanoTime = java.lang.System.nanoTime();
            m44.a.g(jj4Var);
            boolean D = hj6.D(jj4Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdSightTimeLineItem", "fillItem: isMediaSightExist %b duration %s", java.lang.Boolean.valueOf(D), java.lang.Long.valueOf(java.lang.System.nanoTime() - nanoTime));
            if (D) {
                if (hj6.E(jj4Var)) {
                    H(baseViewHolder, 0, f17);
                    baseViewHolder.f250802f0.f249953j.setVisibility(8);
                    baseViewHolder.f250802f0.f249952i.setImageDrawable(i65.a.i(this.f250782f, com.p314xaae8f345.mm.R.raw.f81043x73ab7191));
                    baseViewHolder.f250802f0.f249952i.setContentDescription(this.f250782f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjf));
                } else if (hj6.B(jj4Var)) {
                    H(baseViewHolder, 8, f17);
                    baseViewHolder.f250802f0.f249953j.setVisibility(8);
                } else if (!nsVar.f251577p || hj6.v(nsVar.f251558a) > 5) {
                    hj6.V(jj4Var);
                    H(baseViewHolder, 0, f17);
                    baseViewHolder.f250802f0.f249953j.setVisibility(8);
                    baseViewHolder.f250802f0.f249952i.setImageDrawable(i65.a.i(this.f250782f, com.p314xaae8f345.mm.R.raw.f81043x73ab7191));
                    baseViewHolder.f250802f0.f249952i.setContentDescription(this.f250782f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjf));
                } else if (!this.f425106s) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdSightTimeLineItem", "fillItem: mIsForbidShowPlayBtn is false and showPlayBtn");
                    I();
                }
            } else if (hj6.C(jj4Var)) {
                H(baseViewHolder, 8, f17);
                baseViewHolder.f250802f0.f249953j.setVisibility(0);
                baseViewHolder.f250802f0.f249953j.a();
            } else if (nsVar.f251577p && hj6.v(nsVar.f251558a) == 5) {
                hj6.U(jj4Var);
                H(baseViewHolder, 8, f17);
                baseViewHolder.f250802f0.f249953j.setVisibility(0);
                baseViewHolder.f250802f0.f249953j.a();
            } else if (hj6.z(jj4Var)) {
                baseViewHolder.f250802f0.f249953j.setVisibility(8);
                baseViewHolder.f250802f0.f249952i.setImageResource(com.p314xaae8f345.mm.R.raw.f81045x460fd68a);
                H(baseViewHolder, 0, f17);
            } else {
                hj6.V(jj4Var);
                H(baseViewHolder, 0, f17);
                baseViewHolder.f250802f0.f249953j.setVisibility(8);
                baseViewHolder.f250802f0.f249952i.setImageDrawable(i65.a.i(this.f250782f, com.p314xaae8f345.mm.R.raw.f81043x73ab7191));
                baseViewHolder.f250802f0.f249952i.setContentDescription(this.f250782f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjf));
                if (nsVar.f251577p) {
                    i28 = 4;
                } else {
                    i28 = 4;
                    if (hj6.x(nsVar.f251558a) == 4) {
                        baseViewHolder.f250802f0.f249954k.setVisibility(0);
                    }
                }
                if (nsVar.f251577p && hj6.v(nsVar.f251558a) == i28) {
                    baseViewHolder.f250802f0.f249954k.setVisibility(0);
                }
            }
            boolean k07 = ca4.m0.k0(baseViewHolder.f38402x94f64b00);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2263 = nsVar.f251558a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = c17933xe8d1b2263.m70354x74235b3e();
            if (m70354x74235b3e.f38165xfaef207b != 0) {
                str = "fillItem";
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(2056, 15);
            } else {
                str = "fillItem";
            }
            int width = ((android.view.WindowManager) this.f250782f.getSystemService("window")).getDefaultDisplay().getWidth();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d17202 = baseViewHolder.f38402x94f64b00;
            android.app.Activity activity = this.f250782f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17942x46376cf5 c17942x46376cf5 = baseViewHolder.f250813l;
            jz5.l a17 = o74.d.f425099a.a(k07, c17933xe8d1b2263, m70354x74235b3e, width, c19807x593d17202, activity);
            android.util.Pair pair = new android.util.Pair((java.lang.Integer) a17.f384366d, (java.lang.Integer) a17.f384367e);
            int i29 = m70354x74235b3e.f38193xc576144;
            if (i29 == 1 || i29 == 2) {
                c17942x46376cf5.setLayoutParams(new android.widget.LinearLayout.LayoutParams(((java.lang.Integer) pair.first).intValue(), -2));
            }
            if (this.f425110w == null) {
                this.f425110w = new n74.j1();
            }
            int r17 = ca4.m0.r(c17933xe8d1b2263, 0, 0);
            if (r17 == 1) {
                baseViewHolder.f250802f0.f249956m.setVisibility(0);
                baseViewHolder.f250802f0.f249956m.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bpt);
            } else if (r17 == 2) {
                baseViewHolder.f250802f0.f249956m.setVisibility(0);
                baseViewHolder.f250802f0.f249956m.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.csw);
            }
            int intValue = ((java.lang.Integer) pair.first).intValue();
            int intValue2 = ((java.lang.Integer) pair.second).intValue();
            this.f425113z = intValue;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fillItem: isVerticalAdVideo is ");
            sb6.append(k07);
            sb6.append(", snsId is ");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2264 = nsVar.f251558a;
            sb6.append(c17933xe8d1b2264 == null ? "" : java.lang.Long.valueOf(c17933xe8d1b2264.f68891x29d1292e));
            sb6.append(", smallSide is ");
            sb6.append(intValue);
            sb6.append(", smallHeight is ");
            sb6.append(intValue2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdSightTimeLineItem", sb6.toString());
            android.view.ViewGroup.LayoutParams layoutParams = baseViewHolder.f250802f0.f249955l.getLayoutParams();
            layoutParams.width = intValue;
            layoutParams.height = intValue2;
            baseViewHolder.f250802f0.f249955l.setLayoutParams(layoutParams);
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) baseViewHolder.f250802f0.f249947d.findViewById(com.p314xaae8f345.mm.R.id.ncu);
            android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams2.width = intValue;
            layoutParams2.height = intValue2;
            frameLayout.setLayoutParams(layoutParams2);
            android.view.View findViewById = baseViewHolder.f250802f0.f249947d.findViewById(com.p314xaae8f345.mm.R.id.f568829o71);
            findViewById.setLayoutParams(new android.widget.FrameLayout.LayoutParams(layoutParams));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/AdNormalSightTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/sns/ad/timeline/item/AdNormalSightTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.ViewGroup.LayoutParams layoutParams3 = baseViewHolder.f250802f0.f249951h.getLayoutParams();
            layoutParams3.width = -2;
            layoutParams3.height = -2;
            baseViewHolder.f250802f0.f249951h.setLayoutParams(layoutParams3);
            this.f425109v = frameLayout;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2265 = this.f425107t;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addOnRemovedListener", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
            if (bsVar == null || (l1Var = bsVar.f249569b) == null || (b1Var = l1Var.f251235c) == null) {
                b1Var = null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
            if (b1Var != null) {
                java.lang.String T = ca4.z0.T(c17933xe8d1b2265);
                if (!android.text.TextUtils.isEmpty(T) && !"0".equals(T)) {
                    b1Var.a(T, this);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addOnRemovedListener", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v.a(this.f425107t)) {
                n74.j1 j1Var2 = this.f425110w;
                if (j1Var2 != null) {
                    j1Var2.a(this.f250782f, this.f425107t, baseViewHolder.f250802f0.f249947d, 0);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2266 = this.f425107t;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillAdLivingStreamViewInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
                if (baseViewHolder instanceof o74.i) {
                    o74.i iVar = (o74.i) baseViewHolder;
                    android.view.ViewStub viewStub = iVar.D0;
                    if (viewStub != null && iVar.E0 == null) {
                        iVar.E0 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17803x7f9d5a75) a84.y0.h(viewStub);
                    }
                    if (iVar.E0 == null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillAdLivingStreamViewInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
                        str2 = "SnsAd.AdSightTimeLineItem";
                        i19 = i17;
                    } else {
                        iVar.f250802f0.f249952i.setVisibility(8);
                        iVar.f250802f0.f249953j.setVisibility(8);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g9 g9Var = iVar.f250802f0;
                        g9Var.f249951h.setTag(g9Var);
                        a84.y0.o(iVar.E0, intValue, intValue2);
                        a84.y0.o(iVar.f250802f0.f249951h, intValue, intValue2);
                        if (this.f425111x == null) {
                            this.f425111x = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v(iVar.E0);
                        }
                        str2 = "SnsAd.AdSightTimeLineItem";
                        this.f425111x.d(c17933xe8d1b2266, 0, jj4Var, java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(intValue2));
                    }
                } else {
                    str2 = "SnsAd.AdSightTimeLineItem";
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillAdLivingStreamViewInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
                i19 = i17;
            } else {
                str2 = "SnsAd.AdSightTimeLineItem";
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17803x7f9d5a75 c17803x7f9d5a75 = this.f425108u.E0;
                if (c17803x7f9d5a75 != null) {
                    c17803x7f9d5a75.setVisibility(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v vVar = this.f425111x;
                if (vVar != null) {
                    vVar.h();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 b17 = xd4.o0.d().b(c19807x593d1720.Id);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "fillItem: fill item view check videoView reAttach, tlObjId:%s, vv:%s, count:%s", c19807x593d1720.Id, b17, java.lang.Integer.valueOf(frameLayout.getChildCount()));
                if (frameLayout.getChildCount() == 1 && (frameLayout.getChildAt(0) instanceof android.widget.ImageView)) {
                    frameLayout.removeAllViews();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "fillItem: find thumbView then remove it %s", c19807x593d1720.Id);
                }
                if (frameLayout.getChildCount() == 1 && (frameLayout.getChildAt(0) instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 c18390xafce807 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807) frameLayout.getChildAt(0);
                    if (!c19807x593d1720.Id.equals(c18390xafce807.f252174m2)) {
                        frameLayout.removeAllViews();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "fillItem: find diff id then remove it %s %s", c19807x593d1720.Id, c18390xafce807.f252174m2);
                    }
                }
                if (b17 == null || frameLayout.getChildCount() != 0) {
                    if (!f17 && frameLayout.getChildCount() > 0 && !xd4.o0.d().e(c19807x593d1720.Id)) {
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        frameLayout.removeViewAt(0);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "fillItem: item remove video view cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                    }
                } else if (b17.getParent() != null && b17.getParent() != frameLayout) {
                    b17.f252178q2 = true;
                    ((android.view.ViewGroup) b17.getParent()).removeView(b17);
                    b17.setVisibility(0);
                    b17.m70656x5981726b(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.COVER);
                    frameLayout.addView(b17, new android.widget.FrameLayout.LayoutParams(-1, -1));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "fillItem: reAttach success");
                }
                if (b17 != null) {
                    java.lang.String str5 = baseViewHolder.f250801f;
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d17203 = baseViewHolder.f38402x94f64b00;
                    b17.P(jj4Var, str5, c19807x593d17203 == null ? 0 : c19807x593d17203.f39015xc86e6609);
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("fillItem: videoView setVideoData, position is ");
                    i27 = i17;
                    sb7.append(i27);
                    sb7.append(", tlObj Id is ");
                    sb7.append(c19807x593d1720.Id);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb7.toString());
                } else {
                    i27 = i17;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str2, "fillItem: SnsVideoViewMgr can not return video view, position is " + i27 + ", tlObj Id is " + c19807x593d1720.Id);
                }
                a84.y0.o(baseViewHolder.f250802f0.f249949f, intValue, intValue2);
                baseViewHolder.f250802f0.f249949f.requestLayout();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 hj7 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj();
                android.widget.ImageView imageView2 = baseViewHolder.f250802f0.f249949f;
                int hashCode = this.f250782f.hashCode();
                com.p314xaae8f345.mm.p2621x8fb0427b.s7 d17 = com.p314xaae8f345.mm.p2621x8fb0427b.s7.d();
                d17.f276846b = c19807x593d1720.f39015xc86e6609;
                i19 = i27;
                hj7.l0(jj4Var, imageView2, -1, hashCode, d17);
                baseViewHolder.f250802f0.f249949f.setTag(this.f425105r);
                a84.y0.p(baseViewHolder.f250802f0.f249949f, true);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g9 g9Var2 = baseViewHolder.f250802f0;
                g9Var2.f249951h.setTag(g9Var2);
                if (com.p314xaae8f345.mm.vfs.w6.j(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), jj4Var.f459388d) + ca4.z0.R(jj4Var))) {
                    bsVar.f249569b.f251235c.z(nsVar.f251571j, (int) jj4Var.R, true);
                    l44.c0.e();
                } else {
                    bsVar.f249569b.f251235c.z(nsVar.f251571j, (int) jj4Var.R, false);
                }
                bsVar.f249569b.f251235c.y(nsVar.f251571j, !nsVar.f251577p ? com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().x(nsVar.f251558a) != 5 : com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().v(nsVar.f251558a) != 5, 1);
            }
            if (this.f425108u != null) {
                if (this.f425112y == null) {
                    this.f425112y = new a44.k(this.f425108u.F0, baseViewHolder.f250819o);
                }
                this.f425112y.g(baseViewHolder.f250802f0.f249951h.getContext(), this.f425107t, intValue);
            }
        }
        if (!com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v.a(this.f425107t) && (j1Var = this.f425110w) != null) {
            j1Var.a(this.f250782f, this.f425107t, baseViewHolder.f250802f0.f249947d, 0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2267 = this.f425107t;
        int i37 = this.f425113z;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refreshCommonShakeView", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        try {
            if (this.D && com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.p2151xf8ffc37b.C17814xa1ba4463.d(c17933xe8d1b2267)) {
                if (this.B == null) {
                    G(baseViewHolder);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.p2151xf8ffc37b.C17814xa1ba4463 c17814xa1ba4463 = this.B;
                if (c17814xa1ba4463 != null) {
                    c17814xa1ba4463.j(c17933xe8d1b2267, c17933xe8d1b2267.m70346x10413e67().f38089x17592329, i19, i37);
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.p2151xf8ffc37b.C17814xa1ba4463 c17814xa1ba44632 = this.B;
                if (c17814xa1ba44632 != null) {
                    c17814xa1ba44632.j(c17933xe8d1b2267, null, i19, i37);
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "refreshCommonShakeView, exp=" + e17);
            ca4.q.c("refreshCommonShakeView, normalSight", e17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshCommonShakeView", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        g(nsVar, 3);
        if (baseViewHolder.f250813l != null && (c17933xe8d1b226 = this.f425107t) != null) {
            if (a84.p.b(150432, c17933xe8d1b226.m70346x10413e67()) || a84.p.a(this.f425107t)) {
                baseViewHolder.f250813l.m70566x8d5ca514(new o74.e(this, baseViewHolder));
            } else {
                baseViewHolder.f250813l.m70566x8d5ca514(null);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2268 = this.f425107t;
        if (c17933xe8d1b2268 != null && c17933xe8d1b2268.m70378x4c74e984()) {
            I();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
    }

    @Override // xd4.d
    /* renamed from: pause */
    public void mo69495x65825f6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pause", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdSightTimeLineItem", "pause");
        F();
        if (!com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v.a(this.f425107t)) {
            I();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pause", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
    }

    @Override // xd4.d
    /* renamed from: stop */
    public void mo69496x360802() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v vVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stop", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdSightTimeLineItem", "stop: %s Ad Video stop", this);
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v.a(this.f425107t) && (vVar = this.f425111x) != null) {
            vVar.f();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stop", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5
    public java.lang.String u() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        return "AdNormalSightTimeLineItem";
    }
}
