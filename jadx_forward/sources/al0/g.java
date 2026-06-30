package al0;

/* loaded from: classes12.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static int f87254a;

    /* renamed from: b, reason: collision with root package name */
    public static long f87255b;

    /* renamed from: c, reason: collision with root package name */
    public static long f87256c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f87257d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f87258e = new byte[0];

    /* renamed from: f, reason: collision with root package name */
    public static android.content.BroadcastReceiver f87259f = null;

    public static void a(java.lang.String str, boolean z17) {
        int myPid = android.os.Process.myPid();
        java.lang.String a17 = bm5.f1.a();
        if (myPid == f87254a) {
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
            intent.setPackage(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.sendBroadcast(intent, com.p314xaae8f345.mm.sdk.p2603x2137b148.v9.a());
            return;
        }
        android.content.Intent intent2 = new android.content.Intent("com.tencent.mm.ACTION.note_tracemsg_unlock");
        intent2.putExtra("pid", myPid);
        intent2.putExtra("processName", a17);
        intent2.putExtra("traceMsg", str);
        intent2.putExtra("tick", android.os.SystemClock.elapsedRealtime());
        intent2.setPackage(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.sendBroadcast(intent2, com.p314xaae8f345.mm.sdk.p2603x2137b148.v9.a());
    }

    public static void b(java.lang.String str, java.lang.String str2, long j17) {
        java.lang.String str3 = str + "_" + str2;
        synchronized (f87258e) {
            java.util.HashMap hashMap = f87257d;
            al0.f fVar = (al0.f) hashMap.get(str3);
            if (fVar == null) {
                fVar = new al0.f(null);
                fVar.f87245d = str;
                fVar.f87246e = str2;
                fVar.f87251m = 0L;
                fVar.f87249h = 0;
                fVar.f87250i = 0;
                hashMap.put(str3, fVar);
            }
            if (fVar.f87253o.getAndIncrement() == 0) {
                fVar.f87252n = j17;
                fVar.f87247f = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40070xdc68a9b2(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                fVar.f87248g = z65.c.f551988a;
            }
        }
    }

    public static void c(java.lang.String str, java.lang.String str2, long j17) {
        java.util.HashMap hashMap;
        long j18;
        java.lang.String str3 = str + "_" + str2;
        byte[] bArr = f87258e;
        synchronized (bArr) {
            hashMap = f87257d;
            al0.f fVar = (al0.f) hashMap.get(str3);
            if (fVar != null && fVar.f87253o.get() > 0) {
                fVar.f87249h++;
                if (fVar.f87253o.decrementAndGet() == 0) {
                    j18 = j17 - fVar.f87252n;
                    fVar.f87251m += j18;
                    fVar.f87250i++;
                }
            }
            j18 = 0;
        }
        synchronized (bArr) {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            if (elapsedRealtime - f87255b >= 21600000) {
                if (!hashMap.isEmpty()) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    java.util.Iterator it = hashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        al0.f fVar2 = (al0.f) ((java.util.Map.Entry) it.next()).getValue();
                        if (fVar2.f87250i > 0) {
                            sb6.setLength(0);
                            sb6.append(fVar2.f87245d);
                            sb6.append(',');
                            sb6.append(fVar2.f87246e.replace(",", "##"));
                            sb6.append(',');
                            sb6.append(fVar2.f87250i);
                            sb6.append(',');
                            sb6.append(fVar2.f87249h);
                            sb6.append(',');
                            sb6.append(fVar2.f87251m);
                            sb6.append(',');
                            sb6.append(fVar2.f87248g ? 1 : 0);
                            sb6.append(',');
                            sb6.append(fVar2.f87247f);
                            java.lang.String sb7 = sb6.toString();
                            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5923xed4daffe c5923xed4daffe = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5923xed4daffe();
                            c5923xed4daffe.f136225g.f88397a = sb7;
                            c5923xed4daffe.e();
                        }
                    }
                    f87257d.clear();
                }
                f87255b = elapsedRealtime;
            }
        }
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
        if (j18 >= 14000 || elapsedRealtime2 - f87256c >= 3600000) {
            d();
            f87256c = elapsedRealtime2;
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
            byte[] r1 = al0.g.f87258e
            monitor-enter(r1)
            r2 = 0
            r3 = 0
            com.tencent.mm.vfs.r6 r4 = new com.tencent.mm.vfs.r6     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            android.content.Context r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            java.io.File r5 = r5.getCacheDir()     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            java.lang.String r6 = "wakelock"
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            java.lang.String r5 = r4.o()     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            boolean r5 = com.p314xaae8f345.mm.vfs.w6.u(r5)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            if (r5 == 0) goto L7a
            java.lang.String r0 = "wakelock_stats.bin"
            r5 = 1
            java.lang.String r0 = com.p314xaae8f345.mm.vfs.e8.l(r0, r2, r5)     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L97
            com.tencent.mm.vfs.z7 r4 = r4.f294699d     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L97
            if (r0 == 0) goto L57
            boolean r5 = r0.isEmpty()     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L97
            if (r5 == 0) goto L32
            goto L57
        L32:
            java.lang.String r5 = r4.f294812f     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L97
            com.tencent.mm.vfs.z7 r12 = new com.tencent.mm.vfs.z7     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L97
            java.lang.String r7 = r4.f294810d     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L97
            java.lang.String r8 = r4.f294811e     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L97
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L97
            r6.<init>()     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L97
            r6.append(r5)     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L97
            r5 = 47
            r6.append(r5)     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L97
            r6.append(r0)     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L97
            java.lang.String r9 = r6.toString()     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L97
            java.lang.String r10 = r4.f294813g     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L97
            java.lang.String r11 = r4.f294814h     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L97
            r6 = r12
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L97
            r4 = r12
        L57:
            java.io.ObjectOutputStream r0 = new java.io.ObjectOutputStream     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            com.tencent.mm.vfs.b3 r5 = com.p314xaae8f345.mm.vfs.a3.f294314a     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L97
            com.tencent.mm.vfs.z2 r5 = r5.m(r4, r3)     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L97
            java.io.OutputStream r4 = com.p314xaae8f345.mm.vfs.w6.I(r4, r5, r2)     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L97
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            long r3 = al0.g.f87255b     // Catch: java.io.IOException -> L74 java.lang.Throwable -> La9
            r0.writeLong(r3)     // Catch: java.io.IOException -> L74 java.lang.Throwable -> La9
            java.util.HashMap r3 = al0.g.f87257d     // Catch: java.io.IOException -> L74 java.lang.Throwable -> La9
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r4, r3, r5, r2)     // Catch: java.lang.Throwable -> La9
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
