package com.google.android.gms.stats;

/* loaded from: classes13.dex */
public class WakeLock {
    private static java.util.concurrent.ScheduledExecutorService zzaeg;
    private static com.google.android.gms.stats.WakeLock.Configuration zzaeh = new com.google.android.gms.stats.zza();
    private byte _hellAccFlag_;
    private final android.os.PowerManager.WakeLock zzadv;
    private android.os.WorkSource zzadw;
    private java.lang.String zzadx;
    private final int zzady;
    private final java.lang.String zzadz;
    private final java.lang.String zzaea;
    private final java.lang.String zzaeb;
    private boolean zzaec;
    private final java.util.Map<java.lang.String, java.lang.Integer[]> zzaed;
    private int zzaee;
    private java.util.concurrent.atomic.AtomicInteger zzaef;
    private final android.content.Context zzjp;

    /* loaded from: classes13.dex */
    public interface Configuration {
        long getMaximumTimeout(java.lang.String str, java.lang.String str2);

        boolean isWorkChainsEnabled();
    }

    /* loaded from: classes13.dex */
    public class HeldLock {
        private boolean zzaek;
        private java.util.concurrent.Future zzael;
        private final java.lang.String zzaem;

        private HeldLock(java.lang.String str) {
            this.zzaek = true;
            this.zzaem = str;
        }

        public void finalize() {
            if (this.zzaek) {
                java.lang.String valueOf = java.lang.String.valueOf(this.zzaem);
                if (valueOf.length() != 0) {
                    "HeldLock finalized while still holding the WakeLock! Reason: ".concat(valueOf);
                }
                release(0);
            }
        }

        public void release() {
            release(0);
        }

        public /* synthetic */ HeldLock(com.google.android.gms.stats.WakeLock wakeLock, java.lang.String str, com.google.android.gms.stats.zza zzaVar) {
            this(str);
        }

        public synchronized void release(int i17) {
            if (this.zzaek) {
                this.zzaek = false;
                java.util.concurrent.Future future = this.zzael;
                if (future != null) {
                    future.cancel(false);
                    this.zzael = null;
                }
                com.google.android.gms.stats.WakeLock.this.zzc(this.zzaem, i17);
            }
        }
    }

    public WakeLock(android.content.Context context, int i17, java.lang.String str) {
        this(context, i17, str, null, context == null ? null : context.getPackageName());
    }

    public static void setConfiguration(com.google.android.gms.stats.WakeLock.Configuration configuration) {
        zzaeh = configuration;
    }

    private final void zza(android.os.WorkSource workSource) {
        try {
            this.zzadv.setWorkSource(workSource);
        } catch (java.lang.ArrayIndexOutOfBoundsException | java.lang.IllegalArgumentException e17) {
            android.util.Log.wtf("WakeLock", e17.toString());
        }
    }

