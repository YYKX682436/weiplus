package yx0;

/* loaded from: classes5.dex */
public final class t0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f549180d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f549181e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(yx0.b8 b8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f549181e = b8Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yx0.t0(this.f549181e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.t0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f549180d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            ux0.d dVar = this.f549181e.f548716l1;
            if (dVar != null) {
                dVar.mo170673xb01dfb57();
            }
            pp0.p0 p0Var = this.f549181e.K;
            if (p0Var != null) {
                this.f549180d = 1;
                obj = pp0.p0.w(p0Var, false, this, 1, null);
                if (obj == aVar) {
                    return aVar;
                }
            }
            yx0.b8 b8Var = this.f549181e;
            yx0.v vVar = yx0.v.f549230h;
            java.util.concurrent.locks.ReentrantLock reentrantLock = yx0.b8.f548704c2;
            b8Var.q0(vVar);
            return jz5.f0.f384359a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        yx0.b8 b8Var2 = this.f549181e;
        yx0.v vVar2 = yx0.v.f549230h;
        java.util.concurrent.locks.ReentrantLock reentrantLock2 = yx0.b8.f548704c2;
        b8Var2.q0(vVar2);
        return jz5.f0.f384359a;
    }
}
