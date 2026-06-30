package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class io0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f194530d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mo0 f194531e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.d82 f194532f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public io0(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mo0 mo0Var, r45.d82 d82Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f194530d = hVar;
        this.f194531e = mo0Var;
        this.f194532f = d82Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.io0(this.f194530d, interfaceC29045xdcb5ca57, this.f194531e, this.f194532f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.io0 io0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.io0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        io0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f194530d).f535914b;
        java.lang.String str = this.f194531e.f195080b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("req:");
        sb6.append(this.f194532f.hashCode());
        sb6.append(" failed. errType:");
        rm0.j jVar = aVar2.f535912a;
        sb6.append(jVar != null ? new java.lang.Integer(jVar.f478957e) : null);
        sb6.append(", errCode:");
        rm0.j jVar2 = aVar2.f535912a;
        sb6.append(jVar2 != null ? new java.lang.Integer(jVar2.f478958f) : null);
        sb6.append(",errMsg:");
        sb6.append(jVar2 != null ? jVar2.f478959g : null);
        sb6.append(",cancel?:");
        sb6.append(aVar2.f535913b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        return jz5.f0.f384359a;
    }
}
