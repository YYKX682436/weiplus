package l94;

/* loaded from: classes4.dex */
public final class b0 extends l94.e implements k94.g {

    /* renamed from: h, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f398855h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f398856i;

    /* renamed from: j, reason: collision with root package name */
    public android.animation.ValueAnimator f398857j;

    /* renamed from: k, reason: collision with root package name */
    public final android.os.Handler f398858k;

    /* renamed from: l, reason: collision with root package name */
    public long f398859l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Runnable f398860m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f398861n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f398862o;

    /* renamed from: p, reason: collision with root package name */
    public int f398863p;

    /* renamed from: q, reason: collision with root package name */
    public int f398864q;

    /* renamed from: r, reason: collision with root package name */
    public int f398865r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(android.content.Context context) {
        super("WsFoldRecyclerAdComponent", context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f398858k = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f398859l = 1700L;
        this.f398860m = new l94.w(this);
        this.f398861n = "";
    }

    public static final float n(l94.b0 b0Var) {
        float f17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$calcSnapTarget", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
        b0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calcSnapTarget", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = b0Var.f398855h;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4 != null ? c1163xf1deaba4.getLayoutManager() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2154xd1954cdd.ui.p2155xac8f1cfd.p2156xd0e2e03f.C17827xd9ca7419 c17827xd9ca7419 = layoutManager instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2154xd1954cdd.ui.p2155xac8f1cfd.p2156xd0e2e03f.C17827xd9ca7419 ? (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2154xd1954cdd.ui.p2155xac8f1cfd.p2156xd0e2e03f.C17827xd9ca7419) layoutManager : null;
        if (c17827xd9ca7419 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calcSnapTarget", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
            f17 = 0.0f;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getScrollRange", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
            int i17 = c17827xd9ca7419.f245518p;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getScrollRange", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("snapToNearest", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
            float b17 = a06.d.b(c17827xd9ca7419.f245517o / c17827xd9ca7419.f245518p) * c17827xd9ca7419.f245518p;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("snapToNearest", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getScrollPx", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
            float f18 = c17827xd9ca7419.f245517o;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getScrollPx", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
            float f19 = f18 - b17;
            float f27 = i17;
            if (f19 > f27 * 0.5f) {
                b17 += f27;
            } else if (f19 < (-i17) * 0.5f) {
                b17 -= f27;
            }
            f17 = b17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calcSnapTarget", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$calcSnapTarget", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
        return f17;
    }

    @Override // k94.g
    public void a(java.lang.String viewId, k94.i status, double d17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onViewVisibilityChanged", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewId, "viewId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(viewId, this.f398861n)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onViewVisibilityChanged", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
            return;
        }
        int ordinal = status.ordinal();
        if (ordinal == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h(), "feed become visible");
        } else if (ordinal == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h(), "feed become invisible");
            q(viewId);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetToCenter$default", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
            r(true);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetToCenter$default", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
        } else if (ordinal == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h(), "feed material ratio become changed, exposureRatio is " + d17);
            if (d17 < 1.0d) {
                p();
            } else {
                s();
            }
        } else if (ordinal == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h(), "feed removed");
            p();
            android.animation.ValueAnimator valueAnimator = this.f398857j;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            q(viewId);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onViewVisibilityChanged", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
    }

    @Override // l94.e
    public void j(h94.a adInfo) {
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adInfo, "adInfo");
        r45.d43 b17 = adInfo.b();
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(h(), "the fold sns info is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
            return;
        }
        java.util.LinkedList linkedList = b17.f453604d;
        boolean z17 = false;
        if (linkedList == null || linkedList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(h(), "the fold media info list is null or empty");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkMediaInfoListNotNull", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
        if (!(linkedList == null || linkedList.isEmpty())) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkMediaInfoListNotNull", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                    z17 = true;
                    break;
                } else if (((r45.i96) it.next()) == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkMediaInfoListNotNull", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                    break;
                }
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkMediaInfoListNotNull", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(h(), "the internal fold media info is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
            return;
        }
        this.f398861n = adInfo.d();
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
        int size = linkedList.size();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f398855h;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.m7963x830bc99d(true);
            android.content.Context context2 = c1163xf1deaba4.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2154xd1954cdd.ui.p2155xac8f1cfd.p2156xd0e2e03f.C17827xd9ca7419 c17827xd9ca7419 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2154xd1954cdd.ui.p2155xac8f1cfd.p2156xd0e2e03f.C17827xd9ca7419(context2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setRealItemCount", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
            c17827xd9ca7419.f245515m = size;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setRealItemCount", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
            c1163xf1deaba4.mo7967x900dcbe1(c17827xd9ca7419);
            m94.b bVar = new m94.b();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleRecyclerAdapter");
            bVar.f406601d = linkedList;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleRecyclerAdapter");
            c1163xf1deaba4.mo7960x6cab2c8d(bVar);
        }
        int i17 = b17.f453620w;
        if (i17 > 0) {
            this.f398859l = i17;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetToCenter$default", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
        r(true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetToCenter$default", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setupListeners", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
        if (!this.f398862o) {
            this.f398862o = true;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f398855h;
            if (c1163xf1deaba42 != null) {
                c1163xf1deaba42.P(new l94.x(this));
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = this.f398855h;
            if (c1163xf1deaba43 != null) {
                c1163xf1deaba43.setOnClickListener(new l94.y(b17, adInfo));
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba44 = this.f398855h;
            if (c1163xf1deaba44 != null) {
                c1163xf1deaba44.i(new l94.z(this));
            }
            java.lang.Object f17 = f();
            p012xc85e97e9.p093xedfae76a.y yVar = f17 instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) f17 : null;
            if (yVar != null && (mo273xed6858b4 = yVar.mo273xed6858b4()) != null) {
                mo273xed6858b4.a(new p012xc85e97e9.p093xedfae76a.v() { // from class: com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent$setupListeners$4

                    /* renamed from: d, reason: collision with root package name */
                    public boolean f245505d;

                    @Override // p012xc85e97e9.p093xedfae76a.v
                    /* renamed from: onStateChanged */
                    public void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y source, p012xc85e97e9.p093xedfae76a.m event) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStateChanged", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent$setupListeners$4");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                        l94.b0 b0Var = l94.b0.this;
                        b0Var.h();
                        event.toString();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getTraceId$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getTraceId$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                        int i18 = l94.a0.f398854a[event.ordinal()];
                        if (i18 == 1) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$cancelAutoScroll", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                            b0Var.p();
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$cancelAutoScroll", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getSnapAnimator$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                            android.animation.ValueAnimator valueAnimator = b0Var.f398857j;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getSnapAnimator$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            source.mo273xed6858b4().c(this);
                        } else if (i18 == 2) {
                            this.f245505d = true;
                            b0Var.r(false);
                        } else if (i18 == 3) {
                            if (this.f245505d) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$scheduleAutoScroll", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                                b0Var.s();
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$scheduleAutoScroll", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                            }
                            this.f245505d = false;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStateChanged", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent$setupListeners$4");
                    }
                });
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setupListeners", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
        s();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
    }

    @Override // l94.e
    public android.view.View k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBuildView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
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
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4(frameLayout.getContext(), null);
        c1163xf1deaba4.setOverScrollMode(2);
        this.f398855h = c1163xf1deaba4;
        c44.a.l();
        c44.a.l();
        frameLayout.addView(c1163xf1deaba4, new android.widget.FrameLayout.LayoutParams(-1, -1));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBuildView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
        return frameLayout;
    }

    public final void o(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("animateSnapToPx", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
        android.animation.ValueAnimator valueAnimator = this.f398857j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (ca4.n0.c(f())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(h(), "animateSnapToPx, but activity is finish");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("animateSnapToPx", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f398855h;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4 != null ? c1163xf1deaba4.getLayoutManager() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2154xd1954cdd.ui.p2155xac8f1cfd.p2156xd0e2e03f.C17827xd9ca7419 c17827xd9ca7419 = layoutManager instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2154xd1954cdd.ui.p2155xac8f1cfd.p2156xd0e2e03f.C17827xd9ca7419 ? (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2154xd1954cdd.ui.p2155xac8f1cfd.p2156xd0e2e03f.C17827xd9ca7419) layoutManager : null;
        if (c17827xd9ca7419 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("animateSnapToPx", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.e0();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getScrollPx", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
        float f18 = c17827xd9ca7419.f245517o;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getScrollPx", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
        e0Var.f391648d = f18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getScrollPx", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
        float f19 = c17827xd9ca7419.f245517o;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getScrollPx", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(f19, f17);
        ofFloat.setDuration(700L);
        ofFloat.setInterpolator(new android.view.animation.DecelerateInterpolator(1.5f));
        ofFloat.addUpdateListener(new l94.u(e0Var, this));
        ofFloat.addListener(new l94.v(this));
        ofFloat.start();
        this.f398857j = ofFloat;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("animateSnapToPx", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
    }

    public final void p() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cancelAutoScroll", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
        this.f398858k.removeCallbacks(this.f398860m);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cancelAutoScroll", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
    }

    public final void q(java.lang.String traceId) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doReport", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
        if (this.f398863p == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doReport", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFoldAdInfo", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(traceId, "traceId");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getAdInfoMap$cp", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f94.a.f342064e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getAdInfoMap$cp", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC");
        h94.a aVar = concurrentHashMap != null ? (h94.a) concurrentHashMap.get(traceId) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFoldAdInfo", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC$Companion");
        if (aVar == null || (str = aVar.e()) == null) {
            str = "";
        }
        a84.t0.a(new ca4.a(str, 3, 1570, null, java.lang.Integer.valueOf(this.f398863p), 8, null));
        this.f398863p = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doReport", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
    }

    public final void r(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetToCenter", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
        p();
        android.animation.ValueAnimator valueAnimator = this.f398857j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f398855h;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4 != null ? c1163xf1deaba4.getLayoutManager() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2154xd1954cdd.ui.p2155xac8f1cfd.p2156xd0e2e03f.C17827xd9ca7419 c17827xd9ca7419 = layoutManager instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2154xd1954cdd.ui.p2155xac8f1cfd.p2156xd0e2e03f.C17827xd9ca7419 ? (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2154xd1954cdd.ui.p2155xac8f1cfd.p2156xd0e2e03f.C17827xd9ca7419) layoutManager : null;
        if (c17827xd9ca7419 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetToCenter", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f398855h;
        java.lang.Object mo7946xf939df19 = c1163xf1deaba42 != null ? c1163xf1deaba42.mo7946xf939df19() : null;
        m94.b bVar = mo7946xf939df19 instanceof m94.b ? (m94.b) mo7946xf939df19 : null;
        if (bVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetToCenter", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
            return;
        }
        int x17 = (1073741823 - (1073741823 % bVar.x())) + (!z17 ? c17827xd9ca7419.n() : 0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        arrayList.add(java.lang.Integer.valueOf(x17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c17827xd9ca7419, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/wsfold/ui/component/WsFoldRecyclerAdComponent", "resetToCenter", "(Z)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
        int intValue2 = ((java.lang.Integer) arrayList.get(1)).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("scrollToPositionWithOffset", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
        c17827xd9ca7419.f245519q = intValue;
        c17827xd9ca7419.f245520r = intValue2;
        c17827xd9ca7419.m8087x46ac7299();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("scrollToPositionWithOffset", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
        yj0.a.f(c17827xd9ca7419, "com/tencent/mm/plugin/sns/ad/wsfold/ui/component/WsFoldRecyclerAdComponent", "resetToCenter", "(Z)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetToCenter", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
    }

    public final void s() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("scheduleAutoScroll", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
        p();
        if (this.f398863p > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("scheduleAutoScroll", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
            return;
        }
        if (ca4.n0.c(f())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(h(), "scheduleAutoScroll, but activity is finish");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("scheduleAutoScroll", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f398855h;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4 != null ? c1163xf1deaba4.mo7946xf939df19() : null;
        m94.b bVar = mo7946xf939df19 instanceof m94.b ? (m94.b) mo7946xf939df19 : null;
        if (bVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("scheduleAutoScroll", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
            return;
        }
        if (!this.f398856i && bVar.x() > 1) {
            this.f398858k.postDelayed(this.f398860m, this.f398859l);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("scheduleAutoScroll", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
    }
}
