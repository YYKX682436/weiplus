package ml2;

/* loaded from: classes2.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ml2.b1 f408744a = new ml2.b1();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f408745b = new java.util.concurrent.ConcurrentHashMap();

    public static void a(ml2.b1 b1Var, java.lang.String hashCode, org.json.JSONObject jSONObject, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            jSONObject = null;
        }
        synchronized (b1Var) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hashCode, "hashCode");
            ml2.a1 a1Var = (ml2.a1) f408745b.get(hashCode);
            if (a1Var != null) {
                if (jSONObject != null) {
                    a1Var.f408730d = jSONObject;
                } else {
                    java.lang.String str = a1Var.f408728b.f138094l;
                    if (!(str == null || str.length() == 0)) {
                        try {
                            java.lang.String str2 = a1Var.f408728b.f138094l;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getPg_udf_kv(...)");
                            a1Var.f408730d = new org.json.JSONObject(r26.i0.t(str2, ";", ",", false));
                        } catch (java.lang.Throwable th6) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("LiveExposeTimeReporter", th6, "onDispose", new java.lang.Object[0]);
                        }
                    }
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6466x94846399 c6466x94846399 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6466x94846399();
                c6466x94846399.r(a1Var.f408728b.f138087e);
                c6466x94846399.p(a1Var.f408728b.f138096n);
                c6466x94846399.q(a1Var.f408728b.f138091i);
                org.json.JSONObject jSONObject2 = a1Var.f408730d;
                if (jSONObject2 == null) {
                    jSONObject2 = new org.json.JSONObject();
                }
                jSONObject2.put("staytime", c01.id.c() - a1Var.f408729c);
                java.lang.String jSONObject3 = jSONObject2.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
                c6466x94846399.s(r26.i0.t(jSONObject3, ",", ";", false));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveExposeTimeReporter", "onDispose " + a1Var + ", extra:" + jSONObject + ", struct:" + c6466x94846399.n());
                c6466x94846399.k();
                f408745b.remove(hashCode);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveExposeTimeReporter", "hashCode " + hashCode + " has been disposed");
            }
        }
    }

    public final synchronized void b(ml2.a1 pageInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageInfo, "pageInfo");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f408745b;
        if (concurrentHashMap.containsKey(pageInfo.f408727a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveExposeTimeReporter", "same page " + pageInfo.f408727a + ", return");
            return;
        }
        pageInfo.f408729c = c01.id.c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveExposeTimeReporter", "onExpose " + pageInfo);
        concurrentHashMap.put(pageInfo.f408727a, pageInfo);
        pageInfo.f408728b.k();
    }
}
