package m0;

/* loaded from: classes13.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f403972d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m0.d0 f403973e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f403974f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z.p f403975g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(m0.d0 d0Var, float f17, z.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f403973e = d0Var;
        this.f403974f = f17;
        this.f403975g = pVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new m0.b0(this.f403973e, this.f403974f, this.f403975g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((m0.b0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f403972d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            z.e eVar = this.f403973e.f403990c;
            java.lang.Float f17 = new java.lang.Float(this.f403974f);
            z.p pVar = this.f403975g;
            this.f403972d = 1;
            if (z.e.c(eVar, f17, pVar, null, null, this, 12, null) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
