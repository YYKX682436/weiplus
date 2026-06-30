package al0;

/* loaded from: classes12.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final android.util.SparseArray f5727a = new android.util.SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.n3 f5728b = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f5729c = new byte[0];

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0067, code lost:
    
        if (r3 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a() {
        /*
            int r0 = al0.g.f5721a
            if (r0 != 0) goto Lc6
            int r0 = android.os.Process.myPid()
            al0.g.f5721a = r0
            al0.e r0 = new al0.e
            r0.<init>()
            al0.g.f5726f = r0
            byte[] r0 = al0.g.f5725e
            monitor-enter(r0)
            r1 = 0
            android.content.Context r2 = com.tencent.mm.sdk.platformtools.x2.f193071a     // Catch: java.lang.Throwable -> L54
            java.io.File r2 = r2.getCacheDir()     // Catch: java.lang.Throwable -> L54
            java.lang.String r3 = "wakelock/wakelock_stats.bin"
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L54
            r4.<init>(r2, r3)     // Catch: java.lang.Throwable -> L54
            com.tencent.mm.vfs.z7 r2 = new com.tencent.mm.vfs.z7     // Catch: java.lang.Throwable -> L54
            r6 = 0
            r7 = 0
            java.lang.String r8 = r4.getPath()     // Catch: java.lang.Throwable -> L54
            r9 = 0
            r10 = 0
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L54
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L54
            com.tencent.mm.vfs.b3 r4 = com.tencent.mm.vfs.a3.f212781a     // Catch: java.lang.Throwable -> L54
            com.tencent.mm.vfs.z2 r4 = r4.m(r2, r1)     // Catch: java.lang.Throwable -> L54
            java.io.InputStream r2 = com.tencent.mm.vfs.w6.D(r2, r4)     // Catch: java.lang.Throwable -> L54
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L54
            long r4 = r3.readLong()     // Catch: java.lang.Throwable -> L55
            al0.g.f5722b = r4     // Catch: java.lang.Throwable -> L55
            java.lang.Object r2 = r3.readObject()     // Catch: java.lang.Throwable -> L55
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch: java.lang.Throwable -> L55
            if (r2 == 0) goto L69
            java.util.HashMap r4 = al0.g.f5724d     // Catch: java.lang.Throwable -> L55
            r4.putAll(r2)     // Catch: java.lang.Throwable -> L55
            goto L69
        L54:
            r3 = r1
        L55:
            java.lang.String r2 = "MicroMsg.WakeLockStatsManager"
            java.lang.String r4 = "failed to load stats from storage, use default value for last stats info."
            com.tencent.mars.xlog.Log.e(r2, r4)     // Catch: java.lang.Throwable -> Lbc
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> Lbc
            al0.g.f5722b = r4     // Catch: java.lang.Throwable -> Lbc
            java.util.HashMap r2 = al0.g.f5724d     // Catch: java.lang.Throwable -> Lbc
            r2.clear()     // Catch: java.lang.Throwable -> Lbc
            if (r3 == 0) goto L6c
        L69:
            r3.close()     // Catch: java.lang.Exception -> L6c java.lang.Throwable -> Lc3
        L6c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc3
            r0 = 0
            android.content.IntentFilter r4 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> Laf
            r4.<init>()     // Catch: java.lang.Throwable -> Laf
            java.lang.String r2 = "com.tencent.mm.ACTION.note_tracemsg_lock"
            r4.addAction(r2)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r2 = "com.tencent.mm.ACTION.note_tracemsg_unlock"
            r4.addAction(r2)     // Catch: java.lang.Throwable -> Laf
            r2 = 33
            boolean r2 = fp.h.a(r2)     // Catch: java.lang.Throwable -> Laf
            if (r2 == 0) goto L91
            android.content.Context r2 = com.tencent.mm.sdk.platformtools.x2.f193071a     // Catch: java.lang.Throwable -> Laf
            android.content.BroadcastReceiver r3 = al0.g.f5726f     // Catch: java.lang.Throwable -> Laf
            java.lang.String r5 = com.tencent.mm.sdk.platformtools.v9.a()     // Catch: java.lang.Throwable -> Laf
            r2.registerReceiver(r3, r4, r5, r1)     // Catch: java.lang.Throwable -> Laf
            goto L9e
        L91:
            android.content.Context r2 = com.tencent.mm.sdk.platformtools.x2.f193071a     // Catch: java.lang.Throwable -> Laf
            android.content.BroadcastReceiver r3 = al0.g.f5726f     // Catch: java.lang.Throwable -> Laf
            java.lang.String r5 = com.tencent.mm.sdk.platformtools.v9.a()     // Catch: java.lang.Throwable -> Laf
            r6 = 0
            r7 = 2
            r2.registerReceiver(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Laf
        L9e:
            java.lang.String r1 = "MicroMsg.WakeLockStatsManager"
            java.lang.String r2 = "WakeLockStatsManager is attached to process [%s]"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Laf
            java.lang.String r4 = bm5.f1.a()     // Catch: java.lang.Throwable -> Laf
            r3[r0] = r4     // Catch: java.lang.Throwable -> Laf
            com.tencent.mars.xlog.Log.i(r1, r2, r3)     // Catch: java.lang.Throwable -> Laf
            goto Lc6
        Laf:
            r1 = move-exception
            java.lang.String r2 = "MicroMsg.WakeLockStatsManager"
            java.lang.String r3 = "[-] Fail to register reciever, statistics will be done in each process separately."
            java.lang.Object[] r4 = new java.lang.Object[r0]
            com.tencent.mars.xlog.Log.printErrStackTrace(r2, r1, r3, r4)
            al0.g.f5721a = r0
            goto Lc6
        Lbc:
            r1 = move-exception
            if (r3 == 0) goto Lc2
            r3.close()     // Catch: java.lang.Exception -> Lc2 java.lang.Throwable -> Lc3
        Lc2:
            throw r1     // Catch: java.lang.Throwable -> Lc3
        Lc3:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc3
            throw r1
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: al0.h.a():void");
    }

    public static void b(com.tencent.mars.comm.MMWakerLock mMWakerLock, java.lang.String str) {
        synchronized (f5729c) {
            android.util.SparseArray sparseArray = f5727a;
            al0.d dVar = (al0.d) sparseArray.get(mMWakerLock.hashCode());
            if (dVar == null) {
                dVar = new al0.d(mMWakerLock);
                sparseArray.put(mMWakerLock.hashCode(), dVar);
            }
            java.util.Map map = dVar.f5711c;
            if (!((java.util.HashMap) map).containsKey(str)) {
                ((java.util.HashMap) map).put(str, new al0.c(str, android.os.SystemClock.elapsedRealtime()));
            }
            al0.g.a(str, true);
            com.tencent.mm.sdk.platformtools.n3 n3Var = f5728b;
            if (!dVar.f5709a) {
                dVar.f5709a = true;
                n3Var.postDelayed(dVar.f5710b, 60000L);
            }
        }
    }
}
