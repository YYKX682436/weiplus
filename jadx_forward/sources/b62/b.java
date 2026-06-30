package b62;

/* loaded from: classes15.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final yj0.d f99674a = new b62.a();

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f99675b;

    public static boolean a(java.lang.String str) {
        java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342.c.f181316a.a(str);
        return "124".equals(a17) || "109".equals(a17);
    }

    public static void b(java.lang.String str) {
        if ("com.tencent.mm.plugin.scanner.ui.BaseScanUI".equals(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.ScanSessionHandler", "ScanSessionHandler, startMonitor: %s", str);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(android.util.Pair.create("goBack", "()V"));
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("com/tencent/mm/plugin/scanner/ui/BaseScanUI", arrayList);
            xj0.a.h().l(hashMap, f99674a);
        }
    }
}
