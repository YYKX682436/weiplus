package qr3;

/* loaded from: classes.dex */
public final class i extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f447623d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f447624e;

    public i(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(3, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        qr3.i iVar = new qr3.i((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3);
        iVar.f447623d = (o01.a) obj;
        iVar.f447624e = (o01.a) obj2;
        return iVar.mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        return new jz5.l((o01.a) this.f447623d, (o01.a) this.f447624e);
    }
}
