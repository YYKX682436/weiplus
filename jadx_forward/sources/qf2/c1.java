package qf2;

/* loaded from: classes.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f443840d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qf2.y1 f443841e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f443842f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, qf2.y1 y1Var, yz5.l lVar) {
        super(2, interfaceC29045xdcb5ca57);
        this.f443840d = hVar;
        this.f443841e = y1Var;
        this.f443842f = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qf2.c1(this.f443840d, interfaceC29045xdcb5ca57, this.f443841e, this.f443842f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        qf2.c1 c1Var = (qf2.c1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        c1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        rm0.j jVar = ((xg2.a) ((xg2.b) this.f443840d).f535914b).f535912a;
        if (jVar == null || (str = jVar.f478959g) == null) {
            str = "";
        }
        int i17 = jVar != null ? jVar.f478958f : 0;
        int i18 = jVar != null ? jVar.f478957e : 0;
        qf2.y1 y1Var = this.f443841e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7 x7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7) y1Var.R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7.class);
        if (x7Var != null) {
            x7Var.H1(0);
        }
        if (str.length() > 0) {
            db5.t7.g(y1Var.O6(), str);
        }
        yz5.l lVar = this.f443842f;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.FALSE);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicAnchorBattlePkController", "anchorNewCloseBattle fail, errCode: " + i17 + " errMsg: " + str + " errType: " + i18);
        return jz5.f0.f384359a;
    }
}
