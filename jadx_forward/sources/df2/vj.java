package df2;

/* loaded from: classes3.dex */
public final class vj extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f313145d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.pk f313146e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, df2.pk pkVar) {
        super(2, interfaceC29045xdcb5ca57);
        this.f313145d = hVar;
        this.f313146e = pkVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.vj(this.f313145d, interfaceC29045xdcb5ca57, this.f313146e);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        df2.vj vjVar = (df2.vj) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        vjVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f313145d).f535914b;
        df2.pk pkVar = this.f313146e;
        d75.b.g(new df2.uj(pkVar));
        rm0.j jVar = aVar2.f535912a;
        if (jVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pkVar.f312606m, "FinderLiveSwitchGiftSkinReq errCode = " + jVar.f478958f + ", errType = " + jVar.f478957e);
        }
        return jz5.f0.f384359a;
    }
}
