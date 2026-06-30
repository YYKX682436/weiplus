package o36;

/* loaded from: classes16.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final l36.a f424319a;

    /* renamed from: b, reason: collision with root package name */
    public o36.g f424320b;

    /* renamed from: c, reason: collision with root package name */
    public l36.d1 f424321c;

    /* renamed from: d, reason: collision with root package name */
    public final l36.t f424322d;

    /* renamed from: e, reason: collision with root package name */
    public final l36.n f424323e;

    /* renamed from: f, reason: collision with root package name */
    public final l36.f0 f424324f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f424325g;

    /* renamed from: h, reason: collision with root package name */
    public final o36.h f424326h;

    /* renamed from: i, reason: collision with root package name */
    public int f424327i;

    /* renamed from: j, reason: collision with root package name */
    public o36.d f424328j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f424329k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f424330l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f424331m;

    /* renamed from: n, reason: collision with root package name */
    public p36.d f424332n;

    public j(l36.t tVar, l36.a aVar, l36.n nVar, l36.f0 f0Var, java.lang.Object obj) {
        this.f424322d = tVar;
        this.f424319a = aVar;
        this.f424323e = nVar;
        this.f424324f = f0Var;
        ((l36.o0) m36.a.f404915a).getClass();
        this.f424326h = new o36.h(aVar, tVar.f397176e, nVar, f0Var);
        this.f424325g = obj;
    }

    public void a(o36.d dVar, boolean z17) {
        if (this.f424328j != null) {
            throw new java.lang.IllegalStateException();
        }
        this.f424328j = dVar;
        this.f424329k = z17;
        ((java.util.ArrayList) dVar.f424304n).add(new o36.i(this, this.f424325g));
    }

    public synchronized o36.d b() {
        return this.f424328j;
    }

    public final java.net.Socket c(boolean z17, boolean z18, boolean z19) {
        java.net.Socket socket;
        if (z19) {
            this.f424332n = null;
        }
        boolean z27 = true;
        if (z18) {
            this.f424330l = true;
        }
        o36.d dVar = this.f424328j;
        if (dVar == null) {
            return null;
        }
        if (z17) {
            dVar.f424301k = true;
        }
        if (this.f424332n != null) {
            return null;
        }
        if (!this.f424330l && !dVar.f424301k) {
            return null;
        }
        int size = ((java.util.ArrayList) dVar.f424304n).size();
        for (int i17 = 0; i17 < size; i17++) {
            java.util.ArrayList arrayList = (java.util.ArrayList) dVar.f424304n;
            if (((java.lang.ref.Reference) arrayList.get(i17)).get() == this) {
                arrayList.remove(i17);
                if (((java.util.ArrayList) this.f424328j.f424304n).isEmpty()) {
                    this.f424328j.f424305o = java.lang.System.nanoTime();
                    m36.a aVar = m36.a.f404915a;
                    o36.d dVar2 = this.f424328j;
                    ((l36.o0) aVar).getClass();
                    l36.t tVar = this.f424322d;
                    tVar.getClass();
                    if (dVar2.f424301k || tVar.f397172a == 0) {
                        ((java.util.ArrayDeque) tVar.f397175d).remove(dVar2);
                    } else {
                        tVar.notifyAll();
                        z27 = false;
                    }
                    if (z27) {
                        socket = this.f424328j.f424295e;
                        this.f424328j = null;
                        return socket;
                    }
                }
                socket = null;
                this.f424328j = null;
                return socket;
            }
        }
        throw new java.lang.IllegalStateException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0075, code lost:
    
        if ((r0.f424310b < r0.f424309a.size()) == false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0248 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o36.d d(int r25, int r26, int r27, int r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 849
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o36.j.d(int, int, int, int, boolean):o36.d");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0087 A[LOOP:0: B:1:0x0000->B:39:0x0087, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o36.d e(int r13, int r14, int r15, int r16, boolean r17, boolean r18) {
        /*
            r12 = this;
        L0:
            o36.d r1 = r12.d(r13, r14, r15, r16, r17)
            r2 = r12
            l36.t r3 = r2.f424322d
            monitor-enter(r3)
            int r0 = r1.f424302l     // Catch: java.lang.Throwable -> L19
            r4 = 1
            r5 = 0
            if (r0 != 0) goto L1c
            r36.z r0 = r1.f424298h     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L14
            r0 = r4
            goto L15
        L14:
            r0 = r5
        L15:
            if (r0 != 0) goto L1c
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L19
            return r1
        L19:
            r0 = move-exception
            goto L8d
        L1c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L19
            java.net.Socket r0 = r1.f424295e
            boolean r0 = r0.isClosed()
            if (r0 != 0) goto L84
            java.net.Socket r0 = r1.f424295e
            boolean r0 = r0.isInputShutdown()
            if (r0 != 0) goto L84
            java.net.Socket r0 = r1.f424295e
            boolean r0 = r0.isOutputShutdown()
            if (r0 == 0) goto L36
            goto L84
        L36:
            r36.z r3 = r1.f424298h
            if (r3 == 0) goto L5a
            long r6 = java.lang.System.nanoTime()
            monitor-enter(r3)
            boolean r0 = r3.f451010m     // Catch: java.lang.Throwable -> L57
            if (r0 == 0) goto L45
            monitor-exit(r3)
            goto L84
        L45:
            long r8 = r3.f451017t     // Catch: java.lang.Throwable -> L57
            long r10 = r3.f451016s     // Catch: java.lang.Throwable -> L57
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 >= 0) goto L55
            long r8 = r3.f451018u     // Catch: java.lang.Throwable -> L57
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 < 0) goto L55
            monitor-exit(r3)
            goto L84
        L55:
            monitor-exit(r3)
            goto L85
        L57:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L5a:
            if (r18 == 0) goto L85
            java.net.Socket r0 = r1.f424295e     // Catch: java.io.IOException -> L84 java.net.SocketTimeoutException -> L85
            int r3 = r0.getSoTimeout()     // Catch: java.io.IOException -> L84 java.net.SocketTimeoutException -> L85
            java.net.Socket r0 = r1.f424295e     // Catch: java.lang.Throwable -> L7d
            r0.setSoTimeout(r4)     // Catch: java.lang.Throwable -> L7d
            x36.m r0 = r1.f424299i     // Catch: java.lang.Throwable -> L7d
            x36.b0 r0 = (x36.b0) r0     // Catch: java.lang.Throwable -> L7d
            boolean r0 = r0.o1()     // Catch: java.lang.Throwable -> L7d
            if (r0 == 0) goto L77
            java.net.Socket r0 = r1.f424295e     // Catch: java.io.IOException -> L84 java.net.SocketTimeoutException -> L85
            r0.setSoTimeout(r3)     // Catch: java.io.IOException -> L84 java.net.SocketTimeoutException -> L85
            goto L84
        L77:
            java.net.Socket r0 = r1.f424295e     // Catch: java.io.IOException -> L84 java.net.SocketTimeoutException -> L85
            r0.setSoTimeout(r3)     // Catch: java.io.IOException -> L84 java.net.SocketTimeoutException -> L85
            goto L85
        L7d:
            r0 = move-exception
            java.net.Socket r6 = r1.f424295e     // Catch: java.io.IOException -> L84 java.net.SocketTimeoutException -> L85
            r6.setSoTimeout(r3)     // Catch: java.io.IOException -> L84 java.net.SocketTimeoutException -> L85
            throw r0     // Catch: java.io.IOException -> L84 java.net.SocketTimeoutException -> L85
        L84:
            r4 = r5
        L85:
            if (r4 != 0) goto L8c
            r12.f()
            goto L0
        L8c:
            return r1
        L8d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L19
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o36.j.e(int, int, int, int, boolean, boolean):o36.d");
    }

    public void f() {
        o36.d dVar;
        java.net.Socket c17;
        synchronized (this.f424322d) {
            dVar = this.f424328j;
            c17 = c(true, false, false);
            if (this.f424328j != null) {
                dVar = null;
            }
        }
        m36.e.d(c17);
        if (dVar != null) {
            this.f424324f.getClass();
        }
    }

    public void g() {
        o36.d dVar;
        java.net.Socket c17;
        synchronized (this.f424322d) {
            dVar = this.f424328j;
            c17 = c(false, true, false);
            if (this.f424328j != null) {
                dVar = null;
            }
        }
        m36.e.d(c17);
        if (dVar != null) {
            m36.a aVar = m36.a.f404915a;
            l36.n nVar = this.f424323e;
            ((l36.o0) aVar).getClass();
            ((l36.u0) nVar).d(null);
            this.f424324f.getClass();
            this.f424324f.getClass();
        }
    }

    public void h(java.io.IOException iOException) {
        o36.d dVar;
        boolean z17;
        java.net.Socket c17;
        synchronized (this.f424322d) {
            try {
                dVar = null;
                if (iOException instanceof r36.n0) {
                    r36.b bVar = ((r36.n0) iOException).f450977d;
                    if (bVar == r36.b.REFUSED_STREAM) {
                        int i17 = this.f424327i + 1;
                        this.f424327i = i17;
                        if (i17 > 1) {
                            this.f424321c = null;
                            z17 = true;
                        }
                        z17 = false;
                    } else {
                        if (bVar != r36.b.CANCEL) {
                            this.f424321c = null;
                            z17 = true;
                        }
                        z17 = false;
                    }
                } else {
                    o36.d dVar2 = this.f424328j;
                    if (dVar2 != null) {
                        if (!(dVar2.f424298h != null) || (iOException instanceof r36.a)) {
                            if (dVar2.f424302l == 0) {
                                l36.d1 d1Var = this.f424321c;
                                if (d1Var != null && iOException != null) {
                                    this.f424326h.a(d1Var, iOException);
                                }
                                this.f424321c = null;
                            }
                            z17 = true;
                        }
                    }
                    z17 = false;
                }
                o36.d dVar3 = this.f424328j;
                c17 = c(z17, false, true);
                if (this.f424328j == null && this.f424329k) {
                    dVar = dVar3;
                }
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
        m36.e.d(c17);
        if (dVar != null) {
            this.f424324f.getClass();
        }
    }

    public void i(boolean z17, p36.d dVar, long j17, java.io.IOException iOException) {
        o36.d dVar2;
        java.net.Socket c17;
        boolean z18;
        this.f424324f.getClass();
        synchronized (this.f424322d) {
            if (dVar != null) {
                if (dVar == this.f424332n) {
                    if (!z17) {
                        this.f424328j.f424302l++;
                    }
                    dVar2 = this.f424328j;
                    c17 = c(z17, false, true);
                    if (this.f424328j != null) {
                        dVar2 = null;
                    }
                    z18 = this.f424330l;
                }
            }
            throw new java.lang.IllegalStateException("expected " + this.f424332n + " but was " + dVar);
        }
        m36.e.d(c17);
        if (dVar2 != null) {
            this.f424324f.getClass();
        }
        if (iOException != null) {
            m36.a aVar = m36.a.f404915a;
            l36.n nVar = this.f424323e;
            ((l36.o0) aVar).getClass();
            ((l36.u0) nVar).d(iOException);
            this.f424324f.getClass();
            return;
        }
        if (z18) {
            m36.a aVar2 = m36.a.f404915a;
            l36.n nVar2 = this.f424323e;
            ((l36.o0) aVar2).getClass();
            ((l36.u0) nVar2).d(null);
            this.f424324f.getClass();
        }
    }

    /* renamed from: toString */
    public java.lang.String m150562x9616526c() {
        o36.d b17 = b();
        return b17 != null ? b17.m150561x9616526c() : this.f424319a.m145009x9616526c();
    }
}
