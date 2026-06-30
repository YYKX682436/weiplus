package l0;

/* loaded from: classes14.dex */
public final class v2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f396088d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f396089e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l0.a3 f396090f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(float f17, l0.a3 a3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f396089e = f17;
        this.f396090f = a3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        l0.v2 v2Var = new l0.v2(this.f396089e, this.f396090f, interfaceC29045xdcb5ca57);
        v2Var.f396088d = obj;
        return v2Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        l0.v2 v2Var = (l0.v2) mo148xaf65a0fc((b0.u0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        v2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        ((b0.j) ((b0.u0) this.f396088d)).f97885a.f97906a.mo146xb9724478(java.lang.Float.valueOf(this.f396089e - ((java.lang.Number) ((n0.q4) this.f396090f.f395567g).mo128745x754a37bb()).floatValue()));
        return jz5.f0.f384359a;
    }
}
