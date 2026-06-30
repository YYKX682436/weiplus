package vz0;

/* loaded from: classes14.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vz0.d0 f523135d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f523136e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(vz0.d0 d0Var, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f523135d = d0Var;
        this.f523136e = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vz0.f(this.f523135d, this.f523136e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        vz0.f fVar = (vz0.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        fVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        int i17 = this.f523136e - 1;
        vz0.d0 d0Var = this.f523135d;
        int min = java.lang.Math.min(i17, d0Var.e());
        if (min < 0) {
            min = 0;
        }
        if (min != d0Var.e()) {
            ((n0.q4) d0Var.f523128b).mo148714x53d8522f(java.lang.Integer.valueOf(min));
        }
        return jz5.f0.f384359a;
    }
}
