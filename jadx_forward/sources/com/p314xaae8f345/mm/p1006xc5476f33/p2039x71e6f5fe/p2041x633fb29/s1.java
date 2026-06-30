package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29;

/* loaded from: classes15.dex */
public abstract class s1 {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f240553a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f240554b;

    /* renamed from: c, reason: collision with root package name */
    public static int f240555c;

    /* renamed from: d, reason: collision with root package name */
    public static long f240556d;

    /* renamed from: e, reason: collision with root package name */
    public static int f240557e;

    /* renamed from: f, reason: collision with root package name */
    public static int f240558f;

    /* renamed from: g, reason: collision with root package name */
    public static int f240559g;

    /* renamed from: h, reason: collision with root package name */
    public static int f240560h;

    /* renamed from: i, reason: collision with root package name */
    public static int f240561i;

    /* renamed from: j, reason: collision with root package name */
    public static int f240562j;

    /* renamed from: k, reason: collision with root package name */
    public static java.lang.String f240563k;

    /* renamed from: l, reason: collision with root package name */
    public static int f240564l;

    /* renamed from: m, reason: collision with root package name */
    public static java.lang.String f240565m;

    /* renamed from: n, reason: collision with root package name */
    public static int f240566n;

    /* renamed from: o, reason: collision with root package name */
    public static int f240567o;

    /* renamed from: p, reason: collision with root package name */
    public static java.lang.String f240568p;

    /* renamed from: q, reason: collision with root package name */
    public static int f240569q;

    /* renamed from: r, reason: collision with root package name */
    public static int f240570r;

    /* renamed from: s, reason: collision with root package name */
    public static int f240571s;

    /* renamed from: t, reason: collision with root package name */
    public static int f240572t;

    /* renamed from: u, reason: collision with root package name */
    public static int f240573u;

    /* renamed from: v, reason: collision with root package name */
    public static int f240574v;

    /* renamed from: w, reason: collision with root package name */
    public static java.lang.String f240575w;

    static {
        bz3.h hVar = bz3.h.f118307a;
        f240553a = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_scan_enable_operate_reporter, false);
        f240563k = "";
        f240565m = "";
        f240568p = "";
        f240575w = "";
    }

    public static final void a(int i17) {
        if (f240553a && !f240554b) {
            f240554b = true;
            long currentTimeMillis = java.lang.System.currentTimeMillis() - f240556d;
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.h0 h0Var = com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.h0.f298581b;
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.x0 b17 = h0Var.b();
            h0Var.f();
            f240559g = b17.f298697d ? 1 : 0;
            f240560h = b17.f298698e ? 1 : 0;
            f240566n = b17.f298700g;
            f240567o = b17.f298699f;
            boolean[] zArr = b17.f298711u;
            java.lang.String str = zArr[6] ? b17.f298702i : "";
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getCodeDetectLocation(...)");
            f240568p = str;
            f240569q = b17.f298701h;
            f240570r = b17.f298703m;
            f240571s = b17.f298704n;
            f240573u = b17.f298706p;
            f240574v = b17.f298705o;
            java.lang.String str2 = zArr[11] ? b17.f298707q : "";
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getCodeExtraInfo(...)");
            f240575w = str2;
            int i18 = b17.f298708r;
            if (i18 <= 0) {
                i18 = 0;
            }
            f240555c = i18;
            f240562j = b17.f298710t ? 1 : 0;
            f240558f = b17.f298709s ? 1 : 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanOperateReporter", "log36180: " + f240556d + ", " + currentTimeMillis + ", " + f240557e + ", " + i17 + ", 1, " + f240558f + ", " + f240559g + ", " + f240560h + ", " + f240561i + ", " + f240562j + ", " + f240563k + ", " + f240555c + ", 0, " + f240564l + ", " + f240565m + ", " + f240566n + ", " + f240567o + ", " + f240568p + ", " + f240569q + ", " + f240570r + ", " + f240571s + ", " + f240572t + ", " + f240573u + ", " + f240574v + ", " + f240575w + ',');
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(36180, java.lang.Long.valueOf(f240556d), java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf(f240557e), java.lang.Integer.valueOf(i17), 1, java.lang.Integer.valueOf(f240558f), java.lang.Integer.valueOf(f240559g), java.lang.Integer.valueOf(f240560h), java.lang.Integer.valueOf(f240561i), java.lang.Integer.valueOf(f240562j), f240563k, java.lang.Integer.valueOf(f240555c), 0, java.lang.Integer.valueOf(f240564l), f240565m, java.lang.Integer.valueOf(f240566n), java.lang.Integer.valueOf(f240567o), f240568p, java.lang.Integer.valueOf(f240569q), java.lang.Integer.valueOf(f240570r), java.lang.Integer.valueOf(f240571s), java.lang.Integer.valueOf(f240572t), java.lang.Integer.valueOf(f240573u), java.lang.Integer.valueOf(f240574v), f240575w);
            f240557e = i17;
        }
    }

    public static final void b() {
        if (f240553a) {
            f240554b = false;
            f240555c = 0;
            f240556d = java.lang.System.currentTimeMillis();
            f240558f = 0;
            f240559g = 0;
            f240560h = 0;
            f240561i = 0;
            f240562j = 0;
            f240563k = "";
            f240564l = 0;
            f240565m = "";
            f240566n = 0;
            f240567o = 0;
            f240568p = "";
            f240569q = 0;
            f240570r = 0;
            f240571s = 0;
            f240572t = 0;
            f240573u = 0;
            f240574v = 0;
            f240575w = "";
        }
    }
}
