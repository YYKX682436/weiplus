package bz0;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final bz0.b f118257a = new bz0.b();

    /* renamed from: b, reason: collision with root package name */
    public static long f118258b;

    public static void b(bz0.b bVar, java.lang.String str, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b, long j17, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 8) != 0) {
            i17 = bz0.a.f118256b;
        }
        bVar.a(str, c4093x6b88526b, j17, i17);
    }

    public static void d(bz0.b bVar, java.lang.String str, long j17, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 4) != 0) {
            i17 = bz0.a.f118256b;
        }
        bVar.c(str, j17, i17);
    }

    public final void a(java.lang.String funName, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b error, long j17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(funName, "funName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(error, "error");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b.MaasEC maasEC = error.f129708ec;
        jSONObject.put("ec", maasEC != null ? java.lang.Integer.valueOf(maasEC.m33752x130a215f()) : null);
        jSONObject.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, error.f16057x38eb0007);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        e(100, funName, r26.i0.t(jSONObject2, ",", ";", false), j17, i17);
    }

    public final void c(java.lang.String funName, long j17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(funName, "funName");
        e(100, funName, ya.b.f77504xbb80cbe3, j17, i17);
    }

    public final void e(int i17, java.lang.String str, java.lang.String str2, long j17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasReport24945", "reportMMEvent() called with: eType = " + i17 + ", funName = " + str + ", result = " + str2 + ", callSpend = " + j17);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6708xb03371bd c6708xb03371bd = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6708xb03371bd();
        c6708xb03371bd.f140477d = c6708xb03371bd.b("sessionKey", bz0.a.f118255a, true);
        c6708xb03371bd.f140478e = i18;
        c6708xb03371bd.f140479f = i17;
        c6708xb03371bd.f140480g = c6708xb03371bd.b("maasVersionCode", "2008004", true);
        c6708xb03371bd.f140495v = c6708xb03371bd.b("asyncFuncName", str, true);
        c6708xb03371bd.f140496w = c6708xb03371bd.b("asyncFuncResult", str2, true);
        c6708xb03371bd.f140497x = j17;
        long j18 = f118258b;
        f118258b = 1 + j18;
        c6708xb03371bd.f140498y = j18;
        c6708xb03371bd.k();
    }
}
