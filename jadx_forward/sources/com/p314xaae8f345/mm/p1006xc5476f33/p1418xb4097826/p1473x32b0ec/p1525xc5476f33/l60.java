package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class l60 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f194885d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.t f194886e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 f194887f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l60(cm2.t tVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 r60Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f194886e = tVar;
        this.f194887f = r60Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l60(this.f194886e, this.f194887f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l60) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f194885d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 r60Var = this.f194887f;
        cm2.t tVar = this.f194886e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            cm2.t tVar2 = tVar instanceof cm2.t ? tVar : null;
            int i18 = tVar2 != null ? tVar2.f124922h : 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r60Var.f195631s, "[addPromoteData] delay:" + i18);
            cm2.t tVar3 = tVar instanceof cm2.t ? tVar : null;
            r60Var.D = tVar3 != null ? new java.lang.Long(tVar3.f124918d) : null;
            cm2.t tVar4 = tVar instanceof cm2.t ? tVar : null;
            r60Var.E = tVar4 != null ? tVar4.f124929r : null;
            this.f194885d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(i18 * 1000, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.k60(tVar, r60Var));
        return jz5.f0.f384359a;
    }
}
