package com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44;

/* loaded from: classes3.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f151507d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(n0.v2 v2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f151507d = v2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.h(this.f151507d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.h hVar = (com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.h) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        hVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        n0.v2 v2Var = this.f151507d;
        ((java.lang.Number) v2Var.mo128745x754a37bb()).intValue();
        if (((java.lang.Number) v2Var.mo128745x754a37bb()).intValue() == 0) {
            v2Var.mo148714x53d8522f(new java.lang.Integer(Integer.MAX_VALUE));
        }
        return jz5.f0.f384359a;
    }
}
