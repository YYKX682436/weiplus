package ta4;

/* loaded from: classes15.dex */
public final class u0 {

    /* renamed from: b */
    public static final boolean f498372b;

    /* renamed from: c */
    public static final boolean f498373c;

    /* renamed from: a */
    public static final ta4.u0 f498371a = new ta4.u0();

    /* renamed from: d */
    public static final java.util.concurrent.ConcurrentLinkedDeque f498374d = new java.util.concurrent.ConcurrentLinkedDeque();

    /* renamed from: e */
    public static final java.lang.Object f498375e = new java.lang.Object();

    /* renamed from: f */
    public static final java.lang.Object f498376f = new java.lang.Object();

    /* renamed from: g */
    public static java.lang.String f498377g = "";

    /* renamed from: h */
    public static int f498378h = -1;

    static {
        h62.d dVar = (h62.d) ((e42.e0) i95.n0.c(e42.e0.class));
        f498372b = dVar.fj(e42.d0.clicfg_sns_image_report_normal, false);
        f498373c = dVar.fj(e42.d0.clicfg_sns_image_report_control, true);
    }

    public static final void a(ta4.u0 u0Var, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$checkFlushReport", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        u0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkFlushReport", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = f498374d;
        if (concurrentLinkedDeque.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkFlushReport", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        } else {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            int max = java.lang.Math.max(50, concurrentLinkedDeque.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Image.SnsImageLoadReporter", "checkFlushReport, size:" + concurrentLinkedDeque.size() + ", limit:" + max);
            if (concurrentLinkedDeque.size() > max) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkFlushReport", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
            }
            do {
                ta4.a aVar = (ta4.a) kz5.n0.Y(concurrentLinkedDeque);
                concurrentLinkedDeque.removeFirst();
                if (aVar != null) {
                    if (z17) {
                        u0Var.q(aVar, ta4.j.f498311p);
                    }
                    u0Var.n(aVar);
                }
            } while (concurrentLinkedDeque.size() > 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Image.SnsImageLoadReporter", "checkFlushReport cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkFlushReport", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$checkFlushReport", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
    }

    public static final ta4.a b(ta4.u0 u0Var, java.lang.String str) {
        ta4.a aVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$checkReportData", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        u0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkReportData", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        synchronized (f498375e) {
            try {
                ta4.u0 u0Var2 = f498371a;
                aVar = null;
                if (u0Var2.i()) {
                    ta4.a l17 = u0Var2.l(str);
                    if (l17 == null) {
                        if (r26.n0.D(str, "_", false, 2, null)) {
                            java.util.Iterator it = r26.n0.f0(str, new java.lang.String[]{"_"}, false, 0, 6, null).iterator();
                            if (it.hasNext()) {
                                aVar = u0Var2.l((java.lang.String) it.next());
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkReportData", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                            }
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkReportData", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkReportData", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                        aVar = l17;
                    }
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkReportData", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkReportData", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$checkReportData", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        return aVar;
    }

    public static final void c(ta4.u0 u0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$endSession", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        u0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("endSession", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        synchronized (f498376f) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Image.SnsImageLoadReporter", "endSession:" + f498377g);
                f498377g = "";
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("endSession", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("endSession", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$endSession", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
    }

    public static final /* synthetic */ java.lang.Object d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getDataListLock$p", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        java.lang.Object obj = f498375e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getDataListLock$p", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        return obj;
    }

    public static final /* synthetic */ java.util.concurrent.ConcurrentLinkedDeque e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getReportDataList$p", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = f498374d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getReportDataList$p", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        return concurrentLinkedDeque;
    }

    public static final /* synthetic */ void f(ta4.u0 u0Var, ta4.a aVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$reportData", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        u0Var.n(aVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$reportData", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
    }

    public static final /* synthetic */ void g(ta4.u0 u0Var, ta4.a aVar, ta4.j jVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$updateStageCost", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        u0Var.q(aVar, jVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$updateStageCost", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
    }

    public static final void h(java.lang.String mediaId, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callbackToUI", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        pm0.v.O("SnsImageLoadReporter", new ta4.x(mediaId, i17, i18));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callbackToUI", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
    }

    public static final void j(java.lang.String mediaId, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("downloadFinished", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        pm0.v.O("SnsImageLoadReporter", new ta4.c0(mediaId, i17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadFinished", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
    }

    public static final void m(java.lang.String mediaId) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("loadHitCache", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        pm0.v.O("SnsImageLoadReporter", new ta4.g0(mediaId));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadHitCache", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
    }

    public static final void o(java.lang.String mediaId) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showBitmapSuccess", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Image.SnsImageLoadReporter", "showBitmapSuccess media:".concat(mediaId));
        pm0.v.O("SnsImageLoadReporter", new ta4.p0(mediaId));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showBitmapSuccess", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
    }

    public static final void p(java.lang.String str, java.lang.String mediaId, int i17, java.lang.String fromScene, boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startLoad", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromScene, "fromScene");
        pm0.v.O("SnsImageLoadReporter", new ta4.s0(mediaId, i17, fromScene, z17, str, z18));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startLoad", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
    }

    public final boolean i() {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkSessionValid", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        synchronized (f498376f) {
            try {
                z17 = f498377g.length() > 0;
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSessionValid", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSessionValid", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        return z17;
    }

    public final java.lang.String k(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("encryptContent", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        if (str == null || android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("encryptContent", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
            return "";
        }
        if (str.length() <= 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("encryptContent", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
            return str;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(r26.p0.A0(str));
        sb6.append('*');
        sb6.append(str.length());
        sb6.append('*');
        sb6.append(r26.p0.D0(str));
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("encryptContent", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        return sb7;
    }

    public final ta4.a l(java.lang.String str) {
        java.lang.Object obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getData", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        java.util.Iterator it = f498374d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((ta4.a) obj).a(), str)) {
                break;
            }
        }
        ta4.a aVar = (ta4.a) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getData", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        if (r4 == 0) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(ta4.a r15) {
        /*
            Method dump skipped, instructions count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ta4.u0.n(ta4.a):void");
    }

    public final void q(ta4.a aVar, ta4.j jVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateStageCost", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        if (aVar.b() != jVar) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getStartLoadTick", "com.tencent.mm.plugin.sns.report.Data");
            long j17 = aVar.f498250o;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStartLoadTick", "com.tencent.mm.plugin.sns.report.Data");
            long j18 = elapsedRealtime - j17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setStage", "com.tencent.mm.plugin.sns.report.Data");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jVar, "<set-?>");
            aVar.f498240e = jVar;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setStage", "com.tencent.mm.plugin.sns.report.Data");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getStageCost", "com.tencent.mm.plugin.sns.report.Data");
            org.json.JSONObject jSONObject = aVar.f498243h;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStageCost", "com.tencent.mm.plugin.sns.report.Data");
            jSONObject.put(jVar.toString(), j18);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Image.SnsImageLoadReporter", "media:" + aVar.a() + " updateStageCost:" + jVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateStageCost", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
    }
}
