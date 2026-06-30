package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class vr extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f201616d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.et f201617e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f201618f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.et etVar, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f201616d = hVar;
        this.f201617e = etVar;
        this.f201618f = c0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.vr(this.f201616d, interfaceC29045xdcb5ca57, this.f201617e, this.f201618f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.vr vrVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.vr) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        vrVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f201616d).f535914b;
        java.lang.String str = this.f201617e.f199813J;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[cgiSendWxGift] fail, errCode = ");
        rm0.j jVar = aVar2.f535912a;
        sb6.append(jVar != null ? new java.lang.Integer(jVar.f478958f) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        rm0.j jVar2 = aVar2.f535912a;
        if (jVar2 != null) {
            zl2.r4 r4Var = zl2.r4.f555483a;
            int i17 = jVar2.f478957e;
            int i18 = jVar2.f478958f;
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = jVar2.f478960h;
            r45.eo1 eo1Var = fVar instanceof r45.eo1 ? (r45.eo1) fVar : null;
            r4Var.l1(i17, i18, eo1Var != null ? (r45.qp1) eo1Var.m75936x14adae67(2) : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
        }
        this.f201618f.f391645d = false;
        return jz5.f0.f384359a;
    }
}
