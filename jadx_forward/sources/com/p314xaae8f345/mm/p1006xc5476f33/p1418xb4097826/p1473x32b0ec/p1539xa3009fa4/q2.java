package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes.dex */
public final class q2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f198868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f198869e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.z2 f198870f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.z2 z2Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f198868d = hVar;
        this.f198869e = c0Var;
        this.f198870f = z2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.q2(this.f198868d, interfaceC29045xdcb5ca57, this.f198869e, this.f198870f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.q2 q2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.q2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        q2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f198868d).f535914b;
        this.f198869e.f391645d = false;
        rm0.j jVar = aVar2.f535912a;
        java.lang.Integer num = jVar != null ? new java.lang.Integer(jVar.f478958f) : null;
        rm0.j jVar2 = aVar2.f535912a;
        java.lang.String str = jVar2 != null ? jVar2.f478959g : null;
        java.lang.Integer num2 = jVar2 != null ? new java.lang.Integer(jVar2.f478957e) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f198870f.f199090d, "modifyCityShow fail, errCode: " + num + " errType: " + num2 + " errMsg: " + str);
        return jz5.f0.f384359a;
    }
}
