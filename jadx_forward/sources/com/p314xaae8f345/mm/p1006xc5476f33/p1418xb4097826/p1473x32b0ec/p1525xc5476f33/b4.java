package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class b4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f193503d;

    /* renamed from: e, reason: collision with root package name */
    public int f193504e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4 f193505f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4 c4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f193505f = c4Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.b4(this.f193505f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.b4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        xt2.m mVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f193504e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4 c4Var = this.f193505f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            xt2.d dVar = c4Var.f193638y;
            if (!(dVar instanceof xt2.m)) {
                dVar = null;
            }
            if (dVar != null) {
                this.f193503d = dVar;
                this.f193504e = 1;
                if (dVar.o(null, null, this) == aVar) {
                    return aVar;
                }
                mVar = dVar;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c4Var.f193636w, "playAutoAnimate");
            return jz5.f0.f384359a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        mVar = (xt2.m) this.f193503d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        mVar.q();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c4Var.f193636w, "playAutoAnimate");
        return jz5.f0.f384359a;
    }
}
