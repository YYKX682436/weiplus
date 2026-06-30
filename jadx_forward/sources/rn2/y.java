package rn2;

/* loaded from: classes.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f479452d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f479453e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, android.content.Context context) {
        super(2, interfaceC29045xdcb5ca57);
        this.f479452d = hVar;
        this.f479453e = context;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rn2.y(this.f479452d, interfaceC29045xdcb5ca57, this.f479453e);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        rn2.y yVar = (rn2.y) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        yVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f479452d).f535914b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[FinderMakePackageOrderRequest] failed, pb = ");
        rm0.j jVar = aVar2.f535912a;
        java.lang.Boolean bool = null;
        sb6.append((jVar == null || (fVar = jVar.f478960h) == null) ? null : pm0.b0.g(fVar));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLotteryGiftCreate", sb6.toString());
        rm0.j jVar2 = aVar2.f535912a;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = jVar2 != null ? jVar2.f478960h : null;
        r45.oz1 oz1Var = fVar2 instanceof r45.oz1 ? (r45.oz1) fVar2 : null;
        if (oz1Var != null) {
            r45.qp1 qp1Var = (r45.qp1) oz1Var.m75936x14adae67(3);
            java.lang.Integer num = jVar2 != null ? new java.lang.Integer(jVar2.f478957e) : null;
            java.lang.Integer num2 = jVar2 != null ? new java.lang.Integer(jVar2.f478958f) : null;
            if (qp1Var != null && num != null && num2 != null) {
                bool = java.lang.Boolean.valueOf(hz2.d.f367846a.j(num.intValue(), num2.intValue(), qp1Var));
            }
            if (bool == null) {
                pm0.v.X(new rn2.b0(this.f479453e));
            }
        }
        return jz5.f0.f384359a;
    }
}
