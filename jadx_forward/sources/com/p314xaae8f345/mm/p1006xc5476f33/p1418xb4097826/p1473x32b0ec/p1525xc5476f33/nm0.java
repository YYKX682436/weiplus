package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes.dex */
public final class nm0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f195194d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn0 f195195e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nm0(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn0 wn0Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f195194d = hVar;
        this.f195195e = wn0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nm0(this.f195194d, interfaceC29045xdcb5ca57, this.f195195e);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nm0 nm0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nm0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        nm0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f195194d).f535914b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn0 wn0Var = this.f195195e;
        wn0Var.f196514x.remove(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mm0.f195070e);
        rm0.j jVar = aVar2.f535912a;
        if (jVar != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getInteractionWishConfig fail errCode: ");
            int i17 = jVar.f478958f;
            sb6.append(i17);
            sb6.append(" errType: ");
            sb6.append(jVar.f478957e);
            sb6.append(" errMsg: ");
            sb6.append(jVar.f478959g);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveWishPanelPlug", sb6.toString());
            db5.t7.g(wn0Var.f446856d.getContext(), wn0Var.f446856d.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575280ow3, java.lang.String.valueOf(i17)));
        }
        return jz5.f0.f384359a;
    }
}
