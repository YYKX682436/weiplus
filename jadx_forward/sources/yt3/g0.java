package yt3;

/* loaded from: classes10.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt3.p0 f546987d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f546988e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f546989f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(yt3.p0 p0Var, boolean z17, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f546987d = p0Var;
        this.f546988e = z17;
        this.f546989f = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yt3.g0(this.f546987d, this.f546988e, this.f546989f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        yt3.g0 g0Var = (yt3.g0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        g0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        yt3.p0 p0Var = this.f546987d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = p0Var.f547117i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046 = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046(bool, "", c16993xacc19624 != null ? c16993xacc19624.E : null, new java.lang.Long(-1L), bool, nu3.i.f421751a.l());
        c16991x15ced046.f237200n = java.lang.Boolean.valueOf(this.f546988e);
        yz5.l lVar = this.f546989f;
        if (lVar != null) {
            lVar.mo146xb9724478(c16991x15ced046);
        } else {
            ut3.f.f512709c.a(p0Var.f547121p, c16991x15ced046);
        }
        return jz5.f0.f384359a;
    }
}
