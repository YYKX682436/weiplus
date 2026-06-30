package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class o8 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.appcache.o8 f75709a = new com.tencent.mm.plugin.appbrand.appcache.o8();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReference f75710b = new java.util.concurrent.atomic.AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f75711c = jz5.h.b(com.tencent.mm.plugin.appbrand.appcache.n8.f75687d);

    public final long a(com.tencent.mm.sdk.platformtools.o4 o4Var, java.lang.String str) {
        java.lang.String t17 = o4Var.t("expt_data_v2");
        if (t17 != null) {
            try {
                return new org.json.JSONObject(t17).optLong("issueTime", 0L);
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WxaGlobalExptLogic", str + " parse fail. data: " + t17);
            }
        }
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if (r0.get() == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaGlobalExptLogic", "compareAndSet:" + r3 + ", data:" + r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0023, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r0.compareAndSet(null, r1) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String b() {
        /*
            r6 = this;
            java.util.concurrent.atomic.AtomicReference r0 = com.tencent.mm.plugin.appbrand.appcache.o8.f75710b
            java.lang.Object r1 = r0.get()
            if (r1 != 0) goto L4b
            com.tencent.mm.sdk.platformtools.o4 r1 = r6.c()
            java.lang.String r2 = "MicroMsg.WxaGlobalExptLogic"
            if (r1 == 0) goto L46
            java.lang.String r3 = "expt_data_v2"
            java.lang.String r1 = r1.t(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L4b
        L1c:
            r3 = 0
            boolean r3 = r0.compareAndSet(r3, r1)
            if (r3 == 0) goto L25
            r3 = 1
            goto L2c
        L25:
            java.lang.Object r3 = r0.get()
            if (r3 == 0) goto L1c
            r3 = 0
        L2c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "compareAndSet:"
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = ", data:"
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            com.tencent.mars.xlog.Log.i(r2, r1)
            goto L4b
        L46:
            java.lang.String r1 = "getData fail. mmkv is null"
            com.tencent.mars.xlog.Log.w(r2, r1)
        L4b:
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.appcache.o8.b():java.lang.String");
    }

    public final com.tencent.mm.sdk.platformtools.o4 c() {
        com.tencent.mm.sdk.platformtools.o4 b17 = com.tencent.mm.plugin.appbrand.app.q0.f75227a.b("AppBrandGlobalExpt");
        if (b17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaGlobalExptLogic", "fail: mmkv not available.stack: " + android.util.Log.getStackTraceString(new java.lang.Throwable()));
        }
        return b17;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:20|21|(2:26|27)|29|30|31|32|(1:34)(1:35)|27) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(r45.tt3 r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.appcache.o8.d(r45.tt3, java.lang.String):void");
    }
}
