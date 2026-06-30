package com.tencent.mm.app;

/* loaded from: classes12.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f53566d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.s f53567e;

    public p(com.tencent.mm.app.s sVar, java.lang.String str) {
        this.f53567e = sVar;
        this.f53566d = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r17 = this;
            r0 = r17
            com.tencent.mm.app.s r1 = r0.f53567e
            com.tencent.mm.app.t r1 = r1.f53758e
            com.tencent.mm.app.w r1 = r1.f53777c
            boolean r1 = r1.f53889n
            r2 = 1
            if (r1 != 0) goto L18
            com.tencent.mm.app.s r1 = r0.f53567e
            com.tencent.mm.app.t r1 = r1.f53758e
            com.tencent.mm.app.v r1 = r1.f53776b
            java.lang.String r3 = r0.f53566d
            r1.a(r2, r3)
        L18:
            com.tencent.mm.app.d5 r1 = com.tencent.mm.app.d5.f53384a
            java.lang.String r3 = r0.f53566d
            java.lang.String r4 = "activityName"
            kotlin.jvm.internal.o.g(r3, r4)
            com.tencent.mm.app.d5.f53393j = r2
            java.lang.String r3 = r0.f53566d
            if (r3 != 0) goto L29
            goto Lc3
        L29:
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = com.tencent.mm.app.d5.f53389f
            long r6 = r4 - r6
            long r8 = com.tencent.mm.app.d5.f53392i
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            r13 = 0
            if (r12 <= 0) goto L4d
            long r14 = com.tencent.mm.app.d5.f53391h
            r12 = 60000(0xea60, float:8.4078E-41)
            r16 = r3
            long r2 = (long) r12
            long r14 = r14 - r2
            int r2 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r2 < 0) goto L4f
            int r2 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r2 > 0) goto L4f
            r2 = 1
            goto L50
        L4d:
            r16 = r3
        L4f:
            r2 = r13
        L50:
            boolean r3 = com.tencent.mm.app.d5.f53387d
            if (r3 == 0) goto L67
            long r8 = com.tencent.mm.app.d5.f53389f
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 <= 0) goto L67
            boolean r3 = com.tencent.mm.app.d5.f53390g
            if (r3 == 0) goto L67
            long r8 = com.tencent.mm.app.d5.f53391h
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 <= 0) goto L67
            if (r2 != 0) goto L67
            r13 = 1
        L67:
            if (r13 == 0) goto Lc3
            long r8 = com.tencent.mm.app.d5.f53391h
            long r8 = r4 - r8
            long r12 = com.tencent.mm.app.d5.f53392i
            int r3 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r3 <= 0) goto L75
            long r4 = r4 - r12
            goto L77
        L75:
            r4 = -1
        L77:
            r3 = 1
            r1.d(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r10 = "State inconsistency detected! activity="
            r3.<init>(r10)
            r10 = r16
            r3.append(r10)
            java.lang.String r11 = ", scenario=scenario1, timeSinceMatrixBgToFg="
            r3.append(r11)
            r3.append(r6)
            java.lang.String r11 = "ms, timeSinceMatrixBackground="
            r3.append(r11)
            r3.append(r8)
            java.lang.String r8 = "ms, timeSinceAppDelegateBackground="
            r3.append(r8)
            r3.append(r4)
            java.lang.String r4 = "ms, appDelegateBackgroundTimeValid="
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = ", appDelegateStateWhenBg="
            r3.append(r2)
            boolean r2 = com.tencent.mm.app.d5.f53390g
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "MicroMsg.MatrixLifecycleForegroundMonitor"
            com.tencent.mars.xlog.Log.w(r3, r2)
            java.lang.String r2 = "scenario1"
            r1.c(r10, r6, r2)
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.app.p.run():void");
    }
}
