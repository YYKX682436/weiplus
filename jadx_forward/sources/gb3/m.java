package gb3;

/* loaded from: classes9.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f351553a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f351554b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f351555c;

    /* renamed from: d, reason: collision with root package name */
    public static int f351556d;

    /* renamed from: e, reason: collision with root package name */
    public static int f351557e;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f351558f;

    /* renamed from: g, reason: collision with root package name */
    public static int f351559g;

    /* renamed from: h, reason: collision with root package name */
    public static int f351560h;

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.String f351561i;

    /* renamed from: j, reason: collision with root package name */
    public static java.lang.String f351562j;

    /* renamed from: k, reason: collision with root package name */
    public static int f351563k;

    public static void a(int i17, java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f351553a) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f351555c)) {
            return;
        }
        if (f351559g <= 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f351561i)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16598, java.lang.Integer.valueOf(i17), f351558f, str, f351554b, f351555c, 0, f351553a, java.lang.Integer.valueOf(f351556d), java.lang.Integer.valueOf(f351557e), java.lang.Integer.valueOf(f351559g), java.lang.Integer.valueOf(f351560h), "", 0, f351562j, java.lang.Integer.valueOf(f351563k));
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16598, java.lang.Integer.valueOf(i17), f351558f, str, f351554b, f351555c, 0, f351553a, java.lang.Integer.valueOf(f351556d), java.lang.Integer.valueOf(f351557e), java.lang.Integer.valueOf(f351559g), java.lang.Integer.valueOf(f351560h), f351561i, 0, f351562j, java.lang.Integer.valueOf(f351563k));
            f351561i = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeExposureReport", "reportData：openId %s, coverId: %s  bizName:%s url:%s actionType :%s clickJumpType：%s , coverSourceJumpType:%s ", f351553a, f351555c, f351558f, str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(f351559g), java.lang.Integer.valueOf(f351563k));
    }

    public static void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeExposureReport", "resetData：openId %s, coverId: %s bizName：%s clickJumpType：%s", f351553a, f351555c, f351558f, java.lang.Integer.valueOf(f351559g));
        f351553a = null;
        f351554b = null;
        f351555c = null;
        f351558f = null;
        f351557e = 0;
        f351556d = 0;
        f351559g = 0;
        f351563k = 0;
        f351560h = 0;
        f351561i = null;
        f351562j = null;
    }
}
