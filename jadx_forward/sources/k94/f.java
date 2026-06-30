package k94;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final k94.f f387479a = new k94.f();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f387480b = new java.util.HashMap();

    public final void a(java.lang.String traceId) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clearVideoPlayInfo", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(traceId, "traceId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WsFoldAdVideoStatistic", "clear video play info, id = ".concat(traceId));
        k94.e eVar = (k94.e) f387480b.get(traceId);
        if (eVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPlayCount", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic$VideoPlayInfo");
            eVar.f387476a = 0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPlayCount", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic$VideoPlayInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPlayDurationMs", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic$VideoPlayInfo");
            eVar.f387477b = 0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPlayDurationMs", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic$VideoPlayInfo");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearVideoPlayInfo", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic");
    }

    public final void b(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAdVideoComplete", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic");
        if (!(str == null || str.length() == 0)) {
            java.util.HashMap hashMap = f387480b;
            k94.e eVar = (k94.e) hashMap.get(str);
            if ((eVar != null ? java.lang.Integer.valueOf(eVar.a()) : null) != null) {
                k94.e eVar2 = (k94.e) hashMap.get(str);
                if (eVar2 != null) {
                    k94.e eVar3 = (k94.e) hashMap.get(str);
                    int a17 = eVar3 != null ? eVar3.a() : 0;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPlayCount", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic$VideoPlayInfo");
                    eVar2.f387476a = a17 + 1;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPlayCount", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic$VideoPlayInfo");
                }
                k94.e eVar4 = (k94.e) hashMap.get(str);
                if (eVar4 != null) {
                    eVar4.a();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAdVideoComplete", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic");
                return;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAdVideoComplete", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic");
    }

    public final void c(h94.a foldAdInfo, r45.fb6 videoInfo) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoAdAdded", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(foldAdInfo, "foldAdInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoInfo, "videoInfo");
        java.util.HashMap hashMap = f387480b;
        if (hashMap.get(foldAdInfo.d()) == null) {
            foldAdInfo.d();
            hashMap.put(foldAdInfo.d(), new k94.e(0, 0, videoInfo.f455721n));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoAdAdded", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic");
    }

    public final void d(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAdPlayTime", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic");
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAdPlayTime", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic");
            return;
        }
        k94.e eVar = (k94.e) f387480b.get(str);
        if (eVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPlayDurationMs", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic$VideoPlayInfo");
            eVar.f387477b = i17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPlayDurationMs", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic$VideoPlayInfo");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAdPlayTime", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic");
    }
}
