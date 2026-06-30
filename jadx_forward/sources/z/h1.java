package z;

/* loaded from: classes14.dex */
public final class h1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f550210d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f550211e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f550212f;

    /* renamed from: g, reason: collision with root package name */
    public int f550213g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f550214h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z.f1 f550215i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z.i1 f550216m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.l f550217n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(z.f1 f1Var, z.i1 i1Var, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f550215i = f1Var;
        this.f550216m = i1Var;
        this.f550217n = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        z.h1 h1Var = new z.h1(this.f550215i, this.f550216m, this.f550217n, interfaceC29045xdcb5ca57);
        h1Var.f550214h = obj;
        return h1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((z.h1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        z.i1 i1Var;
        z.g1 g1Var;
        boolean z17;
        yz5.l lVar;
        z.g1 g1Var2;
        java.lang.Object obj2;
        java.lang.Object obj3;
        z.g1 g1Var3;
        z.i1 i1Var2;
        java.lang.Throwable th6;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        java.util.concurrent.atomic.AtomicReference atomicReference2;
        pz5.a aVar = pz5.a.f440719d;
        ?? r17 = this.f550213g;
        try {
            try {
                if (r17 == 0) {
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                    oz5.l f93115e = ((p3325xe03a0797.p3326xc267989b.y0) this.f550214h).getF93115e();
                    int i17 = p3325xe03a0797.p3326xc267989b.r2.O0;
                    oz5.i iVar = f93115e.get(p3325xe03a0797.p3326xc267989b.q2.f392104d);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(iVar);
                    z.g1 g1Var4 = new z.g1(this.f550215i, (p3325xe03a0797.p3326xc267989b.r2) iVar);
                    do {
                        i1Var = this.f550216m;
                        java.util.concurrent.atomic.AtomicReference atomicReference3 = i1Var.f550230a;
                        g1Var = (z.g1) atomicReference3.get();
                        z17 = false;
                        if (g1Var != null) {
                            if (!(g1Var4.f550200a.compareTo(g1Var.f550200a) >= 0)) {
                                throw new java.util.concurrent.CancellationException("Current mutation had a higher priority");
                            }
                        }
                        while (true) {
                            if (atomicReference3.compareAndSet(g1Var, g1Var4)) {
                                z17 = true;
                                break;
                            }
                            if (atomicReference3.get() != g1Var) {
                                break;
                            }
                        }
                    } while (!z17);
                    if (g1Var != null) {
                        p3325xe03a0797.p3326xc267989b.p2.a(g1Var.f550201b, null, 1, null);
                    }
                    p3325xe03a0797.p3326xc267989b.p3332x361a9b.d dVar = i1Var.f550231b;
                    this.f550214h = g1Var4;
                    this.f550210d = dVar;
                    yz5.l lVar2 = this.f550217n;
                    this.f550211e = lVar2;
                    this.f550212f = i1Var;
                    this.f550213g = 1;
                    p3325xe03a0797.p3326xc267989b.p3332x361a9b.k kVar = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) dVar;
                    if (kVar.b(null, this) == aVar) {
                        return aVar;
                    }
                    lVar = lVar2;
                    g1Var2 = g1Var4;
                    obj2 = kVar;
                } else {
                    if (r17 != 1) {
                        if (r17 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i1Var2 = (z.i1) this.f550211e;
                        obj3 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.d) this.f550210d;
                        g1Var3 = (z.g1) this.f550214h;
                        try {
                            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                            atomicReference2 = i1Var2.f550230a;
                            while (!atomicReference2.compareAndSet(g1Var3, null) && atomicReference2.get() == g1Var3) {
                            }
                            ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) obj3).d(null);
                            return obj;
                        } catch (java.lang.Throwable th7) {
                            th6 = th7;
                            atomicReference = i1Var2.f550230a;
                            while (!atomicReference.compareAndSet(g1Var3, null)) {
                            }
                            throw th6;
                        }
                    }
                    z.i1 i1Var3 = (z.i1) this.f550212f;
                    lVar = (yz5.l) this.f550211e;
                    java.lang.Object obj4 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.d) this.f550210d;
                    g1Var2 = (z.g1) this.f550214h;
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                    i1Var = i1Var3;
                    obj2 = obj4;
                }
                this.f550214h = g1Var2;
                this.f550210d = obj3;
                this.f550211e = i1Var;
                this.f550212f = null;
                this.f550213g = 2;
                java.lang.Object mo146xb9724478 = lVar.mo146xb9724478(this);
                if (mo146xb9724478 == aVar) {
                    return aVar;
                }
                i1Var2 = i1Var;
                obj = mo146xb9724478;
                g1Var3 = g1Var2;
                atomicReference2 = i1Var2.f550230a;
                while (!atomicReference2.compareAndSet(g1Var3, null)) {
                }
                ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) obj3).d(null);
                return obj;
            } catch (java.lang.Throwable th8) {
                g1Var3 = g1Var2;
                i1Var2 = i1Var;
                th6 = th8;
                atomicReference = i1Var2.f550230a;
                while (!atomicReference.compareAndSet(g1Var3, null) && atomicReference.get() == g1Var3) {
                }
                throw th6;
            }
            obj3 = obj2;
        } catch (java.lang.Throwable th9) {
            ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) r17).d(null);
            throw th9;
        }
    }
}
