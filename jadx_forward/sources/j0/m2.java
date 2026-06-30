package j0;

/* loaded from: classes14.dex */
public final class m2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f377980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1.a0 f377981e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j0.l3 f377982f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(p1.a0 a0Var, j0.l3 l3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f377981e = a0Var;
        this.f377982f = l3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        j0.m2 m2Var = new j0.m2(this.f377981e, this.f377982f, interfaceC29045xdcb5ca57);
        m2Var.f377980d = obj;
        return m2Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((j0.m2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f377980d;
        p1.a0 a0Var = this.f377981e;
        j0.l3 l3Var = this.f377982f;
        p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new j0.k2(a0Var, l3Var, null), 3, null);
        return p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new j0.l2(a0Var, l3Var, null), 3, null);
    }
}
