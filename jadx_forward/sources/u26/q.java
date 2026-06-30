package u26;

/* loaded from: classes14.dex */
public final class q extends u26.o implements u26.t {

    /* renamed from: _head */
    private volatile /* synthetic */ long f76833x56b86bf;

    /* renamed from: _size */
    private volatile /* synthetic */ int f76834x57098e0;

    /* renamed from: _tail */
    private volatile /* synthetic */ long f76835x570ed2f;

    /* renamed from: g, reason: collision with root package name */
    public final int f505719g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f505720h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Object[] f505721i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f505722m;

    public q(int i17) {
        super(null);
        this.f505719g = i17;
        if (!(i17 >= 1)) {
            throw new java.lang.IllegalArgumentException(("ArrayBroadcastChannel capacity must be at least 1, but " + i17 + " was specified").toString());
        }
        this.f505720h = new java.util.concurrent.locks.ReentrantLock();
        this.f505721i = new java.lang.Object[i17];
        this.f76833x56b86bf = 0L;
        this.f76835x570ed2f = 0L;
        this.f76834x57098e0 = 0;
        java.lang.reflect.Method method = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.e.f392024a;
        this.f505722m = new java.util.concurrent.CopyOnWriteArrayList();
    }

    public static final long x(u26.q qVar) {
        return qVar.f76835x570ed2f;
    }

    public static void z(u26.q qVar, u26.p pVar, u26.p pVar2, int i17, java.lang.Object obj) {
        u26.w0 w17;
        if ((i17 & 1) != 0) {
            pVar = null;
        }
        if ((i17 & 2) != 0) {
            pVar2 = null;
        }
        while (true) {
            java.util.concurrent.locks.ReentrantLock reentrantLock = qVar.f505720h;
            reentrantLock.lock();
            if (pVar != null) {
                try {
                    pVar.J(qVar.f76835x570ed2f);
                    boolean isEmpty = ((java.util.concurrent.CopyOnWriteArrayList) qVar.f505722m).isEmpty();
                    ((java.util.concurrent.CopyOnWriteArrayList) qVar.f505722m).add(pVar);
                    if (!isEmpty) {
                        return;
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            if (pVar2 != null) {
                ((java.util.concurrent.CopyOnWriteArrayList) qVar.f505722m).remove(pVar2);
                if (qVar.f76833x56b86bf != pVar2.H()) {
                    return;
                }
            }
            java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) qVar.f505722m).iterator();
            long j17 = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
            while (it.hasNext()) {
                long H = ((u26.p) it.next()).H();
                if (j17 > H) {
                    j17 = H;
                }
            }
            long j18 = qVar.f76835x570ed2f;
            long j19 = qVar.f76833x56b86bf;
            if (j17 > j18) {
                j17 = j18;
            }
            if (j17 <= j19) {
                return;
            }
            int i18 = qVar.f76834x57098e0;
            while (j19 < j17) {
                java.lang.Object[] objArr = qVar.f505721i;
                int i19 = qVar.f505719g;
                objArr[(int) (j19 % i19)] = null;
                boolean z17 = i18 >= i19;
                j19++;
                qVar.f76833x56b86bf = j19;
                i18--;
                qVar.f76834x57098e0 = i18;
                if (z17) {
                    do {
                        w17 = qVar.w();
                        if (w17 != null && !(w17 instanceof u26.e0)) {
                        }
                    } while (w17.y(null) == null);
                    qVar.f505721i[(int) (j18 % qVar.f505719g)] = w17.w();
                    qVar.f76834x57098e0 = i18 + 1;
                    qVar.f76835x570ed2f = j18 + 1;
                    reentrantLock.unlock();
                    w17.u();
                    qVar.y();
                    pVar = null;
                    pVar2 = null;
                }
            }
            return;
        }
    }

    @Override // u26.t
    public void b(java.util.concurrent.CancellationException cancellationException) {
        s(cancellationException);
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.f505722m).iterator();
        while (it.hasNext()) {
            u26.p pVar = (u26.p) it.next();
            pVar.B(pVar.s(cancellationException));
        }
    }

    @Override // u26.t
    public u26.t0 d() {
        u26.p pVar = new u26.p(this);
        z(this, pVar, null, 2, null);
        return pVar;
    }

    @Override // u26.o
    public java.lang.String f() {
        return "(buffer:capacity=" + this.f505721i.length + ",size=" + this.f76834x57098e0 + ')';
    }

    @Override // u26.o
    public boolean p() {
        return false;
    }

    @Override // u26.o
    public boolean q() {
        return this.f76834x57098e0 >= this.f505719g;
    }

    @Override // u26.o, u26.y0
    public boolean s(java.lang.Throwable th6) {
        if (!super.s(th6)) {
            return false;
        }
        y();
        return true;
    }

    @Override // u26.o
    public java.lang.Object u(java.lang.Object obj) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f505720h;
        reentrantLock.lock();
        try {
            u26.e0 l17 = l();
            if (l17 != null) {
                return l17;
            }
            int i17 = this.f76834x57098e0;
            if (i17 >= this.f505719g) {
                return u26.l.f505701c;
            }
            long j17 = this.f76835x570ed2f;
            this.f505721i[(int) (j17 % this.f505719g)] = obj;
            this.f76834x57098e0 = i17 + 1;
            this.f76835x570ed2f = j17 + 1;
            reentrantLock.unlock();
            y();
            return u26.l.f505700b;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void y() {
        boolean z17;
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.f505722m).iterator();
        boolean z18 = false;
        loop0: while (true) {
            z17 = z18;
            while (it.hasNext()) {
                if (((u26.p) it.next()).G()) {
                    break;
                } else {
                    z17 = true;
                }
            }
            z18 = true;
        }
        if (z18 || !z17) {
            z(this, null, null, 3, null);
        }
    }
}
