package com.p314xaae8f345.mm.p947xba6de98f;

/* loaded from: classes10.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p947xba6de98f.z f152668d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f152669e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.p314xaae8f345.mm.p947xba6de98f.z zVar, yz5.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f152668d = zVar;
        this.f152669e = pVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p947xba6de98f.t(this.f152668d, this.f152669e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p947xba6de98f.t tVar = (com.p314xaae8f345.mm.p947xba6de98f.t) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        tVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        jz5.g gVar = com.p314xaae8f345.mm.p947xba6de98f.z.f152707n;
        com.p314xaae8f345.mm.p947xba6de98f.z zVar = this.f152668d;
        p3325xe03a0797.p3326xc267989b.r2 d17 = zVar.a7().d(p3325xe03a0797.p3326xc267989b.a1.LAZY, this.f152669e);
        zVar.X6().add(d17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Cdn.CdnFSC", "add job:" + d17.hashCode() + " and wait init, currentSize:" + zVar.X6().size());
        return jz5.f0.f384359a;
    }
}
