package kj2;

/* loaded from: classes10.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kj2.o f389924d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.xn1 f389925e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f389926f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(kj2.o oVar, r45.xn1 xn1Var, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f389924d = oVar;
        this.f389925e = xn1Var;
        this.f389926f = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new kj2.d(this.f389924d, this.f389925e, this.f389926f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        kj2.d dVar = (kj2.d) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        dVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        kj2.o oVar = this.f389924d;
        int b17 = oVar.f389957c.b();
        int i17 = b17 == 0 ? 1 : 2;
        dk2.xf k17 = dk2.ef.f314905a.k(oVar.f389956b);
        if (k17 != null) {
            ((dk2.r4) k17).k(this.f389925e, b17, i17, new kj2.c(oVar, this.f389926f));
        }
        return jz5.f0.f384359a;
    }
}
