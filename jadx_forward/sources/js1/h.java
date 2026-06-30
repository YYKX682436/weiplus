package js1;

/* loaded from: classes4.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12965xc9712d2 f383021d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zq1.g0 f383022e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12965xc9712d2 c12965xc9712d2, zq1.g0 g0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f383021d = c12965xc9712d2;
        this.f383022e = g0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new js1.h(this.f383021d, this.f383022e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        js1.h hVar = (js1.h) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        hVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[transferRequestInMM] type: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12965xc9712d2 c12965xc9712d2 = this.f383021d;
        sb6.append(c12965xc9712d2.f175446d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransferRequestServiceImpl", sb6.toString());
        js1.s sVar = js1.s.f383032a;
        ((ku5.t0) ku5.t0.f394148d).h(new js1.o(c12965xc9712d2, new js1.g(c12965xc9712d2, this.f383022e, currentTimeMillis)), "TransferRequestTokenManager");
        return jz5.f0.f384359a;
    }
}
