package x65;

/* loaded from: classes14.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f533912d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2597xc267989b.p2598x363585.p2599x5e0f67f.AbstractC20978xe5110392 f533913e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f533914f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.p314xaae8f345.mm.sdk.p2597xc267989b.p2598x363585.p2599x5e0f67f.AbstractC20978xe5110392 abstractC20978xe5110392, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f533913e = abstractC20978xe5110392;
        this.f533914f = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new x65.n(this.f533913e, this.f533914f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((x65.n) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f533912d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f533912d = 1;
            if (com.p314xaae8f345.mm.sdk.p2597xc267989b.p2598x363585.p2599x5e0f67f.AbstractC20978xe5110392.c(this.f533913e, this.f533914f, this) == aVar) {
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
