package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class u50 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f196057d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.t f196058e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 f196059f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cm2.t f196060g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u50(cm2.t tVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 r60Var, cm2.t tVar2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f196058e = tVar;
        this.f196059f = r60Var;
        this.f196060g = tVar2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.u50(this.f196058e, this.f196059f, this.f196060g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.u50) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f196057d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            long j17 = this.f196058e.f124923i * 1000;
            this.f196057d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(j17, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 r60Var = this.f196059f;
        so2.j5 j5Var = ((mm2.f6) r60Var.P0(mm2.f6.class)).f410582w;
        cm2.t tVar = j5Var instanceof cm2.t ? (cm2.t) j5Var : null;
        long j18 = tVar != null ? tVar.f124918d : 0L;
        java.lang.String str = r60Var.f195631s;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[checkAndLaunchDelayDismissJob] after dalay curPromoteDataId = ");
        sb6.append(j18);
        sb6.append(" , remotePromoteDataId = ");
        cm2.t tVar2 = this.f196060g;
        sb6.append(tVar2.f124918d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (j18 == tVar2.f124918d) {
            dk2.ef efVar = dk2.ef.f314905a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
            if (k0Var != null) {
                qo0.b bVar = qo0.b.O2;
                android.os.Bundle bundle = new android.os.Bundle();
                r45.f52 f52Var = new r45.f52();
                f52Var.set(0, java.lang.Integer.valueOf(tVar2.f124925n));
                com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = tVar2.f124924m;
                if (gVar != null) {
                    byte[] g17 = gVar.g();
                    f52Var.set(2, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(g17, 0, g17.length));
                }
                f52Var.set(4, java.lang.Long.valueOf(tVar2.f124918d));
                bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", f52Var.mo14344x5f01b1f6());
                k0Var.mo46557x60d69242(bVar, bundle);
            }
        }
        return jz5.f0.f384359a;
    }
}
