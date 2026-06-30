package a0;

/* loaded from: classes14.dex */
public final class m2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f81749d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f81750e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f81751f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f81752g;

    /* renamed from: h, reason: collision with root package name */
    public int f81753h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f81754i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a0.k2 f81755m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ a0.n2 f81756n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yz5.p f81757o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f81758p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(a0.k2 k2Var, a0.n2 n2Var, yz5.p pVar, java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f81755m = k2Var;
        this.f81756n = n2Var;
        this.f81757o = pVar;
        this.f81758p = obj;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        a0.m2 m2Var = new a0.m2(this.f81755m, this.f81756n, this.f81757o, this.f81758p, interfaceC29045xdcb5ca57);
        m2Var.f81754i = obj;
        return m2Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((a0.m2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        a0.n2 n2Var;
        a0.l2 l2Var;
        boolean z17;
        java.lang.Object obj2;
        a0.l2 l2Var2;
        p3325xe03a0797.p3326xc267989b.p3332x361a9b.d dVar;
        yz5.p pVar;
        a0.l2 l2Var3;
        a0.n2 n2Var2;
        java.lang.Throwable th6;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        java.util.concurrent.atomic.AtomicReference atomicReference2;
        pz5.a aVar = pz5.a.f440719d;
        ?? r17 = this.f81753h;
        try {
            try {
                if (r17 == 0) {
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                    oz5.l f93115e = ((p3325xe03a0797.p3326xc267989b.y0) this.f81754i).getF93115e();
                    int i17 = p3325xe03a0797.p3326xc267989b.r2.O0;
                    oz5.i iVar = f93115e.get(p3325xe03a0797.p3326xc267989b.q2.f392104d);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(iVar);
                    a0.l2 l2Var4 = new a0.l2(this.f81755m, (p3325xe03a0797.p3326xc267989b.r2) iVar);
                    do {
                        n2Var = this.f81756n;
                        java.util.concurrent.atomic.AtomicReference atomicReference3 = n2Var.f81772a;
                        l2Var = (a0.l2) atomicReference3.get();
                        z17 = false;
                        if (l2Var != null) {
                            if (!(l2Var4.f81745a.compareTo(l2Var.f81745a) >= 0)) {
                                throw new java.util.concurrent.CancellationException("Current mutation had a higher priority");
                            }
                        }
                        while (true) {
                            if (atomicReference3.compareAndSet(l2Var, l2Var4)) {
                                z17 = true;
                                break;
                            }
                            if (atomicReference3.get() != l2Var) {
                                break;
                            }
                        }
                    } while (!z17);
                    if (l2Var != null) {
                        p3325xe03a0797.p3326xc267989b.p2.a(l2Var.f81746b, null, 1, null);
                    }
                    p3325xe03a0797.p3326xc267989b.p3332x361a9b.d dVar2 = n2Var.f81773b;
                    this.f81754i = l2Var4;
                    this.f81749d = dVar2;
                    yz5.p pVar2 = this.f81757o;
                    this.f81750e = pVar2;
                    java.lang.Object obj3 = this.f81758p;
                    this.f81751f = obj3;
                    this.f81752g = n2Var;
                    this.f81753h = 1;
                    p3325xe03a0797.p3326xc267989b.p3332x361a9b.k kVar = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) dVar2;
                    if (kVar.b(null, this) == aVar) {
                        return aVar;
                    }
                    obj2 = obj3;
                    l2Var2 = l2Var4;
                    dVar = kVar;
                    pVar = pVar2;
                } else {
                    if (r17 != 1) {
                        if (r17 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        n2Var2 = (a0.n2) this.f81750e;
                        dVar = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.d) this.f81749d;
                        l2Var3 = (a0.l2) this.f81754i;
                        try {
                            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                            atomicReference2 = n2Var2.f81772a;
                            while (!atomicReference2.compareAndSet(l2Var3, null) && atomicReference2.get() == l2Var3) {
                            }
                            ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) dVar).d(null);
                            return obj;
                        } catch (java.lang.Throwable th7) {
                            th6 = th7;
                            atomicReference = n2Var2.f81772a;
                            while (!atomicReference.compareAndSet(l2Var3, null)) {
                            }
                            throw th6;
                        }
                    }
                    a0.n2 n2Var3 = (a0.n2) this.f81752g;
                    obj2 = this.f81751f;
                    pVar = (yz5.p) this.f81750e;
                    p3325xe03a0797.p3326xc267989b.p3332x361a9b.d dVar3 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.d) this.f81749d;
                    l2Var2 = (a0.l2) this.f81754i;
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                    n2Var = n2Var3;
                    dVar = dVar3;
                }
                this.f81754i = l2Var2;
                this.f81749d = dVar;
                this.f81750e = n2Var;
                this.f81751f = null;
                this.f81752g = null;
                this.f81753h = 2;
                java.lang.Object mo149xb9724478 = pVar.mo149xb9724478(obj2, this);
                if (mo149xb9724478 == aVar) {
                    return aVar;
                }
                n2Var2 = n2Var;
                obj = mo149xb9724478;
                l2Var3 = l2Var2;
                atomicReference2 = n2Var2.f81772a;
                while (!atomicReference2.compareAndSet(l2Var3, null)) {
                }
                ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) dVar).d(null);
                return obj;
            } catch (java.lang.Throwable th8) {
                l2Var3 = l2Var2;
                n2Var2 = n2Var;
                th6 = th8;
                atomicReference = n2Var2.f81772a;
                while (!atomicReference.compareAndSet(l2Var3, null) && atomicReference.get() == l2Var3) {
                }
                throw th6;
            }
        } catch (java.lang.Throwable th9) {
            ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) r17).d(null);
            throw th9;
        }
    }
}
