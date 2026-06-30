package r44;

/* loaded from: classes4.dex */
public final class f extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.y4 {

    /* renamed from: i */
    public static java.lang.ref.WeakReference f451091i = null;

    /* renamed from: m */
    public static boolean f451092m = true;

    /* renamed from: n */
    public static boolean f451093n = true;

    /* renamed from: o */
    public static boolean f451094o;

    /* renamed from: d */
    public final java.lang.String f451095d;

    /* renamed from: e */
    public boolean f451096e;

    /* renamed from: f */
    public boolean f451097f;

    /* renamed from: g */
    public final t44.o f451098g;

    /* renamed from: h */
    public a94.l f451099h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f451095d = "SnsAdBizUIC";
        t44.o oVar = new t44.o(activity);
        s44.d dVar = new s44.d();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("attachLayoutBuilder", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdLayoutCachePool");
        oVar.f497055c = dVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("attachLayoutBuilder", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdLayoutCachePool");
        this.f451098g = oVar;
    }

    public static final /* synthetic */ boolean O6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getSIsEnablePullSession$cp", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
        boolean z17 = f451092m;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getSIsEnablePullSession$cp", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
        return z17;
    }

    public static final /* synthetic */ java.lang.String P6(r44.f fVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getTAG$p", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
        java.lang.String str = fVar.f451095d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getTAG$p", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
        return str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.y4
    public void F3() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScrollIdle", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrollIdle", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
    }

