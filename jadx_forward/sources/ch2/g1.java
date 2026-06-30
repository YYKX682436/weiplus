package ch2;

/* loaded from: classes10.dex */
public final class g1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f122888d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f122889e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(ch2.o2 o2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f122889e = o2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        ch2.g1 g1Var = new ch2.g1(this.f122889e, interfaceC29045xdcb5ca57);
        g1Var.f122888d = obj;
        return g1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ch2.g1 g1Var = (ch2.g1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        g1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f122888d;
        ch2.o2 o2Var = this.f122889e;
        o2Var.L = p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new ch2.f1(o2Var, null), 3, null);
        return jz5.f0.f384359a;
    }
}
