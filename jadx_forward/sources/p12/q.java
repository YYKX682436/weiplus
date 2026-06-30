package p12;

/* loaded from: classes10.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p12.w f432575d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f432576e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p12.w wVar, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f432575d = wVar;
        this.f432576e = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new p12.q(this.f432575d, this.f432576e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        p12.q qVar = (p12.q) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        qVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13261x57992c3a c13261x57992c3a = this.f432575d.f432588h;
        if (c13261x57992c3a == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("trimView");
            throw null;
        }
        c13261x57992c3a.f179057r = c13261x57992c3a.d((float) this.f432576e) - c13261x57992c3a.f179045J;
        c13261x57992c3a.invalidate();
        return jz5.f0.f384359a;
    }
}
