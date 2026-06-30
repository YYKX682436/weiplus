package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13;

/* renamed from: com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew */
/* loaded from: classes4.dex */
public class C18286x16099eaa extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5 implements xd4.d, i64.k0, p012xc85e97e9.p093xedfae76a.x, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.y4 {
    public k84.d4 A;
    public final android.view.View.OnClickListener B;
    public boolean C;
    public final u74.e D;
    public fd4.l E;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.y f250844r;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f250847u;

    /* renamed from: v, reason: collision with root package name */
    public int f250848v;

    /* renamed from: w, reason: collision with root package name */
    public final u74.f f250849w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.n f250850x;

    /* renamed from: y, reason: collision with root package name */
    public k84.q1 f250851y;

    /* renamed from: z, reason: collision with root package name */
    public p44.z f250852z;

    /* renamed from: q, reason: collision with root package name */
    public final android.os.Handler f250843q = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: s, reason: collision with root package name */
    public volatile boolean f250845s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f250846t = false;

    public C18286x16099eaa() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFullCardAdWrapper", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        u74.f fVar = new u74.f();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFullCardAdWrapper", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        this.f250849w = fVar;
        this.B = new ed4.l(this);
        this.C = false;
        this.D = new ed4.o(this);
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
    /* renamed from: onUIDestroy */
    private void m71060x20b2fbc7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUIDestroy", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FullCardAdTimeLineItemNew", "onUIDestroy, hash=" + hashCode());
        fd4.l lVar = this.E;
        if (lVar != null) {
            lVar.d();
        }
        p84.e eVar = this.f250849w.f506706h;
        if (eVar != null) {
            eVar.a();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUIDestroy", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
    }

    public boolean F() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var;
        i64.b1 b1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doPause", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        int i17 = this.f250844r.f38402x94f64b00.f39014x86965dde.f451370e;
        if (i17 != 5 && i17 != 15) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPause", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FullCardAdTimeLineItemNew", "doPause, hash=" + hashCode());
        k84.d4 d4Var = this.A;
        if (d4Var != null && d4Var.n(this.f250847u)) {
            k84.d4 d4Var2 = this.A;
            d4Var2.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d4Var2.j(), "onPause");
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) d4Var2.O).k(java.lang.Boolean.FALSE);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.y yVar = this.f250844r;
        if (yVar != null) {
            u74.d dVar = yVar.D0;
            if (dVar.f506687o != null) {
                u74.f fVar = this.f250849w;
                boolean z17 = dVar.T.f506666c;
                fVar.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pausePlay", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
                fVar.h(z17, false);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pausePlay", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f250847u;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pauseStaticVideoPlay", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs bsVar = this.f250784h;
                if (bsVar != null && (l1Var = bsVar.f249569b) != null && (b1Var = l1Var.f251235c) != null && c17933xe8d1b226 != null) {
                    b1Var.q(c17933xe8d1b226.f68891x29d1292e);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pauseStaticVideoPlay", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dispatchVideoPause", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
                fd4.l lVar = this.E;
                if (lVar != null) {
                    lVar.mo129355x65d3157a();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispatchVideoPause", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
            }
        }
        this.f250845s = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPause", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.y4
    public void F3() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScrollIdle", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        p44.z zVar = this.f250852z;
        if (zVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScrollIdle", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RandomPickCardLogic", "onScrollIdle");
            zVar.f433406l.m();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrollIdle", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrollIdle", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
    }

    public void G() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onEndViewShow", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onEndViewShow", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
    }

    public fd4.l H() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onNewFullCardBusiness", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onNewFullCardBusiness", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        return null;
    }

    public final void I() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showPlayBtn", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f250847u;
        boolean z17 = c17933xe8d1b226 != null && (c17933xe8d1b226.m70380x4b83eebb() || this.f250847u.m70379x7e206751() || this.f250847u.m70413xd8243ab2());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.y yVar = this.f250844r;
        if (yVar != null && yVar.D0.f506687o != null && !this.f250845s) {
            u74.d dVar = this.f250844r.D0;
            if (!dVar.T.f506665b && !z17) {
                dVar.f506687o.f249952i.setVisibility(0);
                this.f250844r.D0.f506687o.f249953j.setVisibility(8);
                this.f250844r.D0.f506687o.f249952i.setImageDrawable(i65.a.i(this.f250782f, com.p314xaae8f345.mm.R.raw.f81043x73ab7191));
                this.f250844r.D0.f506687o.f249952i.setContentDescription(this.f250782f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjf));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showPlayBtn", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
    }

    public boolean J(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 c17903x3b438f4) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("useOnlineVideoView", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        boolean m17 = u74.f.m(c17903x3b438f4);
        if (!this.C) {
            this.C = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1697, m17 ? 4 : 3);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("useOnlineVideoView", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        return m17;
    }

    @Override // xd4.d
    public void c(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18402xe28da210 c18402xe28da210;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g9 g9Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        int i18 = baseViewHolder.f38402x94f64b00.f39014x86965dde.f451370e;
        if (i18 == 5 || i18 == 15) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FullCardAdTimeLineItemNew", "play: hash=" + hashCode() + ", pos=" + i17 + ", isEndViewShow=" + this.f250846t + ", isPlayingSight=" + this.f250845s);
            xd4.o0.d().j();
            xd4.g.a().d(this);
            k84.d4 d4Var = this.A;
            if (d4Var != null && d4Var.n(this.f250847u)) {
                k84.d4 d4Var2 = this.A;
                d4Var2.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d4Var2.j(), "onPlay");
                ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) d4Var2.O).k(java.lang.Boolean.TRUE);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
            }
            if (!this.f250846t && (baseViewHolder instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.y)) {
                this.f250849w.l(((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.y) baseViewHolder).D0.T.f506666c);
                fd4.l lVar = this.E;
                if (lVar != null) {
                    lVar.c();
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hidePlayBtn", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.y yVar = this.f250844r;
            if (yVar != null && (g9Var = yVar.D0.f506687o) != null) {
                g9Var.f249952i.setVisibility(8);
                this.f250844r.D0.f506687o.f249953j.setVisibility(8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hidePlayBtn", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
            this.f250845s = true;
            if (baseViewHolder instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.y) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.y) baseViewHolder).D0.T.f506665b = false;
            }
            if (!this.f250846t && (c18402xe28da210 = this.f250844r.D0.f506688p) != null && c18402xe28da210.getVisibility() == 0) {
                this.f250844r.D0.f506688p.c(true);
            }
            p44.z zVar = this.f250852z;
            if (zVar != null) {
                zVar.g();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
    }

    @Override // i64.k0
    public void d(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAdRemoved", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FullCardAdTimeLineItemNew", "onAdRemoved, snsId=" + str + ", hash=" + hashCode());
        fd4.l lVar = this.E;
        if (lVar != null) {
            lVar.j();
        }
        p84.e eVar = this.f250849w.f506706h;
        if (eVar != null) {
            eVar.a();
        }
        p44.z zVar = this.f250852z;
        if (zVar != null) {
            zVar.f();
        }
        java.lang.String T = ca4.z0.T(this.f250847u);
        if (T != null && !T.equals(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FullCardAdTimeLineItemNew", "onAdRemoved, curSnsId=" + T + ", snsId=" + str);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1612, 123);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAdRemoved", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
    }

    @Override // xd4.d
    public void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUIPause", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FullCardAdTimeLineItemNew", "onUIPause");
        F();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUIPause", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
    }

    @Override // xd4.d
    /* renamed from: getDisplayRect */
    public android.graphics.Rect mo69493x4003fc90() {
        android.view.View view;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDisplayRect", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.y yVar = this.f250844r;
        if (yVar == null || (view = yVar.D0.f506698z) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDisplayRect", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i17 = iArr[0];
        int i18 = iArr[1];
        android.graphics.Rect rect = new android.graphics.Rect(i17, i18, this.f250844r.D0.f506698z.getMeasuredWidth() + i17, this.f250844r.D0.f506698z.getMeasuredHeight() + i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDisplayRect", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        return rect;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5
    public void h(android.view.ViewStub viewStub, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder) {
        android.view.View findViewById;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildContent", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        java.lang.System.currentTimeMillis();
        this.f250844r = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.y) baseViewHolder;
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.r(baseViewHolder) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.r(baseViewHolder).setLayoutResource(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571056cu2);
            if (!baseViewHolder.f250823q) {
                findViewById = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.r(baseViewHolder).inflate();
                baseViewHolder.f250823q = true;
            }
            findViewById = null;
        } else {
            if (!baseViewHolder.f250823q) {
                findViewById = baseViewHolder.f250805h.findViewById(com.p314xaae8f345.mm.R.id.ggo);
                baseViewHolder.f250823q = true;
            }
            findViewById = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.y yVar = this.f250844r;
        yVar.D0 = u74.f.g(yVar.f250805h);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.y yVar2 = this.f250844r;
        u74.d dVar = yVar2.D0;
        u74.c cVar = dVar.T;
        boolean z17 = this.f250780d;
        cVar.f506670g = z17;
        dVar.f506698z = findViewById;
        cVar.f506664a = 0;
        dVar.f506696x = yVar2.f250834v0;
        dVar.f506697y = yVar2.f250838x0;
        yVar2.f250802f0 = dVar.f506687o;
        this.f250848v = ca4.m0.y("MicroMsg.FullCardAdTimeLineItemNew", this.f250782f, 0, z17);
        u74.f fVar = this.f250849w;
        u74.e eVar = this.D;
        fVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setWraperInterface", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        fVar.f506708j = eVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setWraperInterface", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        this.f250849w.f(this.f250844r.D0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBuildSubItemContent", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        if (this.E == null) {
            fd4.l H = H();
            this.E = H;
            if (H != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var = this.f250784h.f249569b;
                H.i(this.f250782f, l1Var.f251235c, l1Var.f251255w, this.f250844r.D0, this.f250849w);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBuildSubItemContent", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        u74.c cVar2 = this.f250844r.D0.T;
        cVar2.f506668e = this.E;
        cVar2.f506669f = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.u(this);
        android.content.ComponentCallbacks2 componentCallbacks2 = this.f250782f;
        if (componentCallbacks2 instanceof p012xc85e97e9.p093xedfae76a.y) {
            ((p012xc85e97e9.p093xedfae76a.y) componentCallbacks2).mo273xed6858b4().a(this);
        }
        java.lang.System.currentTimeMillis();
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.v(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildContent", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0437  */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [int] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder r43, int r44, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ns r45, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 r46, int r47, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs r48) {
        /*
            Method dump skipped, instructions count: 1164
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.C18286x16099eaa.p(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder, int, com.tencent.mm.plugin.sns.ui.ns, com.tencent.mm.protocal.protobuf.TimeLineObject, int, com.tencent.mm.plugin.sns.ui.bs):void");
    }

    @Override // xd4.d
    /* renamed from: pause */
    public void mo69495x65825f6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pause", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FullCardAdTimeLineItemNew", "pause");
        if (F()) {
            I();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pause", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
    }

    @Override // xd4.d
    /* renamed from: stop */
    public void mo69496x360802() {
        u74.d dVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g9 g9Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stop", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FullCardAdTimeLineItemNew", "stop, hash=" + hashCode());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.y yVar = this.f250844r;
        if (yVar != null && (g9Var = (dVar = yVar.D0).f506687o) != null && !dVar.T.f506666c) {
            g9Var.f249950g.u();
        }
        this.f250845s = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stop", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5
    public java.lang.String u() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        return "FullCardAdTimeLineItemNew";
    }
}
