package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes8.dex */
public final class e3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.e3 f206542a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.e3();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f206543b = "1";

    public final void a(java.lang.String eventId, java.lang.String finderUin, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventId, "eventId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUin, "finderUin");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6601x39d5e94a c6601x39d5e94a = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6601x39d5e94a();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(eventId, "1")) {
            f206543b = "1-" + c01.id.c();
        }
        c6601x39d5e94a.f139494d = c6601x39d5e94a.b("biz_id", "4", true);
        c6601x39d5e94a.f139495e = c6601x39d5e94a.b("flow_id", f206543b, true);
        c6601x39d5e94a.f139496f = c6601x39d5e94a.b("event_id", eventId, true);
        c6601x39d5e94a.f139497g = c6601x39d5e94a.b("event_time", java.lang.String.valueOf(c01.id.c()), true);
        c6601x39d5e94a.f139498h = c6601x39d5e94a.b("finderuin", finderUin, true);
        if (jSONObject != null) {
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            c6601x39d5e94a.f139499i = c6601x39d5e94a.b("udf_kv", r26.i0.t(jSONObject2, ",", ";", false), true);
        }
        c6601x39d5e94a.k();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Zk(c6601x39d5e94a);
    }
}
