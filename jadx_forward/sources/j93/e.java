package j93;

/* loaded from: classes.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.n f379905d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f379906e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j93.n nVar, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f379905d = nVar;
        this.f379906e = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new j93.e(this.f379905d, this.f379906e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((j93.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        j93.n nVar = this.f379905d;
        db5.e1.s(nVar.m158354x19263085(), nVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f571923tn), null);
        yz5.l lVar = this.f379906e;
        if (lVar == null) {
            return null;
        }
        lVar.mo146xb9724478(java.lang.Boolean.FALSE);
        return jz5.f0.f384359a;
    }
}
