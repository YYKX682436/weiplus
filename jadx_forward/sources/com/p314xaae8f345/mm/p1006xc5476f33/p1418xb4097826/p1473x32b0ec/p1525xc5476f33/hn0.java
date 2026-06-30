package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class hn0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f194383d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn0 f194384e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn0(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn0 wn0Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f194383d = hVar;
        this.f194384e = wn0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hn0(this.f194383d, interfaceC29045xdcb5ca57, this.f194384e);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hn0 hn0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hn0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        hn0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.vu1 vu1Var = (r45.vu1) ((xg2.i) this.f194383d).f535926b;
        boolean z17 = false;
        if (vu1Var.m75941xfb821914(1) != null && (!r0.isEmpty())) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn0 wn0Var = this.f194384e;
        wn0Var.f196512v = z17;
        if (zl2.r4.f555483a.w1()) {
            ln2.d dVar = (ln2.d) wn0Var.x1().y().mo3195x754a37bb();
            wn0Var.x1().y().mo7808x76db6cb1(new ln2.d(vu1Var, true, dVar != null ? dVar.f401413c : null, false, dVar != null ? dVar.f401415e : null, false, 32, null));
            if (!dk2.ef.f314905a.x()) {
                wn0Var.z1().E();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.t0 z18 = wn0Var.z1();
                java.util.LinkedList m75941xfb821914 = vu1Var.m75941xfb821914(1);
                if (!vu1Var.m75933x41a8a7f2(8)) {
                    vu1Var = null;
                }
                z18.G(m75941xfb821914, vu1Var != null ? vu1Var.m75941xfb821914(7) : null);
            }
        } else {
            ln2.e eVar = (ln2.e) wn0Var.y1().y().mo3195x754a37bb();
            wn0Var.y1().y().mo7808x76db6cb1(new ln2.e(vu1Var, true, eVar != null ? eVar.f401419c : null, false, eVar != null ? eVar.f401421e : null, false, 32, null));
        }
        wn0Var.f196514x.remove(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mm0.f195069d);
        wn0Var.u1();
        return jz5.f0.f384359a;
    }
}
