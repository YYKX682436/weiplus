package ow0;

/* loaded from: classes5.dex */
public final class f0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f430839d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f430840e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p901x8438d441.C10954x76f4876c f430841f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gx0.u2 f430842g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(double d17, ex0.a0 a0Var, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p901x8438d441.C10954x76f4876c c10954x76f4876c, gx0.u2 u2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f430839d = d17;
        this.f430840e = a0Var;
        this.f430841f = c10954x76f4876c;
        this.f430842g = u2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ow0.f0(this.f430839d, this.f430840e, this.f430841f, this.f430842g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ow0.f0 f0Var = (ow0.f0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        f0Var.mo150x989b7ca4(f0Var2);
        return f0Var2;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33969x7905b775 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33969x7905b775(this.f430839d / this.f430840e.s(this.f430841f.getTimelineLayoutType()));
        gx0.bf R7 = this.f430842g.R7();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m33969x7905b775);
        gx0.bf.q7(R7, m33969x7905b775, true, 0L, 4, null);
        return jz5.f0.f384359a;
    }
}
