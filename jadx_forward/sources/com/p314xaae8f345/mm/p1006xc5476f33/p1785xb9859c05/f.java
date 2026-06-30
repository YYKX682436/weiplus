package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05;

/* loaded from: classes14.dex */
public class f implements java.lang.Runnable {
    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.j jVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r10 = this;
            wq4.k0 r6 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.aj()
            java.lang.String r1 = "ipcall_phonering"
            r0 = 0
            r6.getClass()
            java.lang.String r7 = "MicroMsg.RingPlayer"
            r8 = 1
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()     // Catch: java.lang.Exception -> L4d
            if (r2 == 0) goto L2b
            gm0.b0 r2 = gm0.j1.u()     // Catch: java.lang.Exception -> L4d
            com.tencent.mm.storage.n3 r2 = r2.c()     // Catch: java.lang.Exception -> L4d
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L4d
            r4 = 73218(0x11e02, float:1.026E-40)
            java.lang.Object r2 = r2.l(r4, r3)     // Catch: java.lang.Exception -> L4d
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Exception -> L4d
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Exception -> L4d
            goto L2c
        L2b:
            r2 = r8
        L2c:
            boolean r3 = ip.b.b()     // Catch: java.lang.Exception -> L4b
            java.lang.String r4 = "startPlayCustomRingWithCustomInterval, voipSound: %s, msgSound: %s, isCallingParty: %s"
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L4b
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Exception -> L4b
            r5[r0] = r9     // Catch: java.lang.Exception -> L4b
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Exception -> L4b
            r5[r8] = r3     // Catch: java.lang.Exception -> L4b
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L4b
            r9 = 2
            r5[r9] = r3     // Catch: java.lang.Exception -> L4b
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r7, r4, r5)     // Catch: java.lang.Exception -> L4b
            r2 = r8
            goto L65
        L4b:
            r3 = move-exception
            goto L50
        L4d:
            r2 = move-exception
            r3 = r2
            r2 = r8
        L50:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "get voip sound failed: "
            r4.<init>(r5)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r7, r3)
        L65:
            if (r2 != 0) goto L68
            goto Lad
        L68:
            boolean r2 = r6.f530184e
            if (r2 == 0) goto L6d
            goto Lad
        L6d:
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L97
            r6.f530185f = r2     // Catch: java.lang.Exception -> L97
            to.g r2 = new to.g     // Catch: java.lang.Exception -> L97
            r2.<init>()     // Catch: java.lang.Exception -> L97
            r6.f530182c = r2     // Catch: java.lang.Exception -> L97
            ym1.f.Ni()     // Catch: java.lang.Exception -> L97
            ym1.f.Ri()     // Catch: java.lang.Exception -> L97
            wo.c r2 = wo.v1.f529356c     // Catch: java.lang.Exception -> L97
            int r2 = r2.H     // Catch: java.lang.Exception -> L97
            r3 = -1
            if (r2 <= r3) goto L89
            r5 = r2
            goto L8a
        L89:
            r5 = r0
        L8a:
            r6.c(r0)     // Catch: java.lang.Exception -> L97
            r2 = 3500(0xdac, double:1.729E-320)
            r4 = 1
            r0 = r6
            r0.d(r1, r2, r4, r5)     // Catch: java.lang.Exception -> L97
            r6.f530184e = r8     // Catch: java.lang.Exception -> L97
            goto Lad
        L97:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "new MediaPlayer failed, "
            r1.<init>(r2)
            java.lang.String r0 = r0.toString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r7, r0)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.f.run():void");
    }
}
