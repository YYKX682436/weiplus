package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class y8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f201957d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e9 f201958e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e9 e9Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f201958e = e9Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.y8(this.f201958e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.y8) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f201957d;
        if (i17 != 0) {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            return obj;
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        this.f201957d = 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e9 e9Var = this.f201958e;
        e9Var.getClass();
        oz5.n nVar = new oz5.n(pz5.f.b(this));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveChargeIncreaseDurationWidget", "modifyChargeFreeTimeDuration " + cm2.a.f124861a.s(e9Var.a()));
        r45.b12 b12Var = new r45.b12();
        b12Var.set(0, e9Var.a());
        gk2.e eVar = e9Var.f199771b;
        long m75942xfb822ef2 = ((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
        long j17 = ((mm2.e1) eVar.a(mm2.e1.class)).f410516m;
        r45.hx0 hx0Var = new r45.hx0();
        hx0Var.set(0, 12);
        hx0Var.set(1, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(b12Var.mo14344x5f01b1f6()));
        ek2.r1 r1Var = new ek2.r1(m75942xfb822ef2, j17, 1, hx0Var);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        r1Var.t(context, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9y), 500L);
        pq5.g l17 = r1Var.l();
        l17.K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.u8(nVar, e9Var));
        android.content.Context context2 = e9Var.f199770a;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context2 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2 : null;
        if (abstractActivityC21394xb3d2c0cf != null) {
            l17.f(abstractActivityC21394xb3d2c0cf);
        }
        java.lang.Object a17 = nVar.a();
        return a17 == aVar ? aVar : a17;
    }
}
