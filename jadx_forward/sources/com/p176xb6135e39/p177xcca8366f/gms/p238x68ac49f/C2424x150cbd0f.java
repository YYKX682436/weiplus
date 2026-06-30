package com.p176xb6135e39.p177xcca8366f.gms.p238x68ac49f;

/* renamed from: com.google.android.gms.stats.WakeLock */
/* loaded from: classes13.dex */
public class C2424x150cbd0f {

    /* renamed from: zzaeg */
    private static java.util.concurrent.ScheduledExecutorService f7383x6f02183;

    /* renamed from: zzaeh */
    private static com.p176xb6135e39.p177xcca8366f.gms.p238x68ac49f.C2424x150cbd0f.Configuration f7384x6f02184 = new com.p176xb6135e39.p177xcca8366f.gms.p238x68ac49f.zza();

    /* renamed from: _hellAccFlag_ */
    private byte f7385x7f11beae;

    /* renamed from: zzadv */
    private final android.os.PowerManager.WakeLock f7386x6f02173;

    /* renamed from: zzadw */
    private android.os.WorkSource f7387x6f02174;

    /* renamed from: zzadx */
    private java.lang.String f7388x6f02175;

    /* renamed from: zzady */
    private final int f7389x6f02176;

    /* renamed from: zzadz */
    private final java.lang.String f7390x6f02177;

    /* renamed from: zzaea */
    private final java.lang.String f7391x6f0217d;

    /* renamed from: zzaeb */
    private final java.lang.String f7392x6f0217e;

    /* renamed from: zzaec */
    private boolean f7393x6f0217f;

    /* renamed from: zzaed */
    private final java.util.Map<java.lang.String, java.lang.Integer[]> f7394x6f02180;

    /* renamed from: zzaee */
    private int f7395x6f02181;

    /* renamed from: zzaef */
    private java.util.concurrent.atomic.AtomicInteger f7396x6f02182;

    /* renamed from: zzjp */
    private final android.content.Context f7397x394c86;

    /* renamed from: com.google.android.gms.stats.WakeLock$Configuration */
    /* loaded from: classes13.dex */
    public interface Configuration {
        /* renamed from: getMaximumTimeout */
        long mo19546x3d12d817(java.lang.String str, java.lang.String str2);

        /* renamed from: isWorkChainsEnabled */
        boolean mo19547xd7e0e974();
    }

    /* renamed from: com.google.android.gms.stats.WakeLock$HeldLock */
    /* loaded from: classes13.dex */
    public class HeldLock {

        /* renamed from: zzaek */
        private boolean f7399x6f02187;

        /* renamed from: zzael */
        private java.util.concurrent.Future f7400x6f02188;

        /* renamed from: zzaem */
        private final java.lang.String f7401x6f02189;

        private HeldLock(java.lang.String str) {
            this.f7399x6f02187 = true;
            this.f7401x6f02189 = str;
        }

        /* renamed from: finalize */
        public void m19548xd764dc1e() {
            if (this.f7399x6f02187) {
                java.lang.String valueOf = java.lang.String.valueOf(this.f7401x6f02189);
                if (valueOf.length() != 0) {
                    "HeldLock finalized while still holding the WakeLock! Reason: ".concat(valueOf);
                }
                m19550x41012807(0);
            }
        }

        /* renamed from: release */
        public void m19549x41012807() {
            m19550x41012807(0);
        }

        public /* synthetic */ HeldLock(com.p176xb6135e39.p177xcca8366f.gms.p238x68ac49f.C2424x150cbd0f c2424x150cbd0f, java.lang.String str, com.p176xb6135e39.p177xcca8366f.gms.p238x68ac49f.zza zzaVar) {
            this(str);
        }

        /* renamed from: release */
        public synchronized void m19550x41012807(int i17) {
            if (this.f7399x6f02187) {
                this.f7399x6f02187 = false;
                java.util.concurrent.Future future = this.f7400x6f02188;
                if (future != null) {
                    future.cancel(false);
                    this.f7400x6f02188 = null;
                }
                com.p176xb6135e39.p177xcca8366f.gms.p238x68ac49f.C2424x150cbd0f.this.zzc(this.f7401x6f02189, i17);
            }
        }
    }

