package rv0;

/* loaded from: classes5.dex */
public final class i0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f481574d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f481575e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f481576f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(double d17, ex0.a0 a0Var, rv0.n1 n1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f481574d = d17;
        this.f481575e = a0Var;
        this.f481576f = n1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rv0.i0(this.f481574d, this.f481575e, this.f481576f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        rv0.i0 i0Var = (rv0.i0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        i0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        rv0.n1 n1Var = this.f481576f;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33969x7905b775 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33969x7905b775(this.f481574d / this.f481575e.s(n1Var.r7().getTimelineLayoutType()));
        gx0.bf p76 = n1Var.p7();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m33969x7905b775);
        gx0.bf.q7(p76, m33969x7905b775, true, 0L, 4, null);
        return jz5.f0.f384359a;
    }
}
