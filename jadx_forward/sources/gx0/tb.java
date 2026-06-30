package gx0;

/* loaded from: classes5.dex */
public final class tb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f358520d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f358521e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cx0.f f358522f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f358523g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb(gx0.ac acVar, cx0.f fVar, ex0.a0 a0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f358521e = acVar;
        this.f358522f = fVar;
        this.f358523g = a0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.tb(this.f358521e, this.f358522f, this.f358523g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.tb) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f358520d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
            gx0.sb sbVar = new gx0.sb(this.f358523g, null);
            this.f358520d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(p0Var, sbVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        gx0.ac acVar = this.f358521e;
        acVar.c8().n7();
        acVar.A7().a();
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817.l(acVar.A7(), this.f358522f.f306053c, false, 2, null);
        acVar.R7();
        acVar.i8();
        return jz5.f0.f384359a;
    }
}
