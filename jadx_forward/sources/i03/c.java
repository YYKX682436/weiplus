package i03;

/* loaded from: classes11.dex */
public final class c implements io.p3284xd2ae381c.p3301xc5476f33.p3307xc84c5534.C28745x90fedd41.ReportCallback {
    public static final java.lang.String a(i03.c cVar, java.lang.String str, int i17) {
        cVar.getClass();
        java.lang.String u17 = r26.i0.u(str, ',', ' ', false, 4, null);
        if (u17.length() <= i17) {
            return u17;
        }
        java.lang.String substring = u17.substring(0, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        return substring;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3307xc84c5534.C28745x90fedd41.ReportCallback
    /* renamed from: onReport */
    public void mo134328x57412bf3(java.lang.String str, java.lang.String[] strArr, long j17, java.lang.String str2) {
        int Ai;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onReport, runner:");
        sb6.append(str);
        sb6.append(", duration:");
        sb6.append(j17);
        sb6.append(", stackTraces:");
        sb6.append(strArr != null ? java.lang.Integer.valueOf(strArr.length) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterSlowRunnerReport", sb6.toString());
        if (strArr != null) {
            if ((strArr.length == 0) || (Ai = ((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ai()) == 0) {
                return;
            }
            pm0.v.K(null, new i03.b(str, j17, this, strArr, str2, Ai));
        }
    }
}
