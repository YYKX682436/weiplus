package v5;

/* loaded from: classes14.dex */
public final class j extends x36.q implements yz5.l {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f514820e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Thread f514821f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p3325xe03a0797.p3326xc267989b.q continuation, x36.h0 delegate) {
        super(delegate);
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(continuation, "continuation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(1);
        this.f514820e = atomicInteger;
        this.f514821f = java.lang.Thread.currentThread();
        ((p3325xe03a0797.p3326xc267989b.r) continuation).m(this);
        do {
            i17 = atomicInteger.get();
            if (i17 != 1) {
                if (i17 == 3 || i17 == 4 || i17 == 5) {
                    return;
                }
                f(i17);
                throw null;
            }
        } while (!this.f514820e.compareAndSet(i17, 1));
    }

    @Override // x36.q, x36.h0
    public long B(x36.k sink, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sink, "sink");
        try {
            i(false);
            return super.B(sink, j17);
        } finally {
            i(true);
        }
    }

    public final void a() {
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.f514820e;
        while (true) {
            int i17 = atomicInteger.get();
            if (i17 == 0 || i17 == 3) {
                if (atomicInteger.compareAndSet(i17, 2)) {
                    return;
                }
            } else if (i17 != 4) {
                if (i17 == 5) {
                    java.lang.Thread.interrupted();
                    return;
                } else {
                    f(i17);
                    throw null;
                }
            }
        }
    }

    public final java.lang.Void f(int i17) {
        throw new java.lang.IllegalStateException(p3321xbce91901.jvm.p3324x21ffc6bd.o.m("Illegal state: ", java.lang.Integer.valueOf(i17)).toString());
    }

    public final void i(boolean z17) {
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.f514820e;
        while (true) {
            int i17 = atomicInteger.get();
            if (i17 == 0 || i17 == 1) {
                if (atomicInteger.compareAndSet(i17, 1 ^ (z17 ? 1 : 0))) {
                    return;
                }
            } else if (i17 != 3) {
                if (i17 != 4) {
                    if (i17 == 5) {
                        java.lang.Thread.interrupted();
                        return;
                    } else {
                        f(i17);
                        throw null;
                    }
                }
            } else if (atomicInteger.compareAndSet(i17, 4)) {
                this.f514821f.interrupt();
                atomicInteger.set(5);
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        return jz5.f0.f384359a;
     */
    @Override // yz5.l
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo146xb9724478(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            java.util.concurrent.atomic.AtomicInteger r6 = r5.f514820e
        L4:
            int r0 = r6.get()
            r1 = 5
            r2 = 4
            if (r0 == 0) goto L26
            r3 = 1
            r4 = 3
            if (r0 == r3) goto L1f
            r6 = 2
            if (r0 == r6) goto L34
            if (r0 == r4) goto L34
            if (r0 == r2) goto L34
            if (r0 != r1) goto L1a
            goto L34
        L1a:
            r5.f(r0)
            r6 = 0
            throw r6
        L1f:
            boolean r0 = r6.compareAndSet(r0, r4)
            if (r0 == 0) goto L4
            goto L34
        L26:
            boolean r0 = r6.compareAndSet(r0, r2)
            if (r0 == 0) goto L4
            java.lang.Thread r0 = r5.f514821f
            r0.interrupt()
            r6.set(r1)
        L34:
            jz5.f0 r6 = jz5.f0.f384359a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: v5.j.mo146xb9724478(java.lang.Object):java.lang.Object");
    }
}
