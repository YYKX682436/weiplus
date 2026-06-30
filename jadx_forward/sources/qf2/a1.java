package qf2;

/* loaded from: classes10.dex */
public final class a1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f443814d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f443815e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qf2.y1 f443816f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dk2.u4 f443817g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, yz5.l lVar, qf2.y1 y1Var, dk2.u4 u4Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f443814d = hVar;
        this.f443815e = lVar;
        this.f443816f = y1Var;
        this.f443817g = u4Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qf2.a1(this.f443814d, interfaceC29045xdcb5ca57, this.f443815e, this.f443816f, this.f443817g);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        qf2.a1 a1Var = (qf2.a1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        a1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object obj2;
        qi2.s1 w17;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicAnchorBattlePkController", "anchorNewAcceptBattle success ");
        yz5.l lVar = this.f443815e;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.TRUE);
        }
        if (((mm2.o4) this.f443816f.m56788xbba4bfc0(mm2.o4.class)).f410857s.size() <= 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.na naVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.na) this.f443816f.R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.na.class);
            if (naVar != null) {
                naVar.z1();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.na naVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.na) this.f443816f.R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.na.class);
            if (naVar2 != null) {
                naVar2.x1();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7 x7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7) this.f443816f.R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7.class);
            if (x7Var != null) {
                x7Var.I1(2);
            }
        } else {
            dk2.u4 u4Var = this.f443817g;
            u4Var.f315691e = 5;
            java.util.List list = u4Var.f315692f;
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((km2.k) obj2).f390647a, ((mm2.c1) this.f443816f.m56788xbba4bfc0(mm2.c1.class)).f410385o)) {
                        break;
                    }
                }
            }
            km2.k kVar = (km2.k) obj2;
            if (kVar != null) {
                kVar.f390651e = true;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.na naVar3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.na) this.f443816f.R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.na.class);
            if (naVar3 != null && (w17 = naVar3.w1()) != null) {
                lj2.s b17 = ((lj2.c0) w17).b();
                b17.f400474e.setVisibility(0);
                b17.f400475f.setVisibility(8);
                b17.f400472c.setVisibility(4);
                b17.f400471b.setVisibility(4);
            }
        }
        return jz5.f0.f384359a;
    }
}
