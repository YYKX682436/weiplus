package a62;

/* loaded from: classes15.dex */
public abstract class b {
    public static boolean a(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellSessionDetailReport", "reportSessionDetail: %s", str);
        java.util.List c17 = jx3.a.c(str.replace(',', '#'), 5120);
        if (c17 == null) {
            return false;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6864x30fdb695 c6864x30fdb695 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6864x30fdb695();
        c6864x30fdb695.f141811d = android.os.Process.myPid();
        c6864x30fdb695.f141812e = c6864x30fdb695.b("PName", ((km0.c) gm0.j1.p().a()).f390520a, true);
        c6864x30fdb695.f141813f = jx3.a.e();
        java.util.ArrayList arrayList = (java.util.ArrayList) c17;
        c6864x30fdb695.f141815h = arrayList.size();
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            c6864x30fdb695.f141814g = i17;
            c6864x30fdb695.f141816i = c6864x30fdb695.b("DataContent", (java.lang.String) arrayList.get(i17), false);
            c6864x30fdb695.k();
        }
        return true;
    }
}
