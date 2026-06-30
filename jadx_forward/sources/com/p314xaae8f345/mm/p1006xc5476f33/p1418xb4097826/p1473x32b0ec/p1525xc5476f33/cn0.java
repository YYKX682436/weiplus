package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class cn0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f193712d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn0 f193713e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn0(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn0 wn0Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f193712d = hVar;
        this.f193713e = wn0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.cn0(this.f193712d, interfaceC29045xdcb5ca57, this.f193713e);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.cn0 cn0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.cn0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        cn0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.tr1 tr1Var = (r45.tr1) ((xg2.i) this.f193712d).f535926b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getBoardEventEntries success, count=");
        java.util.LinkedList m75941xfb821914 = tr1Var.m75941xfb821914(1);
        sb6.append(m75941xfb821914 != null ? m75941xfb821914.size() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveWishPanelPlug", sb6.toString());
        boolean w17 = zl2.r4.f555483a.w1();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn0 wn0Var = this.f193713e;
        if (w17) {
            ln2.d dVar = (ln2.d) wn0Var.x1().y().mo3195x754a37bb();
            wn0Var.x1().y().mo7808x76db6cb1(new ln2.d(dVar != null ? dVar.f401411a : null, false, dVar != null ? dVar.f401413c : null, false, tr1Var.m75941xfb821914(1), true));
        } else {
            ln2.e eVar = (ln2.e) wn0Var.y1().y().mo3195x754a37bb();
            wn0Var.y1().y().mo7808x76db6cb1(new ln2.e(eVar != null ? eVar.f401417a : null, false, eVar != null ? eVar.f401419c : null, false, tr1Var.m75941xfb821914(1), true));
        }
        wn0Var.f196514x.remove(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mm0.f195071f);
        wn0Var.u1();
        return jz5.f0.f384359a;
    }
}