    public final boolean Q6(a94.l reqController, float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkMultipleShakeAd", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqController, "reqController");
        a94.l lVar = this.f451099h;
        java.lang.String str = this.f451095d;
        if (lVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "no other shakable ad");
            this.f451099h = reqController;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkMultipleShakeAd", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lVar, reqController)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "same shakable ad");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkMultipleShakeAd", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
            return true;
        }
        a94.l lVar2 = this.f451099h;
        boolean f18 = lVar2 != null ? lVar2.f() : false;
        if (f18 && !reqController.f()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "other is highPriorityAd");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkMultipleShakeAd", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
            return false;
        }
        if (!f18 && reqController.f()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "other is lowPriorityAd");
            a94.l lVar3 = this.f451099h;
            if (lVar3 != null) {
                lVar3.b();
            }
            this.f451099h = reqController;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkMultipleShakeAd", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
            return true;
        }
        a94.l lVar4 = this.f451099h;
        float h17 = lVar4 != null ? lVar4.h() : -1.0f;
        a94.l lVar5 = this.f451099h;
        int mo877xa86cd69f = lVar5 != null ? lVar5.mo877xa86cd69f() : Integer.MAX_VALUE;
        reqController.mo877xa86cd69f();
        java.lang.Float.compare(h17, f17);
        if (h17 > f17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "smaller ratio than other");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkMultipleShakeAd", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
            return false;
        }
        if (java.lang.Float.compare(h17, f17) != 0) {
            a94.l lVar6 = this.f451099h;
            if (lVar6 != null) {
                lVar6.b();
            }
            this.f451099h = reqController;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkMultipleShakeAd", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
            return true;
        }
        if (reqController.mo877xa86cd69f() >= mo877xa86cd69f) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkMultipleShakeAd", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
            return false;
        }
        a94.l lVar7 = this.f451099h;
        if (lVar7 != null) {
            lVar7.b();
        }
        this.f451099h = reqController;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkMultipleShakeAd", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
        return true;
    }

    public final void R6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("observeUIRefresh", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
        boolean z17 = f451092m;
        java.lang.String str = this.f451095d;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "observeUIRefresh, isEnableSession=false");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("observeUIRefresh", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
            return;
        }
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2189x2eefaa.C18246x9a0ff9cd.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "observeUIRefresh");
        p3325xe03a0797.p3326xc267989b.l.d(mo144225x95f74600(), null, null, new r44.d(this, (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2189x2eefaa.C18246x9a0ff9cd) a17, null), 3, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("observeUIRefresh", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onConfigurationChanged */
    public void mo2276x50e1c15d(android.content.res.Configuration newConfig) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onConfigurationChanged", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        super.mo2276x50e1c15d(newConfig);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f451095d, "onConfigurationChanged, hash=" + hashCode());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onConfigurationChanged", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f451095d, "onCreate");
        try {
            R6();
        } catch (java.lang.Throwable th6) {
            ca4.q.c("SnsAdSession_observeUIRefresh", th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateBefore */
    public void mo2277xb2f1ab1a(android.os.Bundle bundle) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreateBefore", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
        super.mo2277xb2f1ab1a(bundle);
        this.f451097f = m80379x76847179() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.ActivityC18203x35bf69b5;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isEnableAdPullSession", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
        boolean z18 = this.f451097f;
        java.lang.String str = this.f451095d;
        boolean z19 = true;
        if (z18) {
            int u07 = ca4.m0.u0(e42.c0.clicfg_ad_enable_pull_session_record, 1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "isEnableAdPullSession=" + u07);
            z17 = u07 > 0;
            if (!z17) {
                jx3.f.INSTANCE.t(2097, 8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isEnableAdPullSession", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "isEnableAdPullSession=false, old timeline");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isEnableAdPullSession", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
            z17 = false;
        }
        f451092m = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isEnableDeleteConsecutiveAdAfterLoadPage", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
        int u08 = ca4.m0.u0(e42.c0.clicfg_ad_enable_delete_ad_after_load_page, 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f451095d, "isEnableDeleteConsecutiveAdAfterLoadPage=" + u08);
        if (!(u08 > 0)) {
            jx3.f.INSTANCE.t(2097, 37);
        }
        boolean z27 = u08 > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isEnableDeleteConsecutiveAdAfterLoadPage", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
        f451093n = z27;
        this.f451096e = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f451095d, "onCreateBefore, isNewTimeLineUI=" + this.f451097f + ", isEnableSession=" + f451092m + ", hash=" + hashCode() + ", context=" + m80379x76847179().hashCode());
        try {
            java.lang.ref.WeakReference weakReference = f451091i;
            android.content.Context context = weakReference != null ? (android.content.Context) weakReference.get() : null;
            if (context != null) {
                ca4.n0.b(2097, 11);
                java.lang.String str2 = this.f451095d;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCreateBefore, context maybe leaked, new=");
                android.app.Activity m80379x76847179 = m80379x76847179();
                sb6.append(m80379x76847179 != null ? java.lang.Integer.valueOf(m80379x76847179.hashCode()) : null);
                sb6.append(", old=");
                sb6.append(java.lang.Integer.valueOf(context.hashCode()));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, sb6.toString());
            }
            if (f451092m) {
                f451091i = m80379x76847179() != null ? new java.lang.ref.WeakReference(m80379x76847179()) : null;
                r34.e.f450531a.d();
            } else {
                f451091i = null;
            }
            if (this.f451097f) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1697, 60);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doPreloadWhenIdle", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
                android.os.Looper.myQueue().addIdleHandler(new r44.b(this));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPreloadWhenIdle", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1697, 61);
            }
            if (this.f451097f) {
                z19 = false;
            }
            synchronized (l44.h3.class) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOldSnsTimeLine", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                l44.h3.f397698a = z19;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOldSnsTimeLine", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
            }
            android.app.Activity m80379x768471792 = m80379x76847179();
            if (m80379x768471792 != null) {
                l44.i.b(m80379x768471792);
            }
            p94.g0 g0Var = (p94.g0) i95.n0.c(p94.g0.class);
            if (g0Var != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f451095d, "init snsAdService, hash=" + g0Var.hashCode());
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c("SnsAdBizUIC_onCreateBefore", th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreateBefore", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
    }

    /* JADX WARN: Finally extract failed */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f451095d, "onDestroy, hash=" + hashCode());
        f451091i = null;
        this.f451096e = true;
        this.f451099h = null;
        if (!this.f451097f) {
            t44.o oVar = this.f451098g;
            oVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clear", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdLayoutCachePool");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseAdLayoutCachePool", "clear");
            java.util.LinkedList linkedList = (java.util.LinkedList) oVar.f497054b;
            if (linkedList.size() != 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46354x528304bf, 6);
            }
            linkedList.clear();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clear", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdLayoutCachePool");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportAdCount", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
        if (f451094o) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportAdCount", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
        } else {
            f451094o = true;
            if (java.lang.System.currentTimeMillis() % 10 != 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportAdCount", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
            } else {
                ((ku5.t0) ku5.t0.f394148d).q(new r44.e(this));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportAdCount", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
            }
        }
        l44.i iVar = l44.i.f397701a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clear", "com.tencent.mm.plugin.sns.ad.helper.AdClickCoordinateReportHelper");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdClickCoordinateHelper", "clear");
        l44.i.f397704d.clear();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clear", "com.tencent.mm.plugin.sns.ad.helper.AdClickCoordinateReportHelper");
        n74.u0 u0Var = n74.u0.f416970a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clearPreRenderCache", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWeappPreRenderHelper");
        try {
            synchronized (n74.u0.f416972c) {
                try {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("clearPreRenderCache, mPreRenderCache is ");
                    n74.s0 s0Var = n74.u0.f416971b;
                    sb6.append(s0Var != null ? s0Var.m149188x9616526c() : null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdWeappPreRenderHelper", sb6.toString());
                    n74.u0.f416971b = null;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearPreRenderCache", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWeappPreRenderHelper");
                    throw th6;
                }
            }
        } catch (java.lang.Throwable th7) {
            ca4.q.c("AdWeappPreRenderHelper", th7);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearPreRenderCache", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWeappPreRenderHelper");
        java.util.Set set = a84.q0.f83882a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clearAdChainExposure", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChainHelper");
        a84.q0.f83882a.clear();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearAdChainExposure", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChainHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStop", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
        super.mo2287xc39f8281();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f451095d, "onStop, hash=" + hashCode());
        if (f451092m) {
            r34.e.f450531a.f();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStop", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
    }
}
