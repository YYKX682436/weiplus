package yx0;

/* loaded from: classes5.dex */
public final class o6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f549045d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f549046e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pp0.p0 f549047f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nx0.r1 f549048g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(yx0.b8 b8Var, pp0.p0 p0Var, nx0.r1 r1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f549046e = b8Var;
        this.f549047f = p0Var;
        this.f549048g = r1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yx0.o6(this.f549046e, this.f549047f, this.f549048g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.o6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f549045d;
        yx0.b8 b8Var = this.f549046e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f549045d = 1;
            java.util.concurrent.locks.ReentrantLock reentrantLock = yx0.b8.f548704c2;
            if (b8Var.C(this.f549047f, this.f549048g, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        yx0.v vVar = yx0.v.f549228f;
        java.util.concurrent.locks.ReentrantLock reentrantLock2 = yx0.b8.f548704c2;
        b8Var.q0(vVar);
        return jz5.f0.f384359a;
    }
}
