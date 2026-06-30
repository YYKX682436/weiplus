package te2;

/* loaded from: classes3.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f499520d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.l f499521e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.kv1 f499522f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dk2.g f499523g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(te2.l lVar, r45.kv1 kv1Var, dk2.g gVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f499521e = lVar;
        this.f499522f = kv1Var;
        this.f499523g = gVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new te2.f(this.f499521e, this.f499522f, this.f499523g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((te2.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f499520d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f499520d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(1250L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        te2.l.c(this.f499521e, this.f499522f.m75945x2fec8307(0), 1, this.f499523g.f315000b);
        te2.l.f(this.f499521e, this.f499522f.m75945x2fec8307(0), this.f499523g.f315000b, 1);
        return jz5.f0.f384359a;
    }
}
