package ci5;

/* loaded from: classes12.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f123323d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f123324e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gg3.c f123325f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ci5.b0 f123326g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ mf3.k f123327h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f123328i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(java.lang.String str, gg3.c cVar, ci5.b0 b0Var, mf3.k kVar, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f123324e = str;
        this.f123325f = cVar;
        this.f123326g = b0Var;
        this.f123327h = kVar;
        this.f123328i = str2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ci5.v(this.f123324e, this.f123325f, this.f123326g, this.f123327h, this.f123328i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ci5.v) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f123323d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
            ci5.u uVar = new ci5.u(this.f123324e, this.f123325f, this.f123326g, this.f123327h, this.f123328i, null);
            this.f123323d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(p0Var, uVar, this) == aVar) {
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
