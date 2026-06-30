package gx0;

/* loaded from: classes5.dex */
public final class ua extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f358565d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f358566e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f358567f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f358568g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua(gx0.ac acVar, double d17, ex0.a0 a0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f358566e = acVar;
        this.f358567f = d17;
        this.f358568g = a0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.ua(this.f358566e, this.f358567f, this.f358568g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.ua) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f358565d;
        gx0.ac acVar = this.f358566e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            gx0.bf c86 = acVar.c8();
            this.f358565d = 1;
            if (c86.s7(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        bx0.i timelineLayoutType = acVar.A7().getTimelineLayoutType();
        ex0.a0 a0Var = this.f358568g;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33969x7905b775 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33969x7905b775(this.f358567f / a0Var.s(timelineLayoutType));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m33969x7905b775);
        acVar.k8(m33969x7905b775);
        acVar.c8().p7(a0Var.a(m33969x7905b775), false, 16L);
        return jz5.f0.f384359a;
    }
}
