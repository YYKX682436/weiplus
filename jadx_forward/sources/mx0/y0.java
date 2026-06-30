package mx0;

/* loaded from: classes5.dex */
public final class y0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mx0.e1 f413976d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f413977e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p461x3a6d265.i0 f413978f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f413979g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.q23 f413980h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(mx0.e1 e1Var, java.lang.String str, com.p314xaae8f345.p457x3304c6.p461x3a6d265.i0 i0Var, yz5.p pVar, r45.q23 q23Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f413976d = e1Var;
        this.f413977e = str;
        this.f413978f = i0Var;
        this.f413979g = pVar;
        this.f413980h = q23Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mx0.y0(this.f413976d, this.f413977e, this.f413978f, this.f413979g, this.f413980h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        mx0.y0 y0Var = (mx0.y0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        y0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        this.f413976d.f413467a.g0(this.f413977e, this.f413978f);
        this.f413979g.mo149xb9724478(java.lang.Boolean.TRUE, this.f413980h);
        return jz5.f0.f384359a;
    }
}
