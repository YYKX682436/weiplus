package l94;

/* loaded from: classes4.dex */
public final class e0 extends l94.e implements k94.g {

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f398880h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17735x2c84e2c f398881i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f398882j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f398883k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(android.content.Context context) {
        super("WsFoldVideoAdComponent", context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f398880h = "";
    }

    public static final /* synthetic */ java.lang.String n(l94.e0 e0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getTraceId$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent");
        java.lang.String str = e0Var.f398880h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getTraceId$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent");
        return str;
    }

    @Override // k94.g
    public void a(java.lang.String viewId, k94.i status, double d17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onViewVisibilityChanged", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewId, "viewId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(viewId, this.f398880h)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onViewVisibilityChanged", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent");
            return;
        }
        int ordinal = status.ordinal();
        if (ordinal == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h(), "feed become visible，video start play");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17735x2c84e2c c17735x2c84e2c = this.f398881i;
            if (c17735x2c84e2c != null && this.f398883k) {
                c17735x2c84e2c.S(0.0d);
                c17735x2c84e2c.mo48232x348b34();
                this.f398883k = false;
            }
        } else if (ordinal == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h(), "feed become invisible，video pause play");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17735x2c84e2c c17735x2c84e2c2 = this.f398881i;
            if (c17735x2c84e2c2 != null && c17735x2c84e2c2.mo61531xc00617a4()) {
                c17735x2c84e2c2.mo48231x65825f6();
            }
            this.f398883k = true;
            java.lang.String str = this.f398880h;
            if (str != null) {
                k94.f.f387479a.a(str);
            }
        } else if (ordinal == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h(), "feed removed，video pause play");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17735x2c84e2c c17735x2c84e2c3 = this.f398881i;
            if (c17735x2c84e2c3 != null && c17735x2c84e2c3.mo61531xc00617a4()) {
                c17735x2c84e2c3.mo48231x65825f6();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onViewVisibilityChanged", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent");
    }

    @Override // l94.e
    public void j(h94.a adInfo) {
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adInfo, "adInfo");
        r45.d43 b17 = adInfo.b();
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(h(), "the ad sns info is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent");
            return;
        }
        this.f398880h = adInfo.d();
        java.util.LinkedList linkedList = b17.f453604d;
        if (linkedList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(h(), "there is no media info");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent");
            return;
        }
        r45.fb6 fb6Var = ((r45.i96) linkedList.get(0)).f458386e;
        if (fb6Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(h(), "there is no video info info");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent");
            return;
        }
        java.lang.String str = fb6Var.f455714d;
        if (!(str == null || str.length() == 0)) {
            java.lang.String str2 = fb6Var.f455714d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17735x2c84e2c c17735x2c84e2c = this.f398881i;
            a84.m.a(str2, c17735x2c84e2c != null ? c17735x2c84e2c.m69387x4eb0f6e5() : null);
        }
        java.lang.String str3 = fb6Var.f455717g;
        if (!(str3 == null || str3.length() == 0)) {
            if (com.p314xaae8f345.mm.vfs.w6.j(za4.t0.g() + "WsFoldAdVideo_" + a84.d0.d(l44.c0.j(fb6Var.f455717g, true)) + ".mp4")) {
                h();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17735x2c84e2c c17735x2c84e2c2 = this.f398881i;
            if (c17735x2c84e2c2 != null) {
                c17735x2c84e2c2.h(false, fb6Var.f455717g, 0);
            }
            android.content.Context context = f();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            f94.a aVar = (f94.a) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(f94.a.class);
            aVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVisibilityManager", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVisibilityManager", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC");
            aVar.f342065d.a(this);
            k94.f.f387479a.c(adInfo, fb6Var);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17735x2c84e2c c17735x2c84e2c3 = this.f398881i;
            if (c17735x2c84e2c3 != null) {
                c17735x2c84e2c3.m69388x45d0c420(new l94.c0(this));
            }
            h();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17735x2c84e2c c17735x2c84e2c4 = this.f398881i;
            if (c17735x2c84e2c4 != null) {
                c17735x2c84e2c4.mo48238x68ac462();
            }
            if (!this.f398882j) {
                java.lang.Object f17 = f();
                p012xc85e97e9.p093xedfae76a.y yVar = f17 instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) f17 : null;
                if (yVar != null && (mo273xed6858b4 = yVar.mo273xed6858b4()) != null) {
                    mo273xed6858b4.a(new p012xc85e97e9.p093xedfae76a.v() { // from class: com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent$onBindData$1

                        /* renamed from: d, reason: collision with root package name */
                        public boolean f245507d;

                        @Override // p012xc85e97e9.p093xedfae76a.v
                        /* renamed from: onStateChanged */
                        public void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y source, p012xc85e97e9.p093xedfae76a.m event) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStateChanged", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent$onBindData$1");
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                            l94.e0 e0Var = l94.e0.this;
                            e0Var.h();
                            event.toString();
                            l94.e0.n(e0Var);
                            int i17 = l94.d0.f398872a[event.ordinal()];
                            if (i17 == 1) {
                                source.mo273xed6858b4().c(this);
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getVideoView$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent");
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17735x2c84e2c c17735x2c84e2c5 = e0Var.f398881i;
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getVideoView$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent");
                                if (c17735x2c84e2c5 != null) {
                                    c17735x2c84e2c5.mo48239x360802();
                                }
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setVideoView$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent");
                                e0Var.f398881i = null;
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setVideoView$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent");
                            } else if (i17 == 2) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getVideoView$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent");
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17735x2c84e2c c17735x2c84e2c6 = e0Var.f398881i;
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getVideoView$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent");
                                if (c17735x2c84e2c6 != null && c17735x2c84e2c6.mo61531xc00617a4()) {
                                    e0Var.h();
                                    l94.e0.n(e0Var);
                                    c17735x2c84e2c6.mo48231x65825f6();
                                }
                                this.f245507d = true;
                            } else if (i17 == 3) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getVideoView$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent");
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17735x2c84e2c c17735x2c84e2c7 = e0Var.f398881i;
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getVideoView$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent");
                                if (c17735x2c84e2c7 != null && !c17735x2c84e2c7.mo61531xc00617a4() && this.f245507d) {
                                    e0Var.h();
                                    l94.e0.n(e0Var);
                                    c17735x2c84e2c7.mo48232x348b34();
                                }
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStateChanged", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent$onBindData$1");
                        }
                    });
                }
                this.f398882j = true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent");
    }

    @Override // l94.e
    public android.view.View k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBuildView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent");
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(f());
        c44.a.l();
        if (frameLayout.getLayoutParams() == null) {
            c44.a.o();
            frameLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            layoutParams.width = -1;
            frameLayout.setLayoutParams(layoutParams);
        }
        c44.a.l();
        if (frameLayout.getLayoutParams() == null) {
            c44.a.o();
            frameLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -1));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
            layoutParams2.height = -1;
            frameLayout.setLayoutParams(layoutParams2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17735x2c84e2c c17735x2c84e2c = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17735x2c84e2c(frameLayout.getContext(), null);
        c17735x2c84e2c.mo61536x764d819b(true);
        c17735x2c84e2c.mo48236x764cf626(true);
        java.lang.String g17 = za4.t0.g();
        com.p314xaae8f345.mm.vfs.w6.u(g17);
        c17735x2c84e2c.mo48224x6c9eb6a9(g17);
        w54.g gVar = new w54.g();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPreAllocStorage", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy");
        gVar.f524574f = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPreAllocStorage", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy");
        c17735x2c84e2c.m48235xbc2f47ad(gVar);
        c17735x2c84e2c.mo48237xebd28962(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.COVER);
        c17735x2c84e2c.m69388x45d0c420(new g54.d());
        c17735x2c84e2c.mo64629xc2e9d13b(false);
        this.f398881i = c17735x2c84e2c;
        c44.a.l();
        c44.a.l();
        frameLayout.addView(c17735x2c84e2c, new android.widget.FrameLayout.LayoutParams(-1, -1));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBuildView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent");
        return frameLayout;
    }
}
