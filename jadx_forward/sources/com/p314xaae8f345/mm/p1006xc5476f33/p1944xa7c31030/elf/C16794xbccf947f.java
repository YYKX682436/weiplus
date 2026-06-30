package com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf;

/* renamed from: com.tencent.mm.plugin.performance.elf.MainProcessChecker */
/* loaded from: classes12.dex */
public class C16794xbccf947f extends com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.AbstractC16790x31088328 {
    public static final long[] F = {0, 86400000};
    public static java.lang.String G = "";
    public long B;

    /* renamed from: v, reason: collision with root package name */
    public long f234521v;

    /* renamed from: w, reason: collision with root package name */
    public long f234522w;

    /* renamed from: x, reason: collision with root package name */
    public long f234523x;

    /* renamed from: y, reason: collision with root package name */
    public long f234524y;

    /* renamed from: z, reason: collision with root package name */
    public long f234525z;

    /* renamed from: k, reason: collision with root package name */
    public long f234510k = 1048576;

    /* renamed from: l, reason: collision with root package name */
    public long f234511l = p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.f1183xe66aab0d;

    /* renamed from: m, reason: collision with root package name */
    public final long f234512m = 734003200;

    /* renamed from: n, reason: collision with root package name */
    public long f234513n = 734003200;

    /* renamed from: o, reason: collision with root package name */
    public final int f234514o = 92;

    /* renamed from: p, reason: collision with root package name */
    public float f234515p = 92 * 0.01f;

    /* renamed from: q, reason: collision with root package name */
    public final int f234516q = 85;

    /* renamed from: r, reason: collision with root package name */
    public float f234517r = 85 * 0.01f;

