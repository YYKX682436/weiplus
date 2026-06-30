package te2;

/* loaded from: classes3.dex */
public final class b8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f499434d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f499435e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f499436f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8(te2.p8 p8Var, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f499435e = p8Var;
        this.f499436f = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        te2.b8 b8Var = new te2.b8(this.f499435e, this.f499436f, interfaceC29045xdcb5ca57);
        b8Var.f499434d = obj;
        return b8Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        te2.b8 b8Var = (te2.b8) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        b8Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f499434d;
        boolean z17 = this.f499436f;
        te2.p8 p8Var = this.f499435e;
        p8Var.w7(true, new te2.z7(p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new te2.a8(p8Var, z17, null), 3, null)));
        return jz5.f0.f384359a;
    }
}
