package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002;

/* loaded from: classes5.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.s1 f197210a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.s1();

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.r1 reportType, java.util.Map map) {
        java.lang.String jSONObject;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportType, "reportType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(map, "map");
        org.json.JSONObject a17 = ri.l0.a(map);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportKv type: ");
        int i17 = reportType.f197200d;
        sb6.append(i17);
        sb6.append(" json: ");
        sb6.append(a17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KTVReportUtil", sb6.toString());
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6663xa6b24053 c6663xa6b24053 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6663xa6b24053();
        c6663xa6b24053.f140082d = i17;
        c6663xa6b24053.f140083e = c6663xa6b24053.b("Result", (a17 == null || (jSONObject = a17.toString()) == null) ? "" : r26.i0.t(jSONObject, ",", ";", false), true);
        c6663xa6b24053.k();
    }
}
