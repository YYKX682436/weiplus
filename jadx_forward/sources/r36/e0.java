package r36;

/* loaded from: classes16.dex */
public final class e0 implements x36.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final x36.k f450915d = new x36.k();

    /* renamed from: e, reason: collision with root package name */
    public final x36.k f450916e = new x36.k();

    /* renamed from: f, reason: collision with root package name */
    public final long f450917f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f450918g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f450919h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r36.g0 f450920i;

    public e0(r36.g0 g0Var, long j17) {
        this.f450920i = g0Var;
        this.f450917f = j17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        r13 = -1;
     */
    @Override // x36.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long B(x36.k r13, long r14) {
        /*
            r12 = this;
            r0 = 0
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 < 0) goto Lab
        L6:
            r36.g0 r2 = r12.f450920i
            monitor-enter(r2)
            r36.g0 r3 = r12.f450920i     // Catch: java.lang.Throwable -> La8
            r36.f0 r3 = r3.f450936i     // Catch: java.lang.Throwable -> La8
            r3.i()     // Catch: java.lang.Throwable -> La8
            r36.g0 r3 = r12.f450920i     // Catch: java.lang.Throwable -> L9f
            r36.b r4 = r3.f450938k     // Catch: java.lang.Throwable -> L9f
            if (r4 == 0) goto L17
            goto L18
        L17:
            r4 = 0
        L18:
            boolean r5 = r12.f450918g     // Catch: java.lang.Throwable -> L9f
            if (r5 != 0) goto L97
            java.util.Deque r3 = r3.f450932e     // Catch: java.lang.Throwable -> L9f
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3     // Catch: java.lang.Throwable -> L9f
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L9f
            if (r3 != 0) goto L2b
            r36.g0 r3 = r12.f450920i     // Catch: java.lang.Throwable -> L9f
            r3.getClass()     // Catch: java.lang.Throwable -> L9f
        L2b:
            x36.k r3 = r12.f450916e     // Catch: java.lang.Throwable -> L9f
            long r5 = r3.f533227e     // Catch: java.lang.Throwable -> L9f
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r8 = -1
            if (r7 <= 0) goto L65
            long r14 = java.lang.Math.min(r14, r5)     // Catch: java.lang.Throwable -> L9f
            long r13 = r3.B(r13, r14)     // Catch: java.lang.Throwable -> L9f
            r36.g0 r15 = r12.f450920i     // Catch: java.lang.Throwable -> L9f
            long r5 = r15.f450928a     // Catch: java.lang.Throwable -> L9f
            long r5 = r5 + r13
            r15.f450928a = r5     // Catch: java.lang.Throwable -> L9f
            if (r4 != 0) goto L7a
            r36.z r15 = r15.f450931d     // Catch: java.lang.Throwable -> L9f
            r36.m0 r15 = r15.f451021x     // Catch: java.lang.Throwable -> L9f
            int r15 = r15.a()     // Catch: java.lang.Throwable -> L9f
            int r15 = r15 / 2
            long r10 = (long) r15     // Catch: java.lang.Throwable -> L9f
            int r15 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r15 < 0) goto L7a
            r36.g0 r15 = r12.f450920i     // Catch: java.lang.Throwable -> L9f
            r36.z r3 = r15.f450931d     // Catch: java.lang.Throwable -> L9f
            int r5 = r15.f450930c     // Catch: java.lang.Throwable -> L9f
            long r6 = r15.f450928a     // Catch: java.lang.Throwable -> L9f
            r3.q(r5, r6)     // Catch: java.lang.Throwable -> L9f
            r36.g0 r15 = r12.f450920i     // Catch: java.lang.Throwable -> L9f
            r15.f450928a = r0     // Catch: java.lang.Throwable -> L9f
            goto L7a
        L65:
            boolean r3 = r12.f450919h     // Catch: java.lang.Throwable -> L9f
            if (r3 != 0) goto L79
            if (r4 != 0) goto L79
            r36.g0 r3 = r12.f450920i     // Catch: java.lang.Throwable -> L9f
            r3.g()     // Catch: java.lang.Throwable -> L9f
            r36.g0 r3 = r12.f450920i     // Catch: java.lang.Throwable -> La8
            r36.f0 r3 = r3.f450936i     // Catch: java.lang.Throwable -> La8
            r3.m()     // Catch: java.lang.Throwable -> La8
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La8
            goto L6
        L79:
            r13 = r8
        L7a:
            r36.g0 r15 = r12.f450920i     // Catch: java.lang.Throwable -> La8
            r36.f0 r15 = r15.f450936i     // Catch: java.lang.Throwable -> La8
            r15.m()     // Catch: java.lang.Throwable -> La8
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La8
            int r15 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r15 == 0) goto L8e
            r36.g0 r15 = r12.f450920i
            r36.z r15 = r15.f450931d
            r15.k(r13)
            return r13
        L8e:
            if (r4 != 0) goto L91
            return r8
        L91:
            r36.n0 r13 = new r36.n0
            r13.<init>(r4)
            throw r13
        L97:
            java.io.IOException r13 = new java.io.IOException     // Catch: java.lang.Throwable -> L9f
            java.lang.String r14 = "stream closed"
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L9f
            throw r13     // Catch: java.lang.Throwable -> L9f
        L9f:
            r13 = move-exception
            r36.g0 r14 = r12.f450920i     // Catch: java.lang.Throwable -> La8
            r36.f0 r14 = r14.f450936i     // Catch: java.lang.Throwable -> La8
            r14.m()     // Catch: java.lang.Throwable -> La8
            throw r13     // Catch: java.lang.Throwable -> La8
        La8:
            r13 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La8
            throw r13
        Lab:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "byteCount < 0: "
            r0.<init>(r1)
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: r36.e0.B(x36.k, long):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j17;
        synchronized (this.f450920i) {
            this.f450918g = true;
            x36.k kVar = this.f450916e;
            j17 = kVar.f533227e;
            kVar.mo174960x35e57f(j17);
            if (!((java.util.ArrayDeque) this.f450920i.f450932e).isEmpty()) {
                this.f450920i.getClass();
            }
            this.f450920i.notifyAll();
        }
        if (j17 > 0) {
            this.f450920i.f450931d.k(j17);
        }
        this.f450920i.a();
    }

    @Override // x36.h0
    public x36.j0 h() {
        return this.f450920i.f450936i;
    }
}
