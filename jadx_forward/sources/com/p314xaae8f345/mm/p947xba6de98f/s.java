package com.p314xaae8f345.mm.p947xba6de98f;

/* loaded from: classes10.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p947xba6de98f.z f152656d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f152657e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.p314xaae8f345.mm.p947xba6de98f.z zVar, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f152656d = zVar;
        this.f152657e = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p947xba6de98f.s(this.f152656d, this.f152657e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p947xba6de98f.s sVar = (com.p314xaae8f345.mm.p947xba6de98f.s) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        sVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        jz5.g gVar = com.p314xaae8f345.mm.p947xba6de98f.z.f152707n;
        com.p314xaae8f345.mm.p947xba6de98f.z zVar = this.f152656d;
        boolean z17 = !zVar.X6().isEmpty();
        int i17 = this.f152657e;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Cdn.CdnFSC", "run(" + i17 + ") before init job size=" + zVar.X6().size());
            for (p3325xe03a0797.p3326xc267989b.r2 r2Var : zVar.X6()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Cdn.CdnFSC", "startBeforeInitJob(" + i17 + ") " + r2Var.hashCode() + " result:" + r2Var.mo143976x68ac462());
            }
            zVar.X6().clear();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Cdn.CdnFSC", "run(" + i17 + ") before init job queue is empty");
        }
        return jz5.f0.f384359a;
    }
}
