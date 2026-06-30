package il2;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final il2.s f373619a = new il2.s();

    public final void a(zl2.e5 report, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(report, "report");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", report.f555285d);
        jSONObject.put("remind_amount", j17);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("QuotaReportUtil", "reportExpose json: " + jSONObject);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.H1, t17, 0L, null, null, null, null, null, 252, null);
    }

    public final void b(zl2.e5 report, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(report, "report");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", report.f555285d);
        jSONObject.put("total_amount", j17);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("QuotaReportUtil", "reportExpose json: " + jSONObject);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.H1, t17, 0L, null, null, null, null, null, 252, null);
    }
}
