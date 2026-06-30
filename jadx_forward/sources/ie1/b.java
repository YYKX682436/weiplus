package ie1;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final ie1.b f372511a = new ie1.b();

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(java.lang.String apiName, boolean z17, long j17, long j18, int i17, java.lang.String errorMsg, java.lang.String issuerID, java.lang.String appId) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiName, "apiName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorMsg, "errorMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(issuerID, "issuerID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if ((ie1.a.f372509a.length() > 0) == true) {
            str = ie1.a.f372509a;
        } else {
            java.lang.String name = ge1.j.f352486a.b().name();
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(name, "UNSUPPORTED")) {
                ie1.a.f372509a = name;
            }
            str = ie1.a.f372509a;
        }
        java.lang.String str2 = ie1.a.f372510b;
        jx3.f.INSTANCE.d(37934, apiName, java.lang.Integer.valueOf(z17 ? 1 : 0), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf(i17), errorMsg, str, str2, issuerID, appId);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.TransitCard.Reporter", "report, apiName=" + apiName + ", result=" + z17 + ", duration=" + (j18 - j17) + "ms, errorCode=" + i17 + ", brandName=" + str + ", walletVersion=" + str2 + ", appId=" + appId);
    }
}
