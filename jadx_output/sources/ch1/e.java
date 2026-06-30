package ch1;

/* loaded from: classes7.dex */
public class e implements uh1.h1 {
    /* JADX WARN: Can't wrap try/catch for region: R(12:5|(11:7|(1:9)(2:25|(1:27)(2:28|(1:30)))|10|11|12|13|14|15|(1:17)(1:21)|18|19)|31|10|11|12|13|14|15|(0)(0)|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.Report.kv_14510", "kv_14510 report UnsupportedEncodingException");
        r5 = r25;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, long r26, long r28, int r30, int r31, int r32, long r33, java.lang.String r35, java.lang.String r36) {
        /*
            r21 = this;
            r4 = r23
            com.tencent.mm.plugin.appbrand.o6 r0 = com.tencent.mm.plugin.appbrand.l.b(r22)
            if (r0 != 0) goto La
            goto Lcf
        La:
            com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC r1 = r0.E0()
            if (r1 != 0) goto L12
            goto Lcf
        L12:
            java.lang.Class<uh1.a> r2 = uh1.a.class
            com.tencent.mm.plugin.appbrand.jsapi.g0 r0 = r0.b(r2)
            uh1.a r0 = (uh1.a) r0
            if (r0 == 0) goto L3d
            java.lang.String r2 = "createRequestTask"
            boolean r2 = r4.equalsIgnoreCase(r2)
            if (r2 == 0) goto L27
            int r0 = r0.f427745i
            goto L3f
        L27:
            java.lang.String r2 = "createDownloadTask"
            boolean r2 = r4.equalsIgnoreCase(r2)
            if (r2 == 0) goto L32
            int r0 = r0.f427748o
            goto L3f
        L32:
            java.lang.String r2 = "createUploadTask"
            boolean r2 = r4.equalsIgnoreCase(r2)
            if (r2 == 0) goto L3d
            int r0 = r0.f427747n
            goto L3f
        L3d:
            r0 = 10
        L3f:
            java.lang.String r2 = "utf-8"
            r3 = r25
            java.lang.String r2 = fp.s0.b(r3, r2)     // Catch: java.io.UnsupportedEncodingException -> L4c
            r5 = r2
            goto L54
        L4a:
            r3 = r25
        L4c:
            java.lang.String r2 = "kv_14510 report UnsupportedEncodingException"
            java.lang.String r5 = "MicroMsg.AppBrand.Report.kv_14510"
            com.tencent.mars.xlog.Log.w(r5, r2)
            r5 = r3
        L54:
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r2 = r1.f305852r
            int r2 = r2.pkgVersion
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r1 = r1.f305852r
            int r1 = r1.f75399d
            r3 = 1
            int r6 = r1 + 1
            android.content.Context r1 = com.tencent.mm.sdk.platformtools.x2.f193071a
            java.lang.String r12 = com.tencent.mm.plugin.appbrand.report.q2.b(r1)
            int r13 = com.tencent.mm.plugin.appbrand.report.v0.d(r22)
            r15 = r22
            com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime r1 = com.tencent.mm.plugin.appbrand.report.quality.e.b(r15, r3)
            if (r1 == 0) goto L7e
            long r7 = r1.f88145q
            long r7 = r33 - r7
            long r9 = r1.f88149u
            long r9 = r33 - r9
            r16 = r7
            r18 = r9
            goto L84
        L7e:
            r7 = 0
            r16 = r7
            r18 = r16
        L84:
            com.tencent.mm.plugin.appbrand.report.d r3 = com.tencent.mm.plugin.appbrand.report.d.f87824a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            java.lang.Long r7 = java.lang.Long.valueOf(r26)
            java.lang.Long r8 = java.lang.Long.valueOf(r28)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r30)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r31)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r32)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            java.lang.Long r6 = java.lang.Long.valueOf(r16)
            r15 = r6
            java.lang.Long r16 = java.lang.Long.valueOf(r18)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r0)
            r0 = r22
            r13 = r3
            r3 = r12
            r4 = r23
            r6 = r24
            r12 = r35
            r20 = r13
            r13 = r36
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17}
            r1 = 14510(0x38ae, float:2.0333E-41)
            r2 = r20
            r2.b(r1, r0)
            com.tencent.mars.xlog.Log.getLogLevel()
        Lcf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ch1.e.b(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, long, int, int, int, long, java.lang.String, java.lang.String):void");
    }
}
