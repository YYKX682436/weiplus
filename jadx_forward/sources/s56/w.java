package s56;

/* loaded from: classes16.dex */
public final class w extends p56.r implements u56.b {

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f484789i;

    /* renamed from: m, reason: collision with root package name */
    public final p56.r f484790m;

    /* renamed from: o, reason: collision with root package name */
    public final u56.c f484792o;

    /* renamed from: q, reason: collision with root package name */
    public final r56.a f484794q;

    /* renamed from: r, reason: collision with root package name */
    public final p56.b f484795r;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f484788h = new java.util.concurrent.ConcurrentLinkedQueue();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f484791n = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: p, reason: collision with root package name */
    public final s56.j f484793p = s56.j.f484748a;

    public w(p56.r rVar, java.lang.Long l17, r56.a aVar, p56.b bVar) {
        this.f484790m = rVar;
        this.f484789i = l17 != null ? new java.util.concurrent.atomic.AtomicLong(l17.longValue()) : null;
        this.f484794q = aVar;
        this.f484792o = new u56.c(this);
        this.f484795r = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if (r3 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r7 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        r3.incrementAndGet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (r7 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        r8 = r9.f484794q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (r8 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r7 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        r8.mo740x2e7a5e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
    
        q56.f.b(r2);
        r1.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003d, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x002c, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0033, code lost:
    
        if (r9.f484791n.compareAndSet(false, true) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0007, code lost:
    
        if (r3 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0035, code lost:
    
        c();
        r9.f484790m.mo157869xaf8aa769(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        if (r3.compareAndSet(r4, r4 - 1) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005c, code lost:
    
        if (r2 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005f, code lost:
    
        r9.f484793p.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
    
        if (r10 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        r4 = r3.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0066, code lost:
    
        r10 = s56.j.f484750c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0068, code lost:
    
        r0.offer(r10);
        r1.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r4 > 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r9.f484795r.a() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        r7 = r0.poll();
     */
    @Override // p56.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.Object r10) {
        /*
            r9 = this;
            java.util.concurrent.ConcurrentLinkedQueue r0 = r9.f484788h
            u56.c r1 = r9.f484792o
            r2 = 1
            java.util.concurrent.atomic.AtomicLong r3 = r9.f484789i
            if (r3 != 0) goto La
            goto L5c
        La:
            long r4 = r3.get()
            r6 = 0
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 > 0) goto L52
            r6 = 0
            p56.b r7 = r9.f484795r     // Catch: q56.g -> L2c
            boolean r7 = r7.a()     // Catch: q56.g -> L2c
            if (r7 == 0) goto L3d
            java.lang.Object r7 = r0.poll()     // Catch: q56.g -> L2c
            if (r3 == 0) goto L28
            if (r7 == 0) goto L28
            r3.incrementAndGet()     // Catch: q56.g -> L2c
        L28:
            if (r7 == 0) goto L3d
            r7 = r2
            goto L3e
        L2c:
            r7 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r8 = r9.f484791n
            boolean r8 = r8.compareAndSet(r6, r2)
            if (r8 == 0) goto L3d
            r9.c()
            p56.r r8 = r9.f484790m
            r8.mo157869xaf8aa769(r7)
        L3d:
            r7 = r6
        L3e:
            r56.a r8 = r9.f484794q
            if (r8 == 0) goto L4e
            r8.mo740x2e7a5e()     // Catch: java.lang.Throwable -> L46
            goto L4e
        L46:
            r2 = move-exception
            q56.f.b(r2)
            r1.b(r2)
            goto L50
        L4e:
            if (r7 != 0) goto L52
        L50:
            r2 = r6
            goto L5c
        L52:
            r6 = 1
            long r6 = r4 - r6
            boolean r4 = r3.compareAndSet(r4, r6)
            if (r4 == 0) goto La
        L5c:
            if (r2 != 0) goto L5f
            return
        L5f:
            s56.j r2 = r9.f484793p
            r2.getClass()
            if (r10 != 0) goto L68
            java.lang.Object r10 = s56.j.f484750c
        L68:
            r0.offer(r10)
            r1.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s56.w.a(java.lang.Object):void");
    }

    @Override // p56.r
    public void e() {
        f(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697);
    }

    @Override // p56.m
    /* renamed from: onCompleted */
    public void mo157868xaa8b332c() {
        if (this.f484791n.get()) {
            return;
        }
        u56.c cVar = this.f484792o;
        cVar.f506352e = true;
        cVar.a();
    }

    @Override // p56.m
    /* renamed from: onError */
    public void mo157869xaf8aa769(java.lang.Throwable th6) {
        if (this.f484791n.get()) {
            return;
        }
        this.f484792o.b(th6);
    }
}
