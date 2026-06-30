package o45;

/* loaded from: classes12.dex */
public abstract class wf extends o45.xf {

    /* renamed from: a, reason: collision with root package name */
    public static int f424556a = 2;

    /* renamed from: f, reason: collision with root package name */
    public static long f424561f;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f424557b = wo.q.f529314b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f424558c = wo.q.f529315c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f424559d = wo.q.f529316d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f424560e = wo.q.f529319g;

    /* renamed from: g, reason: collision with root package name */
    public static int f424562g = o45.zf.f424573a;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f424563h = o45.zf.f424574b;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f424564i = o45.zf.f424575c;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f424565j = o45.zf.f424576d;

    /* renamed from: k, reason: collision with root package name */
    public static boolean f424566k = o45.zf.f424577e;

    /* renamed from: l, reason: collision with root package name */
    public static boolean f424567l = o45.zf.f424578f;

    public static java.lang.String a() {
        return wo.q.f529317e;
    }

    public static void b(int i17) {
        o45.zf.f424573a = i17;
        o45.zf.f424577e = com.p314xaae8f345.mm.sdk.p2603x2137b148.v8.a(i17);
        int i18 = o45.zf.f424573a & 255;
        o45.zf.f424574b = i18 >= 48 && i18 <= 95;
        o45.zf.f424576d = (o45.zf.f424573a & 255) >= 96;
        o45.zf.f424578f = com.p314xaae8f345.mm.sdk.p2603x2137b148.v8.b(o45.zf.f424573a);
        int i19 = o45.zf.f424573a & 255;
        o45.zf.f424575c = i19 >= 64 && i19 <= 79;
        f424562g = o45.zf.f424573a;
        f424566k = o45.zf.f424577e;
        f424563h = o45.zf.f424574b;
        f424565j = o45.zf.f424576d;
        f424567l = o45.zf.f424578f;
        f424564i = o45.zf.f424575c;
    }
}
