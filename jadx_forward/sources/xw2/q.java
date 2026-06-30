package xw2;

/* loaded from: classes2.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f539245d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xw2.s f539246e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(xw2.s sVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f539246e = sVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        xw2.q qVar = new xw2.q(this.f539246e, interfaceC29045xdcb5ca57);
        qVar.f539245d = obj;
        return qVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((xw2.q) mo148xaf65a0fc((java.util.List) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.util.List list = (java.util.List) this.f539245d;
        int i17 = xw2.s.f539248o;
        return new java.lang.Integer(this.f539246e.c(list).size());
    }
}
