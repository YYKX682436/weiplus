package gh;

/* loaded from: classes7.dex */
public final class n0 extends gh.c implements java.lang.Runnable {

    /* renamed from: i, reason: collision with root package name */
    public final long f353374i;

    /* renamed from: m, reason: collision with root package name */
    public final gh.m0 f353375m;

    /* renamed from: n, reason: collision with root package name */
    public long f353376n;

    /* renamed from: o, reason: collision with root package name */
    public final gh.b f353377o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 runtime, ch.g jsThreadHandler) {
        super(runtime, jsThreadHandler);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsThreadHandler, "jsThreadHandler");
        this.f353374i = 1000000000 / 60;
        this.f353375m = new gh.m0();
        this.f353377o = gh.b.SchedulerLocker;
    }

    @Override // gh.c
    public gh.b b() {
        return this.f353377o;
    }

    @Override // gh.c
    public void d() {
    }

    @Override // gh.c
    public void e() {
    }

    @Override // gh.c
    public void f() {
        this.f353376n = 0L;
    }

    @Override // gh.c
    public void g() {
        this.f353376n = 0L;
        this.f353335e.k(this, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if (r0 < r4) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        if (java.lang.System.nanoTime() < r8.f353376n) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        r8.f353335e.k(r8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r8 = this;
            boolean r0 = r8.f353337g
            if (r0 != 0) goto L5
            return
        L5:
            long r0 = r8.f353376n
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L13
            long r0 = java.lang.System.nanoTime()
            r8.f353376n = r0
        L13:
            long r0 = java.lang.System.nanoTime()
            long r2 = r8.f353376n
            long r2 = r0 - r2
            long r4 = r8.f353374i
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L27
            long r6 = r2 / r4
            long r2 = r2 % r4
            long r0 = r0 - r2
            r8.f353376n = r0
        L27:
            gh.m0 r0 = r8.f353375m
            r0.getClass()
            long r0 = r8.f353376n
            double r0 = (double) r0
            r2 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r0 = r0 / r2
            r8.c(r0)
            long r0 = java.lang.System.nanoTime()
            long r2 = r8.f353376n
            long r0 = r0 - r2
            long r2 = r2 + r4
            r8.f353376n = r2
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L50
        L46:
            long r0 = java.lang.System.nanoTime()
            long r2 = r8.f353376n
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L46
        L50:
            r0 = 0
            ch.g r1 = r8.f353335e
            r1.k(r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gh.n0.run():void");
    }
}
