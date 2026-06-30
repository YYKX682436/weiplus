package gx0;

/* loaded from: classes5.dex */
public final class va extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f358602d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f358603e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f358604f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va(double d17, ex0.a0 a0Var, gx0.ac acVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f358602d = d17;
        this.f358603e = a0Var;
        this.f358604f = acVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.va(this.f358602d, this.f358603e, this.f358604f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        gx0.va vaVar = (gx0.va) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        vaVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        gx0.ac acVar = this.f358604f;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33969x7905b775 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33969x7905b775(this.f358602d / this.f358603e.s(acVar.A7().getTimelineLayoutType()));
        gx0.bf c86 = acVar.c8();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m33969x7905b775);
        gx0.bf.q7(c86, m33969x7905b775, true, 0L, 4, null);
        return jz5.f0.f384359a;
    }
}
