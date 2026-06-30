package aq3;

/* loaded from: classes12.dex */
public final class l implements com.tencent.mm.app.t2, com.tencent.mm.pluginsdk.model.a4, com.tencent.mm.app.y2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f13182d = new java.util.concurrent.atomic.AtomicInteger();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f13183e = new java.util.concurrent.atomic.AtomicInteger();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f13184f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final boolean f13185g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f13186h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f13187i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f13188m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f13189n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f13190o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f13191p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f13192q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f13193r;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f13194s;

    /* renamed from: t, reason: collision with root package name */
    public final aq3.k f13195t;

    /* renamed from: u, reason: collision with root package name */
    public final aq3.i f13196u;

    /* renamed from: v, reason: collision with root package name */
    public final aq3.j f13197v;

    /* renamed from: w, reason: collision with root package name */
    public long f13198w;

    /* renamed from: x, reason: collision with root package name */
    public long f13199x;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f13200y;

    static {
        jz5.h.b(aq3.d.f13169d);
    }

    public l() {
        int i17 = (o45.wf.f343030h || o45.wf.f343032j) ? j62.e.g().i("clicfg_threadpool_profiler_report_release", 10, true, true) : j62.e.g().i("clicfg_threadpool_profiler_report_alpha", 100000, true, true);
        int nextInt = new java.util.Random().nextInt(100000);
        boolean z17 = i17 >= nextInt;
        com.tencent.mars.xlog.Log.i("ThreadPool.Profiler", "[isNeedReport] rand=" + i17 + " test=" + nextInt + " isEnable=" + z17 + " isRelease=" + o45.wf.f343030h + " isTest=" + o45.wf.f343032j);
        this.f13185g = z17;
        this.f13186h = new java.util.concurrent.ConcurrentHashMap();
        this.f13187i = new java.util.concurrent.ConcurrentHashMap(100);
        new java.util.concurrent.ConcurrentHashMap(100);
        this.f13188m = new java.util.concurrent.atomic.AtomicLong();
        this.f13189n = new java.util.concurrent.atomic.AtomicLong();
        this.f13190o = new java.util.concurrent.atomic.AtomicLong();
        this.f13191p = new java.util.concurrent.atomic.AtomicLong();
        this.f13192q = new java.util.concurrent.atomic.AtomicLong();
        this.f13193r = new java.util.concurrent.atomic.AtomicLong();
        this.f13194s = new int[2];
        this.f13195t = new aq3.k(this);
        this.f13196u = new aq3.i(this);
        this.f13197v = new aq3.j(this);
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
            new com.tencent.mm.pluginsdk.model.b4(sb7, this);
            new com.tencent.mm.pluginsdk.model.b4(str2, this);
        } catch (java.lang.Throwable th6) {
            oj.j.d("ThreadPool.Profiler", th6, "", new java.lang.Object[0]);
        }
        android.os.SystemClock.uptimeMillis();
        android.os.SystemClock.currentThreadTimeMillis();
        this.f13200y = new com.tencent.mm.sdk.platformtools.b4(xu5.b.a("ThreadPool.Profiler"), (com.tencent.mm.sdk.platformtools.a4) new aq3.g(this), true);
        android.os.Looper.getMainLooper().getThread().getId();
    }

    @Override // com.tencent.mm.pluginsdk.model.a4
    public void a(java.lang.String str) {
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0511 A[LOOP:11: B:179:0x050b->B:181:0x0511, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x052a A[Catch: Exception -> 0x05d1, TryCatch #4 {Exception -> 0x05d1, blocks: (B:183:0x051d, B:185:0x052a, B:188:0x0552, B:189:0x055c, B:191:0x0562, B:193:0x056a, B:195:0x05c6, B:196:0x05ca, B:198:0x05cb), top: B:182:0x051d }] */
    @Override // com.tencent.mm.app.y2
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
        if (uptimeMillis - this.f13198w < 300000) {
            return;
        }
        aq3.j jVar = this.f13197v;
        jVar.getClass();
        try {
            for (java.util.Map.Entry entry : new java.util.HashMap(jVar.f13180a.f13186h).entrySet()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append("~~~ ");
                sb6.append((java.lang.String) entry.getKey());
                sb6.append(" state=");
                aq3.f fVar = (aq3.f) entry.getValue();
                java.lang.Long l17 = null;
                sb6.append(fVar != null ? fVar.f13174d : null);
                sb6.append(" pool=");
                aq3.f fVar2 = (aq3.f) entry.getValue();
                sb6.append(fVar2 != null ? fVar2.f13175e : null);
                sb6.append(" start@=");
                aq3.f fVar3 = (aq3.f) entry.getValue();
                sb6.append(fVar3 != null ? java.lang.Long.valueOf(fVar3.f13171a) : null);
                sb6.append("ms delay=");
                aq3.f fVar4 = (aq3.f) entry.getValue();
                sb6.append(fVar4 != null ? java.lang.Long.valueOf(fVar4.f13172b) : null);
                sb6.append("ms run@=");
                aq3.f fVar5 = (aq3.f) entry.getValue();
                if (fVar5 != null) {
                    l17 = java.lang.Long.valueOf(fVar5.f13173c);
                }
                sb6.append(l17);
                com.tencent.mars.xlog.Log.i("ThreadPool.Execute", sb6.toString());
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("ThreadPool.Profiler", th6, "", new java.lang.Object[0]);
        }
        this.f13198w = uptimeMillis;
    }

    public final void d() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[dumpThreadPool]\n averageUITime=");
        float f17 = ((float) this.f13191p.get()) * 1.0f;
        java.util.concurrent.atomic.AtomicLong atomicLong = this.f13193r;
        sb6.append(f17 / ((float) atomicLong.get()));
        sb6.append(" averageUIThreadTime=");
        sb6.append((((float) this.f13192q.get()) * 1.0f) / ((float) atomicLong.get()));
        sb6.append("\naverageOtherTime=");
        float f18 = ((float) this.f13188m.get()) * 1.0f;
        java.util.concurrent.atomic.AtomicLong atomicLong2 = this.f13190o;
        sb6.append(f18 / ((float) atomicLong2.get()));
        sb6.append(" averageOtherThreadTime=");
        sb6.append((((float) this.f13189n.get()) * 1.0f) / ((float) atomicLong2.get()));
        sb6.append("\nuiTaskCount=");
        sb6.append(atomicLong.get());
        sb6.append(" otherTaskCount=");
        sb6.append(atomicLong2.get());
        sb6.append("\nuiBusyConcurrent=");
        sb6.append(this.f13194s[1]);
        sb6.append(" averageUIConcurrent=");
        sb6.append((r1[0] * 1.0f) / r1[1]);
        sb6.append(" concurrentRadio=");
        sb6.append((r1[1] * 1.0f) / ((float) atomicLong.get()));
        com.tencent.mars.xlog.Log.i("ThreadPool.Profiler", sb6.toString());
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
    }
}
