package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class a30 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f199253d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e30 f199254e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a30(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e30 e30Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f199254e = e30Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.a30(this.f199254e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.a30) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f199253d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e30 e30Var = this.f199254e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.r2 r2Var = e30Var.f199743J;
            if (r2Var != null) {
                this.f199253d = 1;
                if (p3325xe03a0797.p3326xc267989b.v2.d(r2Var, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        if (e30Var.F > 0) {
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[2];
            lVarArr[0] = new jz5.l("live_like_type", new java.lang.Integer(e30Var.F > 1 ? 1 : 0));
            lVarArr[1] = new jz5.l("live_like_count", new java.lang.Integer(e30Var.F));
            ((cy1.a) rVar).Cj("finder_live_room_like_longpress", e30Var.f199748t, kz5.c1.k(lVarArr), 25561);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e30Var.f199746r, "reportSdk like count: " + e30Var.F + ' ');
        }
        e30Var.F = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = e30Var.f199745q;
        e30Var.f446856d.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.r20(e30Var, ((mm2.c1) lVar.P0(mm2.c1.class)).J1));
        dk2.Cif.b(dk2.Cif.f315159a, e30Var.f199744p, ((mm2.e1) lVar.P0(mm2.e1.class)).f410521r.m75942xfb822ef2(0), dk2.hf.f315120e, false, 8, null);
        return jz5.f0.f384359a;
    }
}
