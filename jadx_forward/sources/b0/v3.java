package b0;

/* loaded from: classes14.dex */
public final class v3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f98099d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.q f98100e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0.h2 f98101f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p1.s f98102g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(yz5.q qVar, b0.h2 h2Var, p1.s sVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f98100e = qVar;
        this.f98101f = h2Var;
        this.f98102g = sVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new b0.v3(this.f98100e, this.f98101f, this.f98102g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.v3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f98099d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            d1.e eVar = new d1.e(this.f98102g.f432414c);
            this.f98099d = 1;
            if (this.f98100e.mo147xb9724478(this.f98101f, eVar, this) == aVar) {
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
