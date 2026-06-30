package com.tencent.mm.plugin.appbrand.report;

/* loaded from: classes7.dex */
public final class g0 implements com.tencent.mm.plugin.appbrand.report.d3 {

    /* renamed from: d, reason: collision with root package name */
    public static com.tencent.mm.sdk.platformtools.b4 f87848d;

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.report.g0 f87845a = new com.tencent.mm.plugin.appbrand.report.g0();

    /* renamed from: b, reason: collision with root package name */
    public static final long f87846b = java.util.concurrent.TimeUnit.SECONDS.toMillis(30);

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.LinkedList f87847c = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.Object f87849e = new java.lang.Object();

    @Override // com.tencent.mm.plugin.appbrand.report.d3
    public void a(java.lang.String str, int i17) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        if ((r0.e()) != false) goto L20;
     */
    @Override // com.tencent.mm.plugin.appbrand.report.d3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(r45.uc7 r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L3
            return
        L3:
            java.lang.String r0 = "Luggage.AppBrandIDKeyBatchReportNew"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "writeIDKeyData type:"
            r1.<init>(r2)
            int r2 = r5.f387231d
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.mars.xlog.Log.i(r0, r1)
            java.util.LinkedList r0 = com.tencent.mm.plugin.appbrand.report.g0.f87847c
            monitor-enter(r0)
            r0.addLast(r5)     // Catch: java.lang.Throwable -> L5a
            int r5 = r0.size()     // Catch: java.lang.Throwable -> L5a
            monitor-exit(r0)
            r0 = 50
            r1 = 1
            if (r5 < r0) goto L30
            java.lang.String r5 = "writeIDKeyData"
            r4.c(r5, r1)
            goto L56
        L30:
            java.lang.Object r5 = com.tencent.mm.plugin.appbrand.report.g0.f87849e
            monitor-enter(r5)
            com.tencent.mm.sdk.platformtools.b4 r0 = com.tencent.mm.plugin.appbrand.report.g0.f87848d     // Catch: java.lang.Throwable -> L57
            if (r0 == 0) goto L42
            boolean r0 = r0.e()     // Catch: java.lang.Throwable -> L57
            if (r0 != r1) goto L3f
            r0 = r1
            goto L40
        L3f:
            r0 = 0
        L40:
            if (r0 == 0) goto L55
        L42:
            com.tencent.mm.sdk.platformtools.b4 r0 = new com.tencent.mm.sdk.platformtools.b4     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = "Luggage.AppBrandIDKeyBatchReportNew"
            com.tencent.mm.plugin.appbrand.report.f0 r3 = new com.tencent.mm.plugin.appbrand.report.f0     // Catch: java.lang.Throwable -> L57
            r3.<init>()     // Catch: java.lang.Throwable -> L57
            r0.<init>(r2, r3, r1)     // Catch: java.lang.Throwable -> L57
            long r1 = com.tencent.mm.plugin.appbrand.report.g0.f87846b     // Catch: java.lang.Throwable -> L57
            r0.c(r1, r1)     // Catch: java.lang.Throwable -> L57
            com.tencent.mm.plugin.appbrand.report.g0.f87848d = r0     // Catch: java.lang.Throwable -> L57
        L55:
            monitor-exit(r5)
        L56:
            return
        L57:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L5a:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.report.g0.b(r45.uc7):void");
    }

    public final boolean c(java.lang.String reason, boolean z17) {
        java.util.LinkedList linkedList;
        kotlin.jvm.internal.o.g(reason, "reason");
        if (z17) {
            synchronized (f87849e) {
                com.tencent.mm.sdk.platformtools.b4 b4Var = f87848d;
                if (b4Var != null) {
                    b4Var.d();
                }
                f87848d = null;
            }
        }
        java.util.LinkedList linkedList2 = f87847c;
        synchronized (linkedList2) {
            linkedList = new java.util.LinkedList(linkedList2);
            linkedList2.clear();
        }
        com.tencent.mars.xlog.Log.i("Luggage.AppBrandIDKeyBatchReportNew", "reportNow, reason=" + reason + ", reportList.size=" + linkedList.size());
        if (linkedList.isEmpty()) {
            return false;
        }
        r45.nc7 nc7Var = new r45.nc7();
        r45.qp5 qp5Var = new r45.qp5();
        qp5Var.f384183d = android.os.Build.MANUFACTURER;
        qp5Var.f384184e = 2;
        jz5.g gVar = com.tencent.mm.plugin.appbrand.report.c0.f87816a;
        qp5Var.f384185f = (java.lang.String) ((jz5.n) com.tencent.mm.plugin.appbrand.report.c0.f87817b).getValue();
        java.lang.Object value = ((jz5.n) com.tencent.mm.plugin.appbrand.report.c0.f87816a).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        qp5Var.f384186g = (java.lang.String) value;
        qp5Var.f384187h = com.tencent.mm.sdk.platformtools.x2.f193075e.getDisplayMetrics().widthPixels;
        qp5Var.f384188i = com.tencent.mm.sdk.platformtools.x2.f193075e.getDisplayMetrics().heightPixels;
        qp5Var.f384189m = (java.lang.String) ((jz5.n) com.tencent.mm.plugin.appbrand.report.c0.f87819d).getValue();
        qp5Var.f384190n = (java.lang.String) ((jz5.n) com.tencent.mm.plugin.appbrand.report.c0.f87818c).getValue();
        qp5Var.f384191o = com.tencent.mm.sdk.platformtools.x2.f193075e.getConfiguration().locale.getLanguage();
        nc7Var.f381254e = qp5Var;
        nc7Var.f381253d.addAll(linkedList);
        ((km5.q) ((com.tencent.mm.plugin.appbrand.networking.c0) nd.f.a(com.tencent.mm.plugin.appbrand.networking.c0.class)).e1("/cgi-bin/mmbiz-bin/wxausrevent/wxaappidkeybatchreport", null, nc7Var, r45.oc7.class).a(new com.tencent.mm.plugin.appbrand.report.d0(reason, linkedList))).s(new com.tencent.mm.plugin.appbrand.report.e0(reason, linkedList));
        return true;
    }
}
