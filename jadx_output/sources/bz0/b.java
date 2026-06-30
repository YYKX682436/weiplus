package bz0;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final bz0.b f36724a = new bz0.b();

    /* renamed from: b, reason: collision with root package name */
    public static long f36725b;

    public static void b(bz0.b bVar, java.lang.String str, com.tencent.maas.instamovie.base.MJError mJError, long j17, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 8) != 0) {
            i17 = bz0.a.f36723b;
        }
        bVar.a(str, mJError, j17, i17);
    }

    public static void d(bz0.b bVar, java.lang.String str, long j17, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 4) != 0) {
            i17 = bz0.a.f36723b;
        }
        bVar.c(str, j17, i17);
    }

    public final void a(java.lang.String funName, com.tencent.maas.instamovie.base.MJError error, long j17, int i17) {
        kotlin.jvm.internal.o.g(funName, "funName");
        kotlin.jvm.internal.o.g(error, "error");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.tencent.maas.instamovie.base.MJError.MaasEC maasEC = error.f48175ec;
        jSONObject.put("ec", maasEC != null ? java.lang.Integer.valueOf(maasEC.getErrorCode()) : null);
        jSONObject.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, error.message);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        e(100, funName, r26.i0.t(jSONObject2, ",", ";", false), j17, i17);
    }

    public final void c(java.lang.String funName, long j17, int i17) {
        kotlin.jvm.internal.o.g(funName, "funName");
        e(100, funName, ya.b.SUCCESS, j17, i17);
    }

    public final void e(int i17, java.lang.String str, java.lang.String str2, long j17, int i18) {
        com.tencent.mars.xlog.Log.i("MaasReport24945", "reportMMEvent() called with: eType = " + i17 + ", funName = " + str + ", result = " + str2 + ", callSpend = " + j17);
        com.tencent.mm.autogen.mmdata.rpt.MaaSEventReportStruct maaSEventReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MaaSEventReportStruct();
        maaSEventReportStruct.f58944d = maaSEventReportStruct.b("sessionKey", bz0.a.f36722a, true);
        maaSEventReportStruct.f58945e = i18;
        maaSEventReportStruct.f58946f = i17;
        maaSEventReportStruct.f58947g = maaSEventReportStruct.b("maasVersionCode", "2008004", true);
        maaSEventReportStruct.f58962v = maaSEventReportStruct.b("asyncFuncName", str, true);
        maaSEventReportStruct.f58963w = maaSEventReportStruct.b("asyncFuncResult", str2, true);
        maaSEventReportStruct.f58964x = j17;
        long j18 = f36725b;
        f36725b = 1 + j18;
        maaSEventReportStruct.f58965y = j18;
        maaSEventReportStruct.k();
    }
}
