package qf2;

/* loaded from: classes.dex */
public final class s2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f444105d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f444106e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qf2.c3 f444107f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, yz5.l lVar, qf2.c3 c3Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f444105d = hVar;
        this.f444106e = lVar;
        this.f444107f = c3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qf2.s2(this.f444105d, interfaceC29045xdcb5ca57, this.f444106e, this.f444107f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        qf2.s2 s2Var = (qf2.s2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        s2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f444105d).f535914b;
        yz5.l lVar = this.f444106e;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.FALSE);
        }
        rm0.j jVar = aVar2.f535912a;
        if (jVar == null || (str = jVar.f478959g) == null) {
            str = "";
        }
        int i17 = jVar != null ? jVar.f478958f : 0;
        int i18 = jVar != null ? jVar.f478957e : 0;
        if (str.length() > 0) {
            db5.t7.g(this.f444107f.O6(), str);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicVisitorBattlePkController", "modifyBattleInfo fail, errCode: " + i17 + " errMsg: " + str + " errType: " + i18);
        return jz5.f0.f384359a;
    }
}
