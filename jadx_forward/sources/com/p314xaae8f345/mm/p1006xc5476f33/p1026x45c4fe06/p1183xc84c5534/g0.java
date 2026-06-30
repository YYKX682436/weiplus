package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534;

/* loaded from: classes7.dex */
public final class g0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.d3 {

    /* renamed from: d, reason: collision with root package name */
    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f169381d;

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.g0 f169378a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.g0();

    /* renamed from: b, reason: collision with root package name */
    public static final long f169379b = java.util.concurrent.TimeUnit.SECONDS.toMillis(30);

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.LinkedList f169380c = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.Object f169382e = new java.lang.Object();

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.d3
    public void a(java.lang.String str, int i17) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        if ((r0.e()) != false) goto L20;
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.d3
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
            int r2 = r5.f468764d
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
            java.util.LinkedList r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.g0.f169380c
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
            java.lang.Object r5 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.g0.f169382e
            monitor-enter(r5)
            com.tencent.mm.sdk.platformtools.b4 r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.g0.f169381d     // Catch: java.lang.Throwable -> L57
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
            long r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.g0.f169379b     // Catch: java.lang.Throwable -> L57
            r0.c(r1, r1)     // Catch: java.lang.Throwable -> L57
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.g0.f169381d = r0     // Catch: java.lang.Throwable -> L57
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.g0.b(r45.uc7):void");
    }

    public final boolean c(java.lang.String reason, boolean z17) {
        java.util.LinkedList linkedList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        if (z17) {
            synchronized (f169382e) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = f169381d;
                if (b4Var != null) {
                    b4Var.d();
                }
                f169381d = null;
            }
        }
        java.util.LinkedList linkedList2 = f169380c;
        synchronized (linkedList2) {
            linkedList = new java.util.LinkedList(linkedList2);
            linkedList2.clear();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandIDKeyBatchReportNew", "reportNow, reason=" + reason + ", reportList.size=" + linkedList.size());
        if (linkedList.isEmpty()) {
            return false;
        }
        r45.nc7 nc7Var = new r45.nc7();
        r45.qp5 qp5Var = new r45.qp5();
        qp5Var.f465716d = android.os.Build.MANUFACTURER;
        qp5Var.f465717e = 2;
        jz5.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.c0.f169349a;
        qp5Var.f465718f = (java.lang.String) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.c0.f169350b).mo141623x754a37bb();
        java.lang.Object mo141623x754a37bb = ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.c0.f169349a).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        qp5Var.f465719g = (java.lang.String) mo141623x754a37bb;
        qp5Var.f465720h = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDisplayMetrics().widthPixels;
        qp5Var.f465721i = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDisplayMetrics().heightPixels;
        qp5Var.f465722m = (java.lang.String) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.c0.f169352d).mo141623x754a37bb();
        qp5Var.f465723n = (java.lang.String) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.c0.f169351c).mo141623x754a37bb();
        qp5Var.f465724o = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getConfiguration().locale.getLanguage();
        nc7Var.f462787e = qp5Var;
        nc7Var.f462786d.addAll(linkedList);
        ((km5.q) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0) nd.f.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0.class)).e1("/cgi-bin/mmbiz-bin/wxausrevent/wxaappidkeybatchreport", null, nc7Var, r45.oc7.class).a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.d0(reason, linkedList))).s(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.e0(reason, linkedList));
        return true;
    }
}
