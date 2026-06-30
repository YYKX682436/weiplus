package qf2;

/* loaded from: classes10.dex */
public final class d1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f443860d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qf2.y1 f443861e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f443862f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, qf2.y1 y1Var, yz5.l lVar) {
        super(2, interfaceC29045xdcb5ca57);
        this.f443860d = hVar;
        this.f443861e = y1Var;
        this.f443862f = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qf2.d1(this.f443860d, interfaceC29045xdcb5ca57, this.f443861e, this.f443862f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        qf2.d1 d1Var = (qf2.d1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        d1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicAnchorBattlePkController", "anchorNewCloseBattle success ");
        qf2.y1 y1Var = this.f443861e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.na naVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.na) y1Var.R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.na.class);
        if (naVar != null) {
            naVar.K0(0);
            qi2.s1 w17 = naVar.w1();
            if (w17 != null) {
                ((lj2.c0) w17).g(0);
            }
            qi2.s1 w18 = naVar.w1();
            if (w18 != null) {
                ((lj2.c0) w18).e(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ja(naVar));
            }
            naVar.f195137q.k(8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7 x7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7) y1Var.R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7.class);
        if (x7Var != null) {
            x7Var.I1(0);
        }
        ((mm2.o4) y1Var.m56788xbba4bfc0(mm2.o4.class)).Z = null;
        db5.t7.h(y1Var.O6(), y1Var.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d6q));
        yz5.l lVar = this.f443862f;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.TRUE);
        }
        return jz5.f0.f384359a;
    }
}
