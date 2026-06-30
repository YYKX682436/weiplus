package p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd;

/* loaded from: classes14.dex */
public class t {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f392058d = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t.class, java.lang.Object.class, "_next");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f392059e = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t.class, java.lang.Object.class, "_prev");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f392060f = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t.class, java.lang.Object.class, "_removedRef");

    /* renamed from: _next */
    volatile /* synthetic */ java.lang.Object f72720x56e43d2 = this;

    /* renamed from: _prev */
    volatile /* synthetic */ java.lang.Object f72721x56f5b12 = this;

    /* renamed from: _removedRef */
    private volatile /* synthetic */ java.lang.Object f72722x826021b2 = null;

    /* renamed from: dispose */
    public void mo144008x63a5261f() {
        q();
    }

    public final boolean i(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t tVar, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t tVar2) {
        boolean z17;
        f392059e.lazySet(tVar, this);
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f392058d;
        atomicReferenceFieldUpdater.lazySet(tVar, tVar2);
        while (true) {
            if (atomicReferenceFieldUpdater.compareAndSet(this, tVar2, tVar)) {
                z17 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != tVar2) {
                z17 = false;
                break;
            }
        }
        if (!z17) {
            return false;
        }
        tVar.k(tVar2);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        r7 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t.f392058d;
        r4 = ((p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.f0) r4).f392026a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (r7.compareAndSet(r3, r2, r4) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (r7.get(r3) == r2) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
    
        if (r5 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        r5 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t j(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.e0 r11) {
        /*
            r10 = this;
        L0:
            java.lang.Object r0 = r10.f72721x56f5b12
            kotlinx.coroutines.internal.t r0 = (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t) r0
            r1 = 0
            r2 = r0
        L6:
            r3 = r1
        L7:
            java.lang.Object r4 = r2.f72720x56e43d2
            r5 = 0
            r6 = 1
            if (r4 != r10) goto L24
            if (r0 != r2) goto L10
            return r2
        L10:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t.f392059e
        L12:
            boolean r1 = r7.compareAndSet(r10, r0, r2)
            if (r1 == 0) goto L1a
            r5 = r6
            goto L20
        L1a:
            java.lang.Object r1 = r7.get(r10)
            if (r1 == r0) goto L12
        L20:
            if (r5 != 0) goto L23
            goto L0
        L23:
            return r2
        L24:
            boolean r7 = r10.p()
            if (r7 == 0) goto L2b
            return r1
        L2b:
            if (r4 != r11) goto L2e
            return r2
        L2e:
            boolean r7 = r4 instanceof p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.e0
            if (r7 == 0) goto L44
            if (r11 == 0) goto L3e
            r0 = r4
            kotlinx.coroutines.internal.e0 r0 = (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.e0) r0
            boolean r0 = r11.b(r0)
            if (r0 == 0) goto L3e
            return r1
        L3e:
            kotlinx.coroutines.internal.e0 r4 = (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.e0) r4
            r4.c(r2)
            goto L0
        L44:
            boolean r7 = r4 instanceof p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.f0
            if (r7 == 0) goto L68
            if (r3 == 0) goto L63
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t.f392058d
            kotlinx.coroutines.internal.f0 r4 = (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.f0) r4
            kotlinx.coroutines.internal.t r4 = r4.f392026a
        L50:
            boolean r8 = r7.compareAndSet(r3, r2, r4)
            if (r8 == 0) goto L58
            r5 = r6
            goto L5e
        L58:
            java.lang.Object r8 = r7.get(r3)
            if (r8 == r2) goto L50
        L5e:
            if (r5 != 0) goto L61
            goto L0
        L61:
            r2 = r3
            goto L6
        L63:
            java.lang.Object r2 = r2.f72721x56f5b12
            kotlinx.coroutines.internal.t r2 = (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t) r2
            goto L7
        L68:
            r3 = r4
            kotlinx.coroutines.internal.t r3 = (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t) r3
            r9 = r3
            r3 = r2
            r2 = r9
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t.j(kotlinx.coroutines.internal.e0):kotlinx.coroutines.internal.t");
    }

    public final void k(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t tVar) {
        boolean z17;
        do {
            p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t tVar2 = (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t) tVar.f72721x56f5b12;
            if (l() != tVar) {
                return;
            }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f392059e;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(tVar, tVar2, this)) {
                    z17 = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(tVar) != tVar2) {
                    z17 = false;
                    break;
                }
            }
        } while (!z17);
        if (p()) {
            tVar.j(null);
        }
    }

    public final java.lang.Object l() {
        while (true) {
            java.lang.Object obj = this.f72720x56e43d2;
            if (!(obj instanceof p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.e0)) {
                return obj;
            }
            ((p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.e0) obj).c(this);
        }
    }

    public final p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t m() {
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t tVar;
        java.lang.Object l17 = l();
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.f0 f0Var = l17 instanceof p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.f0 ? (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.f0) l17 : null;
        return (f0Var == null || (tVar = f0Var.f392026a) == null) ? (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t) l17 : tVar;
    }

    public final p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t n() {
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t j17 = j(null);
        if (j17 == null) {
            java.lang.Object obj = this.f72721x56f5b12;
            while (true) {
                j17 = (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t) obj;
                if (!j17.p()) {
                    break;
                }
                obj = j17.f72721x56f5b12;
            }
        }
        return j17;
    }

    public final void o() {
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t tVar = this;
        while (true) {
            java.lang.Object l17 = tVar.l();
            if (!(l17 instanceof p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.f0)) {
                tVar.j(null);
                return;
            }
            tVar = ((p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.f0) l17).f392026a;
        }
    }

    public boolean p() {
        return l() instanceof p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.f0;
    }

    public boolean q() {
        return r() == null;
    }

    public final p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t r() {
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t tVar;
        boolean z17;
        do {
            java.lang.Object l17 = l();
            if (l17 instanceof p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.f0) {
                return ((p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.f0) l17).f392026a;
            }
            if (l17 == this) {
                return (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t) l17;
            }
            tVar = (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t) l17;
            p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.f0 s17 = tVar.s();
            while (true) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f392058d;
                if (atomicReferenceFieldUpdater.compareAndSet(this, l17, s17)) {
                    z17 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != l17) {
                    z17 = false;
                    break;
                }
            }
        } while (!z17);
        tVar.j(null);
        return null;
    }

    public final p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.f0 s() {
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.f0 f0Var = (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.f0) this.f72722x826021b2;
        if (f0Var != null) {
            return f0Var;
        }
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.f0 f0Var2 = new p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.f0(this);
        f392060f.lazySet(this, f0Var2);
        return f0Var2;
    }

    public final int t(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t tVar, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t tVar2, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.p pVar) {
        boolean z17;
        f392059e.lazySet(tVar, this);
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f392058d;
        atomicReferenceFieldUpdater.lazySet(tVar, tVar2);
        pVar.f392047c = tVar2;
        while (true) {
            if (atomicReferenceFieldUpdater.compareAndSet(this, tVar2, pVar)) {
                z17 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != tVar2) {
                z17 = false;
                break;
            }
        }
        if (z17) {
            return pVar.c(this) == null ? 1 : 2;
        }
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String mo144017x9616526c() {
        return new p3321xbce91901.jvm.p3324x21ffc6bd.y(this) { // from class: kotlinx.coroutines.internal.s
            @Override // p3321xbce91901.jvm.p3324x21ffc6bd.y, f06.s
            public java.lang.Object get() {
                return this.f72685xcfcbe9ef.getClass().getSimpleName();
            }
        } + '@' + p3325xe03a0797.p3326xc267989b.c1.a(this);
    }
}
