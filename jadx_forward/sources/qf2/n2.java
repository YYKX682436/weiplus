package qf2;

/* loaded from: classes.dex */
public final class n2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f444025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qf2.c3 f444026e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f444027f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, qf2.c3 c3Var, yz5.l lVar) {
        super(2, interfaceC29045xdcb5ca57);
        this.f444025d = hVar;
        this.f444026e = c3Var;
        this.f444027f = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qf2.n2(this.f444025d, interfaceC29045xdcb5ca57, this.f444026e, this.f444027f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        qf2.n2 n2Var = (qf2.n2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        n2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        rm0.j jVar = ((xg2.a) ((xg2.b) this.f444025d).f535914b).f535912a;
        java.lang.String str = jVar != null ? jVar.f478959g : null;
        int i17 = jVar != null ? jVar.f478958f : 0;
        int i18 = jVar != null ? jVar.f478957e : 0;
        boolean z17 = str == null || str.length() == 0;
        qf2.c3 c3Var = this.f444026e;
        if (z17) {
            str = c3Var.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d6m);
        }
        db5.t7.g(c3Var.O6(), str);
        yz5.l lVar = this.f444027f;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.FALSE);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicVisitorBattlePkController", "anchorApplyVisitorBattle fail, errCode: " + i17 + " errMsg: " + str + " errType: " + i18);
        return jz5.f0.f384359a;
    }
}
