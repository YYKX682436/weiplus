package yx0;

/* loaded from: classes5.dex */
public final class y6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f549323d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f549324e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pp0.p0 f549325f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(yx0.b8 b8Var, pp0.p0 p0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f549324e = b8Var;
        this.f549325f = p0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yx0.y6(this.f549324e, this.f549325f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.y6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f549323d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            yx0.n nVar = yx0.n.f548997f;
            java.util.concurrent.locks.ReentrantLock reentrantLock = yx0.b8.f548704c2;
            yx0.b8 b8Var = this.f549324e;
            b8Var.g0(nVar);
            b8Var.f548721p0 = nVar;
            this.f549323d = 1;
            obj = this.f549325f.x0(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        if (!((java.lang.Boolean) obj).booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingCorePlugin", "switchMakeup >> clearMakeup error");
        }
        return jz5.f0.f384359a;
    }
}
