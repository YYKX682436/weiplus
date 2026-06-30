package p3325xe03a0797.p3326xc267989b;

/* loaded from: classes14.dex */
public abstract class b2 extends p3325xe03a0797.p3326xc267989b.c2 implements p3325xe03a0797.p3326xc267989b.i1 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f391671i = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p3325xe03a0797.p3326xc267989b.b2.class, java.lang.Object.class, "_queue");

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f391672m = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p3325xe03a0797.p3326xc267989b.b2.class, java.lang.Object.class, "_delayed");

    /* renamed from: _queue */
    private volatile /* synthetic */ java.lang.Object f72694xa88b7c12 = null;

    /* renamed from: _delayed */
    private volatile /* synthetic */ java.lang.Object f72692xe8f81823 = null;

    /* renamed from: _isCompleted */
    private volatile /* synthetic */ int f72693xcd8a9682 = 0;

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public static final boolean T(p3325xe03a0797.p3326xc267989b.b2 b2Var) {
        return b2Var.f72693xcd8a9682;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p0
    public final void D(oz5.l lVar, java.lang.Runnable runnable) {
        V(runnable);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    @Override // p3325xe03a0797.p3326xc267989b.w1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long P() {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p3325xe03a0797.p3326xc267989b.b2.P():long");
    }

    public void V(java.lang.Runnable runnable) {
        if (!W(runnable)) {
            p3325xe03a0797.p3326xc267989b.d1.f391690n.V(runnable);
            return;
        }
        java.lang.Thread R = R();
        if (java.lang.Thread.currentThread() != R) {
            java.util.concurrent.locks.LockSupport.unpark(R);
        }
    }

    public final boolean W(java.lang.Runnable runnable) {
        while (true) {
            java.lang.Object obj = this.f72694xa88b7c12;
            boolean z17 = false;
            if (this.f72693xcd8a9682 != 0) {
                return false;
            }
            if (obj == null) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f391671i;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        z17 = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                if (z17) {
                    return true;
                }
            } else if (obj instanceof p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.y) {
                p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.y yVar = (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.y) obj;
                int a17 = yVar.a(runnable);
                if (a17 == 0) {
                    return true;
                }
                if (a17 == 1) {
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f391671i;
                    p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.y e17 = yVar.e();
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, e17) && atomicReferenceFieldUpdater2.get(this) == obj) {
                    }
                } else if (a17 == 2) {
                    return false;
                }
            } else {
                if (obj == p3325xe03a0797.p3326xc267989b.d2.f391693b) {
                    return false;
                }
                p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.y yVar2 = new p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.y(8, true);
                yVar2.a((java.lang.Runnable) obj);
                yVar2.a(runnable);
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f391671i;
                while (true) {
                    if (atomicReferenceFieldUpdater3.compareAndSet(this, obj, yVar2)) {
                        z17 = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater3.get(this) != obj) {
                        break;
                    }
                }
                if (z17) {
                    return true;
                }
            }
        }
    }

    public boolean X() {
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.a aVar = this.f392222g;
        if (!(aVar == null || aVar.f392014b == aVar.f392015c)) {
            return false;
        }
        p3325xe03a0797.p3326xc267989b.a2 a2Var = (p3325xe03a0797.p3326xc267989b.a2) this.f72692xe8f81823;
        if (a2Var != null && !a2Var.b()) {
            return false;
        }
        java.lang.Object obj = this.f72694xa88b7c12;
        if (obj != null) {
            if (obj instanceof p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.y) {
                return ((p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.y) obj).d();
            }
            if (obj != p3325xe03a0797.p3326xc267989b.d2.f391693b) {
                return false;
            }
        }
        return true;
    }

    public final void Z() {
        this.f72694xa88b7c12 = null;
        this.f72692xe8f81823 = null;
    }

    public final void a0(long j17, p3325xe03a0797.p3326xc267989b.z1 z1Var) {
        int i17;
        java.lang.Thread R;
        if (this.f72693xcd8a9682 != 0) {
            i17 = 1;
        } else {
            p3325xe03a0797.p3326xc267989b.a2 a2Var = (p3325xe03a0797.p3326xc267989b.a2) this.f72692xe8f81823;
            if (a2Var == null) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f391672m;
                p3325xe03a0797.p3326xc267989b.a2 a2Var2 = new p3325xe03a0797.p3326xc267989b.a2(j17);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, a2Var2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                java.lang.Object obj = this.f72692xe8f81823;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
                a2Var = (p3325xe03a0797.p3326xc267989b.a2) obj;
            }
            i17 = z1Var.i(j17, a2Var, this);
        }
        if (i17 != 0) {
            if (i17 == 1) {
                S(j17, z1Var);
                return;
            } else {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("unexpected result".toString());
                }
                return;
            }
        }
        p3325xe03a0797.p3326xc267989b.a2 a2Var3 = (p3325xe03a0797.p3326xc267989b.a2) this.f72692xe8f81823;
        if (a2Var3 != null) {
            synchronized (a2Var3) {
                p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t0[] t0VarArr = a2Var3.f392057a;
                r1 = t0VarArr != null ? t0VarArr[0] : null;
            }
            r1 = (p3325xe03a0797.p3326xc267989b.z1) r1;
        }
        if (!(r1 == z1Var) || java.lang.Thread.currentThread() == (R = R())) {
            return;
        }
        java.util.concurrent.locks.LockSupport.unpark(R);
    }

    @Override // p3325xe03a0797.p3326xc267989b.w1
    /* renamed from: shutdown */
    public void mo143971xf5e80656() {
        p3325xe03a0797.p3326xc267989b.z1 z1Var;
        p3325xe03a0797.p3326xc267989b.v3 v3Var = p3325xe03a0797.p3326xc267989b.v3.f392217a;
        p3325xe03a0797.p3326xc267989b.v3.f392218b.set(null);
        this.f72693xcd8a9682 = 1;
        while (true) {
            java.lang.Object obj = this.f72694xa88b7c12;
            p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l0 l0Var = p3325xe03a0797.p3326xc267989b.d2.f391693b;
            boolean z17 = false;
            if (obj == null) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f391671i;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, l0Var)) {
                        z17 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                if (z17) {
                    break;
                }
            } else {
                if (obj instanceof p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.y) {
                    ((p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.y) obj).b();
                    break;
                }
                if (obj == l0Var) {
                    break;
                }
                p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.y yVar = new p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.y(8, true);
                yVar.a((java.lang.Runnable) obj);
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f391671i;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, yVar)) {
                        z17 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
                if (z17) {
                    break;
                }
            }
        }
        do {
        } while (P() <= 0);
        long nanoTime = java.lang.System.nanoTime();
        while (true) {
            p3325xe03a0797.p3326xc267989b.a2 a2Var = (p3325xe03a0797.p3326xc267989b.a2) this.f72692xe8f81823;
            if (a2Var == null || (z1Var = (p3325xe03a0797.p3326xc267989b.z1) a2Var.d()) == null) {
                return;
            } else {
                S(nanoTime, z1Var);
            }
        }
    }

    @Override // p3325xe03a0797.p3326xc267989b.i1
    public p3325xe03a0797.p3326xc267989b.s1 v(long j17, java.lang.Runnable runnable, oz5.l lVar) {
        return p3325xe03a0797.p3326xc267989b.e1.f391706a.v(j17, runnable, lVar);
    }

    @Override // p3325xe03a0797.p3326xc267989b.i1
    public void w(long j17, p3325xe03a0797.p3326xc267989b.q qVar) {
        long j18 = j17 > 0 ? j17 >= 9223372036854L ? com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697 : 1000000 * j17 : 0L;
        if (j18 < 4611686018427387903L) {
            long nanoTime = java.lang.System.nanoTime();
            p3325xe03a0797.p3326xc267989b.x1 x1Var = new p3325xe03a0797.p3326xc267989b.x1(this, j18 + nanoTime, qVar);
            a0(nanoTime, x1Var);
            ((p3325xe03a0797.p3326xc267989b.r) qVar).m(new p3325xe03a0797.p3326xc267989b.t1(x1Var));
        }
    }
}
