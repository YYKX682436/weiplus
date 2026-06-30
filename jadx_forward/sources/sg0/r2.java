package sg0;

/* loaded from: classes8.dex */
public final class r2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sg0.w2 f489329d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f489330e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f489331f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(sg0.w2 w2Var, java.lang.Long l17, p3325xe03a0797.p3326xc267989b.y0 y0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f489329d = w2Var;
        this.f489330e = l17;
        this.f489331f = y0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sg0.r2(this.f489329d, this.f489330e, this.f489331f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        sg0.r2 r2Var = (sg0.r2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        r2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.m2 bj6 = sg0.w2.bj(this.f489329d, this.f489330e);
        if (bj6 != null) {
            bj6.a("onUserToggleFullScreen", null);
        }
        p3325xe03a0797.p3326xc267989b.z0.e(this.f489331f, null, 1, null);
        return jz5.f0.f384359a;
    }
}
