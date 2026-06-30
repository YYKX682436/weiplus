package pk2;

/* loaded from: classes3.dex */
public final class ga extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f437322d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437323e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, pk2.o9 o9Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f437322d = hVar;
        this.f437323e = o9Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new pk2.ga(this.f437322d, interfaceC29045xdcb5ca57, this.f437323e);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        pk2.ga gaVar = (pk2.ga) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        gaVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f437322d).f535914b;
        rm0.j jVar = aVar2.f535912a;
        java.lang.Integer num = jVar != null ? new java.lang.Integer(jVar.f478957e) : null;
        rm0.j jVar2 = aVar2.f535912a;
        java.lang.Integer num2 = jVar2 != null ? new java.lang.Integer(jVar2.f478958f) : null;
        java.lang.String str = jVar2 != null ? jVar2.f478959g : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f437323e.f437605a, "FinderGetLiveH5UrlCGI failed: errType=" + num + ", errCode=" + num2 + ", errMsg=" + str);
        return jz5.f0.f384359a;
    }
}
