package rq4;

/* loaded from: classes14.dex */
public final class u {

    /* renamed from: b, reason: collision with root package name */
    public static long f480643b;

    /* renamed from: c, reason: collision with root package name */
    public static long f480644c;

    /* renamed from: d, reason: collision with root package name */
    public static long f480645d;

    /* renamed from: e, reason: collision with root package name */
    public static long f480646e;

    /* renamed from: f, reason: collision with root package name */
    public static long f480647f;

    /* renamed from: g, reason: collision with root package name */
    public static long f480648g;

    /* renamed from: h, reason: collision with root package name */
    public static long f480649h;

    /* renamed from: a, reason: collision with root package name */
    public static final rq4.u f480642a = new rq4.u();

    /* renamed from: i, reason: collision with root package name */
    public static org.json.JSONArray f480650i = new org.json.JSONArray();

    public final void a() {
        org.json.JSONArray jSONArray;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7172xfa3c5dc2 c7172xfa3c5dc2 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7172xfa3c5dc2();
        c7172xfa3c5dc2.f144705d = f480643b;
        c7172xfa3c5dc2.f144706e = f480644c;
        long j17 = f480645d;
        c7172xfa3c5dc2.f144707f = j17;
        c7172xfa3c5dc2.f144708g = f480646e;
        c7172xfa3c5dc2.f144709h = f480647f;
        c7172xfa3c5dc2.f144710i = f480648g;
        c7172xfa3c5dc2.f144711j = f480649h;
        if (j17 == 2) {
            jSONArray = f480650i;
        } else {
            ar4.c cVar = ar4.c.f94934a;
            jSONArray = ar4.c.f94937d;
        }
        if (jSONArray.length() > 0 && f480647f > 0) {
            java.lang.String jSONArray2 = jSONArray.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONArray2, "toString(...)");
            c7172xfa3c5dc2.f144712k = c7172xfa3c5dc2.b("Background_event", r26.p0.E0(r26.i0.t(jSONArray2, ",", ";", false), 1024), true);
            c7172xfa3c5dc2.k();
        }
        f480643b = 0L;
        f480644c = 0L;
        f480645d = 0L;
        f480646e = 0L;
        f480647f = 0L;
        f480648g = 0L;
        f480649h = 0L;
        f480650i = new org.json.JSONArray();
    }

    public final void b(int i17, boolean z17) {
        org.json.JSONArray jSONArray = f480650i;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("action", i17);
        jSONObject.put("isFront", z17 ? 1 : 2);
        jSONObject.put("timeStamp", java.lang.System.currentTimeMillis());
        jSONArray.put(jSONObject);
    }

    public final void c(boolean z17, boolean z18) {
        f480645d = z17 ? 2L : 1L;
        f480646e = z18 ? 1L : 2L;
        f480647f = java.lang.System.currentTimeMillis();
    }
}
