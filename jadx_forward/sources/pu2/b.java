package pu2;

/* loaded from: classes8.dex */
public final class b {
    public final void a(ts5.p uniqueTag, pu2.a reportStruct) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uniqueTag, "uniqueTag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportStruct, "reportStruct");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TrendsReporter", "uniqueTag=" + uniqueTag + " report=" + reportStruct);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7158xf042dd92 c7158xf042dd92 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7158xf042dd92();
        c7158xf042dd92.f144634d = reportStruct.f439955a;
        c7158xf042dd92.f144635e = 2;
        c7158xf042dd92.f144636f = reportStruct.f439956b;
        java.lang.String jSONObject = reportStruct.f439957c.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        c7158xf042dd92.f144637g = c7158xf042dd92.b("result", r26.i0.t(jSONObject, ",", ";", false), true);
        java.util.Map map = reportStruct.f439958d;
        if (map != null) {
            if (!(!map.isEmpty())) {
                map = null;
            }
            if (map != null) {
                java.lang.String jSONObject2 = new org.json.JSONObject(map).toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                c7158xf042dd92.f144638h = c7158xf042dd92.b("extraJson", r26.i0.t(jSONObject2, ",", ";", false), true);
            }
        }
        c7158xf042dd92.k();
    }
}
