package f65;

/* loaded from: classes14.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final f65.p f341467a = new f65.p();

    /* renamed from: b, reason: collision with root package name */
    public static long f341468b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f341469c = "";

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f341470d = "";

    /* renamed from: e, reason: collision with root package name */
    public static long f341471e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static long f341472f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static long f341473g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static long f341474h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static long f341475i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static long f341476j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static long f341477k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static java.lang.String f341478l = "";

    /* renamed from: m, reason: collision with root package name */
    public static long f341479m = 0;

    /* renamed from: n, reason: collision with root package name */
    public static long f341480n = 0;

    /* renamed from: o, reason: collision with root package name */
    public static java.lang.String f341481o = "";

    /* renamed from: p, reason: collision with root package name */
    public static java.lang.String f341482p = "";

    /* renamed from: q, reason: collision with root package name */
    public static long f341483q = 0;

    /* renamed from: r, reason: collision with root package name */
    public static java.lang.String f341484r = "";

    /* renamed from: s, reason: collision with root package name */
    public static long f341485s = 0;

    /* renamed from: t, reason: collision with root package name */
    public static long f341486t = 0;

    /* renamed from: u, reason: collision with root package name */
    public static long f341487u = 0;

    /* renamed from: v, reason: collision with root package name */
    public static long f341488v = 0;

    /* renamed from: w, reason: collision with root package name */
    public static java.lang.String f341489w = "";

    /* renamed from: x, reason: collision with root package name */
    public static java.lang.String f341490x = "";

    public final void a(int i17, int i18, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryTecReporter", "doReportIdentifyFinish >> " + f341489w);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6655xd5183134 c6655xd5183134 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6655xd5183134();
        c6655xd5183134.f140001d = (long) i17;
        c6655xd5183134.G = c6655xd5183134.b("SessionId", f341489w, true);
        c6655xd5183134.f140023z = f341483q;
        c6655xd5183134.f140003f = f341468b;
        c6655xd5183134.f140004g = c6655xd5183134.b("LatestIdenImage", f341469c, true);
        c6655xd5183134.f140005h = c6655xd5183134.b("LatestHistoryIdenedImage", f341470d, true);
        c6655xd5183134.A = c6655xd5183134.b("LatestClsHistoryIdenedImage", f341484r, true);
        c6655xd5183134.f140006i = 0L;
        c6655xd5183134.f140007j = f341471e;
        c6655xd5183134.f140014q = f341475i;
        c6655xd5183134.f140015r = f341476j;
        if (i17 != 6) {
            c6655xd5183134.f140008k = f341472f;
            c6655xd5183134.f140009l = f341473g;
            long j18 = i18;
            c6655xd5183134.f140011n = j18;
            c6655xd5183134.f140012o = j17;
            c6655xd5183134.f140010m = f341474h;
            if (i18 != 0) {
                long j19 = f341468b;
                if (j19 != 0) {
                    c6655xd5183134.f140013p = (j17 - j19) / j18;
                }
            }
        }
        c6655xd5183134.k();
    }

    public final void b(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryTecReporter", "doReportSearch: >> ready report action: " + i17 + ", " + f341489w);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6655xd5183134 c6655xd5183134 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6655xd5183134();
        if (f341479m == 2) {
            if (f341490x.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryTecReporter", "do report text is empty");
                f341477k = 0L;
                f341478l = "";
                f341479m = 0L;
                f341480n = 0L;
                f341481o = "";
                f341482p = "";
                f341485s = 0L;
                f341490x = "";
                return;
            }
        }
        if (f341478l.length() > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryTecReporter", "doReportSearch: >> to report action: " + i17 + ", " + f341489w);
            c6655xd5183134.f140001d = (long) i17;
            c6655xd5183134.f140016s = f341477k;
            c6655xd5183134.G = c6655xd5183134.b("SessionId", f341489w, true);
            c6655xd5183134.f140017t = c6655xd5183134.b("SearchSessionId", f341478l, true);
            c6655xd5183134.f140018u = f341479m;
            c6655xd5183134.f140019v = f341480n;
            c6655xd5183134.f140020w = c6655xd5183134.b("SugText", f341481o, true);
            c6655xd5183134.f140021x = c6655xd5183134.b("SearchConnectText", f341482p, true);
            c6655xd5183134.f140022y = f341485s;
            c6655xd5183134.H = c6655xd5183134.b("SearchQueryText", f341490x, true);
            c6655xd5183134.k();
            f341477k = 0L;
            f341478l = "";
            f341479m = 0L;
            f341480n = 0L;
            f341481o = "";
            f341482p = "";
            f341485s = 0L;
            f341490x = "";
        }
    }

    public final void c(long j17, long j18, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryTecReporter", "reportPerIdentify >> perNum: " + j17 + ", averPerTime: " + j18 + ", model: " + i17 + ", action: " + i18 + ", sessionId: " + f341489w);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6655xd5183134 c6655xd5183134 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6655xd5183134();
        c6655xd5183134.f140001d = (long) i18;
        c6655xd5183134.G = c6655xd5183134.b("SessionId", f341489w, true);
        c6655xd5183134.D = j17;
        c6655xd5183134.E = j18;
        c6655xd5183134.F = (long) i17;
        c6655xd5183134.k();
    }
}
