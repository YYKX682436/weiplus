package zv;

/* loaded from: classes11.dex */
public final class m0 {

    /* renamed from: b, reason: collision with root package name */
    public static long f557563b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static long f557564c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static int f557565d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f557566e = "";

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f557567f;

    /* renamed from: h, reason: collision with root package name */
    public static volatile boolean f557569h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f557570i;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f557571j;

    /* renamed from: k, reason: collision with root package name */
    public static java.lang.String f557572k;

    /* renamed from: l, reason: collision with root package name */
    public static java.lang.String f557573l;

    /* renamed from: m, reason: collision with root package name */
    public static java.lang.String f557574m;

    /* renamed from: n, reason: collision with root package name */
    public static boolean f557575n;

    /* renamed from: o, reason: collision with root package name */
    public static int f557576o;

    /* renamed from: p, reason: collision with root package name */
    public static int f557577p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f557578q;

    /* renamed from: r, reason: collision with root package name */
    public static java.lang.String f557579r;

    /* renamed from: s, reason: collision with root package name */
    public static int f557580s;

    /* renamed from: t, reason: collision with root package name */
    public static java.lang.String f557581t;

    /* renamed from: u, reason: collision with root package name */
    public static int f557582u;

    /* renamed from: v, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p2621x8fb0427b.l4 f557583v;

    /* renamed from: a, reason: collision with root package name */
    public static final zv.m0 f557562a = new zv.m0();

    /* renamed from: g, reason: collision with root package name */
    public static volatile java.util.Map f557568g = kz5.q0.f395534d;

    static {
        new java.util.LinkedList();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 R = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("brandService_accounts");
        f557570i = R;
        R.q("lastBoxExposeReaTimeReportTime", java.lang.System.currentTimeMillis());
        f557572k = "-1";
        f557573l = "-1";
        f557574m = "-1";
        f557578q = -1;
        f557582u = -1;
    }

    public final java.lang.String a(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        return "lstExpTime_" + str + '}';
    }

    public final java.lang.String b(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        return "totalExpTime_" + str + '}';
    }

    public final java.util.Map c() {
        jz5.l[] lVarArr = new jz5.l[4];
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3135xb0941fd.a d17 = yw.a3.f547799a.d();
        java.lang.String b17 = d17 != null ? d17.b() : null;
        if (b17 == null) {
            b17 = "";
        }
        lVarArr[0] = new jz5.l("custom_session_id", b17);
        lVarArr[1] = new jz5.l("pos", java.lang.String.valueOf(f557578q));
        lVarArr[2] = new jz5.l("new_noti_count", java.lang.String.valueOf(f557576o));
        lVarArr[3] = new jz5.l("new_message_count", java.lang.String.valueOf(f557577p));
        return kz5.c1.k(lVarArr);
    }

    public final java.util.Map d(int i17) {
        return kz5.c1.k(new jz5.l("pos", java.lang.String.valueOf(i17)), new jz5.l("new_noti_count", java.lang.String.valueOf(f557576o)), new jz5.l("new_message_count", java.lang.String.valueOf(f557577p)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ec, code lost:
    
        if (r12 == null) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(java.lang.String r34, int r35, int r36, java.lang.String r37) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zv.m0.e(java.lang.String, int, int, java.lang.String):void");
    }

    public final void f(java.lang.String str, int i17, com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var) {
        if (l4Var == null) {
            return;
        }
        yw.a3 a3Var = yw.a3.f547799a;
        if (!yw.a3.f547804f) {
            f557581t = str;
            f557582u = i17;
            f557583v = l4Var;
        } else {
            int d17 = l4Var.d1();
            java.lang.String str2 = f557573l;
            f557574m = str2;
            ((ku5.t0) ku5.t0.f394148d).h(new zv.i0(str, i17, l4Var, d17, str2), "MicroMsg.BrandServiceMainCellExposeHelper");
        }
    }
}
