package te2;

/* loaded from: classes3.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f499468d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.l f499469e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ce2.i f499470f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f499471g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(te2.l lVar, ce2.i iVar, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f499469e = lVar;
        this.f499470f = iVar;
        this.f499471g = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new te2.d(this.f499469e, this.f499470f, this.f499471g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((te2.d) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f499468d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f499468d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(1250L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        ce2.i iVar = this.f499470f;
        java.lang.String str = iVar != null ? iVar.f67814x2c488eb6 : null;
        te2.l lVar = this.f499469e;
        java.lang.String str2 = this.f499471g;
        te2.l.c(lVar, str, 1, str2);
        te2.l.f(lVar, iVar != null ? iVar.f67814x2c488eb6 : null, str2, 1);
        return jz5.f0.f384359a;
    }
}
