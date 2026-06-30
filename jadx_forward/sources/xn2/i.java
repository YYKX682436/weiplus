package xn2;

/* loaded from: classes2.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f537043d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xn2.p0 f537044e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, xn2.p0 p0Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f537043d = hVar;
        this.f537044e = p0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xn2.i(this.f537043d, interfaceC29045xdcb5ca57, this.f537044e);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        xn2.i iVar = (xn2.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        iVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f537043d).f535914b;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        xn2.p0 p0Var = this.f537044e;
        p0Var.f537097v = currentTimeMillis;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(p0Var.f537078c, "mega_verify CgiFeedSafeCheckNew fail: %s", java.lang.String.valueOf(aVar2.f535912a));
        return jz5.f0.f384359a;
    }
}
