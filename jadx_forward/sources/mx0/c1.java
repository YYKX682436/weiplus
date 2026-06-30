package mx0;

/* loaded from: classes5.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3981x30b9dbd5 f413397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mx0.e1 f413398e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3981x30b9dbd5 c3981x30b9dbd5, mx0.e1 e1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f413397d = c3981x30b9dbd5;
        this.f413398e = e1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mx0.c1(this.f413397d, this.f413398e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        mx0.c1 c1Var = (mx0.c1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        c1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3981x30b9dbd5 c3981x30b9dbd5 = this.f413397d;
        if (c3981x30b9dbd5 != null) {
            mx0.e1 e1Var = this.f413398e;
            mx0.c0 c0Var = e1Var.f413472f;
            if (c0Var != null) {
                boolean z17 = e1Var.f413473g;
                yx0.w5 w5Var = (yx0.w5) c0Var;
                yx0.b8 b8Var = w5Var.f549275a;
                yx0.w wVar = yx0.w.f549258d;
                java.lang.String c17 = yx0.b8.c(b8Var, c3981x30b9dbd5, wVar);
                r45.q23 e07 = w5Var.f549275a.e0(c3981x30b9dbd5, wVar);
                com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4012xe1ac9984 c4012xe1ac9984 = w5Var.f549275a.T;
                w5Var.f549276b.mo149xb9724478(new rx0.k(0, z17, c3981x30b9dbd5, e07, c4012xe1ac9984 != null ? c4012xe1ac9984.m32610x92013dca() : null, w5Var.f549275a.U, c3981x30b9dbd5.f129355f, c17), java.lang.Boolean.FALSE);
            }
        } else {
            mx0.c0 c0Var2 = this.f413398e.f413472f;
            if (c0Var2 != null) {
                ((yx0.w5) c0Var2).f549276b.mo149xb9724478(null, java.lang.Boolean.FALSE);
            }
        }
        this.f413398e.f413472f = null;
        return jz5.f0.f384359a;
    }
}
