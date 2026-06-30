package l94;

/* loaded from: classes4.dex */
public final class t extends l94.e implements k94.g {

    /* renamed from: h, reason: collision with root package name */
    public final int f398923h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f398924i;

    /* renamed from: j, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17735x2c84e2c f398925j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.TextView f398926k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f398927l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f398928m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.l f398929n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f398930o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(android.content.Context context, int i17) {
        super("WsFoldLeftMaterialRightTextComponent", context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f398923h = i17;
        this.f398927l = "";
        this.f398929n = j94.b.c(context, 0, 0, 6, null);
    }

    public static final /* synthetic */ java.lang.String n(l94.t tVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getTraceId$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent");
        java.lang.String str = tVar.f398927l;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getTraceId$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent");
        return str;
    }

    @Override // k94.g
    public void a(java.lang.String viewId, k94.i status, double d17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onViewVisibilityChanged", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewId, "viewId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(viewId, this.f398927l)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onViewVisibilityChanged", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent");
            return;
        }
        int ordinal = status.ordinal();
        if (ordinal == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h(), "feed become visible，video start play");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17735x2c84e2c c17735x2c84e2c = this.f398925j;
            if (c17735x2c84e2c != null && this.f398930o) {
                c17735x2c84e2c.S(0.0d);
                c17735x2c84e2c.mo48232x348b34();
                this.f398930o = false;
            }
        } else if (ordinal == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h(), "feed become invisible，video pause play");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17735x2c84e2c c17735x2c84e2c2 = this.f398925j;
            if (c17735x2c84e2c2 != null && c17735x2c84e2c2.mo61531xc00617a4()) {
                c17735x2c84e2c2.mo48231x65825f6();
            }
            this.f398930o = true;
            java.lang.String str = this.f398927l;
            if (str != null) {
                k94.f.f387479a.a(str);
            }
        } else if (ordinal == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h(), "feed removed，video pause play");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17735x2c84e2c c17735x2c84e2c3 = this.f398925j;
            if (c17735x2c84e2c3 != null && c17735x2c84e2c3.mo61531xc00617a4()) {
                c17735x2c84e2c3.mo48231x65825f6();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onViewVisibilityChanged", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent");
    }

    @Override // l94.e
    public void j(h94.a adInfo) {
        r45.d96 d96Var;
        int i17;
        int e17;
        r45.fb6 fb6Var;
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adInfo, "adInfo");
        r45.d43 b17 = adInfo.b();
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h(), "the fold sns info is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent");
            return;
        }
        java.util.LinkedList linkedList = b17.f453604d;
        if (linkedList == null || linkedList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h(), "the fold sns media info is null or empty");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent");
            return;
        }
        int i18 = this.f398923h;
        if (i18 == 10 || i18 == 12) {
            android.widget.ImageView imageView = this.f398924i;
            if (imageView == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(h(), "the image view is null, styleType is " + i18);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent");
                return;
            }
            r45.i96 i96Var = (r45.i96) linkedList.get(0);
            a84.m.a((i96Var == null || (d96Var = i96Var.f458385d) == null) ? null : d96Var.f453786d, imageView);
        } else {
            this.f398927l = adInfo.d();
            r45.i96 i96Var2 = (r45.i96) linkedList.get(0);
            if (i96Var2 == null || (fb6Var = i96Var2.f458386e) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(h(), "there is no video info info");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent");
                return;
            }
            java.lang.String str = fb6Var.f455714d;
            if (!(str == null || str.length() == 0)) {
                java.lang.String str2 = fb6Var.f455714d;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17735x2c84e2c c17735x2c84e2c = this.f398925j;
                a84.m.a(str2, c17735x2c84e2c != null ? c17735x2c84e2c.m69387x4eb0f6e5() : null);
            }
            java.lang.String str3 = fb6Var.f455717g;
            if (!(str3 == null || str3.length() == 0)) {
                if (com.p314xaae8f345.mm.vfs.w6.j(za4.t0.g() + "WsFoldAdVideo_" + a84.d0.d(l44.c0.j(fb6Var.f455717g, true)) + ".mp4")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h(), "video resource is exist");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17735x2c84e2c c17735x2c84e2c2 = this.f398925j;
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
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17735x2c84e2c c17735x2c84e2c3 = this.f398925j;
                if (c17735x2c84e2c3 != null) {
                    c17735x2c84e2c3.m69388x45d0c420(new l94.r(this));
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h(), "start");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17735x2c84e2c c17735x2c84e2c4 = this.f398925j;
                if (c17735x2c84e2c4 != null) {
                    c17735x2c84e2c4.mo48238x68ac462();
                }
                if (!this.f398928m) {
                    java.lang.Object f17 = f();
                    p012xc85e97e9.p093xedfae76a.y yVar = f17 instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) f17 : null;
                    if (yVar != null && (mo273xed6858b4 = yVar.mo273xed6858b4()) != null) {
                        mo273xed6858b4.a(new p012xc85e97e9.p093xedfae76a.v() { // from class: com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent$onBindData$1

                            /* renamed from: d, reason: collision with root package name */
                            public boolean f245503d;

                            @Override // p012xc85e97e9.p093xedfae76a.v
                            /* renamed from: onStateChanged */
                            public void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y source, p012xc85e97e9.p093xedfae76a.m event) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStateChanged", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent$onBindData$1");
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                                l94.t tVar = l94.t.this;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tVar.h(), "lifecycle event changed: " + event + ", traceId: " + l94.t.n(tVar));
                                int i19 = l94.s.f398922a[event.ordinal()];
                                if (i19 == 1) {
                                    source.mo273xed6858b4().c(this);
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getVideoView$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent");
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17735x2c84e2c c17735x2c84e2c5 = tVar.f398925j;
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getVideoView$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent");
                                    if (c17735x2c84e2c5 != null) {
                                        c17735x2c84e2c5.mo48239x360802();
                                    }
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setVideoView$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent");
                                    tVar.f398925j = null;
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setVideoView$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent");
                                } else if (i19 == 2) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getVideoView$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent");
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17735x2c84e2c c17735x2c84e2c6 = tVar.f398925j;
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getVideoView$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent");
                                    if (c17735x2c84e2c6 != null && c17735x2c84e2c6.mo61531xc00617a4()) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tVar.h(), "lifecycle ON_PAUSE, pause video, traceId: " + l94.t.n(tVar));
                                        c17735x2c84e2c6.mo48231x65825f6();
                                    }
                                    this.f245503d = true;
                                } else if (i19 == 3) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getVideoView$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent");
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17735x2c84e2c c17735x2c84e2c7 = tVar.f398925j;
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getVideoView$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent");
                                    if (c17735x2c84e2c7 != null && !c17735x2c84e2c7.mo61531xc00617a4() && this.f245503d) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tVar.h(), "lifecycle ON_RESUME, play video, traceId: " + l94.t.n(tVar));
                                        c17735x2c84e2c7.mo48232x348b34();
                                    }
                                }
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStateChanged", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent$onBindData$1");
                            }
                        });
                    }
                    this.f398928m = true;
                }
            }
        }
        android.widget.TextView textView = this.f398926k;
        if (textView != null) {
            java.lang.String str4 = b17.f453610m;
            if (str4 == null || str4.length() == 0) {
                i17 = 8;
            } else {
                com.p314xaae8f345.mm.p2614xca6eae71.x1 Di = com.p314xaae8f345.mm.p2614xca6eae71.x1.Di();
                f();
                textView.setText(Di.Ri(b17.f453610m, true));
                i17 = 0;
            }
            textView.setVisibility(i17);
            if (com.p314xaae8f345.mm.ui.bk.C()) {
                r45.c43 c43Var = b17.f453618u;
                e17 = ca4.n0.e(c43Var != null ? c43Var.f452800e : null, 0);
            } else {
                r45.c43 c43Var2 = b17.f453618u;
                e17 = ca4.n0.e(c43Var2 != null ? c43Var2.f452799d : null, 0);
            }
            textView.setTextColor(e17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent");
    }

    @Override // l94.e
    public android.view.View k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBuildView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent");
        int intValue = ((java.lang.Number) this.f398929n.f384367e).intValue();
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(f());
        c44.a.l();
        if (linearLayout.getLayoutParams() == null) {
            c44.a.o();
            linearLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            layoutParams.width = -1;
            linearLayout.setLayoutParams(layoutParams);
        }
        c44.a.l();
        if (linearLayout.getLayoutParams() == null) {
            c44.a.o();
            linearLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -1));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
            layoutParams2.height = -1;
            linearLayout.setLayoutParams(layoutParams2);
        }
        linearLayout.setOrientation(0);
        int i17 = this.f398923h;
        if (i17 == 10) {
            o(linearLayout, intValue, intValue);
        } else if (i17 == 12) {
            o(linearLayout, (intValue * 9) / 16, intValue);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17735x2c84e2c c17735x2c84e2c = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17735x2c84e2c(linearLayout.getContext(), null);
            int i18 = (intValue * 9) / 16;
            if (c17735x2c84e2c.getLayoutParams() == null) {
                c44.a.o();
                c17735x2c84e2c.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i18, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams3 = c17735x2c84e2c.getLayoutParams();
                layoutParams3.width = i18;
                c17735x2c84e2c.setLayoutParams(layoutParams3);
            }
            if (c17735x2c84e2c.getLayoutParams() == null) {
                c44.a.o();
                c17735x2c84e2c.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, intValue));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams4 = c17735x2c84e2c.getLayoutParams();
                layoutParams4.height = intValue;
                c17735x2c84e2c.setLayoutParams(layoutParams4);
            }
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
            this.f398925j = c17735x2c84e2c;
            linearLayout.addView(c17735x2c84e2c);
        }
        android.widget.TextView textView = new android.widget.TextView(linearLayout.getContext());
        linearLayout.addView(textView);
        if (textView.getLayoutParams() == null) {
            c44.a.o();
            textView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(0, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams5 = textView.getLayoutParams();
            layoutParams5.width = 0;
            textView.setLayoutParams(layoutParams5);
        }
        c44.a.l();
        if (textView.getLayoutParams() == null) {
            c44.a.o();
            textView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -1));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams6 = textView.getLayoutParams();
            layoutParams6.height = -1;
            textView.setLayoutParams(layoutParams6);
        }
        android.view.ViewGroup.LayoutParams layoutParams7 = textView.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams8 = layoutParams7 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams7 : null;
        if (layoutParams8 != null) {
            layoutParams8.weight = 1;
        }
        int a17 = c44.b.a(16);
        android.view.ViewGroup.LayoutParams layoutParams9 = textView.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams9 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams9 : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.leftMargin = a17;
        }
        int a18 = c44.b.a(20);
        android.view.ViewGroup.LayoutParams layoutParams10 = textView.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams10 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams10 : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.topMargin = a18;
        }
        int a19 = c44.b.a(20);
        android.view.ViewGroup.LayoutParams layoutParams11 = textView.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams11 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams11 : null;
        if (marginLayoutParams3 != null) {
            marginLayoutParams3.rightMargin = a19;
        }
        int a27 = c44.b.a(20);
        android.view.ViewGroup.LayoutParams layoutParams12 = textView.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams12 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams12 : null;
        if (marginLayoutParams4 != null) {
            marginLayoutParams4.bottomMargin = a27;
        }
        textView.setTextSize(0, i65.a.j(textView.getContext()) * i65.a.a(textView.getContext(), 14.0f));
        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        textView.setGravity(c44.a.f());
        textView.setLineSpacing(c44.b.a(8), 1.0f);
        int a28 = (int) (((intValue - c44.b.a(20)) - c44.b.a(20)) / ((textView.getPaint().getFontMetricsInt(null) * textView.getLineSpacingMultiplier()) + textView.getLineSpacingExtra()));
        textView.setMaxLines(a28 >= 1 ? a28 : 1);
        this.f398926k = textView;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBuildView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent");
        return linearLayout;
    }

    public final void o(android.widget.LinearLayout linearLayout, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createImageView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent");
        android.widget.ImageView imageView = new android.widget.ImageView(linearLayout.getContext());
        linearLayout.addView(imageView);
        if (imageView.getLayoutParams() == null) {
            c44.a.o();
            imageView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i17, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = i17;
            imageView.setLayoutParams(layoutParams);
        }
        if (imageView.getLayoutParams() == null) {
            c44.a.o();
            imageView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, i18));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            layoutParams2.height = i18;
            imageView.setLayoutParams(layoutParams2);
        }
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        this.f398924i = imageView;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createImageView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldLeftMaterialRightTextComponent");
    }
}
