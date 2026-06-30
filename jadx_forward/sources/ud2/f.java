package ud2;

/* loaded from: classes10.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f508147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ud2.o f508148e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, ud2.o oVar) {
        super(2, interfaceC29045xdcb5ca57);
        this.f508147d = hVar;
        this.f508148e = oVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ud2.f(this.f508147d, interfaceC29045xdcb5ca57, this.f508148e);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ud2.f fVar = (ud2.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        fVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f508147d).f535914b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f508148e.f508169c, "get finderObject failed, " + aVar2.f535912a);
        return jz5.f0.f384359a;
    }
}
