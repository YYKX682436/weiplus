package com.p314xaae8f345.mm.app;

/* loaded from: classes12.dex */
public class w4 extends android.os.FileObserver {
    public w4(java.lang.String str) {
        super(str, 712);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        if (r6 != 512) goto L24;
     */
    @Override // android.os.FileObserver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onEvent(int r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r0 = "Detected trace file changed: "
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = com.p314xaae8f345.mm.app.y4.f135465e
            long r1 = r1 - r3
            r3 = 120000(0x1d4c0, double:5.9288E-319)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L12
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            if (r1 == 0) goto L16
            return
        L16:
            java.util.HashSet r1 = com.p314xaae8f345.mm.app.y4.f135464d
            monitor-enter(r1)
            r2 = 8
            if (r6 == r2) goto L2e
            r0 = 64
            if (r6 == r0) goto L2a
            r0 = 128(0x80, float:1.8E-43)
            if (r6 == r0) goto L57
            r0 = 512(0x200, float:7.17E-43)
            if (r6 == r0) goto L2a
            goto L5a
        L2a:
            r1.remove(r7)     // Catch: java.lang.Throwable -> L5c
            goto L5a
        L2e:
            java.lang.String r6 = "MicroMsg.MMLegacyANRMonitor"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L5c
            r2.append(r7)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L5c
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r0)     // Catch: java.lang.Throwable -> L5c
            android.os.ConditionVariable r6 = com.p314xaae8f345.mm.app.y4.f135463c     // Catch: java.lang.Throwable -> L5c
            r6.open()     // Catch: java.lang.Throwable -> L5c
            com.tencent.mm.app.x4 r6 = com.p314xaae8f345.mm.app.y4.f135466f     // Catch: java.lang.Throwable -> L5c
            if (r6 != 0) goto L57
            com.tencent.mm.app.x4 r6 = new com.tencent.mm.app.x4     // Catch: java.lang.Throwable -> L5c
            r0 = 0
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L5c
            com.p314xaae8f345.mm.app.y4.f135466f = r6     // Catch: java.lang.Throwable -> L5c
            com.tencent.mm.app.x4 r6 = com.p314xaae8f345.mm.app.y4.f135466f     // Catch: java.lang.Throwable -> L5c
            java.lang.String r0 = "MMCrashReporter_parseANRTrace"
            s75.d.b(r6, r0)     // Catch: java.lang.Throwable -> L5c
        L57:
            r1.add(r7)     // Catch: java.lang.Throwable -> L5c
        L5a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5c
            return
        L5c:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5c
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.app.w4.onEvent(int, java.lang.String):void");
    }
}
