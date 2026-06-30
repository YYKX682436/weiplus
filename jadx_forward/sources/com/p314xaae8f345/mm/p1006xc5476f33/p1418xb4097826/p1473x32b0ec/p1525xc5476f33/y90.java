package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class y90 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f196699d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ea0 f196700e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f196701f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y90(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ea0 ea0Var, cm2.m0 m0Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f196699d = hVar;
        this.f196700e = ea0Var;
        this.f196701f = m0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.y90(this.f196699d, interfaceC29045xdcb5ca57, this.f196700e, this.f196701f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.y90 y90Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.y90) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        y90Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = ((r45.nd2) ((xg2.i) this.f196699d).f535926b).m75934xbce7f2f(1);
        r45.y23 y23Var = null;
        if (m75934xbce7f2f != null) {
            r45.ju1 ju1Var = new r45.ju1();
            try {
                ju1Var.mo11468x92b714fd(m75934xbce7f2f.g());
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                ju1Var = null;
            }
            if (ju1Var != null) {
                y23Var = (r45.y23) ju1Var.m75936x14adae67(3);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ea0 ea0Var = this.f196700e;
        java.lang.String str = ea0Var.f193923t;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderLiveGetProductPromoteReplayWidgetRequest success hasData ");
        sb6.append(y23Var != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (!(y23Var == null)) {
            cm2.m0 m0Var = this.f196701f;
            m0Var.n(y23Var);
            ea0Var.y1().n(ea0Var.S0(), m0Var);
        }
        return jz5.f0.f384359a;
    }
}
