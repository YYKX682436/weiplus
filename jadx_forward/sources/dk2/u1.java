package dk2;

/* loaded from: classes.dex */
public final class u1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f315677d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f315678e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, dk2.r4 r4Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f315677d = hVar;
        this.f315678e = r4Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new dk2.u1(this.f315677d, interfaceC29045xdcb5ca57, this.f315678e);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        dk2.u1 u1Var = (dk2.u1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        u1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        rm0.j jVar;
        java.lang.String str;
        android.content.Context context;
        rm0.j jVar2;
        rm0.j jVar3;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f315677d).f535914b;
        java.lang.Integer num = (aVar2 == null || (jVar3 = aVar2.f535912a) == null) ? null : new java.lang.Integer(jVar3.f478957e);
        java.lang.Integer num2 = (aVar2 == null || (jVar2 = aVar2.f535912a) == null) ? null : new java.lang.Integer(jVar2.f478958f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f315678e.f315542d, "[doLikeRecommendLive] onSceneEnd errType:" + num + " errCode:" + num2);
        if (aVar2 != null && (jVar = aVar2.f535912a) != null && (str = jVar.f478959g) != null) {
            java.lang.String str2 = str.length() > 0 ? str : null;
            if (str2 != null) {
                dk2.ef efVar = dk2.ef.f314905a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
                if (k0Var != null && (context = k0Var.getContext()) != null) {
                    int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
                    e4Var.f293309c = str2;
                    e4Var.c();
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
