package x11;

/* loaded from: classes12.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final x11.b0 f532883a = new x11.b0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f532884b = new java.util.LinkedHashMap();

    public final void a(com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6790x79ba4f55 struct, java.lang.Long l17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(struct, "struct");
        long j17 = struct.f141232p;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewInitReportRecorder", "record:" + j17);
        java.lang.String str = struct.f141233q;
        java.util.Map map = f532884b;
        x11.a0 a0Var = (x11.a0) ((java.util.LinkedHashMap) map).get(str);
        if (a0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            a0Var = new x11.a0(str);
            map.put(str, a0Var);
        }
        java.util.List list = a0Var.f532881a;
        x11.c0 c0Var = (x11.c0) kz5.n0.k0(list);
        long j18 = c0Var != null ? c0Var.f532887b : 0L;
        x11.c0 c0Var2 = (x11.c0) kz5.n0.Z(list);
        long j19 = c0Var2 != null ? c0Var2.f532887b : 0L;
        long longValue = l17 != null ? l17.longValue() : android.os.SystemClock.elapsedRealtime();
        long j27 = longValue - j18;
        long j28 = longValue - j19;
        ((java.util.ArrayList) list).add(new x11.c0(j17, longValue, j27, j28, c0Var, c0Var2));
        struct.f141237u = j27;
        struct.f141239w = j28;
        struct.f141236t = c0Var != null ? c0Var.f532886a : 0L;
        struct.f141238v = c0Var2 != null ? c0Var2.f532886a : 0L;
        x11.e0[] e0VarArr = x11.e0.f532890d;
        if (j17 == 0) {
            map.remove(str);
        }
    }
}
