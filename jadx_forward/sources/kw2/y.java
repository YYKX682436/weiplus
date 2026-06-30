package kw2;

/* loaded from: classes15.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f394648a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f394649b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f394650c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public long f394651d;

    /* renamed from: e, reason: collision with root package name */
    public long f394652e;

    /* renamed from: f, reason: collision with root package name */
    public long f394653f;

    /* renamed from: g, reason: collision with root package name */
    public long f394654g;

    public static final void a(kw2.y yVar, java.lang.String str, kw2.h hVar, java.lang.String str2) {
        boolean z17;
        yVar.getClass();
        boolean z18 = hVar.f394552c;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = yVar.f394650c;
        if (z18) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList<kw2.e> arrayList2 = hVar.f394555f;
            for (java.lang.Object obj : arrayList2) {
                kw2.e eVar = (kw2.e) obj;
                if (((int) eVar.f394488a) == 2 || !(z17 = eVar.B) || (z17 && eVar.C)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.size() == arrayList2.size()) {
                concurrentHashMap.remove(str);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNetworkFlowReport", "PLAY_checkPlaySessionReport " + str2 + " size:" + arrayList.size());
                for (kw2.e eVar2 : arrayList2) {
                    if (((int) eVar2.f394488a) == 2 || !eVar2.B) {
                        eVar2.f394497j = 0L;
                        eVar2.f394498k = "";
                        eVar2.f394499l = "";
                    }
                    long j17 = eVar2.f394506s - eVar2.f394505r;
                    eVar2.f394503p = j17;
                    eVar2.f394502o = j17 - eVar2.P;
                    eVar2.f394504q = cu2.x.c(cu2.x.f303982a, str, false, false, false, 14, null).f68985x2928e136;
                    eVar2.f394501n = eVar2.R.size() * 100;
                    yVar.f(eVar2, "checkPlaySessionReport#" + str2);
                }
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "onPlayerStop")) {
                java.util.Iterator it = kz5.n0.q0(arrayList2, arrayList).iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderNetworkFlowReport", "PLAY_checkPlaySessionReport " + str2 + " come stop but item" + ((kw2.e) it.next()));
                }
            }
        }
        if (concurrentHashMap.size() > 200) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderNetworkFlowReport", "checkIfDeleteSomeItem leak 200");
            concurrentHashMap.clear();
        }
    }

    public static final void b(kw2.y yVar, kw2.h hVar, kw2.e eVar, so2.i3 i3Var, long j17, long j18, boolean z17, kw2.f fVar, java.lang.String str) {
        yVar.getClass();
        eVar.f394508u = j17;
        eVar.f394506s = c01.id.a();
        eVar.A = z17;
        if (j18 > 0) {
            eVar.f394494g = j18;
            eVar.f394493f = j18 / 1000;
        }
        eVar.f394511x = c01.id.a();
        if (((int) eVar.f394488a) == 2 || !eVar.B) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNetworkFlowReport", "PLAY_handleOnPlayItemClose#closeitem local play " + eVar.Q + "  " + str);
            kw2.e.V.d(eVar, i3Var);
            return;
        }
        if (eVar.C) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNetworkFlowReport", "PLAY_handleOnPlayItemClose " + eVar.Q + ' ' + str + " return for stopDownloaderHit.");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNetworkFlowReport", "PLAY_handleOnPlayItemClose " + eVar.Q + ' ' + str + " observer:" + fVar + '.');
        if (fVar != null) {
            fVar.a(new kw2.k(eVar, str, yVar, z17, hVar));
        }
    }

    public final void c(long j17) {
        this.f394651d += j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNetworkFlowReport", "FinderNetworkFlowReport.checkTotalSize finderTotalDownloadSize cdr " + com.p314xaae8f345.mm.sdk.p2603x2137b148.j8.f274322t + ':' + e() + ':' + this.f394651d + ':' + this.f394652e + " percent:" + ((((float) this.f394652e) * 1.0f) / ((float) this.f394651d)) + " gap size:" + (this.f394651d - this.f394652e));
    }

    public final java.lang.String d(long j17) {
        return j17 == 1 ? "预下载" : j17 == 2 ? "本地播放" : j17 == 3 ? "边下边播" : j17 == 4 ? "本地预渲染" : j17 == 5 ? "在线预渲染" : "未知非法";
    }

    public final long e() {
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).getClass();
        return com.p314xaae8f345.mm.p947xba6de98f.l1.f152574y;
    }

    public final void f(kw2.e eVar, java.lang.String str) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6603xa4bf3386 c6603xa4bf3386 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6603xa4bf3386();
        c6603xa4bf3386.f139504d = eVar.f394488a;
        c6603xa4bf3386.f139505e = eVar.f394489b;
        c6603xa4bf3386.f139506f = eVar.f394490c;
        c6603xa4bf3386.f139507g = eVar.f394491d;
        c6603xa4bf3386.f139508h = c6603xa4bf3386.b("FeedId", eVar.f394492e, true);
        c6603xa4bf3386.f139509i = eVar.f394493f;
        c6603xa4bf3386.f139510j = eVar.f394494g;
        c6603xa4bf3386.f139511k = eVar.f394495h;
        c6603xa4bf3386.f139512l = c6603xa4bf3386.b("VideoFormat", eVar.f394496i, true);
        c6603xa4bf3386.f139513m = eVar.f394497j;
        c6603xa4bf3386.f139514n = c6603xa4bf3386.b("DownloadStartTime", eVar.f394498k, true);
        c6603xa4bf3386.f139515o = c6603xa4bf3386.b("DownloadEndTime", eVar.f394499l, true);
        c6603xa4bf3386.f139516p = eVar.f394500m;
        c6603xa4bf3386.f139517q = eVar.f394501n;
        c6603xa4bf3386.f139518r = eVar.f394502o;
        c6603xa4bf3386.f139519s = eVar.f394503p;
        c6603xa4bf3386.f139520t = eVar.f394504q;
        c6603xa4bf3386.f139521u = c6603xa4bf3386.b("PlayStartTime", java.lang.String.valueOf(eVar.f394505r), true);
        c6603xa4bf3386.f139522v = c6603xa4bf3386.b("PlayEndTime", java.lang.String.valueOf(eVar.f394506s), true);
        c6603xa4bf3386.f139523w = eVar.f394507t;
        c6603xa4bf3386.f139524x = eVar.f394508u;
        c6603xa4bf3386.f139526z = com.p314xaae8f345.mm.sdk.p2603x2137b148.j8.f274322t - this.f394654g;
        c6603xa4bf3386.f139525y = e() - this.f394653f;
        c6603xa4bf3386.A = c6603xa4bf3386.b("NetConnInfo", eVar.T, true);
        c6603xa4bf3386.C = c6603xa4bf3386.b("ByPass", r26.i0.v(eVar.U, ",", ";", false, 4, null), true);
        this.f394653f = e();
        this.f394654g = com.p314xaae8f345.mm.sdk.p2603x2137b148.j8.f274322t;
        c6603xa4bf3386.k();
        if (eVar.f394488a == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderNetworkFlowReport", "FinderNetworkFlowReport.checkValidItem invalid actionType " + eVar);
        }
        if (eVar.f394489b == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderNetworkFlowReport", "FinderNetworkFlowReport.checkValidItem invalid downloadType " + eVar);
        }
        if (eVar.f394495h <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderNetworkFlowReport", "FinderNetworkFlowReport.checkValidItem invalid fileSize:" + eVar.f394495h + ' ' + eVar);
        }
        if (eVar.f394497j < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderNetworkFlowReport", "FinderNetworkFlowReport.checkValidItem invalid downloadSize:" + eVar.f394497j + ' ' + eVar);
        }
        if (eVar.f394497j - eVar.f394495h > 1024) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderNetworkFlowReport", "FinderNetworkFlowReport.checkValidItem invalid gap size:" + (eVar.f394497j - eVar.f394495h) + ' ' + eVar);
        }
        this.f394652e += eVar.f394497j;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNetworkFlowReport", "checkTotalSize finderTotalReportSize wcdr " + com.p314xaae8f345.mm.sdk.p2603x2137b148.j8.f274322t + ':' + e() + ':' + this.f394651d + ':' + this.f394652e + " percent:" + ((((float) this.f394652e) * 1.0f) / ((float) this.f394651d)) + " gap size:" + (this.f394651d - this.f394652e));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNetworkFlowReport", "FinderNetworkFlowReport.handleReport " + d(eVar.f394488a) + ' ' + eVar.f394512y + " ftpp:" + eVar.Q + " mediaId:" + eVar.f394509v + " recordMs:" + (eVar.f394511x - eVar.f394510w) + ' ' + str + ' ' + g() + " downloadReportData:" + eVar);
    }

    public final java.lang.String g() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f394650c;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            if (((kw2.h) entry.getValue()).f394553d) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry2 : concurrentHashMap.entrySet()) {
            if (!((kw2.h) entry2.getValue()).f394553d) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        return "T:" + concurrentHashMap.size() + " P:" + this.f394648a.size() + " R:" + this.f394649b.size() + " L:" + linkedHashMap.size() + " O:" + linkedHashMap2.size();
    }

    public final void h(java.lang.String mediaId, cs2.p pVar, so2.i3 cache) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cache, "cache");
        if (pVar != null) {
            long j17 = pVar.f303622f2;
            ek4.b taskContext = pVar.f303620d2;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskContext, "taskContext");
            pm0.v.O("FinderNetworkFlowReport_Thread", new kw2.v(j17, mediaId, taskContext, cache, this));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderNetworkFlowReport", "PRELOAD_startPreload mediaId:" + mediaId + " return for result is null  size:" + this.f394648a.size() + " list:");
    }

    public final void i(java.lang.String mediaId, dn.h hVar, java.lang.String invokeSource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeSource, "invokeSource");
        if (hVar != null) {
            pm0.v.O("FinderNetworkFlowReport_Thread", new kw2.x(this, mediaId, invokeSource, hVar));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderNetworkFlowReport", "PRELOAD_stopPreload mediaId:" + mediaId + ' ' + invokeSource + " return for result is null  size:" + this.f394648a.size() + " list:");
    }
}
