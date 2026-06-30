package q74;

/* loaded from: classes4.dex */
public final class d0 implements com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.b {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f441973a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17936xdec9f2b4 f441974b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.FrameLayout f441975c;

    /* renamed from: d, reason: collision with root package name */
    public final q74.s0 f441976d;

    /* JADX WARN: Multi-variable type inference failed */
    public d0(android.content.Context mContext, int i17, android.view.ViewGroup recycleViewContainer, android.view.View itemRootView, i64.b1 b1Var, w64.n nVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2124x2ad8c7ad.C17758x730d4dd2 c17758x730d4dd2, z84.h hVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mContext, "mContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recycleViewContainer, "recycleViewContainer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemRootView, "itemRootView");
        q74.s0 s0Var = new q74.s0(mContext, i17, recycleViewContainer, itemRootView, nVar, c17758x730d4dd2, hVar);
        this.f441976d = s0Var;
        android.view.ViewStub viewStub = (android.view.ViewStub) itemRootView.findViewById(com.p314xaae8f345.mm.R.id.rb7);
        android.view.View inflate = viewStub != null ? viewStub.inflate() : null;
        this.f441975c = inflate instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) inflate : null;
        android.view.ViewStub viewStub2 = (android.view.ViewStub) itemRootView.findViewById(com.p314xaae8f345.mm.R.id.f568522rb5);
        android.view.KeyEvent.Callback inflate2 = viewStub2 != null ? viewStub2.inflate() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17936xdec9f2b4 c17936xdec9f2b4 = inflate2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17936xdec9f2b4 ? (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17936xdec9f2b4) inflate2 : null;
        this.f441974b = c17936xdec9f2b4;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createContentView", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        if (c17936xdec9f2b4 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createContentView", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        } else {
            s0Var.f442032h = c17936xdec9f2b4;
            s0Var.f442033i = (android.widget.FrameLayout) c17936xdec9f2b4.findViewById(com.p314xaae8f345.mm.R.id.rbv);
            s0Var.f442034j = (android.widget.FrameLayout) c17936xdec9f2b4.findViewById(com.p314xaae8f345.mm.R.id.raf);
            s0Var.f442035k = (android.widget.ImageView) c17936xdec9f2b4.findViewById(com.p314xaae8f345.mm.R.id.rag);
            s0Var.f442050z = new q74.t(s0Var.f442025a, s0Var.f442026b, (android.view.ViewGroup) c17936xdec9f2b4.findViewById(com.p314xaae8f345.mm.R.id.f568490rb4), s0Var.f442029e, s0Var.f442030f, s0Var.f442031g);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createContentView", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("listenDestroy", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameLogic");
        try {
            if (mContext instanceof p012xc85e97e9.p093xedfae76a.y) {
                ((p012xc85e97e9.p093xedfae76a.y) mContext).mo273xed6858b4().a(new p012xc85e97e9.p093xedfae76a.f() { // from class: com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameLogic$listenDestroy$1$1
                    @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
                    /* renamed from: onDestroy */
                    public void mo7795xac79a11b(p012xc85e97e9.p093xedfae76a.y owner) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameLogic$listenDestroy$1$1");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCardBreakFrameLogic", "onDestroy");
                        q74.d0.this.c();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameLogic$listenDestroy$1$1");
                    }
                });
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c("SlideFullCardBreakFrameLogic_listenDestroy", th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("listenDestroy", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameLogic");
    }

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e;
        s34.a1 a1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameLogic");
        if (!s34.z0.f484369c.a(c17933xe8d1b226)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCardBreakFrameLogic", "bindData, snsInfo is not slideItemProduct type");
            c();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameLogic");
            return;
        }
        boolean V = ca4.m0.V(c17933xe8d1b226, this.f441973a);
        s34.z0 z0Var = null;
        q74.s0 s0Var = this.f441976d;
        if (V) {
            s0Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initScope", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
            p3325xe03a0797.p3326xc267989b.y0 y0Var = s0Var.f442044t;
            if (y0Var != null) {
                p3325xe03a0797.p3326xc267989b.z0.c(y0Var, null);
            }
            s0Var.f442044t = p3325xe03a0797.p3326xc267989b.z0.b();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initScope", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
            d();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("bindData, same snsInfo");
            sb6.append(ca4.z0.t0(c17933xe8d1b226 != null ? c17933xe8d1b226.f68891x29d1292e : 0L));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCardBreakFrameLogic", sb6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameLogic");
            return;
        }
        this.f441973a = c17933xe8d1b226;
        s0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initScope", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        p3325xe03a0797.p3326xc267989b.y0 y0Var2 = s0Var.f442044t;
        if (y0Var2 != null) {
            p3325xe03a0797.p3326xc267989b.z0.c(y0Var2, null);
        }
        s0Var.f442044t = p3325xe03a0797.p3326xc267989b.z0.b();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initScope", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        s0Var.f442037m = c17933xe8d1b226;
        if (c17933xe8d1b226 != null && (m70354x74235b3e = c17933xe8d1b226.m70354x74235b3e()) != null && (a1Var = m70354x74235b3e.f38210x95847c91) != null) {
            z0Var = a1Var.f484102f;
        }
        s0Var.f442038n = z0Var;
        s0Var.f442036l = false;
        q74.t tVar = s0Var.f442050z;
        if (tVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindSnsInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
            tVar.f442067p = c17933xe8d1b226;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindSnsInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        d();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17936xdec9f2b4 c17936xdec9f2b4 = this.f441974b;
        if (c17936xdec9f2b4 != null) {
            c17936xdec9f2b4.m70540xd37bdf2e(this);
        }
        s0Var.h();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("bindData, snsInfo is not same, snsId is ");
        sb7.append(ca4.z0.t0(c17933xe8d1b226 != null ? c17933xe8d1b226.f68891x29d1292e : 0L));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCardBreakFrameLogic", sb7.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameLogic");
    }

    public final void b(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("notifyBindCurrentProductViewData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameLogic");
        if (!s34.z0.f484369c.a(this.f441973a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCardBreakFrameLogic", "notifyBindCurrentProductViewData, is not slideItemProduct type");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyBindCurrentProductViewData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameLogic");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f441973a;
        s34.a1 a1Var = (c17933xe8d1b226 == null || (m70354x74235b3e = c17933xe8d1b226.m70354x74235b3e()) == null) ? null : m70354x74235b3e.f38210x95847c91;
        if (a1Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyBindCurrentProductViewData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameLogic");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCardPosition", "com.tencent.mm.plugin.sns.ad.adxml.AdSliderFullCardInfo");
        int i18 = i17 % a1Var.f484097a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCardPosition", "com.tencent.mm.plugin.sns.ad.adxml.AdSliderFullCardInfo");
        q74.s0 s0Var = this.f441976d;
        s0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("notifyBindCurrentProductViewData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        p3325xe03a0797.p3326xc267989b.y0 y0Var = s0Var.f442044t;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new q74.o0(s0Var, i18, null), 2, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyBindCurrentProductViewData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyBindCurrentProductViewData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameLogic");
    }

    public final void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reset", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameLogic");
        try {
            android.widget.FrameLayout frameLayout = this.f441975c;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17936xdec9f2b4 c17936xdec9f2b4 = this.f441974b;
            if (c17936xdec9f2b4 != null) {
                c17936xdec9f2b4.setVisibility(8);
            }
            this.f441976d.n();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCardBreakFrameLogic", "reset");
        } catch (java.lang.Throwable th6) {
            ca4.q.c("SlideFullCardBreakFrameLogic_reset", th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reset", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameLogic");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q74.d0.d():void");
    }
}
