package e50;

/* loaded from: classes11.dex */
public final class i0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f331034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e50.z0 f331035e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b03.a0 f331036f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(e50.z0 z0Var, b03.a0 a0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f331035e = z0Var;
        this.f331036f = a0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new e50.i0(this.f331035e, this.f331036f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((e50.i0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e;
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28624x6307ecb0 m137439x2173b36a;
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e2;
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28624x6307ecb0 m137439x2173b36a2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f331034d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            pi0.q qVar = this.f331035e.f331091e;
            if (qVar != null) {
                this.f331034d = 1;
                if (qVar.b(this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        this.f331035e.bj(false);
        pi0.q qVar2 = this.f331035e.f331091e;
        if (qVar2 != null && (c28580x69eec95e2 = qVar2.f436234e) != null && (m137439x2173b36a2 = c28580x69eec95e2.m137439x2173b36a()) != null) {
            m137439x2173b36a2.add(new c61.ha());
        }
        pi0.q qVar3 = this.f331035e.f331091e;
        if (qVar3 != null && (c28580x69eec95e = qVar3.f436234e) != null && (m137439x2173b36a = c28580x69eec95e.m137439x2173b36a()) != null) {
            m137439x2173b36a.add(new j03.d());
        }
        ((ku5.t0) ku5.t0.f394148d).B(new e50.g0(this.f331035e));
        ku5.u0 u0Var = ku5.t0.f394148d;
        e50.h0 h0Var = new e50.h0(this.f331036f);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(h0Var, 1000L, false);
        return jz5.f0.f384359a;
    }
}
