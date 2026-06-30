package ts2;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ts2.a f503153a = new ts2.a();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f503154b;

    static {
        rg.c cVar = rg.c.DIMENSION_LEVEL_360;
        f503154b = "\n        {\n        \"level\":2,\n        \"interval\":1.0\n        }\n    ";
    }

    public static com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3978x9b06196b a(ts2.a aVar, java.lang.String session, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        aVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        dw3.h hVar = dw3.h.f325744a;
        java.lang.String a17 = hVar.a("mj".concat(session));
        if (z17) {
            com.p314xaae8f345.mm.vfs.w6.f(a17);
            hVar.a("mj".concat(session));
        }
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_template_record_security_config, f503154b, true);
        if (android.text.TextUtils.isEmpty(Zi)) {
            return null;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(Zi);
            rg.c cVar = rg.c.DIMENSION_LEVEL_360;
            rg.c a18 = rg.c.a(jSONObject.optInt(ya.b.f77487x44fa364, 2));
            double optDouble = jSONObject.optDouble("interval", 1.0d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordTemplateConfig", "getMJAuditCaptureSettings level:" + a18 + " interval:" + optDouble + " dir:" + a17);
            return new com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3978x9b06196b(a18, optDouble, jg.c.JPEGs, a17, "mjScy");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.RecordTemplateConfig", e17, "getMJAuditCaptureSettings error", new java.lang.Object[0]);
            return null;
        }
    }
}
