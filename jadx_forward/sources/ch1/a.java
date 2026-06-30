package ch1;

/* loaded from: classes15.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(java.lang.String appId, long j17, long j18, long j19, long j27, java.lang.String reportData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportData, "reportData");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6743xc6429d34 c6743xc6429d34 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6743xc6429d34();
        c6743xc6429d34.f140751d = c6743xc6429d34.b("AppId", appId, true);
        c6743xc6429d34.f140752e = j17;
        c6743xc6429d34.f140753f = j18;
        c6743xc6429d34.f140754g = 101L;
        c6743xc6429d34.f140755h = 101100L;
        c6743xc6429d34.f140756i = 1L;
        c6743xc6429d34.f140757j = j19;
        c6743xc6429d34.f140758k = j27;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("report_data", reportData);
        c6743xc6429d34.f140760m = c6743xc6429d34.b("ExternInfo", java.net.URLEncoder.encode(jSONObject.toString()), true);
        c6743xc6429d34.k();
    }
}
