package df2;

/* loaded from: classes3.dex */
public final class rz extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f312809d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.a00 f312810e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rz(p3325xe03a0797.p3326xc267989b.q qVar, df2.a00 a00Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f312809d = qVar;
        this.f312810e = a00Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.rz(this.f312809d, this.f312810e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        df2.rz rzVar = (df2.rz) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        rzVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        v65.n nVar = new v65.n(this.f312809d);
        df2.a00 a00Var = this.f312810e;
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b b76 = a00Var.b7();
        if (b76 != null) {
            b76.mo82566x3e3ac3e8(a00Var.f311185q);
            b76.d();
            b76.m82583xcde73672(1);
            b76.m82582x3ae760af(0.0d);
            b76.g();
            b76.a(new df2.qz(b76, a00Var, nVar));
        }
        return jz5.f0.f384359a;
    }
}
