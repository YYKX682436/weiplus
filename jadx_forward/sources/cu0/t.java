package cu0;

/* loaded from: classes5.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f303870d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cu0.x f303871e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a f303872f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f303873g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f303874h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, cu0.x xVar, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a, boolean z17, boolean z18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f303870d = u3Var;
        this.f303871e = xVar;
        this.f303872f = c16997xb0aa383a;
        this.f303873g = z17;
        this.f303874h = z18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new cu0.t(this.f303870d, this.f303871e, this.f303872f, this.f303873g, this.f303874h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        cu0.t tVar = (cu0.t) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        tVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        this.f303870d.dismiss();
        yz5.q qVar = this.f303871e.f303894k;
        if (qVar != null) {
            qVar.mo147xb9724478(this.f303872f, java.lang.Boolean.valueOf(this.f303873g), java.lang.Boolean.valueOf(this.f303874h));
        }
        return jz5.f0.f384359a;
    }
}
