package zl2;

/* loaded from: classes3.dex */
public final class a5 {

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f555188b;

    /* renamed from: c, reason: collision with root package name */
    public static long f555189c;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f555190d;

    /* renamed from: a, reason: collision with root package name */
    public static final zl2.a5 f555187a = new zl2.a5();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f555191e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f555192f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Set f555193g = new java.util.LinkedHashSet();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.List f555194h = new java.util.ArrayList();

    public final long a(java.lang.String stage) {
        java.lang.Object putIfAbsent;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stage, "stage");
        if (!f555188b) {
            return -1L;
        }
        java.lang.Long l17 = (java.lang.Long) f555191e.remove(stage);
        if (l17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LivePerformanceMonitor", "[" + f555189c + "] 未找到 stage: " + stage + " 的开始时间，请确保调用了 mark()");
            return -1L;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - l17.longValue();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f555192f;
        java.lang.Object obj = concurrentHashMap.get(stage);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(stage, (obj = new java.util.ArrayList()))) != null) {
            obj = putIfAbsent;
        }
        ((java.util.List) obj).add(java.lang.Long.valueOf(elapsedRealtime));
        ((java.util.ArrayList) f555194h).add(new zl2.y4(stage, zl2.x4.f555559e, android.os.SystemClock.elapsedRealtime()));
        return elapsedRealtime;
    }

    public final long b(zl2.z4 z4Var, java.lang.String str) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(z4Var.f555584a, str)) {
            return z4Var.f555585b;
        }
        java.util.Iterator it = z4Var.f555586c.iterator();
        while (it.hasNext()) {
            long b17 = f555187a.b((zl2.z4) it.next(), str);
            if (b17 > 0) {
                return b17;
            }
        }
        return 0L;
    }

    public final void c(java.lang.String stage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stage, "stage");
        if (f555188b) {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            f555191e.put(stage, java.lang.Long.valueOf(elapsedRealtime));
            f555193g.add(stage);
            ((java.util.ArrayList) f555194h).add(new zl2.y4(stage, zl2.x4.f555558d, elapsedRealtime));
        }
    }

    public final void d(zl2.z4 z4Var, int i17, java.lang.String str) {
        java.lang.String str2;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(z4Var.f555584a, "root");
        zl2.a5 a5Var = f555187a;
        java.util.List list = z4Var.f555586c;
        if (b17) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                a5Var.d((zl2.z4) it.next(), i17, str);
            }
            return;
        }
        java.lang.String str3 = "";
        if (i17 != 0) {
            str2 = "├─ ";
            if (i17 != 1) {
                str2 = "│  " + r26.i0.s("│  ", i17 - 2) + "├─ ";
            }
        } else {
            str2 = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LivePerformanceMonitor", str + str2 + z4Var.f555584a + ": " + z4Var.f555585b + "ms");
        if (!list.isEmpty()) {
            if (i17 != 0) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str);
                sb6.append(i17 != 1 ? "   " : "│  ");
                str3 = sb6.toString();
            }
            java.util.Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                a5Var.d((zl2.z4) it6.next(), i17 + 1, str3);
            }
        }
    }
}
