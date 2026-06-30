package a0;

/* loaded from: classes14.dex */
public final class m2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f216d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f217e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f218f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f219g;

    /* renamed from: h, reason: collision with root package name */
    public int f220h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f221i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a0.k2 f222m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ a0.n2 f223n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yz5.p f224o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f225p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(a0.k2 k2Var, a0.n2 n2Var, yz5.p pVar, java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f222m = k2Var;
        this.f223n = n2Var;
        this.f224o = pVar;
        this.f225p = obj;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        a0.m2 m2Var = new a0.m2(this.f222m, this.f223n, this.f224o, this.f225p, continuation);
        m2Var.f221i = obj;
        return m2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((a0.m2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        a0.n2 n2Var;
        a0.l2 l2Var;
        boolean z17;
        java.lang.Object obj2;
        a0.l2 l2Var2;
        kotlinx.coroutines.sync.d dVar;
        yz5.p pVar;
        a0.l2 l2Var3;
        a0.n2 n2Var2;
        java.lang.Throwable th6;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        java.util.concurrent.atomic.AtomicReference atomicReference2;
        pz5.a aVar = pz5.a.f359186d;
        ?? r17 = this.f220h;
        try {
            try {
                if (r17 == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    oz5.l f11582e = ((kotlinx.coroutines.y0) this.f221i).getF11582e();
                    int i17 = kotlinx.coroutines.r2.O0;
                    oz5.i iVar = f11582e.get(kotlinx.coroutines.q2.f310571d);
                    kotlin.jvm.internal.o.d(iVar);
                    a0.l2 l2Var4 = new a0.l2(this.f222m, (kotlinx.coroutines.r2) iVar);
                    do {
                        n2Var = this.f223n;
                        java.util.concurrent.atomic.AtomicReference atomicReference3 = n2Var.f239a;
                        l2Var = (a0.l2) atomicReference3.get();
                        z17 = false;
                        if (l2Var != null) {
                            if (!(l2Var4.f212a.compareTo(l2Var.f212a) >= 0)) {
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
                        kotlinx.coroutines.p2.a(l2Var.f213b, null, 1, null);
                    }
                    kotlinx.coroutines.sync.d dVar2 = n2Var.f240b;
                    this.f221i = l2Var4;
                    this.f216d = dVar2;
                    yz5.p pVar2 = this.f224o;
                    this.f217e = pVar2;
                    java.lang.Object obj3 = this.f225p;
                    this.f218f = obj3;
                    this.f219g = n2Var;
                    this.f220h = 1;
                    kotlinx.coroutines.sync.k kVar = (kotlinx.coroutines.sync.k) dVar2;
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
                        n2Var2 = (a0.n2) this.f217e;
                        dVar = (kotlinx.coroutines.sync.d) this.f216d;
                        l2Var3 = (a0.l2) this.f221i;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            atomicReference2 = n2Var2.f239a;
                            while (!atomicReference2.compareAndSet(l2Var3, null) && atomicReference2.get() == l2Var3) {
                            }
                            ((kotlinx.coroutines.sync.k) dVar).d(null);
                            return obj;
                        } catch (java.lang.Throwable th7) {
                            th6 = th7;
                            atomicReference = n2Var2.f239a;
                            while (!atomicReference.compareAndSet(l2Var3, null)) {
                            }
                            throw th6;
                        }
                    }
                    a0.n2 n2Var3 = (a0.n2) this.f219g;
                    obj2 = this.f218f;
                    pVar = (yz5.p) this.f217e;
                    kotlinx.coroutines.sync.d dVar3 = (kotlinx.coroutines.sync.d) this.f216d;
                    l2Var2 = (a0.l2) this.f221i;
                    kotlin.ResultKt.throwOnFailure(obj);
                    n2Var = n2Var3;
                    dVar = dVar3;
                }
                this.f221i = l2Var2;
                this.f216d = dVar;
                this.f217e = n2Var;
                this.f218f = null;
                this.f219g = null;
                this.f220h = 2;
                java.lang.Object invoke = pVar.invoke(obj2, this);
                if (invoke == aVar) {
                    return aVar;
                }
                n2Var2 = n2Var;
                obj = invoke;
                l2Var3 = l2Var2;
                atomicReference2 = n2Var2.f239a;
                while (!atomicReference2.compareAndSet(l2Var3, null)) {
                }
                ((kotlinx.coroutines.sync.k) dVar).d(null);
                return obj;
            } catch (java.lang.Throwable th8) {
                l2Var3 = l2Var2;
                n2Var2 = n2Var;
                th6 = th8;
                atomicReference = n2Var2.f239a;
                while (!atomicReference.compareAndSet(l2Var3, null) && atomicReference.get() == l2Var3) {
                }
                throw th6;
            }
        } catch (java.lang.Throwable th9) {
            ((kotlinx.coroutines.sync.k) r17).d(null);
            throw th9;
        }
    }
}