    /* renamed from: s, reason: collision with root package name */
    public boolean f234518s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f234519t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f234520u = false;
    public int A = 1;
    public final java.lang.StringBuilder C = new java.lang.StringBuilder();
    public boolean D = false;
    public long E = 0;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.AbstractC16790x31088328
    public long a() {
        return this.B;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.AbstractC16790x31088328
    public java.lang.String c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(this.C);
        sb6.append(super.c());
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.ThreadGroup threadGroup = android.os.Looper.getMainLooper().getThread().getThreadGroup();
        java.lang.Thread[] threadArr = new java.lang.Thread[threadGroup.activeCount() * 2];
        int enumerate = threadGroup.enumerate(threadArr);
        int i17 = 0;
        for (int i18 = 0; i18 < enumerate; i18++) {
            java.lang.String name = threadArr[i18].getName();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(name)) {
                java.lang.String replaceAll = name.replaceAll("-?[0-9]\\d*", "?");
                if (hashMap.containsKey(replaceAll)) {
                    hashMap.put(replaceAll, java.lang.Integer.valueOf(((java.lang.Integer) hashMap.get(replaceAll)).intValue() + 1));
                } else {
                    hashMap.put(replaceAll, 1);
                }
                i17++;
            }
        }
        if (i17 >= 300) {
            sb6.append("threadCount:");
            sb6.append(i17);
            sb6.append("\n");
            sb6.append(hashMap.toString());
            sb6.append("\n");
            jx3.f.INSTANCE.mo68477x336bdfd8(959L, 8L, 1L, true);
        }
        return sb6.toString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.AbstractC16790x31088328
    public java.lang.String e() {
        return "MicroMsg.MainProcessChecker";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.AbstractC16790x31088328
    public boolean g() {
        return this.f234518s;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.AbstractC16790x31088328
    public void j(boolean z17) {
        this.f234498i = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MainProcessChecker", "[onAppForeground] isForeground:%s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            return;
        }
        this.E = android.os.SystemClock.uptimeMillis();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.AbstractC16790x31088328
    public void k(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(e(), "[onCallUp] %s -> %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            jx3.f.INSTANCE.mo68477x336bdfd8(959L, 1L, 1L, true);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f234490a;
            if (n3Var == null || n3Var.mo50287xb9a7fe99()) {
                this.f234490a = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("ProcessChecker");
            }
            this.f234490a.mo50297x7c4d7ca2(new xp3.h(this), 30000L);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.AbstractC16790x31088328
    public boolean l(long j17, long j18) {
        xp3.c cVar = this.f234491b;
        this.f234518s = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e(), "[onCheck] processId:%s loopCheckTime:%sms isForeground:%s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Boolean.valueOf(this.f234498i));
        boolean z17 = false;
        try {
            if (!this.f234518s) {
                this.A |= 0;
            } else if (!d95.f.f309202o) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f537452d)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MainProcessChecker", "it's never start activity! just return.");
                    this.A |= 2;
                } else if (this.f234498i) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MainProcessChecker", "isForeground true! just return.");
                    this.A |= 4;
                } else {
                    if (android.os.SystemClock.uptimeMillis() - this.E >= j18) {
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        java.util.Calendar calendar = java.util.Calendar.getInstance();
                        calendar.set(11, 0);
                        calendar.set(13, 0);
                        calendar.set(12, 0);
                        calendar.set(14, 0);
                        long timeInMillis = currentTimeMillis - calendar.getTimeInMillis();
                        xp3.o oVar = xp3.o.f537464c;
                        long[] jArr = F;
                        long j19 = jArr[0];
                        if (j19 <= timeInMillis && timeInMillis <= jArr[1]) {
                            if (this.f234520u) {
                                if (!(!this.f234498i && G.equalsIgnoreCase(cVar.f537452d))) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MainProcessChecker", "it cares if it whether LauncherUI to back but it's not, just return.");
                                    this.A |= 16;
                                }
                            }
                            if (h()) {
                                this.A |= 32;
                            } else {
                                if (this.f234519t) {
                                    long j27 = this.f234521v;
                                    long j28 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j8.f274317o;
                                    if (j28 > j27) {
                                        j27 = j28;
                                    }
                                    long b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j8.b(this.f234522w);
                                    long j29 = this.f234523x;
                                    long j37 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j8.f274319q;
                                    if (j37 > j29) {
                                        j29 = j37;
                                    }
                                    long b18 = j27 + b17 + j29 + com.p314xaae8f345.mm.sdk.p2603x2137b148.j8.b(this.f234524y);
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e(), "[isTraffic] diff:%s byte", java.lang.Long.valueOf(b18));
                                    if (((float) b18) > ((((float) j18) * 1.0f) / 60000.0f) * ((float) this.f234510k)) {
                                        this.A |= 512;
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e(), "is over Traffic, just return");
                                    }
                                }
                                if (this.f234519t) {
                                    long b19 = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.AbstractC16790x31088328.b() - this.f234525z;
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e(), "[isCpuBusy] diff:%s Jiffies", java.lang.Long.valueOf(b19));
                                    if (((float) b19) >= ((((float) j18) * 1.0f) / 60000.0f) * ((float) this.f234511l)) {
                                        this.A |= 1024;
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e(), "is cpu busy, just return");
                                    }
                                }
                                z17 = p();
                            }
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MainProcessChecker", "it's not at workTime[%s-%s], just return.", java.lang.Long.valueOf(j19), java.lang.Long.valueOf(jArr[1]));
                            this.A |= 8;
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MainProcessChecker", "it's not enough loopCheckTime[%s], just return.", java.lang.Long.valueOf(j18));
                        this.A |= 4;
                    }
                }
            }
            return z17;
        } finally {
            s();
            r(false);
            this.A = 1;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.AbstractC16790x31088328
    public void m() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e(), "onScreenOff enable:%s", java.lang.Boolean.valueOf(this.f234518s));
        if (this.f234518s) {
            xp3.o oVar = xp3.o.f537464c;
            if (this.D || h() || com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.AbstractC16790x31088328.f() < 3.99431958528E9d) {
                return;
            }
            ((ku5.t0) ku5.t0.f394148d).l(new xp3.g(this), java.util.concurrent.TimeUnit.MINUTES.toMillis(1L), "TAG_KILLING_DELAY");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.AbstractC16790x31088328
    public void n() {
        ((ku5.t0) ku5.t0.f394148d).A("TAG_KILLING_DELAY");
    }

    public final boolean p() {
        boolean z17;
        float maxMemory = (((float) java.lang.Runtime.getRuntime().totalMemory()) * 1.0f) / ((float) java.lang.Runtime.getRuntime().maxMemory());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e(), "[isOverMemory] java[%s:%s]", java.lang.Float.valueOf(maxMemory), java.lang.Float.valueOf(this.f234517r));
        if (maxMemory >= this.f234517r) {
            this.A |= 64;
            z17 = true;
        } else {
            z17 = false;
        }
        if (!this.D) {
            float f17 = (((float) com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.AbstractC16790x31088328.f()) * 1.0f) / 4.2949673E9f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e(), "[isOverMemory] vm[%s:%s]", java.lang.Float.valueOf(f17), java.lang.Float.valueOf(this.f234515p));
            if (f17 >= this.f234515p) {
                this.A |= 256;
                z17 = true;
            }
        }
        long nativeHeapAllocatedSize = android.os.Debug.getNativeHeapAllocatedSize();
        if (nativeHeapAllocatedSize <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MainProcessChecker", "fallback: native AllocatedSize = 0");
            nativeHeapAllocatedSize = android.os.Debug.getNativeHeapSize() - android.os.Debug.getNativeHeapFreeSize();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(e(), "[isOverMemory] native[%s:%s]", java.lang.Long.valueOf(nativeHeapAllocatedSize), java.lang.Long.valueOf(this.f234513n));
        if (!(nativeHeapAllocatedSize > this.f234513n)) {
            return z17;
        }
        this.A |= 128;
        return true;
    }

    public final boolean q(int i17, int i18) {
        return (i17 & i18) > 0;
    }

    public final void r(boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && this.f234518s) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (z17) {
                com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                c4582x424c344.m40330x4c144dd(959);
                c4582x424c344.m40331x936762bd(0);
                c4582x424c344.m40332x57b2b64f(1L);
                arrayList.add(c4582x424c344);
                com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3442 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                c4582x424c3442.m40330x4c144dd(959);
                c4582x424c3442.m40331x936762bd(2);
                c4582x424c3442.m40332x57b2b64f(1L);
                arrayList.add(c4582x424c3442);
                if (q(this.A, 64)) {
                    com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3443 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                    c4582x424c3443.m40330x4c144dd(959);
                    c4582x424c3443.m40331x936762bd(3);
                    c4582x424c3443.m40332x57b2b64f(1L);
                    arrayList.add(c4582x424c3443);
                }
                if (q(this.A, 256)) {
                    com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3444 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                    c4582x424c3444.m40330x4c144dd(959);
                    c4582x424c3444.m40331x936762bd(4);
                    c4582x424c3444.m40332x57b2b64f(1L);
                    arrayList.add(c4582x424c3444);
                }
                if (q(this.A, 128)) {
                    com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3445 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                    c4582x424c3445.m40330x4c144dd(959);
                    c4582x424c3445.m40331x936762bd(5);
                    c4582x424c3445.m40332x57b2b64f(1L);
                    arrayList.add(c4582x424c3445);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3446 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                c4582x424c3446.m40330x4c144dd(959);
                c4582x424c3446.m40332x57b2b64f(1L);
                arrayList.add(c4582x424c3446);
                if (q(this.A, 8)) {
                    c4582x424c3446.m40331x936762bd(100);
                } else if (q(this.A, 16)) {
                    c4582x424c3446.m40331x936762bd(101);
                } else if (q(this.A, 32)) {
                    c4582x424c3446.m40331x936762bd(102);
                } else if (q(this.A, 512)) {
                    c4582x424c3446.m40331x936762bd(103);
                } else if (q(this.A, 1024)) {
                    c4582x424c3446.m40331x936762bd(104);
                } else if (q(this.A, 64) || q(this.A, 128) || q(this.A, 256)) {
                    c4582x424c3446.m40331x936762bd(105);
                } else {
                    arrayList.remove(c4582x424c3446);
                }
            }
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3447 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
            c4582x424c3447.m40330x4c144dd(959);
            c4582x424c3447.m40332x57b2b64f(1L);
            arrayList.add(c4582x424c3447);
            if (q(this.A, 4)) {
                c4582x424c3447.m40331x936762bd(106);
            } else {
                c4582x424c3447.m40331x936762bd(107);
            }
            jx3.f.INSTANCE.b(arrayList, false);
        }
    }

    public final void s() {
        long j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j8.f274317o;
        if (j17 <= 0) {
            j17 = 0;
        }
        this.f234521v = j17;
        this.f234522w = com.p314xaae8f345.mm.sdk.p2603x2137b148.j8.b(0L);
        long j18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j8.f274319q;
        if (j18 <= 0) {
            j18 = 0;
        }
        this.f234523x = j18;
        long j19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j8.f274320r;
        this.f234524y = j19 > 0 ? j19 : 0L;
        this.f234525z = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.AbstractC16790x31088328.b();
    }
}
