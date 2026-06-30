package mz0;

/* loaded from: classes5.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f414452d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f414453e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(n0.v2 v2Var, mz0.b2 b2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f414452d = v2Var;
        this.f414453e = b2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mz0.d0(this.f414452d, this.f414453e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        mz0.d0 d0Var = (mz0.d0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        d0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        boolean booleanValue = ((java.lang.Boolean) this.f414452d.mo128745x754a37bb()).booleanValue();
        mz0.b2 b2Var = this.f414453e;
        if (booleanValue) {
            mz0.b2.Q6(b2Var);
        } else {
            b2Var.z7();
        }
        return jz5.f0.f384359a;
    }
}
