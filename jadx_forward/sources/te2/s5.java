package te2;

/* loaded from: classes3.dex */
public final class s5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f499935d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f499936e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f499937f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f499938g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(te2.p8 p8Var, r45.h32 h32Var, java.lang.Integer num, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f499936e = p8Var;
        this.f499937f = h32Var;
        this.f499938g = num;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        te2.s5 s5Var = new te2.s5(this.f499936e, this.f499937f, this.f499938g, interfaceC29045xdcb5ca57);
        s5Var.f499935d = obj;
        return s5Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        te2.s5 s5Var = (te2.s5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        s5Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f499935d;
        java.lang.Integer num = this.f499938g;
        te2.p8 p8Var = this.f499936e;
        p8Var.w7(true, new te2.q5(p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new te2.r5(p8Var, this.f499937f, num, null), 3, null)));
        return jz5.f0.f384359a;
    }
}
