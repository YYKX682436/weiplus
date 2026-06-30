package al0;

/* loaded from: classes12.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static int f5721a;

    /* renamed from: b, reason: collision with root package name */
    public static long f5722b;

    /* renamed from: c, reason: collision with root package name */
    public static long f5723c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f5724d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f5725e = new byte[0];

    /* renamed from: f, reason: collision with root package name */
    public static android.content.BroadcastReceiver f5726f = null;

    public static void a(java.lang.String str, boolean z17) {
        int myPid = android.os.Process.myPid();
        java.lang.String a17 = bm5.f1.a();
        if (myPid == f5721a) {
            if (z17) {
                b(a17, str, android.os.SystemClock.elapsedRealtime());
                return;
            } else {
                c(a17, str, android.os.SystemClock.elapsedRealtime());
                return;
            }
        }
        if (z17) {
            android.content.Intent intent = new android.content.Intent("com.tencent.mm.ACTION.note_tracemsg_lock");
            intent.putExtra("pid", myPid);
            intent.putExtra("processName", a17);
            intent.putExtra("traceMsg", str);
            intent.putExtra("tick", android.os.SystemClock.elapsedRealtime());
            intent.setPackage(com.tencent.mm.sdk.platformtools.x2.f193072b);
            com.tencent.mm.sdk.platformtools.x2.f193071a.sendBroadcast(intent, com.tencent.mm.sdk.platformtools.v9.a());
            return;
        }
        android.content.Intent intent2 = new android.content.Intent("com.tencent.mm.ACTION.note_tracemsg_unlock");
        intent2.putExtra("pid", myPid);
        intent2.putExtra("processName", a17);
        intent2.putExtra("traceMsg", str);
        intent2.putExtra("tick", android.os.SystemClock.elapsedRealtime());
        intent2.setPackage(com.tencent.mm.sdk.platformtools.x2.f193072b);
        com.tencent.mm.sdk.platformtools.x2.f193071a.sendBroadcast(intent2, com.tencent.mm.sdk.platformtools.v9.a());
    }

    public static void b(java.lang.String str, java.lang.String str2, long j17) {
        java.lang.String str3 = str + "_" + str2;
        synchronized (f5725e) {
            java.util.HashMap hashMap = f5724d;
            al0.f fVar = (al0.f) hashMap.get(str3);
            if (fVar == null) {
                fVar = new al0.f(null);
                fVar.f5712d = str;
                fVar.f5713e = str2;
                fVar.f5718m = 0L;
                fVar.f5716h = 0;
                fVar.f5717i = 0;
                hashMap.put(str3, fVar);
            }
            if (fVar.f5720o.getAndIncrement() == 0) {
                fVar.f5719n = j17;
                fVar.f5714f = com.tencent.mars.comm.NetStatusUtil.getNetTypeString(com.tencent.mm.sdk.platformtools.x2.f193071a);
                fVar.f5715g = z65.c.f470455a;
            }
        }
    }

    public static void c(java.lang.String str, java.lang.String str2, long j17) {
        java.util.HashMap hashMap;
        long j18;
        java.lang.String str3 = str + "_" + str2;
        byte[] bArr = f5725e;
        synchronized (bArr) {
            hashMap = f5724d;
            al0.f fVar = (al0.f) hashMap.get(str3);
            if (fVar != null && fVar.f5720o.get() > 0) {
                fVar.f5716h++;
                if (fVar.f5720o.decrementAndGet() == 0) {
                    j18 = j17 - fVar.f5719n;
                    fVar.f5718m += j18;
                    fVar.f5717i++;
                }
            }
            j18 = 0;
        }
        synchronized (bArr) {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            if (elapsedRealtime - f5722b >= 21600000) {
                if (!hashMap.isEmpty()) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    java.util.Iterator it = hashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        al0.f fVar2 = (al0.f) ((java.util.Map.Entry) it.next()).getValue();
                        if (fVar2.f5717i > 0) {
                            sb6.setLength(0);
                            sb6.append(fVar2.f5712d);
                            sb6.append(',');
                            sb6.append(fVar2.f5713e.replace(",", "##"));
                            sb6.append(',');
                            sb6.append(fVar2.f5717i);
                            sb6.append(',');
                            sb6.append(fVar2.f5716h);
                            sb6.append(',');
                            sb6.append(fVar2.f5718m);
                            sb6.append(',');
                            sb6.append(fVar2.f5715g ? 1 : 0);
                            sb6.append(',');
                            sb6.append(fVar2.f5714f);
                            java.lang.String sb7 = sb6.toString();
                            com.tencent.mm.autogen.events.ReportWakeLockStatsEvent reportWakeLockStatsEvent = new com.tencent.mm.autogen.events.ReportWakeLockStatsEvent();
                            reportWakeLockStatsEvent.f54692g.f6864a = sb7;
                            reportWakeLockStatsEvent.e();
                        }
                    }
                    f5724d.clear();
                }
                f5722b = elapsedRealtime;
            }
        }
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
        if (j18 >= 14000 || elapsedRealtime2 - f5723c >= 3600000) {
            d();
            f5723c = elapsedRealtime2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a4, code lost:
    
        if (r0 == null) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d() {
        /*
            java.lang.String r0 = "failed to call VFSFileOp.mkdirs("
            byte[] r1 = al0.g.f5725e
            monitor-enter(r1)
            r2 = 0
            r3 = 0
            com.tencent.mm.vfs.r6 r4 = new com.tencent.mm.vfs.r6     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            android.content.Context r5 = com.tencent.mm.sdk.platformtools.x2.f193071a     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            java.io.File r5 = r5.getCacheDir()     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            java.lang.String r6 = "wakelock"
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            java.lang.String r5 = r4.o()     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            boolean r5 = com.tencent.mm.vfs.w6.u(r5)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            if (r5 == 0) goto L7a
            java.lang.String r0 = "wakelock_stats.bin"
            r5 = 1
            java.lang.String r0 = com.tencent.mm.vfs.e8.l(r0, r2, r5)     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L97
            com.tencent.mm.vfs.z7 r4 = r4.f213166d     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L97
            if (r0 == 0) goto L57
            boolean r5 = r0.isEmpty()     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L97
            if (r5 == 0) goto L32
            goto L57
        L32:
            java.lang.String r5 = r4.f213279f     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L97
            com.tencent.mm.vfs.z7 r12 = new com.tencent.mm.vfs.z7     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L97
            java.lang.String r7 = r4.f213277d     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L97
            java.lang.String r8 = r4.f213278e     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L97
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L97
            r6.<init>()     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L97
            r6.append(r5)     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L97
            r5 = 47
            r6.append(r5)     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L97
            r6.append(r0)     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L97
            java.lang.String r9 = r6.toString()     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L97
            java.lang.String r10 = r4.f213280g     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L97
            java.lang.String r11 = r4.f213281h     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L97
            r6 = r12
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L97
            r4 = r12
        L57:
            java.io.ObjectOutputStream r0 = new java.io.ObjectOutputStream     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            com.tencent.mm.vfs.b3 r5 = com.tencent.mm.vfs.a3.f212781a     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L97
            com.tencent.mm.vfs.z2 r5 = r5.m(r4, r3)     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L97
            java.io.OutputStream r4 = com.tencent.mm.vfs.w6.I(r4, r5, r2)     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L97
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            long r3 = al0.g.f5722b     // Catch: java.io.IOException -> L74 java.lang.Throwable -> La9
            r0.writeLong(r3)     // Catch: java.io.IOException -> L74 java.lang.Throwable -> La9
            java.util.HashMap r3 = al0.g.f5724d     // Catch: java.io.IOException -> L74 java.lang.Throwable -> La9
            r0.writeObject(r3)     // Catch: java.io.IOException -> L74 java.lang.Throwable -> La9
        L70:
            r0.close()     // Catch: java.lang.Exception -> La7 java.lang.Throwable -> Lb1
            goto La7
        L74:
            r3 = move-exception
            goto L9b
        L76:
            r2 = r0
            goto Lab
        L78:
            r0 = move-exception
            goto L76
        L7a:
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            java.lang.String r0 = r4.o()     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            r6.append(r0)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            java.lang.String r0 = ")"
            r6.append(r0)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            throw r5     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
        L95:
            r2 = move-exception
            goto Lab
        L97:
            r0 = move-exception
            r13 = r3
            r3 = r0
            r0 = r13
        L9b:
            java.lang.String r4 = "MicroMsg.WakeLockStatsManager"
            java.lang.String r5 = "failed to save stats to storage."
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> La9
            com.tencent.mars.xlog.Log.printErrStackTrace(r4, r3, r5, r2)     // Catch: java.lang.Throwable -> La9
            if (r0 == 0) goto La7
            goto L70
        La7:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb1
            return
        La9:
            r2 = move-exception
            r3 = r0
        Lab:
            if (r3 == 0) goto Lb0
            r3.close()     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lb1
        Lb0:
            throw r2     // Catch: java.lang.Throwable -> Lb1
        Lb1:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb1
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: al0.g.d():void");
    }
}
