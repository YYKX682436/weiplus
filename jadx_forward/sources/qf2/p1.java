package qf2;

/* loaded from: classes.dex */
public final class p1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f444060d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qf2.y1 f444061e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f444062f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, qf2.y1 y1Var, yz5.l lVar) {
        super(2, interfaceC29045xdcb5ca57);
        this.f444060d = hVar;
        this.f444061e = y1Var;
        this.f444062f = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qf2.p1(this.f444060d, interfaceC29045xdcb5ca57, this.f444061e, this.f444062f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        qf2.p1 p1Var = (qf2.p1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        p1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f444060d).f535914b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicAnchorBattlePkController", "newModifyAnchorBattle fail: " + aVar2);
        rm0.j jVar = aVar2.f535912a;
        java.lang.String str = jVar != null ? jVar.f478959g : null;
        boolean z17 = str == null || str.length() == 0;
        qf2.y1 y1Var = this.f444061e;
        if (z17) {
            str = y1Var.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ecp);
        }
        db5.t7.g(y1Var.O6(), str);
        yz5.l lVar = this.f444062f;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.FALSE);
        }
        return jz5.f0.f384359a;
    }
}
