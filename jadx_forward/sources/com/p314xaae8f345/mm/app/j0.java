package com.p314xaae8f345.mm.app;

/* loaded from: classes12.dex */
public class j0 extends android.os.FileObserver {
    public j0(java.lang.String str) {
        super(str, 8);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CrashDoubleUploader", "start FileObserver(%s) in process:%s", str, bm5.f1.a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        if ((java.lang.System.currentTimeMillis() - com.p314xaae8f345.mm.app.k0.f135010m) >= 2000) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        r8 = com.p314xaae8f345.mm.app.k0.f135007g;
        r8.f135012d.postDelayed(new com.p314xaae8f345.mm.app.i0(r8), 2000);
        com.p314xaae8f345.mm.app.k0.f135010m = java.lang.System.currentTimeMillis();
     */
    @Override // android.os.FileObserver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onEvent(int r8, java.lang.String r9) {
        /*
            r7 = this;
            if (r9 != 0) goto L3
            return
        L3:
            java.lang.Object r0 = com.p314xaae8f345.mm.app.k0.f135009i
            monitor-enter(r0)
            r1 = 8
            if (r8 != r1) goto L76
            java.lang.String r8 = "MicroMsg.CrashDoubleUploader"
            java.lang.String r1 = "close_write from %s"
            java.lang.Object[] r2 = new java.lang.Object[]{r9}     // Catch: java.lang.Throwable -> L78
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r8, r1, r2)     // Catch: java.lang.Throwable -> L78
            com.tencent.mm.vfs.r6 r8 = new com.tencent.mm.vfs.r6     // Catch: java.lang.Throwable -> L78
            java.lang.String r1 = com.p314xaae8f345.mm.app.k0.f135008h     // Catch: java.lang.Throwable -> L78
            r8.<init>(r1, r9)     // Catch: java.lang.Throwable -> L78
            boolean r1 = r8.m()     // Catch: java.lang.Throwable -> L78
            r2 = 0
            if (r1 == 0) goto L53
            long r3 = r8.C()     // Catch: java.lang.Throwable -> L78
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L53
            java.lang.String r1 = ".ext"
            boolean r1 = r9.endsWith(r1)     // Catch: java.lang.Throwable -> L78
            if (r1 == 0) goto L36
            goto L53
        L36:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L78
            java.lang.String r8 = r8.u()     // Catch: java.lang.Throwable -> L78
            java.lang.String r8 = com.p314xaae8f345.mm.vfs.w6.i(r8, r2)     // Catch: java.lang.Throwable -> L78
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L78
            boolean r8 = com.p314xaae8f345.p3210x3857dc.a2.a(r1)     // Catch: java.lang.Throwable -> L78
            if (r8 != 0) goto L52
            java.lang.String r8 = "wva_sandbox_crash"
            boolean r8 = r9.contains(r8)     // Catch: java.lang.Throwable -> L78
            if (r8 == 0) goto L53
        L52:
            r2 = 1
        L53:
            if (r2 == 0) goto L76
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L78
            long r1 = com.p314xaae8f345.mm.app.k0.f135010m     // Catch: java.lang.Throwable -> L78
            long r8 = r8 - r1
            r1 = 2000(0x7d0, double:9.88E-321)
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r8 >= 0) goto L64
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L78
            return
        L64:
            com.tencent.mm.app.k0 r8 = com.p314xaae8f345.mm.app.k0.INSTANCE     // Catch: java.lang.Throwable -> L78
            android.os.Handler r9 = r8.f135012d     // Catch: java.lang.Throwable -> L78
            com.tencent.mm.app.i0 r3 = new com.tencent.mm.app.i0     // Catch: java.lang.Throwable -> L78
            r3.<init>(r8)     // Catch: java.lang.Throwable -> L78
            r9.postDelayed(r3, r1)     // Catch: java.lang.Throwable -> L78
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L78
            com.p314xaae8f345.mm.app.k0.f135010m = r8     // Catch: java.lang.Throwable -> L78
        L76:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L78
            return
        L78:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L78
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.app.j0.onEvent(int, java.lang.String):void");
    }
}