    public C2424x150cbd0f(android.content.Context context, int i17, java.lang.String str) {
        this(context, i17, str, null, context == null ? null : context.getPackageName());
    }

    /* renamed from: setConfiguration */
    public static void m19529xc36997b4(com.p176xb6135e39.p177xcca8366f.gms.p238x68ac49f.C2424x150cbd0f.Configuration configuration) {
        f7384x6f02184 = configuration;
    }

    private final void zza(android.os.WorkSource workSource) {
        try {
            this.f7386x6f02173.setWorkSource(workSource);
        } catch (java.lang.ArrayIndexOutOfBoundsException | java.lang.IllegalArgumentException e17) {
            android.util.Log.wtf("WakeLock", e17.toString());
        }
    }

    private final void zzb(java.lang.String str, int i17) {
        this.f7396x6f02182.decrementAndGet();
        zzc(str, i17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p217x68ac49f.C1985xdd5fb329.m18502x9cf0d20b().m18505xabba01b7(r10.f7397x394c86, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p217x68ac49f.C1983x80984372.m18499x8c6db2db(r10.f7386x6f02173, r5), 8, r10.f7390x6f02177, r5, r10.f7392x6f0217e, r10.f7389x6f02176, m19530x394bcb());
        r10.f7395x6f02181--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003a, code lost:
    
        if (r10.f7395x6f02181 == 1) goto L18;
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
            boolean r11 = r10.f7393x6f0217f     // Catch: java.lang.Throwable -> L61
            r9 = 1
            if (r11 == 0) goto L34
            java.util.Map<java.lang.String, java.lang.Integer[]> r11 = r10.f7394x6f02180     // Catch: java.lang.Throwable -> L61
            java.lang.Object r11 = r11.get(r5)     // Catch: java.lang.Throwable -> L61
            java.lang.Integer[] r11 = (java.lang.Integer[]) r11     // Catch: java.lang.Throwable -> L61
            r0 = 0
            if (r11 != 0) goto L16
            goto L32
        L16:
            r1 = r11[r0]     // Catch: java.lang.Throwable -> L61
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L61
            if (r1 != r9) goto L25
            java.util.Map<java.lang.String, java.lang.Integer[]> r11 = r10.f7394x6f02180     // Catch: java.lang.Throwable -> L61
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
            boolean r11 = r10.f7393x6f0217f     // Catch: java.lang.Throwable -> L61
            if (r11 != 0) goto L5c
            int r11 = r10.f7395x6f02181     // Catch: java.lang.Throwable -> L61
            if (r11 != r9) goto L5c
        L3c:
            com.google.android.gms.common.stats.WakeLockTracker r0 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p217x68ac49f.C1985xdd5fb329.m18502x9cf0d20b()     // Catch: java.lang.Throwable -> L61
            android.content.Context r1 = r10.f7397x394c86     // Catch: java.lang.Throwable -> L61
            android.os.PowerManager$WakeLock r11 = r10.f7386x6f02173     // Catch: java.lang.Throwable -> L61
            java.lang.String r2 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p217x68ac49f.C1983x80984372.m18499x8c6db2db(r11, r5)     // Catch: java.lang.Throwable -> L61
            r3 = 8
            java.lang.String r4 = r10.f7390x6f02177     // Catch: java.lang.Throwable -> L61
            java.lang.String r6 = r10.f7392x6f0217e     // Catch: java.lang.Throwable -> L61
            int r7 = r10.f7389x6f02176     // Catch: java.lang.Throwable -> L61
            java.util.List r8 = r10.m19530x394bcb()     // Catch: java.lang.Throwable -> L61
            r0.m18505xabba01b7(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L61
            int r11 = r10.f7395x6f02181     // Catch: java.lang.Throwable -> L61
            int r11 = r11 - r9
            r10.f7395x6f02181 = r11     // Catch: java.lang.Throwable -> L61
        L5c:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L61
            r10.zzn(r12)
            return
        L61:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L61
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p238x68ac49f.C2424x150cbd0f.zzc(java.lang.String, int):void");
    }

    /* renamed from: zzdo */
    private final java.util.List<java.lang.String> m19530x394bcb() {
        java.util.List<java.lang.String> m18628x74d97d92 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2014xa74d4ce.m18628x74d97d92(this.f7387x6f02174);
        if (this.f7388x6f02175 == null) {
            return m18628x74d97d92;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(m18628x74d97d92);
        arrayList.add(this.f7388x6f02175);
        return arrayList;
    }

    private final java.lang.String zzn(java.lang.String str) {
        return (!this.f7393x6f0217f || android.text.TextUtils.isEmpty(str)) ? this.f7391x6f0217d : str;
    }

    /* renamed from: acquire */
    public void m19531xba9b60d6() {
        this.f7396x6f02182.incrementAndGet();
        zza((java.lang.String) null, 0L);
    }

    /* renamed from: acquireLock */
    public com.p176xb6135e39.p177xcca8366f.gms.p238x68ac49f.C2424x150cbd0f.HeldLock m19535x49d73f21(long j17, java.lang.String str) {
        long min = java.lang.Math.min(j17, f7384x6f02184.mo19546x3d12d817(this.f7390x6f02177, str));
        com.p176xb6135e39.p177xcca8366f.gms.p238x68ac49f.C2424x150cbd0f.HeldLock heldLock = new com.p176xb6135e39.p177xcca8366f.gms.p238x68ac49f.C2424x150cbd0f.HeldLock(this, str, null);
        zza(str, 0L);
        heldLock.f7400x6f02188 = f7383x6f02183.schedule(new com.p176xb6135e39.p177xcca8366f.gms.p238x68ac49f.zzc(new java.lang.ref.WeakReference(heldLock)), min, java.util.concurrent.TimeUnit.MILLISECONDS);
        return heldLock;
    }

    /* renamed from: addWorkSource */
    public void m19536xcb778a0d(android.os.WorkSource workSource) {
        if (workSource == null || !com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2014xa74d4ce.m18629x83682335(this.f7397x394c86)) {
            return;
        }
        android.os.WorkSource workSource2 = this.f7387x6f02174;
        if (workSource2 != null) {
            workSource2.add(workSource);
        } else {
            this.f7387x6f02174 = workSource;
        }
        zza(this.f7387x6f02174);
    }

    /* renamed from: getWakeLock */
    public android.os.PowerManager.WakeLock m19537x8d0c9665() {
        return this.f7386x6f02173;
    }

    /* renamed from: isHeld */
    public boolean m19538xb9a3ab7f() {
        return this.f7386x6f02173.isHeld();
    }

    /* renamed from: release */
    public void m19539x41012807() {
        zzb(null, 0);
    }

    /* renamed from: removeWorkSource */
    public void m19543x7f8ca30(android.os.WorkSource workSource) {
        if (workSource == null || !com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2014xa74d4ce.m18629x83682335(this.f7397x394c86)) {
            return;
        }
        try {
            android.os.WorkSource workSource2 = this.f7387x6f02174;
            if (workSource2 != null) {
                workSource2.remove(workSource);
            }
            zza(this.f7387x6f02174);
        } catch (java.lang.ArrayIndexOutOfBoundsException e17) {
            e17.toString();
        }
    }

    /* renamed from: setReferenceCounted */
    public void m19544x5becf0a5(boolean z17) {
        this.f7386x6f02173.setReferenceCounted(z17);
        this.f7393x6f0217f = z17;
    }

    /* renamed from: setWorkSource */
    public void m19545xe6aad08e(android.os.WorkSource workSource) {
        if (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2014xa74d4ce.m18629x83682335(this.f7397x394c86)) {
            zza(workSource);
            this.f7387x6f02174 = workSource;
            this.f7388x6f02175 = null;
        }
    }

    public C2424x150cbd0f(android.content.Context context, int i17, java.lang.String str, java.lang.String str2) {
        this(context, i17, str, str2, context == null ? null : context.getPackageName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzn(int i17) {
        if (this.f7386x6f02173.isHeld()) {
            try {
                if (i17 <= 0) {
                    android.os.PowerManager.WakeLock wakeLock = this.f7386x6f02173;
                    yj0.a.c(wakeLock, "com/google/android/gms/stats/WakeLock", "zzn", "(I)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                    wakeLock.release();
                    yj0.a.f(wakeLock, "com/google/android/gms/stats/WakeLock", "zzn", "(I)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                    return;
                }
                android.os.PowerManager.WakeLock wakeLock2 = this.f7386x6f02173;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(wakeLock2, arrayList.toArray(), "com/google/android/gms/stats/WakeLock", "zzn", "(I)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "(I)V");
                wakeLock2.release(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(wakeLock2, "com/google/android/gms/stats/WakeLock", "zzn", "(I)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "(I)V");
            } catch (java.lang.RuntimeException e17) {
                if (!e17.getClass().equals(java.lang.RuntimeException.class)) {
                    throw e17;
                }
                java.lang.String.valueOf(this.f7390x6f02177).concat(" was already released!");
            }
        }
    }

    /* renamed from: acquire */
    public void m19532xba9b60d6(long j17) {
        this.f7396x6f02182.incrementAndGet();
        zza((java.lang.String) null, j17);
    }

    /* renamed from: release */
    public void m19540x41012807(int i17) {
        zzb(null, i17);
    }

    public C2424x150cbd0f(android.content.Context context, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this(context, i17, str, str2, str3, null);
    }

    /* renamed from: acquire */
    public void m19533xba9b60d6(java.lang.String str) {
        this.f7396x6f02182.incrementAndGet();
        zza(str, 0L);
    }

    /* renamed from: release */
    public void m19541x41012807(java.lang.String str) {
        zzb(str, 0);
    }

    public C2424x150cbd0f(android.content.Context context, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        android.os.WorkSource m18625xd37da13c;
        this.f7393x6f0217f = true;
        this.f7394x6f02180 = new java.util.HashMap();
        this.f7396x6f02182 = new java.util.concurrent.atomic.AtomicInteger(0);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18209xec737762(str, "Wake lock name can NOT be empty");
        this.f7389x6f02176 = i17;
        this.f7391x6f0217d = str2;
        this.f7392x6f0217e = str4;
        this.f7397x394c86 = context.getApplicationContext();
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f7390x6f02177 = str;
        } else {
            java.lang.String valueOf = java.lang.String.valueOf(str);
            this.f7390x6f02177 = valueOf.length() != 0 ? "*gcore*:".concat(valueOf) : new java.lang.String("*gcore*:");
        }
        this.f7386x6f02173 = ((android.os.PowerManager) context.getSystemService("power")).newWakeLock(i17, str);
        if (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2014xa74d4ce.m18629x83682335(context)) {
            str3 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2012xf30f3a62.m18621xab7baa3(str3) ? context.getPackageName() : str3;
            if (!f7384x6f02184.mo19547xd7e0e974() || str3 == null || str4 == null) {
                m18625xd37da13c = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2014xa74d4ce.m18625xd37da13c(context, str3);
            } else {
                new java.lang.StringBuilder(str3.length() + 42 + str4.length());
                this.f7388x6f02175 = str3;
                m18625xd37da13c = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2014xa74d4ce.m18626x86160228(context, str3, str4);
            }
            this.f7387x6f02174 = m18625xd37da13c;
            m19536xcb778a0d(this.f7387x6f02174);
        }
        if (f7383x6f02183 == null) {
            f7383x6f02183 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p212xdf5cb8a2.C1972x1fc36376.m18453x9cf0d20b().mo18454xcd28948e();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        if (r0 == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
    
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p217x68ac49f.C1985xdd5fb329.m18502x9cf0d20b().m18506xabba01b7(r12.f7397x394c86, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p217x68ac49f.C1983x80984372.m18499x8c6db2db(r12.f7386x6f02173, r5), 7, r12.f7390x6f02177, r5, r12.f7392x6f0217e, r12.f7389x6f02176, m19530x394bcb(), r14);
        r12.f7395x6f02181++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0054, code lost:
    
        if (r12.f7395x6f02181 == 0) goto L22;
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
            java.util.Map<java.lang.String, java.lang.Integer[]> r13 = r12.f7394x6f02180     // Catch: java.lang.Throwable -> Ld6
            boolean r13 = r13.isEmpty()     // Catch: java.lang.Throwable -> Ld6
            r0 = 0
            if (r13 == 0) goto L12
            int r13 = r12.f7395x6f02181     // Catch: java.lang.Throwable -> Ld6
            if (r13 <= 0) goto L21
        L12:
            android.os.PowerManager$WakeLock r13 = r12.f7386x6f02173     // Catch: java.lang.Throwable -> Ld6
            boolean r13 = r13.isHeld()     // Catch: java.lang.Throwable -> Ld6
            if (r13 != 0) goto L21
            java.util.Map<java.lang.String, java.lang.Integer[]> r13 = r12.f7394x6f02180     // Catch: java.lang.Throwable -> Ld6
            r13.clear()     // Catch: java.lang.Throwable -> Ld6
            r12.f7395x6f02181 = r0     // Catch: java.lang.Throwable -> Ld6
        L21:
            boolean r13 = r12.f7393x6f0217f     // Catch: java.lang.Throwable -> Ld6
            r11 = 1
            if (r13 == 0) goto L4e
            java.util.Map<java.lang.String, java.lang.Integer[]> r13 = r12.f7394x6f02180     // Catch: java.lang.Throwable -> Ld6
            java.lang.Object r13 = r13.get(r5)     // Catch: java.lang.Throwable -> Ld6
            java.lang.Integer[] r13 = (java.lang.Integer[]) r13     // Catch: java.lang.Throwable -> Ld6
            if (r13 != 0) goto L3f
            java.util.Map<java.lang.String, java.lang.Integer[]> r13 = r12.f7394x6f02180     // Catch: java.lang.Throwable -> Ld6
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
            boolean r13 = r12.f7393x6f0217f     // Catch: java.lang.Throwable -> Ld6
            if (r13 != 0) goto L76
            int r13 = r12.f7395x6f02181     // Catch: java.lang.Throwable -> Ld6
            if (r13 != 0) goto L76
        L56:
            com.google.android.gms.common.stats.WakeLockTracker r0 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p217x68ac49f.C1985xdd5fb329.m18502x9cf0d20b()     // Catch: java.lang.Throwable -> Ld6
            android.content.Context r1 = r12.f7397x394c86     // Catch: java.lang.Throwable -> Ld6
            android.os.PowerManager$WakeLock r13 = r12.f7386x6f02173     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r2 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p217x68ac49f.C1983x80984372.m18499x8c6db2db(r13, r5)     // Catch: java.lang.Throwable -> Ld6
            r3 = 7
            java.lang.String r4 = r12.f7390x6f02177     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r6 = r12.f7392x6f0217e     // Catch: java.lang.Throwable -> Ld6
            int r7 = r12.f7389x6f02176     // Catch: java.lang.Throwable -> Ld6
            java.util.List r8 = r12.m19530x394bcb()     // Catch: java.lang.Throwable -> Ld6
            r9 = r14
            r0.m18506xabba01b7(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> Ld6
            int r13 = r12.f7395x6f02181     // Catch: java.lang.Throwable -> Ld6
            int r13 = r13 + r11
            r12.f7395x6f02181 = r13     // Catch: java.lang.Throwable -> Ld6
        L76:
            monitor-exit(r12)     // Catch: java.lang.Throwable -> Ld6
            android.os.PowerManager$WakeLock r13 = r12.f7386x6f02173
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
            java.util.concurrent.ScheduledExecutorService r13 = com.p176xb6135e39.p177xcca8366f.gms.p238x68ac49f.C2424x150cbd0f.f7383x6f02183
            com.google.android.gms.stats.zzb r0 = new com.google.android.gms.stats.zzb
            r0.<init>(r12)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r13.schedule(r0, r14, r1)
            boolean r13 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2006x32c52cc5.m18595x123cc09e()
            if (r13 != 0) goto Ld5
            boolean r13 = r12.f7393x6f0217f
            if (r13 == 0) goto Ld5
            java.lang.String r13 = "WakeLock"
            java.lang.String r14 = "Do not acquire with timeout on reference counted wakeLocks before ICS. wakelock: "
            java.lang.String r15 = r12.f7390x6f02177
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
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p238x68ac49f.C2424x150cbd0f.zza(java.lang.String, long):void");
    }

    /* renamed from: acquire */
    public void m19534xba9b60d6(java.lang.String str, long j17) {
        this.f7396x6f02182.incrementAndGet();
        zza(str, j17);
    }

    /* renamed from: release */
    public void m19542x41012807(java.lang.String str, int i17) {
        zzb(str, i17);
    }
}
