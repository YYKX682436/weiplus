package gx0;

/* loaded from: classes5.dex */
public final class l8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p479x4179489f.C4142x2dcd1be9 f358204d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f358205e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4142x2dcd1be9 c4142x2dcd1be9, gx0.w8 w8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f358204d = c4142x2dcd1be9;
        this.f358205e = w8Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.l8(this.f358204d, this.f358205e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.l8) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4143xe6876422 c4143xe6876422 = new com.p314xaae8f345.p457x3304c6.p479x4179489f.C4143xe6876422(this.f358204d);
        this.f358205e.T = c4143xe6876422;
        return c4143xe6876422;
    }
}
