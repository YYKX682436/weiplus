package sp2;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static r45.dc4 f492506b;

    /* renamed from: a, reason: collision with root package name */
    public static final sp2.b f492505a = new sp2.b();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f492507c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static long f492508d = 1200000;

    /* renamed from: e, reason: collision with root package name */
    public static int f492509e = ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.P1().r()).intValue();

    public final long a(java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.util.HashMap hashMap = f492507c;
        java.lang.Object obj = hashMap.get(key);
        if (obj == null) {
            obj = new sp2.a();
            hashMap.put(key, obj);
        }
        return ((sp2.a) obj).f492487a;
    }

    public final r45.dc4 b() {
        if (f492506b == null) {
            java.lang.String v17 = gm0.j1.u().c().v(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_NEARBY_LAST_SQUARE_STATUS_STRING_SYNC, "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(v17);
            if (v17.length() == 0) {
                return null;
            }
            try {
                r45.dc4 dc4Var = new r45.dc4();
                dc4Var.mo11468x92b714fd(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(v17));
                f492506b = dc4Var;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("CacheUtils", e17, "get lastSquareStatus", new java.lang.Object[0]);
            }
        }
        return f492506b;
    }

    public final java.lang.Boolean c(int i17, java.lang.String key, long j17) {
        r45.bk2 bk2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.util.HashMap hashMap = f492507c;
        java.lang.Object obj = hashMap.get(key);
        if (obj == null) {
            obj = new sp2.a();
            hashMap.put(key, obj);
        }
        r45.dk2 dk2Var = ((sp2.a) obj).f492488b;
        if (dk2Var == null || (bk2Var = (r45.bk2) dk2Var.m75936x14adae67(16)) == null) {
            return null;
        }
        int m75939xb282bd08 = i17 != 2 ? i17 != 3 ? bk2Var.m75939xb282bd08(3) : bk2Var.m75939xb282bd08(4) : bk2Var.m75939xb282bd08(5);
        long currentTimeMillis = (i17 == 2 || i17 == 3) ? java.lang.System.currentTimeMillis() - a(key) : java.lang.System.currentTimeMillis() - j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CacheUtils", "isLargeExitEntranceTimeOut type: " + i17 + " offestTime: " + currentTimeMillis + " maxTime: " + m75939xb282bd08);
        if (m75939xb282bd08 == 0) {
            return null;
        }
        return java.lang.Boolean.valueOf(currentTimeMillis > ((long) (m75939xb282bd08 * 1000)));
    }

    public final void d(java.lang.String key, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.util.HashMap hashMap = f492507c;
        java.lang.Object obj = hashMap.get(key);
        if (obj == null) {
            obj = new sp2.a();
            hashMap.put(key, obj);
        }
        ((sp2.a) obj).f492495i = i17;
    }
}
