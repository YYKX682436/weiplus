package zj3;

/* loaded from: classes14.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static long f554836b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static long f554837c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static long f554838d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static long f554839e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f554840f = false;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f554841g = "";

    /* renamed from: h, reason: collision with root package name */
    public static boolean f554842h = false;

    /* renamed from: i, reason: collision with root package name */
    public static int f554843i = -1;

    /* renamed from: j, reason: collision with root package name */
    public static int f554844j;

    /* renamed from: k, reason: collision with root package name */
    public static int f554845k;

    /* renamed from: m, reason: collision with root package name */
    public static int f554847m;

    /* renamed from: n, reason: collision with root package name */
    public static int f554848n;

    /* renamed from: o, reason: collision with root package name */
    public static int f554849o;

    /* renamed from: p, reason: collision with root package name */
    public static boolean f554850p;

    /* renamed from: q, reason: collision with root package name */
    public static boolean f554851q;

    /* renamed from: r, reason: collision with root package name */
    public static int f554852r;

    /* renamed from: a, reason: collision with root package name */
    public static final zj3.g f554835a = new zj3.g();

    /* renamed from: l, reason: collision with root package name */
    public static final java.util.HashSet f554846l = new java.util.HashSet();

    /* renamed from: s, reason: collision with root package name */
    public static final zj3.f f554853s = new zj3.f();

    /* renamed from: t, reason: collision with root package name */
    public static final zj3.f f554854t = new zj3.f();

    /* renamed from: u, reason: collision with root package name */
    public static final zj3.f f554855u = new zj3.f();

    /* renamed from: v, reason: collision with root package name */
    public static final zj3.f f554856v = new zj3.f();

    /* renamed from: w, reason: collision with root package name */
    public static final java.util.ArrayList f554857w = new java.util.ArrayList();

    public final void a(boolean z17) {
        if (f554842h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MultitalkFeatureReportH", "now is talking");
        }
        f554850p = false;
        f554840f = false;
        f554851q = false;
        f554848n = 0;
        f554847m = 0;
        f554852r = 0;
        f554844j = 0;
        f554845k = 0;
        f554846l.clear();
        f554857w.clear();
        ((java.util.ArrayList) f554853s.f554834a).clear();
        ((java.util.ArrayList) f554854t.f554834a).clear();
        ((java.util.ArrayList) f554855u.f554834a).clear();
        ((java.util.ArrayList) f554856v.f554834a).clear();
        f554842h = true;
        f554838d = java.lang.System.currentTimeMillis();
        f554840f = z17;
    }

    public final void b(int i17, int i18) {
        if (i17 != 1) {
            zj3.f fVar = f554854t;
            if (i17 == 2) {
                fVar.b();
            } else if (i17 == 8) {
                fVar.a();
            }
        } else {
            f554851q = true;
            f554857w.add(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6770x2681ce3e c6770x2681ce3e = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6770x2681ce3e();
        if (f554840f) {
            c6770x2681ce3e.f140958i = f554836b;
        } else {
            c6770x2681ce3e.f140959j = 0L;
        }
        c6770x2681ce3e.f140954e = 1;
        c6770x2681ce3e.f140956g = i18;
        c6770x2681ce3e.f140957h = f554837c;
        c6770x2681ce3e.f140953d = c6770x2681ce3e.b("MultitalkGroupId", f554841g, true);
        c6770x2681ce3e.f140955f = i17;
        c6770x2681ce3e.k();
    }

    public final void c(java.util.List memberList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(memberList, "memberList");
        java.util.Iterator it = memberList.iterator();
        while (it.hasNext()) {
            f554846l.add(((com.p314xaae8f345.mm.p960xd6a841b0.C11143x170c3f54) it.next()).f153145d);
        }
        f554848n = java.lang.Math.max(f554848n, memberList.size());
    }
}
