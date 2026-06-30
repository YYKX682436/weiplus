package dd5;

/* loaded from: classes9.dex */
public final class s2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b15.c f310820d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(b15.c cVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f310820d = cVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new dd5.s2(this.f310820d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((dd5.s2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6254x6dec987f c6254x6dec987f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6254x6dec987f();
        c6254x6dec987f.f136502g.f89786a = this.f310820d.p();
        c6254x6dec987f.e();
        am.x10 x10Var = c6254x6dec987f.f136503h;
        return new jz5.o(new java.lang.Integer(x10Var.f89868a), new java.lang.Integer(x10Var.f89869b), new java.lang.Integer(x10Var.f89870c));
    }
}
