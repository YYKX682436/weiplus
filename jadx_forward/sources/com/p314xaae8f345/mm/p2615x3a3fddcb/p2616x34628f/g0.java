package com.p314xaae8f345.mm.p2615x3a3fddcb.p2616x34628f;

/* loaded from: classes3.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q85.g f275002d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f275003e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(q85.g gVar, n0.e5 e5Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f275002d = gVar;
        this.f275003e = e5Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p2615x3a3fddcb.p2616x34628f.g0(this.f275002d, this.f275003e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p2615x3a3fddcb.p2616x34628f.g0 g0Var = (com.p314xaae8f345.mm.p2615x3a3fddcb.p2616x34628f.g0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        g0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pk4.d dVar;
        pk4.d dVar2;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        boolean booleanValue = ((java.lang.Boolean) this.f275003e.mo128745x754a37bb()).booleanValue();
        q85.g gVar = this.f275002d;
        gVar.f442341m = booleanValue;
        pk4.d dVar3 = gVar.f442340i;
        if (dVar3 != null) {
            if (booleanValue) {
                if (!dVar3.m158654xc00617a4() && (dVar2 = gVar.f442340i) != null) {
                    dVar2.m158665x68ac462();
                }
            } else if (dVar3.m158654xc00617a4() && (dVar = gVar.f442340i) != null) {
                dVar.m158656x65825f6();
            }
        }
        return jz5.f0.f384359a;
    }
}
