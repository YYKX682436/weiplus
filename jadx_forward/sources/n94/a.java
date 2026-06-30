package n94;

/* loaded from: classes4.dex */
public final class a extends android.widget.FrameLayout implements tc4.s0 {

    /* renamed from: d, reason: collision with root package name */
    public h94.c f417453d;

    /* renamed from: e, reason: collision with root package name */
    public l94.n f417454e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -2));
    }

    @Override // tc4.s0
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hideDivider", "com.tencent.mm.plugin.sns.ad.wsfold.ui.feed.WsFoldAdItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hideDivider", "com.tencent.mm.plugin.sns.ad.wsfold.ui.feed.WsFoldAdItem");
    }

    @Override // tc4.s0
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("realTimeUpdate", "com.tencent.mm.plugin.sns.ad.wsfold.ui.feed.WsFoldAdItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("realTimeUpdate", "com.tencent.mm.plugin.sns.ad.wsfold.ui.feed.WsFoldAdItem");
    }

    @Override // tc4.s0
    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("viewRecycleInMain", "com.tencent.mm.plugin.sns.ad.wsfold.ui.feed.WsFoldAdItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("viewRecycleInMain", "com.tencent.mm.plugin.sns.ad.wsfold.ui.feed.WsFoldAdItem");
    }

    @Override // tc4.s0
    public boolean f(in5.s0 holder, zc4.b item, int i17) {
        h94.a r17;
        l94.n nVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("measure", "com.tencent.mm.plugin.sns.ad.wsfold.ui.feed.WsFoldAdItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        xc4.p n17 = item.n();
        java.lang.String str = null;
        h94.c cVar = n17 instanceof h94.c ? (h94.c) n17 : null;
        if (cVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("measure", "com.tencent.mm.plugin.sns.ad.wsfold.ui.feed.WsFoldAdItem");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isItemChanged", "com.tencent.mm.plugin.sns.ad.wsfold.ui.feed.WsFoldAdItem");
        h94.a r18 = cVar.r1();
        java.lang.String d17 = r18 != null ? r18.d() : null;
        boolean z17 = false;
        if (d17 == null || d17.length() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isItemChanged", "com.tencent.mm.plugin.sns.ad.wsfold.ui.feed.WsFoldAdItem");
        } else {
            h94.a r19 = cVar.r1();
            java.lang.String d18 = r19 != null ? r19.d() : null;
            h94.c cVar2 = this.f417453d;
            if (cVar2 != null && (r17 = cVar2.r1()) != null) {
                str = r17.d();
            }
            z17 = !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(d18, str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isItemChanged", "com.tencent.mm.plugin.sns.ad.wsfold.ui.feed.WsFoldAdItem");
        }
        this.f417453d = cVar;
        if (this.f417454e == null) {
            android.content.Context context = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            l94.n nVar2 = new l94.n(context);
            this.f417454e = nVar2;
            addView(nVar2.d());
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WsFoldAdItem", "item changed");
            h94.a r110 = cVar.r1();
            if (r110 != null && (nVar = this.f417454e) != null) {
                nVar.c(r110);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("measure", "com.tencent.mm.plugin.sns.ad.wsfold.ui.feed.WsFoldAdItem");
        return z17;
    }

    @Override // tc4.s0
    public java.lang.Object g(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onViewRecycled", "com.tencent.mm.plugin.sns.ad.wsfold.ui.feed.WsFoldAdItem");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onViewRecycled", "com.tencent.mm.plugin.sns.ad.wsfold.ui.feed.WsFoldAdItem");
        return f0Var;
    }

    @Override // tc4.s0
    /* renamed from: getImproveListItem */
    public zc4.b mo70841xad4bb233() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getImproveListItem", "com.tencent.mm.plugin.sns.ad.wsfold.ui.feed.WsFoldAdItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImproveListItem", "com.tencent.mm.plugin.sns.ad.wsfold.ui.feed.WsFoldAdItem");
        return null;
    }

    @Override // tc4.s0
    public java.lang.Object h(in5.s0 s0Var, zc4.b bVar, int i17, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.wsfold.ui.feed.WsFoldAdItem");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.wsfold.ui.feed.WsFoldAdItem");
        return f0Var;
    }

    @Override // tc4.s0
    /* renamed from: name */
    public java.lang.String mo70844x337a8b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "com.tencent.mm.plugin.sns.ad.wsfold.ui.feed.WsFoldAdItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "com.tencent.mm.plugin.sns.ad.wsfold.ui.feed.WsFoldAdItem");
        return "WsFoldAdItem";
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        h94.a r17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAttachedToWindow", "com.tencent.mm.plugin.sns.ad.wsfold.ui.feed.WsFoldAdItem");
        super.onAttachedToWindow();
        h94.c cVar = this.f417453d;
        if (cVar != null && (r17 = cVar.r1()) != null) {
            android.content.Context context = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            f94.a aVar = (f94.a) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(f94.a.class);
            aVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAdAdded", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC");
            if (getParent() == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAdAdded", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC");
            } else {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = f94.a.f342064e;
                if (concurrentHashMap != null) {
                }
                java.lang.String viewId = r17.d();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("registerView$default", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
                k94.j jVar = aVar.f342065d;
                jVar.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("registerView", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewId, "viewId");
                if (viewId.length() == 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("registerView", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
                } else {
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.vpm);
                    java.util.HashMap hashMap = jVar.f387494a;
                    java.lang.Object obj = hashMap.get(viewId);
                    if (obj == null) {
                        obj = new k94.h(viewId, this, viewGroup, null);
                        hashMap.put(viewId, obj);
                    }
                    k94.h hVar = (k94.h) obj;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateView", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager$ViewTrackingItem");
                    hVar.f387485e = new java.lang.ref.WeakReference(this);
                    hVar.f387486f = new java.lang.ref.WeakReference(viewGroup);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateView", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager$ViewTrackingItem");
                    jVar.d(hVar);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("registerView", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("registerView$default", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
                k94.c cVar2 = k94.c.f387473a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAdAdded", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic");
                k94.c.f387474b.put(r17.d(), new k94.b(false, 0L, 0L, false, 15, null));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAdAdded", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAdAdded", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAttachedToWindow", "com.tencent.mm.plugin.sns.ad.wsfold.ui.feed.WsFoldAdItem");
    }
}
