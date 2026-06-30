package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public final class mh extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f281042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.nh f281043e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f281044f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mh(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.nh nhVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f281043e = nhVar;
        this.f281044f = f9Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.mh(this.f281043e, this.f281044f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.mh) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f281042d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.nh nhVar = this.f281043e;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(nhVar.f281125a.g(), null, nhVar.f281125a.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b5q), true, false, null);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.lh lhVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.lh(this.f281044f, nhVar, Q, null);
            this.f281042d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(p0Var, lhVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
