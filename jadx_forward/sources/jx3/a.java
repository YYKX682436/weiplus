package jx3;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: b, reason: collision with root package name */
    public static final kk.j f383972b = new kk.l(50);

    /* renamed from: c, reason: collision with root package name */
    public static int f383973c = 1;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f383974a = new java.util.concurrent.ConcurrentHashMap();

    public static java.util.List c(java.lang.String str, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            int ceil = (int) java.lang.Math.ceil(str.length() / i17);
            int i18 = 0;
            while (i18 < ceil) {
                int i19 = i18 * i17;
                i18++;
                arrayList.add(str.substring(i19, java.lang.Math.min(i18 * i17, str.length())));
            }
            return arrayList;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AbsReportStruct", e17, "check to report list error [%s]", e17.toString());
            return null;
        }
    }

    public static int e() {
        int myPid = android.os.Process.myPid();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(myPid);
        sb6.append("_");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(java.lang.System.currentTimeMillis());
        sb6.append("_");
        int i17 = f383973c;
        f383973c = i17 + 1;
        sb6.append(i17);
        return java.lang.Math.abs(sb6.toString().hashCode());
    }

    public boolean a(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AbsReportStruct", "error report [%d] msg[%s %s]", java.lang.Integer.valueOf(g()), "", "check rpt value is null.");
            return false;
        }
        if (str.length() < 7168) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AbsReportStruct", "error report [%d] msg[%s %s]", java.lang.Integer.valueOf(g()), "", "check rpt value more than 7k.");
        return false;
    }

    public java.lang.String b(java.lang.String str, java.lang.String str2, boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || !str2.contains(",")) {
            return str2;
        }
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.a9.f273996a;
        if (!(!yp5.a.f545942a.a()) && z17) {
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AbsReportStruct", "error report [%d] msg[%s %s]", java.lang.Integer.valueOf(g()), str, "value contain comma, please confirm your logic. value :".concat(str2));
        return str2.replace(',', ' ');
    }

    public final boolean d() {
        int g17 = g();
        java.lang.String m17 = m();
        boolean z17 = false;
        if (g17 > 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m17)) {
            int hashCode = (g17 + "," + m17).hashCode();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.r2) f383972b;
            java.lang.Long l17 = (java.lang.Long) r2Var.get(java.lang.Integer.valueOf(hashCode));
            if (java.lang.System.currentTimeMillis() - (l17 != null ? l17.longValue() : 0L) >= 300000) {
                int g18 = g();
                g();
                n();
                java.lang.String m18 = m();
                if (g18 > 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m18)) {
                    z17 = jx3.f.INSTANCE.h(g(), m18);
                }
                if (z17) {
                    r2Var.put(java.lang.Integer.valueOf(hashCode), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                }
            }
        }
        return z17;
    }

    public java.lang.Object f(java.lang.String str) {
        return this.f383974a.get(str.toLowerCase(java.util.Locale.getDefault()));
    }

    public abstract int g();

    public long h(java.lang.String str) {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(str, 0L);
    }

    public long i() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return java.lang.System.currentTimeMillis();
    }

    public void j(java.lang.String str, java.lang.Object obj) {
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.getDefault());
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f383974a;
        if (obj != null) {
            concurrentHashMap.put(lowerCase, obj);
        } else {
            concurrentHashMap.remove(lowerCase);
        }
    }

    public final boolean k() {
        int g17 = g();
        g();
        n();
        java.lang.String m17 = m();
        if (g17 <= 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m17)) {
            return false;
        }
        jx3.f.INSTANCE.mo68478xbd3cda5f(g(), m17);
        return true;
    }

    public final boolean l() {
        int g17 = g();
        g();
        n();
        java.lang.String m17 = m();
        if (g17 <= 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m17)) {
            return false;
        }
        jx3.f.INSTANCE.p(g(), m17, false, false, true);
        return true;
    }

    public abstract java.lang.String m();

    public abstract java.lang.String n();

    public final void o() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbsReportStruct", "[report%s] %s", java.lang.Integer.valueOf(g()), n().replace(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e, " "));
    }
}
