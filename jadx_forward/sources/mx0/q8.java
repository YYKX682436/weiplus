package mx0;

/* loaded from: classes5.dex */
public final class q8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f413796d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced f413797e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vt3.p f413798f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f413799g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f413800h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f413801i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced, vt3.p pVar, int i17, long j17, java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f413797e = c10977x8e40eced;
        this.f413798f = pVar;
        this.f413799g = i17;
        this.f413800h = j17;
        this.f413801i = list;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mx0.q8(this.f413797e, this.f413798f, this.f413799g, this.f413800h, this.f413801i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.q8) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f413796d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced = this.f413797e;
            vt3.p pVar = this.f413798f;
            int i18 = this.f413799g;
            long j17 = this.f413800h;
            java.util.List list = this.f413801i;
            this.f413796d = 1;
            if (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced.C(c10977x8e40eced, pVar, i18, j17, list, this) == aVar) {
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
