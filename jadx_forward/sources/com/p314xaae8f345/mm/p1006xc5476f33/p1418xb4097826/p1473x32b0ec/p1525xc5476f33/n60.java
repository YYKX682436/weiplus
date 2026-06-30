package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class n60 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f195125d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 f195126e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cm2.t f195127f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n60(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 r60Var, cm2.t tVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f195126e = r60Var;
        this.f195127f = tVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.n60(this.f195126e, this.f195127f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.n60) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f195125d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        cm2.t tVar = this.f195127f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 r60Var = this.f195126e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            long j17 = ((mm2.f6) r60Var.P0(mm2.f6.class)).L;
            so2.j5 j5Var = ((mm2.f6) r60Var.P0(mm2.f6.class)).f410582w;
            cm2.t tVar2 = j5Var instanceof cm2.t ? (cm2.t) j5Var : null;
            java.lang.String str = tVar2 != null ? tVar2.f124929r : null;
            if (j17 == tVar.f124918d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, tVar.f124929r)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r60Var.f195631s, "promoteIdHideByVisitor = " + j17 + ", newPromoteInfo.mPromoteId = " + tVar.f124918d + ", only update data");
                ((mm2.f6) r60Var.P0(mm2.f6.class)).c7(tVar);
                return f0Var;
            }
            cm2.t tVar3 = tVar instanceof cm2.t ? tVar : null;
            int i18 = tVar3 != null ? tVar3.f124922h : 0;
            cm2.t tVar4 = tVar instanceof cm2.t ? tVar : null;
            r60Var.D = tVar4 != null ? new java.lang.Long(tVar4.f124918d) : null;
            cm2.t tVar5 = tVar instanceof cm2.t ? tVar : null;
            r60Var.E = tVar5 != null ? tVar5.f124929r : null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r60Var.f195631s, "[updatePromoteData] delay:" + i18);
            this.f195125d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(i18 * 1000, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.m60(r60Var, tVar));
        return f0Var;
    }
}
