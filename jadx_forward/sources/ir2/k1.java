package ir2;

/* loaded from: classes2.dex */
public final class k1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.c0 f375699d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ir2.p1 f375700e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f375701f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(p012xc85e97e9.p103xe821e364.p104xd1075a44.c0 c0Var, ir2.p1 p1Var, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f375699d = c0Var;
        this.f375700e = p1Var;
        this.f375701f = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ir2.k1(this.f375699d, this.f375700e, this.f375701f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ir2.k1 k1Var = (ir2.k1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        k1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        this.f375699d.a(new ir2.j1(this.f375700e, this.f375701f));
        return jz5.f0.f384359a;
    }
}
