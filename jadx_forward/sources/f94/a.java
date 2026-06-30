package f94;

/* loaded from: classes4.dex */
public final class a extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd.a {

    /* renamed from: e, reason: collision with root package name */
    public static java.util.concurrent.ConcurrentHashMap f342064e;

    /* renamed from: d, reason: collision with root package name */
    public final k94.j f342065d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f342065d = new k94.j(m80379x76847179());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd.a
    public void O6(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.x1 struct, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScrollStateChanged", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(struct, "struct");
        if (i17 == 0) {
            this.f342065d.c(false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrollStateChanged", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC");
        f342064e = new java.util.concurrent.ConcurrentHashMap();
        this.f342065d.a(k94.c.f387473a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC");
        k94.j jVar = this.f342065d;
        jVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
        java.util.HashMap hashMap = jVar.f387494a;
        java.util.Collection<k94.h> values = hashMap.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        for (k94.h hVar : values) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hVar);
            k94.j.f(jVar, hVar, k94.i.f387492h, 0.0d, 4, null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clear", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager$ViewTrackingItem");
            hVar.f387485e.clear();
            hVar.f387486f.clear();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clear", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager$ViewTrackingItem");
        }
        hashMap.clear();
        ((java.util.ArrayList) jVar.f387495b).clear();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WsFoldAdViewVisibilityManager", "cleared");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
        k94.c cVar = k94.c.f387473a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic");
        k94.c.f387474b.clear();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic");
        k94.f fVar = k94.f.f387479a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic");
        k94.f.f387480b.clear();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic");
        f342064e = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC");
        super.mo2281xb01dfb57();
        k94.c cVar = k94.c.f387473a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic");
        for (java.util.Map.Entry entry : k94.c.f387474b.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            k94.b bVar = (k94.b) entry.getValue();
            if (bVar.a()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pauseValidExpose", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
                bVar.f387471c += java.lang.System.currentTimeMillis() - bVar.f387470b;
                bVar.f387470b = 0L;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pauseValidExpose", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WsFoldAdExposeStatistic", "onPause: viewId=" + str);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC");
        k94.c cVar = k94.c.f387473a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WsFoldAdExposeStatistic", "onResume");
        for (java.util.Map.Entry entry : k94.c.f387474b.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            k94.b bVar = (k94.b) entry.getValue();
            if (bVar.a()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resumeValidExpose", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
                bVar.f387470b = java.lang.System.currentTimeMillis();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resumeValidExpose", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onResume: viewId=");
                sb6.append(str);
                sb6.append(", duration =");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAccumulatedDuration", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
                long j17 = bVar.f387471c;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAccumulatedDuration", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
                sb6.append(j17);
                sb6.append("ms");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WsFoldAdExposeStatistic", sb6.toString());
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd.a
    /* renamed from: onScrolled */
    public void mo71347x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScrolled", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        this.f342065d.c(true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrolled", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC");
    }
}
