package o63;

/* loaded from: classes9.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final o63.i f424735a = new o63.i();

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a() {
        int n17 = j62.e.g().n();
        if (n17 == 0) {
            return null;
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(n17 + "_FinderReportInfoMap");
    }

    public final r45.ld6 b(java.lang.String processName) {
        byte[] j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(processName, "processName");
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = a();
            if (a17 == null || (j17 = a17.j(processName.concat("_finderReportStartActivityKey"))) == null) {
                return null;
            }
            r45.ld6 ld6Var = new r45.ld6();
            ld6Var.mo11468x92b714fd(j17);
            return ld6Var;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderReportUtils", "getStartActivityInfo err " + e17.getMessage());
            return null;
        }
    }

    public final void c(java.lang.String processName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(processName, "processName");
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = a();
            if (a17 != null) {
                a17.remove(processName.concat("_finderReportStartActivityKey"));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderReportUtils", "resetStartActivityInfo err " + e17.getMessage());
        }
    }
}
