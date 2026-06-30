package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class p40 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f195362d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.z40 f195363e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cm2.d0 f195364f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p40(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.z40 z40Var, cm2.d0 d0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f195363e = z40Var;
        this.f195364f = d0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p40(this.f195363e, this.f195364f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p40) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f195362d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.z40 z40Var = this.f195363e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            long j17 = z40Var.f196830w;
            this.f195362d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(j17, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        so2.j5 j5Var = ((mm2.f6) z40Var.f196815e.a(mm2.f6.class)).f410582w;
        cm2.t tVar = j5Var instanceof cm2.t ? (cm2.t) j5Var : null;
        if (tVar != null) {
            long j18 = tVar.f124918d;
            cm2.d0 d0Var = this.f195364f;
            if (j18 == d0Var.f124918d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tVar.f124929r, d0Var.f124929r)) {
                dk2.ef efVar = dk2.ef.f314905a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
                if (k0Var != null) {
                    qo0.b bVar = qo0.b.O2;
                    android.os.Bundle bundle = new android.os.Bundle();
                    r45.f52 f52Var = new r45.f52();
                    f52Var.set(0, 13);
                    f52Var.set(2, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(d0Var.f124868v.mo14344x5f01b1f6()));
                    f52Var.set(4, java.lang.Long.valueOf(d0Var.f124918d));
                    f52Var.set(13, d0Var.f124929r);
                    bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", f52Var.mo14344x5f01b1f6());
                    k0Var.mo46557x60d69242(bVar, bundle);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
