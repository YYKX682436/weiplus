package gx0;

/* loaded from: classes5.dex */
public final class m2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cx0.f f358227d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.u2 f358228e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(cx0.f fVar, gx0.u2 u2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f358227d = fVar;
        this.f358228e = u2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.m2(this.f358227d, this.f358228e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.m2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        cx0.f fVar = this.f358227d;
        java.lang.String str = fVar.f306052b;
        gx0.u2 u2Var = this.f358228e;
        u2Var.R7().n7();
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p901x8438d441.C10954x76f4876c n76 = u2Var.n7();
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (n76 == null) {
            return f0Var;
        }
        n76.a();
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817.l(n76, fVar.f306053c, false, 2, null);
        ow0.q0.f(u2Var, n76);
        ow0.q0.h(u2Var);
        return f0Var;
    }
}
