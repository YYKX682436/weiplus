package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes7.dex */
public class i0 implements ih1.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f88685a;

    public i0(com.tencent.mm.plugin.appbrand.service.c0 c0Var) {
        this.f88685a = c0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031 A[Catch: Exception -> 0x0055, TryCatch #0 {Exception -> 0x0055, blocks: (B:3:0x0004, B:7:0x0023, B:12:0x003b, B:13:0x003e, B:17:0x0031, B:22:0x0013, B:19:0x000d), top: B:2:0x0004, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            r10 = this;
            java.lang.String r0 = "MicroMsg.AppBrandServiceWC"
            com.tencent.mm.plugin.appbrand.service.c0 r1 = r10.f88685a
            com.tencent.mm.plugin.appbrand.page.n7 r2 = r1.V0()     // Catch: java.lang.Exception -> L55
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L22
            boolean r2 = r2.l2()     // Catch: java.lang.Exception -> L12
            goto L23
        L12:
            r2 = move-exception
            java.lang.String r6 = "MagicAdMiniProgramInstaller[%s], isInForeground() exception: %s"
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L55
            java.lang.String r8 = r1.getAppId()     // Catch: java.lang.Exception -> L55
            r7[r5] = r8     // Catch: java.lang.Exception -> L55
            r7[r4] = r2     // Catch: java.lang.Exception -> L55
            com.tencent.mars.xlog.Log.e(r0, r6, r7)     // Catch: java.lang.Exception -> L55
        L22:
            r2 = r5
        L23:
            com.tencent.mm.plugin.appbrand.service.c0 r6 = r10.f88685a     // Catch: java.lang.Exception -> L55
            java.lang.Class<ae.q> r7 = ae.q.class
            java.lang.Object r6 = r6.z1(r7)     // Catch: java.lang.Exception -> L55
            ae.q r6 = (ae.q) r6     // Catch: java.lang.Exception -> L55
            if (r6 != 0) goto L31
            r6 = 0
            goto L37
        L31:
            ae.a r6 = (ae.a) r6     // Catch: java.lang.Exception -> L55
            ud.b r6 = r6.f3335y     // Catch: java.lang.Exception -> L55
            com.tencent.magicbrush.MagicBrush r6 = r6.f426569c     // Catch: java.lang.Exception -> L55
        L37:
            if (r2 == 0) goto L3e
            if (r6 == 0) goto L3e
            r6.f()     // Catch: java.lang.Exception -> L55
        L3e:
            java.lang.String r7 = "MagicAdMiniProgramInstaller[%s], onShowMBAD, isInFg: %d, mb: %s"
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Exception -> L55
            java.lang.String r9 = r1.getAppId()     // Catch: java.lang.Exception -> L55
            r8[r5] = r9     // Catch: java.lang.Exception -> L55
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L55
            r8[r4] = r2     // Catch: java.lang.Exception -> L55
            r8[r3] = r6     // Catch: java.lang.Exception -> L55
            com.tencent.mars.xlog.Log.i(r0, r7, r8)     // Catch: java.lang.Exception -> L55
            goto L63
        L55:
            r2 = move-exception
            java.lang.String r1 = r1.getAppId()
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            java.lang.String r2 = "MagicAdMiniProgramInstaller[%s], onHideMBAD exception: %s"
            com.tencent.mars.xlog.Log.e(r0, r2, r1)
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.service.i0.a():void");
    }
}
