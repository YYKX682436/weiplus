package yx0;

/* loaded from: classes5.dex */
public final class c5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f548758d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f548759e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f548760f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(yx0.b8 b8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f548760f = b8Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        yx0.c5 c5Var = new yx0.c5(this.f548760f, interfaceC29045xdcb5ca57);
        c5Var.f548759e = obj;
        return c5Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.c5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f548758d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f548759e;
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new yx0.b5(this.f548760f, null), 2, null);
            ux0.d dVar = this.f548760f.f548716l1;
            if (dVar != null) {
                dVar.mo170674x57429eec();
            }
            pp0.p0 p0Var2 = this.f548760f.K;
            if (p0Var2 != null) {
                this.f548758d = 1;
                obj = p0Var2.E0(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            yx0.b8 b8Var = this.f548760f;
            yx0.v vVar = yx0.v.f549228f;
            java.util.concurrent.locks.ReentrantLock reentrantLock = yx0.b8.f548704c2;
            b8Var.q0(vVar);
            return jz5.f0.f384359a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        yx0.b8 b8Var2 = this.f548760f;
        yx0.v vVar2 = yx0.v.f549228f;
        java.util.concurrent.locks.ReentrantLock reentrantLock2 = yx0.b8.f548704c2;
        b8Var2.q0(vVar2);
        return jz5.f0.f384359a;
    }
}
