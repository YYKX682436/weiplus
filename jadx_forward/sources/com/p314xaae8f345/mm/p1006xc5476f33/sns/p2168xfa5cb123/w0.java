package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123;

/* loaded from: classes4.dex */
public final class w0 {

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f246523b = "";

    /* renamed from: d, reason: collision with root package name */
    public static boolean f246525d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f246526e;

    /* renamed from: g, reason: collision with root package name */
    public static long f246528g;

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.w0 f246522a = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.w0();

    /* renamed from: c, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6913xf7b4b00d f246524c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6913xf7b4b00d();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashMap f246527f = new java.util.HashMap();

    public final int a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getIsBackgroundUserType", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.a aVar = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.a.f246359a;
        int i17 = (aVar.g() || aVar.h()) ? 1 : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getIsBackgroundUserType", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
        return i17;
    }

    public final void b(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportUserAction", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoPublishReporter", "reportUserAction: " + i17 + ", " + f246523b + ", " + f246525d + ", " + f246526e);
        if (!f246525d) {
            c();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportUserAction", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
            return;
        }
        if (i17 == 3 && f246526e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoPublishReporter", "reportUserAction >> report is fake video publish");
            java.util.HashMap hashMap = f246527f;
            java.lang.String str = f246524c.f142327d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getSessionid(...)");
            hashMap.put(str, f246524c);
        } else {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6913xf7b4b00d c6913xf7b4b00d = f246524c;
            c6913xf7b4b00d.f142328e = i17;
            c6913xf7b4b00d.f142329f = a();
            f246524c.k();
        }
        c();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportUserAction", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
    }

    public final void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reset", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoPublishReporter", "reset >> " + f246523b);
        f246524c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6913xf7b4b00d();
        f246525d = false;
        f246526e = false;
        f246528g = 0L;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reset", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
    }

    public final void d(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setIsCurrentFakeVideo", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoPublishReporter", "setIsCurrentFakeVideo >> " + z17);
        f246526e = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setIsCurrentFakeVideo", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
    }

    public final void e(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateVideoMuxTime", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6913xf7b4b00d c6913xf7b4b00d = f246524c;
        long j18 = c6913xf7b4b00d.f142334k;
        c6913xf7b4b00d.f142334k = j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoPublishReporter", "updateVideoMuxTime >> sessionId: " + f246524c.f142327d + ", time: " + j17 + ", lastMuxTime: " + j18 + ", currentMuxTime: " + f246524c.f142334k);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateVideoMuxTime", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
    }
}
