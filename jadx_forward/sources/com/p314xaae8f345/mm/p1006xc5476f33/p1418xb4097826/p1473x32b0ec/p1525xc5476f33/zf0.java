package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class zf0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f196872d;

    /* renamed from: e, reason: collision with root package name */
    public int f196873e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0 f196874f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0 ag0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f196874f = ag0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zf0(this.f196874f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zf0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        xt2.m mVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f196873e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0 ag0Var = this.f196874f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.Object obj2 = ag0Var.f193416y;
            xt2.m mVar2 = obj2 instanceof xt2.m ? (xt2.m) obj2 : null;
            if (mVar2 != null) {
                this.f196872d = mVar2;
                this.f196873e = 1;
                if (mVar2.o(null, null, this) == aVar) {
                    return aVar;
                }
                mVar = mVar2;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ag0Var.f193414w, "playAutoAnimate");
            return jz5.f0.f384359a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        mVar = (xt2.m) this.f196872d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        mVar.q();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ag0Var.f193414w, "playAutoAnimate");
        return jz5.f0.f384359a;
    }
}
