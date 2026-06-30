package g02;

/* loaded from: classes8.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f348950a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f348951b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f348952c = new java.util.HashMap();

    public static int a(android.content.Context context) {
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40076x31711e(context)) {
            return 4;
        }
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(context)) {
            return 5;
        }
        int m40067xab9ed241 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(context);
        if (m40067xab9ed241 == -1) {
            return 255;
        }
        if (m40067xab9ed241 == 0) {
            return 1;
        }
        if (m40067xab9ed241 != 5) {
            return m40067xab9ed241 != 6 ? 6 : 3;
        }
        return 2;
    }

    public static void b(java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        jj0.b a17 = jj0.b.a(10737, java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(currentTimeMillis), 1, str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), 0, 0, str2, "", str3, java.lang.Integer.valueOf(a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)), 0, 1, str4, str5);
        ((com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.c) jj0.a.a()).getClass();
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.k.a(a17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0150, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r14) != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(int r27, g02.c r28) {
        /*
            Method dump skipped, instructions count: 853
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g02.b.c(int, g02.c):void");
    }

    public static void d(java.lang.String str, long j17, long j18) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        if ("appid_is_empty".equals(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(860L, j17, j18, false);
        } else {
            p95.a.a(new g02.a(str, j17, j18));
        }
    }

    public static void e(long j17, int i17) {
        f348950a.put(java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
    }

    public static java.lang.String f(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return "";
        }
        try {
            return java.net.URLEncoder.encode(str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileDownloadReportUtil", e17.getMessage());
            return "";
        }
    }
}
