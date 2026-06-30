package k94;

/* loaded from: classes4.dex */
public final class c implements k94.g {

    /* renamed from: a, reason: collision with root package name */
    public static final k94.c f387473a = new k94.c();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f387474b = new java.util.HashMap();

    @Override // k94.g
    public void a(java.lang.String viewId, k94.i status, double d17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onViewVisibilityChanged", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewId, "viewId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        java.util.HashMap hashMap = f387474b;
        k94.b bVar = (k94.b) hashMap.get(viewId);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int ordinal = status.ordinal();
        if (ordinal == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleRawExposure", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic");
            hashMap.put(viewId, new k94.b(false, 0L, 0L, false, 15, null));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFoldAdInfo", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC$Companion");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getAdInfoMap$cp", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC");
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = f94.a.f342064e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getAdInfoMap$cp", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC");
            h94.a aVar = concurrentHashMap != null ? (h94.a) concurrentHashMap.get(viewId) : null;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFoldAdInfo", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC$Companion");
            if (aVar == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleRawExposure", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportExpose$default", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdReportHelper");
                k94.d.b(aVar, 0, 0, 0, 0, 0);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportExpose$default", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdReportHelper");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(2113, 1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WsFoldAdExposeStatistic", "report raw exposure: viewId=".concat(viewId));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleRawExposure", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WsFoldAdExposeStatistic", "MOVE_IN: viewId=" + viewId + ", timestamp=" + currentTimeMillis + ", exposeRatio=" + d17);
            if (d17 >= 0.5d) {
                k94.b bVar2 = (k94.b) hashMap.get(viewId);
                if (bVar2 == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onViewVisibilityChanged", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic");
                    return;
                } else if (!bVar2.a()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startValidExpose", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
                    bVar2.f387469a = true;
                    bVar2.f387470b = java.lang.System.currentTimeMillis();
                    bVar2.f387471c = 0L;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startValidExpose", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
                }
            }
        } else if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 4) {
                    if (bVar == null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onViewVisibilityChanged", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic");
                        return;
                    }
                    if (bVar.a()) {
                        b(viewId, bVar, currentTimeMillis);
                    }
                    hashMap.remove(viewId);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WsFoldAdExposeStatistic", "REMOVED: viewId=" + viewId + ", timestamp=" + currentTimeMillis);
                }
            } else {
                if (bVar == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onViewVisibilityChanged", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic");
                    return;
                }
                boolean a17 = bVar.a();
                boolean z17 = d17 >= 0.5d;
                if (!a17 && z17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startValidExpose", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
                    bVar.f387469a = true;
                    bVar.f387470b = java.lang.System.currentTimeMillis();
                    bVar.f387471c = 0L;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startValidExpose", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WsFoldAdExposeStatistic", "RATIO_CHANGED: viewId=" + viewId + ", became valid, ratio=" + d17);
                } else if (a17 && !z17) {
                    b(viewId, bVar, currentTimeMillis);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WsFoldAdExposeStatistic", "RATIO_CHANGED: viewId=" + viewId + ", became invalid, ratio=" + d17);
                }
            }
        } else {
            if (bVar == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onViewVisibilityChanged", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic");
                return;
            }
            if (bVar.a()) {
                b(viewId, bVar, currentTimeMillis);
            }
            hashMap.remove(viewId);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WsFoldAdExposeStatistic", "INVISIBLE: viewId=" + viewId + ", timestamp=" + currentTimeMillis);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onViewVisibilityChanged", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic");
    }

    public final void b(java.lang.String traceId, k94.b bVar, long j17) {
        boolean z17;
        int i17;
        int i18;
        java.lang.Integer num;
        java.lang.Integer num2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleValidExposureEnd", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic");
        bVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getValidExposureStartTime", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
        long j18 = bVar.f387470b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getValidExposureStartTime", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
        long j19 = 0;
        if (j18 > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getValidExposureStartTime", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
            long j27 = bVar.f387470b;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getValidExposureStartTime", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
            j19 = j17 - j27;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAccumulatedDuration", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
        long j28 = bVar.f387471c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAccumulatedDuration", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
        long j29 = j28 + j19;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleValidExposureEnd: viewId=");
        sb6.append(traceId);
        sb6.append(", currentDuration=");
        sb6.append(j19);
        sb6.append("ms, accumulatedDuration=");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAccumulatedDuration", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
        long j37 = bVar.f387471c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAccumulatedDuration", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
        sb6.append(j37);
        sb6.append("ms, totalDuration=");
        sb6.append(j29);
        sb6.append("ms");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WsFoldAdExposeStatistic", sb6.toString());
        if (j29 >= 1000) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getReported", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
            boolean z18 = bVar.f387472d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getReported", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
            if (z18) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(2113, 5);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WsFoldAdExposeStatistic", "view id = " + traceId + ", total duration > 1s, already reported!!!");
                bVar.b();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleValidExposureEnd", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic");
                return;
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("needCheck1s", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic");
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_ws_fold_ad_expose_check_1s, 0) == 1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("needCheck1s", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic");
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                java.lang.Object m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
                if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
                    ca4.q.c("WsFoldAdExposeStatistic", p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813));
                }
                p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("needCheck1s", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic");
                z17 = false;
            }
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(2113, 4);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WsFoldAdExposeStatistic", "view id = " + traceId + ", need check but < 1s");
                bVar.b();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleValidExposureEnd", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic");
                return;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFoldAdInfo", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(traceId, "traceId");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getAdInfoMap$cp", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f94.a.f342064e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getAdInfoMap$cp", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC");
        h94.a aVar = concurrentHashMap != null ? (h94.a) concurrentHashMap.get(traceId) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFoldAdInfo", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC$Companion");
        if (aVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getReported", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
            boolean z19 = bVar.f387472d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getReported", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
            if (!z19) {
                k94.f fVar = k94.f.f387479a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVideoPlayInfo", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic");
                k94.e eVar = (k94.e) k94.f.f387480b.get(traceId);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoPlayInfo", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic");
                int i19 = (int) j29;
                int a17 = eVar != null ? eVar.a() + 1 : 0;
                if (eVar != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTotalPlayTime", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic$VideoPlayInfo");
                    int i27 = (eVar.f387476a * eVar.f387478c) + eVar.f387477b;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTotalPlayTime", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic$VideoPlayInfo");
                    i17 = i27;
                } else {
                    i17 = 0;
                }
                if (eVar != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVideoDurationMs", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic$VideoPlayInfo");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoDurationMs", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic$VideoPlayInfo");
                    i18 = eVar.f387478c;
                } else {
                    i18 = 0;
                }
                k94.d.b(aVar, 1, i19, a17, i17, i18);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setReported", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
                bVar.f387472d = true;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setReported", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("report valid exposure: viewId=");
                sb7.append(traceId);
                sb7.append(", totalDuration=");
                sb7.append(j29);
                sb7.append(",playCount = ");
                sb7.append(eVar != null ? java.lang.Integer.valueOf(eVar.a() + 1) : null);
                sb7.append(", playTotalTime = ");
                if (eVar != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTotalPlayTime", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic$VideoPlayInfo");
                    int i28 = (eVar.f387476a * eVar.f387478c) + eVar.f387477b;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTotalPlayTime", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic$VideoPlayInfo");
                    num = java.lang.Integer.valueOf(i28);
                } else {
                    num = null;
                }
                sb7.append(num);
                sb7.append(",videoTotalTime = ");
                if (eVar != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVideoDurationMs", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic$VideoPlayInfo");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoDurationMs", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic$VideoPlayInfo");
                    num2 = java.lang.Integer.valueOf(eVar.f387478c);
                } else {
                    num2 = null;
                }
                sb7.append(num2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WsFoldAdExposeStatistic", sb7.toString());
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(2113, j29 >= 1000 ? 2 : 3);
            }
        }
        bVar.b();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleValidExposureEnd", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic");
    }
}
