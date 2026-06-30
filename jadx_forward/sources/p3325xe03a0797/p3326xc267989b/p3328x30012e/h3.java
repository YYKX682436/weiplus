package p3325xe03a0797.p3326xc267989b.p3328x30012e;

/* loaded from: classes14.dex */
public final class h3 extends v26.b implements p3325xe03a0797.p3326xc267989b.p3328x30012e.j2, p3325xe03a0797.p3326xc267989b.p3328x30012e.j, v26.h0 {

    /* renamed from: _state */
    private volatile /* synthetic */ java.lang.Object f72703xa8a72792;

    /* renamed from: h, reason: collision with root package name */
    public int f391822h;

    public h3(java.lang.Object obj) {
        this.f72703xa8a72792 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ac, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r4, r0) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0093, code lost:
    
        if (r0 != r3) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0093, code lost:
    
        if (0 == 0) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0097 A[Catch: all -> 0x00a3, TryCatch #0 {all -> 0x00a3, blocks: (B:13:0x0042, B:14:0x0093, B:16:0x0097, B:19:0x009e, B:20:0x00a2, B:24:0x00a8, B:26:0x00c9, B:30:0x00e1, B:31:0x00f9, B:36:0x0109, B:38:0x010d, B:39:0x0114, B:33:0x0103, B:50:0x00ae, B:53:0x00b5, B:61:0x0060, B:63:0x0073, B:64:0x0084), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(p3325xe03a0797.p3326xc267989b.p3328x30012e.k r18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r19) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p3325xe03a0797.p3326xc267989b.p3328x30012e.h3.a(kotlinx.coroutines.flow.k, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // v26.h0
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j b(oz5.l lVar, int i17, u26.u uVar) {
        return ((((i17 >= 0 && i17 < 2) || i17 == -2) && uVar == u26.u.DROP_OLDEST) || ((i17 == 0 || i17 == -3) && uVar == u26.u.SUSPEND)) ? this : new v26.o(this, lVar, i17, uVar);
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.i2
    public void d() {
        throw new java.lang.UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.i2
    public boolean e(java.lang.Object obj) {
        k(obj);
        return true;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.i2, p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        k(obj);
        return jz5.f0.f384359a;
    }

    @Override // v26.b
    public v26.d f() {
        return new p3325xe03a0797.p3326xc267989b.p3328x30012e.j3();
    }

    @Override // v26.b
    public v26.d[] g(int i17) {
        return new p3325xe03a0797.p3326xc267989b.p3328x30012e.j3[i17];
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.f3
    /* renamed from: getValue */
    public java.lang.Object mo144003x754a37bb() {
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l0 l0Var = v26.k0.f514553a;
        java.lang.Object obj = this.f72703xa8a72792;
        if (obj == l0Var) {
            return null;
        }
        return obj;
    }

    public boolean j(java.lang.Object obj, java.lang.Object obj2) {
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l0 l0Var = v26.k0.f514553a;
        if (obj == null) {
            obj = l0Var;
        }
        if (obj2 == null) {
            obj2 = l0Var;
        }
        return l(obj, obj2);
    }

    public void k(java.lang.Object obj) {
        if (obj == null) {
            obj = v26.k0.f514553a;
        }
        l(null, obj);
    }

    public final boolean l(java.lang.Object obj, java.lang.Object obj2) {
        int i17;
        v26.d[] dVarArr;
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l0 l0Var;
        boolean z17;
        boolean z18;
        synchronized (this) {
            java.lang.Object obj3 = this.f72703xa8a72792;
            if (obj != null && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj3, obj)) {
                return false;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj3, obj2)) {
                return true;
            }
            this.f72703xa8a72792 = obj2;
            int i18 = this.f391822h;
            if ((i18 & 1) != 0) {
                this.f391822h = i18 + 2;
                return true;
            }
            int i19 = i18 + 1;
            this.f391822h = i19;
            v26.d[] dVarArr2 = this.f514516d;
            while (true) {
                p3325xe03a0797.p3326xc267989b.p3328x30012e.j3[] j3VarArr = (p3325xe03a0797.p3326xc267989b.p3328x30012e.j3[]) dVarArr2;
                if (j3VarArr != null) {
                    for (p3325xe03a0797.p3326xc267989b.p3328x30012e.j3 j3Var : j3VarArr) {
                        if (j3Var != null) {
                            while (true) {
                                java.lang.Object obj4 = j3Var.f72704xa8a72792;
                                if (obj4 != null && obj4 != (l0Var = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.f391830b)) {
                                    p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l0 l0Var2 = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.f391829a;
                                    if (obj4 != l0Var2) {
                                        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p3325xe03a0797.p3326xc267989b.p3328x30012e.j3.f391832a;
                                        while (true) {
                                            if (atomicReferenceFieldUpdater.compareAndSet(j3Var, obj4, l0Var2)) {
                                                z18 = true;
                                                break;
                                            }
                                            if (atomicReferenceFieldUpdater.get(j3Var) != obj4) {
                                                z18 = false;
                                                break;
                                            }
                                        }
                                        if (z18) {
                                            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                                            ((p3325xe03a0797.p3326xc267989b.r) obj4).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a));
                                            break;
                                        }
                                    } else {
                                        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = p3325xe03a0797.p3326xc267989b.p3328x30012e.j3.f391832a;
                                        while (true) {
                                            if (atomicReferenceFieldUpdater2.compareAndSet(j3Var, obj4, l0Var)) {
                                                z17 = true;
                                                break;
                                            }
                                            if (atomicReferenceFieldUpdater2.get(j3Var) != obj4) {
                                                z17 = false;
                                                break;
                                            }
                                        }
                                        if (z17) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i17 = this.f391822h;
                    if (i17 == i19) {
                        this.f391822h = i19 + 1;
                        return true;
                    }
                    dVarArr = this.f514516d;
                }
                dVarArr2 = dVarArr;
                i19 = i17;
            }
        }
    }
}
