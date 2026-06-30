package com.tencent.mm.booter;

/* loaded from: classes12.dex */
public class i implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.booter.CoreService f63396d;

    public i(com.tencent.mm.booter.CoreService coreService) {
        this.f63396d = coreService;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0059  */
    @Override // com.tencent.mm.sdk.platformtools.a4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTimerExpired() {
        /*
            r11 = this;
            com.tencent.mm.booter.CoreService r0 = r11.f63396d
            x51.j0 r1 = r0.f63249t
            long r2 = r1.f452020a
            boolean r4 = com.tencent.mm.sdk.platformtools.t8.f192989a
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r4 = r4 - r2
            r2 = 180000(0x2bf20, double:8.8932E-319)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 >= 0) goto L4b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "frequency limited, last="
            r2.<init>(r5)
            long r5 = r1.f452020a
            r2.append(r5)
            java.lang.String r5 = ", cur="
            r2.append(r5)
            long r5 = android.os.SystemClock.elapsedRealtime()
            r2.append(r5)
            java.lang.String r5 = ", retries="
            r2.append(r5)
            int r5 = r1.f452021b
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = "MicroMsg.FrequncyLimiter"
            com.tencent.mars.xlog.Log.i(r5, r2)
            int r2 = r1.f452021b
            if (r2 > 0) goto L47
            r1 = r3
            goto L55
        L47:
            int r2 = r2 - r4
            r1.f452021b = r2
            goto L4e
        L4b:
            r2 = 3
            r1.f452021b = r2
        L4e:
            long r5 = android.os.SystemClock.elapsedRealtime()
            r1.f452020a = r5
            r1 = r4
        L55:
            java.lang.String r2 = "MicroMsg.CoreService"
            if (r1 != 0) goto L60
            java.lang.String r1 = "setNetworkAvailable checker frequency limited"
            com.tencent.mars.xlog.Log.e(r2, r1)
            goto L77
        L60:
            com.tencent.mm.booter.m r1 = new com.tencent.mm.booter.m
            com.tencent.mm.booter.CoreService r6 = r11.f63396d
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10)
            boolean r1 = r1.b()
            if (r1 == 0) goto L73
            goto L77
        L73:
            r1 = 0
            com.tencent.mm.booter.CoreService.f(r4, r1)
        L77:
            long r5 = r0.f63245p
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            long r5 = r0.f63247r
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            long r6 = java.lang.System.currentTimeMillis()
            long r8 = r0.f63246q
            long r6 = r6 - r8
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r5, r6}
            java.lang.String r5 = "setNetworkAvailable finish lockCount:%d delayCount:%d delayDur:%d"
            com.tencent.mars.xlog.Log.i(r2, r5, r1)
            r1 = 0
            r0.f63245p = r1
            r0.f63247r = r1
            r0.f63246q = r1
            com.tencent.mm.sdk.platformtools.b4 r0 = new com.tencent.mm.sdk.platformtools.b4
            com.tencent.mm.booter.h r1 = new com.tencent.mm.booter.h
            r1.<init>(r11)
            r0.<init>(r1, r3)
            r1 = 500(0x1f4, double:2.47E-321)
            r0.c(r1, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.booter.i.onTimerExpired():boolean");
    }
}
