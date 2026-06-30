package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123;

/* loaded from: classes16.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f246466a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static volatile long f246467b = 0;

    public static void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cleanExpiredObjectIfNeeded", "com.tencent.mm.plugin.sns.statistics.SnsImgStats");
        java.util.Map map = f246466a;
        synchronized (map) {
            try {
                long j17 = f246467b;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (android.os.SystemClock.elapsedRealtime() - j17 <= u04.d.f505010c) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cleanExpiredObjectIfNeeded", "com.tencent.mm.plugin.sns.statistics.SnsImgStats");
                    return;
                }
                f246467b = android.os.SystemClock.elapsedRealtime();
                ((java.util.concurrent.ConcurrentHashMap) map).clear();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cleanExpiredObjectIfNeeded", "com.tencent.mm.plugin.sns.statistics.SnsImgStats");
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cleanExpiredObjectIfNeeded", "com.tencent.mm.plugin.sns.statistics.SnsImgStats");
                throw th6;
            }
        }
    }

    public static java.lang.String b(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPartialUrl", "com.tencent.mm.plugin.sns.statistics.SnsImgStats");
        int indexOf = str.indexOf(63);
        if (indexOf >= 0) {
            str = str.substring(0, indexOf);
        }
        int indexOf2 = str.indexOf("://");
        if (indexOf2 >= 0) {
            str = str.substring(indexOf2 + 3);
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 < 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPartialUrl", "com.tencent.mm.plugin.sns.statistics.SnsImgStats");
            return str;
        }
        java.lang.String substring = str.substring(indexOf3 + 1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPartialUrl", "com.tencent.mm.plugin.sns.statistics.SnsImgStats");
        return substring;
    }

    public static void c(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, int i18, int i19, int i27, long j17, long j18, long j19, int i28) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("prepareReportImgDownloadInfo", "com.tencent.mm.plugin.sns.statistics.SnsImgStats");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.p pVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.p(null);
            java.lang.String b17 = b(str2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$902", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            pVar.f246448a = b17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$902", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1002", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            pVar.f246449b = i17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1002", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1102", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            pVar.f246450c = str3;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1102", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1202", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            pVar.f246451d = i18;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1202", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1302", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            pVar.f246452e = i19;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1302", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1402", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            pVar.f246453f = i27;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1402", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1502", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            pVar.f246454g = j17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1502", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1602", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            pVar.f246455h = j18;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1602", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1702", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            pVar.f246457j = j19;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1702", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1802", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            pVar.f246458k = i28;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1802", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            ((java.util.concurrent.ConcurrentHashMap) f246466a).put(str, pVar);
        } catch (java.lang.Exception unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("prepareReportImgDownloadInfo", "com.tencent.mm.plugin.sns.statistics.SnsImgStats");
    }

    public static void d(java.lang.String str, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.p pVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportImgDownloadInfo", "com.tencent.mm.plugin.sns.statistics.SnsImgStats");
        try {
            pVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.p) ((java.util.concurrent.ConcurrentHashMap) f246466a).remove(str);
        } catch (java.lang.Exception unused) {
        } catch (java.lang.Throwable th6) {
            a();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportImgDownloadInfo", "com.tencent.mm.plugin.sns.statistics.SnsImgStats");
            throw th6;
        }
        if (pVar == null) {
            a();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportImgDownloadInfo", "com.tencent.mm.plugin.sns.statistics.SnsImgStats");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1902", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
        pVar.f246456i = j17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1902", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
        java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.p.a(pVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsImgStats", "report dl: " + a17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(13513, a17);
        a();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportImgDownloadInfo", "com.tencent.mm.plugin.sns.statistics.SnsImgStats");
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, int i19, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportImgUploadInfo", "com.tencent.mm.plugin.sns.statistics.SnsImgStats");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.q qVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.q(null);
            java.lang.String b17 = b(str2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$102", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgUploadInfo");
            qVar.f246460a = b17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$102", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgUploadInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$202", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgUploadInfo");
            qVar.f246461b = str3;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$202", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgUploadInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$302", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgUploadInfo");
            qVar.f246462c = i17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$302", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgUploadInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$402", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgUploadInfo");
            qVar.f246463d = i18;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$402", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgUploadInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$502", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgUploadInfo");
            qVar.f246464e = i19;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$502", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgUploadInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$602", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgUploadInfo");
            qVar.f246465f = j17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$602", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgUploadInfo");
            java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.q.a(qVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsImgStats", "report up: " + a17);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(13512, a17);
        } catch (java.lang.Exception unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportImgUploadInfo", "com.tencent.mm.plugin.sns.statistics.SnsImgStats");
    }
}
