package b62;

/* loaded from: classes15.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final yj0.d f18141a = new b62.a();

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f18142b;

    public static boolean a(java.lang.String str) {
        java.lang.String a17 = com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.f99783a.a(str);
        return "124".equals(a17) || "109".equals(a17);
    }

    public static void b(java.lang.String str) {
        if ("com.tencent.mm.plugin.scanner.ui.BaseScanUI".equals(str)) {
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.ScanSessionHandler", "ScanSessionHandler, startMonitor: %s", str);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(android.util.Pair.create("goBack", "()V"));
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("com/tencent/mm/plugin/scanner/ui/BaseScanUI", arrayList);
            xj0.a.h().l(hashMap, f18141a);
        }
    }
}
