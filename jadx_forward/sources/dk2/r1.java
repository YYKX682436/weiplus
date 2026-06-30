package dk2;

/* loaded from: classes.dex */
public final class r1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f315529d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f315530e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, dk2.r4 r4Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f315529d = hVar;
        this.f315530e = r4Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new dk2.r1(this.f315529d, interfaceC29045xdcb5ca57, this.f315530e);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        dk2.r1 r1Var = (dk2.r1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        r1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        rm0.j jVar;
        rm0.j jVar2;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f315529d).f535914b;
        java.lang.Integer num = null;
        java.lang.Integer num2 = (aVar2 == null || (jVar2 = aVar2.f535912a) == null) ? null : new java.lang.Integer(jVar2.f478957e);
        if (aVar2 != null && (jVar = aVar2.f535912a) != null) {
            num = new java.lang.Integer(jVar.f478958f);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f315530e.f315542d, "onSceneEnd errType:" + num2 + " errCode:" + num);
        return jz5.f0.f384359a;
    }
}
