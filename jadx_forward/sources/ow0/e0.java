package ow0;

/* loaded from: classes5.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f430833d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.u2 f430834e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f430835f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f430836g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p901x8438d441.C10954x76f4876c f430837h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(gx0.u2 u2Var, double d17, ex0.a0 a0Var, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p901x8438d441.C10954x76f4876c c10954x76f4876c, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f430834e = u2Var;
        this.f430835f = d17;
        this.f430836g = a0Var;
        this.f430837h = c10954x76f4876c;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ow0.e0(this.f430834e, this.f430835f, this.f430836g, this.f430837h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ow0.e0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f430833d;
        gx0.u2 u2Var = this.f430834e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            gx0.bf R7 = u2Var.R7();
            this.f430833d = 1;
            if (R7.s7(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        bx0.i timelineLayoutType = this.f430837h.getTimelineLayoutType();
        ex0.a0 a0Var = this.f430836g;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33969x7905b775 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33969x7905b775(this.f430835f / a0Var.s(timelineLayoutType));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m33969x7905b775);
        u2Var.b8(m33969x7905b775);
        u2Var.R7().p7(a0Var.a(m33969x7905b775), false, 16L);
        return jz5.f0.f384359a;
    }
}
