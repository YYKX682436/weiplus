package wh;

/* loaded from: classes12.dex */
public class k2 implements wh.a2 {
    @Override // wh.a2
    public java.lang.Object a(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        return null;
    }

    @Override // wh.a2
    public void b(java.lang.reflect.Method method, java.lang.Object[] objArr) {
        if ("startScan".equals(method.getName())) {
            java.util.Iterator it = ((java.util.ArrayList) wh.m2.f527366a).iterator();
            while (it.hasNext()) {
                rh.e4 e4Var = ((rh.a4) ((wh.l2) it.next())).f476838a;
                java.lang.String b17 = e4Var.j() ? e4Var.f476827a.f444868d.A.b() : "";
                oj.j.c("Matrix.battery.WifiMonitorFeature", "#onStartScan, stack = " + b17, new java.lang.Object[0]);
                rh.d4 d4Var = e4Var.f476905b;
                d4Var.getClass();
                if (!android.text.TextUtils.isEmpty(b17)) {
                    d4Var.f476901c = b17;
                }
                d4Var.f476899a++;
            }
            return;
        }
        if ("getScanResults".equals(method.getName())) {
            java.util.Iterator it6 = ((java.util.ArrayList) wh.m2.f527366a).iterator();
            while (it6.hasNext()) {
                rh.e4 e4Var2 = ((rh.a4) ((wh.l2) it6.next())).f476838a;
                java.lang.String b18 = e4Var2.j() ? e4Var2.f476827a.f444868d.A.b() : "";
                oj.j.c("Matrix.battery.WifiMonitorFeature", "#onGetScanResults, stack = " + b18, new java.lang.Object[0]);
                rh.d4 d4Var2 = e4Var2.f476905b;
                d4Var2.getClass();
                if (!android.text.TextUtils.isEmpty(b18)) {
                    d4Var2.f476901c = b18;
                }
                d4Var2.f476900b++;
            }
        }
    }
}
