package df2;

/* loaded from: classes.dex */
public final class k7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f312089d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.s8 f312090e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, df2.s8 s8Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f312089d = hVar;
        this.f312090e = s8Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.k7(this.f312089d, interfaceC29045xdcb5ca57, this.f312090e);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        df2.k7 k7Var = (df2.k7) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        k7Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f312089d).f535914b;
        java.lang.String str = this.f312090e.f312832m;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[cancelTaskManual] fail, errType:");
        rm0.j jVar = aVar2.f535912a;
        sb6.append(jVar != null ? new java.lang.Integer(jVar.f478957e) : null);
        sb6.append(", errCode:");
        rm0.j jVar2 = aVar2.f535912a;
        sb6.append(jVar2 != null ? new java.lang.Integer(jVar2.f478958f) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        return jz5.f0.f384359a;
    }
}
