package cu0;

/* loaded from: classes5.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cu0.x f303868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f303869e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(cu0.x xVar, yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f303868d = xVar;
        this.f303869e = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new cu0.s(this.f303868d, this.f303869e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((cu0.s) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        cu0.x xVar = this.f303868d;
        java.lang.String string = xVar.f303884a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571913td);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(xVar.f303884a, string, true, 3, new cu0.r(this.f303869e));
    }
}
