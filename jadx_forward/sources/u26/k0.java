package u26;

/* loaded from: classes14.dex */
public final class k0 implements u26.t {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f505693d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f505694e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f505695f;

    /* renamed from: g, reason: collision with root package name */
    public static final u26.h0 f505696g = new u26.h0(null);

    /* renamed from: h, reason: collision with root package name */
    public static final p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l0 f505697h;

    /* renamed from: i, reason: collision with root package name */
    public static final u26.i0 f505698i;

    /* renamed from: _state */
    private volatile /* synthetic */ java.lang.Object f76828xa8a72792 = f505698i;

    /* renamed from: _updating */
    private volatile /* synthetic */ int f76829x543a78a5 = 0;

    /* renamed from: onCloseHandler */
    private volatile /* synthetic */ java.lang.Object f76830x4e6175b1 = null;

    static {
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l0 l0Var = new p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l0("UNDEFINED");
        f505697h = l0Var;
        f505698i = new u26.i0(l0Var, null);
        f505693d = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(u26.k0.class, java.lang.Object.class, "_state");
        f505694e = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(u26.k0.class, "_updating");
        f505695f = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(u26.k0.class, java.lang.Object.class, "onCloseHandler");
    }

    public static final void a(u26.k0 k0Var, u26.j0 j0Var) {
        boolean z17;
        u26.j0[] j0VarArr;
        do {
            java.lang.Object obj = k0Var.f76828xa8a72792;
            if (obj instanceof u26.h0) {
                return;
            }
            if (!(obj instanceof u26.i0)) {
                throw new java.lang.IllegalStateException(("Invalid state " + obj).toString());
            }
            u26.i0 i0Var = (u26.i0) obj;
            java.lang.Object obj2 = i0Var.f505687a;
            u26.j0[] j0VarArr2 = i0Var.f505688b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j0VarArr2);
            int length = j0VarArr2.length;
            int X = kz5.z.X(j0VarArr2, j0Var);
            z17 = true;
            if (length == 1) {
                j0VarArr = null;
            } else {
                u26.j0[] j0VarArr3 = new u26.j0[length - 1];
                kz5.v.p(j0VarArr2, j0VarArr3, 0, 0, X, 6, null);
                kz5.v.p(j0VarArr2, j0VarArr3, X, X + 1, 0, 8, null);
                j0VarArr = j0VarArr3;
            }
            u26.i0 i0Var2 = new u26.i0(obj2, j0VarArr);
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f505693d;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(k0Var, obj, i0Var2)) {
                    break;
                } else if (atomicReferenceFieldUpdater.get(k0Var) != obj) {
                    z17 = false;
                    break;
                }
            }
        } while (!z17);
    }

    @Override // u26.t
    public void b(java.util.concurrent.CancellationException cancellationException) {
        s(cancellationException);
    }

    public final u26.h0 c(java.lang.Object obj) {
        java.lang.Object obj2;
        boolean z17;
        if (!f505694e.compareAndSet(this, 0, 1)) {
            return null;
        }
        do {
            try {
                obj2 = this.f76828xa8a72792;
                if (obj2 instanceof u26.h0) {
                    return (u26.h0) obj2;
                }
                if (!(obj2 instanceof u26.i0)) {
                    throw new java.lang.IllegalStateException(("Invalid state " + obj2).toString());
                }
                u26.i0 i0Var = new u26.i0(obj, ((u26.i0) obj2).f505688b);
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f505693d;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, i0Var)) {
                        z17 = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        z17 = false;
                        break;
                    }
                }
            } finally {
                this.f76829x543a78a5 = 0;
            }
        } while (!z17);
        u26.j0[] j0VarArr = ((u26.i0) obj2).f505688b;
        if (j0VarArr != null) {
            for (u26.j0 j0Var : j0VarArr) {
                j0Var.u(obj);
            }
        }
        return null;
    }

    @Override // u26.t
    public u26.t0 d() {
        u26.j0[] j0VarArr;
        boolean z17;
        u26.j0 j0Var = new u26.j0(this);
        do {
            java.lang.Object obj = this.f76828xa8a72792;
            if (obj instanceof u26.h0) {
                j0Var.s(((u26.h0) obj).f505685a);
                return j0Var;
            }
            if (!(obj instanceof u26.i0)) {
                throw new java.lang.IllegalStateException(("Invalid state " + obj).toString());
            }
            u26.i0 i0Var = (u26.i0) obj;
            java.lang.Object obj2 = i0Var.f505687a;
            if (obj2 != f505697h) {
                j0Var.u(obj2);
            }
            java.lang.Object obj3 = i0Var.f505687a;
            u26.j0[] j0VarArr2 = i0Var.f505688b;
            if (j0VarArr2 == null) {
                j0VarArr = new u26.j0[]{j0Var};
            } else {
                int length = j0VarArr2.length;
                java.lang.Object[] copyOf = java.util.Arrays.copyOf(j0VarArr2, length + 1);
                copyOf[length] = j0Var;
                j0VarArr = (u26.j0[]) copyOf;
            }
            u26.i0 i0Var2 = new u26.i0(obj3, j0VarArr);
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f505693d;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, i0Var2)) {
                    z17 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    z17 = false;
                    break;
                }
            }
        } while (!z17);
        return j0Var;
    }

    @Override // u26.y0
    public java.lang.Object e(java.lang.Object obj) {
        u26.h0 c17 = c(obj);
        if (c17 == null) {
            return jz5.f0.f384359a;
        }
        java.lang.Throwable th6 = c17.f505685a;
        if (th6 == null) {
            th6 = new u26.g0("Channel was closed");
        }
        return new u26.a0(th6);
    }

    @Override // u26.y0
    public boolean j() {
        return this.f76828xa8a72792 instanceof u26.h0;
    }

    @Override // u26.y0
    public boolean s(java.lang.Throwable th6) {
        java.lang.Object obj;
        boolean z17;
        boolean z18;
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l0 l0Var;
        do {
            obj = this.f76828xa8a72792;
            z17 = false;
            if (obj instanceof u26.h0) {
                return false;
            }
            if (!(obj instanceof u26.i0)) {
                throw new java.lang.IllegalStateException(("Invalid state " + obj).toString());
            }
            u26.h0 h0Var = th6 == null ? f505696g : new u26.h0(th6);
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f505693d;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, h0Var)) {
                    z18 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    z18 = false;
                    break;
                }
            }
        } while (!z18);
        u26.j0[] j0VarArr = ((u26.i0) obj).f505688b;
        if (j0VarArr != null) {
            for (u26.j0 j0Var : j0VarArr) {
                j0Var.s(th6);
            }
        }
        java.lang.Object obj2 = this.f76830x4e6175b1;
        if (obj2 != null && obj2 != (l0Var = u26.l.f505704f)) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f505695f;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, l0Var)) {
                    z17 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                    break;
                }
            }
            if (z17) {
                p3321xbce91901.jvm.p3324x21ffc6bd.m0.e(obj2, 1);
                ((yz5.l) obj2).mo146xb9724478(th6);
            }
        }
        return true;
    }

    @Override // u26.y0
    public java.lang.Object t(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        u26.h0 c17 = c(obj);
        if (c17 == null) {
            pz5.a aVar = pz5.a.f440719d;
            return jz5.f0.f384359a;
        }
        java.lang.Throwable th6 = c17.f505685a;
        if (th6 == null) {
            throw new u26.g0("Channel was closed");
        }
        throw th6;
    }
}