    private final void zzb(java.lang.String str, int i17) {
        this.zzaef.decrementAndGet();
        zzc(str, i17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        com.google.android.gms.common.stats.WakeLockTracker.getInstance().registerEvent(r10.zzjp, com.google.android.gms.common.stats.StatsUtils.getEventKey(r10.zzadv, r5), 8, r10.zzadz, r5, r10.zzaeb, r10.zzady, zzdo());
        r10.zzaee--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003a, code lost:
    
        if (r10.zzaee == 1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        if (r0 == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzc(java.lang.String r11, int r12) {
        /*
            r10 = this;
            java.lang.String r5 = r10.zzn(r11)
            monitor-enter(r10)
            boolean r11 = r10.zzaec     // Catch: java.lang.Throwable -> L61
            r9 = 1
            if (r11 == 0) goto L34
            java.util.Map<java.lang.String, java.lang.Integer[]> r11 = r10.zzaed     // Catch: java.lang.Throwable -> L61
            java.lang.Object r11 = r11.get(r5)     // Catch: java.lang.Throwable -> L61
            java.lang.Integer[] r11 = (java.lang.Integer[]) r11     // Catch: java.lang.Throwable -> L61
            r0 = 0
            if (r11 != 0) goto L16
            goto L32
        L16:
            r1 = r11[r0]     // Catch: java.lang.Throwable -> L61
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L61
            if (r1 != r9) goto L25
            java.util.Map<java.lang.String, java.lang.Integer[]> r11 = r10.zzaed     // Catch: java.lang.Throwable -> L61
            r11.remove(r5)     // Catch: java.lang.Throwable -> L61
            r0 = r9
            goto L32
        L25:
            r1 = r11[r0]     // Catch: java.lang.Throwable -> L61
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L61
            int r1 = r1 - r9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L61
            r11[r0] = r1     // Catch: java.lang.Throwable -> L61
        L32:
            if (r0 != 0) goto L3c
        L34:
            boolean r11 = r10.zzaec     // Catch: java.lang.Throwable -> L61
            if (r11 != 0) goto L5c
            int r11 = r10.zzaee     // Catch: java.lang.Throwable -> L61
            if (r11 != r9) goto L5c
        L3c:
            com.google.android.gms.common.stats.WakeLockTracker r0 = com.google.android.gms.common.stats.WakeLockTracker.getInstance()     // Catch: java.lang.Throwable -> L61
            android.content.Context r1 = r10.zzjp     // Catch: java.lang.Throwable -> L61
            android.os.PowerManager$WakeLock r11 = r10.zzadv     // Catch: java.lang.Throwable -> L61
            java.lang.String r2 = com.google.android.gms.common.stats.StatsUtils.getEventKey(r11, r5)     // Catch: java.lang.Throwable -> L61
            r3 = 8
            java.lang.String r4 = r10.zzadz     // Catch: java.lang.Throwable -> L61
            java.lang.String r6 = r10.zzaeb     // Catch: java.lang.Throwable -> L61
            int r7 = r10.zzady     // Catch: java.lang.Throwable -> L61
            java.util.List r8 = r10.zzdo()     // Catch: java.lang.Throwable -> L61
            r0.registerEvent(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L61
            int r11 = r10.zzaee     // Catch: java.lang.Throwable -> L61
            int r11 = r11 - r9
            r10.zzaee = r11     // Catch: java.lang.Throwable -> L61
        L5c:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L61
            r10.zzn(r12)
            return
        L61:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L61
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.stats.WakeLock.zzc(java.lang.String, int):void");
    }

    private final java.util.List<java.lang.String> zzdo() {
        java.util.List<java.lang.String> names = com.google.android.gms.common.util.WorkSourceUtil.getNames(this.zzadw);
        if (this.zzadx == null) {
            return names;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(names);
        arrayList.add(this.zzadx);
        return arrayList;
    }

    private final java.lang.String zzn(java.lang.String str) {
        return (!this.zzaec || android.text.TextUtils.isEmpty(str)) ? this.zzaea : str;
    }

    public void acquire() {
        this.zzaef.incrementAndGet();
        zza((java.lang.String) null, 0L);
    }

    public com.google.android.gms.stats.WakeLock.HeldLock acquireLock(long j17, java.lang.String str) {
        long min = java.lang.Math.min(j17, zzaeh.getMaximumTimeout(this.zzadz, str));
        com.google.android.gms.stats.WakeLock.HeldLock heldLock = new com.google.android.gms.stats.WakeLock.HeldLock(this, str, null);
        zza(str, 0L);
        heldLock.zzael = zzaeg.schedule(new com.google.android.gms.stats.zzc(new java.lang.ref.WeakReference(heldLock)), min, java.util.concurrent.TimeUnit.MILLISECONDS);
        return heldLock;
    }

    public void addWorkSource(android.os.WorkSource workSource) {
        if (workSource == null || !com.google.android.gms.common.util.WorkSourceUtil.hasWorkSourcePermission(this.zzjp)) {
            return;
        }
        android.os.WorkSource workSource2 = this.zzadw;
        if (workSource2 != null) {
            workSource2.add(workSource);
        } else {
            this.zzadw = workSource;
        }
        zza(this.zzadw);
    }

    public android.os.PowerManager.WakeLock getWakeLock() {
        return this.zzadv;
    }

    public boolean isHeld() {
        return this.zzadv.isHeld();
    }

    public void release() {
        zzb(null, 0);
    }

    public void removeWorkSource(android.os.WorkSource workSource) {
        if (workSource == null || !com.google.android.gms.common.util.WorkSourceUtil.hasWorkSourcePermission(this.zzjp)) {
            return;
        }
        try {
            android.os.WorkSource workSource2 = this.zzadw;
            if (workSource2 != null) {
                workSource2.remove(workSource);
            }
            zza(this.zzadw);
        } catch (java.lang.ArrayIndexOutOfBoundsException e17) {
            e17.toString();
        }
    }

    public void setReferenceCounted(boolean z17) {
        this.zzadv.setReferenceCounted(z17);
        this.zzaec = z17;
    }

    public void setWorkSource(android.os.WorkSource workSource) {
        if (com.google.android.gms.common.util.WorkSourceUtil.hasWorkSourcePermission(this.zzjp)) {
            zza(workSource);
            this.zzadw = workSource;
            this.zzadx = null;
        }
    }

    public WakeLock(android.content.Context context, int i17, java.lang.String str, java.lang.String str2) {
        this(context, i17, str, str2, context == null ? null : context.getPackageName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzn(int i17) {
        if (this.zzadv.isHeld()) {
            try {
                if (i17 <= 0) {
                    android.os.PowerManager.WakeLock wakeLock = this.zzadv;
                    yj0.a.c(wakeLock, "com/google/android/gms/stats/WakeLock", "zzn", "(I)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                    wakeLock.release();
                    yj0.a.f(wakeLock, "com/google/android/gms/stats/WakeLock", "zzn", "(I)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                    return;
                }
                android.os.PowerManager.WakeLock wakeLock2 = this.zzadv;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(wakeLock2, arrayList.toArray(), "com/google/android/gms/stats/WakeLock", "zzn", "(I)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "(I)V");
                wakeLock2.release(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(wakeLock2, "com/google/android/gms/stats/WakeLock", "zzn", "(I)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "(I)V");
            } catch (java.lang.RuntimeException e17) {
                if (!e17.getClass().equals(java.lang.RuntimeException.class)) {
                    throw e17;
                }
                java.lang.String.valueOf(this.zzadz).concat(" was already released!");
            }
        }
    }

    public void acquire(long j17) {
        this.zzaef.incrementAndGet();
        zza((java.lang.String) null, j17);
    }

    public void release(int i17) {
        zzb(null, i17);
    }

    public WakeLock(android.content.Context context, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this(context, i17, str, str2, str3, null);
    }

    public void acquire(java.lang.String str) {
        this.zzaef.incrementAndGet();
        zza(str, 0L);
    }

    public void release(java.lang.String str) {
        zzb(str, 0);
    }

    public WakeLock(android.content.Context context, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        android.os.WorkSource fromPackage;
        this.zzaec = true;
        this.zzaed = new java.util.HashMap();
        this.zzaef = new java.util.concurrent.atomic.AtomicInteger(0);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "Wake lock name can NOT be empty");
        this.zzady = i17;
        this.zzaea = str2;
        this.zzaeb = str4;
        this.zzjp = context.getApplicationContext();
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.zzadz = str;
        } else {
            java.lang.String valueOf = java.lang.String.valueOf(str);
            this.zzadz = valueOf.length() != 0 ? "*gcore*:".concat(valueOf) : new java.lang.String("*gcore*:");
        }
        this.zzadv = ((android.os.PowerManager) context.getSystemService("power")).newWakeLock(i17, str);
        if (com.google.android.gms.common.util.WorkSourceUtil.hasWorkSourcePermission(context)) {
            str3 = com.google.android.gms.common.util.Strings.isEmptyOrWhitespace(str3) ? context.getPackageName() : str3;
            if (!zzaeh.isWorkChainsEnabled() || str3 == null || str4 == null) {
                fromPackage = com.google.android.gms.common.util.WorkSourceUtil.fromPackage(context, str3);
            } else {
                new java.lang.StringBuilder(str3.length() + 42 + str4.length());
                this.zzadx = str3;
                fromPackage = com.google.android.gms.common.util.WorkSourceUtil.fromPackageAndModuleExperimentalPi(context, str3, str4);
            }
            this.zzadw = fromPackage;
            addWorkSource(this.zzadw);
        }
        if (zzaeg == null) {
            zzaeg = com.google.android.gms.common.providers.PooledExecutorsProvider.getInstance().newSingleThreadScheduledExecutor();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        if (r0 == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
    
        com.google.android.gms.common.stats.WakeLockTracker.getInstance().registerEvent(r12.zzjp, com.google.android.gms.common.stats.StatsUtils.getEventKey(r12.zzadv, r5), 7, r12.zzadz, r5, r12.zzaeb, r12.zzady, zzdo(), r14);
        r12.zzaee++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0054, code lost:
    
        if (r12.zzaee == 0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zza(java.lang.String r13, long r14) {
        /*
            r12 = this;
            java.lang.String r5 = r12.zzn(r13)
            monitor-enter(r12)
            java.util.Map<java.lang.String, java.lang.Integer[]> r13 = r12.zzaed     // Catch: java.lang.Throwable -> Ld6
            boolean r13 = r13.isEmpty()     // Catch: java.lang.Throwable -> Ld6
            r0 = 0
            if (r13 == 0) goto L12
            int r13 = r12.zzaee     // Catch: java.lang.Throwable -> Ld6
            if (r13 <= 0) goto L21
        L12:
            android.os.PowerManager$WakeLock r13 = r12.zzadv     // Catch: java.lang.Throwable -> Ld6
            boolean r13 = r13.isHeld()     // Catch: java.lang.Throwable -> Ld6
            if (r13 != 0) goto L21
            java.util.Map<java.lang.String, java.lang.Integer[]> r13 = r12.zzaed     // Catch: java.lang.Throwable -> Ld6
            r13.clear()     // Catch: java.lang.Throwable -> Ld6
            r12.zzaee = r0     // Catch: java.lang.Throwable -> Ld6
        L21:
            boolean r13 = r12.zzaec     // Catch: java.lang.Throwable -> Ld6
            r11 = 1
            if (r13 == 0) goto L4e
            java.util.Map<java.lang.String, java.lang.Integer[]> r13 = r12.zzaed     // Catch: java.lang.Throwable -> Ld6
            java.lang.Object r13 = r13.get(r5)     // Catch: java.lang.Throwable -> Ld6
            java.lang.Integer[] r13 = (java.lang.Integer[]) r13     // Catch: java.lang.Throwable -> Ld6
            if (r13 != 0) goto L3f
            java.util.Map<java.lang.String, java.lang.Integer[]> r13 = r12.zzaed     // Catch: java.lang.Throwable -> Ld6
            java.lang.Integer[] r1 = new java.lang.Integer[r11]     // Catch: java.lang.Throwable -> Ld6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> Ld6
            r1[r0] = r2     // Catch: java.lang.Throwable -> Ld6
            r13.put(r5, r1)     // Catch: java.lang.Throwable -> Ld6
            r0 = r11
            goto L4c
        L3f:
            r1 = r13[r0]     // Catch: java.lang.Throwable -> Ld6
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> Ld6
            int r1 = r1 + r11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> Ld6
            r13[r0] = r1     // Catch: java.lang.Throwable -> Ld6
        L4c:
            if (r0 != 0) goto L56
        L4e:
            boolean r13 = r12.zzaec     // Catch: java.lang.Throwable -> Ld6
            if (r13 != 0) goto L76
            int r13 = r12.zzaee     // Catch: java.lang.Throwable -> Ld6
            if (r13 != 0) goto L76
        L56:
            com.google.android.gms.common.stats.WakeLockTracker r0 = com.google.android.gms.common.stats.WakeLockTracker.getInstance()     // Catch: java.lang.Throwable -> Ld6
            android.content.Context r1 = r12.zzjp     // Catch: java.lang.Throwable -> Ld6
            android.os.PowerManager$WakeLock r13 = r12.zzadv     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r2 = com.google.android.gms.common.stats.StatsUtils.getEventKey(r13, r5)     // Catch: java.lang.Throwable -> Ld6
            r3 = 7
            java.lang.String r4 = r12.zzadz     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r6 = r12.zzaeb     // Catch: java.lang.Throwable -> Ld6
            int r7 = r12.zzady     // Catch: java.lang.Throwable -> Ld6
            java.util.List r8 = r12.zzdo()     // Catch: java.lang.Throwable -> Ld6
            r9 = r14
            r0.registerEvent(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> Ld6
            int r13 = r12.zzaee     // Catch: java.lang.Throwable -> Ld6
            int r13 = r13 + r11
            r12.zzaee = r13     // Catch: java.lang.Throwable -> Ld6
        L76:
            monitor-exit(r12)     // Catch: java.lang.Throwable -> Ld6
            android.os.PowerManager$WakeLock r13 = r12.zzadv
            java.lang.String r1 = "com/google/android/gms/stats/WakeLock"
            java.lang.String r2 = "zza"
            java.lang.String r3 = "(Ljava/lang/String;J)V"
            java.lang.String r4 = "android/os/PowerManager$WakeLock_EXEC_"
            java.lang.String r5 = "acquire"
            java.lang.String r6 = "()V"
            r0 = r13
            yj0.a.c(r0, r1, r2, r3, r4, r5, r6)
            r13.acquire()
            java.lang.String r1 = "com/google/android/gms/stats/WakeLock"
            java.lang.String r2 = "zza"
            java.lang.String r3 = "(Ljava/lang/String;J)V"
            java.lang.String r4 = "android/os/PowerManager$WakeLock_EXEC_"
            java.lang.String r5 = "acquire"
            java.lang.String r6 = "()V"
            yj0.a.f(r0, r1, r2, r3, r4, r5, r6)
            r0 = 0
            int r13 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r13 <= 0) goto Ld5
            java.util.concurrent.ScheduledExecutorService r13 = com.google.android.gms.stats.WakeLock.zzaeg
            com.google.android.gms.stats.zzb r0 = new com.google.android.gms.stats.zzb
            r0.<init>(r12)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r13.schedule(r0, r14, r1)
            boolean r13 = com.google.android.gms.common.util.PlatformVersion.isAtLeastIceCreamSandwich()
            if (r13 != 0) goto Ld5
            boolean r13 = r12.zzaec
            if (r13 == 0) goto Ld5
            java.lang.String r13 = "WakeLock"
            java.lang.String r14 = "Do not acquire with timeout on reference counted wakeLocks before ICS. wakelock: "
            java.lang.String r15 = r12.zzadz
            java.lang.String r15 = java.lang.String.valueOf(r15)
            int r0 = r15.length()
            if (r0 == 0) goto Lcc
            java.lang.String r14 = r14.concat(r15)
            goto Ld2
        Lcc:
            java.lang.String r15 = new java.lang.String
            r15.<init>(r14)
            r14 = r15
        Ld2:
            android.util.Log.wtf(r13, r14)
        Ld5:
            return
        Ld6:
            r13 = move-exception
            monitor-exit(r12)     // Catch: java.lang.Throwable -> Ld6
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.stats.WakeLock.zza(java.lang.String, long):void");
    }

    public void acquire(java.lang.String str, long j17) {
        this.zzaef.incrementAndGet();
        zza(str, j17);
    }

    public void release(java.lang.String str, int i17) {
        zzb(str, i17);
    }
}
