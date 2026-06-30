package sg0;

/* loaded from: classes8.dex */
public final class n2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sg0.w2 f489292d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f489293e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f489294f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f489295g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(sg0.w2 w2Var, java.lang.Long l17, java.lang.String str, p3325xe03a0797.p3326xc267989b.y0 y0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f489292d = w2Var;
        this.f489293e = l17;
        this.f489294f = str;
        this.f489295g = y0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sg0.n2(this.f489292d, this.f489293e, this.f489294f, this.f489295g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        sg0.n2 n2Var = (sg0.n2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        n2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.m2 bj6 = sg0.w2.bj(this.f489292d, this.f489293e);
        if (bj6 != null) {
            bj6.a("onFinderFeedFocusChanged", kz5.b1.e(new jz5.l("exportId", this.f489294f)));
        }
        p3325xe03a0797.p3326xc267989b.z0.e(this.f489295g, null, 1, null);
        return jz5.f0.f384359a;
    }
}
