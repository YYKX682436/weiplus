package rq4;

/* loaded from: classes14.dex */
public final class q {

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.Long f480602c;

    /* renamed from: e, reason: collision with root package name */
    public static int f480604e;

    /* renamed from: h, reason: collision with root package name */
    public static int f480607h;

    /* renamed from: i, reason: collision with root package name */
    public static long f480608i;

    /* renamed from: k, reason: collision with root package name */
    public static boolean f480610k;

    /* renamed from: n, reason: collision with root package name */
    public static boolean f480613n;

    /* renamed from: q, reason: collision with root package name */
    public static boolean f480616q;

    /* renamed from: s, reason: collision with root package name */
    public static jz5.l f480618s;

    /* renamed from: t, reason: collision with root package name */
    public static int f480619t;

    /* renamed from: v, reason: collision with root package name */
    public static long f480621v;

    /* renamed from: y, reason: collision with root package name */
    public static long f480624y;

    /* renamed from: z, reason: collision with root package name */
    public static long f480625z;

    /* renamed from: a, reason: collision with root package name */
    public static final rq4.q f480600a = new rq4.q();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashSet f480601b = new java.util.HashSet();

    /* renamed from: d, reason: collision with root package name */
    public static rq4.o f480603d = rq4.o.f480590d;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f480605f = "0";

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentLinkedQueue f480606g = new java.util.concurrent.ConcurrentLinkedQueue();

    /* renamed from: j, reason: collision with root package name */
    public static java.lang.String f480609j = "";

    /* renamed from: l, reason: collision with root package name */
    public static java.lang.String f480611l = "";

    /* renamed from: m, reason: collision with root package name */
    public static java.lang.String f480612m = "";

    /* renamed from: o, reason: collision with root package name */
    public static boolean f480614o = true;

    /* renamed from: p, reason: collision with root package name */
    public static java.lang.String f480615p = "";

    /* renamed from: r, reason: collision with root package name */
    public static java.lang.String f480617r = "";

    /* renamed from: u, reason: collision with root package name */
    public static java.lang.String f480620u = "";

    /* renamed from: w, reason: collision with root package name */
    public static final p012xc85e97e9.p093xedfae76a.j0 f480622w = new p012xc85e97e9.p093xedfae76a.j0(null);

    /* renamed from: x, reason: collision with root package name */
    public static final jz5.g f480623x = jz5.h.a(jz5.i.f384364f, rq4.p.f480599d);

    public final void a(java.lang.Integer num, java.lang.Long l17, java.lang.String str, java.lang.Boolean bool) {
        if (num != null) {
            f480607h = num.intValue();
            if (l17 != null) {
                f480608i = l17.longValue();
                if (str == null) {
                    return;
                }
                f480609j = str;
                if (bool != null) {
                    f480610k = bool.booleanValue();
                    gq4.v.wi().f447513n = f480610k;
                    gq4.v.wi().f447512m = c();
                    f480622w.mo7808x76db6cb1(new jz5.l(num, l17));
                    ((vq4.i) f480623x.mo141623x754a37bb()).c();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x02e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(long r27, long r29) {
        /*
            Method dump skipped, instructions count: 945
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rq4.q.b(long, long):void");
    }

    public final java.lang.String c() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("roomKey", f480608i);
        jSONObject2.put("roomId", f480607h);
        jSONObject2.put("callName", f480609j);
        jSONObject2.put("callType", f480610k);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        jSONObject2.put("timeStamp", java.lang.System.currentTimeMillis());
        jSONObject.put("voipInfo", jSONObject2.toString());
        java.lang.String jSONObject3 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
        return jSONObject3;
    }
}
