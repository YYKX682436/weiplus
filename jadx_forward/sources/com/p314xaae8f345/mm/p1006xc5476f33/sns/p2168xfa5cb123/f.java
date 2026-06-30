package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.f f246382a = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.f();

    public static /* synthetic */ void b(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.f fVar, int i17, int i18, long j17, int i19, java.lang.String str, int i27, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("report$default", "com.tencent.mm.plugin.sns.statistics.FinderReportSns21874");
        fVar.a(i17, i18, (i27 & 4) != 0 ? 0L : j17, (i27 & 8) != 0 ? -1 : i19, (i27 & 16) != 0 ? "" : str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("report$default", "com.tencent.mm.plugin.sns.statistics.FinderReportSns21874");
    }

    public final void a(int i17, int i18, long j17, int i19, java.lang.String finderContextId) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("report", "com.tencent.mm.plugin.sns.statistics.FinderReportSns21874");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderContextId, "finderContextId");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7159x1f557490 c7159x1f557490 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7159x1f557490();
        c7159x1f557490.f144639d = c7159x1f557490.b("sessionid", ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri(), true);
        c7159x1f557490.f144641f = c7159x1f557490.b("commentscene", java.lang.String.valueOf(i17), true);
        c7159x1f557490.f144642g = i18;
        c7159x1f557490.f144643h = c7159x1f557490.b("event_time", java.lang.String.valueOf(java.lang.System.currentTimeMillis()), true);
        c7159x1f557490.f144644i = c7159x1f557490.b("finderusername", ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(null), true);
        c7159x1f557490.f144648m = j17;
        c7159x1f557490.f144640e = c7159x1f557490.b("findercontextid", finderContextId, true);
        if (i19 != -1 && i18 == 1) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("nextstep", i19);
            c7159x1f557490.f144645j = c7159x1f557490.b("udf_kv", jSONObject.toString(), true);
        }
        c7159x1f557490.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderReportSns21874", "FinderReportSns21874 report scene:" + i17 + " eventCode:" + i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("report", "com.tencent.mm.plugin.sns.statistics.FinderReportSns21874");
    }
}
