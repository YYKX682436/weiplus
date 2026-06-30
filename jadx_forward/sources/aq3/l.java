package aq3;

/* loaded from: classes12.dex */
public final class l implements com.p314xaae8f345.mm.app.t2, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a4, com.p314xaae8f345.mm.app.y2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f94715d = new java.util.concurrent.atomic.AtomicInteger();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f94716e = new java.util.concurrent.atomic.AtomicInteger();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f94717f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final boolean f94718g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f94719h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f94720i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f94721m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f94722n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f94723o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f94724p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f94725q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f94726r;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f94727s;

    /* renamed from: t, reason: collision with root package name */
    public final aq3.k f94728t;

    /* renamed from: u, reason: collision with root package name */
    public final aq3.i f94729u;

    /* renamed from: v, reason: collision with root package name */
    public final aq3.j f94730v;

    /* renamed from: w, reason: collision with root package name */
    public long f94731w;

    /* renamed from: x, reason: collision with root package name */
    public long f94732x;

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f94733y;

    static {
        jz5.h.b(aq3.d.f94702d);
    }

    public l() {
        int i17 = (o45.wf.f424563h || o45.wf.f424565j) ? j62.e.g().i("clicfg_threadpool_profiler_report_release", 10, true, true) : j62.e.g().i("clicfg_threadpool_profiler_report_alpha", 100000, true, true);
        int nextInt = new java.util.Random().nextInt(100000);
        boolean z17 = i17 >= nextInt;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ThreadPool.Profiler", "[isNeedReport] rand=" + i17 + " test=" + nextInt + " isEnable=" + z17 + " isRelease=" + o45.wf.f424563h + " isTest=" + o45.wf.f424565j);
        this.f94718g = z17;
        this.f94719h = new java.util.concurrent.ConcurrentHashMap();
        this.f94720i = new java.util.concurrent.ConcurrentHashMap(100);
        new java.util.concurrent.ConcurrentHashMap(100);
        this.f94721m = new java.util.concurrent.atomic.AtomicLong();
        this.f94722n = new java.util.concurrent.atomic.AtomicLong();
        this.f94723o = new java.util.concurrent.atomic.AtomicLong();
        this.f94724p = new java.util.concurrent.atomic.AtomicLong();
        this.f94725q = new java.util.concurrent.atomic.AtomicLong();
        this.f94726r = new java.util.concurrent.atomic.AtomicLong();
        this.f94727s = new int[2];
        this.f94728t = new aq3.k(this);
        this.f94729u = new aq3.i(this);
        this.f94730v = new aq3.j(this);
        new java.util.HashMap();
        new java.util.ArrayList();
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(android.os.Environment.getExternalStorageDirectory().getPath());
            java.lang.String str = java.io.File.separator;
            sb6.append(str);
            sb6.append(android.os.Environment.DIRECTORY_PICTURES);
            sb6.append(str);
            sb6.append("Screenshots");
            sb6.append(str);
            java.lang.String sb7 = sb6.toString();
            java.lang.String str2 = android.os.Environment.getExternalStorageDirectory().getPath() + str + android.os.Environment.DIRECTORY_DCIM + str + "Screenshots" + str;
            new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b4(sb7, this);
            new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b4(str2, this);
        } catch (java.lang.Throwable th6) {
            oj.j.d("ThreadPool.Profiler", th6, "", new java.lang.Object[0]);
        }
        android.os.SystemClock.uptimeMillis();
        android.os.SystemClock.currentThreadTimeMillis();
        this.f94733y = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(xu5.b.a("ThreadPool.Profiler"), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new aq3.g(this), true);
        android.os.Looper.getMainLooper().getThread().getId();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a4
    public void a(java.lang.String str) {
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0511 A[LOOP:11: B:179:0x050b->B:181:0x0511, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x052a A[Catch: Exception -> 0x05d1, TryCatch #4 {Exception -> 0x05d1, blocks: (B:183:0x051d, B:185:0x052a, B:188:0x0552, B:189:0x055c, B:191:0x0562, B:193:0x056a, B:195:0x05c6, B:196:0x05ca, B:198:0x05cb), top: B:182:0x051d }] */
    @Override // com.p314xaae8f345.mm.app.y2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(boolean r22) {
        /*
            Method dump skipped, instructions count: 1506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aq3.l.b(boolean):void");
    }

    public final void c() {
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        if (uptimeMillis - this.f94731w < 300000) {
            return;
        }
        aq3.j jVar = this.f94730v;
        jVar.getClass();
        try {
            for (java.util.Map.Entry entry : new java.util.HashMap(jVar.f94713a.f94719h).entrySet()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append("~~~ ");
                sb6.append((java.lang.String) entry.getKey());
                sb6.append(" state=");
                aq3.f fVar = (aq3.f) entry.getValue();
                java.lang.Long l17 = null;
                sb6.append(fVar != null ? fVar.f94707d : null);
                sb6.append(" pool=");
                aq3.f fVar2 = (aq3.f) entry.getValue();
                sb6.append(fVar2 != null ? fVar2.f94708e : null);
                sb6.append(" start@=");
                aq3.f fVar3 = (aq3.f) entry.getValue();
                sb6.append(fVar3 != null ? java.lang.Long.valueOf(fVar3.f94704a) : null);
                sb6.append("ms delay=");
                aq3.f fVar4 = (aq3.f) entry.getValue();
                sb6.append(fVar4 != null ? java.lang.Long.valueOf(fVar4.f94705b) : null);
                sb6.append("ms run@=");
                aq3.f fVar5 = (aq3.f) entry.getValue();
                if (fVar5 != null) {
                    l17 = java.lang.Long.valueOf(fVar5.f94706c);
                }
                sb6.append(l17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ThreadPool.Execute", sb6.toString());
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("ThreadPool.Profiler", th6, "", new java.lang.Object[0]);
        }
        this.f94731w = uptimeMillis;
    }

    public final void d() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[dumpThreadPool]\n averageUITime=");
        float f17 = ((float) this.f94724p.get()) * 1.0f;
        java.util.concurrent.atomic.AtomicLong atomicLong = this.f94726r;
        sb6.append(f17 / ((float) atomicLong.get()));
        sb6.append(" averageUIThreadTime=");
        sb6.append((((float) this.f94725q.get()) * 1.0f) / ((float) atomicLong.get()));
        sb6.append("\naverageOtherTime=");
        float f18 = ((float) this.f94721m.get()) * 1.0f;
        java.util.concurrent.atomic.AtomicLong atomicLong2 = this.f94723o;
        sb6.append(f18 / ((float) atomicLong2.get()));
        sb6.append(" averageOtherThreadTime=");
        sb6.append((((float) this.f94722n.get()) * 1.0f) / ((float) atomicLong2.get()));
        sb6.append("\nuiTaskCount=");
        sb6.append(atomicLong.get());
        sb6.append(" otherTaskCount=");
        sb6.append(atomicLong2.get());
        sb6.append("\nuiBusyConcurrent=");
        sb6.append(this.f94727s[1]);
        sb6.append(" averageUIConcurrent=");
        sb6.append((r1[0] * 1.0f) / r1[1]);
        sb6.append(" concurrentRadio=");
        sb6.append((r1[1] * 1.0f) / ((float) atomicLong.get()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ThreadPool.Profiler", sb6.toString());
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppBackground */
    public void mo8889x3be51a90(java.lang.String str) {
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppForeground */
    public void mo8890x1952ea5(java.lang.String str) {
    }
}
