package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class ss extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f201362d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f201363e;

    /* renamed from: f, reason: collision with root package name */
    public int f201364f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.et f201365g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.dz1 f201366h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.et etVar, r45.dz1 dz1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f201365g = etVar;
        this.f201366h = dz1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ss(this.f201365g, this.f201366h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ss) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.et etVar;
        r45.uc5 uc5Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f201364f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            int m75939xb282bd08 = this.f201366h.m75939xb282bd08(0);
            etVar = this.f201365g;
            jz5.l l07 = etVar.l0(m75939xb282bd08);
            r45.uc5 uc5Var2 = l07 != null ? (r45.uc5) l07.f384367e : null;
            if (uc5Var2 != null) {
                this.f201362d = etVar;
                this.f201363e = uc5Var2;
                this.f201364f = 1;
                java.lang.Object e07 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.et.e0(etVar, uc5Var2, this);
                if (e07 == aVar) {
                    return aVar;
                }
                uc5Var = uc5Var2;
                obj = e07;
            }
            return jz5.f0.f384359a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        uc5Var = (r45.uc5) this.f201363e;
        etVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.et) this.f201362d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        if (((java.lang.Boolean) obj).booleanValue()) {
            etVar.getClass();
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.es(etVar, uc5Var));
        }
        return jz5.f0.f384359a;
    }
}
